import java.util.*;
class training{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a character");
        char j = sc.next().charAt(0);
    

         if(j>= 78 && j<=125){
            System.out.println("Small alphabet");
            if(j >= 'a' && j <= 'z'){
                System.out.println("");
            }
        }else{
            System.out.println("not an alphabet");
        }

        
    }
}