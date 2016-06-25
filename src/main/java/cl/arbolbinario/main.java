package cl.arbolbinario;

/**
 * Created by acer on 11-06-2016.
 */
public class main {

    public static void main(String[] args){

        TreeMap arbol = new TreeMap();
        arbol.add(1,"papa");
        arbol.add(2,"mama");
        arbol.add(5,"hermano");
        arbol.add(4,"hermano");

        System.out.println(arbol.get(5) );

    }

}
