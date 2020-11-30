package prog4;

import java.util.*;

public class MultipleValueMap {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		
		Map<String, List<String>> m1 = new HashMap<String, List<String>>();
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("abc");
		a1.add("def");
		m1.put("CSE", a1);
		ArrayList<String> a2 = new ArrayList<String>();
		a2.add("ghi");
		a2.add("jkl");
		m1.put("ECE", a2);
		ArrayList<String> a3 = new ArrayList<String>();
		a3.add("mno");
		a3.add("pqr");
		m1.put("IT", a3);

		for (Map.Entry m : m1.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());

		}

	}
}
