/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labfinal;

/**
 *
 * @author Zain
 */
class AdmissionStrategyContext {
    private AdmissionStrategy strategy;

    public void setAdmissionStrategy(AdmissionStrategy strategy) {
        this.strategy = strategy;
    }

    public void executeAdmissionStrategy() {
        strategy.applyAdmissionStrategy();
    }
}
