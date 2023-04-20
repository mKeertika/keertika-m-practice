package sba_core_java.exercise2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] myNumberArray = {23, 12, 33, 47};

        int sum = 0;
        for (int arrValue : myNumberArray) {
            sum = sum + arrValue;
        }
        double avg = (double) sum / (myNumberArray.length);
        System.out.printf("average value is %.2f", avg);

        //MajorLeagueSoccer instantiated
// Step #4 is done
        MajorLeagueSoccer majorLeagueSoccer = new MajorLeagueSoccer();
        majorLeagueSoccer.sendPlayerToMinorLeague(4);
        majorLeagueSoccer.sendPlayerToMinorLeague(4);
        String s = Arrays.toString(majorLeagueSoccer.getPlayerNumberArray());
        System.out.println(s);

//         STEP #5
        majorLeagueSoccer.transferPlayerToDifferentTeam(6, "Tottenham");
        majorLeagueSoccer.transferPlayerToDifferentTeam(6, "Napoli");
    }

}
