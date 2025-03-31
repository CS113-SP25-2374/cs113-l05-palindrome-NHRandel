public class Main {
    public static void main(String[] args) {

        ArrayListStack<Integer> stack = new ArrayListStack<>();
          stack.push(1);
          stack.push(2);
         System.out.println("Stack: " + stack);
         System.out.println("Pop: " + stack.pop());
         System.out.println("Peek: " + stack.peek());


        CircularArrayQueue<String> queue = new CircularArrayQueue<>();
           queue.offer("first");
           queue.offer("second");
          System.out.println("Queue size: " + queue.size());
          System.out.println("Poll: " + queue.poll());
         System.out.println("Peek: " + queue.peek());


        Palindrome checker = new Palindrome();
          String test = "A man, a plan, a canal: Panama";
          System.out.println("Is '" + test + "' a palindrome? " + checker.isPalindrome(test));
    }
}