/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_3_lista_doble;

/**
 *
 * @author brcv1
 */
public class Nodo {
    private int valor;
    private Nodo siguiente;
    private Nodo previo;
    
    public Nodo(){
    this.siguiente = null;
}
    public Nodo(int valor){
        this.valor = valor;
        this.siguiente = null;
        this.previo = null;
    }

    public int getValor() {
        return valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public Nodo getPrevio() {
        return previo;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public void setPrevio(Nodo previo) {
        this.previo = previo;
    }
    
}
