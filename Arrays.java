public class Arrays{
    public static void main(String args[]){

        String[] arrs= {"Volvo" , "Tesla" , "Thar" , "BMW"};
        arrs[1]= "Rolls Royce";
        System.out.println(arrs[2]);
        System.out.println(arrs.length);

        for (int i = 0 ; i<arrs.length ; i++){
            System.out.println(arrs[i]);
        }

        System.out.println();
        int[] num = {2,4,53,2,5,1,4};
        for( int j=0 ; j<num.length ; j++){
            System.out.println(num[j]);
        }

        System.out.println();
        int[][] num1 = {{12,32,22,332},{2,4,2,11}};
        int x = num1[0][2];
        System.out.println(x);

    }
}