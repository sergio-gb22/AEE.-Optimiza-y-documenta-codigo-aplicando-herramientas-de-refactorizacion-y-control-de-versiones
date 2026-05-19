package facturacion;

/**
 * Clase Legacy del sistema de facturación.
 * Esta clase se encarga de Calcular los importes finales que se aplican aplican
 * a los clientes según su tipología y condiciones especiales de socio.
 *
 * @author Sistema de Facturación
 * @since Curso 2025-2026
 */
public class FacturacionLegacy {
    
    /** Porcentaje de descuento aplicado a clientes de tipo 1 que no son VIP (15%). */
    private static final double DESCUENTO_SINEXTRASVIP = 0.15;
    
    /** Porcentaje de descuento aplicado a clientes de tipo 1 que además son socios VIP (25%). */
    private static final double DESCUENTO_VIP = 0.25;
    
    /** Porcentaje de descuento aplicado a clientes de tipo 2 (5%). */
    private static final double DESCUENTO_ESTANDAR = 0.05;

    /**
     * Calcula el importe total final aplicando los descuentos correspondientes.
     * El cálculo se realiza en base al tipo de cliente y su estado de socio VIP.
     * 
     * Reglas aplicadas:
     * Si el importe base es menor o igual a 0, el total devuelto es 0.
     * Si el tipo de cliente es 1 y es socio VIP, se aplica un 25% de descuento.
     * Si el tipo de cliente es 1 pero no es VIP, se aplica un 15% de descuento.
     * Si el tipo de cliente es 2, se aplica un 5% de descuento (estándar).
     * Para cualquier otro tipo de cliente, no se aplica ningún descuento.
     * 
     * @param importeBase El precio inicial antes de aplicar cualquier descuento
     * @param tipoCliente Identificador numérico del tipo de cliente (1 o 2)
     * @param esSocioVip Indicador que determina si el cliente cuenta con beneficios VIP
     * @return El importe final calculado tras aplicar las deducciones correspondientes
     */
    public double calcularTotal(double importeBase, int tipoCliente, boolean esSocioVip) {
        if (importeBase <= 0) {
            return 0;
        }
        if (tipoCliente == 1 && esSocioVip) {
            return importeBase - (importeBase * DESCUENTO_VIP);
        }
        if (tipoCliente == 1){ 
            return importeBase - (importeBase * DESCUENTO_SINEXTRASVIP);
        }
        if (tipoCliente == 2) {
            return importeBase - (importeBase * DESCUENTO_ESTANDAR);
        }
        return importeBase;
    }

}