public class Group {

    private String name; // name of group
    private int number; // number of rooms allocated to the group
    int[] gRooms = new int[number];

    public Group(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }
    // array to hold room numbers allocated to the group

    public double bill(int[] gRooms) {
        // method that calculates the bill for the group
        //There's an error because it's not returning a value.
        return 0.00;
    }
}
