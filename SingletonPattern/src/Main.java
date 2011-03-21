import config.Configuration;


public class Main {

  /**
   * Przyk�adowy projekt wykorzystuj�cy wzorzec Singleton.
   * 
   * @param args
   */
  public static void main(String[] args) {
    //Pobierz instancj� klasy Configuration
    Configuration config = Configuration.getInstance();
    
    //Ustaw w konfiguracji przyk�adowe preferencje
    config.getPrefsMap().set("isWindowMaximized","true");
    config.getPrefsMap().set("maxListCount","20");
   
    //(1) Wy�wietl wybrane ustawienie
    System.out.println("(1)");
    System.out.println("maxListCount = " +
        Configuration.getInstance().getPrefsMap().get("maxListCount"));

    //(2) Wy�wietl zawarto�� ca�ej mapy
    System.out.println("(2)");
    System.out.println(config.getPrefsMap().getMap().toString());
    
    //(3) Zapisz konfiguracj�
    System.out.println("(3)");    
    config.save();
  }

}
