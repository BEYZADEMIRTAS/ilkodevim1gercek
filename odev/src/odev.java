public class odev {
    private String Derecename;
    private int[] dakika;
    private String[] yarismacilar;

    public odev(String derece, int[] dakikaArray, String[] yarismacilarArray) {
        Derecename = derece;
        dakika = dakikaArray;
        yarismacilar = yarismacilarArray;
    }

    public odev(String derece) {
        Derecename = derece;
    }

    public String getDerecename() {
        return Derecename;
    }

    public void setDerecename(String derecename) {
        Derecename = derecename;
    }

    public void processderece() {
        getbirinci();
        getikinci();
        getucuncu();
        getA();
        getB();
        getC();
    }


    public void getbirinci() {
        int enaz = dakika[0];
        String adamlarinadi = yarismacilar[0];
        int numara = 0;
        for (int i = 0; i < dakika.length; i++) {
            if (dakika[i] < enaz) {
                enaz = dakika[i];
                numara = i;

            }
        }
        System.out.println("birinci: " + yarismacilar[numara] + " " + enaz + "'");
        ;
    }

    public void getikinci() {
        int ikincienaz = dakika[0];
        int enaz = dakika[0];
        String adamlarinadi = yarismacilar[0];
        int numara = 0;
        for (int dakikalar : dakika) {
            if (dakikalar < enaz) {
                enaz = dakikalar;
            }
        }
        for (int i = 0; i < dakika.length; i++) {
            if (enaz < dakika[i] && dakika[i] < ikincienaz) {
                ikincienaz = dakika[i];
                numara = i;

            }
        }
        System.out.println("ikinci: " + yarismacilar[numara] + " " + ikincienaz + "'");

}
public void getucuncu(){
    int ikincienaz=dakika[0];
    int enaz=dakika[1];
    int ucuncuenaz=dakika[2];
    int numara=0;
    for(int dakikalar:dakika){
        if(dakikalar<enaz){
            enaz=dakikalar;
        }
    }
    for(int dakikalars:dakika){
        if(enaz<dakikalars && dakikalars<ikincienaz){
            ikincienaz=dakikalars;
        }
    }
    for(int i = 0; i < dakika.length; i++){
        if(ikincienaz<dakika[i] && dakika[i]<ucuncuenaz){
            ucuncuenaz=dakika[i];
            numara=i;
        }
    }
    System.out.println("ucuncu: " + yarismacilar[numara] + " " + ucuncuenaz + "'");
}
    public void outputDakikalar() {

        for(int adam=0; adam<dakika.length;adam++){
            System.out.println(+(adam+1)+":"+yarismacilar[adam]+" "+dakika[adam]);

        }
    }
    public void getA(){
        int Aicin=0;
        for(int adam=0;adam<dakika.length;adam++){
            if (200<dakika[adam] && dakika[adam]<=299) {
                Aicin=Aicin+1;
            }
        }
        System.out.println("A-> "+Aicin);
    }
    public void getB(){
        int Bicin=0;
        for(int adam=0;adam<dakika.length;adam++){
            if (300 < dakika[adam] && dakika[adam]<399){
            Bicin=Bicin+1;
            }
        }
        System.out.println("B-> "+Bicin);
    }
    public void getC(){
        int Cicin=0;
        for(int adam=0;adam<dakika.length;adam++){
            if (400 < dakika[adam]) {
                Cicin=Cicin+1;
            }
        }
        System.out.println("C-> "+Cicin);
    }


}
