package HtmlPageTextParser.Connector;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class Connector {
    private Document doc;
    private final String address;

    public Connector(String address)
    {
        this.address = address;
    }

    public Document connect()
    {
        try {
            simpleConnect();
        }
        catch (IOException e) {
            System.out.println("SIMPLE CONNECTING: FAILED");
            connectWithErrorsIgnoring();
        }
        return doc;
    }

    private void simpleConnect() throws IOException {
        doc = Jsoup.connect(address).get();

    }

    private void connectWithErrorsIgnoring()
    {
        try {
            tryConnectWithErrorsIgnoring();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void tryConnectWithErrorsIgnoring() throws IOException {
        doc = Jsoup.connect(address).ignoreHttpErrors(true).get();
    }
}
