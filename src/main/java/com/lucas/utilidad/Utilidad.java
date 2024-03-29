package com.lucas.utilidad;

import com.lucas.carioca_digital.Jugador;


import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Esta clase sirve para proveer de métodos de uso general a otras clases
 */
public class Utilidad {

    /**
     * Se encarga de leer lo escrito por el usuario
     */
    private static Scanner in;

    /**
     *
     * Que entrada de texto se va a remplazar
     */
    private static ByteArrayInputStream input;


    /**
     * @deprecated
     * a partir de una entrada por teclado es remplaza por un scanner
     * @param stringInput simula una entrada por consola
     */
    public static void entradaAProbar(String stringInput) {
        input = new ByteArrayInputStream(stringInput.getBytes());
        in = new Scanner(input).useDelimiter("\n");

//        System.out.println(in.nextInt());
//        System.out.println(tecladoNext());
//        System.out.println(tecladoNext());
//        System.out.println(".");
        //System.setIn(input);

    }
    /**
     *
     * @return muestra lo escrito por el usuario
     */
    public static Scanner getIn() {
        return in;
    }

    /**
     * Este método se utilizo para hacer pruebas
     * @param in aquí se almacena lo escrito por el usuario
     */
    public static void setIn(Scanner in) {
        Utilidad.in = in;
    }
    /////Test: PARA CREAR UN JUEGO ARREGLADO Y ASI PROBAR FACILMENTE/////
    /*public static void main(String[] args) {
        Jugador jugador1 = new Jugador("Tester trios o escalas");
        Jugador jugador2 = new Jugador("Tester trio o escalas 2");
        ArrayList<Carta> cartasJugador1 = new ArrayList<>();
        for (int i = 0; i <3; i++) {
            cartasJugador1.add(new Carta("♠","3"));
            cartasJugador1.add(new Carta("♦","2"));
        }

        cartasJugador1.add(new Carta("JKR",""));
        ArrayList<Carta> cartas2 = new ArrayList<>();
        cartasJugador2 = (ArrayJugadorList<Carta>) cartasJugador1.clone();
        jugador1.setCartas(cartasJugador1);
        jugador2.setCartas(cartasJugador2);
        ArrayList<Jugador> jugadores = new ArrayList<>();
        jugadores.add(jugador1);
        jugadores.add(jugador2);
        Ronda ronda1 = new Ronda(jugadores,0);
        ronda1.comenzarRonda();
}*/



    /**
     * Este es el menu se muestra solamente una vez y es cuando se comienza jugar el Carioca.
     * Al comienzo del juego, se llama este método para ingresar el nro de jugadores y sus respectivos nombres
     * Básicamente en esta función se ingresa el numero y nombre de cada Jugador (Se crean los Jugadores)
     * @return  ArrayList de los objetos de la clase Jugador
     */
    public static ArrayList<Jugador> ingresarJugadores() {
        Utilidad.imprimirTitulo("Ingrese los Jugadores");

        int numeroJugadores = ingresarNumeroDeJugadores();
        ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
        for (int i = 1; i <= numeroJugadores; i++) {
            System.out.print("Ingrese el nombre del Jugador " + i + ": ");
            String nombre = tecladoNext();
            jugadores.add(new Jugador(nombre));
        }
        return jugadores;

    }

    //Posterior a eso, se llama a este método que pregunta al usuario desde que nivel hasta que nivel desea jugar


    /**
     * Para imprimir mensajes importantes, como por ejemplo titulos
     * @param mensaje es el mensaje que se quiere mostrar en terminal
     */
    public static void imprimirTitulo(String mensaje) {

        System.out.println("\n" + repetirString("/", mensaje.length()));
        System.out.println(mensaje);
        System.out.println(repetirString("/", mensaje.length()) + "\n");
    }


    /**
     *
     * @return retorna el numero de jugadores que ingreso el usuario
     */
    private static int ingresarNumeroDeJugadores() {

        int nroJugadores = ingresarUnNumero("Ingrese el numero de Jugadores (debe ser minimo 2 y maximo 4): ");
        //in.nextLine();
        if (nroJugadores >= 2 && nroJugadores <= 4) {
            return nroJugadores;
        }
        System.out.println("Error: el numero de Jugadores no es valido");
        System.out.println("Por favor inténtelo nuevamente");
        return ingresarNumeroDeJugadores();

    }



    /**
     *  Sirve para ingresar algo por teclado
     * @return  devuelve lo ingresado por teclado como cadena String
     */
    public static String tecladoNext() {
        String entrada = in.next();
        entrada.replaceAll("\n", "");
        entrada = entrada;
        if (entrada.equalsIgnoreCase("") || entrada.equalsIgnoreCase(" ")) {
            tecladoNext();
        }
        return entrada;
    }


