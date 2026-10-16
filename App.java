import java.util.Scanner; // Hilfsbibliothek um Funktion Scanner zu nutzen (Objekt der Eingabe überwacht)

public class App {

    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        int i;
        double a = 0;
        double b = 0;

        do {
            i = menu(scan);

            if (i == 0) {
                System.out.println("Programm end");
                System.exit(0);
            } 
            else if (i > 4) {
                System.err.println("Funktion not exist");
                System.out.println("Programm end");
                System.exit(0);
            } 
            else {
                System.out.println("Please enter numbers:");
                System.out.print("1: ");
                a = scan.nextDouble();
                System.out.print("2: ");
                b = scan.nextDouble();
                System.out.println();
            }

            System.out.println("Numbers:");
            System.out.println("1. " + a);
            System.out.println("2. " + b);
            System.out.println();

            switch (i){
                case 1:
                    System.out.println("Result = " + add(a, b));
                    System.out.println();
                    break;

                case 2:
                    System.out.println("Result = " + subtract(a, b));
                    System.out.println();
                    break;

                case 3:
                    System.out.println("Result = " + multiply(a, b));
                    System.out.println();
                    break;

                case 4:
                    if (b != 0.0) {
                        System.out.println("Result = " + divide(a, b));
                        System.out.println();
                    } else {
                        System.out.println("Divide with 0 can't be solved");
                        System.out.println();
                    }
                    break;
            }

        } while (i != 0);

        scan.close();
    }

   // Methoden
    public static int menu(Scanner scan) {
        System.out.println("CALCULATOR - please select:");
        System.out.println("0: end program");
        System.out.println("1: add");
        System.out.println("2: subtract");
        System.out.println("3: multiply");
        System.out.println("4: divide");
        System.out.print("Please select: ");
        int auswahl = scan.nextInt();
        System.out.println();
        return auswahl;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }
}

//Die Methoden sind STATIC weil main auch STATIC ist
//STATIC Methoden gehören zu Klassen und nicht zu Objekt (Objekt wird nicht erstellt)

//Schritt 2 -   Der Java Compiler prüft Code
//              Bei Erfolg erzeugt er Bytecode in App.java

//Schritt 3 -   class wird ausgeführt