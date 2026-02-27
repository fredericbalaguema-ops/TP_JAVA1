import java.util.Scanner;

public class CalculFactoriel {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Saisie du nombre
        System.out.print("Entrez un nombre entier positif : ");
        int nombre = scanner.nextInt();

        long factoriel = 1;

        // Vérification
        if (nombre < 0) {
            System.out.println("Le factoriel n'existe pas pour les nombres négatifs.");
        } else {
            // Calcul du factoriel
            for (int i = 1; i <= nombre; i++) {
                factoriel = factoriel * i;
            }

            System.out.println("Le factoriel de " + nombre + " est : " + factoriel);
        }

        scanner.close();
    }
                               }
