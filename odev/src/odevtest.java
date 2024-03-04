public class odevtest {
    public static void main(String[] args) {
        String [] yarismacilarArray={"Kadir","Gokhan","Hakan","Suzan","Pinar","Mehmet","Ali","Emel","Firat","James","Jale","Ersin","Deniz","Gozde","Anil","Burak"};
        int [] dakikaArray={341,273,278,329,445,402,388,270,243,334,412,393,299,343,317,265};
    odev myodev=new odev("hadi",dakikaArray,yarismacilarArray);
        myodev.processderece();
    }
}
