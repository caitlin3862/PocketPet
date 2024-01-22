public class Day {

    public static int numOfDays = 0;
    private String dayOverview;
    private Pet userPet;
    private boolean isDayOver;

    public Day(Pet userPet){
        numOfDays++;
        dayOverview = "";
        this.userPet = userPet;
        isDayOver = false;
    }

    public static int getNumOfDays(){
        return  numOfDays;
    }

    public void finishDay(){
        isDayOver = true;
    }

    public void printDayOverview(){
        PetUX.timedClearScreen(1000);
        System.out.println("|-------------------------------------|");
        System.out.println("Day " + numOfDays + ":");
        System.out.println(dayOverview);
        System.out.println("|-------------------------------------|");
    }

    public void updateDayOverview(int eventOption){
        // takes the user option and adds to the corresponding yummy
        if (eventOption == 1) {
            dayOverview += "You and " + userPet.getName() + " made good conversation \n";
        } else if (eventOption == 2) {
            dayOverview += "You fed " + userPet.getName() + " well \n";
        } else if (eventOption == 3) {
            dayOverview += "You had fun playing with " + userPet.getName() + "\n";
        } else {
            dayOverview += userPet.getName() + " had a nice slumber \n";
        }
    }



}
