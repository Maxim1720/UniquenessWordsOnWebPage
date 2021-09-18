package HtmlPageTextParser;

import HtmlPageTextParser.Connector.Connector;
import HtmlPageTextParser.WordsParser.WordsParser;
import org.jetbrains.annotations.NotNull;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.HashMap;

public class HtmlTextParser {

    private String[] words;
    private String[] oneCopyWords;
    private final String text;
    private HashMap<String, Integer> countedUniqueWords;


    public HtmlTextParser(@NotNull String address) throws IOException {
        text = new Connector().connect(address).text();
    }


    public String allText()
    {
        return text;
    }

    public String[] words()
    {
        if(words == null)
        {
            words = new WordsParser(allText()).get();
        }
        return words;
    }

    public String[] inOneCopyWords()
    {
        if(oneCopyWords == null)
        {
            oneCopyWords = new WordsParser(allText()).getInOneCopy();
        }
        return oneCopyWords;
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
