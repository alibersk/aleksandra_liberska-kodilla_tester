package ColourPackage;

import java.util.Scanner;

public class Colour {

    public static String getLetter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's the first letter?");
        String letter = scanner.next().trim().toUpperCase();
        return letter;
    }

    public static String guessP(){
        String secondLetter = Colour.getSecondLetter();
        while (true) {
            switch (secondLetter) {
                case "I": return "pink";
                case "U": return "purple";
                default: return "I don't know";
            }
        }
    }

    public static String guessB(){
        String secondLetter = Colour.getSecondLetter();
        while (true) {
            switch (secondLetter) {
                case "R": return "brown";
                case "L": return Colour.guessBL();
                default: return "I don't know";
            }
        }
    }

    public static String guessBL(){
        String thirdLetter = Colour.getThirdLetter();
        while (true) {
            switch (thirdLetter) {
                case "A": return "black";
                case "U": return "blue";
                default: return "I don't know";
            }
        }
    }

    public static String getSecondLetter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's the second letter?");
        String secondLetter = scanner.next().trim().toUpperCase();
        return secondLetter;
    }

    public static String getThirdLetter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's the third letter?");
        String thirdLetter = scanner.next().trim().toUpperCase();
        return thirdLetter;
    }

    public static String guessColour(){
        String letter = Colour.getLetter();
        while (true) {
            switch (letter) {
                case "R": return "red";
                case "Y": return "yellow";
                case "G": return "green";
                case "W": return "white";
                case "V": return "violet";
                case "P": return Colour.guessP();
                case "B": return Colour.guessB();
                default: return "I don't know";
            }
        }
    }
}
