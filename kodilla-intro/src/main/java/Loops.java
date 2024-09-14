public class Loops {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 3, 7, 9};
        int result = arraySum(numbers);
        System.out.println(result);
        Circle c1 = new Circle(3, "c1");
        Circle c2 = new Circle(5, "c2");
        Circle c3 = new Circle(10, "c3");
        c1.display();
        c2.display();
        c3.display();
    }

    private static int arraySum(int[] numbers){
        int sumUp = 0;
        for (int i = 0; i < numbers.length; i++) {
            sumUp = sumUp + numbers[i];
        }
        return sumUp;
    }
}


class Circle {
    private int radius;
    private String name;

    public Circle(int radius, String name) {
        this.radius = radius;
        this.name = name;
    }

    public void display(){
        System.out.println(name + ": Radius: "+ radius);
    }
}