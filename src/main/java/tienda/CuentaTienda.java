package tienda;

/**
 * @author Jubey
 */
public class CuentaTienda {

    private String cliente;
    private double deuda;

    /**
     *
     * @param cliente
     * @param deudaInicial
     */
    public CuentaTienda(String cliente, double deudaInicial) {
        this.cliente = cliente;
        this.deuda = deudaInicial;
    }

    /**
     *
     * @param valor
     */
    public void registrarCompra(double valor) {
        deuda = deuda + valor;
    }

    /**
     *
     * @param valor
     * @return
     */
    public boolean abonar(double valor) {
        if (valor > 0 && valor <= deuda) {
            deuda = deuda - valor;
            return true;
        }
        return false;
    }

    /**
     *
     * @return
     */
    public double getDeuda() {
        return deuda;
    }
}
