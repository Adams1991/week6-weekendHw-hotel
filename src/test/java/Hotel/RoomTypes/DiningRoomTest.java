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
        diningRoom = new DiningRoom(12, guests, "Main");
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

    @Test
    public void canAddGuest() {
        diningRoom.addGuest(guest);
        assertEquals(2, diningRoom.numberOfGuestsInRoom());

    }

    @Test
    public void canGetName() {
        assertEquals("Main", diningRoom.getName());

    }

    @Test
    public void canCheckIsFull(){
        diningRoom.setCapacity(0);
        assertEquals(true, diningRoom.isFull());
    }

}