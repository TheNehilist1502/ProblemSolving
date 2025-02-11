public class QueueGame {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        int q = scanner.nextInt();
        scanner.nextLine();
        queueGame(q);

    }

    // There is 3 ways to implement the Queue interface:
    // * LinkedList<>() -> is known from before
    // * PriorityQueue<>() -> orders the queue in ascending order for nums and
    // alphabets
    // * PriorityBlockingQueue<>() -> the same as priorityQueue buts unbounded for
    // thread safety

    private static void queueGame(int q) {
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < q; i++) {
            int type = scanner.nextInt();

            // it is better to use switch case instead of if/else

            switch (type) {
                case 1:
                    queue.add(scanner.nextInt());
                    break;
                case 2:
                    queue.poll();
                    break;
                case 3:
                    System.out.println(queue.peek());
                    break;
            }
        }
    }

}
