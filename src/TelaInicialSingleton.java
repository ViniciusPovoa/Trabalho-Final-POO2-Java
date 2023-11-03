


public class TelaInicialSingleton {
    private static TelaInicial telaInicial;

    public static TelaInicial getInstance() {
        if (telaInicial == null) {
            telaInicial = new TelaInicial();
        }
        return telaInicial;
    }
}
