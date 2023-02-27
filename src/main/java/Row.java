import java.util.ArrayList;
import java.util.List;

public class Row {
    public List<Double> data;

    public List<Double> getData(){
        return data;
    }

    public Row add(List<Double> l){
        Row row = new Row();
        row.data.addAll(l);
        return row;
    }

}
