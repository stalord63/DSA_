 class Recursion {

     void print(int i, int n) {                         //PRINT TILL N NAME
         if (i > n)
             return;
         System.out.println("ADITYA");
         print(i + 1, n);
     }

     //*************************************************************************************************
     void print_till_n(int i, int n) {                    //PRINT FROM 1 TO N
         if (i > n) {
             return;

         }
         System.out.println(i);
         print_till_n(i + 1, n);

     }

     //*************************************************************************************************
     void print_nto1(int n, int i) {                    //PRINT FROM N TO 1
         if (n < 1) {
             return;
         }
         System.out.println(n);
         print_nto1(n - 1, i);
     }

     //*************************************************************************************************
     void print_nto1(int n) {                                  //PRINT FROM N TO 1 WITHOUT I
         if (n <1) {
             return;
         }
         System.out.println(n);
         print_nto1(n - 1);
         n = n - 1;


     }

     //*************************************************************************************************
     void print_1ton(int n) {                                  //PRINT FROM N TO 1 WITHOUT I
         if (n <1) {
             return;
         }
         print_1ton(n - 1);
         System.out.println(n);

         n = n - 1;


     }


 }

 public void main(String[] args){

    Recursion obj= new Recursion();
    obj.print_nto1(10);

}
