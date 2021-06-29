package sample;

import java.util.LinkedList;

public class RuleBaseCars {
    /**Rules structure
     * LinkedList
     * Rule name -> variable name , 1 element
     * 2 to n-1 elements->  Conditions
     * n element -> result */

    String ruleName;
    String condition1;
    String condition2;
    String condition3;
    String condition4;

public  RuleBaseCars(String ruleName,String condition1,String condition2,String condition3,String condition4){
    this.ruleName=ruleName;
    this.condition1=condition1;
    this.condition1=condition2;
    this.condition1=condition3;
    this.condition1=condition4;
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
    public String CheckRule(LinkedList<String> Rule){
        String Vehicule =null ;
        if(Rule.get(1).equals("cycle"))
        {
            if(Rule.get(2).equals("2")) {
                if(Rule.get(3).equals("no")) Vehicule ="Bicycle";
                if(Rule.get(3).equals("yes")) Vehicule ="Motocycle";
            }
            if(Rule.get(2).equals("3")) {
               if( Rule.get(3).equals("no")) Vehicule ="Tricycle";
              }
        }
        if(Rule.get(1).equals("automobile")){
            if(Rule.get(2).equals("medium")){
                if(Rule.get(3).equals("4")) Vehicule ="Sedan";
                if(Rule.get(3).equals("3")) Vehicule ="MiniVan";
            }
            if(Rule.get(2).equals("small")){
                if(Rule.get(3).equals("2")) Vehicule ="Sport Car";
            }
            if(Rule.get(2).equals("large")){
                if(Rule.get(3).equals("4")) Vehicule ="Sport Utility Vehicule";
            }

        }
        if(Rule.get(2).equals("3") || Rule.get(2).equals("2") || Rule.get(2).equals("1") ) { Rule.set(1, "cycle");}
        if (Rule.get(2).equals("4")) { Rule.set(1, "automobile"); }

        return Vehicule;

    }
    public void DisplayKnowledgeBase(){
        //interface we hae table of 3 columns : rule /conditions /result
    }

    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    public String getCondition1() {
        return condition1;
    }

    public void setCondition1(String condition1) {
        this.condition1 = condition1;
    }

    public String getCondition2() {
        return condition2;
    }

    public void setCondition2(String condition2) {
        this.condition2 = condition2;
    }

    public String getCondition3() {
        return condition3;
    }

    public void setCondition3(String condition3) {
        this.condition3 = condition3;
    }

    public String getCondition4() {
        return condition4;
    }

    public void setCondition4(String condition4) {
        this.condition4 = condition4;
    }
}