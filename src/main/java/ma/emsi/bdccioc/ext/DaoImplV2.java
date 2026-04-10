// 1. Définition du package : ce fichier appartient à l'extension 'ext'
package ma.emsi.bdccioc.ext;

// 2. Importations :
// On importe l'interface IDao pour dire que cette classe respecte le contrat DAO
import ma.emsi.bdccioc.dao.IDao;
// On importe l'annotation Component de Spring pour la gestion automatique
import org.springframework.stereotype.Component;

/**
 * @Component("d2") :
 * Cette annotation dit à Spring : "Crée un objet (Bean) de cette classe au démarrage".
 * Le nom "d2" est un identifiant unique.
 * Si tu veux utiliser cette version au lieu de la V1, il suffira d'appeler "d2".
 */
@Component("d2")
public class DaoImplV2 implements IDao {

    /**
     * @Override :
     * Signifie que l'on redéfinit la méthode getData() qui a été déclarée dans l'interface IDao.
     */
    @Override
    public double getData() {
        // Simulation d'une nouvelle version (ex: récupération de données via des capteurs)
        System.out.println("Version capteurs ....");

        // On retourne une valeur (ici 12.0)
        double t = 12;
        return t;
    }
}