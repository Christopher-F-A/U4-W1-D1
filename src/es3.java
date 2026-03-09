import java.util.Scanner;

public class es3 {

    public static double perimetroRettangolo(double lato1, double lato2) {
        return 2 * (lato1 + lato2);
    }

    public static int pariDispari(int numero) {
        if (numero % 2 == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static double areaTriangolo(double a, double b, double c) {

        double s = (a + b + c) / 2;

        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci il primo lato del rettangolo:");
        double lato1 = scanner.nextDouble();

        System.out.println("Inserisci il secondo lato del rettangolo:");
        double lato2 = scanner.nextDouble();

        double perimetro = perimetroRettangolo(lato1, lato2);
        System.out.println("Perimetro rettangolo: " + perimetro);


        System.out.println("Inserisci un numero intero:");
        int numero = scanner.nextInt();

        int risultato = pariDispari(numero);
        System.out.println("Risultato pari/dispari: " + risultato);


        System.out.println("Inserisci il primo lato del triangolo:");
        double a = scanner.nextDouble();

        System.out.println("Inserisci il secondo lato del triangolo:");
        double b = scanner.nextDouble();

        System.out.println("Inserisci il terzo lato del triangolo:");
        double c = scanner.nextDouble();

        double area = areaTriangolo(a, b, c);
        System.out.println("Area triangolo: " + area);

        scanner.close();
    }
}