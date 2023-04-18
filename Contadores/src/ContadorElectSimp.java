public class ContadorElectSimp extends ContadorElect {

    private static double AtualpotenciaContratada = 6.9;
    private static double tarifarioMenor = 0.13;
    private static double tarifarioMaior = 0.16;

    private final double potenciaContratada;

    public ContadorElectSimp(int consumo, double potenciaContratada)
    {
        super(consumo);
        this.potenciaContratada = potenciaContratada;
    }

    @Override
    public double calcularConsumoMes()
    {
        if(potenciaContratada < AtualpotenciaContratada)
        {
            return getCosumo() * tarifarioMenor;
        }
        return getCosumo() * tarifarioMaior;
    }
}
