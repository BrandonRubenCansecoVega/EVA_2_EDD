/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_7_collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author brcv1
 */
public class EVA2_7_COLLECTIONS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList<Integer> lista = new LinkedList<Integer>();
        lista.add(100);
        lista.add(200);
        lista.add(300);
        lista.add(400);
        lista.add(500);
        System.out.println(lista);
        lista.remove(2);
        System.out.println(lista);
           //ARRAYLIST
           ArrayList<String> arraylist = new ArrayList<String>(); 
           arraylist.add("hola");
           arraylist.add("adios");
           arraylist.add("ruben");
           arraylist.add("brandon");
           arraylist.add("apruebeme");
           System.out.println(arraylist);
           arraylist.remove(2);
           System.out.println("Tamaño del arraylist = " + arraylist.size());
           System.out.println(arraylist);
           
           //QUEUE
           Queue<Integer> queue = new LinkedList<Integer>();
           queue.add(100);
           queue.add(200);
           queue.add(300);
           queue.add(400);
           System.out.println(queue.peek());//lee el primer elemento 
           System.out.println(queue.poll());//nuestro pop; lee y elimina el primere elemento
           System.out.println(queue);
           //STACK
           Stack<String> stack = new Stack<String>();
           stack.add("hola");
           stack.add("adios");
           stack.add("mundo");
           stack.add("netbeans");
           System.out.println(stack.peek());
           System.out.println(stack.pop());
           System.out.println(stack);
           
    }
    
}
