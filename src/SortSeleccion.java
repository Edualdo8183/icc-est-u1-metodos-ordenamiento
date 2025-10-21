public class SortSeleccion {

    // Constructor (opcional, pero debe tener nombre igual a la clase y sin tipo de retorno)
    public SortSeleccion() {
    }

    public void sortAscendente(int[] numeros) {
        int n = numeros.length;

        for (int i = 0; i < n; i++) {
            int posMenor = i;
            for (int j = i + 1; j < n; j++) {
                if (numeros[j] < numeros[posMenor]) {
                    posMenor = j;
                }
            }

            if (i != posMenor) {
                int aux = numeros[posMenor];
                numeros[posMenor] = numeros[i];
                numeros[i] = aux;
            }
        }
    } 

    public void sortDescendente(int[] numeros) {
        int n = numeros.length;

        for (int i = 0; i < n; i++) {
            int posMenor = i;
            for (int j = i + 1; j < n; j++) {
                if (numeros[j] > numeros[posMenor]) {
                    posMenor = j;
                }
            }

            if (i != posMenor) {
                int aux = numeros[posMenor];
                numeros[posMenor] = numeros[i];
                numeros[i] = aux;
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

