package service;

import model.Mercancia;
import model.Producto;
import model.Servicio;

import java.util.ArrayList;
import java.util.List;

public class Sistema {
    private final List<Mercancia> lstMercancia;

    public Sistema() {
        lstMercancia = new ArrayList<>();
    }

    public Mercancia traerMercancia(String codMercancia) {
        for (Mercancia mercancia : lstMercancia) {
            if (mercancia.getCodMercancia().equals(codMercancia)) {
                return mercancia;
            }
        }
        return null; // No se encontró la mercancía
    }

public List<Mercancia> traerMercancia(boolean enOferta) {
    List<Mercancia> enOfertaList = new ArrayList<>();
    for (Mercancia mercancia : lstMercancia) {
        if (mercancia instanceof Producto p) {
            if (p.esDescuentoEn2daUnidad) {
                enOfertaList.add(p);
            }
        } else if (mercancia instanceof Servicio s) {
            if (s.enPromocion) {
                enOfertaList.add(s);
            }
        }
    }
    return enOfertaList; // Retorna todas las mercancías en oferta
}


    public boolean agregarProducto(String codMercancia, String producto, double precioProducto, double porcentajeDescuento, boolean esDescuentoEn2daUnidad) throws Exception {
        if (traerMercancia(codMercancia) != null) {
            throw new Exception("El producto con ese código ya existe.");
        }
        Producto nuevoProducto = new Producto(codMercancia, producto, precioProducto, porcentajeDescuento, esDescuentoEn2daUnidad);
        return lstMercancia.add(nuevoProducto); // Agrega el producto a la lista
    }

    public boolean agregarServicio(String codMercancia, String servicio, double presupuesto, double par1, boolean enPromocion) throws Exception {
        if (traerMercancia(codMercancia) != null) {
            throw new Exception("El servicio con ese código ya existe.");
        }
        double porcentajeDescuento = 0;
        Servicio nuevoServicio = new Servicio(codMercancia, servicio, presupuesto, porcentajeDescuento, enPromocion);
        return lstMercancia.add(nuevoServicio); // Agrega el servicio a la lista
    }
}
