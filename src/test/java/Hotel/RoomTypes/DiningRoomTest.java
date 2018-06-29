package Hotel.RoomTypes;

import Hotel.People.Guest;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class DiningRoomTest {
    ArrayList<Guest> guests;
    DiningRoom diningRoom;
    Guest guest;

    @Before
    public void setup() {
        guest = new Guest("Bob", 500);
        guests = new ArrayList<>();
        guests.add(guest);
        diningRoom = new DiningRoom(12, guests);
    }

    @Test
    public void canGetGuestsInRoom() {
        assertEquals(guests, diningRoom.getGuests());
    }

    @Test
    public void canGetNumberOfGuestsInRoom() {
        assertEquals(1, diningRoom.numberOfGuestsInRoom());
    }

    @Test
    public void canGetCapacity() {
        assertEquals(12, diningRoom.getCapacity());
    }

    @Test
    public void canSetCapacity() {
        diningRoom.setCapacity(14);
        assertEquals(14, diningRoom.getCapacity());
    }

}