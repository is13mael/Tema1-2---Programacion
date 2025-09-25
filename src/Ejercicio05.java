public class Ejercicio05 {
    public static final String RESET = "\033[0m";
    public static final String NEGRO = "\u001B[30m";
    public static final String ROJO = "\u001B[31m";
    public static final String VERDE = "\u001B[32m";
    public static final String AMARILLO = "\u001B[33m";
    public static final String AZUL = "\u001B[34m";
    public static final String PURPURA = "\u001B[35m";
    public static final String BLANCO ="\u001B[37m";
    public static final String PURPLE_BRIGHT = "\u001B[0;95m";

    public static void main(String[] args){
        System.out.printf("%-10s%-11s%-14s%-11s%-12s%n","Lunes", "Martes", "Miércoles", "Jueves", "Viernes");
        System.out.printf("%-10s%-11s%-14s%-11s%-12s%n", "═════", "══════", "══════", "══════", "══════");
        System.out.printf("%-15s%-16s%-19s%-16s%-15s%n", AZUL + "SI", AMARILLO + "PROG", AZUL + "SI", VERDE + "IPE I",
         ROJO + "BD");
        System.out.printf("%-15s%-16s%-19s%-16s%-15s%n", AZUL + "SI", AMARILLO + "PROG", AZUL + "SI", VERDE + "IPE I",
         ROJO + "BD");
        System.out.printf("%-15s%-16s%-19s%-16s%-15s%n", PURPURA + "LM", AMARILLO + "PROG", VERDE + "ITE I", 
        AMARILLO + "PROG", 
        NEGRO + "SI");
        System.out.printf("%-15s%-16s%-21s%-16s%-15s%n", PURPURA + "LM", ROJO + "BD", PURPLE_BRIGHT + "DAS",
        AMARILLO + "PROG",
        NEGRO + "ED");
        System.out.printf("%-15s%-16s%-19s%-16s%-15s%n", ROJO + "BD", ROJO + "BD", AMARILLO + "PROG",
         AMARILLO + "PROG", NEGRO + "ED");
        System.out.printf("%-15s%-16s%-19s%-16s%-15s%n", ROJO + "BD", BLANCO + "SASP", AMARILLO + "PROG", PURPURA + "LM", NEGRO + "ED" + RESET);
    }
}
