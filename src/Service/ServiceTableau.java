package Service;

import Models.Chambre;
import Models.Etudiant;
import Models.Pavillon;
import Models.BoursierLoge;
import Models.BoursierNonLoge;
import Models.NonBoursier;

public class ServiceTableau implements IService{

    

private final int TAILLE= 10;
private Pavillon[] tabPavillon =new Pavillon[TAILLE];
private Chambre[] tabChambre =new Chambre[TAILLE];
private Etudiant[] tabEtudiant =new Etudiant[TAILLE];
private BoursierLoge[] tabBousierLoge =new BoursierLoge[TAILLE];
private BoursierNonLoge[] tabBousierNonLoge= new BoursierNonLoge[TAILLE];
private NonBoursier[] tabNonBoursier= new NonBoursier[TAILLE];



private int indexChambre;
private int indexEtudiant;
private int indexPavillon;
private int indexBoursierLoge;
private int indexBoursierNonLoge;
private int indexNonBoursier;

    @Override
    public void AddEtudiant(Etudiant etudiant) {
        if (indexEtudiant<TAILLE) {
            tabEtudiant[indexEtudiant]=etudiant;
            indexEtudiant++;
        }
       
    ;
    }

    @Override
    public void ListeEtudiant() {
        for (Etudiant etudiant : tabEtudiant) {
            System.out.println(etudiant);
        }
        
    }

    

    @Override
    public void SuprimerEtudiant(int id) {
        // TODO
    }

    @Override
    public void AddPavillon(Pavillon pavillon) {
        if (indexPavillon<TAILLE) {
            tabPavillon[indexPavillon]=pavillon;
            indexPavillon++;
        }
    }

    @Override
    public void SuprimerPavillon(int id) {
        // TODO
    }

    @Override
    public void listerPavillon() {
        // TODO
        for (Pavillon pavillon : tabPavillon) {
            System.out.println(pavillon);
        }
    }

    @Override
    public void AddChambre(Chambre chambre) {
        // TODO
        if (indexChambre<TAILLE) {
            tabChambre[indexChambre]=chambre;
            indexChambre++;
        }
    }

    @Override
    public void SuprimerChambre(int id) {
        // TODO
    }

    @Override
    public void listerChambre() {
        // TODO
        for (Chambre chambre : tabChambre) {
            if (chambre != null) {
            
                System.out.println(chambre);
            }
        }
    }

    @Override
    public void addBoursierLoge(BoursierLoge boursierLoge) {
        // TODO
        if (indexBoursierLoge<TAILLE) {
            tabBousierLoge[indexBoursierLoge]=boursierLoge;
            indexBoursierLoge++;
        }
    }

    @Override
    public void listerBourssierLoge() {
        // TODO
        for (BoursierLoge boursierLoge : tabBousierLoge) {
            if ( boursierLoge != null) {
            
                System.out.println( boursierLoge);
            }
        }
    }

    @Override
    public void suprimerBourssierLoge(int id) {
        // TODO

    }

    @Override
    public void addBoursierNonLoge(BoursierNonLoge boursierNonLoge) {
        // TODO Auto-generated method stub
        if (indexBoursierNonLoge<TAILLE) {
            tabBousierNonLoge[indexBoursierNonLoge]=boursierNonLoge;
            indexBoursierNonLoge++;
        }
        
    }

    @Override
    public void listerBourssierNonLoge() {
        // TODO Auto-generated method stub
        for (BoursierNonLoge boursierNonLoge : tabBousierNonLoge) {
            if ( boursierNonLoge != null) {
            
                System.out.println( boursierNonLoge);
            }
        }
        
    }

    @Override
    public void suprimerBourssierNonLoge(int id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void addNonBoursier(NonBoursier nonBousier) {
        // TODO
        if (indexNonBoursier<TAILLE) {
            tabNonBoursier[indexNonBoursier]=nonBousier;
            indexNonBoursier++;
        }
    }

    @Override
    public void listerNonBoursier() {
        // TODO
        for (NonBoursier nonBoursier: tabNonBoursier) {
            if ( nonBoursier != null) {
            
                System.out.println(nonBoursier);
            }
        }
    }

    @Override
    public void suprimerNonBoursier(int id) {
        // TODO
    }
}
