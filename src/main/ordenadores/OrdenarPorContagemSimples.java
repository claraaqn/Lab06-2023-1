package ordenadores;

public class OrdenarPorContagemSimples implements Ordenador{

    @Override
    public int[] ordene(int[] array) {
        int tamanho = array.length;
        int max = array[0];
        for (int i = 1; i < tamanho; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        int[] cont = new int[max + 1];

        for (int i = 0; i < tamanho; i++) {
            cont[array[i]]++;
        }

        int indice = 0;
        for (int i = 0; i <= max; i++) {
            while (cont[i] > 0) {
                array[indice++] = i;
                cont[i]--;
            }
        }
        return array;
    }
}
