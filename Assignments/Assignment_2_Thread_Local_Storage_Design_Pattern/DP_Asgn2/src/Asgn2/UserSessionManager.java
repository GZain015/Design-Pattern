/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Asgn2;

/**
 *
 * @author Zain
 */
public class UserSessionManager {
    private static ThreadLocal<User> userThreadLocal = new ThreadLocal<>();

    public void startSession(User user) {
        userThreadLocal.set(user);
        System.out.println("Session started for user: " + user.getUsername());
    }

    public void endSession() {
        User user = userThreadLocal.get();
        System.out.println("Ending session for user: " + user.getUsername());
        userThreadLocal.remove();
    }

    public User getUser() {
        return userThreadLocal.get();
    }

}
