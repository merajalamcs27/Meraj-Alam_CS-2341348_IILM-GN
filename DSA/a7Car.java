public class a7Car {
//Aggregation   has a relation             strong type\
//car ------> engine        relation      strong type , association -----> composition 
//we have to make engine object inside car  so that only when the car exist only then engine exists
//we have to create car class in composition class
    private String carName;
    private Engine engine;
    a7Car(String carName , String engType){
        this.carName = carName;

        engine = new Engine(engType);
    }

    public void displayDetails(){
        System.out.println(carName);
        System.out.println(engine.getEType());
    }
    
}

class Engine{
    private String engType;
    Engine(String engType    ){
        this.engType = engType;
    }

    public String getEType(){
        return engType;
    }
}

class Aggregate{
    public static void main(String[] args) {
        a7Car c1 = new a7Car("BMW", "v8");
        c1.displayDetails();
    }
}
