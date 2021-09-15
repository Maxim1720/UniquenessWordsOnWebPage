package HtmlPage;

import HtmlPage.TextSplitter.TextSplitter;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;

public class HtmlPage {
    String [] words;
    ArrayList<String> uniqueWords;
    Document doc;
    String text;
    HashMap<String, Integer> countedUniqueWords;
    URL url;

    /*Pattern corrWordsRep;
    Matcher allTextMatcher;*/
    TextSplitter textSplitter;

    public HtmlPage(String address)
    {
        try {
            url = new URL(address);
            doc = Jsoup.connect(address).get();

            //doc = Jsoup.parse(url,1000);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*private void setTextSplitter()
    {
        corrWordsRep = Pattern.compile("(\\p{javaUpperCase}+\\p{Ll}+)|(\\p{javaLowerCase}+)|(\\p{javaDigit}+)");
        allTextMatcher = corrWordsRep.matcher(allText());
    }*/

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
            textSplitter = new TextSplitter(allText());
            words = textSplitter.getWords();
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

    public void download(String path)
    {
        BufferedReader bufferedReader;
        BufferedWriter bufferedWriter;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
            bufferedWriter = new BufferedWriter(new FileWriter(path));

            String line;
            while ((line = bufferedReader.readLine())!=null)
            {
                bufferedWriter.write(line);
            }
            bufferedWriter.close();
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }





}
