public class Person {
    private String name;
    private String hairColor;
    private String clothing;
    private int gender;

    static final int MALE = 0;
    static final int FEMALE = 1;


    public Person(String name, String hairColor, String clothing, int gender) {
        this.name = name;
        this.hairColor = hairColor;
        this.clothing = clothing;
        this.gender = gender;
    }
    
    //mutator methods

    public void setName(String name) {
        this.name = name;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public void setClothing(String clothing) {
        this.clothing = clothing;
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

    public String getClothing() {
        return clothing;
    }

    public int getGender() {
        return gender;
    }


    public String toString() {
        if (gender == MALE) {
            return name + " is a " + getHairColor() + " haired man who is wearing " + getClothing() + ".";
        }

        else if (gender == FEMALE) {
            return getName() + " is a " + getHairColor() + " haired woman who is wearing " + getClothing() + ".";
        }

        else {
            return getName() + " is a " + getHairColor() + " haired person who is wearing " + getClothing() + ".";
        }
        
    }
}
