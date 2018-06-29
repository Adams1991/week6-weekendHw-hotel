package Hotel.RoomTypes;

import Hotel.People.Guest;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class BedroomTest {
    ArrayList<Guest> guests;
    Bedroom bedroom;
    Guest guest;

    @Before
    public void setUp() {
        guest = new Guest();
        guests = new ArrayList<>();
        guests.add(guest);
        bedroom = new Bedroom(guests, RoomTypes.SINGLE);
    }

    @Test
    public void canGetGuestsInRoom() {
        assertEquals(guests, bedroom.getGuests());
    }

    @Test
    public void numberOfGuestsInRoom() {
        assertEquals(1, bedroom.numberOfGuestsInRoom());
    }

    @Test
    public void getCapacity() {
    }

    @Test
    public void setCapacity() {
    }

    @Test
    public void getGuests() {
    }
}