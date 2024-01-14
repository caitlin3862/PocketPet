public class Pet {

    private String name;
    private String action;
    private int hunger;
    private int happiness;
    private int tiredness;

    public Pet(String name){
        this.name = name;
        action = null;
        hunger = 3;
        happiness = 3;
        tiredness = 3;
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

    public void printStats() {
        System.out.println("Happiness: " + getHappiness());
        System.out.println("Hunger: " + getHunger());
        System.out.println("Tiredness: " + getTiredness());
    }

    public void petFrame1(){
        System.out.println("              __________                ");
        System.out.println("            /            \\              ");
        System.out.println("           |   .      .   |             ");
        System.out.println("           |     ----     |             ");
        System.out.println("           |              |             ");
    }

    public void petFrame2(){
        System.out.println();
        System.out.println("              __________                ");
        System.out.println("            /            \\              ");
        System.out.println("           |   _      _   |             ");
        System.out.println("           |     ----     |             ");
    }

}
