package sample;

import javafx.collections.ObservableArrayBase;
import javafx.collections.ObservableList;

import java.util.LinkedList;

public class RuleBaseCars {
    /**Rules structure
     * LinkedList
     * Rule name -> variable name , 1 element
     * 2 to n-1 elements->  Conditions
     * n element -> result */

    LinkedList<String> Bicycle = new LinkedList<>();
    LinkedList<String> Tricycle = new LinkedList<>();
    LinkedList<String> Motocycle = new LinkedList<>();
    LinkedList<String> SportCar = new LinkedList<>();
    LinkedList<String> Sedan = new LinkedList<>();
    LinkedList<String> MiniVan = new LinkedList<>();
    LinkedList<String> SUV = new LinkedList<>();
    LinkedList<String> Cycle = new LinkedList<>();
    LinkedList<String> Automobile = new LinkedList<>();

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

    public void ConstructRules()
    {
        Bicycle = ConstructRuleType1(Bicycle,"Bicycle","cycle","2","no");
        Tricycle = ConstructRuleType1(Tricycle,"Tricycle","cycle","3","no");
        Motocycle = ConstructRuleType1(Motocycle,"Motocycle","cycle","2","yes");
        SportCar = ConstructRuleType2(SportCar,"SportCar","automobile","2","small");
        Sedan = ConstructRuleType2(Sedan,"Sedan","automobile","4","medium");
        MiniVan = ConstructRuleType2(MiniVan,"MiniVan","automobile","3","medium");
        SUV = ConstructRuleType2(SUV,"Sport Utility Vehicule","automobile","4","large");
    }

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

    }
}
