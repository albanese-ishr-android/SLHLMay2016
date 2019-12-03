public class Client {

    //Member variables.
    //This is the data for the class / object
    //private means the variables are local (to the class)
    //They cannot be accessed from outside the class.

    private int customerID;
    private String name;
    private int arrivalDay;
    private Dates arrive;
    private Dates leave;
    private Room bedroom;

    //This is the constructor. It is called whenever you make a new object.
    //The parameters that are passed in are whatever you decide are required
    //to make a new object.

    public Client(int id, String c, Dates dateIn, Dates dateOut, Room r) {
        setCustomerID(id);
        setName(c);
        setArrive(dateIn);
        setLeave(dateOut);
        setBedroom(r);
    }

    public Client(int id, String name) {
        customerID = id;
        this.name = name;
    }

    public Client(String name, int arrivalDay){
        this.name = name;
        this.arrivalDay = arrivalDay;
    }

    //Accessor and mutator methods
    //Also known as getters and setters.
    //These are the methods that allow you to change the variables or see their value.
    public int getCustomerID() {
        return customerID;
    }

    //public means any class can access methods.
    //The return type comes next. It tells you what type of data the function returns.
    //The return value is kind of like output, but not exactly.


    //void means no return type. The function does it's job and then stops.
    public void setCustomerID(int id) {
        customerID = id;
    }

    public String getName() {
        return name;
    }

    //Inside the parentheses () are the arguements (or parameters)
    //These come from the outside -- the things that are using this function.
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
