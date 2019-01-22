public class Product {

    private String nameAtStart;
    private double priceAtStart;
    private int amountAtStrart;

    public Product(String nameAtStart, double priceAtStart, int amountAtStrart){
        this.nameAtStart = nameAtStart;
        this.priceAtStart = priceAtStart;
        this.amountAtStrart = amountAtStrart;
    }

    public void printProduct(){
        System.out.println(nameAtStart + ", price " + priceAtStart + ", amount " + amountAtStrart);
    }
}
