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

}