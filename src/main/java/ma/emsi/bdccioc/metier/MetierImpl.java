package ma.emsi.bdccioc.metier;
import ma.emsi.bdccioc.dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImpl implements IMetier {

    @Autowired
    @Qualifier("dao")
    private IDao dao; // Couplage faible

    public MetierImpl() {}

    // Injection via constructeur
    public MetierImpl(@Qualifier("d2") IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        double t = dao.getData();
        double res = t * 12 * Math.PI / 2 * Math.cos(t);
        return res;
    }

    // Injection via setter
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}