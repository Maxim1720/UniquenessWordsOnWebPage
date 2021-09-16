package HtmlPageTextParser.WordsParser;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class WordsParserTest {

    @Test
    void get() {

        String text = "456 d wad я рома.,............... ввв/*-++++тройка789+ мама-папа /)(*&^%^&*ТРИ^&*()_ 555КОТА 789ЛЕГКИЙ +ТяЖеЛыЙ";
        WordsParser wordsParser = new WordsParser(text);
        String[] corrWords = {
                "456",
                "d",
                "wad",
                "я",
                "рома",
                "ввв",
                "тройка",
                "789",
                "мама",
                "папа",
                "ТРИ",
                "555",
                "КОТА",
                "789",
                "ЛЕГКИЙ",
                "ТяЖеЛыЙ"
        };
        Assertions.assertArrayEquals(corrWords,wordsParser.get());
    }

    @Test
    void getInOneCopy() {
        String[] allWords = {"рома","Рома","РОМА", "три", ""};
        String[] corrInOneCopyWords = {"рома", "три"};
        WordsParser wordsParser = new WordsParser(Arrays.toString(allWords));

        Assertions.assertArrayEquals(corrInOneCopyWords,wordsParser.getInOneCopy());
    }

    @Test
    void testInOneCopyWordsWithNulls()
    {
        String[] allWords = {"рома","Рома","РОМА", "три", null, null, null};
        String[] corrUniqueWords = {"рома", "три", "null"};
        WordsParser wordsParser = new WordsParser(Arrays.toString(allWords));
        Assertions.assertArrayEquals(wordsParser.getInOneCopy(),corrUniqueWords);
    }
}