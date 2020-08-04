
package listaenlazada;
/**
 *
 * @author julio
 */
public class Nodo {
    Object value;
    Nodo next;
    public Nodo(Object value){
        this.value = value;
        this.next = null;
    }
    public void EnlazarNodos(Nodo n){
        this.next = n;
    }
    public Object getValue(){
        return value;
    }
    public Nodo getNext(){
        return this.next;
    }
}
