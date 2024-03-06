package Clinique.anim;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Cette Classe abstraite représente un Animal
 */
public abstract class Animal{

    private String nom;
    private int age;

    /**
     * Constructeur par défaut pour un Animal
     * Initialise le nom à "Absent"
     * Initialise l'age à 0
     */
    public Animal(){
        nom="Absent"; 
        age = 0;
    }

    /**
     * Getter pour le nom de l'Animal
     * 
     * @return Le nom de l'Animal
     */
    public String getNom(){return (nom);}

    /**
     * Setter pour le nom de l'Animal
     * 
     * @param val Nouveau nom pour l'Animal
     */
    public void setNom(String val){nom=val;}

    /**
     * Getter pour l'age de l'Animal
     * 
     * @return L'age de l'Animal
     */
    public int getAge(){return(age);}

    /**
     * Setter pour l'age de l'Animal
     * 
     * @param val Nouvel age pour l'Animal
     */
    public void setAge(int val){age=val;}

    /**
     * Lis l'entier inscrit dans l'entrée standard
     * 
     * @return un entier 
     */
    public static int saisie_entier (){
        while (true){
            try{
                System.out.print("\n>");
                BufferedReader buff = new BufferedReader (new InputStreamReader(System.in));
                String chaine=buff.readLine();
                int num = Integer.parseInt(chaine); 
                return num;
            }
            catch(NumberFormatException e){
                System.out.println("Entrer un entier valide");
            }
            catch(IOException e){
                System.out.println("erreure de lecture");
            }
        }
    }

    /**
     * Lis la chaine inscrite dans l'entrée standard
     * 
     * @return une chaine
     */
    public static String saisie_chaine (){
        while (true){
            try {
                System.out.print("\n>");
                BufferedReader buff = new BufferedReader (new InputStreamReader(System.in));
                String chaine=buff.readLine(); return chaine;
            }
            catch(NumberFormatException e){
                System.out.println("Entrer une chaine valide");
            }
            catch(IOException e) {
                System.out.println("erreure de lecture");
            }
        }
    }

    /**
     * Permet de a l'utilisateur de choisir un type d'animal
     * 
     * @return un entier choisit
     */
    public static int choixType(){
        System.out.println("\nAnimal de companie: 1\nAnimal d'agriculture: 2");
        int choix = saisie_entier();    
        return (choix);    
    }

    /**
     * Affiche sur la sortie standard les modalités de l'Animal
     */
    public void afficherLAnimal(){
        System.out.print("\nNom = " + getNom() + ", Age = " + getAge());
    }
    
    /**
     * Permet a l'utilisateur de modifier les modalités de l'Animal
     */
    public void ajoutValeures(){
        System.out.print("Donnez le nom de l'animal : ");
        setNom(saisie_chaine());
        System.out.print("Donnez son age : ");
        setAge(saisie_entier());
    } 
}