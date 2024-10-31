package packages.soccerpackage2;

import packages.soccerpackage.Player;
import java.util.Random;


public class Goalkeeper extends Player {
    public int  reaction;

    public Goalkeeper(String name, int age, int strength, int powerAtGoalKick, int force, int motivation, int numberOfGoals, int shootAtGoal, int reaction) {
        super(name, age, force, powerAtGoalKick, motivation, 0, 0); 
        this.reaction = super.validate(reaction);
    }

    public int getReaction() {
        return reaction;
    }

    public void setReaction(int reaction) {
        this.reaction = super.validate(reaction);
    }

    public boolean ballHold(int powerAtGoalKick) {
        Random random = new Random();
        int adjustedReaction = reaction + random.nextInt(5) - 2;
        adjustedReaction = super.validate(adjustedReaction);
        return adjustedReaction >= powerAtGoalKick;
    }

    @Override
    public String toString() {
        return super.toString() +
               "\nReaction: " + this.reaction;
    }
}
