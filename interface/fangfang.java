package xiaoanjie;

import java.util.regex.*;

class fangfang{
   public static void main(String args[]){
      String content = "ɵ�ƣ����Ǵ�ɵ���� " +
        "from runoob.com.";
 
      String pattern = ".*�Ǵ�ɵ����.*";
 
      boolean isMatch = Pattern.matches(pattern, content);
      System.out.println("�ַ������Ƿ������ '�Ǵ�ɵ����' ���ַ���? " + isMatch);
   }
}