import java.util.LinkedList;

public class BatesMotel {


    public static void main(String[] args) {

        LinkedList<Client> list = new LinkedList<Client>();

        Client firstClient = new Client("Albanese", 4);
        Client secondClient = new Client("Bill", 7);
        Client thirdClient = new Client("Johannes", 5);
        Client fourthClient = new Client("Joe", 2);
        Client fifthClient = new Client("Jill", 27);
        Client sixthClient = new Client("Nancy", 2);
        Client seventhClient = new Client("Rita", 1);

        newClient(firstClient, list);
        newClient(secondClient, list);
        newClient(thirdClient, list);
        newClient(fourthClient, list);
        newClient(fifthClient, list);
        newClient(sixthClient, list);
        newClient(seventhClient, list);

        printList(list);
    }

    public static void newClient(Client client, LinkedList<Client> bookingsList){

        //We will need a flag to keep track of whether there is a date in the list that
        // matches the date the client books.

        boolean dateIsFound = false;
        int index = 0;

        //If the list is empty, just add the client to the beginning of the list.
        if(bookingsList.isEmpty()){
            bookingsList.addFirst(client);
        }

        //If a clients are added on the same day, then the new one is added
        //after the second one.
        else {
            int clientsCheckInDay = client.getArrivalDay();

            Client nextClientInList = bookingsList.getFirst();
            while (!dateIsFound && nextClientInList != null) {

                //Let's get the nextClient in the lists checkInDate
                int nextClientCheckInDate = nextClientInList.getArrivalDay();

                boolean arrivedOnSameDate = Dates.equalDate(nextClientCheckInDate, clientsCheckInDay);
                boolean clientArrivedEarlier = Dates.equalDate(clientsCheckInDay, Dates.compareDates(clientsCheckInDay, nextClientCheckInDate));
                if (arrivedOnSameDate || clientArrivedEarlier) {
                    bookingsList.add(index, client);
                    dateIsFound = true;
                } else {

                    index = index + 1;
                    if (index < bookingsList.size()) {
                        nextClientInList = bookingsList.get(index);
                    } else {
                        nextClientInList = null;
                    }

                }
            }
            if (!dateIsFound) {
                bookingsList.addLast(client);
            }
        }

    }

    public static void printList(LinkedList<Client> list){
        for (Client client : list) {
            if (client != null) {
                System.out.println(client.getName() + "\t Check in date: " + client.getArrivalDay());
            }
        }

    }

}
