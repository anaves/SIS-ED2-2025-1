import java.util.TreeMap;

public class AppTs {
    public static void main(String[] args) {
        TreeMap<String, Integer> arvore = new TreeMap();
        arvore.put("ch0", 0);
        arvore.put("ch1",1);
        arvore.put("ch2",1);
        arvore.put("ch3",2);
        arvore.put("ch4",3);
        arvore.put("ch5",4);
        arvore.put("ch6",5);
        arvore.put("ch7",6);
        arvore.put("ch8",6);
        arvore.put("ch9",7);
        arvore.put("ch10",8);
        arvore.put("ch11",9);
        arvore.put("ch12",10);
        arvore.put("ch13",11);
        arvore.put("ch14",12);
        System.out.println(arvore);
        System.out.println(arvore.get("ch13"));
        arvore.remove("ch6");
        System.out.println(arvore);        
    }
}
