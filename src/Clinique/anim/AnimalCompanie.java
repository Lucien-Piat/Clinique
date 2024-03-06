package Clinique.anim;

/**
 * Cette classe représente un Animal de Companie 
 */
public class AnimalCompanie extends Animal {

    private String race;

    /**
     * Constructeur par défaut pour AnimalAgriculture.
     * Initialise la race a "Inconnue"
     */
    public AnimalCompanie(){
        super();
        race = "Inconnue";
    }

    /**
     * Retourne le type de l'Animal.
     *
     * @return Le type de l'Animal de Companie.
     */
    public String getType(){return("Animal de Companie");}

    /**
     * Setter pour la race de l'Animal.
     *
     * @param val La nouvelle race de l'Animal
     */
    public void setRace(String val){race = val;}

    /**
     * Getter pour la race de l'animal.
     *
     * @return La race de l'animal de companie
     */
    public String getRace(){return(race);}
    
    /**
     * Affiche sur la sortie standard les modalités de l'Animal
     */
    public void afficherLAnimal() {
        super.afficherLAnimal();
        System.out.print(", Type = " + getType() + ", Race = " + getRace());
    }

    /**
     * Permet à l'utilisateur de modifier les modalités de l'Animal
     */
    public void ajoutValeures() {
        super.ajoutValeures();
        System.out.print("Donnez la race de l'animal : ");
        setRace(saisie_chaine());
    }
}
