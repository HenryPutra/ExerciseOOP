/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practice.oop;

import java.util.Scanner;

/**
 *
 * @author hp5cd
 */
public class DuckSimulator {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose a duck:");
            System.out.println("1. Mallard Duck");
            System.out.println("2. Rubber Duck");
            System.out.println("3. Decoy Duck");
            System.out.println("4. Model Duck");
            System.out.println("0. Exit");

            int choice = scanner.nextInt();

            if (choice == 0) {
                break; // Exit the loop if the user chooses 0
            }

            Duck selectedDuck = createDuck(choice);

            if (selectedDuck != null) {
                // Perform quack behavior
                selectedDuck.performQuack();

                // If it's a Model Duck, modify its fly behavior
                if (selectedDuck instanceof ModelDuck) {
                    selectedDuck.performFly();
                    selectedDuck.setFlyBehavior(new FlyRocketPowered());
                    selectedDuck.performFly();
                }
            } else {
                System.out.println("Invalid choice. Please choose a valid duck.");
            }
        }

        scanner.close();
    }

    private static Duck createDuck(int choice) {
        switch (choice) {
            case 1:
                return new MallardDuck();
            case 2:
                FlyBehavior cantFly = () -> System.out.println("I can't fly");
                QuackBehavior squeak = () -> System.out.println("Squeak");
                return new RubberDuck(cantFly, squeak);
            case 3:
                return new DecoyDuck();
            case 4:
                return new ModelDuck();
            default:
                return null;
        }
    }
    
}
