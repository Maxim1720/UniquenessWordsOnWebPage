package HtmlPage;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class HtmlPage {
    String [] words;
    ArrayList<String> uniqueWords;
    Document doc;
    String text;
    HashMap<String, Integer> countedUniqueWords;

    public HtmlPage(String address)
    {
        try {
            doc = Jsoup.connect(address).get();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String allText()
    {
        if(text == null)
        {
            text = doc.body().text();
        }
        return text;
    }

    public String[] allWords()
    {
        if(words == null)
        {
            Pattern pattern = Pattern.compile("\\s*\\w\\s*");
            StringTokenizer stringTokenizer = new StringTokenizer(allText(),
                    " .!?'\"[](),/\\:;\n\r\t@><+-",
                    false);
            int i=0;
            words = new String[stringTokenizer.countTokens()];
            while (stringTokenizer.hasMoreTokens())
            {
                words[i++] = stringTokenizer.nextToken();
            }
        }
        return words;
    }

    public ArrayList<String> uniqueWords()
    {
        if(uniqueWords == null)
        {
            uniqueWords = new ArrayList<>();

            for (String s: allWords()) {
                String lowerS = s.toLowerCase();
                if (!uniqueWords.contains(lowerS) && !uniqueWords.contains(s)) {
                    uniqueWords.add(s);
                }

            }
        }
        return uniqueWords;
    }

    public HashMap<String, Integer> countedUniqueWords()
    {
        if(countedUniqueWords == null)
        {
            countedUniqueWords = new HashMap<>();
            for (String s: allWords())
            {
                String lowerS = s.toLowerCase();
                if (countedUniqueWords.containsKey(lowerS)) {
                    int val = countedUniqueWords.get(lowerS);
                    countedUniqueWords.replace(lowerS, val + 1);
                } else {
                    countedUniqueWords.put(lowerS, 1);
                }
            }
        }
        return countedUniqueWords;
    }




}
