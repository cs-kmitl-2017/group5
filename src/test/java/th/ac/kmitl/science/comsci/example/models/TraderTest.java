package th.ac.kmitl.science.comsci.example.models;

import org.junit.Test;
import th.ac.kmitl.science.comsci.example.models.mock.PostalAddressMock;
import th.ac.kmitl.science.comsci.example.models.mock.UniversalCommunicationMock;
import th.ac.kmitl.science.comsci.example.models.mock.TraderMock;

import java.util.List;

import static org.junit.Assert.*;

public class TraderTest {

    @Test
    public void canCreateTrader() {
        Trader trader = TraderMock.generateMockTrader();

        assertEquals(TraderMock.id, trader.getId());
        assertEquals(TraderMock.globalId, trader.getGlobalId());
        assertEquals(TraderMock.name, trader.getName());
        assertEquals(TraderMock.taxId, trader.getTaxId());
    }

    @Test
    public void canCreateTraderWithContacts() {
        List<UniversalCommunication> universalCommunications = UniversalCommunicationMock.generateMockUniversalCommunicationList();

        Trader trader = TraderMock.generateMockTrader()
                .withDefinedTradeContacts(
                        universalCommunications.get(0),
                        universalCommunications.get(1)
                );

        assertEquals(TraderMock.id, trader.getId());
        assertEquals(TraderMock.globalId, trader.getGlobalId());
        assertEquals(TraderMock.name, trader.getName());
        assertEquals(TraderMock.taxId, trader.getTaxId());
        assertEquals(true, trader.getDefinedTradeContacts().containsAll(universalCommunications));
    }

    @Test
    public void canCreateTraderWithPostalAddress() {

        PostalAddress postalAddress = PostalAddressMock.generateMockPostalAddressWithSomeAttribute();

        Trader trader = TraderMock.generateMockTrader()
                .withPostalTradeAddress(postalAddress);

        assertEquals(TraderMock.id, trader.getId());
        assertEquals(TraderMock.globalId, trader.getGlobalId());
        assertEquals(TraderMock.name, trader.getName());
        assertEquals(TraderMock.taxId, trader.getTaxId());
        assertEquals(postalAddress, trader.getPostalTradeAddress());
    }
}