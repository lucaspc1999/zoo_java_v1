package entites;
public class Mamiferos extends Animal {
    private String tipoPelagem;

    public Mamiferos(String nome, String especie, String corPredominante, String sexo, String tipoPelagem) {
        super(nome, especie, corPredominante, sexo);
        this.tipoPelagem = tipoPelagem;
    }

    public String getTipoPelagem() {
        return tipoPelagem;
    }

    public void setTipoPelagem(String tipoPelagem) {
        this.tipoPelagem = tipoPelagem;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Tipo de Pelagem: " + tipoPelagem + "\n";
    }
}