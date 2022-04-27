public class lab1_2 {
    public static void main(String[ ] args){
        //&& operator
        System.out.println((5>3) && (8>5)); //true
        System.out.println((5>3) && (8<5)); //false

        // || operator
        System.out.println((5<3) || (8>5)); //true
        System.out.println((5>3) || (8<5)); //true
        System.out.println((5<3) || (8<5)); //false

        //! operator
        System.out.println(!(5 == 3)); //true
        System.out.println(!(5> 3)); //false


        int a=3;
        int b=4;
        System.out.println(a);
        System.out.println(a==b);
        System.out.println(a<=b);
        System.out.println(a>=b);
        System.out.println(a!=b);
  }
}
