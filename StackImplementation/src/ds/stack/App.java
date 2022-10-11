package ds.stack;

public class App {
    public static void main(String[] args) {
        Stack stack = new Stack(10);
//        stack.push(20);
//        stack.push(40);
//        stack.push(60);
//        stack.push(80);
// change char to long and it will work
//        while (!stack.isEmpty()) {
//            long value = stack.pop();
//            System.out.println(value);
//        }

        System.out.println(reverseString("Hello"));
    }

    public static String reverseString(String str){
        Stack stack = new Stack(str.length());
        for (int j = 0; j < str.length(); j++) {
            stack.push(str.charAt(j));
        }

        String result = "";
        while (!stack.isEmpty()) {
            result+= stack.pop();
        }
        return result;

    }
}
