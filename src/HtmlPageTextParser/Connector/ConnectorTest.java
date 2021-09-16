package HtmlPageTextParser.Connector;

import HtmlPageTextParser.ConstStrs.Addresses;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ConnectorTest {


    @Test
    void connect() {
        Assertions.assertNotNull(new Connector(Addresses.vkAddress).connect());
        Assertions.assertNotNull(new Connector(Addresses.stackOverflowAddress).connect());
        Assertions.assertNotNull(new Connector(Addresses.googleAddress).connect());
        Assertions.assertNotNull(new Connector(Addresses.gfgAddress).connect());

        Assertions.assertNotNull(new Connector(Addresses.downDetectorAddress).connect());
        Assertions.assertNotNull(new Connector(Addresses.simbirSoftAddress).connect());
        //Assertions.assertNotNull(new Connector(Adresses.gfgAddress).connect());
    }
}