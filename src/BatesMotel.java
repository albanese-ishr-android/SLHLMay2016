import com.sun.jmx.remote.internal.ClientCommunicatorAdmin;

import java.util.LinkedList;

public class BatesMotel {


    public static void main(String[] args) {

        LinkedList<Client> list = new LinkedList<Client>();
        Client firstClient = new Client("Albanese", 4);
        Client secondClient = new Client("Bill Nye", 7);

        newClient(firstClient, list);
        newClient(secondClient, list);

        System.out.println(list.size());



    }

    public static void newClient(Client client, LinkedList<Client> bookingsList){

        //If a clients are added on the same day, then the new one is added
        //after the second one.


        //If the list is empty, just add the client to the beginning of the list.
        if(bookingsList.isEmpty()){
            bookingsList.addFirst(client);
        }

    }

    public static void printList(LinkedList<Client> list){

    }

}
