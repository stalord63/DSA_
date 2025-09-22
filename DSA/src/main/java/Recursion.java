 public class Recursion{

    public static void print(int i,int n){
        if(i>n)
            return;
        System.out.println("ADITYA");
        print(i+1,n);
    }


    public static void main(String[] args){
        print(1,6)

    }

}