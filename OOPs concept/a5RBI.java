abstract class a5RBI {
    int loginPin;
    a5RBI(int pin){
        this.loginPin = pin;
    }
    protected abstract void ATM();
    protected abstract void login(int pin);   
}
class hdfc extends a5RBI{
    hdfc(int pin){
        super(pin);
    }
    protected void ATM(){
        System.out.println("Atm implemented 2nd");
    }
    protected void login(int pin){
        if(pin == this.loginPin){
            System.out.println("login successful");
        }else{
            System.out.println("login unsuccessfull");
        }
    }
}
class Main{
    public static void main(String[] args) {
        a5RBI a = new hdfc(789);
        a.login(79);
    }
}
