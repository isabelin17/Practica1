import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class CSV {
    public Table readTable(String file) throws IOException {
        BufferedReader bufferLectura = new BufferedReader(new FileReader(file));
        Table tabla = new Table();
        String linea = bufferLectura.readLine();
        double i = bufferLectura.read();
        int cont = 0;
        while (linea != null) {
            String[] row = linea.split(",");
            if (cont == 0) {
                tabla.setHeaders(Arrays.asList(row));
            } else {
                Row d = new Row();
                d.add(List.of(row));
                tabla.addRow(d);
            }
            linea = bufferLectura.readLine();
            cont++;
        }
        return tabla;
    }
}
