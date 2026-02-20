public class a11exception {
    public static void main(String[] args) {

        //try - catch should always have child parent relationship  only  not parent child heirarchy 
        try{
            System.out.println(100/0);
        }catch(Exception e){
            System.out.println("Exception");
        }catch(ArithmeticException e){
            System.out.println("AE");
        }
    }
    
}
