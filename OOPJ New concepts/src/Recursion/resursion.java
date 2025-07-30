package Recursion;

public class resursion {

    //factorial of a number

    public static void main(String[] args) {
        System.out.println(factorail(5));
    }

    public static int factorail(int n){
        int res = 1;
        for (int i = 1 ; i <= n ;i++){
            res = res * i ;
        }
        return res;
    }

}
