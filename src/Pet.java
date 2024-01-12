public class Pet {

    private String name;
    private String action;
    private int hunger;
    private int happiness;
    private int tiredness;

    public Pet(String name){
        this.name = name;
        action = null;
        hunger = 5;
        happiness = 5;
        tiredness = 5;
    }

    public String getName() {
        return name;
    }

    public String getAction() {
        return name + " wants to " + action;
    }

    public int getHunger() {
        return hunger;
    }

    public int getHappiness() {
        return happiness;
    }

    public int getTiredness() {
        return tiredness;
    }

}
