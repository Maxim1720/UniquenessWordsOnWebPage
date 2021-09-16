package HtmlPageTextParser.TextSplitter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

class TextSplitterTest {

    @Test
    void split() {
        String[] result = {
                "123",
                "456",
        };
        String text = "123-=--%^& ##())# )) #)#)\b\n\n \t\t\t \r \r )___ __ _ _//*--/-+++++_){}}}}}}\"\"[][][][456___)(*";


        Assertions.assertArrayEquals(result,new TextSplitter(text).split());
    }


    @Test
    void splitEmptyText()
    {
        Assertions.assertDoesNotThrow((Executable) new TextSplitter("")::split);
        Assertions.assertArrayEquals(new String[]{},new TextSplitter("").split());

    }

    @Test
    void setEmptyStringAsText()
    {
        Assertions.assertDoesNotThrow(() -> {
            new TextSplitter("");
        });

    }

}