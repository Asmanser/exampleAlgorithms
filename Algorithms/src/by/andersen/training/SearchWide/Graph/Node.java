package by.andersen.training.SearchWide.Graph;

import java.util.List;

public class Node {

    private String name;
    private int number;
    private int path;
    private List<Node> ribs;

    public Node(int number) {
        this.number = number;
    }

    public Node(int number, List<Node> ribs) {
        this.number = number;
        this.ribs = ribs;
    }

    public Node(String name, int number, List<Node> ribs) {
        this.name = name;
        this.number = number;
        this.ribs = ribs;
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

    public List<Node> getRibs() {
        return ribs;
    }

    public void setRibs(List<Node> ribs) {
        this.ribs = ribs;
    }

}
