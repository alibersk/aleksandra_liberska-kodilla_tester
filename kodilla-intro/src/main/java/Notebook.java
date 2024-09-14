public class Notebook {
    int weight;
    int price;
    int year;
    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }
    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if (this.price > 600 && this.price < 1000) {
            System.out.println("The price is good.");
        } else {
            System.out.println("This notebook is quite expensive.");
        }
    }
    public void notebookRank() {
        if (this.year < 2020 && this.price > 400 ) {
            System.out.println("It's not the fair deal");
        }
        else if (this.year < 2020 && this.price <= 200){
            System.out.println("Old stuff on sale!!!");
        }
        else if (this.year >= 2020 && this.price > 2000){
            System.out.println("Think twice before buying");
        }
        else {
            System.out.println("Good enough");
        }
    }
}