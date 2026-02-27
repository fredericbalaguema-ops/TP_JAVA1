import java.util.Scanner;

public class VerificationMajorite {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Demande de l'âge
        System.out.print("Entrez votre âge : ");
        int age = scanner.nextInt();

        // Vérification majorité
        if (age >= 18) {
            System.out.println("Vous êtes majeur.");
        } else {
            System.out.println("Vous êtes mineur.");
        }

        scanner.close();
    }
  }
