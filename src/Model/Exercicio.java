package Model;

public class Exercicio {
    private int id;
    private String nome;
    private String tipoMemb;
    private boolean ativo;

    public Exercicio(int id, String nome, String tipoMemb, boolean ativo) {
        this.id = id;
        this.nome = nome;
        this.tipoMemb = tipoMemb;
        this.ativo = ativo;
    }
    
    public Exercicio() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoMemb() {
        return tipoMemb;
    }

    public void setTipoMemb(String tipoMemb) {
        this.tipoMemb = tipoMemb;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}
