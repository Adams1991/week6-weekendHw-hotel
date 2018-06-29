package Hotel.People;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GuestTest {

    Guest guest;

    @Before
    public void setUp(){
        guest = new Guest("Bob", 300.00);

    }

    @Test
    public void canGetName(){
        assertEquals("Bob", guest.getName());
    }

    @Test
    public void canGetWallet(){
        assertEquals(300, guest.getWallet(), 0.01);
    }


}