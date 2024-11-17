package musicOperation;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        MusicInterface musicInterface = new MusicImplemets();
        while (true){
            System.out.println("1. Add the music.. ");
            System.out.println("2. Delete book to library.. ");
            System.out.println("3. Get book the library..");
            System.out.println("4. Uptade book the library..");
            System.out.println("5. Log out..");

            System.out.println("Choose the one of the operations..");
            int operations= input.nextInt();

            switch (operations){
                case 1:
                    System.out.println("Enter the book ID be unique: ");
                    int ID=input.nextInt();
                    System.out.println("Enter the book name: ");
                    String name=input.nextLine();
                    System.out.println("Enter the author name: ");
                    String authorname=input.nextLine();
            }

        }
    }
}