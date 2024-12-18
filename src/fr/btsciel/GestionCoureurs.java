package fr.btsciel;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalTime;

public class GestionCoureurs {
    private void restaurerFichierTexte (String s) throws IOException {

        BufferedReader br = Files.newBufferedReader(Path.of("course.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            String[] split = line.split(",");
            if (split.length == 5) {
                Genre g = Genre.valueOf(split[0]);
                Categorie c= Categorie.valueOf(split[3].trim().toString());
                LocalTime t = LocalTime.ofSecondOfDay(Integer.valueOf(split[4].trim().toString()));
                Coureur coureur = new Coureur(
                        Genre.valueOf(split[0].trim().toString()),
                        split[1],
                        split[2],
                        Categorie.valueOf(split[3]),
                        LocalTime.ofSecondOfDay(Integer.valueOf(split[4]))
                );
            }
        }


    }

    public GestionCoureurs() throws IOException {
    }
}
