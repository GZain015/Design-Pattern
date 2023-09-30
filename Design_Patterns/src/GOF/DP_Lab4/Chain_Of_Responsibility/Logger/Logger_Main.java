/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GOF.DP_Lab4.Chain_Of_Responsibility.Logger;

/**
 *
 * @author fa20-bse-017
 */
public class Logger_Main {
    private static AbstractLogger getChainOfLoggers(){

      AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
      AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
      AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
      AbstractLogger databaseLogger = new DatabaseLogger(AbstractLogger.WARNING);
      
      
      
//      databaseLogger.setNextLogger(errorLogger);
      errorLogger.setNextLogger(fileLogger);
      fileLogger.setNextLogger(databaseLogger);
      databaseLogger.setNextLogger(consoleLogger);

            
      
      return errorLogger;	
     
   }
    
   private static AbstractLogger getChainOfLoggersOnce(){
       
      AbstractLogger errorLogger1 = new ErrorLogger(AbstractLogger.ERROR);
//      AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
      AbstractLogger databaseLogger1 = new DatabaseLogger(AbstractLogger.WARNING);
      AbstractLogger consoleLogger1 = new ConsoleLogger(AbstractLogger.INFO);
      
      databaseLogger1.setNextLogger(errorLogger1);
      errorLogger1.setNextLogger(consoleLogger1);
//      consoleLogger1.setNextLogger(fileLogger);
       
      return databaseLogger1;
   }

   public static void main(String[] args) {
      AbstractLogger loggerChain = getChainOfLoggers();
            
      AbstractLogger loggerChain2 = getChainOfLoggersOnce();

      
      
      loggerChain.logMessage(AbstractLogger.INFO, 
         "This is an information.");

      loggerChain.logMessage(AbstractLogger.DEBUG, 
         "This is an debug level information.");

      loggerChain.logMessage(AbstractLogger.ERROR, 
         "This is an error information.");
   
      loggerChain.logMessage(AbstractLogger.WARNING, 
         "Warning while loging to the database.");
      
      System.out.println();

      loggerChain2.logOnceMessage(AbstractLogger.INFO, 
         "This is an information.");
      
      loggerChain2.logOnceMessage(AbstractLogger.DEBUG, 
         "This is an debug level information.");

      loggerChain2.logOnceMessage(AbstractLogger.ERROR, 
         "This is an error information.");
   
      loggerChain2.logOnceMessage(AbstractLogger.WARNING, 
         "Warning while loging to the database.");
      
      
   }
}
