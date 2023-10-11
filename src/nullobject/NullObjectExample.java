package nullobject;

interface Logger{
    void log(String message);
}

class ConsoleLogger implements Logger {
    @Override
    public void log(String message){
        System.out.println("Console Logger: " + message);
    }
}

class NullLogger implements Logger {
    @Override
    public void log(String message){
    }
}

public class NullObjectExample {
    public static void main(String[] args) {
      Logger logger = new ConsoleLogger();
      logger.log("Esta é uma mensagem de log");

      Logger nullLogger = new NullLogger();
      nullLogger.log("Isso não será exibido.");

      Logger someLogger = getLoggerForComponent("ComponentA");
      someLogger.log("Mensagem específica para ComponentA.");
    }

    public static Logger getLoggerForComponent(String component){
      if ("ComponentA".equals(component))
        return new ConsoleLogger();
      else
        return new NullLogger();
    }
}
