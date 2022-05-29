import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task01 {

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
        System.out.println("---------------------forEach------------------------ ");
        for (String employee:employees
        ) {
            System.out.println(employee);

        }

        //  standard loop : for
        System.out.println("---------------------for loop------------------------ ");
        for (int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i));
        }

        // Iterator interface
        System.out.println("--------------------- Iterator interface------------------------ ");
        Iterator<String> itr = employees.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}
