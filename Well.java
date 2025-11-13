import java.util.Scanner;

public class Well {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hey there, please enter your name...");
        String name = input.next();
        System.out.println(name + " please enter your age:");
        int age = input.nextInt();
        System.out.println(
                name + " I would be needing more information before we continue the game.");
        System.out.println("-------------- please enter your birthday with the format DDMMYYY");
        int birthday = input.nextInt();
        System.out.println("Hey " + name
                + " What would you like to do today? You can play a game of Yatzy or Lucky draw. If you want to play Yatzy type '1' but if you want to play lucky draw type '2'");
        int game = input.nextInt();
        if (game == 1) {
            System.out.println("Alright" + name + "let's play a game of Yatzy... ");
            System.out.println("- - - - - Please hold on, I am creating the game environment - - - - - - ");
            System.out.println("Please choose a number for your dice within the range of 1 to 6:");
            int dice = input.nextInt();
            if (dice < 5) {
                System.out.println(name + "Sorry but no Yatzy!");
            } else {
                System.out.println("Yay, Yatzy (Congrats " + name + ") you won");
            }
        } else if (game == 2) {
            System.out.println("Okay, " + name + "let's play a game of lucky draw!");
            System.out.println(" - - - - Please be patient while I create the environment ----");
            System.out.println("-------------L-----O-------A------D-----------I---N--G---LOADING--");
            System.out.println("Please " + name + "type in a username for the game...");
            String username = input.next();
            System.out.println(name + " Your username for the game is " + username);
            System.out.println(
                    "In this game if you type in a particular number, you would either be admired");
            System.out.println("Please type in a text below to show you understood what I said:");
            String word = input.next();
            System.out.println("Alright then, over to the game");
            System.out.println("Sorry " + name
                    + " an error occured while parasing the package. You can type '10' below for me to reload the game, if not type 12.");
            int retry = input.nextInt();
            if (retry == 10) {
                System.out.println("Alright, let me try again.");
                System.out.println("Luckily, the game's problem have been sorted out.");
                System.out.println("Hey, " + username + " choose a number from 1 to 6");
                int numb = input.nextInt();
                if (numb == 1) {
                    System.out.println(username + " you are smart!");
                } else if (numb == 2) {
                    System.out.println(username + " you are very wise!");
                } else if (numb == 3) {
                    System.out.println("You are not intelligent!");
                } else if (numb == 4) {
                    System.out
                            .println(username + " I have to give it to you, you are more intelligent than I thought!");
                } else if (numb == 5) {
                    System.out.println(username + " you are the best!");
                } else if (numb == 6) {
                    System.out.println(username + " you are handsome/ beautiful!");
                } else {
                    System.out.println("ERROR 1039: The number you typed cannot be accepted...");
                }
            } else if (retry == 12) {
                System.out.println("Okay " + name + ", goodbye. See you later.");
            } else {
                System.out.println(" ERROR CODE 1039: The number you entered was not accepted");
            }
        }
        input.close();
    }
}