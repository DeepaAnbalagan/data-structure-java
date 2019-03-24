import java.util.Stack;
import java.util.StringTokenizer;

public class ReverseWords {
    public static void main(String args[]){
        String words = "Do or do not, there is no try.";
        StringTokenizer st = new StringTokenizer(words);
        Stack<String> stack = new Stack<String>();
        while(st.hasMoreTokens()){
            stack.push(st.nextToken());
        }
        while (!stack.isEmpty()){
            System.out.print(stack.peek() + " ");
            stack.pop();
        }
    }
}
