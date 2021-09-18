import HtmlPageTextParser.HtmlTextParser;

import java.io.IOException;
import java.net.ConnectException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Main {

    static HtmlTextParser page;

    public static void main(String[] args) {
        printHtmlPageDuplicateStatistic();
    }

    private static void printHtmlPageDuplicateStatistic()
    {
        System.out.println("Please enter the page address: ");

        Scanner scanner = new Scanner(System.in);
        String address = scanner.next();

        if(openPage(address))
        {
            for (String s: page.inOneCopyWords()) {
                System.out.println(s + ": " + page.wordMatchCount(s));
            }
            System.out.println(page.inOneCopyWords().length);
        }
    }

    private static boolean openPage(String address) {
        boolean res = false;
        try {
            tryOpenPage(address);
            res = true;
        } catch (UnknownHostException e) {
            System.out.println("Incorrect domain!");
        } catch (IllegalArgumentException | IOException e) {
            System.out.println("Incorrect address");
        }

        return res;
    }

    private static void tryOpenPage(String address) throws IOException {
        page = new HtmlTextParser(address);
    }


}
