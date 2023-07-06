
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
            while(currentNode.nextNode != null) {
                currentNode = currentNode.nextNode;
            }
            // if nextNode Node is empty I insert the new one into its place
            currentNode.setNextNode(newNode);
        }
    }

    @Override
    public String toString() {
        if (head == null) {
            return "[]";
        }
        // create empty string
        String toString = "";
        // iterate over every node and concatenate their data to the created string
        toString += head.data;
        Node currentNode = head.nextNode;
        while (currentNode.nextNode != null) {
            toString += ", " + currentNode.data;
        }
        // if there is no nextNode Node, then return with the string
        return toString;
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
