package pl.n2god.downloader.main;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.net.URL;

/**
 * @author n2god on 13/08/2019
 * @project Ddownloader
 */
public class Downloader {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://www.joemonster.org");

        Document document = Jsoup.parse(url, 3000);
        Elements divElements = document.select("div");
        for (Element div : divElements) {
            String divText = div.getElementsByClass("indexart").text();
            if (!divText.isEmpty()){
                System.out.println(divText);
            }
        }
    }
}
