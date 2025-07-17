import java.util.HashSet;
public class keyboard_combination {
   public static String [] keyboard ={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
   public static void combo(String str,int index,String combination){

    if(index==str.length()){
        System.out.println(combination);
        return;
    }
    char curchar=str.charAt(index);
    String mapping=keyboard[curchar-'0'];
    for (int i = 0; i < mapping.length(); i++) {
        combo(str, index+1, combination+mapping.charAt(i));
    }
   }

    public static void main(String[] args) {
        String s="02";
        combo(s, 0, "");
    }
}
