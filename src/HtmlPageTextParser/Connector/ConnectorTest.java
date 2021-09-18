package HtmlPageTextParser.Connector;

import HtmlPageTextParser.ConstStrs.Addresses;
import org.jsoup.nodes.Document;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.io.IOException;
import java.net.ConnectException;
import java.net.MalformedURLException;

class ConnectorTest {


    @Test
    void connect() throws IOException {
        Assertions.assertNotNull(new Connector().connect(Addresses.vkAddress));
        Assertions.assertNotNull(new Connector().connect(Addresses.stackOverflowAddress));
        Assertions.assertNotNull(new Connector().connect(Addresses.googleAddress));
        Assertions.assertNotNull(new Connector().connect(Addresses.gfgAddress));
        Assertions.assertNotNull(new Connector().connect(Addresses.downDetectorAddress));
        Assertions.assertNotNull(new Connector().connect(Addresses.simbirSoftAddress));

        Assertions.assertDoesNotThrow(() -> { new Connector().connect(Addresses.vkAddress); });
        Assertions.assertDoesNotThrow(() -> {new Connector().connect(Addresses.steamAddress);});
        Assertions.assertDoesNotThrow(() -> {new Connector().connect(Addresses.stackOverflowAddress);});
        Assertions.assertDoesNotThrow(() -> {new Connector().connect(Addresses.gfgAddress);});
        Assertions.assertDoesNotThrow(() -> {new Connector().connect(Addresses.downDetectorAddress);});
        Assertions.assertDoesNotThrow(() -> {new Connector().connect(Addresses.googleAddress);});
    }

    @Test
    void incorrectAddress()
    {
        Assertions.assertThrows(IllegalArgumentException.class, ()-> new Connector().connect("dwadawd dwad aw"));
    }
    @Test
    void incorrectProtocol()
    {
        Assertions.assertThrows(IllegalArgumentException.class, ()-> new Connector().connect("hhhh://vk.com/"));
    }

    @Test
    void incorrectHost()
    {
        Assertions.assertThrows(ConnectException.class, ()-> new Connector().connect("http://vkkk.com/"));
    }

    @Test
    void connectToDowndetector() throws IOException {
        Assertions.assertThrows(IllegalArgumentException.class, ()-> new Connector().connect("https://downdetector.ru/"));
        Assertions.assertNotNull(new Connector().connect("https://downdetector.ru/").text());

    }
}