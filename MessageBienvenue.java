import java.util.Scanner;

public class MessageBienvenue {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Demande des informations
        System.out.print("Entrez votre prénom : ");
        String prenom = scanner.nextLine();

        System.out.print("Entrez votre âge : ");
        int age = scanner.nextInt();

        // Affichage du message
        System.out.println("BIENVENUE " + prenom + ", VOUS AVEZ " + age + " ANS.");

        scanner.close();
    }
}
