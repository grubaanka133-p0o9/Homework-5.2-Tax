public class Catalog {
    public static void main(String[] args) {
        VAT vat = new VAT();


        Product product1 = new Product("apple", "red", 5, "fruit");
        Product product2 = new Product("bike", "dirt", 2000, "vehicle");

        vat.showInfo(product1);
        vat.showInfo(product2);
    }


}
