package packages.soccerpackage;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PlayerTest {

    @Test
    public void givenShootGoal_whenAddGoal_ReturnUpdatedNumberOfGoals() {
        Player player = new Player("Valid Coach", 40, 5, 6, 7, 0, 8, 2);
        int initialGoals = player.getNumberOfGoals();
        player.addGoal();
        assertEquals(initialGoals + 1, player.getNumberOfGoals(), "Number of goals should be incremented by 1");
    }

    @Test
    public void whenShootAtGoal_thenShotStrengthWithinRange() {
        Player player = new Player("Valid Coach", 40, 5, 6, 7, 0, 8, 3);
        int shotStrength = player.shootAtGoal();
        assertTrue(shotStrength >= 1 && shotStrength <= 10, "Shot strength should be between 1 and 10");
    }
}
