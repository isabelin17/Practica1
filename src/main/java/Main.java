import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        CSV c = new CSV();
        Table tabla = c.readTable("src/main/resources/iris.csv");

        System.out.println(tabla.getRowAt(3).toString());
    }
}
