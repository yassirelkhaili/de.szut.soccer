package packages.soccerpackage;

public class Coach { 
    private String name;
    private int age;
    private int experience;

    public Coach (String name, int age, int experience) {
        this.name = name;
        this.age = age;
        this.experience = this.validate(experience);
    }

    public int validate(int value) {
        if (value > 10) {
            return 10;
        } else if (value < 1) {
            return 1;
        }
        return value;
    }
    
    @Override
    public String toString() {
        return "\nCoach\n" + "name: " + this.name + "\nage: " + this.age + "\nexperience: " + this.experience;
    }

    
}