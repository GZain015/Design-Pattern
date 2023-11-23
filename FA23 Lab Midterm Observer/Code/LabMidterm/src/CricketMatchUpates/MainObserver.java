/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CricketMatchUpates;

/**
 *
 * @author Zain
 */
public class MainObserver {
    public static void main(String[] args) {
        Cricket_Match1 match1 = new Cricket_Match1();
        Cricket_Match2 match2 = new Cricket_Match2();

        BallByBallCverage ballByBallCoverage = new BallByBallCverage(match1, match2);
        LiveCricketCoverage liveCricketCoverage = new LiveCricketCoverage(match1, match2);

        //match1.detach(ballByBallCoverage); 

        match1.setScore(350);
        match1.setTeams("Pakistan", "England");
        match2.setScore(200);
        match2.setTeams("Australia", "India");
    } 
}
