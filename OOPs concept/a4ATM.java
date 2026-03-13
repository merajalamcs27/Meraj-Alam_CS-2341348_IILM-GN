
public class a4ATM {
    //using balance 

    private int balance;
    private int pin;
    a4ATM(int balance , int pin){
        this.balance= balance;
        this.pin   = pin;
    }
    int get(int pin){
        if(pin == this.pin){
            return this.balance;
        }else{
            return -1;
        }
    }

    
    public static void main(String[] args) {
        a4ATM a = new a4ATM(7000,789 );
        System.out.println(a.get(789));
        
    }
}
