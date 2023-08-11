import java.util.Scanner;

public class Practica0 {
    public static void main(String[] args) {
        // String name = askName();
        // System.out.println(printName(name));
        // imprimirFecha(1, 12, 2020);
        // System.out.println(sumatoria(10));
        // System.out.println(sumatoriaPares(10));
        // System.out.println(cantCifras(100));
        // System.out.println(cantidadApariciones("ahoalaa", 'a'));
        // System.out.println(cantidadVocales("Holaio"));
        // System.out.println(esAbecedaria("celas"));
        // System.out.println(esCapicua("amor a roma"));
        System.out.println(esSinRepetidos("hola"));
    }
    
    public static String askName(){
        Scanner sc = new Scanner(System.in);
        String name = "";
        System.out.println("Ingrese su nombre: ");
        name = sc.nextLine();        
        return name;
    }

    public static String printName(String name){
        name = askName();
        return name;
    }

/*
Ejercicio 9
Escribir un m ́etodo static void imprimirFecha(int dia, int mes, int anio) que imprime la
fecha pasada como par ́ametro en formato del estilo “5 de Julio de 2030”.
*/
    public static void imprimirFecha(int dia, int mes, int anio){
        String mes_cadena = "";
        if (mes == 1){
            mes_cadena = " Enero ";
        } else if (mes == 2) {
             mes_cadena = " Febrero ";
        } else if (mes == 3) {
             mes_cadena = " Marzo ";
        } else if (mes == 4) {
             mes_cadena = " Abril ";
        } else if (mes == 5) {
             mes_cadena = " Mayo ";
        } else if (mes == 6) {
             mes_cadena = " Junio ";
        } else if (mes == 7) {
             mes_cadena = " Julio ";
        } else if (mes == 8) {
             mes_cadena = " Agosto ";
        } else if (mes == 9) {
             mes_cadena = " Septiembre ";
        } else if (mes == 10) {
             mes_cadena = " Octubre ";
        } else if (mes == 11) {
             mes_cadena = " Noviembre ";
        } else {
             mes_cadena = " Diciembre ";
        }
        System.out.println(dia + " de" + mes_cadena + "de " + anio);
    }

/*
 Ejercicio 10
Escribir un m ́etodo static int sumatoria(int n) que devuelve la sumatoria de los n ́umeros
desde 1 hasta n.
 */
    public static int sumatoria(int n){
        int suma = 0;
        for (int i = 0; i <= n; i++){
            suma += i;
        }
        return suma;
    }

/*
 Ejercicio 11
Escribir un m ́etodo static int sumatoriaPares(int n) que devuelve la sumatoria de los n ́ume-
ros pares desde 2 hasta n.
 */
    public static int sumatoriaPares(int n){
        int suma_pares = 0;
        for (int i = 0; i <= n; i += 2){
            suma_pares += i;
        }
        return suma_pares;
    }

/*
 Ejercicio 14
Escribir un m ́etodo static int cantCifras(int n) que devuelve la cantidad de cifras de n.
Probarlo adecuadamente llam ́andola desde el main.
 */
    public static int cantCifras(int n) {
        int cont = 0;
        if (n <= 0 && n > (-10) || n >= 0 && n < 10){
            cont += 1;
        }else if (n <= (-10) && n > (-100) || n >= 10 && n < 100){
            cont += 2;
        } else if (n <= (-100) && n > (-1000) || n >= 100 && n < 1000){
            cont += 3;
        } else {
            cont += 4;
        }
        return cont;
    }

/*
 Ejercicio 17
Escribir un m ́etodo static int cantidadApariciones(String s, char c) que dada una cadena
y un caracter, cuenta la cantidad de veces que aparece c en s.
 */
    public static int cantidadApariciones(String s, char c){
        int cont = 0;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == c){
                cont ++;
            }
        }
        return cont;
    }

/*
 Ejercicio 18
Escribir un m ́etodo static int cantidadVocales(String s) que dada una cadena que contiene
s ́olo letras min ́usculas sin acentuar, devuelve la cantidad de vocales en dicha cadena. Nota: se puede
utilizar el m ́etodo definido en el ejercicio anterior.
 */
    public static int cantidadVocales(String s){
        int a = cantidadApariciones(s, 'a');
        int e = cantidadApariciones(s, 'e');
        int i = cantidadApariciones(s, 'i');
        int o = cantidadApariciones(s, 'o');
        int u = cantidadApariciones(s, 'u');
        int cont_vocales = a+e+i+o+u;
        return cont_vocales;
    }

/*
 Ejercicio 19
Una palabra se dice que es “abecedaria” si las letras en la palabra aparecen en orden alfab ́etico.
Por ejemplo, las siguientes son todas palabras abecedarias del idioma castellano.
adios, afın, afino,  ́agil, bello, celos, ceno, chinos dijo, dimos, dios, fijos, finos, hijos, hilos, himno
 */
    public static boolean esAbecedaria(String s){
        // boolean abecedaria = false;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) > s.charAt(i+1)){
                return false;
            }
        }
        return true;
    }

/*
 Ejercicio 20
Escribir el m ́etodo static boolean esCapicua(String s) que dada una cadena, devuelve true
si la cadena es igual de atr ́as hacia adelante o de adelante hacia atr ́as. En caso contrario, devuelve
false.
 */
    public static boolean esCapicua(String s) {
        int izquierda = 0;
        int derecha = s.length() - 1;
        
        while (izquierda < derecha) {
            if (s.charAt(izquierda) != s.charAt(derecha)) {
                return false; // Si las letras no coinciden, la palabra no es capicúa
            }
            izquierda++;
            derecha--;
        }
        return true; // Si todas las letras coinciden, la palabra es capicúa
    }

/*
 Ejercicio 21
Escribir un m ́etodo static boolean esSinRepetidos(String s) que dada una cadena, devuelve
true si no hay letras repetidas en la cadena. En caso contrario, devuelve false. No utilizar el m ́etodo
del ejercicio 22.
 */
    public static boolean esSinRepetidos(String s){
        String sin_repetir = "";
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) != sin_repetir){
                sin_repetir+= s.charAt(i);
                return false;
            }
        }
        return true;
    }
}
