package problems;

public class ReversePolishNotation {
    private Node head;
    public int withStack(String[] tokens){
        for (String t: tokens){
            if (t.matches("^-?\\d+$")) {
                int i = Integer.parseInt(t);
                push(i);
            }
            else{
                int left = pop();
                int right = pop();
                int answer;
                switch (t) {
                    case "+" -> answer = left + right;
                    case "-" -> answer = left - right;
                    case "/" -> answer = right / left;
                    case "*" -> answer = left * right;
                    default -> answer = 1;
                }
                push(answer);
            }
        }
        return pop();
    }
    public void push(int value) {
        if (head == null)
            head = new Node(value,null);
        else
            head = new Node(value,head);
    }
    public int pop() {
        int value = head.value;
        head = head.next;
        return  value;
    }
    private static class Node{
        int value;
        Node next;
        private Node(int value,Node next){
            this.value = value;
            this.next = next;
        }
    }
}
