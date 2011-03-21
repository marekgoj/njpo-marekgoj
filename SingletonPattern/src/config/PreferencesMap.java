package config;

import java.util.HashMap;
import java.util.Map;

/**
 * Klasa przechowuje preferencje
 * 
 */
public class PreferencesMap {
  //Kolekcja (mapa) przechowuj�ca preferencje
  private Map<String, String> prefs = new HashMap<String, String>();
  
  /**
   * Metoda ustawia preferencj�
   * @param prefName - nazwa preferencji
   * @param prefValue - warto�� preferencji
   */
  public void set(String prefName, String prefValue) {
    prefs.put(prefName, prefValue);
  }

  /**
   * Metoda zwraca warto�� wskazanej preferencji lub null, je�eli taka nie jest zdefiniowana.
   * @param prefName - nazwa preferencji
   * @return - warto�� preferencji lub null (je�eli nie jest ustawiona)
   */
  public String get(String prefName) {
    return prefs.get(prefName);
  }
  
  /**
   * Metoda usuwa wskazan� preferencj�
   * @param prefName - nazwa preferencji
   */
  public void unset(String prefName) {
    prefs.remove(prefName);
  }
  
  /**
   * Metoda sprawdza, czy w kolekcji znajduje si� wskazana preferencja.
   * @param prefName - nazwa preferencji
   * @return - true je�li istnieje, false je�li nie istnieje
   */
  public boolean isSet(String prefName) {
    return prefs.containsKey(prefName);
  }  
  
  /**
   * Metoda zwraca ca�� map�
   */
  public Map<String, String> getMap() {
    return prefs;
  }
  
  /**
   * Metoda ustawia przekazan� map�
   * @param map - mapa
   */
  public void setMap(Map<String, String> map) {
    if (map != null) {
      prefs.clear();
      prefs.putAll(map);
    }
  }
}

