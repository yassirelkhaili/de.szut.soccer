package packages.soccerPackage5;

import java.util.Random;

import packages.soccerpackage.Player;
import packages.soccerpackage2.Goalkeeper;
import packages.soccerpackage4.Team;

class Game {
    protected int score = 0;

    public int getScore() {
        return this.score;
    }

    public void incrementTeamGoals(Team team) {
        team.teamGoals++;
    }
}

public class Gameplay {
    private static final int PLAYING_TIME = 90;
    private static final int MAX_ADDITIONAL_TIME=5;
    private static final int MAX_DURATION_UNTIL_NEXT_ACTION = 15;
    private Game game;
    private Random random = new Random();

    public Gameplay (Game game) {
        this.game = game;
    }

    public int calculateForceOfTheTeam(Team team) {
        int baseForce = team.getTotalForce() * team.getTotalMotivation() * team.getCoach().getExperience();
        int randomValue = random.nextInt(7) - 3;
        int teamForce = baseForce + randomValue;
        return Math.max(teamForce, 1);
    }

    private void doGameAction(Player player, Goalkeeper goalkeeper, int minute, Team team) {
        System.out.println(minute + ". Minute: Chance fuer " + team.getName() + " ...");
        System.out.println(player.getName() + " zieht ab");
        if (player.shootAtGoal()) {
            if (!goalkeeper.ballHold(player.powerAtGoalKick)) {
                game.incrementTeamGoals(team);
                player.addGoal();

                System.out.println("TOR!!! " + game.getScore() + " " + player.getName() + "(" + player.getNumberOfGoals() + ")");
            } else {
                // Torhüter hält den Ball
                System.out.println(goalkeeper.getName() + " pariert glanzvoll.");
            }
        } else {
            System.out.println("Der Schuss verfehlt das Tor.");
        }
    }
}
