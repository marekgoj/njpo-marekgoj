package config;

import java.util.HashMap;
import java.util.Map;

/**
 * Klasa przechowuje preferencje
 * 
 */
public class PreferencesMap {
  //Kolekcja (mapa) przechowuj¹ca preferencje
  private Map<String, String> prefs = new HashMap<String, String>();
  
  /**
   * Metoda ustawia preferencjê
   * @param prefName - nazwa preferencji
   * @param prefValue - wartoœæ preferencji
   */
  public void set(String prefName, String prefValue) {
    prefs.put(prefName, prefValue);
  }

  /**
   * Metoda zwraca wartoœæ wskazanej preferencji lub null, je¿eli taka nie jest zdefiniowana.
   * @param prefName - nazwa preferencji
   * @return - wartoœæ preferencji lub null (je¿eli nie jest ustawiona)
   */
  public String get(String prefName) {
    return prefs.get(prefName);
  }
  
  /**
   * Metoda usuwa wskazan¹ preferencjê
   * @param prefName - nazwa preferencji
   */
  public void unset(String prefName) {
    prefs.remove(prefName);
  }
  
  /**
   * Metoda sprawdza, czy w kolekcji znajduje siê wskazana preferencja.
   * @param prefName - nazwa preferencji
   * @return - true jeœli istnieje, false jeœli nie istnieje
   */
  public boolean isSet(String prefName) {
    return prefs.containsKey(prefName);
  }  
  
  /**
   * Metoda zwraca ca³¹ mapê
   */
  public Map<String, String> getMap() {
    return prefs;
  }
  
  /**
   * Metoda ustawia przekazan¹ mapê
   * @param map - mapa
   */
  public void setMap(Map<String, String> map) {
    if (map != null) {
      prefs.clear();
      prefs.putAll(map);
    }
  }
}

