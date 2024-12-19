package fr.btsciel;

import java.time.LocalTime;

// Coureur hérite de Personne
public class Coureur extends Personne {

    // Déclaration des objets propre à Coureur
    private Categorie categorie;
    private LocalTime duree;

    public Coureur(Genre genre, String nom, String prenom, Categorie categorie, LocalTime duree) {
        super(genre, nom, prenom);
        this.categorie = categorie;
        this.duree = duree;
    }

    public Categorie getCategorie() {
        return categorie;
    }
    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }
    public LocalTime getDuree() {
        return duree;
    }
    public void setDuree(LocalTime duree) {
        this.duree = duree;
    }
}
