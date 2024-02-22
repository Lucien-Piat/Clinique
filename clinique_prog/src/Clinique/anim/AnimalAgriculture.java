package Clinique.anim;
public class AnimalAgriculture extends Animal {

    private int poids;

    public String getType(){
        return("Animal d'Agriculture");
    }
    
    public AnimalAgriculture(){
        super();
        poids = 0;
    }

    public void setPoids(int val){
        poids = val;
    }

    public int getPoids(){
        return(poids); 
    }

    public void afficherLAnimal() {
        super.afficherLAnimal();
        System.out.print(", Type = " + getType() + ", Poids = " + getPoids());
    }

    public void ajoutValeures() {
        super.ajoutValeures();
        System.out.print("Donnez le poids de l'animal : ");
        setPoids(saisie_entier());
    }
}

