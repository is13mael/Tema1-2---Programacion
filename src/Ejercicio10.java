public class Ejercicio10 {
        public static final String RESET = "\033[0m"; // Text Reset
        public static final String GRIS_TEXTO = "\u001B[38;5;245m";
        public static final String ROJO_TEXTO = "\u001B[38;5;142m";
        public static final String MARRON_TEXTO = "\u001B[38;5;94m";
        public static final String NEGRO_TEXTO = "\u001B[30m";
        public static final String AZUL_FONDO = "\u001B[48;5;69m";
    public static void main(String[] args){
        System.out.printf("%27s%n",GRIS_TEXTO +"█"+RESET);
        System.out.printf("%5s%14s%n",NEGRO_TEXTO + "APRENDE JAVA", GRIS_TEXTO+"█");
        System.out.printf("%1s%10s%n",NEGRO_TEXTO + "CON EJERCICIOS", GRIS_TEXTO+"█"+RESET);
        System.out.println("");
        System.out.println("");
        System.out.printf("%1s%10s%n", NEGRO_TEXTO+"Ismael Parra Moussaif", ROJO_TEXTO+"█████████" );
        System.out.printf("%28s%3s%n", "██████", "█");
        System.out.printf("%31s%n", "█████████");
        System.out.printf("%28s%n", "███████" );


        System.out.println(MARRON_TEXTO+"▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒"+ROJO_TEXTO+"██████"+MARRON_TEXTO+"▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");

        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");

    }
}

    
