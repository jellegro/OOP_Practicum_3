package opdracht.a;

public class Zwembad {
    private double Breedte;
    private double Lengte;
    private double Diepte;

    public Zwembad(double Breedte, double Lengte, double Diepte) {
        this.Breedte = Breedte;
        this.Lengte = Lengte;
        this.Diepte = Diepte;
    }

    public void setBreedte(double NieuwBreedte) {
        this.Breedte = NieuwBreedte;
    }

    public void setLengte(double Nieuwlengte) {
        this.Lengte = Nieuwlengte;
    }

    public void setDiepte(double NieuwDiepte) {
        this.Diepte = NieuwDiepte;
    }

    public double getBreedte() {
        return this.Breedte;
    }

    public double getLengte() {
        return this.Lengte;
    }

    public double getDiepte() {
        return this.Diepte;
    }

    public double inhoud() {
        return Breedte * Lengte * Diepte;
    }

    public String toString() {
        return "Dit zwembad is " + this.Breedte + " meter breed, " + this.Lengte + " lang, en " + this.Diepte + " meter diep.";
    }
    // Git 2nd
}
