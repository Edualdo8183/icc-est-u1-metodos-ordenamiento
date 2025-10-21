

public class App {
    public static void main(String[] args) {
        SortBubble sortBubble = new SortBubble();

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
        sortSeleccion.printArray(numeros);
    }
}
