/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logger;

public class Application {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.logEvent("Application started");
        logger.logEvent("User logged in");
        logger.logEvent("Data saved");
    }
    
}
