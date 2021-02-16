package fuvar0212;

public class Fuvar {

    private int taxi_id;
    private String indulas;
    private int idotartam;
    private double tavolsag;
    private double viteldíj;
    private double borravalo;
    private String fizetes_modja;

    public Fuvar(String sor) {

        String[] s = sor.split(";");
        this.taxi_id = Integer.parseInt(s[0]);
        this.indulas = s[1];
        this.idotartam = Integer.parseInt(s[2]);
        this.tavolsag = Double.parseDouble(s[3]);
        this.viteldíj = Double.parseDouble(s[4]);
        this.borravalo = Double.parseDouble(s[5]);
        this.fizetes_modja = s[6];

    }

    public int getTaxi_id() {
        return taxi_id;
    }

    public String getIndulas() {
        return indulas;
    }

    public int getIdotartam() {
        return idotartam;
    }

    public double getTavolsag() {
        return tavolsag;
    }

    public double getViteldíj() {
        return viteldíj;
    }

    public double getBorravalo() {
        return borravalo;
    }

    public String getFizetes_modja() {
        return fizetes_modja;
    }

    @Override
    public String toString() {
        return "Fuvar{" + "taxi_id=" + taxi_id + ", indulas=" + indulas + ", idotartam=" + idotartam + ", tavolsag=" + tavolsag + ", viteld\u00edj=" + viteldíj + ", borravalo=" + borravalo + ", fizetes_modja=" + fizetes_modja + '}';
    }

}
