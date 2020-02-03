public class VAT {


    double bruttoPrice(Product product) {
        return product.getNettoPrice() + product.getNettoPrice() * VAT(product.getCategory());
    }

    void showInfo(Product product) {
        System.out.println("The netto price of " + product.getName() + " is: " + product.getNettoPrice());
        System.out.println("The brutto price of " + product.getName() + " is: " + bruttoPrice(product) + "\n");

    }

    double VAT(String category) {
        switch (category) {
            case "Fruits":
                return 0.23;
            case "Vehicle":
                return 0.8;
            default:
                return 0.23;
        }
    }


}
