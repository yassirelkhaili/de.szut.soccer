package packages.soccerpackage;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PlayerTest {

    @Test
    public void givenShootGoal_whenAddGoal_ReturnUpdatedNumberOfGoals() {
        // Arrange
        Player player = new Player("Valid Coach", 40, 5, 6, 7, 0, 8);
        
        // Act
        int initialGoals = player.getNumberOfGoals();
        player.addGoal();
        
        // Assert
        assertEquals(initialGoals + 1, player.getNumberOfGoals(), "Number of goals should be incremented by 1");
    }
}
