public class SimpleArray {
        public static void main(String[] args) {
            String[] flowers = new String[6];
            flowers[0] = "tulip";
            flowers[1] = "rose";
            flowers[2] = "daisy";
            flowers[3] = "carnation";
            flowers[4] = "violet";
            flowers[5] = "daffodil";

            String favouriteFlower = flowers[3];
            System.out.println(favouriteFlower);

            int numberOfElements = flowers.length;
            System.out.println("My array contains " + numberOfElements + " elements");
        }
}

