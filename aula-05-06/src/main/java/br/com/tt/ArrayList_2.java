package br.com.tt;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_2 {

	public static void main(String[] args) {
		List lista = new ArrayList();
		lista.add("Pedro");
		lista.add(1);
		lista.add(new ArrayList_2());

		for (Object val : lista) {
			System.out.println(val.getClass());
			System.out.println("\t" + val.getClass().getSimpleName());
			if (val instanceof String) {
				System.out.println(((String) val).toUpperCase());
			} else if (val instanceof Integer) {
				System.out.println(((Integer) val + 10));
			}
		}
	}

}
