/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leccion1;

/**
 *
 * @author Bryan
 */
public class Leccion1 {//Se incia la clase

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {//Se inicia el main
        
        //Se declaran e inciailizan los arreglos
        double[] arreglo1 = {110, 220, 430, 140, 250, 460};
        double[] arreglo2 = {10, 20, 30, 40, 50, 60};
        double[]arregloTotal = new double[6];
        double promedio = 0; // Se declara e incializa la variable promedio que almacenará las sumas del arreglo total
        String cadena = String.format("\nArreglo 1\tArreglo 2\tResultado\n");//Se declara el string format que contiene el encabezado
        
        //En este for se realizan todos procesos de sumas y promedios
        for (int i = 0; i < arregloTotal.length; i++) {
            
            arregloTotal[i] = (arreglo1[i] + arreglo2[i])/2;//Se almacenan los proemdios de los dos arreglos en el arreglo total
            promedio = promedio + arregloTotal[i];//Se calcula la suma para scar el promedio de los datos del arreglo total
            cadena = String.format("%s%.0f\t\t%.0f\t\t%.0f\n", cadena,arreglo1[i], arreglo2[i], arregloTotal[i]);//Se almacenan los datos en el string format
            
        }
        
        //Se presenta el reporte y el promedio
        System.out.printf(cadena);
        System.out.printf("El promedio del arreglo 3 es: %.2f\n", promedio/arregloTotal.length);
                    
    }//Se cierra el main
    
}//Se cierra la clase
