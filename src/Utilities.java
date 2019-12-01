public class Utilities {

    Room[] allRooms;

    public static String sayHello(String name) {
        String message = "Hello there, " + name;
        return message;
    }

    public int[] findRooms() {
        int[] availableRooms = new int[100];
        int j;
        j = 0;

        for (int i = 0; i < 100; i++) {
            if (allRooms[i].beds == 2 && allRooms[i].empty) {
                availableRooms[j] = allRooms[i].roomNumber;
                j = j + 1;
            }
        }

        return availableRooms;

    }
}
