package HtmlPageTextParser.WordsParser;

import HtmlPageTextParser.TextSplitter.TextSplitter;

import java.util.ArrayList;

public class WordsParser {

    private final String text;
    private String[] words;
    private String[] uniqueWords;

    public WordsParser(String text)
    {
        this.text = text;
    }

    public String[] get()
    {
        if(words == null)
        {
            TextSplitter textSplitter = new TextSplitter(text);
            words = textSplitter.split();
        }
        return words;
    }

    public String[] getInOneCopy()
    {
        if(uniqueWords == null)
        {
            ArrayList<String> uniques = new ArrayList<>();
            for (String s: get()) {
                String lowerS = s.toLowerCase();
                if (!uniques.contains(lowerS) && !uniques.contains(s)) {
                    uniques.add(s);
                }

            }
            uniqueWords = new String[uniques.size()];
            uniqueWords = uniques.toArray(uniqueWords);
        }
        return uniqueWords;
    }



}
