public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv tv = new SmartTv();

        System.out.println("Estado da TV: " + tv.ligada);
        System.out.println("Canal: " + tv.canal);
        System.out.println("Volume: " + tv.volume);
    }
}
