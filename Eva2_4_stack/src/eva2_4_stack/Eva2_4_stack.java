/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_4_stack;

/**
 *
 * @author brcv1
 */
public class Eva2_4_stack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pila pila = new Pila();
        pila.push(100);
        pila.push(200);
        pila.push(300);
        pila.push(400);
        pila.push(500);
        pila.imprimirLista();
        System.out.println(pila.Peek());
        System.out.println(pila.pop());
        pila.imprimirLista();
        pila.imprimirListaInv();
    }
    
}
