/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CricketMatchUpates;

/**
 *
 * @author Zain
 */
import java.util.ArrayList;
import java.util.List;

public class Cricket_Match1 implements CricketMatch {

    private List<CoverageObserver> observers = new ArrayList<CoverageObserver>();
    private int score;
    private String team1;
    private String team2;
   
    public int getScore(){
       return score;
    }
    
    public void setScore(int score){
        this.score=score;
    }
    
    public String getTeam1(){
        return team1;
    }
    
    public String getTeam2(){
        return team2;
    }
    
    public void setTeams(String team1, String team2){
        this.team1=team1;
        this.team2=team2;
    }
    

    @Override
    public void attach(CoverageObserver observer) {
        observers.add(observer);		
    }

    @Override
    public void detach(CoverageObserver observer) {
         observers.remove(observer);
    }
    
    @Override
    public void notifyAllObservers(){
      for (CoverageObserver observer : observers) {
         observer.update();
      }
   } 
    
}
