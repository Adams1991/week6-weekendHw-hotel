package Hotel.RoomTypes;

public enum RoomTypes {


    SINGLE(1, 30.00),
    DOUBLE(2, 60.00),
    FAMILY(4, 70.00);

    private final int capacity;
    private final double nightlyRate;

    RoomTypes(int capacity, double nightlyRate){
        this.capacity = capacity;
        this.nightlyRate = nightlyRate;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public double getNightlyRate() {
        return this.nightlyRate;
    }
}

