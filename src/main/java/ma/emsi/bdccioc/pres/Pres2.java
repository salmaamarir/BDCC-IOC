package ma.emsi.bdccioc.pres;

import ma.emsi.bdccioc.dao.IDao;
import ma.emsi.bdccioc.metier.IMetier;
import java.io.File;
import java.util.Scanner;

public class Pres2 {
    public static void main(String[] args) throws Exception {
        // Lecture du fichier de configuration
        Scanner scanner = new Scanner(new File("config.txt"));

        // Instanciation dynamique du DAO
        String daoClassName = scanner.nextLine();
        Class cDao = Class.forName(daoClassName);
        IDao d = (IDao) cDao.getDeclaredConstructor().newInstance();

        // Instanciation dynamique du Métier
        String metierClassName = scanner.nextLine();
        Class cMetier = Class.forName(metierClassName);
        // On récupère le constructeur qui prend un IDao en paramètre
        IMetier metier = (IMetier) cMetier.getConstructor(IDao.class).newInstance(d);

        // Affichage du résultat
        System.out.println("RES=" + metier.calcul());
    }
}