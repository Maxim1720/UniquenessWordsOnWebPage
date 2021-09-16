package HtmlPageTextParser.Connector;

import HtmlPageTextParser.ConstStrs.Addresses;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

class ConnectorTest {


    @Test
    void connect() {
        Assertions.assertNotNull(new Connector(Addresses.vkAddress).connect());
        Assertions.assertNotNull(new Connector(Addresses.stackOverflowAddress).connect());
        Assertions.assertNotNull(new Connector(Addresses.googleAddress).connect());
        Assertions.assertNotNull(new Connector(Addresses.gfgAddress).connect());
        Assertions.assertNotNull(new Connector(Addresses.downDetectorAddress).connect());
        Assertions.assertNotNull(new Connector(Addresses.simbirSoftAddress).connect());

        Assertions.assertDoesNotThrow((Executable)new Connector(Addresses.vkAddress)::connect);
        Assertions.assertDoesNotThrow((Executable)new Connector(Addresses.steamAddress)::connect);
        Assertions.assertDoesNotThrow((Executable)new Connector(Addresses.stackOverflowAddress)::connect);
        Assertions.assertDoesNotThrow((Executable)new Connector(Addresses.gfgAddress)::connect);
        Assertions.assertDoesNotThrow((Executable)new Connector(Addresses.downDetectorAddress)::connect);
        Assertions.assertDoesNotThrow((Executable)new Connector(Addresses.googleAddress)::connect);
    }
}