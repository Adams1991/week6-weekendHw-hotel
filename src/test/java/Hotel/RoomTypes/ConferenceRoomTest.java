package Hotel.RoomTypes;

import Hotel.People.Guest;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ConferenceRoomTest {
    ArrayList<Guest> guests;
    ConferenceRoom conferenceRoom;
    Guest guest;

    @Before
    public void setUp() {
        guest = new Guest("Bob", 500);
        guests = new ArrayList<>();
        guests.add(guest);
        conferenceRoom = new ConferenceRoom(50, guests, "Bezo Room", 150);
    }

    @Test
    public void canGetGuestsInRoom() {
        assertEquals(guests, conferenceRoom.getGuests());
    }
    
    @Test
    public void canGetNumberOfGuestsInRoom() {
        assertEquals(1, conferenceRoom.numberOfGuestsInRoom());
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

    @Test
    public void canGetRoomName() {
        assertEquals("Bezo Room", conferenceRoom.getName());
    }

    @Test
    public void canGetDailyRate() {
        assertEquals(150, conferenceRoom.getDailyRate(), 0.01);
    }

    @Test
    public void canSetRoomName() {
        conferenceRoom.setName("Bush Room");
        assertEquals("Bush Room", conferenceRoom.getName());
    }

    @Test
    public void canSetDailyRate() {
        conferenceRoom.setDailyRate(200);
        assertEquals(200, conferenceRoom.getDailyRate(), 0.01);
    }


}