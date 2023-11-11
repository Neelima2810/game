import java.util.Scanner;

public class TextBasedAdventure {

    public static void main(String[] args) {
        System.out.println("Welcome to the Text-Based Adventure Game!");
        System.out.println("You find yourself in a dark room. There are two doors. One is blue and the other is red.");
        System.out.println("Choose a door to enter (Type B for Blue or R for Red): ");

        Scanner input = new Scanner(System.in);
        String door = input.nextLine();

        if (door.equalsIgnoreCase("B")) {
            System.out.println("You enter the blue door and find a treasure chest!");
            System.out.println("Inside the chest, you find a powerful magic wand.");
            System.out.println("Congratulations! You've won the game.");
        } else if (door.equalsIgnoreCase("R")) {
            System.out.println("You enter the red door and find a room full of fire!");
            System.out.println("Unfortunately, you have been burned to death.");
            System.out.println("Better luck next time!");
        } else {
            System.out.println("Invalid choice. Please enter either B or R.");
        }
    }
}