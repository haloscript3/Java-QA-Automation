package HW;

public class TemperatureCheck {
    //	Create a Java program and name it TemperatureCheck.
//	Create a variable to store temperature.
//	Your program should check if the temperature is below 32
//	If the temperature is below 32
//	    then it should print "Water will freeze with temperature __",
//	    otherwise should print "Water will NOT freeze with temperature __".
    public static void main(String[] args) {

        double temperature = 15; // widening: int --> double

//		if (expressions) {
//			// this runs if the expression is TRUE
//		} else {
//			// this runs if the expression is NOT TRUE
//		}

        if (temperature < 32) {
            System.out.println("Water will freeze at temperature " + temperature);
        } else {
            System.out.println("Water will NOT freeze at temperature " + temperature);
        }

    }

}
