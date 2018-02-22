package ca.diiza.v.b;

import ca.diiza.v.a.class_1007;
import ca.diiza.v.a.class_1008;

// $FF: renamed from: ca.diiza.v.b.a
public class class_135 {

   // $FF: renamed from: a ca.diiza.v.a.c
   public static class_1007 field_358;
   // $FF: renamed from: b ca.diiza.v.a.b
   public static class_1008 field_359;
   // $FF: renamed from: c java.lang.String
   public static String field_360;
   // $FF: renamed from: d double
   public static double field_361;
   // $FF: renamed from: e double
   public static double field_362;
   // $FF: renamed from: f long
   public static long field_363;
   // $FF: renamed from: h boolean
   private static boolean field_364;
   // $FF: renamed from: i java.lang.String[]
   private static final String[] field_365;


   // $FF: renamed from: <init> () void
   public void method_637() {
      super();
   }

   // $FF: renamed from: a (int) java.lang.String
   public static String method_638(int var0) {
      int var3 = var0 % 3600 / 60;
      boolean var1 = method_641();
      var0 %= 60;
      int var10000 = var3;
      StringBuilder var6;
      if(!var1) {
         if(var3 == 0) {
            var6 = (new StringBuilder()).append(var0);
            String[] var4 = field_365;
            return var6.append(" Secondes").toString();
         }

         var10000 = var0;
      }

      if(var10000 == 0) {
         var6 = (new StringBuilder()).append(var3);
         String[] var10001 = field_365;
         return var6.append(" Minutes").toString();
      } else {
         String var5 = var3 + "m" + var0 + "s";
         if(var1) {
            int var2 = class_689.method_3976();
            ++var2;
            class_689.method_3975(var2);
         }

         return var5;
      }
   }

   // $FF: renamed from: <clinit> () void
   static void method_639() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "Õô²Þlí%\bÕø¿Ävì";
      int var4 = "Õô²Þlí%\bÕø¿Ävì".length();
      method_640(false);
      char var1 = 9;
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
            char[] var10 = var8;
            var8 = var10003;
            if(var10003 <= var6) {
               var5[var3++] = (new String((char[])var9)).intern();
               if((var0 += var1) >= var4) {
                  field_365 = var5;
                  field_358 = null;
                  field_359 = null;
                  field_360 = "";
                  field_361 = 0.0D;
                  field_362 = 0.0D;
                  field_363 = 0L;
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 76;
               break;
            case 1:
               var10009 = 239;
               break;
            case 2:
               var10009 = 40;
               break;
            case 3:
               var10009 = 104;
               break;
            case 4:
               var10009 = 8;
               break;
            case 5:
               var10009 = 187;
               break;
            default:
               var10009 = 48;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var10 ^ var10009);
            ++var6;
         }
      }
   }

   // $FF: renamed from: a (boolean) void
   public static void method_640(boolean var0) {
      field_364 = var0;
   }

   // $FF: renamed from: a () boolean
   public static boolean method_641() {
      return field_364;
   }

   // $FF: renamed from: b () boolean
   public static boolean method_642() {
      boolean var0 = method_641();
      return !var0;
   }
}
