import java.util.List;

public class KNN {
    public TableWithLabels tabla;
    public void train(TableWithLabels data){
        this.tabla = data;
    }
    public double estimate(List<Double> data){
        Integer estimacion = 0;
        for(int i = 1; i<=tabla.getRowAt(0).numeroColumnas();i++){
            estimacion += Math.pow((data.get(i) - tabla.getRowAt(i).getData()),2);

        }
        return Math.sqrt(estimacion);
    }
}
