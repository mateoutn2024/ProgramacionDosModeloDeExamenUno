package model;

public class Producto extends Mercancia {
    private final String producto;
    private final double precioProducto;
    private final double porcentajeDescuento;
    public final boolean esDescuentoEn2daUnidad;

    public Producto(String codMercancia, String producto, double precioProducto, double porcentajeDescuento, boolean esDescuentoEn2daUnidad) throws Exception {
        super(codMercancia);
        this.producto = producto;
        this.precioProducto = precioProducto;
        this.porcentajeDescuento = porcentajeDescuento;
        this.esDescuentoEn2daUnidad = esDescuentoEn2daUnidad;
    }

    @Override
    public double calcularPrecioFinal() {
        if (esDescuentoEn2daUnidad) {
            // Si hay descuento en la segunda unidad, se aplica la mitad del porcentaje.
            return precioProducto * 2 - (precioProducto * (porcentajeDescuento / 2) / 100);
        }
        return precioProducto; // Sin descuento
    }

    @Override
    public String toString() {
        return "Producto [codMercancia=" + codMercancia + ", producto=" + producto + ", precioProducto=" + precioProducto + ", porcentajeDescuento=" + porcentajeDescuento + ", esDescuentoEn2daUnidad=" + esDescuentoEn2daUnidad + "]";
    }
}
