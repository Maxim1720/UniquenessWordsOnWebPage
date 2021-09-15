import HtmlPage.HtmlPage;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        printPageToConsoleWithoutTags();
    }

    private static void printPageToConsoleWithoutTags()
    {
        Scanner scanner = new Scanner(System.in);
        String address = scanner.next();

        HtmlPage page = new HtmlPage(address);
        for (String s: page.uniqueWords()) {
            System.out.println(s + " - " + page.countedUniqueWords().get(s.toLowerCase()));
        }
        System.out.println(page.uniqueWords().size());
        page.download("G:\\WorkingDr\\page.html");
    }


}
