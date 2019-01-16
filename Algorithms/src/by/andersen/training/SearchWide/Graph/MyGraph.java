package by.andersen.training.SearchWide.Graph;

import java.util.*;

public class MyGraph {

    private List<Node> nodes;

    public MyGraph(List<Node> nodes) {
        this.nodes = nodes;
    }


    //Operation 1 = SearchElement
    //Operation 2 = Shortest way
    public Node SearchWide(int operation, Node start, Node end) {
        Deque<Node> queue = new ArrayDeque<>();
        queue.addFirst(start);
        Set<Node> set = new HashSet<>();
        set.add(start);
        start.setPath(-1);
        while (!queue.isEmpty()) {
            for(Node node : queue.peek().getRibs()) {
                if(node.getPath() == 0) {
                    node.setPath(queue.peek().getNumber());
                }
                if(node.getNumber() == end.getNumber()) {
                    if(operation == 1)
                        return node;
                } else {
                    if(!set.contains(node) && !queue.contains(node)) {
                        queue.addLast(node);
                    }
                }
            }
            set.add(queue.pop());
        }

        if(operation == 1)
            return null;
        else if(operation == 2) {
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
        }
        return null;
    }

    public List<Node> getNodes() {
        return nodes;
    }

    public void setNodes(List<Node> nodes) {
        this.nodes = nodes;
    }
}
