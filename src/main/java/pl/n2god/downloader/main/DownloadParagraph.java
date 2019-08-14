package pl.n2god.downloader.main;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class DownloadParagraph {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://www.kwestiasmaku.com/blog-kulinarny");
        Document document = Jsoup.parse(url, 3000);
        String h1 = document.select("h1").first().text();
        String paragraph = document.select("p").first().text();
        System.out.println(h1);
        System.out.println("-------");
        System.out.println(paragraph);

    }
}
