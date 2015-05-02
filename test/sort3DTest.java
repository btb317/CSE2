public class sort3DTest {
    public static void main(String[] args) {
        double[][][] array = new double[1][][];
        double[][] subarray = {
            {18.7, 10.5},
            {22.3, 29.2, 1.2},
            {26.4, 4.6, 3.9}
        };
        array[0] = subarray;
        array = sort3DArray(array);
        for (int i=0; i<array[0].length; i++) {
            for (int j=0; j<array[0][i].length; j++) {
                System.out.print(array[0][i][j]+",\t");
            }
            System.out.println("");
        }
    }
    
    public static double[][][] sort3DArray(double[][][] array) {
        int minIndex=0;
        double temp = 0;
        for (int i=0; i<array.length; i++) {
            for (int j=0; j<array[i].length; j++) {
                for (int k=0; k<array[i][j].length; k++) {
                    minIndex = minFind(array[i][j]);
                    temp = array[i][j][k];
                    array[i][j][k] = array[i][j][minIndex];
                    array[i][j][minIndex] = temp;
                }
            }
        }
        return array;
    }
    
    public static int minFind(double[] array) {
        //finds the element with the lowest value in a portion of an array
        //when there are multiple, defaults to lowest index
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[j]) {
                j = i;
            }
        }
        return j;
    }
}