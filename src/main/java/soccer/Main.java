package soccer;

import packages.soccerpackage.Coach;
import packages.soccerpackage.Player;
import packages.soccerpackage2.Goalkeeper;
import packages.soccerpackage4.Team;

public class Main {
    public static void main(String[] args) {
        // Goalkeeper goalkeeper = new Goalkeeper("Oliver Kahn", 35, 8, 7, 9, 0, 0, 0, 6);

        // System.out.println(goalkeeper);

        // int powerAtGoalKick = 7;
        // boolean ballHeld = goalkeeper.ballHold(powerAtGoalKick);

        // if (ballHeld) {
        //     System.out.println("Der Torhüter hat den Ball gehalten!");
        // } else {
        //     System.out.println("Der Torhüter hat den Ball nicht gehalten.");
        // }

        // Person person = new Person("name", 22); abstract class cannot be instantiated duh 😒

        Coach coach = new Coach("Terzic", 22, 6);
        Goalkeeper keeper = new Goalkeeper("Bürki", 29, 85, 90, 75, 80, 5, 90, 85);
        Player player1 = new Player("Meunier", 3, 4, 12, 8, 4, 2, 9);
        Player player2 = new Player("Akanji", 3, 4, 12, 8, 4, 2, 9);
        Player player3 = new Player("Hummels", 3, 4, 12, 8, 4, 2, 9);
        Player player4 = new Player("Guerreiro", 3, 4, 12, 8, 4, 2, 9);
        Player player5 = new Player("Witsel", 3, 4, 12, 8, 4, 2, 9);
        Player player6 = new Player("Brandt", 3, 4, 12, 8, 4, 2, 9);
        Player player7 = new Player("Sancho", 3, 4, 12, 8, 4, 2, 9);
        Player player8 = new Player("Bellingham", 3, 4, 12, 8, 4, 2, 9);
        Player player9 = new Player("Reus", 3, 4, 12, 8, 4, 2, 9);
        Player player10 = new Player("Haaland", 3, 4, 12, 8, 4, 2, 9);
        Team team = new Team(coach, "Mannschaft", keeper, 0);
        team.addPlayer(player1);
        team.addPlayer(player2);
        team.addPlayer(player3);
        team.addPlayer(player4);
        team.addPlayer(player5);
        team.addPlayer(player6);
        team.addPlayer(player7);
        team.addPlayer(player8);
        team.addPlayer(player9);
        team.addPlayer(player10);
        System.out.println(team.toString());
    }
}