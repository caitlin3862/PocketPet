public class PetUX {
    private int option;
    private Day day;
    private Pet userPet;

    public PetUX(Day d, Pet userPet){
        option = 0;
        this.day = d;
        this.userPet = userPet;
    }

    public void welcome(){
        System.out.println("Good morning! Are you ready to meet your pocket pet?");

    }

    public void start(){
        while (option != 5) {
            printStats();
            petFrame1();
            menu();
            timedClearScreen();
            printStats();
            petFrame2();
            menu();
            timedClearScreen();
        }
    }

    public void printStats() {
        System.out.println("Happiness: " + userPet.getHappiness());
        System.out.println("Hunger: " + userPet.getHunger());
        System.out.println("Tiredness: " + userPet.getTiredness());
    }

    public void petFrame1(){
        System.out.println("              __________                ");
        System.out.println("            /            \\              ");
        System.out.println("           |   .      .   |             ");
        System.out.println("           |     ----     |             ");
        System.out.println("           |              |             ");
    }

    public void petFrame2(){
        System.out.println("              __________                ");
        System.out.println("            /            \\              ");
        System.out.println("           |   _      _   |             ");
        System.out.println("           |     ----     |             ");
    }

    public void menu(){
        System.out.println("|-------------------------------------|");
        System.out.println("| 1. Talk ");
        System.out.println("| 2. Feed ");
        System.out.println("| 3. Play ");
        System.out.println("| 4. Sleep ");
        System.out.println("| 5. Exit Game");
        System.out.println("|-------------------------------------|");
    }

    private void timedClearScreen(){
        try {
            Thread.sleep(2000);  // 2000 milliseconds, or 2 seconds
        } catch (Exception e) {
            System.out.println("error");
        }
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}
