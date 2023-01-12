package com.company;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

import java.io.IOException;
import java.util.List;

public class WebScraper {
    WebClient webClient=new WebClient();
    HtmlPage page;
    public WebScraper() throws IOException {
        String url="https://parade.com/969195/megangrant/new-years-resolutions-ideas/";
        page=getWebPage(url);
    }
    private HtmlPage getWebPage(String url) throws IOException{
        webClient.getOptions().setCssEnabled(false);
        webClient.getOptions().setJavaScriptEnabled(false);
        return webClient.getPage(url);
    }
    public List<String> extractInfomation(){
        
    }
}
