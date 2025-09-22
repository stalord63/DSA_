 class Recursion {

    void print(int i, int n) {                         //PRINT TILL N NAME
         if (i > n)
             return;
         System.out.println("ADITYA");
         print(i + 1, n);
     }





 }






 public void main(String[] args){

    Recursion obj= new Recursion();
    obj.print(1,7);

}
