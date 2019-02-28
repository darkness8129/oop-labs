import java.util.Random;
public class second {
    public static void main(String[] args) {
        //These values can be changed
        int numS1 = 3;
        int numK1 = 4;
        int numS2 = 4;
        int numK2 = 3;
        int min = -10;
        int max =  10;


        if (numS1 > 0 && numK1 > 0 && numS2 > 0 && numK2 > 0 && numS1 == numK2 && numK1 == numS2 && max > min) {
            short[][] firstArr = create(numS1, numK1, max, min);
            System.out.println("Your first matrix: ");
            printMatrix(firstArr);
            short[][] secondArr = create(numS2, numK2, max, min);
            System.out.println("Your second matrix: ");
            printMatrix(secondArr);
            short[][] finalArr = new short[numS1][numK2];
            for (int i = 0; i < numS1; i++) {
                for (int j = 0; j < numK2; j++) {
                    finalArr[i][j] = 0;
                    for (int x = 0; x < numK1; x++) {
                        finalArr[i][j] += (short) (firstArr[i][x] * secondArr[x][j]);

                    }
                }
            }
            System.out.println("Final matrix: ");
            printMatrix(finalArr);
            int sum = 0;
            for (int j = 0; j < finalArr.length; j++) {
                int minNumber = max*max*numS1;
                for (int i = 0; i < finalArr.length; i++) {
                    if (finalArr[i][j] < minNumber) {
                        minNumber = finalArr[i][j];
                    }
                }
                sum += minNumber;
            }
            System.out.println("The sum of the smallest elements of each column: " + sum);
        }else{
            System.out.println("Matrix can not be multiplied");
        }
    }
        public static short[][] create(int strings, int columns, int max, int min ){
            Random rand = new Random();
            short[][] matrix = new short[strings][columns];
            for (int i = 0; i < strings; i++) {
                for (int j = 0; j < columns; j++) {
                    matrix[i][j] = (short) (rand.nextInt((max - min) + min));
                }
            }
            return matrix;
        }
        public static void printMatrix(short[][] matrix){
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j] + "\t");
                }
                System.out.println();
            }
        }
}