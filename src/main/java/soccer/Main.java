package soccer;

import packages.soccerpackage2.Goalkeeper;

public class Main {
    public static void main(String[] args) {
        Goalkeeper goalkeeper = new Goalkeeper("Oliver Kahn", 35, 8, 7, 9, 0, 0, 0, 6);

        System.out.println(goalkeeper);

        int powerAtGoalKick = 7;
        boolean ballHeld = goalkeeper.ballHold(powerAtGoalKick);

        if (ballHeld) {
            System.out.println("Der Torhüter hat den Ball gehalten!");
        } else {
            System.out.println("Der Torhüter hat den Ball nicht gehalten.");
        }
    }
}