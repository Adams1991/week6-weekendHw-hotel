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
    public void canGetNumberOfGuestsInRoom() {
        assertEquals(1, bedroom.numberOfGuestsInRoom());
    }

    @Test
    public void canGetCapacity() {
        assertEquals(1, bedroom.getCapacity());
    }

    @Test
    public void canSetCapacity() {
        bedroom.setCapacity(14);
        assertEquals(14, bedroom.getCapacity());
    }

    @Test
    public void canGetNightlyRate() {
        assertEquals(30.00, bedroom.getNightlyRate(), 0.01);
    }




}