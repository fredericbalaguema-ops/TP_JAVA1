import java.util.Scanner;

public class MiniCalculatrice {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Saisie des nombres
        System.out.print("Entrez le premier nombre : ");
        double nombre1 = scanner.nextDouble();

        System.out.print("Entrez le deuxième nombre : ");
        double nombre2 = scanner.nextDouble();

        // Menu des opérations
        System.out.println("\n===== MINI CALCULATRICE =====");
        System.out.println("1 - Addition");
        System.out.println("2 - Soustraction");
        System.out.println("3 - Multiplication");
        System.out.println("4 - Division");
        System.out.print("Choisissez une opération (1-4) : ");

        int choix = scanner.nextInt();

        double resultat;

        // Traitement du choix
        switch (choix) {

            case 1:
                resultat = nombre1 + nombre2;
                System.out.println("Résultat : " + resultat);
                break;

            case 2:
                resultat = nombre1 - nombre2;
                System.out.println("Résultat : " + resultat);
                break;

            case 3:
                resultat = nombre1 * nombre2;
                System.out.println("Résultat : " + resultat);
                break;

            case 4:
                if (nombre2 != 0) {
                    resultat = nombre1 / nombre2;
                    System.out.println("Résultat : " + resultat);
                } else {
                    System.out.println("Erreur : division par zéro impossible.");
                }
                break;

            default:
                System.out.println("Choix invalide !");
        }

        scanner.close();
    }
  }
