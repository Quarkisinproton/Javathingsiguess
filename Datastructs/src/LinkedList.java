import java.util.Scanner;

public class LinkedList {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number For Linked List");
        Node First = new Node(sc.nextInt());
        System.out.println("LinkedList:\n1.Add data at End \n2.View list \n3.Exit");
        int num = sc.nextInt();
        while(num!=3) {
            switch (num) {
                case 1 -> {
                    Node Current = First;
                    while(Current.next!=null){
                        Current = Current.next;
                    }
                    System.out.println("Enter Data to Linked List");
                    Current.next= new Node(sc.nextInt());
                } case 2 -> {
                    System.out.println("Showing Data in Linked List");
                    Node Read = First;
                    int n =1;
                    while(Read!=null){
                        System.out.println("Linked List Node " + n + "=" + Read.data);
                        Read=Read.next;
                        n=n+1;
                    }
//                    Node nothing = First;
//                    for (int IntData = nothing.data,n=1; nothing!= null; nothing = nothing.next,IntData=nothing.data,n++) {
//                        System.out.println("Linked List Node " + n + "=" + IntData);
//                    }
                }default -> System.out.println("Invalid Input");
            }
            num = sc.nextInt();
        }
        sc.close();
    }
}
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next =null;
    }
}