/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.pruebas;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author jogo
 */
public class Pruebas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> productos = new ArrayList<>();
        int opcion = 0;

        do {
            System.out.println("\n=== MENÚ CRUD ===");
            System.out.println("1. Crear producto");
            System.out.println("2. Listar productos");
            System.out.println("3. Editar producto");
            System.out.println("4. Eliminar producto");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");

            try {
                opcion = sc.nextInt();
                sc.nextLine(); // Limpiar buffer

                switch (opcion) {

                    case 1 -> {
                        System.out.print("Ingrese el nombre del producto: ");
                        String nuevoProducto = sc.nextLine();
                        productos.add(nuevoProducto);
                        System.out.println("Producto agregado con éxito ✅");
                    }

                    case 2 -> {
                        System.out.println("\n📦 Lista de productos:");
                        if (productos.isEmpty()) {
                            System.out.println("No hay productos registrados.");

                        } else {
                            int index = 0;
                            System.out.println(" # " + " producto");
                            for (String producto : productos) {

                                System.out.println(index + "    " + producto);
                                index++;

                            }
                        }

                    }

                    case 3 -> {
                         if(productos.isEmpty()){
                            System.out.println("no hay productos para editar");
                            break;
                        }
                        System.out.print("Ingresa el índice del producto que quieres editar: ");
                        int index = sc.nextInt();
                        sc.nextLine();

                        if (index >= 0 && index < productos.size()) {
                            System.out.print("Escribe el nuevo nombre del producto: ");
                            String nuevoNombreDeProducto = sc.nextLine();
                            productos.set(index, nuevoNombreDeProducto);
                            System.out.println(" Producto editado con éxito.");

                        } else {
                            System.out.println(" Índice inválido.");

                        }

                    }

                    case 4 -> {
                        
                        if(productos.isEmpty()){
                            System.out.println("no hay productos para eliminar");
                            break;
                        }
                        System.out.print("Ingresa el índice del producto que quieres eliminar: ");
                        int index = sc.nextInt();

                        if (index >= 0 && index < productos.size()) {
                            String eliminado = productos.remove(index);
                            System.out.println(" Producto eliminado con éxito." + eliminado);

                        } else {
                            System.out.println("Índice inválido.");

                        }

                    }

                    case 5 -> {
                        System.out.println("Saliendo del programa...");
                        break;

                    }

                    default -> {
                        System.out.println("Opción no válida.");

                    }

                }

            } catch (InputMismatchException e) {
                System.out.println(" Error: Debes ingresar un número.");
                sc.nextLine();
                
            }
            catch(Exception e ){
                 System.out.println(" Ocurrió un error inesperado: " + e.getMessage());
                
            }

        } while (opcion != 5);

    }

}

/*
        
      
        bucle while

        String contraseña = "";

        while (!contraseña.equals("123456")) {
            System.out.print("Escribe la contraseña: ");
            contraseña = sc.nextLine();

        }
        System.out.println("¡Acceso concedido!");
        sc.close();
 */
 /*
        
        bucle for
        
        for (int i = 1; i < 10; i++) {
            System.out.println("1  X "+  i +" ="+ 1*i);
            
        }
        
 */
 /*
        
        Condicionales
        int edad = 19;

        if (edad > 18) {
            System.out.println("eres mayor de edad ");

        } else if (edad < 18) {
            System.out.println("eres menor  de edad ");

        } else {
            System.out.println("tienes 18");

        }
        
 */
