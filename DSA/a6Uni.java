class a6Uni {
    //Aggregation   has a relation             strong type\
//Uni ------> Professor        relation      weak type ,association -> aggregation  
//University and Professor are created independently , or one after another in aggregation class
    private String uName;
    a6Uni(String name){
        this.uName = name;
    }

    public String getuName(){
        return uName;
    }
    
}

class Prof{
    private String pName ;
    private a6Uni university;
    Prof(String pName, a6Uni univ){
        this.pName = pName;
        this.university = univ;
    }
    void displayDetails(){
        System.out.println(pName);
        System.out.println(university.getuName());
    }

    public static void main(String[] args) {
        a6Uni u1 = new a6Uni("IILM");
        Prof p1 = new Prof("A", u1);
        p1.displayDetails();

    }
}
