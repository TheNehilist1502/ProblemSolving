
import java.io.*;

public class MergeTwoSortedLinkedList {

    public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep) throws IOException {
        while (node != null) {
            System.out.println(String.valueOf(node.data));
            node = node.next;

            if (node != null) {
                System.out.println(sep);
            }
        }
    }

    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {

        SinglyLinkedList mergedList = new SinglyLinkedList();

        while (head1 != null && head2 != null) {
            int pointer1 = head1.data;
            int pointer2 = head2.data;

            // We dont need to set an equal condition as
            // it will be considered to be added by
            // else condition with smaller

            if (pointer1 > pointer2) {
                mergedList.insertNode(pointer2);
                head2 = head2.next;
            } else {
                mergedList.insertNode(pointer1);
                head1 = head1.next;
            }

        }
        // This is to continue insertion of the list that still
        // has values

        if (head1 == null) {
            while (head2 != null) {
                mergedList.insertNode(head2.data);
                head2 = head2.next;
            }
        } else {
            while (head1 != null) {
                mergedList.insertNode(head1.data);
                head1 = head1.next;
            }
        }

        return mergedList.head;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int tests = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int testsItr = 0; testsItr < tests; testsItr++) {
            SinglyLinkedList llist1 = new SinglyLinkedList();

            int llist1Count = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < llist1Count; i++) {
                int llist1Item = scanner.nextInt();
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                llist1.insertNode(llist1Item);
            }

            SinglyLinkedList llist2 = new SinglyLinkedList();

            int llist2Count = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < llist2Count; i++) {
                int llist2Item = scanner.nextInt();
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                llist2.insertNode(llist2Item);
            }

            SinglyLinkedListNode llist3 = mergeLists(llist1.head, llist2.head);

            printSinglyLinkedList(llist3, " ");
            System.out.println("\n");
        }

        scanner.close();
    }
}
