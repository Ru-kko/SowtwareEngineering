package datastructs;

public class Clase02 {
    // Make an array
    public static void Ejemplo01() {
        int array[];
        array = new int[10];
        System.out.println("Index" + " | " + "Data");
        
        for (int i = 0; i < array.length; i++) {
            System.out.println("  " + i + "   |  " + array[i]);
        }
    }
    
    public static  void Ejemplo02() {
        int array[] = {10, 5, 6, 12, 14, 53, 9, 2, 3, 7};

        System.out.println("Index"+ " | " + "Data");
        
        for (int i = 0; i < array.length; i++) {
            System.out.println("    " + i + " |  " + array[i]);
        }
    }
    
    public static void Ejercicio01() {
        int array[] = new int[10];
        
        System.out.printf("|%8s|%8s|\n", "Index", "Value");
        
        for (int i = 0; i < array.length; i++) {
            array[i] = 2 + 2 * i;
        }
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.printf("|%8d|%8d|\n", i,  array[i]);
            }
        }
    } 
}