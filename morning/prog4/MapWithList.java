package prog4;

import java.util.*;
public class MapWithList {

	public static void main(String args[]) {

		Map<String, List<String>> studentDept = new HashMap<String, List<String>>();
		List<String> students = new ArrayList<String>();
		students.add("abc");
		students.add("def");
		students.add("ghi");
		students.add("jkl");
		students.add("mno");

		studentDept.put("ECE: ", students);
		
		System.out.println(studentDept);
	}
}
