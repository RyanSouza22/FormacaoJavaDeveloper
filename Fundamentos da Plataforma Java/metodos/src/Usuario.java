public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv tv = new SmartTv();

        System.out.println("Estado da TV: " + tv.ligada);
        System.out.println("Canal: " + tv.canal);
        System.out.println("Volume: " + tv.volume + "\n");

        tv.ligar();
        tv.aumentaVolume();
        tv.aumentaVolume();
        tv.abaixaVolume();
        tv.mudarCanal(14);

        System.out.println("Estado da TV: " + tv.ligada);
        System.out.println("Canal: " + tv.canal);
        System.out.println("Volume: " + tv.volume);

    }
}
