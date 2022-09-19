package java_basics;

public class ControlFlow {
    public static void main(String[] args) {
        boolean hungry = true;

        if(hungry) {
            System.out.println("I'm starving...");
        } else {
            System.out.println("I'm not hungry");
        }

        int hungerRating = 5;
        if(!(hungerRating < 6)) {
            System.out.println("Not hungry");
        } else {
            System.out.println("I'm starving...");
        }

        int month = 6;
        String monthString ;
        switch (month){
            case 1: monthString ="January";
                break;
            case 2: monthString = "February";
                break;
            case 3: monthString ="March";
                break;
            case 4: monthString = "April";
                break;
            default: monthString = "Unknown month";
                break;
        }

        System.out.println(monthString);
    }
}
