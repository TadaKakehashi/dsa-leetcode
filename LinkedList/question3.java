package LinkedList;

public class question3 {
    public static class LinkedList{
        Node head;
        Node tail;
        int length = 0;

        class Node{
            int data;
            Node next;
            Node(int data){
                this.data = data;
            }
        }

        public void appendNode(int data){
            Node newNode = new Node(data);
            if(head == null){
                head = newNode;
                tail = newNode;
            }
            else{
                tail.next = newNode;
                tail = newNode;
            }
            length++;
        }

        public void printList(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.print("NULL");
            System.out.println();
        }

        //Implementing Find the Kth Node From End
        public Node findKthFromEnd(int k){
            if (head ==  null || k<=0) return null;
            Node slow = head;
            Node fast = head;

            for(int i=0;i<k;i++){
                if(fast == null) return null;
                fast = fast.next;
            }

            while(fast != null){
                slow = slow.next;
                fast = fast.next;
            }
            return slow;
        }

        public static void main(String[] args) {
            LinkedList list = new LinkedList();
            list.appendNode(10);
            list.appendNode(20);
            list.appendNode(30);
            list.appendNode(40);
            list.appendNode(50);

            list.printList();

            System.out.println("Finding Kth Element from the last (k = 2): "+list.findKthFromEnd(2).data);
        }
    }
}
