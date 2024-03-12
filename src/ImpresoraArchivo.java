public class ImpresoraArchivo implements Impresora{
    
    @Override
    public void imprimir(String contenido){
        System.out.println("Imprimiendo en archivo " + contenido);
    }
}
