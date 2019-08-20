/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_teorialenguaje;

/**
 *
 * @author Neiver Tapia
 */
public class Automata {

    /**
     * @param args the command line arguments
     */
    int cont = 0;
    char[] enterChar;
    boolean cad = false;

    public static void main(String[] args) {

        //Creo el objeto de tipo Automata
        Automata aut = new Automata();
        String enter = "!f&&!v";
        //Ingreso la cadena leída en un vector de caracteres 
        aut.enterChar = enter.toCharArray();
        aut.inicio();

        //Esta es la bandera si me acepta o no la cadena dependiendo lo que me retorne
        if (aut.cad == true) {
            System.out.println("La cadena es aceptada");
        } else {
            System.out.println("La cadena no es aceptada");

        }
    }

    //Primer metodo que llamo desde MAIN para empezar el juego :v
    public void inicio() {
        q035810();
    }

    public void q035810() {

        if (cont < enterChar.length) {
            switch (enterChar[cont]) {
                case 'f':
                    System.out.println("Estamos en el estado " + cont + " El valor de la cadena es: " + enterChar[cont]);
                    cont++;
                    q1();
                    break;
                case 'v':
                    System.out.println("Estamos en el estado " + cont + " El valor de la cadena es: " + enterChar[cont]);
                    cont++;
                    q1();
                    break;
                case '!':
                    System.out.println("Estamos en el estado " + cont + " El valor de la cadena es: " + enterChar[cont]);
                    cont++;
                    q6();
                    break;
                default:
                    System.out.println("Estamos en el estado " + cont + " El valor de la cadena es: " + enterChar[cont]);
                    cont++;
                    q11();
                    break;
            }
        }

    }

    private void q11() {

        //   JOptionPane.showMessageDialog(null, "La cadena ingresada no es correcta y el valor incorrecto es: "+ enterChar[cont]);
        cad = false;
    }

    private void q1() {

        if (cont < enterChar.length) {

            switch (enterChar[cont]) {
                case '&':
                    System.out.println("Estamos en el estado " + cont + " El valor de la cadena es: " + enterChar[cont]);
                    cont++;
                    q2();

                    break;
                case '|':
                    System.out.println("Estamos en el estado " + cont + " El valor de la cadena es: " + enterChar[cont]);
                    cont++;
                    q4();

                    break;
                case '!':
                    System.out.println("Estamos en el estado " + cont + " El valor de la cadena es: " + enterChar[cont]);
                    cont++;
                    q79();

                    break;
                case '=':
                    System.out.println("Estamos en el estado " + cont + " El valor de la cadena es: " + enterChar[cont]);
                    cont++;
                    q79();

                    break;
                case 'v':
                    cont++;
                    q11();
                    break;
                case 'f':
                    cont++;
                    q11();
                    break;
            }
        } else {
            cad = true;
        }
    }

    private void q79() {

        if (cont < enterChar.length) {
            if (enterChar[cont] == '=') {
                System.out.println("Estamos en el estado " + cont + " El valor de la cadena es: " + enterChar[cont]);
                cont++;
                q035810();
            } else {
                cont++;
                q11();
            }
        } else {
            q11();
        }
    }

    private void q2() {
        char y = '&';
        if (cont < enterChar.length) {
            if (enterChar[cont] == y) {
                System.out.println("Estamos en el estado " + cont + " El valor de la cadena es: " + enterChar[cont]);
                cont++;
                q035810();
            } else {
                System.out.println("Estamos en el estado " + cont + " El valor de la cadena es: " + enterChar[cont]);
                cont++;
                q11();
            }
        } else {
            q11();
        }
    }

    private void q4() {
        char o = '|';
        if (cont < enterChar.length) {
            if (enterChar[cont] == o) {
                System.out.println("Estamos en el estado " + cont + " El valor de la cadena es: " + enterChar[cont]);
                cont++;
                q035810();
            } else {
                System.out.println("Estamos en el estado " + cont + " El valor de la cadena es: " + enterChar[cont]);
                cont++;
                q11();
            }
        } else {
            q11();
        }
    }

    private void q6() {
        if (cont < enterChar.length) {
            if (enterChar[cont] == 'v' || enterChar[cont] == 'f') {
                System.out.println("Estamos en el estado " + cont + " El valor de la cadena es: " + enterChar[cont]);
                cont++;
                q1();
            } else {
                cont++;
                q11();
            }
        } else {
            q11();
        }
    }

}
