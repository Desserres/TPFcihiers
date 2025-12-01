package fr.btsciel;

import fr.btsciel.personnes.basicclasses.Coureur;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Ihm {
    static String path = new String("src/main/resources/course.txt");
    static BufferedReader reader;


    public static void main(String[] args) {
        try {
            int lines = 0;
            ArrayList<Coureur> arrayListBateauxExes = new ArrayList<>();
            BufferedReader br = Files.newBufferedReader(Paths.get(path));
            if (Files.exists(Path.of(path))) {
                System.out.println("Lecture...");
                BufferedReader reader = new BufferedReader(new FileReader(path));
                while (reader.readLine() != null) {
                    System.out.println(br.readLine());
                    lines++;
                }
                reader.close();
            } else {
                System.out.println("Le fichier n'existe pas.");
            }
        } catch (IOException e) {
            System.err.println("Err de fichier: " + e.getMessage());
        }
    }
}