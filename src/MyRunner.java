import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MyRunner {
    public static void main(String[] args) {

        try {
            String location = "C:\\Users\\eddie\\Downloads\\CourseData.csv";
            File file = new File(location);
            Scanner input = new Scanner(file);
            ArrayList<course> data = new ArrayList<course>();

            while(input.hasNextLine()) {
                String line = input.nextLine();
                String[] splitedLine = line.split(",");
        // course cObj1 = new course(splitedLine[0], splitedLine[1], splitedLine[2]);
                course cObj = new course();
                cObj.setCode(splitedLine[0]);
                cObj.setCourse_name(splitedLine[1]);
                cObj.setInstructor(splitedLine[2]);

                data.add(cObj);
            }
            for( course c : data){
                System.out.println(c.getCode() + "|" + c.getCourse_name() + "|" + c.getInstructor());
                System.out.println("================================");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }
    }
}
