package Model;

public class ListTreino {
    private int idTreino;
    private int idExercicio;
    private String nome;
    private String tipo;

    public int getIdTreino() {
        return idTreino;
    }

    public void setIdTreino(int idTreino) {
        this.idTreino = idTreino;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ListTreino(int idTreino, int idExercicio, String nome, String tipo) {
        this.idTreino = idTreino;
        this.idExercicio = idExercicio;
        this.nome = nome;
        this.tipo = tipo;
    }
    
    public ListTreino() {
    }
}
