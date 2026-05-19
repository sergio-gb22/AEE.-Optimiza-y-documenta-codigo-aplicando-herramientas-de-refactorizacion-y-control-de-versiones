package facturacion;

/**
 * Clase Legacy del sistema de facturación.
 * ADVERTENCIA: Código con alta deuda técnica. No modificar la firma del método.
 */
public class FacturacionLegacy {
    private static final double DESCUENTO_ESTANDAR = 0.15;
    private static final double DESCUENTO_VIP = 0.25;
    // Método a refactorizar
    public double calcularTotal(double importeBase, int tipoCliente, boolean esSocioVip) {
        if (importeBase <= 0) {
            return 0;
    }
        if (tipoCliente == 1 && esSocioVip) {
            return importeBase - (importeBase * DESCUENTO_VIP);
	}
        if (tipoCliente == 1){ 
            return importeBase - (importeBase * DESCUENTO_ESTANDAR);
	}
        if (tipoCliente == 2) {
            return importeBase - (importeBase * 0.05);
        }
        return importeBase;
    }
}