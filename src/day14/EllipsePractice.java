package day14;

public class EllipsePractice {
    public static void main(String[] args) {
        add(1,2);
        add(1,2,3);
        add(1,2,3,4);
    }

//    public static void add(int a, int b){
//        int c = a+b;
//        System.out.println(c);
//    }
//    public static void add(int a, int b, int c){
//        int d = a+b+c;
//        System.out.println(d);
//    }
//    public static void add(int a, int b, int c , int d){
//        int f = a+b+c+d;
//        System.out.println(f);
//    }


    public static void add(int... ints){
        System.out.println(ints);

        int xyz=0;
        int abc=0;
        for (int a:ints) {
//            System.out.println(a);
            xyz+=a;
        }
        System.out.println(xyz);

    }


}
