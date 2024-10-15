package test;

import model.Producto;
import model.Servicio;
import model.Mercancia;
import service.Sistema;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        Sistema sistema = new Sistema();

        try {
            // 1-1 Intentar crear Servicio con codMercancia=8973241 (7 caracteres)
            System.out.println("1-1");
            Servicio s1 = new Servicio("8973241", "Mantenimiento máquina de cortar pasto", 2500.0, 15.0, true);
        } catch (Exception e) {
            System.out.println("Error al crear servicio: " + e.getMessage());
        }

        try {
            // 1-2 Crear e imprimir Servicio con codMercancia=8973241 (7 caracteres)
            System.out.println("1-2");
            Servicio s2 = new Servicio("8973241", "Mantenimiento máquina de cortar pasto", 2500.0, 15.0, true);
            System.out.println(s2);
        } catch (Exception e) {
            System.out.println("Error al crear servicio: " + e.getMessage());
        }

        try {
            // 1-3 Intentar crear Producto con codMercancia=4325970 (7 caracteres)
            System.out.println("1-3");
            Producto p1 = new Producto("4325970", "Manguera de desagote lavarropa", 650.0, 15.0, true);
        } catch (Exception e) {
            System.out.println("Error al crear producto: " + e.getMessage());
        }

        try {
            // 1-4 Crear e imprimir Producto con codMercancia=4325980 (7 caracteres)
            System.out.println("1-4");
            Producto p2 = new Producto("4325980", "Manguera de desagote lavarropa", 650.0, 15.0, true);
            System.out.println(p2);
        } catch (Exception e) {
            System.out.println("Error al crear producto: " + e.getMessage());
        }

        try {
            // 2-1 Calcular e imprimir precio final del servicio
            System.out.println("2-1");
            Servicio s2 = new Servicio("8973241", "Mantenimiento máquina de cortar pasto", 2500.0, 15.0, true);
            System.out.println("Precio final del servicio: " + s2.calcularPrecioFinal());
        } catch (Exception e) {
            System.out.println("Error al calcular precio final del servicio: " + e.getMessage());
        }

        try {
            // 2-2 Calcular e imprimir precio final del producto
            System.out.println("2-2");
            Producto p2 = new Producto("4325980", "Manguera de desagote lavarropa", 650.0, 15.0, true);
            System.out.println("Precio final del producto: " + p2.calcularPrecioFinal());
        } catch (Exception e) {
            System.out.println("Error al calcular precio final del producto: " + e.getMessage());
        }

        try {
            // 3-1 Agregar objetos al sistema
            System.out.println("3-1");
            sistema.agregarProducto("3892870", "Aceite para máquinas", 430.0, 10.0, true);
            sistema.agregarServicio("3892810", "Mantenimiento de cortadora de césped", 2520.0, 15.0, true);
            sistema.agregarProducto("9381920", "Tambor lavarropa", 7500.0, 25.0, false);
            sistema.agregarServicio("3481750", "Mantenimiento estufa", 1250.0, 15.0, false);
        } catch (Exception e) {
            System.out.println("Error al agregar mercancía: " + e.getMessage());
        }

        // 4. Traer todos los objetos en oferta
        System.out.println("4-1");
        List<Mercancia> ofertas = sistema.traerMercancia(true);
        for (Mercancia m : ofertas) {
            System.out.println("En oferta: " + m);
        }
    }
}
