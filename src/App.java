import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        /*SortBubble sortBubble = new SortBubble();
        int[] numeros = {5, 2, 9, 1, 7};
         System.out.println("Original:");
        sortBubble.printArray(numeros);

        System.out.println("Ascendente:");
        sortBubble.sortAscendente(numeros);
        sortBubble.printArray(numeros);

        System.out.println("Descendente:");
        sortBubble.sortDescendente(numeros);
        sortBubble.printArray(numeros);

        SortSeleccion sortSeleccion = new SortSeleccion();
        System.out.println("Metodo de seleccion:");
        System.out.println("Original");
        System.out.println("");
        sortSeleccion.sortAscendente(numeros);
        sortSeleccion.printArray(numeros)/* /* */

        SortInsertion sortInsertion = new SortInsertion();

        System.out.println("\nPrimero \n");
        System.out.println("Trabajo en casa");
        System.out.println("Estudiante: Eduardo Ramon");
        System.out.println("Método Inserción");

        int[] numeros = {10, 0, -5, 5, 15, 2};

        System.out.println("Original:");
        sortInsertion.printArray(numeros);

        sortInsertion.insertionSortAsc(numeros);
        System.out.println("Ordenado Ascendente:");
        sortInsertion.printArray(numeros);

        sortInsertion.insertionSortDesc(numeros);
        System.out.println("Ordenado Descendente:");
        sortInsertion.printArray(numeros);

        System.out.println("\nSegundo \n");
        System.out.println("Estudiante: Eduardo Ramon");

        String[] nombres = {"Pedro", "Ana", "Maria", "Luis", "Juan"};
        System.out.println("Array de Nombres Original:");
        sortInsertion.printArray(nombres);

        sortInsertion.insertionSortStrings(nombres);
        System.out.println("Ordenado por Nombre:");
        sortInsertion.printArray(nombres);

        System.out.println("\nTercero \n");
        System.out.println("Estudiante: Eduardo Ramon");

        Persona[] personas = {
            new Persona("Pedro", 30),
            new Persona("Ana", 25),
            new Persona("Maria", 28)
        };

        System.out.println("Array de Personas Original:");
        sortInsertion.printArray(personas);

        sortInsertion.insertionSortByName(personas);
        System.out.println("\nOrdenado por Nombres de Personas:");
        sortInsertion.printArray(personas);

        System.out.println("\nCuarto \n");
        System.out.println("Estudiante: Eduardo Ramon");

        sortInsertion.insertionSortByAge(personas);
        System.out.println("\nOrdenado por EDAD de Personas:");
        sortInsertion.printArray(personas);
    }
}