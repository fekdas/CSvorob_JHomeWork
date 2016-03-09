package HomeWork13sax;

import java.io.File;
import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.SAXException;

/**
 * Делаем разбор того же xml файла, что и на занятии, но только с помощью парсера SAX. На выходе должна появиться коллекция List с данными, как на занятии.

 Тестовый файл xml:
 https://www.dropbox.com/s/nnh7mwot47yhlln/test.xml?dl=0

 */

public class HomeWork13task1 {

    public static void main(String[] args)
    {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = null;
        try
        {
            parser = factory.newSAXParser();
        }
        catch (ParserConfigurationException e1)
        {System.out.println("ParserConfigurationException" + e1.getMessage());}
        catch (SAXException e1)
        {System.out.println("SAXException" + e1.getMessage());}

        // Создаем объект класса SAXPars
        SAXPars saxp = new SAXPars();

        // Парсинг тестового файла
        try
        {
            parser.parse(new File("HomeWork13sax/test.xml"), saxp);
        }

        catch (SAXException e)
        {System.out.println("SAXException" + e.getMessage());}
        catch (IOException e)
        {System.out.println("IOException" + e.getMessage());}

        // Вывод коллекции List<ElementMy> через метод getResult()
        for (ElementMy eee : saxp.getResult())
        {
            System.out.println(eee.toString());
        }
    }

}
