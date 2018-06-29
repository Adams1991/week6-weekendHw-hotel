package Hotel.RoomTypes;

import Hotel.People.Guest;
import Hotel.Room;

import java.util.ArrayList;

public class ConferenceRoom extends Room {

    private String name;
    private double dailyRate;

    public ConferenceRoom(int capacity, ArrayList<Guest> guests, String name, double dailyRate) {
        super(capacity, guests);
        this.name = name;
        this.dailyRate = dailyRate;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public String getName() {
        return name;
    }

    public void setName (String roomName) {
        this.name = roomName;
    }

    public void setDailyRate(int dailyRate) {
        this.dailyRate = dailyRate;
    }
}
