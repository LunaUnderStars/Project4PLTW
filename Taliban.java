public class Taliban extends Person {
    private String question;
    private String rightAnswer;
    private String wrongAnswer;

    public Taliban(String name, String hairColor, String question, String rightAnswer, String wrongAnswer) {
        super(name, hairColor, MALE);
        this.question = question;
        this.rightAnswer = rightAnswer;
        this.wrongAnswer = wrongAnswer;
    }

    public String getQuestion() {
        return question;
    }

    public String getRightAnswer() {
        return rightAnswer;
    }

    public String getWrongAnswer() {
        return wrongAnswer;
    }  

}
