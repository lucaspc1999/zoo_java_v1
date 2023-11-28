package entites;
public class Aves extends Animal {
    private String corDoBico;
    private int qntDeOvos;

    public Aves(String nome, String especie, String corPredominante, String sexo, String corDoBico, int qntDeOvos) {
        super(nome, especie, corPredominante, sexo);
        this.corDoBico = corDoBico;
        this.qntDeOvos = qntDeOvos;
    }

    public String getCorDoBico() {
        return corDoBico;
    }

    public void setCorDoBico(String corDoBico) {
        this.corDoBico = corDoBico;
    }

    public int getQntDeOvos() {
        return qntDeOvos;
    }

    public void setQntDeOvos(int qntDeOvos) {
        this.qntDeOvos = qntDeOvos;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Cor do Bico: " + corDoBico + "\n" +
                "Quantidade Média de Ovos: " + qntDeOvos + "\n";
    }
}