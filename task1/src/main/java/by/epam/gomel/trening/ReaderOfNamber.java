package by.epam.gomel.trening;

import java.io.BufferedReader;
import java.io.IOException;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ReaderOfNamber {
    static final Logger logger = LogManager.getLogger();
    private BufferedReader bufferedReader;

    public ReaderOfNamber() {
    }

    public ReaderOfNamber(BufferedReader bufferedReader) {
        this.bufferedReader = bufferedReader;
    }

    public void setBufferedReader(BufferedReader bufferedReader) {
        this.bufferedReader = bufferedReader;
    }

    public double readOfDoubleNamber(){
        Double d = null;
        do {
           try {
               d = Double.valueOf(bufferedReader.readLine());
           } catch (NumberFormatException | IOException e) {
               logger.log(Level.ERROR, "mistake", e);
           }
        } while (d == null);
        return d;
    }
}
