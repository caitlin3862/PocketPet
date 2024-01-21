public class PetInteraction {
    private Pet userPet;
    private PetDrawings draw;

    public PetInteraction(Pet userPet, PetDrawings draw){
        this.userPet = userPet;
        this.draw = draw;
    }

    public void talk(){
        for (int i = 0; i < 10; i++) {
            draw.petFrame1();
            System.out.println("|-------------------------------------|");
            System.out.println(userPet.getAction());
            System.out.println("|-------------------------------------|");
            timedClearScreen(1500);
            draw.petFrame2();
            System.out.println("|-------------------------------------|");
            System.out.println(userPet.getAction());
            System.out.println("|-------------------------------------|");
            timedClearScreen(1500);
        }
    }

    public void feed() {
        for (int i = 0; i < 7; i++) {
            System.out.println("You feed " + userPet.getName() + " a treat.");
            draw.petEat();
            timedClearScreen(1000);
            System.out.println("You feed " + userPet.getName() + " a treat.");
            draw.petEat2();
            timedClearScreen(1000);
        }
        if (!(userPet.getHunger() == 5)){
            userPet.updateHunger(1);
        }
    }

    public void play(){
        System.out.println("");
    }

    public void petSleep(){
        for (int i = 0; i < 7; i++) {
            draw.petSleep();
            timedClearScreen(1500);
            draw.petSleep2();
        }
        if (!(userPet.getEnergy() == 5)){
            userPet.updateEnergy(1);
        }
    }

    private void timedClearScreen(int milliseconds){
        try {
            Thread.sleep(milliseconds);
        } catch (Exception e) {
            System.out.println("error");
        }
        System.out.print("\033\143");
        System.out.flush();
    }


}
