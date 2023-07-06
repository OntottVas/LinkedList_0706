
public class Linked {
    Node head;

    public Linked() {
        this.head = null;
    }

    public void add(String data) {
        // create a new Node with the data
        Node newNode = new Node(data);
        // check for null head Node, it is indeed null then I put the first Node in the head's place in the list
        if (this.head == null) {
            this.head = newNode;
        } else {
            // if the head is not null then null check for the nextNode Node till I find an empty Node
            Node currentNode = head.nextNode;
            while (currentNode.nextNode != null) {
                currentNode = currentNode.nextNode;
            }
            // if nextNode Node is empty I insert the new one into its place
            currentNode.setNextNode(newNode);
        }
    }

    public int size() {
        int size = 0;
        Node current = head;
        while (current != null) {
            size++;
            current = current.nextNode;
        }
        return size;
    }

    @Override
    public String toString() {
        // create empty string
        String toString = "";
        // iterate over every node and concatenate their data to the created string
        Node current = head;
        while (current != null) {
            toString += current.data + ", ";
            current = current.nextNode;
        }
        // if there is no nextNode Node, then return with the string
        return "[" + toString.substring(0, toString.length() - 2) + "]";
    }
}

class Node {
    String data;
    Node nextNode;

    public Node(String data) {
        this.data = data;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data='" + data + '\'' +
                ", nextNode=" + nextNode +
                '}';
    }
}
