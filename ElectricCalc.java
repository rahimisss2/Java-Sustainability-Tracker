import java.util.Scanner;

public class ElectricCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== ECO-ENERGY BILL ESTIMATOR ===");

        // Input 

        System.out.println("Enter The Power Of Hardware (Watt)");
        double Watt = input.nextDouble();

        System.out.println("Enter The Number Of Hour Used By Hardware ");
        double Hour = input.nextDouble();

        // Process (Formula Calculation)

        double kwhperMonth = (Watt * Hour * 30)/1000;
        double expectedBill = kwhperMonth * 0.218;

        // Output Results

        System.out.printf("Expected Monthly Energy Consumption: %.2f kWh\n", kwhperMonth);
        System.out.printf("Expected Monthly Electric Bill: $%.2f\n", expectedBill);

        // Warning Message/advice
        System.out.println("===========================================================");

        if (expectedBill > 50) {
            System.out.println("Warning : Your expected bill is high. Consider reducing usage or upgrading to energy-efficient hardware!");

        } else {

            System.out.println("Your expected bill is within a reasonable range!");
        }

        System.out.println("===========================================================");
        System.out.println("Thank you for using the ECO-ENERGY BILL ESTIMATOR!");

        input.close();
    }
}



