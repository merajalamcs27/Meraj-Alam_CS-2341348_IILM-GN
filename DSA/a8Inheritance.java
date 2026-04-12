public class a8Inheritance {
    int x = 10;
    int y ;
    a8Inheritance(int z){
        this.y = z;
    }
    
}

class child extends a8Inheritance{
    int x = 8;
    super(int x);
    public static void main(String[] args) {

        child c1 = new child();
        System.out.println(c1.x);
    }
}