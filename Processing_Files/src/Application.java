import com.myExceptions.FooRunTimeException;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws FooRunTimeException {
        File file = new File("mfile.txt");
//        File errorfile = new File("another.txt");
        try {
            Scanner input = new Scanner(file);
            while(input.hasNextLine()) {
                System.out.println(input.nextLine());
            }
            input.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            throw new FooRunTimeException("File not found Exception");
        }
    }

}


