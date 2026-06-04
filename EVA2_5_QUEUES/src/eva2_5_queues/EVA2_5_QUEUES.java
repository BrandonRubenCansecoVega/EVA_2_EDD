/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_5_queues;

/**
 *
 * @author brcv1
 */
public class EVA2_5_QUEUES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pila pila = new Pila();
        pila.push(100);
        pila.push(200);
        pila.push(300);
        pila.push(400);
        pila.push(500);
        pila.imprimirLista();
        
        pila.imprimirLista();
        pila.imprimirListaInv();
    }
    
}
