package Views;

     import java.util.Scanner;

     import Service.IService;
     import Service.ServiceTableau;

     import Models.Pavillon;
     import Models.BoursierLoge;
     import Models.Chambre;
     import Models.NonBoursier;

public class Menu {
     private int choice;
     Scanner clavier =new Scanner(System.in);
     
     public void menu(){
          System.out.println("veillez Faites votre choix..........");
          System.out.println("###########################################-");
          System.out.println("1-    Ajouter Pavillon");
          System.out.println("2-    Ajouter Chambre");
          System.out.println("3-    Ajouter un Etudiant");


     }
     public void choix(){
          IService ServiceTableau = new ServiceTableau();
          choice =clavier.nextInt();

          switch(choice){
               case 1: 
                     System.out.println("veillez saissir le nombre de pavillon a Ajouter");
                     int nombrePavillon = clavier.nextInt();
                     for(int i = 0; i < nombrePavillon; i++) {
                         int id =(i+1);
                         System.out.println("veillez choisir le nombre d'etage");
                         int nombreEtage = clavier.nextInt();
                         System.out.println("veillez choisir le numero de pavillon");
                         int numeroPavillon = clavier.nextInt();

                         Pavillon p =new Pavillon(id,numeroPavillon,nombreEtage);
                         ServiceTableau.AddPavillon(p);
                     }
                     
                     ServiceTableau.listerPavillon();
                    break;
               case 2:
                    System.out.println("veillez saissir le nombre de chambre Ajouter");
                    int nombreDeChambre=clavier.nextInt();
                     for (int i= 0; i< nombreDeChambre; i++) {
                         int idChambre=(i+1);
                         System.out.println("veillez choisir le numero de chambre a Ajouter");
                         int numeroChambre = clavier.nextInt();
                         System.out.println("veillez choisir le type de chambre DOUBLE ou INDIVIDUEL");
                         String typeChambre = clavier.next();
                         System.out.println("veillez choisir le numero de etage de la chambre");
                         int numeroEtage= clavier.nextInt();
                         int etatChambre= 1;
                         Chambre ch = new Chambre(idChambre, numeroChambre, numeroEtage, etatChambre, typeChambre);
                         ServiceTableau.AddChambre(ch);
                    }
                          ServiceTableau.listerChambre();
                     break;
                     case 3:
                               
                    System.out.println(" Quel type d'Etudiant voulez vous ajouter ?");
                    System.out.println("1-  Bourssier Logé");
                    System.out.println("2-  Bourssier Non Logé ");
                    System.out.println("3-  Non Bourssier");
                    choice = clavier.nextInt();
                    switch(choice) {
                         case 1:
                         System.out.println("**** Entrer le nombre de Etudiant à Ajouter: ****");
                         int nbreEtudiantBL = clavier.nextInt();
                         for (int i = 1; i <= nbreEtudiantBL; i++){
                             int id= (i+1);
                             System.out.println("---- Entrer Votre prénom");
                             String prenom = clavier.next();
                             System.out.println("-------- Entrer Votre nom");
                             String nom = clavier.next();
                             System.out.println("-------- Entrer Votre email");
                             String email = clavier.next();
                             int etat = 1; 
                             String role = "ROLE_ETUDIANT";
                             String matricule = "MT-000"+i;
                             System.out.println("---- Entrer Votre telephone");
                             String telephone = clavier.next();
                             BoursierLoge etudiantBL= new BoursierLoge(id,nom,prenom,role,etat,matricule,telephone,email);
                             ServiceTableau.addBoursierLoge(etudiantBL);
                         }
                             ServiceTableau.listerBourssierLoge();
                             break;

                             default:
                              break;
                    }
                  

                     break;
               default:       
                      break;  
          }

            
     }      

}
