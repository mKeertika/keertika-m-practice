package sba_final2;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cricket c = new Cricket();
        Football f = new Football();

        int[] age1 = new int[11];
        int[] age2 = new int[11];

        for(int i = 0; i < 2; i++)
        {
            String[] age = sc.nextLine().split(" ");
            if(i == 0){
                int j = 0;
                for(String s : age)
                    age1[j++] = Integer.parseInt(s);
            }
            else{
                int j = 0;
                for(String s : age)
                    age2[j++] = Integer.parseInt(s);
            }
        }
        c.calculateAvgAge(age1);
        f.calculateAvgAge(age2);

        for(int i = 0; i < 6; i++){

            if(i < 3){
                int x = Integer.parseInt(sc.nextLine());

                c.retirePlayer(x);
            }
            else if(i < 5){
                int x = Integer.parseInt(sc.nextLine());
                f.retirePlayer(x);
            }
            else {
                String[] temp = sc.nextLine().split(" ");
                f.playerTransfer(Integer.parseInt(temp[0]), Integer.parseInt(temp[1]));
            }
        }
    }
}
interface Sport{
    void calculateAvgAge(int[] age);
    void retirePlayer(int id);
}

 class Cricket implements Sport {
    private int[] playerIDs;

    public Cricket() {
        playerIDs = new int[11];
        for (int i = 0; i < playerIDs.length; i++) {
            playerIDs[i] = i + 1;
        }
        System.out.println("A new cricket team has been formed.");
    }

    public void calculateAvgAge(int[] age) {
        double sum = 0;
        for (int i = 0; i < age.length; i++) {
            sum += age[i];
        }
        double avgAge = sum / age.length;
        System.out.println("The average age of the cricket team is: " + avgAge);
    }

    public void retirePlayer(int id) {
        if (playerIDs[id] == -1) {
            System.out.println("Player with id: " + id + " has already retired.");
        } else {
            playerIDs[id] = -1;
            System.out.println("Player with id: " + id + " has retired from the cricket team.");
        }
    }
}

 class Football extends Cricket implements Sport {
    private int[] playerIDs;

    public Football() {
        super();
        playerIDs = new int[11];
        for (int i = 0; i < playerIDs.length; i++) {
            playerIDs[i] = i + 1;
        }
        System.out.println("A new football team has been formed.");
    }

    public void calculateAvgAge(int[] age) {
        double sum = 0;
        for (int i = 0; i < age.length; i++) {
            sum += age[i];
        }
        double avgAge = sum / age.length;
        System.out.println("The average age of the football team is: " + avgAge);
    }

    public void retirePlayer(int id) {
        if (playerIDs[id] == -1) {
            System.out.println("Player with id: " + id + " has already retired.");
        } else {
            playerIDs[id] = -1;
            System.out.println("Player with id: " + id + " has retired from the football team.");
        }
    }

    public void playerTransfer(int fee, int id) {
        if (playerIDs[id] == -1) {
            System.out.println("Player with id: " + id + " is already retired.");
        } else {
            playerIDs[id] = -1;
            System.out.println("Player with id: " + id + " has been transferred from the football team with a fee of " + fee + ".");
        }
    }
}
//
// class Cricket implements Sport{
//    private int[] playerIDs;
//
//    public Cricket() {
//        playerIDs = new int[11];
//        for (int i = 0; i < playerIDs.length; i++) {
//            playerIDs[i] = i + 1;
//        }
//        System.out.println("A new cricket team has been formed.");
//    }
//
//    public void calculateAvgAge(int[] age) {
//        double sum = 0;
//        for (int i = 0; i < age.length; i++) {
//            sum += age[i];
//        }
//        double avg = sum / age.length;
//        System.out.println("The average age of the team is: " + avg);
//    }
//
//    public void retirePlayer(int id) {
//        if (playerIDs[id] == -1) {
//            System.out.println("Player with id: " + id + " has already retired.");
//        } else {
//            playerIDs[id] = -1;
//            System.out.println("Player with id: " + id + " has retired.");
//        }
//    }
//}
