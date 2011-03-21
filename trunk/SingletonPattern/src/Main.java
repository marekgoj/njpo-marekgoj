import config.Configuration;


public class Main {

  /**
   * Przykładowy projekt wykorzystujący wzorzec Singleton.
   * 
   * @param args
   */
  public static void main(String[] args) {
    //Pobierz instancję klasy Configuration
    Configuration config = Configuration.getInstance();
    
    //Ustaw w konfiguracji przykładowe preferencje
    config.getPrefsMap().set("isWindowMaximized","true");
    config.getPrefsMap().set("maxListCount","20");
   
    //(1) Wyświetl wybrane ustawienie
    System.out.println("(1)");
    System.out.println("maxListCount = " +
        Configuration.getInstance().getPrefsMap().get("maxListCount"));

    //(2) Wyświetl zawartość całej mapy
    System.out.println("(2)");
    System.out.println(config.getPrefsMap().getMap().toString());
    
    //(3) Zapisz konfigurację
    System.out.println("(3)");    
    config.save();
  }

}
