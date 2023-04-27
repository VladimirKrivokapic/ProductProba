public class Chocolate extends Product{

    protected double tezina;

    public Chocolate(String nazivProizvoda, String barKod, double osnovnaCena,double tezina) {
        super(nazivProizvoda, barKod, osnovnaCena);
        this.tezina = tezina;
    }

    @Override
    public double racunanjePorezaCokolade(){
        return  osnovnaCena + (osnovnaCena*porez);
    }

    @Override
    public double racunanjePorezaVina() {
        return (osnovnaCena + (osnovnaCena*porez))+((osnovnaCena + ((osnovnaCena*porez)))) * dodatniPorez;
    }

    @Override
    public String toString() {
        return "Chocolate{" +
                "tezina=" + tezina +
                '}';
    }


}

//[09:37] Vladimir Krivokapić
//        ```java
//
//public abstract class Product {
//    protected String name;
//    protected String barcode;
//    protected double basePrice;
//    protected final double tax = 0.2;
//
//    public Product(String name, String barcode, double basePrice) {
//        this.name = name;
//        this.barcode = barcode;
//        this.basePrice = basePrice;
//    }
//
//
//    public abstract double getPrice();
//
//
//    @Override
//
//    public String toString() {
//
//        return "Name: " + name + "\nBarcode: " + barcode + "\nBase price: " + basePrice;
//
//    }
//
//}
//
//
//public class Chocolate extends Product {
//
//    protected double weight;
//
//
//    public Chocolate(String name, String barcode, double basePrice, double weight) {
//
//        super(name, barcode, basePrice);
//
//        this.weight = weight;
//
//    }
//
//
//    @Override
//
//    public double getPrice() {
//
//        return basePrice * (1 + tax);
//
//    }
//
//
//    @Override
//
//    public String toString() {
//
//        return super.toString() + "\nWeight: " + weight;
//
//    }
//
//}
//
//
//public class Wine extends Product {
//
//    protected double bottleSize;
//
//    protected final double additionalTax = 0.1;
//
//
//    public Wine(String name, String barcode, double basePrice, double bottleSize) {
//
//        super(name, barcode, basePrice);
//
//        this.bottleSize = bottleSize;
//
//    }
//
//
//    @Override
//
//    public double getPrice() {
//
//        return (basePrice * (1 + tax) * (1 + additionalTax));
//
//    }
//
//
//    @Override
//
//    public String toString() {
//
//        return super.toString() + "\nBottle size: " + bottleSize;
//
//    }
//
//}



