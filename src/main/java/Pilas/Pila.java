/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pilas;

/**
 *
 * @author USUARIO
 */
public class Pila {
    
    private int contNodo = 0;
    private Nodo Cabeza;
    
    public Pila(){
        
    }

    public Pila(Nodo Cabeza) {
        this.Cabeza = Cabeza;
    }
   

    public int getContNodo() {
        return contNodo;
    }

    public void setContNodo(int contNodo) {
        this.contNodo = contNodo;
    }

    public Nodo getCabeza() {
        return Cabeza;
    }

    public void setCabeza(Nodo Cabeza) {
        this.Cabeza = Cabeza;
    }
    
    public void Push(Nodo N){
        contNodo++;
        if(Cabeza == null){
          Cabeza = N;  
        }else{
            N.setAbajo(Cabeza);
            Cabeza.setArriba(N);
            
            Cabeza = N;
        }
    }
    
    public void Pop(){
        if(contNodo > 0){
            contNodo--;
            Cabeza = Cabeza.getAbajo();
            
        }
    }
    
    public String Peek(){
        
        return Cabeza.getDato();
        
    }
    
    
}
