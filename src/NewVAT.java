public class NewVAT {
    double VAT(String category){
        switch (category){
            case "Fruits": return 0.23;
            case "Vehicle": return 0.8;
            default: return 0.43;
        }
    }
}
