Veterinary Clinic Management System
This Java program, named "Veterinary Clinic Management System," is designed to manage animal records in a veterinary clinic. The system allows users to perform various tasks such as adding animals, displaying the animal list, saving records to a file, searching for specific animals, counting individuals of a species, and more.

Features
Animal Classes:

Animal: Abstract class representing generic animal attributes such as name and age.
AnimalAgriculture: Subclass of Animal representing agricultural animals with additional attributes like weight.
AnimalCompanie: Subclass of Animal representing companion animals with an extra attribute for the race or breed.
File Input/Output:

CliniqueReader: Reads animal data from a file and adds it to the program.
CliniqueWriter: Writes animal records to a file for future reference.
User Interaction:

CliniquePrinter: Handles user interface interactions, such as displaying the animal list, searching for animals, counting species, and presenting a menu for user choices.
Main Application:

CliniqueMain: The main class that orchestrates the entire program. It initializes a collection of animals, allows importing data from a file, and enters a loop for user interaction.
How to Use
Compile and Run:

Ensure you have a Java Development Kit (JDK) installed.
Compile the program using javac Clinique/*.java Clinique/anim/*.java Clinique/io/*.java.
Run the program using java Clinique.CliniqueMain with an optional argument for a data file (e.g., java Clinique.CliniqueMain animals_data.txt).
Menu Options:

Upon running, the program will display a menu with options such as adding animals, displaying the list, saving to a file, searching for animals, counting species, and quitting.
File Import:

When prompted, users can choose to import animal data from a specified file.
User Interaction:

Follow on-screen prompts to navigate through different functionalities.
Enter relevant information, such as animal names, ages, races, or weights when prompted.
Exiting the Program:

To exit the program, choose the "Quitter" option from the menu.
Example Usage
bash
Copy code
java Clinique.CliniqueMain animals_data.txt
Notes
The program uses a vector to store animal records.
The maximum size of the vector is set to 5 to manage memory usage.
Data is saved to and loaded from a file for persistent storage.
