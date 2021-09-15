package HtmlPage.Tests;

import HtmlPage.HtmlPage;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HtmlPageTester {
    static String vkAddress = "https://vk.com/";
    static String simbirSoftAddress = "https://www.simbirsoft.com/";

    static HtmlPage page;

    static Pattern pattern;
    static Matcher matcher;

    public static void main(String[] args) {
        //testGetVkMainPageAllWords();
        testGetVkAllWords();
    }

    public static void testGetVkMainPageAllText()
    {
        String text = new HtmlPage(vkAddress).allText();
        System.out.println(text.equals(new HtmlPage(vkAddress).allText()));
    }

    public static void testGetVkMainPageAllWords()
    {
        page = new HtmlPage(vkAddress);
        String[] words = page.allWords();
        for (String s: words) {
            System.out.println(s);
        }
    }


    public static void testGetVkAllWords()
    {
        page = new HtmlPage(vkAddress);
        System.out.println(new HtmlPage(vkAddress).allText());
        /*while (matcher.find())
        {
            System.out.println(matcher.group());
        }*/
        for (String s: page.allWords()
             ) {
            System.out.println(s);
        }

    }


    public static void printUniqueWordsSimbir()
    {
        page = new HtmlPage(simbirSoftAddress);
        while (matcher.find())
        {
            System.out.println(matcher.group());
        }


    }


    public static void testGetSimbirSoftAllWords()
    {
        page = new HtmlPage(simbirSoftAddress);
        printStrings(page.allWords());
    }

    public static void printStrings(String[] strs)
    {
        for (String s:strs
        ) {
            System.out.println(s);
        }
    }









}
