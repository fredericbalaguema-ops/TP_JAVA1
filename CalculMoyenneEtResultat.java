import java.util.Scanner;

public class CalculMoyenneEtResultat {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Saisie des notes
        System.out.print("Entrez la première note : ");
        double note1 = scanner.nextDouble();

        System.out.print("Entrez la deuxième note : ");
        double note2 = scanner.nextDouble();

        System.out.print("Entrez la troisième note : ");
        double note3 = scanner.nextDouble();

        // Calcul de la moyenne
        double moyenne = (note1 + note2 + note3) / 3;

        // Affichage de la moyenne
        System.out.println("La moyenne est : " + moyenne);

        // Vérification du résultat
        if (moyenne >= 10) {
            System.out.println("Admis");
        } else {
            System.out.println("Ajourné");
        }

        scanner.close();
    }
          }
