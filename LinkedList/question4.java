package LinkedList;

public class question4 {
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

        public void removeDuplicates(){
            Node current = head;
            while(current != null){
                Node runner = current;

                while(runner.next != null){
                    if(runner.next.data == current.data){
                        runner.next = runner.next.next;
                        length--;
                    } else{
                        runner = runner.next;
                    }
                }
                current = current.next;
            }
        }
    }
    
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.appendNode(1);
        list.appendNode(2);
        list.appendNode(3);
        list.appendNode(1);
        list.appendNode(4);
        list.appendNode(2);
        list.appendNode(5);

        list.printList();
        System.out.println("Removing Duplicates!");
        list.removeDuplicates();
        list.printList();
    }
}
