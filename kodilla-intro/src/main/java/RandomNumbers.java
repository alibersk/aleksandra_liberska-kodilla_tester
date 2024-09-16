public class RandomNumbers {

    public static void main(String[] args) {
        sumRandomNumbers();

    }

    public static int getRandom() {
        int randomNum = (int) (Math.random() * 31);
        System.out.println(randomNum);
        return randomNum;
    }
    public static int sumRandomNumbers() {
        int sumRandoms = 0;
        for (int i = 0; i < 5000; i++) {
            while (sumRandoms <= 5000) {
                sumRandoms = getRandom() + sumRandoms;
            }
        }
        System.out.println("Suma: " + sumRandoms);
        return sumRandoms;
    }

}
//    public static int getMaxNumber() {
//        int maxNumber = (Math.max(5, 10));
//        System.out.println(Math.max(5, 10));
//        return maxNumber;
//    }
//    public static int getMinNumber(){
//        int minNumber = (Math.min(5, 10));
//        System.out.println(Math.min(5, 10));
//        return minNumber;
//    }

