public class Day {

    public static int numOfDays;
    private int currentDay;
    private String dayOverview;
    private String time;
    private Pet userPet;
    private boolean isDayOver;

    public Day(Pet userPet){
        numOfDays = 1;
        currentDay = 1;
        dayOverview = "";
        time = "8:00";
        this.userPet = userPet;
        isDayOver = false;
    }

    public String getTime(){
        return time;
    }

    public String getDayOverview(){
        return dayOverview;
    }

    public int getCurrentDay(){
        return currentDay;
    }

    public void updateDayOverview(int eventOption){
        if (eventOption == 1) {
            dayOverview += "You and " + userPet.getName() + " had good conversation \n";
        } else if (eventOption == 2) {
            dayOverview += "You fed " + userPet.getName() + " well \n";
        } else if (eventOption == 3) {
            dayOverview += "You had fun playing with " + userPet.getName() + "\n";
        } else {
            dayOverview += userPet.getName() + " had a nice slumber \n";
        }
    }


}
