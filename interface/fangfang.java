package xiaoanjie;

import java.util.regex.*;

class fangfang{
   public static void main(String args[]){
      String content = "傻逼，他是大傻逼吗 " +
        "from runoob.com.";
 
      String pattern = ".*是大傻逼吗.*";
 
      boolean isMatch = Pattern.matches(pattern, content);
      System.out.println("字符串中是否包含了 '是大傻逼吗' 子字符串? " + isMatch);
   }
}