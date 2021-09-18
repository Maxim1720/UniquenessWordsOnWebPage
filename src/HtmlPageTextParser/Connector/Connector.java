package HtmlPageTextParser.Connector;

import org.jetbrains.annotations.NotNull;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class Connector {
    private Document doc;
    private String address;

    public Connector()
    {

    }

    public Document connect(@NotNull String address) throws IOException {
        initDoc(address);
        return doc;
    }

    private void initDoc(String address) throws IOException {
        try {
            this.address = address;
            simpleConnect();
        }
        catch (IOException e) {
            connectWithErrorsIgnoring();
        }
    }

    private void simpleConnect() throws IOException {
        doc = Jsoup.connect(address).get();
    }

    private void connectWithErrorsIgnoring() throws IOException {
        tryConnectWithErrorsIgnoring();
    }

    private void tryConnectWithErrorsIgnoring() throws IOException {
        doc = Jsoup.connect(address).ignoreHttpErrors(true).get();
    }
}
