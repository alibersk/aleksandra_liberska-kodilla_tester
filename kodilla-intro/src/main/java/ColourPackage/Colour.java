package ColourPackage;

import java.util.Scanner;

public class Colour {

//    enum Colours {
//        R,
//        Y,
//        G,
//        W,
//        V,
//        //P,
//        B;
//    }

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

    public static String getSecondLetter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's the second letter?");
        String secondLetter = scanner.next().trim().toUpperCase();
        return secondLetter;
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
                case "B": return "blue";
                default: return "I don't know";
            }
        }
    }
}
