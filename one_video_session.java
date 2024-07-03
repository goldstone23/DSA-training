import java.util.Stack;

public class one_video_session {
//    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();
//
//        for (int i = 0; i <= 100; i++) {
//            stack.push(i);
//
//            while (stack.isEmpty()) {
//                System.out.println(stack.pop());
//            }
//        }
//
//    }
//    private Node top;
//    private static class Node {
//        int data;
//        Node next;
//        Node(int data) {
//            this.data = data;
//        }
//    }
//    public void push(int data) {
//        Node newNode = new Node(data);
//        newNode.next = top;
//        top = newNode;
//    }
//    public int pop() {
//        if (isEmpty()) {
//            throw new RuntimeException("Stack underflow");
//        }
//
//        int data = top.data;
//        top = top.next;
//        return data;
//    }
//    public int peek() {
//        if (isEmpty()) {
//            throw new RuntimeException("Stack underflow");
//        }
//
//        return top.data;
//    }
//    public boolean isEmpty() {
//        return top == null;
//    }
//    public static void main(String[] args) {
//        Stack stack = new Stack();
//        for (int i = 0; i <= 100; i++) {
//            stack.push(i);
//        }
//        while (!stack.isEmpty()) {
//            System.out.println(stack.pop());
//        }

    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j==0  && i<n/2 || j==n/2 || j== n-1 && i>n/2 || i==n/2 || i==0 && j>n/2 ||i==n-1 && j<n/2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        }

    }

  // for (int j = 0; j < n; j++) {
//                System.out.println("*");
//            System.out.println();
//            }
//            for (int i = n-2; i>=0; i--){
//                for (int j =1; j<n-i-1;j++){
//                    System.out.println(" ");
//                }
//                for (j = 0; j <=2*i; j++){
//                    System.out.println("*");
//                }
//                System.out.println();
//            }