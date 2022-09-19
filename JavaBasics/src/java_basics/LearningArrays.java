package java_basics;

public class LearningArrays {
    public static void main(String[] args) {
        double []values = new double[100];
        values[0] = 1000;
        values[1] = 1;
        values[99] = 9929; //last position

        System.out.println(values[0]);

        String []words = new String[] {"My", "Name", "is"};
        System.out.println(words[2]);
    }
}
