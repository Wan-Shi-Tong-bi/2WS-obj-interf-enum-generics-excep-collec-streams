import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Date;

public class KomplexesEinlesen
{
    public static void main(String[] args)
    {
        FileInputStream fis = null;
        try
        {
            // Erstellung eines FileInputStreams, damit wir 
            // aus der Datei t.tmp lesen können
            fis = new FileInputStream("t.tmp");

            ObjectInputStream ois = null;
            try
            {
                // Erstellung eines ObjectInputStreams, der 
                // die eigentlichen Lesemethoden enthält
                // wird mit dem FileInputStream erzeugt.
                ois = new ObjectInputStream(fis);

                // Die Methode readInt liest einen 
                // einfachen int-Datentypen aus der Datei
                int i  = ois.readInt();

                // Die Methode readObject liest komplexe 
                // Datentypen aus der Datei
                String today  = (String)ois.readObject();
                Date date = (Date) ois.readObject();
                System.out.println(date.toString());
            }
            catch (IOException ex)
            {
                ex.printStackTrace();
            }
            catch(ClassNotFoundException ex)
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
        // Auffangen der FileNotFoundException, falls 
        // die Datei, die gelesen werden soll,
        // nicht gefunden werden konnte
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

