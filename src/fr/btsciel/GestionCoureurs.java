package fr.btsciel;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalTime;
import java.util.ArrayList;

public class GestionCoureurs {

    public ArrayList<Coureur> coureurs = new ArrayList();

    private void restaurerFichierTexte (String s) throws IOException {

        BufferedReader br = Files.newBufferedReader(Path.of("course.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            String[] split = line.split(",");
            if (split.length == 5) {
                /*Genre g = Genre.valueOf(split[0]);
                Categorie c= Categorie.valueOf(split[3].trim().toString());
                LocalTime t = LocalTime.ofSecondOfDay(Integer.valueOf(split[4].trim().toString()));*/
                Coureur coureur = new Coureur(
                        Genre.valueOf(split[0].trim().toString()),
                        split[1],
                        split[2],
                        Categorie.valueOf(split[3].trim().toString()),
                        LocalTime.ofSecondOfDay(Integer.valueOf(split[4].trim().toString()))
                );
                coureurs.add(coureur);
            }
        }
        br.close();


    }


    public GestionCoureurs() throws IOException {
        restaurerFichierTexte("course.txt");
    }
    public void tri_nom_croissant (){
        coureurs.sort((c1, c2) -> c1.getNom().compareToIgnoreCase(c2.getNom()));
    }
    public void tri_nom_decroissant () {
        coureurs.sort((c1, c2) -> c2.getNom().compareToIgnoreCase(c1.getNom()));
    }
    public void tri_prenom_croissant (){
        coureurs.sort((c1, c2) -> c1.getPrenom().compareToIgnoreCase(c2.getPrenom()));
    }
    public void tri_prenom_decroissant (){
        coureurs.sort((c1, c2) -> c2.getPrenom().compareToIgnoreCase(c1.getPrenom()));
    }
    public void tri_classement_croissant (){
        coureurs.sort((c1, c2) -> c1.getDuree().compareTo(c2.getDuree()));
    }
    public void tri_classement_decroissant (){
        coureurs.sort((c1, c2) -> c2.getDuree().compareTo(c1.getDuree()));
    }
}
