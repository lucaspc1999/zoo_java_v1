package entites;
public class Animal {
    protected String especie;
    protected String nome;
    protected String corPredominate;
    protected String sexo;

    public Animal(String nome, String especie, String corPredominate, String sexo) {
        this.nome = nome;
        this.especie = especie;
        this.corPredominate = corPredominate;
        this.sexo = sexo;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCorPredominate() {
        return corPredominate;
    }

    public void setCorPredominate(String corPredominate) {
        this.corPredominate = corPredominate;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Espécie: " + especie + "\n" +
                "Nome: " + nome + "\n" +
                "Cor Predominante: " + corPredominate + "\n" +
                "Sexo: " + sexo + "\n";
    }
}