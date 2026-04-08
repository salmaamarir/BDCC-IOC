package ma.emsi.bdccioc.pres;

import ma.emsi.bdccioc.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PreSpringXML {
    public static void main(String[] args) {
        // Chargement du contexte Spring via le fichier XML
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        // Récupération du bean "metier"
        IMetier metier = (IMetier) context.getBean("metier");

        // Affichage du résultat
        System.out.println("RES XML = " + metier.calcul());
    }
}