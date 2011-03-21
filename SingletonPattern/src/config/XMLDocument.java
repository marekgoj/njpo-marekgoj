package config;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;

/**
 * Klasa odpowiada za tworzenie, zapisywanie i ³adowanie pliku XML.
 * 
 */
public class XMLDocument {
  
  private String fileName;

  /**
   * Konstruktor przyjmuj¹cy nazwê pliku
   * @param fileName
   */
  public XMLDocument(String fileName) {
    this.fileName = fileName;
  }
  
  /**
   * Metoda zapisuje w pliku zawartoœæ przekazanej mapy. 
   */
  public void save(Map<String, String> map) {
    //utwórz dokument XML
    Document doc = createXMLDocument(map);
    //utwórz outputter dla dokumentu XML (z ustawionym formatem "pretty print") 
    XMLOutputter out = new XMLOutputter(Format.getPrettyFormat());
    
    //otwórz plik
    try {
      FileWriter writer = new java.io.FileWriter(fileName);

      //wypluj do strumienia (pliku)
      out.output(doc, writer);
      //wypluj do konsoli - TEST
      out.output(doc, System.out);  //TODO usun¹æ
    
      //zamknij plik
      writer.flush();
      writer.close();    
    } catch (java.io.IOException e) {
      e.printStackTrace();
    }
  }
  
  /**
   * Metoda zwraca mapê odczytan¹ z pliku XML
   * @return - mapa
   */
  public Map<String, String> load() {
    Map<String, String> map = new HashMap<String, String>();
    
    SAXBuilder builder = new SAXBuilder(false);

    try {
      //utwórz dokument na podstawie pliku
      Document doc = builder.build(new File(fileName));
      //pobierz g³ówny element
      Element root = doc.getRootElement();
      //pobierz listê elementów
      @SuppressWarnings("unchecked")
      List<Element> elems = root.getChildren();
      //przeleæ ca³¹ listê i elementy wrzuæ do mapy
      for (Element e : elems) {
        map.put(e.getName(), e.getText());
      }      
    } catch (JDOMException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
    
    return map;
  }
  
  /**
   * Metoda tworzy dokument XML z przekazanej mapy.
   * @param m - mapa
   */
  private Document createXMLDocument(Map<String, String> map) {
    //Utwórz g³ówny element XML
    Element root = new Element("configuration");
    //Dodaj elementy reprezentuj¹ce wszystkie elementy mapy
    for (Object o : map.keySet()) {
      Element e = new Element( (String)o ); //utwórz nowy element i nadaj mu nazwê klucza wyci¹gniêtego z mapy (o)
      e.addContent(map.get(o)); //do elementu wstaw wartoœæ
      root.addContent(e); //przygotowany element dodaj do g³ównego elementu (root)
    }
    
    //Na podstawie zbudowanej struktury elementów utwórz dokument
    Document doc = new Document(root);
    return doc;   
  }
}
