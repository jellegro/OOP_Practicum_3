package opdracht.b;

public class Voetbalclub {
    private String naam;
    private Integer aantalGewonnen;
    private Integer aantalGelijk;
    private Integer aantalVerloren;

    public Voetbalclub(String naam) {
        this.naam = naam;
        this.aantalGewonnen = 0;
        this.aantalGelijk = 0;
        this.aantalVerloren = 0;
    }

    public void verwerkResultaat(char ch) {
        if (ch == 'w')
            this.aantalGewonnen = this.aantalGewonnen + 1;
        if (ch == 'g')
            this.aantalGelijk = this.aantalGelijk + 1;
        if (ch == 'v')
            this.aantalVerloren = this.aantalVerloren + 1;
    }

    public Integer aantalPunten() {
        return (this.aantalGewonnen * 3) + this.aantalGelijk;
    }

    public Integer aantalGespeeld() {
        return this.aantalGewonnen + this.aantalGelijk + this.aantalVerloren;
    }

    public String toString() {
        return this.naam + " " + this.aantalGespeeld() + " " + this.aantalGewonnen + " " + this.aantalGelijk + " " + this.aantalVerloren + " " + this.aantalPunten();
    }
}
