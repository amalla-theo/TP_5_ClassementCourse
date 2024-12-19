package fr.btsciel;

public class Personne {

    // Déclaration des objets
    private Genre genre;
    private String nom;
    private String prenom;


    public Genre getGenre() {
        return genre;
    }
    public void setGenre(Genre genre) {
        this.genre = genre;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Personne (){}


    public Personne(Genre genre, String nom, String prenom) {
        this.setGenre (genre);
        this.setPrenom (prenom);
        this.setNom (nom);
    }

}

