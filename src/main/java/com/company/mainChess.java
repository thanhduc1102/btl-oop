package com.company;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlForm;
import com.gargoylesoftware.htmlunit.html.HtmlInput;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.gargoylesoftware.htmlunit.html.HtmlTable;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;
public class mainChess {
    record Player(String name, String id, Integer rating, Integer quickRation){}
    public static void main(String[] args) throws IOException {
        WebClient client = new WebClient();
        client.getOptions().setJavaScriptEnabled(false);
        client.getOptions().setCssEnabled(false);
        HtmlPage searchpage = client.getPage("https://new.uschess.org/player-search?");
        HtmlForm form = (HtmlForm) searchpage.getByXPath("//form").get(0);
        HtmlInput displayNameField = form.getInputByName("display_name");
        HtmlInput submitButton = form.getInputByName("op");
        displayNameField.type("Carlsen");
        HtmlPage resultPage = submitButton.click();
        List<Player> players = parseResults(resultPage);
        for (Player player : players){
            System.out.println(player);
        }
    }

    private static List<Player> parseResults(HtmlPage resultPage) {
        HtmlTable table = (HtmlTable) resultPage.getByXPath("//table").get(0);
        table.getBodies().get(0).getRows().stream()
                .map(r -> {
                    String rating = r.getCell(2).getTextContent();
                    String qrating = r.getCell(3).getTextContent();
                    return new Player(
                            r.getCell(0).getTextContent(),
                            r.getCell(1).getTextContent(),
                            (rating.length() == 0 ? null : Integer.parseInt(rating)),
                            qrating.length() == 0 ? null : Integer.parseInt(qrating)
                    );
                }).collect(Collectors.toList());
        return null;
    }
}
