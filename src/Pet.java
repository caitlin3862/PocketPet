public class Pet {

    private String name;
    private String action;
    private int hunger;
    private int happiness;
    private int energy;

    public Pet(String name){
        this.name = name;
        action = null;
        hunger = 3;
        happiness = 3;
        energy = 3;
    }

    public String getName() {
        return name;
    }

    public String getAction(){
        if (action.equals("I am content!")){
            return action;
        } else {
            return "I want to " + action + ".";
        }
    }

    public int getHunger() {
        return hunger;
    }

    public int getHappiness() {
        return happiness;
    }

    public int getEnergy() {
        return energy;
    }

    public void setAction() {
        if (hunger == 5 && happiness == 5 && energy == 5){
            action = "I am content!";
        } else if (happiness < hunger && happiness < energy) { // if happiness is the lowest stat, the pet wants to play
            action = "play \uD83E\uDD0D";
        } else if (hunger < happiness && hunger < energy) { // if hunger is the lowest stat, the pet wants to eat
            action = "eat \uD83C\uDF4E";
        } else if (energy < happiness && energy < hunger){ // if energy is the lowest stat, the pet wants to sleep
            action = "sleep ⚡";
        } else {
            int determineAction = (int) (Math.random()*4) + 1; // or else randomly determine the action the pet
            if (determineAction == 1){
                action = "play \uD83E\uDD0D";
            } else if (determineAction == 2){
                action = "eat \uD83C\uDF4E";
            } else {
                action = "sleep ⚡";
            }
        }
    }

    public void updateHunger(int feed){
        hunger += feed;
    }

    public void updateHappiness(int happy){
        happiness += happy;
    }

    public void updateEnergy(int sleepy){
        energy += sleepy;
    }

    public void printStats() {
        System.out.println(ConsoleUtility.PINK + "Happiness: " + happinessToEmojis());
        System.out.println(ConsoleUtility.RED +  "Hunger: " + ConsoleUtility.RESET + hungerToEmojis());
        System.out.println(ConsoleUtility.YELLOW + "Energy: " + energyToEmojis() + ConsoleUtility.RESET);
    }

    /* Private helpers to convert stats to emojis to display */
    private String happinessToEmojis(){
        String emojis = "";
        for (int i = 0; i < happiness; i++){
            emojis += "\uD83E\uDD0D" + " ";
        }
        return emojis;
    }

    private String hungerToEmojis(){
        String emojis = "";
        for (int i = 0; i < hunger; i++){
            emojis += "\uD83C\uDF4E" + " ";
        }
        return emojis;
    }

    private String energyToEmojis(){
        String emojis = "";
        for (int i = 0; i < energy; i++){
            emojis += "⚡" + " ";
        }
        return emojis;
    }

}
