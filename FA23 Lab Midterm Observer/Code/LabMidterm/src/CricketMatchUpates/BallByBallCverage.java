/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CricketMatchUpates;

/**
 *
 * @author Zain
 */
public class BallByBallCverage extends CoverageObserver {
    
    BallByBallCverage(Cricket_Match1 match1 , Cricket_Match2 match2){
      this.match1 = match1;
      this.match1.attach(this);
      this.match2 = match2;
      this.match2.attach(this);
   }
    
    public void SelectMatch(Cricket_Match1 match1 , Cricket_Match2 match2){
      System.out.println("Select Matches..");
   }

       

    @Override
    public void update() {
        System.out.println( "Team :" + match1.getTeam1() ); 
        System.out.println( "Score :" +  match1.getScore()  ); 
        System.out.println( "Team :" + match1.getTeam2() );
    }
    
    public void displayBallbyBallCoverage(){
        System.out.println( "Team :" + match1.getTeam1() ); 
        System.out.println( "Score :" +  match1.getScore()  ); 
    }
    

    
}
