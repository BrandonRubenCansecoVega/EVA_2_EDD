/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_4_stack;

/**
 *
 * @author brcv1
 */
public class Pila {
     private Nodo inicio;// aqui inicia todo
   private Nodo fin;
   private int cont;//contador de nodos
   public Pila(){
       this.inicio=null;
       this.fin=null;
       this.cont=0;
   }
   public void imprimirLista(){
       Nodo temp=inicio;
        while(temp!=null){
            System.out.println("["+temp.getValor()+"]");
           temp=temp.getSiguiente(); //Me va dar el valor nodo por nodo mientras no sea null 
       }
        
        System.out.println("");  
   }
    public void imprimirListaInv(){//en orden inverso
       Nodo temp=fin;
        while(temp!=null){
            System.out.println("["+temp.getValor()+"]");
           temp=temp.getPrevio(); //Me va dar el valor nodo por nodo mientras no sea null 
       }
        
        System.out.println(" ");   
   }
   public int longitud(){
       return this.cont;
   }
   public void agregar(int valor){
       Nodo nuevo=new Nodo(valor);
       if(inicio==null){
           inicio=nuevo;
           fin=inicio;
       }else{
           fin.setSiguiente(nuevo);
           nuevo.setPrevio(fin);
           fin=nuevo;
           
       }
       this.cont ++;
   } 
   public void vaciarLista(){
            inicio=null;
            fin=null;
   }
   public boolean esVacia() {
    if (inicio == null) {
        return true;
    } else {
        return false;
    }
}
   public void agregarEn(int posi, int valor) {
       //validar;
            //de inicio (0) HASTA FIN (N-1) N--->LONGITUD
    int tamaño = longitud();

    if (posi < 0 || posi > tamaño) {
        throw new RuntimeException("La posicion no existe en la lista");
    } else {
        Nodo nuevo = new Nodo(valor);

        // Insertar al inicio
        if (posi == 0) {
            nuevo.setSiguiente(inicio);//nuevo-->anterior inicio
            if(inicio!=null){
                inicio.setPrevio(nuevo); //anterior inicio---->nuevo
            }
            inicio = nuevo; //nuevo ahora es el inicio
        } else {
            Nodo temp = inicio;
            int cont = 0;

            // llegar a la posicion anterior
            while (cont < posi - 1) {
                temp/*(nodo anterior)*/ = temp.getSiguiente();/*nodosiguiente*/
                cont++;
            }

            // insertar el nodo
            Nodo siguiente = temp.getSiguiente(); // B (8)

              nuevo.setSiguiente(siguiente); // X --> B (nNuevo apunta a ntemp(8)) nNuevo.siguiente = nTemp

              nuevo.setPrevio(temp);         // X <-- A (nNuevo apunta a previo)(osea 32) nNuevo.previo = nTemp.previo


               temp.setSiguiente(nuevo);      // A -->X (previo apunta a nNuevo)nTemp.previo = nNuevo


           if (siguiente != null) {
                siguiente.setPrevio(nuevo); // B <--- X (ntemp.siguiente apunta a nNuevo) nNuevo.previo.siguiente = nNuevo
            }
            
        }
    }
}
   public int EncontrarEn(int posi) {
    if (posi < 0 || posi >= longitud()) {
        throw new RuntimeException("La posicion no existe en la lista");
    }

    Nodo temp = inicio;

    for (int i = 0; i < posi; i++) {
        temp = temp.getSiguiente();
    }

    return temp.getValor();
}
   public void BorrarEn(int posi) {
    int tama = longitud();

    // Validar
    if (posi < 0 || posi >= tama) {
        throw new RuntimeException("La posicion no existe en la lista");
    }

    // Caso: borrar al inicio
    if (posi == 0) {
        inicio = inicio.getSiguiente();
    } else {
        Nodo temp = inicio;
        int cont = 0;

        // llegar al nodo anterior
        while (cont < posi - 1) {
            temp = temp.getSiguiente();
            cont++;
        }

        // desconectar el nodo
        temp.setSiguiente(temp.getSiguiente().getSiguiente());
    }
}
   //PUSH-->Agrega un nodo a la cima de la pila
   //EN MI CODIGO, LA CIMA DE LA PILA ES
   //EL ULTIMO NODO
   public void push(int valor){//O(1)
       agregar(valor);
   }
   //PEEK-->Leer el valor del nodo en la cima de la pila
   public int Peek(){//EFICIENCIA O(1)
       if(fin!=null){
         return fin.getValor();  
       }else 
           throw new RuntimeException("La pila esta vacia");
       
   }
   //POP--->Lee el valor del nodo EN LA CIMA DE LA PILA y lo quitamos de la lista
   //Y ELIMINA EL NODO
   public int pop(){
       int resu = Peek(); // lee el valor 
       //borra el nodo (el ultimo nodo)
       BorrarEn(longitud() - 1);
       return resu;
   }
    
    }
