public class VAT {

    NewVAT newVAT = new NewVAT();

    double bruttoPrice(Product product) {
        return product.getNettoPrice() + product.getNettoPrice() *newVAT.VAT(product.getCategory());
    }

    void showInfo(Product product) {
        System.out.println("The netto price of " + product.getName() + " is: " + product.getNettoPrice());
        System.out.println("The brutto price of " + product.getName() + " is: " + bruttoPrice(product) + "\n");

    }


}
