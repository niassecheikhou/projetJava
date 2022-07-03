package Service;

import Models.BoursierLoge;
import Models.BoursierNonLoge;
import Models.Chambre;
import Models.Etudiant;
import Models.NonBoursier;
import Models.Pavillon;

public interface IService {

  public void AddEtudiant(Etudiant etudiant);
  public void ListeEtudiant();
  public void SuprimerEtudiant(int id);

  public void AddPavillon(Pavillon pavillon);
  public void SuprimerPavillon(int id);
  public void listerPavillon();

  public void AddChambre(Chambre chambre);
  public void SuprimerChambre(int id);
  public void listerChambre();

  public void addBoursierLoge(BoursierLoge etudiant);
  public void listerBourssierLoge();
  public void suprimerBourssierLoge(int id);

  public void addBoursierNonLoge(BoursierNonLoge etudiant);
  public void listerBourssierNonLoge();
  public void suprimerBourssierNonLoge(int id);

  public void addNonBoursier(NonBoursier etudiant);
  public void listerNonBoursier();
  public void suprimerNonBoursier(int id);






  
    
}
