package br.com.exercicio.estrutura_de_dados;

import java.text.Normalizer;
import java.util.Scanner;

public class BinarySearch {
	
	public static String removeAccentuation(String name) {
		return Normalizer.normalize(name, Normalizer.Form.NFD).replaceAll(
				"[^\\p{ASCII}]", "");
	}

	public static String binarySearchForName(String[] vector, String value) {

		int begin = 0;
		int end = vector.length - 1;

		while (begin <= end) {
			int middle = (begin + end) / 2;
			
			String nome = removeAccentuation(vector[middle]);

			if (nome.equalsIgnoreCase(value)) {
				return "the index is " + String.valueOf(middle);
			}
			if (value.compareToIgnoreCase(vector[middle]) > 0) {
				begin = middle + 1;
			} else {
				end = middle - 1;
			}
		}
		return "not found " + value;
	}

	public static String binarySearchForIndex(String[] vector, int value) {

		int begin = 0;
		int end = vector.length - 1;

		while (begin <= end) {
			int middle = (begin + end) / 2;

			if (middle == value) {
				return "the name is " + String.valueOf(vector[middle]);
			}

			if (value > middle) {
				begin = middle + 1;
			} else {
				end = middle - 1;
			}
		}
		return "not found " + value;
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String[] names = { "Raul", "Lilia", "Márcio", "Akuma", "Victor",
				"Rayssa", "Nayara", "Valdeci", "Ilda", "Hélio", "Ronilda",
				"Jefferson", "Júlia", "Nicolas", "Gisele", "Ari", "Miriam",
				"Ana", "Letícia", "Wellington", "João", "Roberta", "Mário",
				"Cléber", "Adriano", "Laura", "Valquíria", "Vânia", "Luiza",
				"Priscila", "Jaiane", "Amanda", "Paula", "Regina", "Maria",
				"Maria Rita", "Marli", "José", "Paulo", "Marcos", "Mauro",
				"Fabrício", "Caio", "Kaique", "Kauê", "Karolina", "Karol",
				"Caroline", "Márcia", "Maria Joana", "Rui", "Monique",
				"Clarice", "Cleide", "Macleide", "Edgar", "Flora", "Merlim",
				"Orides", "Romilda", "Luciana", "Juliana", "Luciano",
				"Juliano", "Ricardo", "Renato", "Matheus", "André", "Lucas",
				"Zilma", "Rogério", "Ruan", "Cláudio", "Daniel", "Miguel",
				"Lourenço", "Marcelo", "Antônio", "Luis Carlos",
				"Luis Fernando", "Cristina", "Mayara", "Débora", "Zé Henrique",
				"Kelvy", "Beatriz", "Bianca", "Sandra", "Silmara", "Sumara",
				"Suellen", "Altieres", "Kamilla", "Camille", "Victória",
				"Patrícia", "Odete", "Leonardo", "Thainara", "Jeyssifer" };

		for (int i = 0; i < 100; i++) {
			for (int j = i + 1; j < 100; j++) {
				if ((names[i].compareTo(names[j])) > 0) {
					String aux = names[i];
					names[i] = names[j];
					names[j] = aux;
				}
			}
		}

		System.out.println("Choose one number: ");
		System.out.println("1 - Name");
		System.out.println("2 - Index");
		int option = input.nextInt();

		if (option == 1) {
			System.out.println("Write the name: ");
			String name = input.next();
			String result = binarySearchForName(names, name);
			System.out.println(result);
		} else if (option == 2) {
			System.out.println("Write the index: ");
			int num = input.nextInt();
			String result = binarySearchForIndex(names, num);
			System.out.println(result);
		} else {
			System.out.println("Not found the option");
		}
	}
}
