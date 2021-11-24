package day2;

public class Car {

    //States
    String seatBeltWarning;
    float gasLevelIndicator;
    int speedMilesPerHours;
    short numberOfSeat;

    //Behaviour
    void messageDisplay(){}
    void fuelLevelInGallon(){}
    void showSpeed(){}
    void numberOfSeat(){}


    public static void main(String[] args) {
        Car Car1 = new Car();
        Car Car2 = new Car ();

        Car1.seatBeltWarning = "Fasten your seatbelt!";
        Car1.gasLevelIndicator = 11 ;
        Car1.speedMilesPerHours = 30;
        Car1.numberOfSeat = 4;


        Car2.seatBeltWarning = "Fasten your seatbelt!";
        Car2.gasLevelIndicator = 13 ;
        Car2.speedMilesPerHours = 50;
        Car2.numberOfSeat = 5;


    }



}
