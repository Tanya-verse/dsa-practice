//permutation of a string 
public class permutation {

    public static void printpermutation(String str,String permute){
        if(str.length()==0){
            System.out.println(permute);
            return;
        }
        for(int i=0;i<str.length();i++){
            char curchar=str.charAt(i);
            String newsString=str.substring(0, i)+str.substring(i+1);
            printpermutation(newsString, permute+curchar);
        }
    }

    public static void main(String[] args) {
        String s="abc";
        printpermutation(s, "");
    }
}
