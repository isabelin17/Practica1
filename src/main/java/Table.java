import java.util.ArrayList;
import java.util.List;

public class Table {
    public static List<String> headers;
    public static List<Row> rows = new ArrayList<>();
    public Row getRowAt(int rowNumber){
        return rows.get(rowNumber);

    }
    public void setHeaders(List<String> headers) {
        Table.headers = headers;
    }

    public void addRow(Row r){
        Table.rows.add(r);
    }

    @Override
    public String toString() {

        return headers.toString() + "\n" + rows.toString();
    }

    public int numeroFilas(){
        return rows.size();
    }

    public List<String> nombresCabecera(){
        return headers;
    }
}
