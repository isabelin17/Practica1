import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CSV {
    public Table readTable(String file) throws IOException {
        BufferedReader bufferLectura = new BufferedReader(new FileReader(file));
        String linea = bufferLectura.readLine();
        double i = bufferLectura.read();
        int cont = 0;
        while (linea != null || i == 0 ) {
            String[] row = linea.split(",");
            if(cont==0){
            Table.headers.addAll(Arrays.asList(row));
            }else {
                Row d = new Row();

            }
            i = bufferLectura.read();
            cont++;
        }
    }
}
}
