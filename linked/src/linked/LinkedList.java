package linked;

public class LinkedList {
    Node head; // head of list

    private void offerFirst(String new_Element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void insertFirst(String data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    // Linked list Node.
    // This inner class is made static
    // so that main() can access it
    static class Node {

        int data;
        Node next;
        private Object previous;

        // Constructor
        Node(int d)
        {
            data = d;
            next = null;
        }
    }


    public void addFirst(int new_data){
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
    //Method to insert a new node at an index
    public void insertAfter(int index, int new_data){
        Node new_node = new Node(new_data);

        if(index == 0){
            addFirst(new_data);
        }
        else{
            Node node = head;
            for(int i = 0; i< index - 1; i++){
                node = node.next;
            }
            new_node.next = node.next;
            node.next = new_node;
        }
    }
    
    
    public void deleteRecursive (int num) 
    {

        if(head == null){
            return;
        }
         
        deleteRecursive(9);      
              
    }

    // Method to insert a new node
    public static LinkedList insert(LinkedList list, int data)
    {
        // Create a new node with given data
        Node new_node = new Node(data);
        new_node.next = null;

        // If the Linked List is empty,
        // then make the new node as head
        if (list.head == null) {
            list.head = new_node;
        }
        else {
            // Else traverse till the last node
            // and insert the new_node there
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }

            // Insert the new_node at last node
            last.next = new_node;
        }

        // Return the list by head
        return list;
    }

    // Method to print the LinkedList.
    public static void printList(LinkedList list)
    {
        Node currNode = list.head;

        System.out.print("LinkedList: ");

        // Traverse through the LinkedList
        while (currNode != null) {
            // Print the data at current node
            System.out.print(currNode.data + " ");

            // Go to next node
            currNode = currNode.next;
        }
    }

    // Driver code
    public static void main(String[] args) {
        /* Start with the empty list. */
        LinkedList list = new LinkedList();

        //
        // **INSERTION**
        //

        // Insert the values
        list = insert(list, 8);
        list = insert(list, 10);
        list = insert(list, 12);
        list = insert(list, 16);
        list = insert(list, 9);
        list = insert(list, 14);


        // Print the LinkedList
        printList(list);

        // Adding element to front of LinkedList
        /* public boolean offerFirst(E e): Inserts the
         * specified element at the front of this list.
         */
        list.addFirst(25);

        // Displaying List after adding element
        printList(list);
        
        list.deleteRecursive(9);


    }}