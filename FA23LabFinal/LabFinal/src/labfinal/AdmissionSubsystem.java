/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labfinal;

/**
 *
 * @author Zain
 */
class AdmissionSubsystem {
    private AdmissionStrategyContext strategyContext;

    public AdmissionSubsystem(AdmissionStrategyContext strategyContext) {
        this.strategyContext = strategyContext;
    }

    public void handleAdmission() {
        System.out.println("Admission Subsystem: Handling admission");
        strategyContext.executeAdmissionStrategy();
    }
}