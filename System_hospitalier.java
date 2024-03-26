package tp_git;

import java.util.ArrayList;
import java.util.List;

public class System_hospitalier {

    private List<Requête> listRequetes;

    public System_hospitalier(List<Requête> listRequetes) {
        super();
        this.listRequetes = listRequetes;
    }

    public System_hospitalier() {
        super();
        listRequetes = new ArrayList<>();
    }

    public List<Requête> getListRequetes() {
        return listRequetes;
    }

    public void setListRequetes(List<Requête> listRequetes) {
        this.listRequetes = listRequetes;
    }

    public void recevoirRequete(Requête requete) {
        listRequetes.add(requete);
        String analyse =  analyserRequete(requete);
        String comparaisonDonnees = comparerDonnes();
        System.out.println(analyse);
        System.out.println(comparaisonDonnees);
    }
/* analyser Requete analyse une requete d'un centre hospitalier et retourne la requete analyser sus la forme d'une chaine de caractere */
    private String analyserRequete(Requête requête) {
        
        return "requête analysée";
    }
/* comparerDonnes compare des données dans le systeme je pense que si il y a des données qui sont pareil cela retourne Cluster trouvé */:

    private String comparerDonnes() {
        
        return "Cluster trouvé";
    }

}
