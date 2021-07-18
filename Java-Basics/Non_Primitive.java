class Point{
        int x;
        int y;
        int z;
        boolean a;
        char h = ' ';
}
    


class New_One{
    public static void main(String[] args) {
        Point p = new Point(); // non primitive 
        Point p1 = p;
        p1.x = 10;
        p1.y = 30;
        int b;
        System.out.println(p1.x);
        System.out.println(p1.y);
        System.out.println(p1.z);
        System.out.println(p1.a);
        System.out.println(p1.h);
        // System.out.println(b);
    }
}