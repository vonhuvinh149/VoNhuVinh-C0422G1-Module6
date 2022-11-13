public class str {




    public static void main(String[] args) {
          String str = "aabacsdc";

         while (!str.equals("")) {
             int count = 0 ;
             String n = str.charAt(0) + "";
             for (int i = 0 ; i < str.length() ; i++){
                 if ((n).equals(str.charAt(i)+ "")){
                     count++ ;
                 }
             }
             System.out.println(n + " " + count);
             str = str.replace(n , "");
         }
    }
}
