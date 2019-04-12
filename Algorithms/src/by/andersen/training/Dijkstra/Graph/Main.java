package by.andersen.training.Dijkstra.Graph;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {

    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        node1.setRibs(new ArrayList<Rib>(Arrays.asList(new Rib(node1,node2,6),new Rib(node1,node3,1),new Rib(node1,node5,5))));
        node2.setRibs(new ArrayList<Rib>(Arrays.asList(new Rib(node2,node1,6),new Rib(node2,node3,3),new Rib(node2,node6,8))));
        node3.setRibs(new ArrayList<Rib>(Arrays.asList(new Rib(node3,node1,1),new Rib(node3,node2,3),new Rib(node3,node4,4))));
        node4.setRibs(new ArrayList<Rib>(Arrays.asList(new Rib(node4,node3,4))));
        node5.setRibs(new ArrayList<Rib>(Arrays.asList(new Rib(node5,node1,5),new Rib(node5,node6,7))));
        node6.setRibs(new ArrayList<Rib>(Arrays.asList(new Rib(node6,node2,8),new Rib(node6,node5,7))));
        MyGraph graph = new MyGraph(new ArrayList<>(Arrays.asList(node1,node2,node3,node4,node5,node6)));
        int value = graph.dijkstra(node6,node4);
        System.out.println();
        System.out.println(value);
    }

}
