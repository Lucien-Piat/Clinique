package Clinique;

import java.util.Vector;
import Clinique.anim.Animal;
import Clinique.anim.AnimalAgriculture;
import Clinique.anim.AnimalCompanie;
import Clinique.io.*;

public class CliniqueMain {

    private static String FICHIER = "animaux.txt";
    private static final int MAX = 5;

    public static Animal creationAnimal(int choix){
        if (choix==1){
            AnimalCompanie anim = new AnimalCompanie();
            anim.ajoutValeures();
            return(anim); 
        }
        else{
            AnimalAgriculture anim = new AnimalAgriculture();
            anim.ajoutValeures();
            return(anim); 
        }
    }

    public static void redirectionChoix(Vector<Animal> tableau, int choix, String FICHIER, int MAX){
        switch (choix) {
            case 1:
                tableau.add(creationAnimal(Animal.choixType()));
                break;
    
            case 2:
                CliniquePrinter.afficherUnTableau(tableau);
                System.out.print("\nAppuyez sur une touche : ");
                Animal.saisie_chaine();
                break;
    
            case 3:
                CliniqueWriter.sauvegarderDansFichier(tableau, FICHIER);
                break; 

            case 4:
                CliniquePrinter.rechercherUnAnimal(tableau);
                System.out.print("\nAppuyez sur une touche : ");
                Animal.saisie_chaine();
                break; 

            case 5:
                CliniquePrinter.compterUneEspece(tableau);
                System.out.print("\nAppuyez sur une touche : ");
                Animal.saisie_chaine();
                break; 
            case 6:
                System.exit(0);
        }
    
        if (tableau.size() == MAX) {
            System.err.println("Attention, le maximum est atteint !");
        }
    }
    
    private static void boucle(Vector<Animal> tableau){
        while (true) {
            CliniquePrinter.afficherMenu();
            int choix = Animal.saisie_entier();
            redirectionChoix(tableau, choix,FICHIER, MAX);
        }
    }
    public static void main(String[] args) {

        Vector<Animal> tableau = new Vector<>();

        if (args.length == 1){FICHIER=args[0];}

        System.out.println("Voulez vous importer les annimeaux depuis le fichier "+FICHIER+" ?");
        System.out.println("0 : Oui, 1 : Non");

        int choix = Animal.saisie_entier();

        if (choix == 0){
            CliniqueReader.lireFichierEtAjouterAnimaux(FICHIER, tableau, MAX);
            System.out.println("\nAnimaux ajoutés depuis le fichier : "+ FICHIER);
            CliniquePrinter.afficherUnTableau(tableau);
        }

        boucle(tableau);

    }
}

