
package listaenlazada;
/**
 *
 * @author julio
 */
public class ListaEn {
    private Nodo Componente;
    private int Size;
    
    public ListaEn(){
        this.Componente = null;
        this.Size = 0;
    }
    public void Agregar(Object n){
        if(this.Componente == null){
            this.Componente = new Nodo(n);
        }
        else{
            Nodo temporal = this.Componente;
            Nodo Nuevo = new Nodo(n);
            Nuevo.EnlazarNodos(temporal);
            this.Componente = Nuevo;
            this.Size++;
        }
    }
    
    public int getSize(){
        return this.Size+1;
    }
    
    public Object getVal(int index){
        int cont = 0;
        Nodo aux = this.Componente;
        while (cont<index) {            
            aux = aux.getNext();
            cont++;
        }
        return aux.getValue();
    }
    public void Pop(int index){
        int cont = 0;
        Nodo aux = this.Componente;
        if(index == 0)
            this.EliminaFirst();
        else{
            while (cont<index-1) {            
            aux = aux.getNext();
            cont++;
            }
            aux.EnlazarNodos(
                aux.getNext().getNext()
            );
            this.Size--;
        }
    }
    private void EliminaFirst(){
        this.Componente = this.Componente.getNext();
        this.Size -- ;
    }
    public boolean ListaVacia(){
        if(this.Componente == null)
            return true;
        else
            return false;
    }
}
