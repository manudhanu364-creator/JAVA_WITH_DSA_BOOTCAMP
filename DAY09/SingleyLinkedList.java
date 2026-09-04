package DAY09;

public class SingleyLinkedList {

    public static voidi insertArtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    
}
