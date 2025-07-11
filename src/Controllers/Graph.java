package Controllers;

import java.util.HashSet;
import java.util.Set;

import org.w3c.dom.Node;

import Models.*;

public class Graph {
    private Set<Nodo> nodo;
    

    // Constructor
    public Graph() {
        this.nodo = new HashSet<>();
    }
    public Nodo addNodo(int value) {
        Nodo newNodo = new Nodo(value);
        nodo.add(newNodo);
        return newNodo;
    }
    
    public void addEdge(Nodo nodo1, Nodo nodo2) {
            nodo1.getNodosAdyacentes().add(nodo2);
            nodo2.getNodosAdyacentes().add(nodo1);
        
    }

    public void addEdge1(Nodo nodo1, Nodo nodo2) {
        if (nodo.contains(nodo1) && nodo.contains(nodo2)) {
            nodo1.getNodosAdyacentes().add(nodo2);
            nodo2.getNodosAdyacentes().add(nodo1);
        } else {
            throw new IllegalArgumentException("Uno o ambos nodos no existen en el grafo.");
        }
    }
    
    // motodo para imprimir el grafo
    //para cada nodo imprimir sus nodos adyacentes
    //vertex 0: 1->3->5
    //vertex 1: 0->3
    //vertex 2: 3->4
    public void printGraph() {
        for (Nodo nodo : nodo) {
            System.out.print("vertex " + nodo.getNodo() + ": ");
            for (Nodo adyacente : nodo.getNodosAdyacentes()) {
                System.out.print(adyacente.getNodo() + " ");
            }
            System.out.println();
        }
    }


public Set<Nodo> getNodo() {
        return nodo;
    }
    public void setNodo(Set<Nodo> nodo) {
        this.nodo = nodo;
    }
}
