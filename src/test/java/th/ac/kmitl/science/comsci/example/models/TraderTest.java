package th.ac.kmitl.science.comsci.example.models;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static org.junit.Assert.*;

public class TraderTest {

    static String id = UUID.randomUUID().toString();
    static String globalId = UUID.randomUUID().toString();
    static String name = "KMITL";
    static String taxId = UUID.randomUUID().toString();

    public static List<TraderContact> generateEmailList() {
        String emailId = UUID.randomUUID().toString();
        String emailCompleteNumber = "info@kmitl.ac.th";
        EmailAddress emailAddress = new EmailAddress(emailId, emailCompleteNumber);

        String emailId2 = UUID.randomUUID().toString();
        String emailCompleteNumber2 = "info2@kmitl.ac.th";
        EmailAddress emailAddress2 = new EmailAddress(emailId2, emailCompleteNumber2);

        List<TraderContact> emailAddresses = new ArrayList<>();
        emailAddresses.add(emailAddress);
        emailAddresses.add(emailAddress2);

        return emailAddresses;
    }

    public static Trader createTrader() {
        Trader trader = new Trader(
                id,
                globalId,
                name,
                taxId
        );
        return trader;
    }

    @Test
    public void canCreateTrader() {
        Trader trader = createTrader();

        assertEquals(id, trader.getId());
        assertEquals(globalId, trader.getGlobalId());
        assertEquals(name, trader.getName());
        assertEquals(taxId, trader.getTaxId());
    }

    @Test
    public void canCreateTraderWithContacts() {
        List<TraderContact> emailAddresses = generateEmailList();

        Trader trader = createTrader()
                .withDefinedTradeContacts(
                        emailAddresses.get(0),
                        emailAddresses.get(1)
                );

        assertEquals(id, trader.getId());
        assertEquals(globalId, trader.getGlobalId());
        assertEquals(name, trader.getName());
        assertEquals(taxId, trader.getTaxId());
        assertEquals(true, trader.getDefinedTraderContacts().containsAll(emailAddresses));
    }

    @Test
    public void canCreateTraderWithPostalAddress() {

        PostalAddress postalAddress = PostalAddressTest.createPostalAddressWithSomeAttribute();

        Trader trader = createTrader().withPostalTradeAddress(postalAddress);

        assertEquals(id, trader.getId());
        assertEquals(globalId, trader.getGlobalId());
        assertEquals(name, trader.getName());
        assertEquals(taxId, trader.getTaxId());
        assertEquals(postalAddress, trader.getPostalTradeAddress());
    }
}