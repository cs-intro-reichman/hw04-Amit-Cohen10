public class ArrayOps {
    public static void main(String[] args) {
        int [] array = {0,1,2,3,4,6};
        int [] array2 = {0,1,7,3};
        sortarray(array2);
        for(int i=0; i<array2.length; i++){
            System.out.print(array2[i]+ " ");
        }
        System.out.println(contain(array2, array));     
    }
    
    public static int findMissingInt (int [] array) {
        boolean foundelement =false;
        int index =-1;
        for(int i=0; i<array.length; i++){
            foundelement =false;
            index =-1;
            for(int j=0; j<array.length; j++){
                index++;
                if(array[i]==j){
                    foundelement =true;
                }
            }
            if (foundelement==false) {
                return index;
            }
        }
        return array.length;
    }

    public static int secondMaxValue(int [] array) {
        sortarray(array);
        return array[array.length-2];
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        if (contain(array1, array2)==true && contain(array2, array1)==true) {
            return true;
        }
        return false;
    }
    

    public static boolean isSorted(int [] array) {
        int n = array.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (array[j - 1] > array[j]) {
                    //swap the elements
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return false;
    }

    public static void sortarray(int[] array) {
        int n = array.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (array[j - 1] > array[j]) {
                    //swap the elements
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
}
// the function gets two arrays and checks if the array2 contains array1
    public static boolean contain(int [] array1, int [] array2){
        boolean contain = true;
        for(int i=0; i<array1.length; i++){
            contain = false;
            for(int j=0; j<array2.length; j++){
                if (array1[i]==array2[j]) {
                    contain = true;
                }
            }
            if (contain==false) {
                return false;
            }
        }
        return contain;
    }
}
