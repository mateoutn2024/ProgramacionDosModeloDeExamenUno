package model;

public class Servicio extends Mercancia {
    private String servicio;
    private double presupuesto;
    private double porcentajeDescuento;
    public boolean enPromocion; // Cambiado a público

    public Servicio(String codMercancia, String servicio, double presupuesto, double porcentajeDescuento, boolean enPromocion) throws Exception {
        super(codMercancia);
        this.servicio = servicio;
        this.presupuesto = presupuesto;
        this.porcentajeDescuento = porcentajeDescuento;
        this.enPromocion = enPromocion;
    }

    @Override
    public double calcularPrecioFinal() {
        if (enPromocion) {
            return presupuesto - (presupuesto * porcentajeDescuento / 100);
        }
        return presupuesto; // Sin promoción
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public boolean isEnPromocion() {
        return enPromocion;
    }

    public void setEnPromocion(boolean enPromocion) {
        this.enPromocion = enPromocion;
    }

    @Override
    public String getCodMercancia() {
        return codMercancia;
    }

    public void setCodMercancia(String codMercancia) {
        this.codMercancia = codMercancia;
    }

    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    @Override
    public String toString() {
        return "Servicio [codMercancia=" + codMercancia + ", servicio=" + servicio + ", presupuesto=" + presupuesto + ", porcentajeDescuento=" + porcentajeDescuento + ", enPromocion=" + enPromocion + "]";
    }
}
