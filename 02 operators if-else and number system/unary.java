public class unary {
    public static void main(String[] args) {
        int x = 5;
        int y = -x;
        int z = -y;
        System.out.println(z);


        int a = 5;
        a = a + 1; //or
        System.out.println(a);
        a += 1; // or
        System.out.println(a);

        System.out.println("Watching increment");
        int p = 5;
        System.out.println(p++); // post  increment --> first print the value and then increment
        System.out.println(p);

        System.out.println(++p); // pre increment --> first increment the value and then print
        System.out.println(p);

        System.out.println("watching decrement");
        int q = 10;
        System.out.println(--q);
        System.out.println(q);

        System.out.println(q--);
        System.out.println(q);
    }
}