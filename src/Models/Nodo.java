package Models;

import java.util.HashSet;
import java.util.Set;

public class Nodo {
    private Nodo nodo;
    private Set<Nodo> nodosAdyacentes;

    public Nodo(int value) {
        this.nodo = new Nodo(value);
        setNodo(nodo);
        this.nodosAdyacentes = new HashSet<>();
    }

    public Nodo getNodo() {
        return nodo;
    }
    public void setNodo(Nodo nodo) {
        this.nodo = nodo;
    }
    public Set<Nodo> getNodosAdyacentes() {
        return nodosAdyacentes;
    }
    public void setNodosAdyacentes(Set<Nodo> nodosAdyacentes) {
        this.nodosAdyacentes = nodosAdyacentes;
    }
    @Override
    public String toString() {
        return "Nodo{" +
                "nodo=" + nodo +
                ", nodosAdyacentes=" + nodosAdyacentes +
                '}';
    }
    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Nodo nodo1 = (Nodo) o;
        return nodo.equals(nodo1.nodo) && nodosAdyacentes.equals(nodo1.nodosAdyacentes);
    }
    @Override
    public int hashCode() {
        int result = nodo.hashCode();
        result = 31 * result + nodosAdyacentes.hashCode();
        return result;
    }*/

    /*
    public boolean isEmpty() {
        return nodosAdyacentes.isEmpty();
    }
    public boolean contains(Nodo nodo) {
        return nodosAdyacentes.contains(nodo);
    }
    public void addNodoAdyacente(Nodo nodo) {
        nodosAdyacentes.add(nodo);
    }
    public void removeNodoAdyacente(Nodo nodo) {
        nodosAdyacentes.remove(nodo);
    }
    public int size() {
        return nodosAdyacentes.size();
    }
    public boolean isAdjacent(Nodo nodo) {
        return nodosAdyacentes.contains(nodo);
    }
    public Set<Nodo> getAdjacentNodes() {
        return nodosAdyacentes;
    }
    public void clearAdjacentNodes() {
        nodosAdyacentes.clear();
    }
    public boolean hasAdjacentNodes() {
        return !nodosAdyacentes.isEmpty();
    }
    public void setAdjacentNodes(Set<Nodo> nodosAdyacentes) {
        this.nodosAdyacentes = nodosAdyacentes;
    }
    public int getDegree() {
        return nodosAdyacentes.size();
    }
    public boolean isIsolated() {
        return nodosAdyacentes.isEmpty();
    }
    public boolean isConnectedTo(Nodo nodo) {
        return nodosAdyacentes.contains(nodo);
    }
    public void connectTo(Nodo nodo) {
        nodosAdyacentes.add(nodo);
    }
        */
}
