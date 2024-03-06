package Clinique.anim;

/**
 * Cette classe représente un Animal d'Agriculture dans une clinique.
 */
public class AnimalAgriculture extends Animal {

    private int poids;

    /**
     * Constructeur par défaut pour AnimalAgriculture.
     * Initialise le poids à 0.
     */
    public AnimalAgriculture(){
        super();
        poids = 0;
    }

    /**
     * Retourne le type de l'animal.
     *
     * @return Le type de l'animal d'agriculture.
     */
    public String getType(){return("Animal d'Agriculture");}
    
    /**
     * Setter pour le poids de l'animal.
     *
     * @param val Le nouveau poids de l'animal.
     */
    public void setPoids(int val){poids = val;}

    /**
     * Getter pour le poids de l'animal.
     *
     * @return Le poids de l'animal d'agriculture.
     */
    public int getPoids(){return(poids);}

    /**
     * Affiche sur la sortie standard les modalités de l'Animal
     */
    public void afficherLAnimal() {
        super.afficherLAnimal();
        System.out.print(", Type = " + getType() + ", Poids = " + getPoids());
    }

    /**
     * Permet à l'utilisateur de modifier les modalités de l'Animal
     */
    public void ajoutValeures() {
        super.ajoutValeures();
        System.out.print("Donnez le poids de l'animal : ");
        setPoids(saisie_entier());
    }
}

