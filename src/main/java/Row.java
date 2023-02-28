import java.util.List;

public class Row {
    public List<String> data;

    public List<String> getData(){
        return data;
    }

    public Row add(List<String> l){
        Row row = new Row();
        row.setData(l);
        return row;
    }
    public void setData(List<String> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        String res = "";
        for (String s: data) {
            res = " " + s;
        }
        return res;
    }

    public int numeroColumnas(){
        return data.size();
    }
}
