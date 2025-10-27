
public class SortInsertion {

    public void insertionSortAsc(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int actual = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > actual) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = actual;
        }
    }

    public void insertionSortDesc(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int actual = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] < actual) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = actual;
        }
    }

    public void insertionSortStrings(String[] arr) {
        for (int i = 1; i < arr.length; i++) {
            String actual = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].compareTo(actual) > 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = actual;
        }
    }

    public void insertionSortByName(Persona[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Persona actual = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].getNombre().compareTo(actual.getNombre()) > 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = actual;
        }
    }

    public void insertionSortByAge(Persona[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Persona actual = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].getEdad() > actual.getEdad()) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = actual;
        }
    }

    public void printArray(int[] arr) {
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    public void printArray(String[] arr) {
        for (String s : arr) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public void printArray(Persona[] arr) {
        for (Persona p : arr) {
            System.out.println(p);
        }
    }
}
