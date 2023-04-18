public class ContadorGas extends Contador {

    private static int numContadorGas = 0;
    private static double custo_unitario = 0.8;

    public ContadorGas(int consumo){
        super(consumo);
    }

    @Override
    public double calcularConsumoMes() {
        return custo_unitario * getCosumo();
    }

    @Override
    public String init() {
        numContadorGas++;
        return String.format("GAS-%d", numContadorGas);
    }
}
