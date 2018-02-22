import java.util.List;
import java.util.Random;

// $FF: renamed from: ik
public class class_1107 extends class_1099 {

   // $FF: renamed from: f java.lang.String
   private static final String field_5793 = "CL_00000460";


   // $FF: renamed from: <init> () void
   public void method_6191() {
      super.method_6191();
   }

   // $FF: renamed from: <init> (int, java.util.Random, hS, int) void
   public void method_6249(int var1, Random var2, class_1206 var3, int var4) {
      super.method_6192(var1);
      this.field_5753 = var4;
      this.field_5752 = var3;
   }

   // $FF: renamed from: b (h7, java.util.List, java.util.Random) void
   public void method_6197(class_1094 var1, List var2, Random var3) {
      this.method_6231((class_1114)var1, var2, var3, 1, 0, true);
      this.method_6232((class_1114)var1, var2, var3, 0, 1, true);
      this.method_6233((class_1114)var1, var2, var3, 0, 1, true);
   }

   // $FF: renamed from: b (java.util.List, java.util.Random, int, int, int, int, int) ik
   public static class_1107 method_6250(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      class_1206 var7 = class_1206.method_6479(var2, var3, var4, -1, 0, 0, 5, 7, 5, var5);
      class_1107 var10000;
      if(method_6234(var7) && class_1094.method_6201(var0, var7) == null) {
         var10000 = new class_1107;
         var10000.method_6249(var6, var1, var7, var5);
      } else {
         var10000 = null;
      }

      return var10000;
   }

   // $FF: renamed from: b (ahb, java.util.Random, hS) boolean
   public boolean method_6198(ahb var1, Random var2, class_1206 var3) {
      this.method_6211(var1, var3, 0, 0, 0, 4, 1, 4, class_1192.field_6137, class_1192.field_6137, false);
      this.method_6211(var1, var3, 0, 2, 0, 4, 5, 4, class_1192.field_6025, class_1192.field_6025, false);
      this.method_6211(var1, var3, 0, 2, 0, 0, 5, 0, class_1192.field_6137, class_1192.field_6137, false);
      String[] var10000 = class_752.method_4253();
      this.method_6211(var1, var3, 4, 2, 0, 4, 5, 0, class_1192.field_6137, class_1192.field_6137, false);
      this.method_6211(var1, var3, 0, 2, 4, 0, 5, 4, class_1192.field_6137, class_1192.field_6137, false);
      this.method_6211(var1, var3, 4, 2, 4, 4, 5, 4, class_1192.field_6137, class_1192.field_6137, false);
      this.method_6211(var1, var3, 0, 6, 0, 4, 6, 4, class_1192.field_6137, class_1192.field_6137, false);
      String[] var4 = var10000;
      int var5 = 0;

      boolean var7;
      while(true) {
         if(var5 <= 4) {
            var7 = false;
            if(var4 == null) {
               break;
            }

            int var6 = 0;

            while(true) {
               if(var6 <= 4) {
                  this.method_6218(var1, class_1192.field_6137, 0, var5, -1, var6, var3);
                  ++var6;
                  if(var4 == null) {
                     break;
                  }

                  if(var4 != null) {
                     continue;
                  }
               }

               ++var5;
               break;
            }

            if(var4 != null) {
               continue;
            }
         }

         var7 = true;
         break;
      }

      return var7;
   }

   // $FF: renamed from: <clinit> () void
   static void method_6222() {
      boolean var10000 = true;
      char[] var10003 = "SûMäºçw $ä".toCharArray();
      Object var10004 = var10003.length;
      Object var4 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var0 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var5 = var10002;
         var10002 = var10003;
         if(var10003 <= var0) {
            field_5793 = (new String((char[])var4)).intern();
            String var2 = field_5793;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 93;
            break;
         case 1:
            var10009 = 250;
            break;
         case 2:
            var10009 = 95;
            break;
         case 3:
            var10009 = 153;
            break;
         case 4:
            var10009 = 199;
            break;
         case 5:
            var10009 = 154;
            break;
         default:
            var10009 = 10;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
