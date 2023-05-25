public class Person {
    private String name;
    private String hairColor;
    private int gender;

    static final int MALE = 0;
    static final int FEMALE = 1;


    public Person(String name, String hairColor, int gender) {
        this.name = name;
        this.hairColor = hairColor;
        this.gender = gender;
    }
    
    //mutator methods

    public void setName(String name) {
        this.name = name;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }


    //accessor methods

    public String getName() {
        return name;
    }

    public String getHairColor() {
        return hairColor;
    }

    public int getGender() {
        return gender;
    }

    public String toString() {
        if (gender == MALE) {
            return "You see a " + getHairColor() + " haired man.";
        }

        else if (gender == FEMALE) {
            return "You see a " + getHairColor() + " haired woman.";
        }

        else {
            return "You see a " + getHairColor() + " haired person.";
        }
        
    }
}
