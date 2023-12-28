/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labfinal;

/**
 *
 * @author Zain
 */
public class AdmissionSystemMain {
   private AdmissionSubsystem admissionSubsystem;
    private AdmissionSystemSubject admissionSystemSubject;

    public AdmissionSystemMainissionSubsystem admissionSubsystem, AdmissionSystemSubject admissionSystemSubject) {
        this.admissionSubsystem = admissionSubsystem;
        this.admissionSystemSubject = admissionSystemSubject;
    }

    public void runAllClasses() {
        System.out.println("Running all classes...");
        admissionSubsystem.handleAdmission();
        admissionSystemSubject.notifyObservers();
    }

    public static void main(String[] args) {
        // Create instances of AdmissionStrategy
        AdmissionStrategy quotaBased = new QuotaBasedAdmission();
        AdmissionStrategy meritBased = new MeritBasedAdmission();

        // Create instance of AdmissionStrategyContext
        AdmissionStrategyContext strategyContext = new AdmissionStrategyContext();

        // Set and execute Quota-based Admission strategy
        strategyContext.setAdmissionStrategy(quotaBased);
        strategyContext.executeAdmissionStrategy();

        // Set and execute Merit-based Admission strategy
        strategyContext.setAdmissionStrategy(meritBased);
        strategyContext.executeAdmissionStrategy();

        // Create instances of AdmissionObserver
        AdmissionObserver admin = new Admin();
        AdmissionObserver parents = new Parents();
        AdmissionObserver students = new Students();
        AdmissionObserver teacher = new Teacher();

        // Create instance of AdmissionSystemSubject
        AdmissionSystemSubject systemSubject = new AdmissionSystemSubject();

        // Attach observers to the subject
        systemSubject.attach(admin);
        systemSubject.attach(parents);
        systemSubject.attach(students);
        systemSubject.attach(teacher);

        // Notify all observers
        systemSubject.notifyObservers();

        // Create instance of ConcreteAdmissionIterator
        ConcreteAdmissionIterator admissionIterator = new ConcreteAdmissionIterator();

        // Use AdmissionIterator methods
        admissionIterator.first();
        admissionIterator.next();
        admissionIterator.isDone();
        admissionIterator.currentItem();

        // Create instance of AdmissionSubsystem with AdmissionStrategyContext
        AdmissionSubsystem admissionSubsystem = new AdmissionSubsystem(strategyContext);

        // Create instance of AdmissionSystemSubject and attach observer
        AdmissionSystemSubject admissionSystemSubject = new AdmissionSystemSubject();
        admissionSystemSubject.attach(admin);

        // Create instance of AdmissionSystem
        AdmissionSystem admissionSystem = new AdmissionSystem(admissionSubsystem, admissionSystemSubject);
        admissionSystem.runAllClasses();
    }

}
