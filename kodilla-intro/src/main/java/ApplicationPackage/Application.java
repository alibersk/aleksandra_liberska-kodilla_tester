package ApplicationPackage;

public class Application {
        public static void main(String[] args) {
            User userA = new User("Adam", 40.5, 178);
            System.out.println(userA.name + " " + userA.age + " " + userA.height);
            userA.userCheck();

            User userB = new User("Barney", 16, 176);
            System.out.println(userB.name + " " + userB.age + " " + userB.height);
            userB.userCheck();

            User userC = new User("Charlie", 13, 158);
            System.out.println(userC.name + " " + userC.age + " " + userC.height);
            userC.userCheck();

            User userD = new User("Daniel", 66.5, 159.5);
            System.out.println(userD.name + " " + userD.age + " " + userD.height);
            userD.userCheck();
        }
}


