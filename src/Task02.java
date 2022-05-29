import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Task02 {

    public static void main(String[] args) throws IOException {
        List<String> employees = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("src/data.txt"))) {

            String line;
            while ((line = br.readLine()) != null) {
                employees.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        //printing the size of collections

        System.out.println("Size of the collection is : "+employees.size());

        //printing the content using :
        //  For Each loop :
        System.out.println("--------------------------------------------- ");
        for (String employee:employees
        ) {
            System.out.println(employee);
        }
        //Hash Set to prevent the repetition
        HashSet<String> set = new HashSet<String>(employees);
        // new list with no repitions
        List<String> newls = new ArrayList<String>(set);
        System.out.println("--------------------------------------------- ");
        System.out.println("List after removing duplicate elements:");
        for (Object ob: newls)
            System.out.println(ob);

    }
}