package packages.soccerpackage;

import java.util.Random;
import packages.soccerpackage3.Person;

public class Player extends Person {
    protected int strength;
    public int powerAtGoalKick;
    protected int motivation;
    protected int numberOfGoals;
    protected int shotStrength;
    protected int totalForce;

    public Player(String name, int age, int strength, int powerAtGoalKick, int motivation, int numberOfGoals,
            int shootAtGoal, int totalForce) {
        super(name, age);
        this.strength = strength;
        this.powerAtGoalKick = powerAtGoalKick;
        this.motivation = motivation;
        this.numberOfGoals = numberOfGoals;
        this.totalForce = totalForce;
    }

    protected int validate(int value) {
        if (value > 10) {
            return 10;
        } else if (value < 1) {
            return 1;
        }
        return value;
    }

    public boolean shootAtGoal() {
        Random random = new Random();
        int shotStrength = powerAtGoalKick + random.nextInt(4) - 2;
        int validatedShotStrength = validate(shotStrength);
        this.shotStrength = validatedShotStrength;
        int targetThreshold = 5;
        return validatedShotStrength >= targetThreshold;
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

    public int getMotivation() {
        return this.motivation;
    }

    public int getForce() {
        return this.totalForce;
    }
}