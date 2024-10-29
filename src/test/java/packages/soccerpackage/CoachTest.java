package packages.soccerpackage;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CoachTest {

    @Test
    public void testCoachCreationWithValidExperience() {
        Coach coach = new Coach("Valid Coach", 40, 5);
        assertEquals("Valid Coach", coach.getName());
        assertEquals(40, coach.getAge());
        assertEquals(5, coach.getExperience()); // Experience within valid range
    }

    @Test
    public void testCoachExperienceValidationAboveLimit() {
        Coach coach = new Coach("Experienced Coach", 50, 15);
        assertEquals(10, coach.getExperience()); // Experience should be capped at 10
    }

    @Test
    public void testCoachExperienceValidationBelowLimit() {
        Coach coach = new Coach("New Coach", 30, -3);
        assertEquals(1, coach.getExperience()); // Experience should be set to 1
    }

    @Test
    public void testToString() {
        Coach coach = new Coach("Test Coach", 45, 7);
        String expectedOutput = "\nCoach\nname: Test Coach\nage: 45\nexperience: 7";
        assertEquals(expectedOutput, coach.toString());
    }

    @Test
    public void testEdgeCaseExperienceOne() {
        Coach coach = new Coach("Edge Case Coach", 35, 1);
        assertEquals(1, coach.getExperience()); // Valid edge case for experience
    }

    @Test
    public void testEdgeCaseExperienceTen() {
        Coach coach = new Coach("Top Coach", 50, 10);
        assertEquals(10, coach.getExperience()); // Valid edge case for experience
    }
}
