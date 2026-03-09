void main() {

    Scanner scanner = new Scanner(System.in);

    IO.println("Inserisci la prima stringa:");
    String s1 = scanner.nextLine();

    IO.println("Inserisci la seconda stringa:");
    String s2 = scanner.nextLine();

    IO.println("Inserisci la terza stringa:");
    String s3 = scanner.nextLine();

    String concatenazione = s1 + s2 + s3;
    String concatenazioneInversa = s3 + s2 + s1;

    IO.println("Concatenazione normale: " + concatenazione);
    IO.println("Concatenazione inversa: " + concatenazioneInversa);

    scanner.close();
}