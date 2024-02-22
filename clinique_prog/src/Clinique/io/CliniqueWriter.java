package Clinique.io;

import Clinique.anim.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;

public class CliniqueWriter {

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
