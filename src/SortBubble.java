public class SortBubble {
    
    public SortBubble() {
        // Constructor vacío
    }

    public void sortAscendente(int[] numeros) {
        int n = numeros.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    // Intercambiar numeros[j] y numeros[j + 1]
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }
    }

    public void sortDescendente(int[] numeros) {
        int n = numeros.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (numeros[j] < numeros[j + 1]) {
                    // Intercambiar numeros[j] y numeros[j + 1]
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }
    }

    public void printArray(int[] numeros) {
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println(); // Salto de línea al final
    }
}

