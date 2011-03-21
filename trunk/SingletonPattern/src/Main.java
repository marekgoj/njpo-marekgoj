import config.Configuration;


public class Main {

  /**
   * Przyk³adowy projekt wykorzystuj¹cy wzorzec Singleton.
   * 
   * @param args
   */
  public static void main(String[] args) {
    //Pobierz instancjê klasy Configuration
    Configuration config = Configuration.getInstance();
    
    //Ustaw w konfiguracji przyk³adowe preferencje
    config.getPrefsMap().set("isWindowMaximized","true");
    config.getPrefsMap().set("maxListCount","20");
   
    //(1) Wyœwietl wybrane ustawienie
    System.out.println("(1)");
    System.out.println("maxListCount = " +
        Configuration.getInstance().getPrefsMap().get("maxListCount"));

    //(2) Wyœwietl zawartoœæ ca³ej mapy
    System.out.println("(2)");
    System.out.println(config.getPrefsMap().getMap().toString());
    
    //(3) Zapisz konfiguracjê
    System.out.println("(3)");    
    config.save();
  }

}
