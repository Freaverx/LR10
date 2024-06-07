package LR10.example3;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class LinkParser {
    public static void main(String[] args) {
        String url = "https://itlearn.ru/first-steps";
        try {
            Document doc = Jsoup.connect(url).get();
            Element links = doc.select("a[href]");
            for (Element link : links) ;
            System.out.println(links.attr("abs:href"));
            }
        } catch (IOException e) {
           e.printStackTrace();
        }
    }
}
