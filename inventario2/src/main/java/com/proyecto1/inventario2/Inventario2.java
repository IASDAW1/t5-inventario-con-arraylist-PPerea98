/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.proyecto1.inventario2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class Inventario2 {

    public static void AgregarProducto() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el nombre,precio y cantidad de stock del producto:");
        
        nombreProductos.add(sc.nextLine());
        precioProductos.add(sc.nextDouble());
        stockProductos.add(sc.nextInt());
    }
    
    public static void ActualizarProducto() {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime que producto quieres actualizar:");
        String aux = sc.nextLine();
        if (nombreProductos.contains(aux)) {
            int indice = nombreProductos.indexOf(aux);
            nombreProductos.set(indice, sc.nextLine());
            precioProductos.set(indice, sc.nextDouble());
            stockProductos.set(indice, sc.nextInt());
        } else {
            System.out.println("Producto no encontrado");
        }
        
    }
    
    public static void BuscarProducto() {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime que producto quieres buscar:");
        String aux = sc.nextLine();
        
        if (nombreProductos.contains(aux)) {
            System.out.println("El producto que buscas es: " + nombreProductos.get(nombreProductos.indexOf(aux))+", que tiene un precio de: "+ precioProductos.get(nombreProductos.indexOf(aux))
          +" Y un stock de:" +stockProductos.get(nombreProductos.indexOf(aux)) );
        }
        
    }
    
    public static void MostrarInventario() {
        
        for (int i = 0; i < nombreProductos.size(); i++) {
            System.out.println("Nombre:" + nombreProductos.get(i) + "precio:" + precioProductos.get(i) + "stock:" + stockProductos.get(i));
            
        }
        
    }
    
    static List<String> nombreProductos = new ArrayList<>();
    static List<Double> precioProductos = new ArrayList<>();
    static List<Integer> stockProductos = new ArrayList<>();
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        while (true){
        System.out.println("""
                           Que tarea deseas realizar:
                           1-> Agregar Producto.
                           2-> Actualizar Producto. 
                           3-> Buscar Producto.
                           4-> Mostrar Inventario Actualizado.
                           5-> Salir. """);
        
        int opt = sc.nextInt();
        
        
            
            switch (opt) {
                case 1:
                    AgregarProducto();
                    break;
                case 2:
                    ActualizarProducto();
                    break;
                case 3:
                    BuscarProducto();
                    break;
                case 4:
                    MostrarInventario();
                    break;
                case 5:
                    System.out.println("Hasta Luego amigo");
                    System.exit(0);
            }
            
        }
        
    }
}
