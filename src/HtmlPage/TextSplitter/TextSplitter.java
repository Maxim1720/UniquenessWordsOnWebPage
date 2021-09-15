package HtmlPage.TextSplitter;

import HtmlPage.HtmlPage;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextSplitter {

    Pattern corrWordsRep;
    Matcher textMatcher;

    public TextSplitter(String text)
    {
        corrWordsRep = Pattern.compile(
                "(\\p{javaUpperCase}+\\p{Ll}*)" +
                "|(\\p{javaLowerCase}+)" +
                "|(\\p{javaDigit}+)");
        textMatcher = corrWordsRep.matcher(text);
    }

    public String[] getWords()
    {
        ArrayList<String> words1 = new ArrayList<>();

        while (textMatcher.find())
        {
            words1.add(textMatcher.group());
        }

        String[] words = new String[words1.size()];

        int i=0;
        for (String s:words1
             ) {
            words[i++] = s;
        }
        return words;
    }

}
