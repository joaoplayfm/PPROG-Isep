public abstract class ContadorElect extends Contador {
    private static int numContadorElect = 0;

    public ContadorElect(int consumo)
    {
        super(consumo);
    }

    @Override
    public String init(){
        numContadorElect++;
        return String.format("ELECT-%d", numContadorElect);
    }
}
