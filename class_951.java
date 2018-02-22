import java.util.Random;

// $FF: renamed from: cN
public class class_951 extends class_940 {

   // $FF: renamed from: F java.lang.String
   private static final String field_4829 = "durability";


   // $FF: renamed from: <init> (int, int) void
   protected void method_5508(int var1, int var2) {
      super.method_5479(var1, var2, class_93.field_40);
      this.method_5488("durability");
   }

   // $FF: renamed from: b (int) int
   public int method_5483(int var1) {
      return 5 + (var1 - 1) * 8;
   }

   // $FF: renamed from: c (int) int
   public int method_5484(int var1) {
      return super.method_5483(var1) + 50;
   }

   // $FF: renamed from: c () int
   public int method_5482() {
      return 3;
   }

   // $FF: renamed from: b (add) boolean
   public boolean method_5491(add var1) {
      String[] var2 = class_752.method_4253();
      boolean var10000 = var1.method_3741();
      if(var2 != null) {
         if(var10000) {
            return true;
         }

         var10000 = super.method_5491(var1);
      }

      return var10000;
   }

   // $FF: renamed from: b (add, int, java.util.Random) boolean
   public static boolean method_5509(add var0, int var1, Random var2) {
      String[] var3 = class_752.method_4253();
      int var10000 = var0.method_3730() instanceof class_525;
      if(var3 != null) {
         label24: {
            if(var10000 != 0) {
               float var4;
               var10000 = (var4 = var2.nextFloat() - 0.6F) == 0.0F?0:(var4 < 0.0F?-1:1);
               if(var3 == null) {
                  break label24;
               }

               if(var10000 < 0) {
                  return false;
               }
            }

            var10000 = var2.nextInt(var1 + 1);
         }
      }

      if(var3 != null) {
         var10000 = var10000 > 0?1:0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: <clinit> () void
   static void method_5494() {
      boolean var10000 = true;
      char[] var10003 = "cARÖá[n@Y".toCharArray();
      Object var10004 = var10003.length;
      Object var3 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var0 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var4 = var10002;
         var10002 = var10003;
         if(var10003 <= var0) {
            field_4829 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 81;
            break;
         case 1:
            var10009 = 98;
            break;
         case 2:
            var10009 = 118;
            break;
         case 3:
            var10009 = 225;
            break;
         case 4:
            var10009 = 213;
            break;
         case 5:
            var10009 = 100;
            break;
         default:
            var10009 = 183;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}
