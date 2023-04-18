package Identidade;

public class Identidade {
    private String nome;
    private int idade;

    private final int IDADE_OMISSAO = 0;
    private final String NOME_OMISSAO = "Nao tem nome";

    public Identidade(){
        nome = NOME_OMISSAO;
        idade = IDADE_OMISSAO;
    }

    public Identidade(String nome, int idade){

        this.nome = nome;
        this.idade = idade;
    }

    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }

    public String toString(){
        return String.format("O meu nome é %s e tenho %d anos", nome, idade);
    }
}
