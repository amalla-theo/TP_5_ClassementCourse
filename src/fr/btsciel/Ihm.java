package fr.btsciel;

import clavier.In;

import java.io.IOException;

public class Ihm {
    public static void main(String[] args) {

        int saisie = 0;
        boolean mauvaisChiffre = false;

        try {
            GestionCoureurs gestion = new GestionCoureurs();


            do{
               mauvaisChiffre = false;

                System.out.println("Veuillez saisir votre choix");
                System.out.println("1. Trier par nom dans l'ordre alphabétique croissant");
                System.out.println("2. Trier par nom dans l'ordre alphabétique décroissant");
                System.out.println("3. Trier par prénom dans l'ordre alphabétique croissant");
                System.out.println("4. Trier par prénom dans l'ordre alphabétique décroissant");
                System.out.println("5. Trier par classement croissant");
                System.out.println("6. Trier par classement décroissant \n");

                saisie = In.readInteger();

                switch (saisie) {
                    case 1:
                        gestion.tri_nom_croissant();
                        for (Coureur c : gestion.coureurs)
                            System.out.println( c.getGenre() + " " + c.getNom() + " " + c.getPrenom() + " " + c.getCategorie() + " " + c.getDuree());
                        break;
                    case 2:
                        gestion.tri_nom_decroissant();
                        for (Coureur c : gestion.coureurs)
                            System.out.println( c.getGenre() + " " + c.getNom() + " " + c.getPrenom() + " " + c.getCategorie() + " " + c.getDuree());
                        break;
                    case 3:
                        gestion.tri_prenom_croissant();
                        for (Coureur c : gestion.coureurs)
                            System.out.println( c.getGenre() + " " + c.getNom() + " " + c.getPrenom() + " " + c.getCategorie() + " " + c.getDuree());
                        break;
                    case 4:
                        gestion.tri_prenom_decroissant();
                        for (Coureur c : gestion.coureurs)
                            System.out.println( c.getGenre() + " " + c.getNom() + " " + c.getPrenom() + " " + c.getCategorie() + " " + c.getDuree());
                        break;
                    case 5:
                        gestion.tri_classement_croissant();
                        for (Coureur c : gestion.coureurs)
                            System.out.println( c.getGenre() + " " + c.getNom() + " " + c.getPrenom() + " " + c.getCategorie() + " " + c.getDuree());
                        break;
                    case 6:
                        gestion.tri_classement_decroissant();
                        for (Coureur c : gestion.coureurs)
                            System.out.println( c.getGenre() + " " + c.getNom() + " " + c.getPrenom() + " " + c.getCategorie() + " " + c.getDuree());
                        break;
                    default:
                        System.out.println("Veuillez entrer un chiffre valide !\n\n");
                        mauvaisChiffre = true;
                }
            }while (mauvaisChiffre == true);


        } catch (IOException e) {
            System.err.println("ERREUR: " + e.getMessage());
        }
        }
    }