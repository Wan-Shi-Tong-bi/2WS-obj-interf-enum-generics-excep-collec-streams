import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Vector;

public class PunktLesen
{
    public static void main(String[] args)
    {
        FileInputStream fis = null;
        try
        {
            // Erstellung eines FileInputStreams, damit 
            // wir aus der Datei punkt.tmp lesen können
            fis = new FileInputStream("punkt.tmp");
            ObjectInputStream ois = null;
            try
            {
                // Erstellung eines ObjectInputStreams, der 
                // die eigentlichen Lesemethoden enthält,                
                // wird mit dem FileInputStream erzeugt
                ois = new ObjectInputStream(fis);

                // Lesen des Vektors (mit den Punkt-Objekten) aus der Datei
                Vector vec = (Vector) ois.readObject();

                // Ausgabe der x-Werte unserer Punkt-Objekten
                for(int i =0; i < vec.size(); i++)
                {
                    System.out.println("X-Wert von Punkt "+i+ " ist: " 
                        +((Punkt)vec.elementAt(i)).getX());
                }
 
            }
            catch (IOException ex)
            {
                ex.printStackTrace();
            }
            catch (ClassNotFoundException ex)
            {
                ex.printStackTrace();
            }
            finally
            {
                try
                {
                    if(ois!=null)
                    {
                        ois.close();
                    }
                }
                catch (IOException ex)
                {
                    ex.printStackTrace();
                }
            }
 
        }
        catch (FileNotFoundException ex)
        {
            ex.printStackTrace();
        }
        finally
        {
            try
            {
                if(fis!=null)
                {
                    fis.close();
                }
            }
            catch (IOException ex)
            {
                ex.printStackTrace();
            }
        }
    }
}

