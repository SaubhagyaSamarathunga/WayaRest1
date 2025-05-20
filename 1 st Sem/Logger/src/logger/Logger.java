/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logger;

public class Logger {

   private static Logger instance;
   
   private Logger(){
       
   }
   public static Logger getInstance(){
       if(instance==null){
           instance = new Logger();
       }
       return instance;
   }
   public void logEvent(String message){
       System.out.println("Log: "+message);
   }
    
}
