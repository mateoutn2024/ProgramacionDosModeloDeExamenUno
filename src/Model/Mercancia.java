package model;

public abstract class Mercancia {
    protected String codMercancia;

    public Mercancia(String codMercancia) throws Exception {
        if (codMercancia.length() != 7) {
            throw new Exception("El código de mercancía debe tener exactamente 7 caracteres.");
        }
        this.codMercancia = codMercancia;
    }

    public String getCodMercancia() {
        return codMercancia;
    }

    public abstract double calcularPrecioFinal();
}
