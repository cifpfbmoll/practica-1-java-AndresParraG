/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerprograma;

import java.util.Scanner;
/**
 *
 * @author Andrew
 */
public class PrimerPrograma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Elija una opcion:\nEj.'a'\nEj.'b'\nEj.'c'\n"
                + "Ej.'d'\nEj.'e'\nEj.'f'\nEj.'g'\nEj.'h'\nEj.'i'\n");
        Scanner userInput = new Scanner(System.in);
        String texto;
        char input = userInput.next().charAt(0);
        userInput.nextLine();
        switch (input) {
            case 'a':
                mostrarNumerosEnOrden();
                break;
            case 'b':
                mostrarNumerosInverso();
                break;
            case 'c':
                mediaNumeros();
                break;
            case 'd':
                texto = userInput.nextLine();
                System.out.println("El texto introducido tiene: "+muchoTexto(texto)+" letras");
                break;
            case 'e':
                texto = userInput.nextLine();
                invertirTexto(texto);
                break;
            case 'f':
                texto = userInput.nextLine();
                eliminarEspacios(texto);
                break;
            case 'g':
                texto = userInput.nextLine();
                userInput.nextLine();
                String texto2 = userInput.nextLine();
                System.out.println(concatenarCadenas(texto, texto2));
                break;
            case 'h':
                texto = userInput.nextLine();
                userInput.nextLine();
                String vocal = userInput.nextLine();
                sustituirPorVocal(texto, vocal);
                break;
            case 'i':
                texto = userInput.nextLine();
                traducirASCII(texto);
                break;
            default:
                System.out.println("Entrada no valida");
        }
    }
    
    public static void mostrarNumerosEnOrden() {
        int[] array = new int[5];
        int num;
        Scanner intInput = new Scanner(System.in);
        for(int i=0; i<5; i++) {
            num = intInput.nextInt();
            array[i] = num;
        }
        for(int j=0; j<5; j++) {
            System.out.println(array[j]);
        }
    }
    
    public static void mostrarNumerosInverso() {
        int[] array = new int[5];
        int num;
        Scanner intInput = new Scanner(System.in);
        for(int i=0; i<5; i++) {
            num = intInput.nextInt();
            array[i] = num;
        }
        for(int j=4; j>=0; j--) {
            System.out.println(array[j]);
        }
    }
    
    public static void mediaNumeros() {
        int[] array = new int[5];
        int num;
        int contPos = 0;
        int medPos = 0;
        int contNeg = 0;
        int medNeg = 0;
        int contNull = 0;
        Scanner intInput = new Scanner(System.in);
        for(int i=0; i<5; i++) {
            num = intInput.nextInt();
            array[i] = num;
        }
        for(int j=0; j<5; j++) {
            if(array[j] > 0) {
                contPos++;
                medPos += array[j];
            } else if(array[j] < 0) {
                contNeg++;
                medNeg += array[j];
            } else {
                contNull++;
            }
        }
        medPos = medPos/contPos;
        medNeg = medNeg/contNeg;
        
        System.out.println("La media de los números positivos es: "+medPos);
        System.out.println("La media de los números negativos es: "+medNeg);
        System.out.println("La cantidad de ceros es: "+contNull);
    }
    
    public static int muchoTexto(String text) {
        int numLetras = text.length();
        return numLetras;
    }
    
    public static void invertirTexto(String text) {
        System.out.println("El texto invertido es: ");
        for(int i=text.length(); i!=0; i--) {
            System.out.print(text.charAt(i));
        }
    }
    
    public static void eliminarEspacios(String text) {
        System.out.println("El texto sin espacios es: ");
        System.out.print(text.replace(" ", ""));
    }
    
    public static String concatenarCadenas(String text1, String text2) {
        return text1 + text2;
    }
    
    public static void sustituirPorVocal(String text, String a) {
        String finalText = text.replace("a", a);
        finalText = finalText.replace("e", a);
        finalText = finalText.replace("i", a);
        finalText = finalText.replace("o", a);
        finalText = finalText.replace("u", a);
        System.out.println(finalText);
    }
    
    public static void traducirASCII(String text) {
        for(int i=0; i<text.length(); i++) {
            System.out.println("El codigo ASCII de "+ text.charAt(i) +" es " +
                    (int)text.charAt(i));
        }
    }
}
