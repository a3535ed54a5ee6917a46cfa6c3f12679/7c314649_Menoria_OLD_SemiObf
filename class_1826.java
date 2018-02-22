import com.google.gson.JsonParseException;
import java.util.List;
import org.apache.commons.lang3.exception.ExceptionUtils;

// $FF: renamed from: zG
public class class_1826 extends class_1790 {

   // $FF: renamed from: i java.lang.String[]
   private static final String[] field_9373;


   // $FF: renamed from: <init> () void
   public void method_9832() {
      super.method_9832();
   }

   // $FF: renamed from: a () java.lang.String
   public String method_43() {
      String[] var10000 = field_9373;
      return "tellraw";
   }

   // $FF: renamed from: b () int
   public int method_9833() {
      return 2;
   }

   // $FF: renamed from: a (bh) java.lang.String
   public String method_44(class_20 var1) {
      String[] var10000 = field_9373;
      return "commands.tellraw.usage";
   }

   // $FF: renamed from: a (bh, java.lang.String[]) void
   public void method_46(class_20 var1, String[] var2) {
      try {
         if(var2.length < 2) {
            class_641 var11 = new class_641;
            String[] var7 = field_9373;
            var11.method_3515("commands.tellraw.usage", new Object[0]);
            throw var11;
         }
      } catch (JsonParseException var10) {
         throw method_9934(var10);
      }

      class_793 var3 = method_9842(var1, var2[0]);
      String var4 = method_9846(var1, var2, 1);

      try {
         class_66 var5 = class_1556.method_8483(var4);
         var3.method_66(var5);
      } catch (JsonParseException var9) {
         Throwable var6 = ExceptionUtils.getRootCause(var9);

         String var12;
         class_640 var10000;
         class_640 var10001;
         Object[] var10003;
         Object[] var10004;
         byte var10005;
         String var10006;
         label26: {
            try {
               var10000 = new class_640;
               var10001 = var10000;
               String[] var10002 = field_9373;
               var12 = "commands.tellraw.jsonException";
               var10003 = new Object[1];
               var10004 = var10003;
               var10005 = 0;
               if(var6 == null) {
                  var10006 = "";
                  break label26;
               }
            } catch (JsonParseException var8) {
               throw method_9934(var8);
            }

            var10006 = var6.getMessage();
         }

         var10004[var10005] = var10006;
         var10001.method_3515(var12, var10003);
         throw var10000;
      }
   }

   // $FF: renamed from: b (bh, java.lang.String[]) java.util.List
   public List method_48(class_20 param1, String[] param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.String[], int) boolean
   public boolean method_49(String[] var1, int var2) {
      String[] var3 = class_752.method_4253();

      int var10000;
      label32: {
         try {
            var10000 = var2;
            if(var3 == null) {
               return (boolean)var10000;
            }

            if(var2 == 0) {
               break label32;
            }
         } catch (class_640 var4) {
            throw method_9934(var4);
         }

         var10000 = 0;
         return (boolean)var10000;
      }

      var10000 = 1;
      return (boolean)var10000;
   }

   // $FF: renamed from: b (java.lang.RuntimeException) java.lang.RuntimeException
   private static RuntimeException method_9934(RuntimeException var0) {
      return var0;
   }

   // $FF: renamed from: <clinit> () void
   static void method_9862() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "ÇáÛ\'Ë× Ó*É\nÅùÁÜ5ÊáöÓ6ÑËàÐëÚ4ÄÇáÛ\'Ë× Ó*É\nÅùÁÃ5ÄÁ";
      int var4 = "ÇáÛ\'Ë× Ó*É\nÅùÁÜ5ÊáöÓ6ÑËàÐëÚ4ÄÇáÛ\'Ë× Ó*É\nÅùÁÃ5ÄÁ".length();
      char var1 = 30;
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
                  field_9373 = var5;
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 29;
               break;
            case 1:
               var10009 = 55;
               break;
            case 2:
               var10009 = 86;
               break;
            case 3:
               var10009 = 15;
               break;
            case 4:
               var10009 = 255;
               break;
            case 5:
               var10009 = 28;
               break;
            default:
               var10009 = 193;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var10 ^ var10009);
            ++var6;
         }
      }
   }
}
