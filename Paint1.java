import java.util.Scanner;

public class Paint1 {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        double wallHeight = 0.0;
        double wallWidth = 0.0;
        double wallArea = 0.0;
        double gallonsPaintNeeded = 0.0;

        final double squareFeetPerGallons = 350.0;

        // HEIGHT INPUT
        do {
            try {
                System.out.println("Enter wall height (feet): ");
                wallHeight = scnr.nextDouble();

                if (wallHeight <= 0) {
                    System.out.println("Height must be greater than 0.");
                }

            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number.");
                scnr.next(); // clear bad input
                wallHeight = 0;
            }

        } while (wallHeight <= 0);

        // WIDTH INPUT
        do {
            try {
                System.out.println("Enter wall width (feet): ");
                wallWidth = scnr.nextDouble(); // FIXED

                if (wallWidth <= 0) {
                    System.out.println("Width must be greater than 0.");
                }

            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number.");
                scnr.next();
                wallWidth = 0;
            }

        } while (wallWidth <= 0);

        // CALCULATE AREA
        wallArea = wallHeight * wallWidth;

        System.out.println("Wall area: " + wallArea + " square feet");

        // CALCULATE PAINT
        gallonsPaintNeeded = wallArea / squareFeetPerGallons;

        System.out.println("Paint needed: " + gallonsPaintNeeded + " gallons");
    }
}
