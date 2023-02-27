import java.util.ArrayList;
import java.util.List;

public class Table {
    public static List<String> headers;
    public static List<Row> rows;
    public Row getRowAt(int rowNumber){
        return rows.get(rowNumber);

    }

}
