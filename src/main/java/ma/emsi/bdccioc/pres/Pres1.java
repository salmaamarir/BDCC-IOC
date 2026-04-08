package ma.emsi.bdccioc.pres;
import ma.emsi.bdccioc.ext.DaoImplV2;
import ma.emsi.bdccioc.metier.MetierImpl;

public class Pres1 {
    public static void main(String[] args) {
        MetierImpl metier = new MetierImpl();
        // Note: Provoquera une NullPointerException si setDao n'est pas appelé
        System.out.println("RES= " + metier.calcul());
    }
}