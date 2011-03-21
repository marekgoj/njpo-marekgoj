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
 * Klasa odpowiada za tworzenie, zapisywanie i �adowanie pliku XML.
 * 
 */
public class XMLDocument {
  
  private String fileName;

  /**
   * Konstruktor przyjmuj�cy nazw� pliku
   * @param fileName
   */
  public XMLDocument(String fileName) {
    this.fileName = fileName;
  }
  
  /**
   * Metoda zapisuje w pliku zawarto�� przekazanej mapy. 
   */
  public void save(Map<String, String> map) {
    //utw�rz dokument XML
    Document doc = createXMLDocument(map);
    //utw�rz outputter dla dokumentu XML (z ustawionym formatem "pretty print") 
    XMLOutputter out = new XMLOutputter(Format.getPrettyFormat());
    
    //otw�rz plik
    try {
      FileWriter writer = new java.io.FileWriter(fileName);

      //wypluj do strumienia (pliku)
      out.output(doc, writer);
      //wypluj do konsoli - TEST
      out.output(doc, System.out);  //TODO usun��
    
      //zamknij plik
      writer.flush();
      writer.close();    
    } catch (java.io.IOException e) {
      e.printStackTrace();
    }
  }
  
  /**
   * Metoda zwraca map� odczytan� z pliku XML
   * @return - mapa
   */
  public Map<String, String> load() {
    Map<String, String> map = new HashMap<String, String>();
    
    SAXBuilder builder = new SAXBuilder(false);

    try {
      //utw�rz dokument na podstawie pliku
      Document doc = builder.build(new File(fileName));
      //pobierz g��wny element
      Element root = doc.getRootElement();
      //pobierz list� element�w
      @SuppressWarnings("unchecked")
      List<Element> elems = root.getChildren();
      //przele� ca�� list� i elementy wrzu� do mapy
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
    //Utw�rz g��wny element XML
    Element root = new Element("configuration");
    //Dodaj elementy reprezentuj�ce wszystkie elementy mapy
    for (Object o : map.keySet()) {
      Element e = new Element( (String)o ); //utw�rz nowy element i nadaj mu nazw� klucza wyci�gni�tego z mapy (o)
      e.addContent(map.get(o)); //do elementu wstaw warto��
      root.addContent(e); //przygotowany element dodaj do g��wnego elementu (root)
    }
    
    //Na podstawie zbudowanej struktury element�w utw�rz dokument
    Document doc = new Document(root);
    return doc;   
  }
}
