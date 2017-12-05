package th.ac.kmitl.science.comsci.example.models;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static org.junit.Assert.*;

public class TraderTest {

    @Test
    public void canCreateTrader() {

        String id = UUID.randomUUID().toString();
        String globalId = UUID.randomUUID().toString();
        String name = "KMITL";
        String taxId = UUID.randomUUID().toString();
        
        String emailId = UUID.randomUUID().toString();
        String emailCompleteNumber = "info@kmitl.ac.th";
        EmailAddress emailAddress = new EmailAddress(emailId, emailCompleteNumber);

        String emailId2 = UUID.randomUUID().toString();
        String emailCompleteNumber2 = "info2@kmitl.ac.th";
        EmailAddress emailAddress2 = new EmailAddress(emailId2, emailCompleteNumber2);
        
        PostalAddress postalAddress = new PostalAddressBuilder()
                .setPostcodeCode("10310")
                .setBuildingName("อาคารพระจอมเกล้า")
                .setLineOne("ชั้น B ห้อง B01 คณะวิทยาศาสตร์ สถาบันเทคโนโลยีพระจอมเกล้า เจ้าคุณทหารลาดกระบัง")
                .setLineTwo("เลขที่ 1")
                .setStreetName("ฉลองกรุง")
                .setCityName("ลาดกระบัง")
                .setCitySubDivisionName("ลาดกระบัง")
                .createPostalAddress();

        List<TraderContact> emailAddresses = new ArrayList<>();
        emailAddresses.add(emailAddress);
        emailAddresses.add(emailAddress2);

        Trader trader = new Trader(
                id,
                globalId,
                name,
                taxId
        ).withDefinedTradeContacts(
                emailAddress,
                emailAddress2
        ).withPostalTradeAddress(postalAddress);
        
        assertEquals(id, trader.getId());
        assertEquals(globalId, trader.getGlobalId());
        assertEquals(name, trader.getName());
        assertEquals(true, trader.getDefinedTraderContacts().containsAll(emailAddresses));
        assertEquals(postalAddress, trader.getPostalTradeAddress());
    }

}