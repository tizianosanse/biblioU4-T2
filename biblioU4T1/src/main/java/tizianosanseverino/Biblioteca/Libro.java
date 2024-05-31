package main.java.tizianosanseverino.Biblioteca;

public class Libro extends ElementoLetterario {

    private String autore;
    private String genere;

    public Libro(String isbn, String titolo,Integer annoPubblicazione, Integer numeroPagine, String autore, String genere) {
        super(isbn, titolo,annoPubblicazione, numeroPagine);
        this.autore = autore;
        this.genere = genere;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }



    public static String toStringFile(Libro libro) {
        return Libro.class.getSimpleName()
                + "@" + libro.isbn
                + "@" + libro.titolo
                + "@" + libro.annoPubblicazione
                + "@" + libro.numeroPagine
                + "@" + libro.autore
                + "@" + libro.genere;
    }



    public static Libro fromStringFile(String stringFile) {
        String[] split = stringFile.split("@");

        return new Libro(split[1], split[2], Integer.valueOf(split[3]), Integer.valueOf(split[4]), split[5], split[6]);
    }

}