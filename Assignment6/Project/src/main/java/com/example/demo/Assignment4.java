package com.example.demo;



import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Assignment4 {

    public static void main(String[] args) {

        Document doc;
        try {

            //get all images from chosen website
            doc = Jsoup.connect("http://google.com").get();
            Elements images = doc.select("img[src~=(?i)\\.(png|jpe?g|gif)]");
            for (Element image : images) {

                System.out.println("\nsource : " + image.attr("src"));
                System.out.println("height : " + image.attr("height"));
                System.out.println("width : " + image.attr("width"));
                System.out.println("alt : " + image.attr("alt"));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}