package com.company;


import com.company.manager.object.LeHoiVanHoa;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.ArrayList;

// khởi tạo instance của app và chạy
public class Main {
    public static void main(String[] args) throws IOException {



//        Document doc = Jsoup.connect("https://www.imdb.com/chart/top")
//                            .timeout(10000).get();
//        Elements body = doc.select("tbody.lister-list");
//        System.out.println(body.select("tr").size());
//        for (Element e : body.select("tr")) {
//			String img = e.select("td.posterColumn img").attr("src");
//			System.out.println(img);
//			String title = e.select("td.posterColumn img").attr("alt");
//			System.out.println(title);
//			String year = e.select("td.titleColumn span.secondaryInfo")
//                            .text().replaceAll("[^\\d]", "");
//			System.out.println(year);
//			String rate = e.select("td.ratingColumn.imdbRating").text().trim();
//			System.out.println(rate);
//		}


//        ArrayList<LeHoiVanHoa> leHoiVanHoa = new ArrayList<LeHoiVanHoa>();
//        Document doc = Jsoup.connect("https://vi.wikipedia.org/wiki/L%E1%BB%85_h%E1%BB%99i_Vi%E1%BB%87t_Nam")
//                            .timeout(10000).get();
//        Elements body = doc.select("table tbody");
//        body = body.remove();
//        for (Element e : body.select("tr")){
//             String ngay = e.select("td a").text();
//            System.out.println(ngay);
//        }


//        int ds=body.select("tr").size()-1;
//        Elements e = body.select("tr")
//        for (Element e : body.select("tr")) {
//			String img = e.select("td.posterColumn img").attr("src");
//			System.out.println(img);
//			String title = e.select("td.posterColumn img").attr("alt");
//			System.out.println(title);
//			String year = e.select("td.titleColumn span.secondaryInfo")
//                            .text().replaceAll("[^\\d]", "");
//			System.out.println(year);
//			String rate = e.select("td.ratingColumn.imdbRating").text().trim();
//			System.out.println(rate);
//		}
    }
}
