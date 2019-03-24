public class RemoveDuplicateChars {

    public static void main(String args[]){
        String str = "attle";
        String remove = "aeiou";
        System.out.println(removeChars(str,remove));
    }
    static String removeChars(String str, String remove){
        char s[]=str.toCharArray();
        char r[]=remove.toCharArray();
        int des=0;
         boolean flags[]=new boolean[128];
         for(int re=0;re<remove.length();++re){
             flags[r[re]] = true;
         }
         for(int i =0;i<str.length();++i){
             if(flags[s[i]]==false){
                 s[des++] = s[i];
             }
         }
       return new String(s,0,des);
    }
}
