package Clinique.anim;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public abstract class Animal{

    private String nom;
    private int age;

    public Animal(){
        nom="Absent"; 
        age = 0;
    }

    public String getNom(){
        return (nom);
    }

    public void setNom(String val){
        nom=val;
    }

    public int getAge(){ 
        return(age);
    }

    public void setAge(int val){
        age=val;
    }

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

    public static int choixType(){
        System.out.println("\nAnimal de companie: 1\nAnimal d'agriculture: 2");
        int choix = saisie_entier();    
        return (choix);    
    }

    public void afficherLAnimal(){
        System.out.print("\nNom = " + getNom() + ", Age = " + getAge());
    }
    
    public void ajoutValeures(){
        System.out.print("Donnez le nom de l'animal : ");
        setNom(saisie_chaine());
        System.out.print("Donnez son age : ");
        setAge(saisie_entier());
    }
    
}