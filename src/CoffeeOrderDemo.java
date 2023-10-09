import java.util.Scanner;

public class CoffeeOrderDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Select a coffee type:");
            System.out.println("1. Espresso");
            System.out.println("2. Latte");
            System.out.println("Enter your choice (1/2):");

            int choice = scanner.nextInt();
            Coffee coffee;

            switch (choice) {
                case 1:
                    coffee = new Espresso();
                    break;
                case 2:
                    coffee = new Latte();
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
                    continue;
            }

            while (true) {
                System.out.println("Customize your coffee:");
                System.out.println("1. Add Milk");
                System.out.println("2. Add Sugar");
                System.out.println("3. Finish and place the order");
                System.out.println("Enter your choice (1/2/3):");

                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        coffee = new Milk(coffee);
                        break;
                    case 2:
                        coffee = new Sugar(coffee);
                        break;
                    case 3:
                        System.out.println("Your order: " + coffee.getDescription());
                        System.out.println("Total cost: $" + coffee.cost());
                        scanner.close();
                        return;
                    default:
                        System.out.println("Invalid choice. Try again.");
                }
            }
        }
    }
}
