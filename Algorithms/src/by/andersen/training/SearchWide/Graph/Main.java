package by.andersen.training.SearchWide.Graph;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        node1.setRibs(new ArrayList<Node>(Arrays.asList(node2,node3,node5)));
        node2.setRibs(new ArrayList<Node>(Arrays.asList(node1,node3,node6)));
        node3.setRibs(new ArrayList<Node>(Arrays.asList(node1,node2,node4)));
        node4.setRibs(new ArrayList<Node>(Arrays.asList(node3)));
        node5.setRibs(new ArrayList<Node>(Arrays.asList(node1,node6)));
        node6.setRibs(new ArrayList<Node>(Arrays.asList(node2,node5)));
        MyGraph graph = new MyGraph(new ArrayList<>(Arrays.asList(node1,node2,node3,node4,node5,node6)));
        Node node = graph.SearchWide(2,node5,node4);
    }

}
