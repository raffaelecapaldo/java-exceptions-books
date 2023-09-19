package org.lessons.java.library;

public class Libro {

	String title;
	String autor;
	String editor;
	int pagesNumber;
	
	Libro(String title, String autor, String editor, int pagesNumber) throws Exception {
		setTitle(title);
		setAutor(autor);
		setEditor(editor);
		setPagesNumber(pagesNumber);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) throws Exception {
		if (title.isBlank()) throw new Exception("Non hai inserito il titolo");
		this.title = title;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) throws Exception {
		if (autor.isBlank()) throw new Exception("Non hai inserito l'autore");
		this.autor = autor;
	}

	public String getEditor() {
		return editor;
	}

	public void setEditor(String editor) throws Exception {
		if (editor.isBlank()) throw new Exception("Non hai inserito l'editore");
		this.editor = editor;
	}

	public int getPagesNumber() {
		return pagesNumber;
	}

	public void setPagesNumber(int pagesNumber) throws Exception {
		if (pagesNumber <= 0) throw new Exception("Il libro deve avere almeno una pagina");
		this.pagesNumber = pagesNumber;
	}
	
}
