package Clinique.io;

import Clinique.anim.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

public class CliniqueReader {
    
    public static void lireFichierEtAjouterAnimaux(String fichier, Vector<Animal> tableau, int MAX) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fichier))) {
            String line;
            while ((line = reader.readLine()) != null) {
                tableau.add(deserializeAnimal(line));
                if (tableau.size() == MAX) {
                    System.err.println("Attention, le maximum est atteint !");
                }
            }
        } catch (IOException e) {
            System.err.println("Erreur lors de la lecture du fichier : " + e.getMessage());
        }
    }

    private static Animal deserializeAnimal(String serializedAnimal) {
        String[] parts = serializedAnimal.split(",");
        String nom = parts[0];
        int age = Integer.parseInt(parts[1]);

        if ("Animal de Companie".equals(parts[2])) {
            String race = parts[3];

            AnimalCompanie anim = new AnimalCompanie();
            anim.setAge(age);anim.setNom(nom);anim.setRace(race);
            return (anim);

        } else {
            int poids = Integer.parseInt(parts[3]);
            AnimalAgriculture anim = new AnimalAgriculture();
            anim.setAge(age);anim.setNom(nom);anim.setPoids(poids);
            return (anim);
        }   
    } 
}