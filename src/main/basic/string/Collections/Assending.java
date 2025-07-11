package collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Assending {

    public static void main(String[] args) {
        
        List<Integer> marks = new ArrayList<>();

        
        marks.add(85);
        marks.add(72);
        marks.add(95);
        marks.add(68);
        marks.add(90);

        System.out.println("Original Marks: " + marks);

        
        Collections.sort(marks);

        System.out.println(" (Ascending): " + marks);

        
        if (!marks.isEmpty()) {
            int highestMark = marks.get(marks.size() - 1);
            System.out.println("Highest Mark: " + highestMark);
        } else {
            System.out.println("The list of marks is empty.");


        }
    }
}

 
