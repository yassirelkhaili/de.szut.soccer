package packages.soccerpackage4;

import java.util.ArrayList;
import packages.soccerpackage2.Goalkeeper;
import packages.soccerpackage.Coach;
import packages.soccerpackage.Player;

public class Team {
    private Coach coach;
    private String name;
    private Goalkeeper goalkeeper;
    private ArrayList<Player> squad;
    public int teamGoals;

    public Team(Coach coach, String name, Goalkeeper goalkeeper, int teamGoals) {
        this.coach = coach;
        this.name = name;
        this.goalkeeper = goalkeeper;
        this.squad = new ArrayList<Player>();
        this.teamGoals = teamGoals;
    }

    public void addPlayer(Player player) {
        this.squad.add(player);
    }

    public int getTotalMotivation() {
        int totalMotivation = 0;
        int playerCount = squad.size() + 1;

        totalMotivation += goalkeeper.getMotivation();
        for (int i = 0; i < squad.size(); i++) {
            totalMotivation += squad.get(i).getMotivation();
        }
        return totalMotivation / playerCount;
    }

    public int getTotalForce() {
        int totalForce = 0;
        int playersOnField = Math.min(10, squad.size());

        totalForce += goalkeeper.getForce();
        for (int i = 0; i < playersOnField; i++) {
            totalForce += squad.get(i).getForce();
        }
        return totalForce;
    }

    @Override
    public String toString() {
        String result = "***Mannschaft***\n";
        result += "Trainer: " + coach.getName() + "\n";
        result += "Torhüter: " + goalkeeper.getName() + "\n";
        
        for (Player player : squad) {
            result += "Spieler: " + player.getName() + "\n";
        }
    
        return result;
    }

    public Coach getCoach () {
        return this.coach;
    }

    public String getName () {
        return this.name;
    }
}
