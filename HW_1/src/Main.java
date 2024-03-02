public class Main {
    public static void main(String[] args) {
        Ranker rankerObj = new Ranker();
        String[] names = {"Kadir", "Gökhan", "Hakan","Suzan","Pınar","Mehmet","Ali","Emel","Fırat","James","Jale","Ersin","Deniz","Gözde","Anıl","Burak"};
        int[] minutes = {341,273,278,329,445,402,388,270,243,334,412,393,299,343,317,265};
        System.out.println("Birinci: "+names[rankerObj.enDusukZaman(minutes)]+" "+minutes[rankerObj.enDusukZaman(minutes)]+"'");
        System.out.println("İkinci: "+names[rankerObj.enDusukIkinciZaman(minutes)]+" "+minutes[rankerObj.enDusukIkinciZaman(minutes)]+"'");
        System.out.println("Üçüncü: "+names[rankerObj.enDusukUcuncuZaman(minutes)]+" "+minutes[rankerObj.enDusukUcuncuZaman(minutes)]+"'");
        rankerObj.siniflandir(minutes);
    }
}