package Hotel.RoomTypes;

import Hotel.People.Guest;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class DiningRoomTest {

    DiningRoom diningRoom;
    Guest guest;

    @Before
    public void setup() {
        guest = new Guest();
        ArrayList<Guest> guests = new ArrayList<>();
        guests.add(guest);
        diningRoom = new DiningRoom(12, guests);
    }


    @Test
    public void canGetGuests() {
        assertEquals(guest,diningRoom.getGuests());
    }

    @Test
    public void canGetCapacity() {
        assertEquals(12, diningRoom.getCapacity());
    }

    @Test
    public void canSetCapacity() {
        diningRoom.setCapacity(14);
        assertEquals(12, diningRoom.getCapacity());
    }

}