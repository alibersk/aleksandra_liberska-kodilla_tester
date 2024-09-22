package ColourPackage;

public class ColourApplication {
    public static void main(String[] args) {
        Colour colour = new Colour();
        String answer = Colour.guessColour();
        System.out.println("Colour: " + answer);
    }
}
