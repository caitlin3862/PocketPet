public class Day {

    public static int numOfDays;
    private String dayOverview;
    private String time;
    private Pet userPet;
    private boolean isDayOver;

    public Day(Pet userPet){
        numOfDays = 1;
        dayOverview = "";
        time = "8:00";
        this.userPet = userPet;
        isDayOver = false;
    }

    public static int getNumOfDays(){
        return  numOfDays;
    }


    public String getTime(){
        return time;
    }

    public String getDayOverview(){
        return dayOverview;
    }


    public boolean getIsDayOver(){
        return isDayOver;
    }

    public void finishDay(){
        isDayOver = true;
        numOfDays++;
    }

    public void updateDayOverview(int eventOption){
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
