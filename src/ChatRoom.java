import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.Stack;

public class ChatRoom {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        Deque<Character> st = new ArrayDeque<>();
        st.addLast('h');
        st.addLast('e');
        st.addLast('l');
        st.addLast('l');
        st.addLast('o');

        char[] message = s.nextLine().toCharArray();
        char com = st.peek();
        for (int i = 0; i < message.length; i++) {
            if (message[i] == com) {
                st.pop();
                if (st.isEmpty()) {
                    break;
                }
                com = st.peek();
            }
            if (st.isEmpty()) {
                break;
            }
        }

        if (st.isEmpty()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");

        }
    }
}