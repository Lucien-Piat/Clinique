package Clinique.io;

import Clinique.anim.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;

/**
 * Cette classe permet de sauvegarder des informations sur les animaux dans un fichier.
 */
public class CliniqueWriter {

    /**
     * Sauvegarde les informations des animaux dans un fichier.
     *
     * @param tableau Le tableau d'animaux à sauvegarder.
     * @param FICHIER Le nom du fichier dans lequel sauvegarder les informations.
     */
    public static void sauvegarderDansFichier(Vector<Animal> tableau, String FICHIER) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FICHIER))) {
            for (Animal animal : tableau) {
                writer.write(serializeAnimal(animal));
                writer.newLine();
            }
            System.out.println("Les animaux ont été sauvegardés dans le fichier.");
        } catch (IOException e) {
            System.err.println("Erreur lors de la sauvegarde dans le fichier : " + e.getMessage());
        }
    }

    /**
     * Sérialise les informations d'un animal pour la sauvegarde dans le fichier.
     *
     * @param animal L'animal à sérialiser.
     * @return Une chaîne de caractères représentant les informations sérialisées de l'animal.
     */
    public static String serializeAnimal(Animal animal) {
        StringBuilder serializedAnimal = new StringBuilder();

        serializedAnimal.append(animal.getNom()).append(",");
        serializedAnimal.append(animal.getAge()).append(",");

        if (animal instanceof AnimalCompanie) {
            AnimalCompanie animalCompanie = (AnimalCompanie) animal;
            serializedAnimal.append(animalCompanie.getType()).append(",");
            serializedAnimal.append(animalCompanie.getRace());
        } else if (animal instanceof AnimalAgriculture) {
            AnimalAgriculture animalAgriculture = (AnimalAgriculture) animal;
            serializedAnimal.append(animalAgriculture.getType()).append(",");
            serializedAnimal.append(animalAgriculture.getPoids());
        }
        return serializedAnimal.toString();
    }
}
