public class Main7 {


    public static int[] expandRoster(int[] oldRoster, int newSize) {

        int[] newRoster = new int[newSize];


        for (int i = 0; i < oldRoster.length; i++) {
            newRoster[i] = oldRoster[i];
        }


        return newRoster;
    }

    public static void main(String[] args) {

        int[] oldRoster = new int[20];
        for (int i = 0; i < oldRoster.length; i++) {
            oldRoster[i] = 1000 + i;
        }


        int[] newRoster = expandRoster(oldRoster, 42);


        System.out.println("Old Roster:");
        for (int id : oldRoster) {
            System.out.print(id + " ");
        }

        System.out.println("\n\nNew Roster:");
        for (int id : newRoster) {
            System.out.print(id + " ");
        }


        System.out.println("\n\nOld roster length: " + oldRoster.length);
        System.out.println("New roster length: " + newRoster.length);
    }
}

