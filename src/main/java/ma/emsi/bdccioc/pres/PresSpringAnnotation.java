package ma.emsi.bdccioc.pres;
import ma.emsi.bdccioc.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresSpringAnnotation {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext("ma.emsi.bdccioc");

        IMetier metier = applicationContext.getBean(IMetier.class);

        System.out.println("RES=" + metier.calcul());
    }
}