package org.lessons.java.library;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Quanti libri vuoi inserire?");
		int booksNumber = Integer.valueOf(sc.nextLine());
		
		Libro books[] = new Libro[booksNumber];
		
		for (int i = 0; i < booksNumber; i++) {
			System.out.print("Titolo libro: ");
			String title = sc.nextLine();
			System.out.print("Autore libro: ");
			String autor = sc.nextLine();
			System.out.print("Editore libro: ");
			String editor = sc.nextLine();
			System.out.print("Numero pagine libro: ");
			int pagesNumber = Integer.valueOf(sc.nextLine());
			
			try {
				books[i] = new Libro(title, autor, editor, pagesNumber);
			} catch (Exception e) {
				System.err.println("Impossibile aggiungere il libro: " + e.getMessage());
				i--;
			}
		}

	}

}
