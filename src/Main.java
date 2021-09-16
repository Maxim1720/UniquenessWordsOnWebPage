import HtmlPageTextParser.HtmlTextParser;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        printPageToConsoleWithoutTags();
    }

    private static void printPageToConsoleWithoutTags()
    {
        System.out.println("Please enter the page address: ");

        Scanner scanner = new Scanner(System.in);
        String address = scanner.next();

        HtmlTextParser page = new HtmlTextParser(address);
        for (String s: page.inOneCopyWords()) {
            System.out.println(s + ": " + page.wordMatchCount(s));
        }
        System.out.println(page.inOneCopyWords().length);
    }


}
