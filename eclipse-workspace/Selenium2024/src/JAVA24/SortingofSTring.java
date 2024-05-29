package JAVA24;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class SortingofSTring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		        // Create a list of strings
		        List<String> stringList = new ArrayList<>();
		        stringList.add("Apple");
		        stringList.add("Orange");
		        stringList.add("Banana");
		        stringList.add("Grapes");

		        // Sort the list
		        Collections.sort(stringList);

		        // Print the sorted list
		        System.out.println("Sorted list of strings:");
		        for (String str : stringList) {
		            System.out.println(str);
		        }
		    }
		

	}


