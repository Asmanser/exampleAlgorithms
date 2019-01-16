package by.andersen.training.Dijkstra.Graph;

import java.util.List;

public class Node implements Comparable<Node> {

    private String name;
    private int number;
    private int path;
    private int weightPath;
    private List<Rib> ribs;

    public Node(int number) {
        this.number = number;
    }

    public Node(int number, List<Rib> ribs) {
        this.number = number;
        this.ribs = ribs;
    }

    public Node(String name, int number, List<Rib> ribs) {
        this.name = name;
        this.number = number;
        this.ribs = ribs;
    }

    @Override
    public int compareTo(Node o) {
        return this.getWeightPath() - o.getWeightPath();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getPath() {
        return path;
    }

    public void setPath(int path) {
        this.path = path;
    }

    public int getWeightPath() {
        return weightPath;
    }

    public void setWeightPath(int weightPath) {
        this.weightPath = weightPath;
    }

    public List<Rib> getRibs() {
        return ribs;
    }

    public void setRibs(List<Rib> ribs) {
        this.ribs = ribs;
    }

}
