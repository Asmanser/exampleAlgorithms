package by.andersen.training.Dijkstra.Graph;

import java.util.*;
public class MyGraph {

    private List<Node> nodes;

    public MyGraph(List<Node> nodes) {
        this.nodes = nodes;
    }


    public int dijkstra(Node start, Node end) {
        for(Node node : nodes) {
            node.setWeightPath(Integer.MAX_VALUE);
        }
        start.setWeightPath(0);
        Deque<Node> queue = new ArrayDeque<>();
        queue.addFirst(start);
        // Это множество нод для рассмотрения (Какие доступны для рассмотрения)
        Set<Node> setNode = new HashSet<>();
        PriorityQueue<Node> priorityQueue = new PriorityQueue<>();
        Set<Node> set = new HashSet<>();
        set.add(start);
        start.setPath(-1);

        while(!queue.isEmpty()) {
            for(Rib rib : queue.peek().getRibs()) {
                if(rib.getEnd().getWeightPath() > queue.peek().getWeightPath() + rib.getWeight()) {
                    rib.getEnd().setWeightPath(queue.peek().getWeightPath() + rib.getWeight());
                    rib.getEnd().setPath(queue.peek().getNumber());
                }
                if(!set.contains(rib.getEnd())) {
                    setNode.add(rib.getEnd());
                }
            }
            set.add(queue.pop());
            priorityQueue.clear();
            priorityQueue.addAll(setNode);
            if(!priorityQueue.isEmpty())
                queue.add(priorityQueue.peek());
            setNode.remove(priorityQueue.peek());
        }
        Node node = end;
        System.out.print(node.getNumber() + " ");
        while(node.getPath() != -1) {
            System.out.print(node.getPath() + " ");
            for(Node forNode: nodes) {
                if(forNode.getNumber() == node.getPath()) {
                    node = forNode;
                    break;
                }
            }
        }
        return end.getWeightPath();
    }

    public List<Node> getNodes() {
        return nodes;
    }

    public void setNodes(List<Node> nodes) {
        this.nodes = nodes;
    }
}
