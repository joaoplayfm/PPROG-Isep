public class Main {
    public static void main(String[] args) {

        Contador[] listaContadores = new Contador[10];

        listaContadores[0] = new ContadorGas(5);
        listaContadores[1] = new ContadorGas(2);
        listaContadores[2] = new ContadorElectSimp(50, 7);
        listaContadores[3] = new ContadorElectSimp(30, 5);

        for (int i = 0; i < 4; i++) {
            if (listaContadores[i] instanceof ContadorGas) {
                System.out.println(listaContadores[i].calcularConsumoMes());
            } else {
                System.out.println("é elect");
            }
        }
    }
}
