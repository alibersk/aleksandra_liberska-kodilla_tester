public class User {
    String name;
    int age;

    public User(String name, int age){
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        User userA = new User("Ala", 25);
        User userB = new User("Bruno", 97);
        User userC = new User("Cezary", 55);
        User userD = new User("Donek", 60);
        User userE = new User("Ewa", 1);
        User userF = new User("Filip", 12);
        User userG = new User("Gabi", 41);

        User usersArr[] = {userA, userB, userC, userD, userE, userF, userG};

        int userTotalAge = 0;
        for (int i = 0; i < usersArr.length; i++) {
            userTotalAge = userTotalAge + usersArr[i].age;
        }

        double averageAge = (double) userTotalAge / usersArr.length;
        System.out.println("Average age: " + averageAge);
        System.out.println("Users younger than average: ");

        for (int j = 0; j < usersArr.length; j++){
            if (usersArr[j].age < averageAge){
                System.out.println(usersArr[j].name);
            }
        }
    }
}

