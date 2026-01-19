//Find Middle Node (876)
package LinkedList;

public class question2 {
     public static class LinkedList{
        Node head;
        Node tail;
        int length;
    
        class Node{
            int data;
            Node next;

            Node(int data){
                this.data = data;
            }
        }
        
        public void appendNode(int data){
            Node newNode = new Node(data);
            if(length == 0){
                head = newNode;
                tail = newNode;
            }
            else{
                tail.next = newNode;
                tail = newNode;
            }
            length++;
        }

        public Node getMiddleUsingLength(){
            if(head == null) return null;

            int mid = length/2;
            Node temp = head;

            for(int i=0;i<mid;i++){
                temp = temp.next;
            }
            return temp;
        }

        public Node getMiddleNoLength(){
            if (head == null) return null;
            Node temp = head;
            int count = 0;

            while(temp != null){
                count++;
                temp = temp.next;
            }
            
            int mid = count/2;
            temp = head;

            for(int i=0;i<mid;i++){
                temp = temp.next;
            }

            return temp;
        }

        public Node getMiddleOptimal(){
            if (head == null) return null;

            Node slow = head;
            Node fast = head;

            while(fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
            }

            return slow;
        }

        public void printList(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("NULL");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.appendNode(10);
        list.appendNode(20);
        list.appendNode(30);
        list.appendNode(40);
        list.appendNode(50);

        list.printList();

        System.out.println("The Middle(1) Element is: "+list.getMiddleUsingLength().data);

        System.out.println("The Middle(2) Element is: "+list.getMiddleNoLength().data);

        System.out.println("The Middle(3) Element is: "+list.getMiddleOptimal().data);
    }
}
