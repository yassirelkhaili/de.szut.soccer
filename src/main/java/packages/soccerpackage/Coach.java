package packages.soccerpackage;

import packages.soccerpackage3.Person;

public class Coach extends Person {
    private int experience;

    public Coach(String name, int age, int experience) {
        super(name, age);
        this.experience = this.validate(experience);
    }

    public int getExperience() {
        return this.experience;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
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