    /**
     * Sirve para Cuando se quiere ingresar un numero por terminal
     * @param mensaje Es el texto que entrega el programa
     //* @param min valor minimo que se puede ingresar
     //* @param max valor maximo que se puede ingresar
     * @return Despliega un mensaje diciendo que numero debe ingresar
     */
    public static int ingresarUnNumero(String mensaje) {
        while (true) {
            try {
                System.out.print(mensaje);
                return Integer.parseInt(tecladoNext());
            } catch (Exception e) {
                System.out.println("Error: usted a introducido un caracter no valido: " + e);
                System.out.println("Intentelo nuevamente");
                in.nextLine();
            }

        }

    }


    /**
     * Este método sirve para Cuando se quiere ingresar un numero por terminal, ingresando
     * un numero dentro de un rango
     * @param mensaje pregunta que hace la terminal
     * @param min numero maximo aceptado
     * @param max numero maximo aceptado
     * @return Número ingresado por el usuario
     */
    public static int ingresarUnNumero(String mensaje, int min, int max) {
        if (min > max) {
            int aux = min;
            min = max;
            max = aux;
        }
        int numeroIngresado = ingresarUnNumero(mensaje + "\nIngrese un numero entre " + min + " y " + max + ": ");
        if (numeroIngresado <= max && numeroIngresado >= min) {
            return numeroIngresado;
        } else {
            System.out.println("El numero ingresado no es el correcto");
            return ingresarUnNumero(mensaje, min, max);
        }
    }


    /**

     * @param stringARepetir que palabra se va a repetir
     * @param nro cantidad de veces
     * @return repite un string una cantidad de veces (es un remplazo al método repeat de la clase String)
     */
    public static String repetirString(String stringARepetir, int nro) {
        String stringADevolver = "";
        if (nro > 0) {
            for (int i = 0; i < nro; i++) {
                stringADevolver += stringARepetir;
            }
        }
        return stringADevolver;

    }



    /**
     * Este método se ingresa un arreglo de números
     * @param array es una lista con los números ingresados
     * @return verificación si los números son diferentes
     */
    public static boolean sonNumerosDiferentes(int[] array) {
        int[] array2 = array.clone();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array[j] == array[i] && i != j) {
                    return false;
                }
            }
        }
        return true;
    }


    /**
     * imprime un menu de opciones (esas opciones se ingresa como arreglo de string)
     * @param opciones son las opciones que se pueden elegir
     * @return Devuelve la opcion elegida (que es un numero entre 1 hasta n opciones) en una cadena String
     */
    public static String imprimirMenuOpciones_e_ingresarUnaOpcion(String[] opciones) {
        imprimirSoloMenuOpciones(opciones);
        String opcion = String.valueOf(ingresarUnNumero("", 1, opciones.length));
        System.out.println();
        return opcion;
    }


    public static String imprimirMenuOpciones_e_ingresarUnaOpcion(ArrayList<String> opciones) {
        imprimirSoloMenuOpciones(opciones);
        String opcion = String.valueOf(ingresarUnNumero("", 1, opciones.size()));
        System.out.println();
        return opcion;
    }



    /**
     * Este método solo imprime el menu de opciones
     * @param opciones Alternativas a seleccionar por el usuario
     */
    public static void imprimirSoloMenuOpciones(String[] opciones) {
        //Imprime el menu de opciones pero las opciones comienzan desde el 1
        for (int i = 0; i < opciones.length; i++) {
            System.out.println("(" + (i + 1) + ") " + opciones[i]);
        }
    }

    /**
     * Este método imprime el menu de opciones
     * @param opciones Alternativas a seleccionar por el usuario
     */
    public static void imprimirSoloMenuOpciones(ArrayList<String> opciones) {

        for (int i = 0; i < opciones.size(); i++) {
            System.out.println("(" + (i + 1) + ") " + opciones.get(i));
        }
    }


    /**
     *
     * @param array lista
     * @param target string a buscar
     * @return devuelve en que posición esta el string a buscar
     */
    public static int StringArrayindexOf(String[] array,String target){
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(target)){
                return i;
            }
        }
        return -1;
    }

    /**
     * Este método verifica  lo que  ingresado sea un numero
     * @param strNum lo que ingresa el usuario
     * @return En caso de que la variable strNum no sea un numero, el método lo fuerza a la variable para que lo sea
     * @throws NumberFormatException nfe  ocurre cuando intenta hacer algo como convertir un String
     * en un valor numérico, como un int, float, double, long, etc.
     */
    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

}


