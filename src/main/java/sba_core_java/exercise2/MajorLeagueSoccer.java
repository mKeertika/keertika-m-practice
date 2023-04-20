package sba_core_java.exercise2;

import java.util.Arrays;

public class MajorLeagueSoccer {


    private int[] playerNumberArray;

    //Default Constructor
    public MajorLeagueSoccer() {
        playerNumberArray= new int[11];

        for (int i = 0; i < 11; i++) {

            this.playerNumberArray[i] = i + 1;
        }
        String s = Arrays.toString(playerNumberArray);
        System.out.println(s);
    }


    void sendPlayerToMinorLeague(int playerID) {
        if (playerID > 0 && playerID <= 11) {
            if (playerNumberArray[playerID - 1] != -1) {
                playerNumberArray[playerID - 1] = -1;
                System.out.printf("%nPlayer {%d} is sent to minor league", playerID);
            } else {
                System.out.printf("%nPlayer {%d} is no longer available", playerID);
            }
        } else {
            System.out.printf("%nIn valid Player id");
        }

    }

    void transferPlayerToDifferentTeam(int playerID, String destinationTeam) {
        if (playerID > 0 && playerID <= 11) {
            if (playerNumberArray[playerID - 1] != -1) {
                playerNumberArray[playerID - 1] = -1;
                System.out.printf("%nPlayer {%d} is transferred to %s", playerID, destinationTeam);
            } else {
                System.out.printf("%n Player {%d} is no longer available for team %s", playerID, destinationTeam);
            }
        }

    }

    public int[] getPlayerNumberArray() {
        return playerNumberArray;
    }
}

