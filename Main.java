public class Main {
    public static void main (String[] args)
    {
        System.out.println("Queue Example:");
        // create a queue [2, 15]
        Queue<Integer> q = new Queue<Integer>();
        q.enqueue(2);
        q.enqueue(15);

        System.out.println("Dequeue: " +q.dequeue());
        System.out.println("IsEmpty?: " +q.isEmpty());
        System.out.println("Peek:" + q.peek());
        q.dequeue();


        System.out.println("---------------------------");

        System.out.println("Stack Example:");
        // create a stack [33,12,101]
        Stack<Integer> s = new Stack<Integer>();

        s.push(33);
        s.push(12);
        s.push(101);
        System.out.println("Peek: " +s.peek());
        System.out.println("Pop: " +s.pop());
        System.out.println("Peek:" +s.peek());

    }
}
