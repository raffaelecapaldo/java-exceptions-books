package org.lessons.java.library;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Quanti libri vuoi inserire?: ");
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
				System.out.println("\nLIBRO INSERITO\n");
			} catch (Exception e) {
				System.err.println("Impossibile aggiungere il libro: " + e.getMessage());
				i--;
			}
		}
			sc.close();
			FileWriter writer = null;
			
			String FILE_PATH = "lista.txt";
			try {
				writer = new FileWriter(FILE_PATH);
				
				for (int i = 0; i < booksNumber; i++) {
				  writer.write(books[i].getTitle() + "\n");
				}
				
			} catch (IOException e) {
				System.err.println("Impossibile scrivere il file: " + e.getMessage());
			}
			finally {
				try {
					writer.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			File fileList = new File(FILE_PATH);
			Scanner reader = null;
			try {
				reader = new Scanner(fileList);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("\nLIBRI INSERITI - LISTA (da file)");
			while (reader.hasNextLine()) {
				System.out.println(reader.nextLine());
			}
			reader.close();

	}

}
