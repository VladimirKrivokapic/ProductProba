public class Main {

    public static void main(String[] args) {

        Product chocolate = new Chocolate("Cokolada", "123123123-4124124124124", 200,100);
        System.out.println("Cena cokolade sa PDV-om iznosi : " + chocolate.racunanjePorezaCokolade());

        Product wine = new Wine("Vino","123123125-1241241240",300,10);
        System.out.println("Cena vina sa PDV + dodatnim porezom iznosi : " + wine.racunanjePorezaVina());




    }
}
