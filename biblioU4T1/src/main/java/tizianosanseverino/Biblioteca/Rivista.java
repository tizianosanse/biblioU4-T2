package main.java.tizianosanseverino.Biblioteca;

import main.java.tizianosanseverino.Enums.Periodicita;

public class Rivista extends ElementoLetterario {
    private Periodicita periodicita;

    public Rivista(String isbn, String titolo, Integer annoPubblicazione, Integer numeroPagine, Periodicita periodicita) {
        super(isbn, titolo, annoPubblicazione, numeroPagine);
        this.periodicita = periodicita;
    }


    public Periodicita getPeriodicita() {
        return periodicita;
    }

    public void setPeriodicita(Periodicita periodicita) {
        this.periodicita = periodicita;
    }

    public static String toStringFile(Rivista rivista) {
        return Rivista.class.getSimpleName()
                + "@" + rivista.isbn
                + "@" + rivista.titolo
                + "@" + rivista.annoPubblicazione
                + "@" + rivista.numeroPagine
                + "@" + rivista.periodicita;
    }

    public static Rivista fromStringFile(String stringFile) {
        String[] split = stringFile.split("@");
        Periodicita periodicita = Periodicita.valueOf(split[5]);

        return new Rivista(split[1], split[2], Integer.valueOf(split[3]), Integer.valueOf(split[4]), periodicita);
    }
}