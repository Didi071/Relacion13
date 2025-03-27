import Relacion13.Demarcacion;

public class Prueba2 {
        public static void main(String[] args) {
        Demarcacion delantero = Demarcacion.DELANTERO;    
        Demarcacion otro = Demarcacion.DELANTERO;    
        delantero.name();    // Devuelve un String con el nombre de la constante (DELANTERO)
        delantero.toString();    // Devuelve un String con el nombre de la constante (DELANTERO)
        delantero.ordinal();    // Devuelve un entero con la posición del enum según está declarada (3).
        delantero.compareTo(otro);    // Compara el enum con el parámetro según el orden en el que están declarados lo enum
        Demarcacion.values();    // Devuelve un array que contiene todos los enum
        System.err.println(delantero.name());
        System.out.println(delantero.toString());
        System.out.println(delantero.ordinal());
        System.out.println(delantero.compareTo(otro));
        System.out.println(Demarcacion.values());
    }
}
