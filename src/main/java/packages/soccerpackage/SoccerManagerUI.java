package packages.soccerpackage;

public class SoccerManagerUI {

    public static void main(String[] args) {
        Coach coach = new Coach("Alex Ferguson", 65, 9);
        System.out.println(coach.toString());

        Player player = new Player("Derick Henry", 36, 8, 7, 10, 0, 5);
        System.out.println(player.toString());

        int shotPower = player.shootAtGoal();
        System.out.println("Torschusshärte von " + player.getName() + ": " + shotPower);
    }
}
