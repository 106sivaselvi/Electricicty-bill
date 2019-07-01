import java.util.*;
public class Main{
  public static void main(String[] args){
    int n = 8;
    String m="Jan 1, 2020:shop1 320$shop2 220$shop3 330$shop4 420$shop5 5_Jan 2, 2020:shop5 318$shop4 320$shop3 330$shop2 420$shop1 5_Jan 3, 2020:shop1 316$shop1 820$shop3 330$shop4 420$shop5 5_Jan 4, 2020:shop1 314$shop2 110$shop3 68$shop4 420$shop5 5_Jan 5, 2020:shop1 323$shop2 220$shop3 330$shop4 420$shop5 5_Jan 6, 2020:shop1 324$shop3 330$shop4 420$shop5 5_Jan 7, 2020:shop1 320$shop2 220$shop3 330$shop4 420$shop5 51_Jan 8, 2020:shop1 324$shop3 330$shop4 420$shop5 5";
  String[] str1 =m.split("[_]");
 HashMap<String, Integer> map = new HashMap<>(); 
 for(int i = 0;i<str1.length;i++) {
   String[] s1 = str1[i].split(":");
   String[] s2 = s1[1].split("[$]");
   for(int j = 0;j<s2.length;j++) {
     String[] val = s2[j].split(" ");
     String sq = val[0];
     int k = Integer.parseInt(val[1]);
     if(map.containsKey(sq)){
     int val1=map.get(sq)+k;
     map.put(sq,val1);
     }
     else
     map.put(sq,k);
   }
 }
 System.out.println(map);
 double y = 0;
 for(Map.Entry<String,Integer> ent:map.entrySet()){
   String q = ent.getKey();
   int x = ent.getValue();
   if(x >= 1000 && x <= 2000)
   y = x*0.33;
   else if(x >= 2001 && x <= 5000)
   y = x*0.30;
   else if(x > 5001)
   y = x*0.20;
   System.out.print(q+":"+y);    
  }
}
}