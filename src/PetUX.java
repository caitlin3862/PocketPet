import java.util.Scanner;

public class PetUX {
    private final Scanner scan;
    private boolean gameOver;

    public PetUX(){
        scan = new Scanner(System.in);
        gameOver = false;
    }

    public void welcome(){
        System.out.println("Good morning! Are you ready to meet your pocket pet? (y/n)");
        String ready = scan.nextLine();
        if (ready.equals("y")){
            System.out.println("Great! Let's go to your new place");
            timedClearScreen(2000);
            loadingScreen();
            timedClearScreen(2000);
            System.out.println("Okay, before we go inside I have to talk to you about a few things about your pet.");
            sleep(4000);
            System.out.println("You will be taking care of your pet for a week!");
            sleep(2000);
            System.out.println("Your pet, like any other pet, has certain needs that should be met!");
            sleep(2000);
            System.out.println("Your pet's happiness, hunger, and tiredness will change throughout the day. So make sure you're taking proper care of your pet!");
            sleep(4000);
            System.out.println("Okay! That's it for now. Let's head inside!");
            sleep(2000);
        } else {
            System.out.println("Start again when you're ready!");
        }
    }

    public void start(){
        System.out.println("Oh! One more thing! What would you like to name your pet? ");
        String name = scan.nextLine();
        Pet userPet = new Pet(name);
        System.out.println("What a lovely name! Now... Let's go meet your pet!");
        sleep(2000);
        while (!gameOver) {
            userPet.printStats();
            userPet.petFrame1();
            menu();
            System.out.println("What would you like to do: ");
            int option = scan.nextInt();
            if (option == 1) {
                System.out.println("hi");
            } else if (option == 2) {
                System.out.println("hi");
            } else if (option == 3) {
                System.out.println("hi");
            } else if (option == 4) {
                System.out.println("hi");
            } else {
                gameOver = true;
            }
        }
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

    public void loadingScreen(){
        for (int i = 0; i < 3; i++) {
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("-------------------------------------------");
            timedClearScreen(300);
            System.out.println();
            System.out.println();
            System.out.println("__");
            System.out.println(" [\\_");
            System.out.println("()__|");
            System.out.println("-------------------------------------------");
            timedClearScreen(300);
            System.out.println();
            System.out.println();
            System.out.println("      _____");
            System.out.println("_  __/ [__][\\_");
            System.out.println("_  |_()___()__|");
            System.out.println("-------------------------------------------");
            timedClearScreen(300);
            System.out.println();
            System.out.println();
            System.out.println("              _____");
            System.out.println("    ____   __/ [__][\\_");
            System.out.println("    ____   |_()___()__|");
            System.out.println("-------------------------------------------");
            timedClearScreen(300);
            System.out.println();
            System.out.println();
            System.out.println("                         _____");
            System.out.println("               ____   __/ [__][\\_");
            System.out.println("               ____   |_()___()__|");
            System.out.println("-------------------------------------------");
            timedClearScreen(300);
            System.out.println();
            System.out.println();
            System.out.println("                                     _____");
            System.out.println("                           ____   __/ [__][");
            System.out.println("                           ____   |_()___()_");
            System.out.println("-------------------------------------------");
            timedClearScreen(300);
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("-------------------------------------------");
            timedClearScreen(300);
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

    private void sleep(int milliseconds){
        try {
            Thread.sleep(milliseconds);
        } catch (Exception e) {
            System.out.println("error");
        }
    }

}