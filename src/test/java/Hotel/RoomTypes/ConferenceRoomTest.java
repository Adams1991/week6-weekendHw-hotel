package Hotel.RoomTypes;

import Hotel.People.Guest;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;
    Guest guest;

    @Before
    public void setUp() {
        guest = new Guest();
        ArrayList<Guest> guests = new ArrayList<>();
        guests.add(guest);
       conferenceRoom = new ConferenceRoom(50, guests, "Bezo Room", 150);
    }
    
    @Test
    public void canGetNumberOfGuestsinRoom() {
        assertEquals(1, conferenceRoom.numberOfGuestsinRoom());
    }

    @Test
    public void canGetCapacity() {
        assertEquals(50, conferenceRoom.getCapacity());
    }

    @Test
    public void canSetCapacity() {
        conferenceRoom.setCapacity(14);
        assertEquals(14, conferenceRoom.getCapacity());
    }
}