import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

public class Main {
    private static URL url;
    private static BufferedReader in;
    private static Document doc;
    private static HashMap<String, Integer> wordsCounter;
    private static String[] words;
    private static ArrayList<String> uniqueWords;

    public static void main(String[] args) {
        printPageToConsoleWithoutTags();
        //writePageToConsole();
    }

    private static void writePageToConsole()
    {
        String address = new Scanner(System.in).next();
        setUrl(address);
        printInConsole();
    }
    private static void printPageToConsoleWithoutTags()
    {
        String address = "https://downdetector.ru";//new Scanner(System.in).next();

        try {
            setDoc(address);
        } catch (IOException e) {
            e.printStackTrace();
        }
        setPageWords();
        countWords();
        for (String s: uniqueWords) {
            System.out.println(s + " - " + wordsCounter.get(s.toLowerCase()));
        }
    }

    private static void setUrl(String address)
    {
        try
        {
            trySetUrl(address);
        } catch (MalformedURLException e) {
            System.out.println("Uncorrect address");
            e.printStackTrace();
        }
    }
    private static void trySetUrl(String address) throws MalformedURLException {
        String protocol = "https";
        url = new URL(address);
    }

    private static void setDoc(String address) throws IOException {
        doc = Jsoup.connect(address).timeout(50000).userAgent(
                "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_9_2) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/33.0.1750.152 Safari/537.36").get();
    }

    private static String getPageText()
    {
        return doc.body().text();
    }


    private static void setPageWords()
    {
        String pageText = getPageText();
        StringTokenizer stringTokenizer = new StringTokenizer(pageText,
                " .!?'\"[](),/\\:;\n\r\t@><+-",
                false);
        int i=0;
        words = new String[stringTokenizer.countTokens()];
        while (stringTokenizer.hasMoreTokens())
        {
            words[i++] = stringTokenizer.nextToken();
        }
    }


    private static void countWords()
    {
        uniqueWords = new ArrayList<>();
        wordsCounter = new HashMap<>();
        for (String s:words) {
            String lowerS = s.toLowerCase();
            if (!uniqueWords.contains(lowerS) && !uniqueWords.contains(s)) {
                uniqueWords.add(s);
            }
            if (wordsCounter.containsKey(lowerS)) {
                int val = wordsCounter.get(lowerS);
                wordsCounter.replace(lowerS, val + 1);
            } else {
                wordsCounter.put(lowerS, 1);
            }

        }
    }


   private static void printInConsole()
   {
       try {
           in = new BufferedReader(new InputStreamReader(url.openStream()));
           String line = "";
           while (true) {
               try {
                   if ((line = in.readLine()) == null)
                       break;
                   System.out.println(line);
               } catch (IOException e) {
                   e.printStackTrace();
               }
               System.out.print(line);
           }
       }
       catch (IOException e){
           System.out.println("Stream error");
       }

   }


}

/*class PageParser
{
    URL url;

    public PageParser(URL url, String path)
    {
        this.url = url;
    }
}*/
