package Models;

public class Etudiant {
    //Les variables d'instance 
   protected int id; 
   protected String nom;
  protected String prenom;
  protected String email;
  protected String matricule;
   protected String telephone;
   protected String role;
   
public Etudiant(int id, String nom, String prenom, String email, String matricule, String telephone, String role) {
    this.id = id;
    this.nom = nom;
    this.prenom = prenom;
    this.email = email;
    this.matricule = matricule;
    this.telephone = telephone;
    this.role = role;
}


public int getId() {
    return id;
}

public void setId(int id) {
    this.id = id;
}

public String getNom() {
    return nom;
}

public void setNom(String nom) {
    this.nom = nom;
}

public String getPrenom() {
    return prenom;
}

public void setPrenom(String prenom) {
    this.prenom = prenom;
}

public String getEmail() {
    return email;
}

public void setEmail(String email) {
    this.email = email;
}

public String getMatricule() {
    return matricule;
}

public void setMatricule(String matricule) {
    this.matricule = matricule;
}

public String getTelephone() {
    return telephone;
}

public void setTelephone(String telephone) {
    this.telephone = telephone;
}

public String getRole() {
    return role;
}

public void setRole(String role) {
    this.role = role;
}


@Override
public String toString() {
    return "Etudiant [email=" + email + ", id=" + id + ", matricule=" + matricule + ", nom=" + nom + ", prenom="
            + prenom + ", role=" + role + ", telephone=" + telephone + "]";
}

//Constructeur
  

   
}
