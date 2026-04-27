/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_3_lista_doble;

/**
 *
 * @author brcv1
 */
public class ListaDoble {
    private Nodo inicio;
    private Nodo fin;
    private int cont;
    
    
    public ListaDoble(){
    this.inicio = null;
    this.fin = null;
    this.cont = 0;
}
     public void agregar(int valor){
   //O(N)EFICENCIA POR MOVERNOS NODO POR NODO
   //O(1)EFICENCIA POR USAR UN NODO FIN
   Nodo nuevo= new Nodo(valor);    // VAMOS A INSERTAR UN NODO AL FINAL DE LA LISTA
                                   // HAY QUE VERIFICAR QUE ESTADO TIENE LA LISTA
                                   //LISTA VACIA         
        if (inicio==null){
            inicio = nuevo;
            fin=nuevo;
        }else{ 
            // ESTO ES PARA MOVER A TEMP AL ULTIMO NODO
           /* Nodo temp= inicio;
           
            while (temp.getSiguiente()!=null){
            temp=temp.getSiguiente();
            }
            
            temp.setSiguiente(nuevo);
            
/*
            
            */
            
           fin.setSiguiente(nuevo); //Conectamos al nodo nuevo
           fin=nuevo;// 

            }
   }
     public void imprimirLista(){
      
        Nodo temp= inicio;
        
            while (temp!=null){
            System.out.print("["+ temp.getValor()+"]");
            temp=temp.getSiguiente();
            }
            
        System.out.print("");
    }
     public void vaciarLista(){
        
        inicio=null;
        fin=null;
    }
}
