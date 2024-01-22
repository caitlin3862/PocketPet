public class PetInteraction {
    private Pet userPet;
    private PetDrawings draw;

    public PetInteraction(Pet userPet, PetDrawings draw){
        this.userPet = userPet;
        this.draw = draw;
    }

    public void talk(){
        PetUX.timedClearScreen(100);
        userPet.setAction(); // determines the action the pet want
        for (int i = 0; i < 3; i++) { // plays animation
            draw.petFrame1();
            System.out.println("|-------------------------------------|");
            System.out.println("| " + userPet.getName() + ": " + userPet.getAction());
            System.out.println("|-------------------------------------|");
            PetUX.timedClearScreen(1500);
            draw.petFrame2();
            System.out.println("|-------------------------------------|");
            System.out.println("| " + userPet.getName() + ": " + userPet.getAction());
            System.out.println("|-------------------------------------|");
            PetUX.timedClearScreen(1500);
        }
        PetUX.timedClearScreen(100);
    }

    public void feed() {
        for (int i = 0; i < 4; i++) { // plays animation
            System.out.println("You feed " + userPet.getName() + " a treat.");
            draw.petEat();
            PetUX.timedClearScreen(1000);
            System.out.println("You feed " + userPet.getName() + " a treat.");
            draw.petEat2();
            PetUX.timedClearScreen(1000);
        }
        if (!(userPet.getHunger() == 5)){ // updates hunger status
            userPet.updateHunger(1);
        }
        // creates a chance for other stats to decrease
        int stats = (int) (Math.random()*6) + 1;
        if (stats == 1){
            if (userPet.getHappiness()!= 0) {
                userPet.updateHappiness(-1);
            }
        } else if (stats == 2){
            if (userPet.getEnergy()!= 0) {
                userPet.updateEnergy(-1);
            }
        }
    }

    public void play(){
        draw.petPlay(); // plays animation
        if (userPet.getHappiness() != 5){ // updates happiness status
            userPet.updateHappiness(1);
        }
        // creates a chance for other stats to decrease
        int stats = (int) (Math.random()*6) + 1;
        if (stats == 1){
            if (userPet.getHunger()!= 0) {
                userPet.updateHunger(-1);
            }
        } else if (stats == 2){
            if (userPet.getEnergy()!= 0) {
                userPet.updateEnergy(-1);
            }
        }
    }

    public void petSleep(){
        for (int i = 0; i < 4; i++) { // plays animation
            draw.petSleep();
            PetUX.timedClearScreen(1000);
            draw.petSleep2();
            PetUX.timedClearScreen(1000);
        }
        if (!(userPet.getEnergy() == 5)){ // update energy status
            userPet.updateEnergy(1);
        }
        // creates a chance for other stats to decrease
        int stats = (int) (Math.random()*6) + 1;
        if (stats == 1){
            if (userPet.getHappiness()!= 0) {
                userPet.updateHappiness(-1);
            }
        } else if (stats == 2){
            if (userPet.getHunger()!= 0) {
                userPet.updateHunger(-1);
            }
        }
    }


}
