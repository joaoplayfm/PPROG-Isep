public abstract class Contador
{

    private String id;
    private int consumo;

    public Contador()
    {
    }

    public Contador(int consumo)
    {
        this.id = init();
        this.consumo = consumo;
    }

    public String getId()
    {
        return id;
    }

    public int getCosumo() {
        return consumo;
    }

    public abstract String init();
    public abstract double calcularConsumoMes();

    @Override
    public String toString()
    {
        return String.format("ID--> %s\nConsumo--> %s", id, consumo);
    }
}
