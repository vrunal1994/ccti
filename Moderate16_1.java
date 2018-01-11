import java.io.*;


class Moderate16_1{
    public static void main(String args[]){
        Moderate16_1 obj = new Moderate16_1();
        obj.swapWOVar(5,9);

    }

    public void swapWOVar(int a, int b){
        
        System.out.println("a= " + a+", b = "+ b);
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("a= " + a+", b = "+ b);

    }
}