package Model;

import java.io.Serializable;

public class Word implements Serializable {

    private final int num0 = 0;
    private final int num2 = 2;
    String word;
    String meaning;
    private String distractW = "I want pass";
    public Word(String word) {
        this.word = word;
    }

    public String getDistractW() {
        return distractW;
    }

    public void setDistractW(String distractW) {
        this.distractW = distractW;
    }

    public Word(String word, String meaning) {
        this.word = word;
        this.meaning = meaning;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }

    public String parse() {
        String result = "<span color=red>Word: </span>" + this.getWord()
                + "<br/>";
        if(distractW != null){
            if(word != null){
                if(distractW.equals(word)){
                    word = word + "?";
                }
            }
        }
        String currentMeaning = this.getMeaning();
        if (currentMeaning.contains("(Tech)")) {
            int index = currentMeaning.indexOf("(Tech)");
            result = result + "<span color=red>Meaning:</span> "
                    + currentMeaning.substring(num0, index - num2)
                    + "<br/>"
                    + "<span color=red>Tech:</span> " + currentMeaning.substring(index + 6);
        } else {
            result += "<span color=red>Meaning:</span> " + currentMeaning;
        }
        return result;
    }
}
