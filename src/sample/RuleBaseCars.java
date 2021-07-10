package sample;



import java.util.LinkedList;

public class RuleBaseCars {
    /**
     * create  rule
     * Attributes 4 conditions
     * Rule name
     * result of the rule
     * create a constructur
     * create the 9 rules
     * add them to the observable list
     * display data*/

    private String ruleName;
    private String vehiculeType;
    private String num_wheels;
    private String motor;
    private String size;
    private String num_doors;


//constructor
public  RuleBaseCars(String ruleName,String vehiculeType,String num_wheels,String motor,String size , String num_doors){
    this.ruleName= ruleName ;
    this.vehiculeType= vehiculeType ;
    this.num_wheels= num_wheels ;
    this.motor=motor;
    this.size= size;
    this.num_doors= num_doors;
}
    public  RuleBaseCars(){
        this.ruleName= "" ;
        this.vehiculeType= "" ;
        this.num_wheels= "" ;
        this.motor="";
        this.size= "";
        this.num_doors= "";
    }
    /*
    LinkedList<String> Bicycle = new LinkedList<>();
    LinkedList<String> Tricycle = new LinkedList<>();
    LinkedList<String> Motocycle = new LinkedList<>();
    LinkedList<String> SportCar = new LinkedList<>();
    LinkedList<String> Sedan = new LinkedList<>();
    LinkedList<String> MiniVan = new LinkedList<>();
    LinkedList<String> SUV = new LinkedList<>();
    LinkedList<String> Cycle = new LinkedList<>();
    LinkedList<String> Automobile = new LinkedList<>();
*/
    /*public RuleBaseCars(LinkedList<String>Bicycle ,LinkedList<String>Tricycle ,LinkedList<String> Motocycle,LinkedList<String>SportCar ,LinkedList<String> Sedan,LinkedList<String>MiniVan ,LinkedList<String> SUV,LinkedList<String>Cycle ,LinkedList<String> Automobile){
      this.Bicycle=Bicycle;
      this.Tricycle=Tricycle;
      this.Motocycle=Motocycle;
      this.SportCar=SportCar;
      this.Sedan=Sedan;
      this.MiniVan=MiniVan;
      this.SUV =SUV;
      this.Cycle=Cycle;
      this.Automobile=Automobile;
    }*/
    public LinkedList<String> ConstructRuleType1(LinkedList<String> Rule,String RuleName,String VehiculeType, String NumWheels,String Motor){
        Rule.add(RuleName);
        Rule.add(VehiculeType);
        Rule.add(NumWheels);
        Rule.add(Motor);
        return Rule;
    }
    public LinkedList<String> ConstructRuleType2(LinkedList<String> Rule,String RuleName,String VehiculeType, String NumDoors,String Size){
        Rule.add(RuleName);
        Rule.add(VehiculeType);
        Rule.add(Size);
        Rule.add(NumDoors);
        return Rule;
    }

 /*   public void ConstructRules()
    {
        Bicycle = ConstructRuleType1(Bicycle,"Bicycle","cycle","2","no");
        Tricycle = ConstructRuleType1(Tricycle,"Tricycle","cycle","3","no");
        Motocycle = ConstructRuleType1(Motocycle,"Motocycle","cycle","2","yes");
        SportCar = ConstructRuleType2(SportCar,"SportCar","automobile","2","small");
        Sedan = ConstructRuleType2(Sedan,"Sedan","automobile","4","medium");
        MiniVan = ConstructRuleType2(MiniVan,"MiniVan","automobile","3","medium");
        SUV = ConstructRuleType2(SUV,"Sport Utility Vehicule","automobile","4","large");
    }

*/

    /**
     * condition 1 : vehiculeType
     * condition 2 : num_wheels
     * condition 3 : motor
     * condition 4 : size
     * condition 5 : num_doors
     */



    public String getRuleName() {
        return   ruleName;
    }
    public void setRuleName(String ruleName) {
        this.ruleName=ruleName;
    }
    public String getVehiculeType() {
        return   vehiculeType ;
    }
    public void setVehiculeType(String vehiculeType) { this.vehiculeType= vehiculeType; }
    public String getNum_wheels() {
        return num_wheels ;
    }
    public void setNum_wheels(String num_wheels) {
        this.num_wheels= num_wheels;
    }
    public String getMotor() {
        return motor ;
    }
    public void setMotor(String motor) { this.motor=motor;}
    public String getSize() {
        return  size ;
    }
    public void setSize(String size) {
        this.size=size;
    }
    public String getNum_doors() { return  num_doors ; }
    public void setNum_doors(String condition5) {
        this.num_doors=num_doors;
    }

}