public class Wine extends Product{

    double zapreminaBoce;

    public Wine(String nazivProizvoda, String barKod, double osnovnaCena,double zapreminaBoce) {
        super(nazivProizvoda, barKod, osnovnaCena);
        this.zapreminaBoce = zapreminaBoce;
    }

    @Override
    public double racunanjePorezaVina(){
        return (osnovnaCena + (osnovnaCena*porez))+((osnovnaCena + ((osnovnaCena*porez)))) * dodatniPorez;

    }

    @Override
    public String toString() {
        return "Wine{" +
                "zapreminaBoce=" + zapreminaBoce +
                '}';
    }

    @Override
    public double racunanjePorezaCokolade(){
        return  osnovnaCena + (osnovnaCena*porez);
    }
}
