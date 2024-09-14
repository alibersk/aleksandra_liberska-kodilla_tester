public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600, 1540, 2023);
        System.out.println("weight: " + notebook.weight + " price: " + notebook.price + " year: " + notebook.year);
        notebook.checkPrice();
        notebook.notebookRank();
        System.out.println("*****");

        Notebook heavyNotebook = new Notebook(1200, 630, 2022);
        System.out.println("weight: " + heavyNotebook.weight + " price: " + heavyNotebook.price + " year: " + heavyNotebook.year);
        heavyNotebook.checkPrice();
        heavyNotebook.notebookRank();
        System.out.println("*****");

        Notebook oldNotebook = new Notebook(1600, 500, 2019);
        System.out.println("weight: " + oldNotebook.weight + " price: " + oldNotebook.price + " year: " + oldNotebook.year);
        oldNotebook.checkPrice();
        oldNotebook.notebookRank();
        System.out.println("*****");

        Notebook veryOldNotebook = new Notebook(1500, 180, 2016);
        System.out.println("weight: " + veryOldNotebook.weight + " price: " + veryOldNotebook.price + " year: " + veryOldNotebook.year);
        veryOldNotebook.checkPrice();
        veryOldNotebook.notebookRank();
        System.out.println("*****");

        Notebook brandNewNotebook = new Notebook(740, 2125, 2024);
        System.out.println("weight: " + brandNewNotebook.weight + " price: " + brandNewNotebook.price + " year: " + brandNewNotebook.year);
        brandNewNotebook.checkPrice();
        brandNewNotebook.notebookRank();
        System.out.println("*****");

        Notebook lightNotebook = new Notebook(400, 710, 2023);
        System.out.println("weight: " + lightNotebook.weight + " price: " + lightNotebook.price + " year: " + lightNotebook.year);
        lightNotebook.checkPrice();
        lightNotebook.notebookRank();
    }
}