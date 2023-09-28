/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Looger;

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

   public static void main(String[] args) {
      AbstractLogger loggerChain = getChainOfLoggers();

      loggerChain.logMessage(AbstractLogger.INFO, 
         "This is an information.");

      loggerChain.logMessage(AbstractLogger.DEBUG, 
         "This is an debug level information.");

      loggerChain.logMessage(AbstractLogger.ERROR, 
         "This is an error information.");
   
      loggerChain.logMessage(AbstractLogger.WARNING, 
         "Warning while loging to the database.");
   }
}
