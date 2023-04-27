public abstract class Product {
//
//    U programskom jeziku JAVA napisati uraditi sledece : 
//
//    Potrebno je napraviti klasu Product koja ce predstavljati osnovu za dalje nasledjivanje i nece se moci instancirati. Ovu klasu nasledjuju dve klase koje predstavljaju dve grupe proizvoda : Chocolate i Wine. Svaki proizvod poseduje osobine: 1) naziv proizvoda 2) bar-kod 3) osnovnu cenu 4) porez.
//
//    Svaki proizvod poseduje metodu za racunanje cene koja se izracunava kada se osnovna cena uveca za iznos poreza. Porez za svaki proizvod je 20% i ovo je podatak koji je konstantan i nece se menjati. Proizvodi iz grupe vina imaju dodatan porez 10% od cene vec uvecane za iznos PDV-a koji je takodje konstantan podatak.
//
//    Zbog toga je potrebno redefinisati metodu za racunanje cene u okviru klase Wine. Klasa Wine treba da poseduje atribut koji definise zapreminu boce a klase Chocolate atribut koji definise tezinu. 
//
//    U klasama Chocolate i Wine potrebno je napraviti parametrizovane konstruktore za kreiranje objekta. Potrebno je takode u klasama redenisati metodu to String za prikaz informacija o objektu. 


    protected String nazivProizvoda;
    protected String barKod;
    protected double osnovnaCena;
    final double porez = 0.2;
    final double dodatniPorez = 0.1;

    public Product(String nazivProizvoda, String barKod, double osnovnaCena) {
        this.nazivProizvoda = nazivProizvoda;
        this.barKod = barKod;
        this.osnovnaCena = osnovnaCena;
    }


    public abstract double racunanjePorezaVina();

    @Override
    public String toString() {
        return "Product{" +
                "nazivProizvoda='" + nazivProizvoda + '\'' +
                ", barKod='" + barKod + '\'' +
                ", osnovnaCena=" + osnovnaCena +
                ", porez=" + porez +
                ", dodatniPorez=" + dodatniPorez +
                '}';

    }

    public abstract double racunanjePorezaCokolade();
}


