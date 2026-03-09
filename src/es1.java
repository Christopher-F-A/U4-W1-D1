public static void main(String[] args) {

    int risultatoMoltiplica = moltiplica(3, 4);
    System.out.println("Moltiplicazione: " + risultatoMoltiplica);

    String risultatoConcatena = concatena("Numero: ", 5);
    System.out.println("Concatenazione: " + risultatoConcatena);

    String[] array = {"uno", "due", "tre", "quattro", "cinque"};

    String[] newArray = inserisciInArray(array, "NUOVO");

    for (String elemento : newArray) {
        System.out.println(elemento);
    }
}public static int moltiplica(int a, int b) {
    return a * b;
}
public static String concatena(String testo, int numero) {
    return testo + numero;
}

public static String[] inserisciInArray(String[] array, String nuovaStringa) {

    String[] nuovoArray = new String[6];

    nuovoArray[0] = array[0];
    nuovoArray[1] = array[1];

    nuovoArray[2] = nuovaStringa;

    nuovoArray[3] = array[2];
    nuovoArray[4] = array[3];
    nuovoArray[5] = array[4];

    return nuovoArray;
}