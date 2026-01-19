package LinkedList;
public class question1 {
    public static class linkedList{
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

        public void printList(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.print("NULL");
            System.out.println();
        }

        public boolean checkLoop(){
            if (head == null) return false;
            Node slow = head;
            Node fast = head;

            while(fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;

                if(slow == fast){
                    System.out.println("Loop Detected!");
                    return true;
                }
            }
            return false;
        }

        public static void main(String[] args) {
            linkedList list = new linkedList();
            list.appendNode(10);
            list.appendNode(20);
            list.appendNode(30);
            list.appendNode(40);
            list.appendNode(50);

            list.printList();
            list.tail.next = list.head.next.next;
            System.out.println(list.checkLoop());
        }
    }
}
