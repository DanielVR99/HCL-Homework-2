public class Ex2 {

    static int problem(int[] arr, int pos) {
        /*
         * 1. Revisar que ya no quede el ultimo soldado
         * 2. Poner en null la posicion que sigue
         * 3. Buscar el siguiente vivo
         * 4. Mandar el nuevo arreglo con la posicion del vivo
         */
        int muertos = 0;
        int vivo = 0;
        for (int i=0;i<arr.length;i++){
            if(arr[i] == 0){
                muertos++;
            } else{
                vivo = i+1;
            }
        }
        if (muertos == arr.length-1){
            return vivo;
        } else {
            for (int i = pos; i<=arr.length; i++) {
                if (i == arr.length){
                    for (int j = 0; j<arr.length; j++) {
                        if (arr[j] != 0 && arr[j] != arr[pos]) {
                            arr[j] = 0;
                            break;
                        }
                    }
                } else {
                    if (arr[i] != 0 && arr[i] != arr[pos]) {
                        arr[i] = 0;
                        break;
                    }
                }
            }
            for (int i = pos; i<=arr.length; i++) {
                if (i == arr.length){
                    for (int j = 0; j<arr.length; j++) {
                        if (arr[j] != 0 && arr[j] != arr[pos]) {
                            vivo = j;
                            break;
                        }
                    }
                } else {
                    if (arr[i] != 0 && arr[i] != arr[pos]) {
                        vivo = i;
                        break;
                    }
                }
            }
            return problem(arr, vivo);
        }
    }

    static void hw2(int soldierNum) {
        int[] arr = new int[soldierNum];//fill the array with numbers
        for (int i = 0; i < soldierNum; i++) {
            arr[i] = i+1;
        }
        int pos = problem(arr, 0);
        System.out.println(pos);
    }

    public static void main(String[] args) {
        hw2(100);
    }
}
