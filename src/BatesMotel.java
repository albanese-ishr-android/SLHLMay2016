import com.sun.jmx.remote.internal.ClientCommunicatorAdmin;

public class BatesMotel {


    public static void main(String[] args) {

        //Create a Client object.
        Client client = new Client(1000, "Albanese");

        //Create another Client object.
        Client secondClient = new Client(1001, "Johnson");

        //Call methods on the objects.
        client.getName();
        secondClient.getName();


    }


}
