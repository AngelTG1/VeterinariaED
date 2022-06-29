package com.upchiapas.VeterinariaED.modelos;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Veterinaria {

    static Mascota objectoMascota;
    static Mascota[] mascotas;


    static  int arreglo[],id, aux;

    static int cantidad;
    public static void registroMascota(){
        Scanner entrada = new Scanner(System.in);
        String nombre;
        String tipoMascota;
        int id;

        System.out.println("Cuantas Mascotas desea agregar?: ");
        cantidad = entrada.nextInt();
        mascotas = new Mascota[cantidad];
        for(int i=0; i<cantidad; i++){
            System.out.println("MASCOTA: "+(i+1));
            System.out.println("id: ");
            id = entrada.nextInt();
            System.out.println("Nombre: ");
            nombre = entrada.next();
            System.out.println("Tipo: ");
            tipoMascota = entrada.next();
            objectoMascota = new Mascota(id, nombre, tipoMascota);
            mascotas[i] = objectoMascota;
        }
    }

    public static void visualizarMascotas(int cantidad, int id){
        for(int i=0; i<(id-1);i++){
            for(int j=0;j<(id-1);j++){
                if(arreglo[j] > arreglo[j+1]){
                    aux = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = aux;
                }
            }
        }
        System.out.println("Ordenado ///");
        for(int i=0; i<id; i++){
            System.out.println(arreglo[i]);

        }

        for(int i =0; i<cantidad; i++){
            System.out.println("////////////////");
            System.out.println("MASCOTA: "+(i+1));
            System.out.println("Nombre de mascota: "+mascotas[i].getNombre());
            System.out.println("Tipo de mascota: "+mascotas[i].getTipoMoscota());
            System.out.println("////////////////");
        }
    }

    public static void metodoBurbuja(){

        System.out.println();
    }

    public static void VisualizarMenu(){
        int op;
        Scanner entrada = new Scanner(System.in);
        do{
            System.out.println("1. RegistrarMascota");
            System.out.println("2. visualizarMascotas");
            System.out.println("3. Salir");
            op = entrada.nextInt();
            switch (op){
                case 1:
                    registroMascota();
                    break;
                case 2:
                    visualizarMascotas(cantidad, id);
                    //metodoBurbuja();
                    break;
                case 3:
                    break;
            }
        }while(op !=3);
    }
}
