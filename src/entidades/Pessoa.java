package entidades;

public class Pessoa implements Comparable<Pessoa>{
    private String nome;

    public String getNome() {
        return nome;
    }

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "nome='" + nome + '\'' +
                '}';
    }

    @Override
    public int compareTo(Pessoa o) {
        return this.nome.compareTo(o.getNome());
    }
}
