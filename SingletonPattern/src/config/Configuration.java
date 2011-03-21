package config;


/**
 * Klasa Configuration odpowiada za przechowywanie, udost�pnianie i zapisywanie
 * ustawie� konfiguracyjnych.
 * 
 */
public class Configuration {
  //Pole statyczne (!) przechowuj�ce instancj� klasy Configuration.
  private static Configuration instance = new Configuration();  

  //Obiekt PreferenceMap przechowuje map� preferencji
  private PreferencesMap prefs = null;
  //Obiekt XMLDocument umo�liwia tworzenie, zapisywanie i �adowanie plik�w XML
  private XMLDocument xml = null;
  
  /**
   * Prywatny (!) konstruktor
   */
  private Configuration() {
    //utw�rz map� preferencji
    prefs = new PreferencesMap();
    //utw�rz obiekt dokumentu XML powi�zany z plikiem config.xml
    xml = new XMLDocument("config.xml");    
  }
  
  /**
   * Za pomoc� statycznej (!) metody getInstance() uzyskuje si� dost�p do obiektu konfiguracji.
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
   * Metoda �aduje preferencje z pliku XML
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

