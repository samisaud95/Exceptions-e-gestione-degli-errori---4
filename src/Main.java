//Scrivere una funzione che accetti un array in input e provi a dividere
// un numero dell'array per 0 e gestista sia l'eccezione della divisione che quella
// di indice non presente nell'array, leggendone il messaggio.
//Eseguire sempre un blocco di codice scrivendo un messaggio in console.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 4};
        gestisciArrayDivision(array, 0, 2);
    }

    private static void gestisciArrayDivision(int[] num1, int num2, int arrayPosto) {
        try {
            int divisione= num1[arrayPosto] / num2;
        } catch (ArithmeticException e) {
            System.out.println("non puoi dividire per 0");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("posto del numero non c'è nell' Array");
        } finally {
            System.out.println("Le operazione non poui continuare");
        }

    }
}

