package HtmlPageTextParser;

import HtmlPageTextParser.Connector.Connector;
import HtmlPageTextParser.WordsParser.WordsParser;
import HtmlPageTextParser.TextSplitter.TextSplitter;
import org.jsoup.nodes.Document;

import java.util.ArrayList;
import java.util.HashMap;

public class HtmlTextParser {

    private String [] words;
    private ArrayList<String> uniqueWords;
    private final Document doc;
    private String text;
    private HashMap<String, Integer> countedUniqueWords;

    TextSplitter textSplitter;

    public HtmlTextParser(String address)
    {
        doc = new Connector(address).connect();
    }

    public String allText()
    {
        if(text == null)
        {
            text = doc.text();
        }
        return text;
    }

    public String[] words()
    {
        return new WordsParser(allText()).get();
    }

    public String[] inOneCopyWords()
    {
        return new WordsParser(allText()).getInOneCopy();
    }

    private HashMap<String, Integer> countedWords()
    {
        if(countedUniqueWords == null)
        {
            countedUniqueWords = new HashMap<>();
            for (String s: words())
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

    public int wordMatchCount(String word) {
        return countedWords().get(word.toLowerCase());
    }

}
