public class JoaoGym
{

    private String nome;

    private String genero;

    private int idade;

    private double peso;

    private double altura;

    private final String NOME_POR_OMISSAO = "sem nome";

    private final String GENERO_POR_OMISSAO = "sem genero";

    private final int IDADE_POR_OMISSAO = 0;

    private final int PESO_POR_OMISSAO = 0;

    private final int ALTURA_POR_OMISSAO = 0;

    private static int totalGinasio = 0;

    public JoaoGym()
    {
        this.nome = NOME_POR_OMISSAO;
        this.genero = GENERO_POR_OMISSAO;
        this.idade = IDADE_POR_OMISSAO;
        this.peso = PESO_POR_OMISSAO;
        this.altura = ALTURA_POR_OMISSAO;
        totalGinasio++;
    }

    public JoaoGym(String nome, int idade)
    {
        this.nome = nome;
        this.idade = idade;
        totalGinasio++;
    }

    public JoaoGym(String nome, String genero, int idade, double peso, double altura)
    {
        this.nome = nome;
        this.genero = genero;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
        totalGinasio++;
    }

    public String getNome()
    {
        return nome;
    }

    public String getGenero()
    {
        return genero;
    }

    public int getIdade()
    {
        return idade;
    }

    public double getAltura()
    {
        return altura;
    }

    public double getPeso()
    {
        return peso;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public void setGenero(String genero)
    {
        this.genero = genero;
    }

    public void setIdade(int idade)
    {
        this.idade = idade;
    }

    public void setPeso(double peso)
    {
        this.peso = peso;
    }

    public void setAltura(double altura)
    {
        this.altura = altura;
    }

    public String toString()
    {
        return String.format("Nome: " + nome + "Genero: " + genero + "Idade: " + idade + "Peso: " + peso + "Altura: " + altura);
    }

    public int diferenca_idades(int idade_outro_atleta){
        return (idade - idade_outro_atleta);
    }

    public double calculo_IMC()
    {
        return (peso / (Math.pow(altura, 2)));
    }

    public String grau_obsidade()
    {
        String saudavel = "saudavel";
        String magro = "magro";
        String obeso = "obeso";

        return String.format(calculo_IMC() < 18 ? magro: calculo_IMC() >=18 || calculo_IMC() < 25 ? saudavel: calculo_IMC() >= 25 ? obeso: obeso);
    }

    public void maisVelho(String outroNome, int outraIdade)
    {
        if (diferenca_idades(outraIdade) > 0){
            System.out.println("O" + outroNome + " é mais novo do que o " + nome);
        }else if (diferenca_idades(outraIdade) < 0){
            System.out.println("O " + outroNome + " é mais velho do que o " + nome);
        }else
            System.out.println("Têm os dois a mesma idade");
    }

    public static int getTotalGinasio(){
        return totalGinasio;
    }
}


