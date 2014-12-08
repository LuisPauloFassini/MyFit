package Model;

public class Diario {
    private int id;
    private String dtCri;
    private String obs;

    public Diario(int id, String dtCri, String obs) {
        this.id = id;
        this.dtCri = dtCri;
        this.obs = obs;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDtCri() {
        return dtCri;
    }

    public void setDtCri(String dtCri) {
        this.dtCri = dtCri;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public Diario() {
    }
    
}
