//2

public class Student {
    int score;
    Student(int score ){
        this.score = score;
    }


    void boostScore(Student curr, int bonus){
            curr.score += bonus;
        }


    public static void main(String[] args) {
        Student s1 = new Student(90);
        System.out.println("Student current score");
        System.out.println(s1.score);
        s1.boostScore(s1,40);
        System.out.println("Student score with bonus");
        System.out.println(s1.score);

        Swap ss1 = new Swap(7);
        Swap ss2 = new Swap(6);
        System.out.println("ss1 and ss2 data");
        System.out.println(ss1.data+" "+ss2.data);
        ss1.SwapObject(ss1, ss2);
        System.out.println("Swapped data :");
        System.out.println(ss1.data+" "+ss2.data);
        ATM ac = new ATM(123,786,50000000);
        System.out.println(ac.accountNo+" "+ac.balance);
        

    }
    
}

class Swap{
    int data ;
    Swap(int data){
        this.data = data;
    }

    void SwapObject(Swap s1 , Swap s2){
        int temp = s1.data;
        s1.data = s2.data;
        s2.data = temp;
    }
}

class ATM{
    int accountNo;
    private int pin;
     int balance;

    ATM(int accountNo,int pin,int balance){
        this.accountNo = accountNo;
        this.pin = pin;
        this.balance   = balance;

    }

    public int get(int data){
        if(data == 789){
        return balance;}
        else{
            return -1;
        }
    }
}
  


