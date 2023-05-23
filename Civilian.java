public class Civilian extends Person {
    private String activity;

    public Civilian(String name, String hairColor, String clothing, int gender, String activity) {
        super(name, hairColor, clothing, gender);
        this.activity = activity;
    }

    // mutator methods

    public void setActivity(String activity) {
        this.activity = activity;
    }

    //accessor methods

    public String getActivity() {
        return activity;
    }


    public String toString() {

        if (getGender() == MALE) {
            return super.toString() + "\nHe is currently " + getActivity() + ".";
        }

        else if (getGender() == FEMALE) {
            return super.toString() + "\nShe is currently " + getActivity() + ".";
        }

        else {
            return super.toString() + "\nThey are currently " + getActivity() + ".";
        }
    }
}
