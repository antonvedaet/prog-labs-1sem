import java.util.Random;

public class Lab1{
    public static void main(String[] args){
        long[] d = {25, 23, 21, 19, 17, 15, 13, 11, 9, 7};
        float[] x = new float[15];

        for(int i = 0; i < 15; i++){
            Random rand = new Random();
            float num = (rand.nextFloat()*25-12);
            x[i] = num;
        }
        
        double[][] c = new double[10][15];
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 15; j++){
                if(d[i] == 13){
                    c[i][j] = Math.pow(Math.E, Math.log(Math.E)*(Math.pow(Math.sin(x[j]), 2)));
                }

                if(d[i] == 9 || d[i] == 11 || d[i] == 19 || d[i] == 23 || d[i] == 25){
                    c[i][j] = Math.pow(Math.pow(0.5 * Math.pow(x[j]/(x[j] - 1) , x[j]), 3), Math.pow(Math.pow(Math.E, x[j]), 3)/2);
                }

                else{
                    c[i][j] = Math.cos(Math.pow(2 * Math.pow(x[j], 1/9), 2));
                }
            }
        }
        double inf = Double.POSITIVE_INFINITY;
        for(int i = 0; i < 10; i++){
        for(int j = 0; j < 15; j++){
            if(c[i][j] != inf){
                System.out.printf("%.5f",c[i][j]);
                System.out.print("  ");
        } else {
            System.out.print(c[i][j]+"  ");
            }
                }
        System.out.println();
            }
    }
}

