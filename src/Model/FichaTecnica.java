package Model;

import java.sql.Date;

public class FichaTecnica {
    private String data;
    private double altura;
    private double peso;
    private double percGordura;
    private double abdomen;
    private double torax;
    private double quadril;
    private double cintura;
    private double antDir;
    private double antEsq;
    private double bracoDir;
    private double bracoEsq;
    private double coxaDir;
    private double coxaEsq;
    private double pantDir;
    private double pantEsq;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPercGordura() {
        return percGordura;
    }

    public void setPercGordura(double percGordura) {
        this.percGordura = percGordura;
    }

    public double getAbdomen() {
        return abdomen;
    }

    public void setAbdomen(double abdomen) {
        this.abdomen = abdomen;
    }

    public double getTorax() {
        return torax;
    }

    public void setTorax(double torax) {
        this.torax = torax;
    }

    public double getQuadril() {
        return quadril;
    }

    public void setQuadril(double quadril) {
        this.quadril = quadril;
    }

    public double getCintura() {
        return cintura;
    }

    public void setCintura(double cintura) {
        this.cintura = cintura;
    }

    public double getAntDir() {
        return antDir;
    }

    public void setAntDir(double antDir) {
        this.antDir = antDir;
    }

    public double getAntEsq() {
        return antEsq;
    }

    public void setAntEsq(double antEsq) {
        this.antEsq = antEsq;
    }

    public double getBracoDir() {
        return bracoDir;
    }

    public void setBracoDir(double bracoDir) {
        this.bracoDir = bracoDir;
    }

    public double getBracoEsq() {
        return bracoEsq;
    }

    public void setBracoEsq(double bracoEsq) {
        this.bracoEsq = bracoEsq;
    }

    public double getCoxaDir() {
        return coxaDir;
    }

    public void setCoxaDir(double coxaDir) {
        this.coxaDir = coxaDir;
    }

    public double getCoxaEsq() {
        return coxaEsq;
    }

    public void setCoxaEsq(double coxaEsq) {
        this.coxaEsq = coxaEsq;
    }

    public double getPantDir() {
        return pantDir;
    }

    public void setPantDir(double pantDir) {
        this.pantDir = pantDir;
    }

    public double getPantEsq() {
        return pantEsq;
    }

    public void setPantEsq(double pantEsq) {
        this.pantEsq = pantEsq;
    }

    public FichaTecnica() {
    }
    
    public FichaTecnica(String data, double altura, double peso, double percGordura, double abdomen, double torax, double quadril, double cintura, double antDir, double antEsq, double bracoDir, double bracoEsq, double coxaDir, double coxaEsq, double pantDir, double pantEsq) {
        this.data = data;
        this.altura = altura;
        this.peso = peso;
        this.percGordura = percGordura;
        this.abdomen = abdomen;
        this.torax = torax;
        this.quadril = quadril;
        this.cintura = cintura;
        this.antDir = antDir;
        this.antEsq = antEsq;
        this.bracoDir = bracoDir;
        this.bracoEsq = bracoEsq;
        this.coxaDir = coxaDir;
        this.coxaEsq = coxaEsq;
        this.pantDir = pantDir;
        this.pantEsq = pantEsq;
    }
    
}
