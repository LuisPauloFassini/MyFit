package Model;

public class ListaDiarioTreino {
    private int idDiario;
    private int idExercicio;
    private String nome;
    private int serie;
    private int repeticoes;
    private int peso;

    public ListaDiarioTreino(int idDiario, int idExercicio, String nome, int serie, int repeticoes, int peso) {
        this.idDiario = idDiario;
        this.idExercicio = idExercicio;
        this.nome = nome;
        this.serie = serie;
        this.repeticoes = repeticoes;
        this.peso = peso;
    }

    public ListaDiarioTreino() {
    }

    public int getIdDiario() {
        return idDiario;
    }

    public void setIdDiario(int idDiario) {
        this.idDiario = idDiario;
    }

    public int getIdExercicio() {
        return idExercicio;
    }

    public void setIdExercicio(int idExercicio) {
        this.idExercicio = idExercicio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public int getRepeticoes() {
        return repeticoes;
    }

    public void setRepeticoes(int repeticoes) {
        this.repeticoes = repeticoes;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
}
