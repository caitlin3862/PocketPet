import java.util.Scanner;

public class PetUX {
    private final Scanner scan;
    private boolean gameOver;

    public PetUX(){
        scan = new Scanner(System.in);
        gameOver = false;
    }

    public void welcome(){
        // introduction and tells the user about how to care for their pet
        System.out.print("Good morning! Are you ready to meet your pocket pet? (y/n): " + ConsoleUtility.CYAN);
        String ready = scan.nextLine();
        if (ready.equals("y")){
            System.out.println(ConsoleUtility.RESET + "Great! Let's go to your new place");
            timedClearScreen(2000);
            loadingScreen();
            timedClearScreen(1500);
            System.out.println("Okay, before we go inside I have to talk to you about a few things about your pet.");
            sleep(4000);
            System.out.println("You will be taking care of your pet for" + ConsoleUtility.PURPLE + " a week!" + ConsoleUtility.RESET);
            sleep(2000);
            System.out.println("Your pet, like any other pet, has certain needs that should be met!");
            sleep(2000);
            System.out.println("Your pet's" + ConsoleUtility.PINK + " happiness" + ConsoleUtility.RESET + "," + ConsoleUtility.RED + " hunger" + ConsoleUtility.RESET + ", and "+ ConsoleUtility.YELLOW + "tiredness" + ConsoleUtility.RESET + " will change throughout the day. So make sure you're taking proper care of your pet!");
            sleep(4000);
            System.out.println("Okay! That's it for now. Let's head inside!");
            sleep(1000);
            timedClearScreen(1000);
        } else {
            System.out.println("Start again when you're ready!");
        }
    }

    public void start(){
        System.out.print("Oh! One more thing! What would you like to name your pet? \nEnter a name: " + ConsoleUtility.CYAN);
        String name = scan.nextLine();
        Pet userPet = new Pet(name); // creates new pet
        PetDrawings draw = new PetDrawings(); // sets the drawings for the pets
        PetInteraction interact = new PetInteraction(userPet, draw); // interactions for pet
        System.out.println(ConsoleUtility.RESET + "What a lovely name! Now... Let's go meet your pet!");
        timedClearScreen(2000);
        Day day1 = new Day(userPet); // starts a new day
        while (!gameOver && Day.getNumOfDays() <= 7) { // game will continue until the game is over or the user reaches 7 days
            userPet.printStats();
            System.out.println("Day " + Day.getNumOfDays());
            draw.petFrame1();
            menu();
            System.out.println("What would you like to do: " + ConsoleUtility.CYAN);
            int option = scan.nextInt();
            if (option == 1) {
                timedClearScreen(100);
                interact.talk();
                day1.updateDayOverview(option);
                timedClearScreen(100);
            } else if (option == 2) {
                timedClearScreen(100);
                interact.feed();
                day1.updateDayOverview(option);
                timedClearScreen(100);
            } else if (option == 3) {
                timedClearScreen(100);
                interact.play();
                day1.updateDayOverview(option);
                timedClearScreen(100);
            } else if (option == 4) {
                timedClearScreen(100);
                interact.petSleep();
                day1.updateDayOverview(option);
                day1.finishDay(); // ends the current day
                day1.printDayOverview();
                day1 = new Day(userPet); // starts a new day;
            } else {
                gameOver = true;
            }
        }
        System.out.println("Thank you for playing!");
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
        }
    }

    public static void sleep(int milliseconds){
        try {
            Thread.sleep(milliseconds);
        } catch (Exception e) {
            System.out.println("error");
        }
    }

    public static void timedClearScreen(int milliseconds){
        try {
            Thread.sleep(milliseconds);
        } catch (Exception e) {
            System.out.println("error");
        }
        System.out.print("\033\143"); // Found another clear screen code because for some reason the other line of code did not work
        System.out.flush();
    }

}