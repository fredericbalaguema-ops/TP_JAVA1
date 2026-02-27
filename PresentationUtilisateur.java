import java.util.Scanner;

public class PresentationUtilisateur {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Saisie des informations
        System.out.print("Entrez votre nom : ");
        String nom = scanner.nextLine();

        System.out.print("Entrez votre prénom : ");
        String prenom = scanner.nextLine();

        System.out.print("Entrez votre taille (en mètres) : ");
        double taille = scanner.nextDouble();

        System.out.print("Entrez votre âge : ");
        int age = scanner.nextInt();

        // Affichage du message
        System.out.println("\n----- Présentation -----");
        System.out.println("Je m'appelle " + prenom + " " + nom +
                ", j'ai " + age + " ans et je mesure " + taille + " m.");

        scanner.close();
    }
}
