package Clinique.anim;

public class AnimalCompanie extends Animal {

    private String race;

    public String getType(){
        return("Animal de Companie");
    }

    public AnimalCompanie(){
        super();
        race = "Inconnue";
    }

    public void setRace(String val){
        race = val;
    }

    public String getRace(){
        return(race); 
    }
    
    public void afficherLAnimal() {
        super.afficherLAnimal();
        System.out.print(", Type = " + getType() + ", Race = " + getRace());
    }

    public void ajoutValeures() {

        super.ajoutValeures();
        System.out.print("Donnez la race de l'animal : ");
        setRace(saisie_chaine());
    }
}
