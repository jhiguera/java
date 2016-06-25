package cl.arbolbinario2;

/**
 * Created by acer on 24-06-2016.
 */
public class PruebaArbol
{
    public static void main(String args [])
    {
        Arbol arbol = new Arbol();
        int valor;
        String Dato;

       // System.out.println("Insertando los siguientes valores: ");

        //Dato = JOptionPane.showInputDialog("Inserta el numero de nodos que desea ingresar");
        //int n = Integer.parseInt(Dato);
        arbol.insertarNodo(5);
        arbol.insertarNodo(3);
        arbol.insertarNodo(8);
        arbol.insertarNodo(2);
        arbol.insertarNodo(1);
        /*
        for(int i = 1; i <= n; i++ )
        {
            Dato = JOptionPane.showInputDialog("Dame el " + i + " valor para colocar en el Arbol");
            valor = Integer.parseInt(Dato);
            System.out.print(valor + " ");
            arbol.insertarNodo(valor);
        }
        */
        System.out.println("\n\nRecorrido Preorden");
        arbol.recorridoPreorden();

        System.out.println("\n\nRecorrido Inorden");
        arbol.recorridoInorden();

        System.out.println("\n\nRecorrido Postorden");
        arbol.recorridoPosorden();
    }
}