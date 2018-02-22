
// $FF: renamed from: rZ
final class class_1561 extends class_1560 {

   // $FF: renamed from: a java.lang.String
   private static final String field_8202;
   // $FF: renamed from: n java.lang.String[]
   private static final String[] field_8203;


   // $FF: renamed from: <init> () void
   void method_8514() {
      super.method_8514();
   }

   // $FF: renamed from: b () v
   public class_130 method_8515() {
      return null;
   }

   // $FF: renamed from: c () boolean
   public boolean method_8516() {
      return false;
   }

   // $FF: renamed from: d () boolean
   public boolean method_8517() {
      return false;
   }

   // $FF: renamed from: e () boolean
   public boolean method_8518() {
      return false;
   }

   // $FF: renamed from: f () boolean
   public boolean method_8519() {
      return false;
   }

   // $FF: renamed from: g () boolean
   public boolean method_8520() {
      return false;
   }

   // $FF: renamed from: i () rU
   public class_1554 method_8522() {
      return null;
   }

   // $FF: renamed from: j () rX
   public class_1558 method_8523() {
      return null;
   }

   // $FF: renamed from: b (v) rY
   public class_1560 method_8524(class_130 var1) {
      throw new UnsupportedOperationException();
   }

   // $FF: renamed from: b (java.lang.Boolean) rY
   public class_1560 method_8525(Boolean var1) {
      throw new UnsupportedOperationException();
   }

   // $FF: renamed from: c (java.lang.Boolean) rY
   public class_1560 method_8526(Boolean var1) {
      throw new UnsupportedOperationException();
   }

   // $FF: renamed from: d (java.lang.Boolean) rY
   public class_1560 method_8527(Boolean var1) {
      throw new UnsupportedOperationException();
   }

   // $FF: renamed from: e (java.lang.Boolean) rY
   public class_1560 method_8528(Boolean var1) {
      throw new UnsupportedOperationException();
   }

   // $FF: renamed from: f (java.lang.Boolean) rY
   public class_1560 method_8529(Boolean var1) {
      throw new UnsupportedOperationException();
   }

   // $FF: renamed from: b (rU) rY
   public class_1560 method_8530(class_1554 var1) {
      throw new UnsupportedOperationException();
   }

   // $FF: renamed from: b (rX) rY
   public class_1560 method_8531(class_1558 var1) {
      throw new UnsupportedOperationException();
   }

   // $FF: renamed from: b (rY) rY
   public class_1560 method_8532(class_1560 var1) {
      throw new UnsupportedOperationException();
   }

   public String toString() {
      String[] var10000 = field_8203;
      return "Style.ROOT";
   }

   // $FF: renamed from: m () rY
   public class_1560 method_8535() {
      return this;
   }

   // $FF: renamed from: n () rY
   public class_1560 method_8536() {
      return this;
   }

   // $FF: renamed from: k () java.lang.String
   public String method_8533() {
      return "";
   }

   // $FF: renamed from: <clinit> () void
   static void drawScreen3() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "ÊÿÈRÏ!q¸¡U\nÚÇî?ÆüÃ";
      int var4 = "ÊÿÈRÏ!q¸¡U\nÚÇî?ÆüÃ".length();
      char var1 = 11;
      int var0 = -1;

      while(true) {
         ++var0;
         String var10002 = var2.substring(var0, var0 + var1);
         boolean var10000 = true;
         char[] var10003 = var10002.toCharArray();
         Object var10004 = var10003.length;
         Object var9 = true;
         char[] var8 = var10003;
         char[] var10001 = (char[])var10004;
         int var6 = 0;

         while(true) {
            var10003 = var8;
            var8 = var10001;
            var10001 = var10003;
            char[] var11 = var8;
            var8 = var10003;
            if(var10003 <= var6) {
               var5[var3++] = (new String((char[])var9)).intern();
               if((var0 += var1) >= var4) {
                  field_8203 = var5;
                  String[] var10 = field_8203;
                  field_8202 = "CL_00001267";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 94;
               break;
            case 1:
               var10009 = 100;
               break;
            case 2:
               var10009 = 64;
               break;
            case 3:
               var10009 = 181;
               break;
            case 4:
               var10009 = 40;
               break;
            case 5:
               var10009 = 198;
               break;
            default:
               var10009 = 150;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}
