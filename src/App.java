public class App {
    public static void main(String[] args) throws Exception {
        
        ImpresoraConsola impresoraConsola = new ImpresoraConsola();
        ImpresoraArchivo impresoraArchivo = new ImpresoraArchivo();
        Reporte reporte = new Reporte(impresoraConsola);
        Reporte reporte2 = new Reporte(impresoraArchivo);
        

        reporte.generarReporte("nuevo reporte de clientes");
        reporte2.generarReporte("nuevo reporte de clientes");



    }
}
