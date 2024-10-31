package packages.soccerpackage;

import java.util.Random;

public class Player {
    private String name;
    private int age;
    private int strength;
    private int powerAtGoalKick;
    private int motivation;
    private int numberOfGoals;

    public Player (String name, int age, int strength, int powerAtGoalKick, int motivation, int numberOfGoals, int shootAtGoal) {
        this.name = name;
        this.age = age;
        this.strength = strength;
        this.powerAtGoalKick = powerAtGoalKick;
        this.motivation = motivation;
        this.numberOfGoals = numberOfGoals;
    }

    private int validate(int value) {
        if (value > 10) {
            return 10;
        } else if (value < 1) {
            return 1;
        }
        return value;
    }

    public int shootAtGoal() {
        Random random = new Random();
        int shotStrength = powerAtGoalKick + random.nextInt(4) - 2;
        return validate(shotStrength);
    }

    public String getName() {
        return this.name;
    }

    public void addGoal() {
        this.numberOfGoals++;
    }

    @Override
    public String toString() {
        return "\nPlayer\n" +
               "Name: " + this.name +
               "\nAge: " + this.age +
               "\nStrength: " + this.strength +
               "\nPower at Goal Kick: " + this.powerAtGoalKick +
               "\nMotivation: " + this.motivation +
               "\nNumber of Goals: " + this.numberOfGoals;
    }

    public int getNumberOfGoals() {
        return this.numberOfGoals;
    }
}