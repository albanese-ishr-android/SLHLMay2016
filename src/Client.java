public class Client {
    private int customerID;
    private String name;
    private Dates arrive;
    private Dates leave;
    private Room bedroom;

    public Client(int id, String c, Dates dateIn, Dates dateOut, Room r) {
        setCustomerID(id);
        setName(c);
        setArrive(dateIn);
        setLeave(dateOut);
        setBedroom(r);
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int id) {
        customerID = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String c) {
        name = c;
    }

    public Dates getArrive() {
        return arrive;
    }

    public void setArrive(Dates dateIn) {
        arrive = dateIn;
    }

    public Dates getLeave() {
        return leave;
    }

    public void setLeave(Dates dateOut) {
        leave = dateOut;
    }

    public Room getBedroom() {
        return bedroom;
    }

    public void setBedroom(Room r) {
        bedroom = r;
    }

    public void bill() {
        // method that calculates the bill for this client
    }
}
