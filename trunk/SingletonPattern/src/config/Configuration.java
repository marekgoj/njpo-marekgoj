package config;


/**
 * Klasa Configuration odpowiada za przechowywanie, udostêpnianie i zapisywanie
 * ustawieñ konfiguracyjnych.
 * 
 */
public class Configuration {
  //Pole statyczne (!) przechowuj¹ce instancjê klasy Configuration.
  private static Configuration instance = new Configuration();  

  //Obiekt PreferenceMap przechowuje mapê preferencji
  private PreferencesMap prefs = null;
  //Obiekt XMLDocument umo¿liwia tworzenie, zapisywanie i ³adowanie plików XML
  private XMLDocument xml = null;
  
  /**
   * Prywatny (!) konstruktor
   */
  private Configuration() {
    //utwórz mapê preferencji
    prefs = new PreferencesMap();
    //utwórz obiekt dokumentu XML powi¹zany z plikiem config.xml
    xml = new XMLDocument("config.xml");    
  }
  
  /**
   * Za pomoc¹ statycznej (!) metody getInstance() uzyskuje siê dostêp do obiektu konfiguracji.
   *  
   */
  public static Configuration getInstance() {
    return instance;
  }

  /**
   * Metoda zapisuje preferencje w pliku XML
   */
  public void save() {
    xml.save(prefs.getMap());
  }
  
  /**
   * Metoda ³aduje preferencje z pliku XML
   */
  public void load() {
    prefs.setMap(xml.load());
  }
  
  /**
   * Metoda zwraca obiekt PreferencesMap
   * @return
   */
  public PreferencesMap getPrefsMap() {
    return prefs;
  }
}

