import java.util.ArrayList;
import java.util.Scanner;

/*
The Driver class is the entry point for the Grazioso Salvare Animal Rescue application.
It manages intake, reservation, and display of rescue animals.
*/
public class Driver {

    // ArrayList for storing Dog objects
    private static ArrayList<Dog> dogList = new ArrayList<Dog>();

    // ArrayList for storing Monkey objects
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();

    /*
    Main method: runs the menu loop and routes user input to the correct methods.
    */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String userChoice = "";

        // Add sample data for testing
        initializeDogList();
        initializeMonkeyList();

        // Menu loop
        while (!userChoice.equalsIgnoreCase("q")) {

            displayMenu();
            userChoice = scanner.nextLine();

            switch (userChoice) {

                case "1":
                    intakeNewDog(scanner);
                    break;

                case "2":
                    intakeNewMonkey(scanner);
                    break;

                case "3":
                    reserveAnimal(scanner);
                    break;

                case "4":
                    printAnimals("dog");
                    break;

                case "5":
                    printAnimals("monkey");
                    break;

                case "6":
                    printAnimals("available");
                    break;

                case "q":
                    System.out.println("Exiting application...");
                    break;

                default:
                    System.out.println("Invalid selection. Please try again.");
            }
        }

        scanner.close();
    }

    /*
    Displays the main system menu.
    */
    public static void displayMenu() {

        System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
    }

    /*
    Adds sample Dog objects to dogList for testing.
    */
    public static void initializeDogList() {

        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6",
                "05-12-2019", "United States", "intake", false, "United States");

        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2",
                "02-03-2020", "United States", "Phase I", false, "United States");

        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6",
                "12-12-2019", "Canada", "in service", true, "Canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }

    /*
    Adds sample Monkey objects to monkeyList for testing.
    */
    public static void initializeMonkeyList() {
        // Example for testing if needed
        // Monkey monkey1 = new Monkey("George", "Capuchin", "male", "5", "15",
        //        "03-03-2021", "Brazil", "intake", false, "Brazil",
        //        "12", "18", "24");
        // monkeyList.add(monkey1);
    }

    /*
    Handles intake of a new Dog.
    */
    public static void intakeNewDog(Scanner scanner) {

        System.out.println("What is the dog's name?");
        String name = scanner.nextLine();

        for (Dog dog : dogList) {
            if (dog.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return;
            }
        }

        System.out.println("Enter breed:");
        String breed = scanner.nextLine();

        System.out.println("Enter gender:");
        String gender = scanner.nextLine();

        System.out.println("Enter age:");
        String age = scanner.nextLine();

        System.out.println("Enter weight:");
        String weight = scanner.nextLine();

        System.out.println("Enter acquisition date:");
        String acquisitionDate = scanner.nextLine();

        System.out.println("Enter acquisition country:");
        String acquisitionCountry = scanner.nextLine();

        System.out.println("Enter training status:");
        String trainingStatus = scanner.nextLine();

        System.out.println("Enter service country:");
        String serviceCountry = scanner.nextLine();

        Dog newDog = new Dog(name, breed, gender, age, weight,
                acquisitionDate, acquisitionCountry, trainingStatus,
                false, serviceCountry);

        dogList.add(newDog);

        System.out.println("Dog successfully added to the system.");
    }

    /*
    Handles intake of a new Monkey.
    */
    public static void intakeNewMonkey(Scanner scanner) {

        System.out.println("What is the monkey's name?");
        String name = scanner.nextLine();

        for (Monkey monkey : monkeyList) {
            if (monkey.getName().equalsIgnoreCase(name)) {
                System.out.println("This monkey is already in our system.");
                return;
            }
        }

        System.out.println("Enter species (Capuchin, Guenon, Macaque, Marmoset, Squirrel monkey, Tamarin):");
        String species = scanner.nextLine();

        if (!(species.equalsIgnoreCase("Capuchin")
                || species.equalsIgnoreCase("Guenon")
                || species.equalsIgnoreCase("Macaque")
                || species.equalsIgnoreCase("Marmoset")
                || species.equalsIgnoreCase("Squirrel monkey")
                || species.equalsIgnoreCase("Tamarin"))) {

            System.out.println("Invalid species. Monkey not added.");
            return;
        }

        System.out.println("Enter gender:");
        String gender = scanner.nextLine();

        System.out.println("Enter age:");
        String age = scanner.nextLine();

        System.out.println("Enter weight:");
        String weight = scanner.nextLine();

        System.out.println("Enter acquisition date:");
        String acquisitionDate = scanner.nextLine();

        System.out.println("Enter acquisition country:");
        String acquisitionCountry = scanner.nextLine();

        System.out.println("Enter training status:");
        String trainingStatus = scanner.nextLine();

        System.out.println("Enter service country:");
        String serviceCountry = scanner.nextLine();

        System.out.println("Enter tail length:");
        String tailLength = scanner.nextLine();

        System.out.println("Enter height:");
        String height = scanner.nextLine();

        System.out.println("Enter body length:");
        String bodyLength = scanner.nextLine();

        Monkey monkey = new Monkey(name, species, gender, age, weight,
                acquisitionDate, acquisitionCountry, trainingStatus,
                false, serviceCountry, tailLength, height, bodyLength);

        monkeyList.add(monkey);

        System.out.println("Monkey successfully added to the system.");
    }

    /*
    Placeholder for reserving an animal.
    */
    public static void reserveAnimal(Scanner scanner) {
        System.out.println("The method reserveAnimal needs to be implemented");
    }

    /*
    Prints animals based on listType.
    */
    public static void printAnimals(String listType) {

        if (listType.equalsIgnoreCase("dog")) {

            System.out.println("\nAll Dogs:");

            for (Dog dog : dogList) {
                System.out.println(dog.getName() + " | "
                        + dog.getTrainingStatus() + " | "
                        + dog.getAcquisitionLocation() + " | Reserved: "
                        + dog.getReserved());
            }

        } else if (listType.equalsIgnoreCase("monkey")) {

            System.out.println("\nAll Monkeys:");

            for (Monkey monkey : monkeyList) {
                System.out.println(monkey.getName() + " | "
                        + monkey.getTrainingStatus() + " | "
                        + monkey.getAcquisitionLocation() + " | Reserved: "
                        + monkey.getReserved());
            }

        } else if (listType.equalsIgnoreCase("available")) {

            System.out.println("\nAvailable Dogs:");

            for (Dog dog : dogList) {
                if (dog.getTrainingStatus().equalsIgnoreCase("in service") && !dog.getReserved()) {

                    System.out.println(dog.getName() + " | "
                            + dog.getTrainingStatus() + " | "
                            + dog.getAcquisitionLocation() + " | Reserved: "
                            + dog.getReserved());
                }
            }

            System.out.println("\nAvailable Monkeys:");

            for (Monkey monkey : monkeyList) {
                if (monkey.getTrainingStatus().equalsIgnoreCase("in service") && !monkey.getReserved()) {

                    System.out.println(monkey.getName() + " | "
                            + monkey.getTrainingStatus() + " | "
                            + monkey.getAcquisitionLocation() + " | Reserved: "
                            + monkey.getReserved());
                }
            }

        } else {
            System.out.println("Invalid list type.");
        }
    }
}