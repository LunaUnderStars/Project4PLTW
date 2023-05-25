public class personGenerator {
    private static String[] hairColorList = {"light brown", "dark brown", "black", "blonde"};
    private static String[] mensNames = {"Firash", "Mohammad", "Sayed", "Abdullah", "Khan", "Sayyid", "Amir"};
    private static String[] activitiesList = {"watering plants", "taking a walk", "stocking a market stand", "waiting for a taxi"};

    private static String[][] questions = {
    {"What is your name?", "Tell him your name is Laila", "Make up a fake name"},
    {"Where are you going?", "Tell him about the orphanage.", "Tell him you are heading home"},
    {"Why are you alone?", "Tell him you left alone", "Tell him your husband is nearby and you are waiting for him"}
    };

    public static Taliban createTaliban() {
        String hairColor = hairColorList[(int)(Math.random() * hairColorList.length)];
        String name = mensNames[(int)(Math.random() * mensNames.length)];
        int qIndex = (int)(Math.random() * questions.length);
        String question = questions[qIndex][0];
        String wrongAnswer = questions[qIndex][1];
        String rightAnswer = questions[qIndex][2];
        
        Taliban talib = new Taliban(name, hairColor, question, rightAnswer, wrongAnswer);
        return talib;
    }

    public static Civilian createCivlian() {
        String hairColor = hairColorList[(int)(Math.random() * hairColorList.length)];
        String name = mensNames[(int)(Math.random() * mensNames.length)];
        String activity= activitiesList[(int)(Math.random() * activitiesList.length)];
        Civilian civilian = new Civilian(name, hairColor, 0, activity);
        return civilian;
    }

  
    
}
