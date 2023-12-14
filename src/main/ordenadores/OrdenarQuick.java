package ordenadores;
public class OrdenarQuick implements Ordenador{

    @Override
    public int[] ordene(int[] array) {

        return array;
    }

    public int quickParticio(int[] array, int inicio, int fim){
        int pivot = array[fim];
        int i = inicio - 1;

        for (int j = inicio; j < fim; j++) {
            if (array[j] <= pivot) {
                i++;
                int temp = array[i+1];
                array[i+1] = array[fim];
                array[fim] = temp;
            }
        }

        int temp = array[i +1];
        array[i +1] = array[fim];
        array[fim] = temp;

        return i;
    }
    
}
