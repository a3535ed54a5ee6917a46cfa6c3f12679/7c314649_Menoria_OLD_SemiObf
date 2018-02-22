import java.util.Random;

// $FF: renamed from: dM
public class class_995 extends class_994 {

   // $FF: renamed from: aG java.lang.String
   private static final String field_5073 = "CL_00000183";


   // $FF: renamed from: <init> (int, dz) void
   public void method_5729(int var1, class_985 var2) {
      super.method_5729(var1, var2);
      this.field_5043.field_5444 = 2;
      this.field_5043.field_5445 = 2;
      this.field_5043.field_5446 = 5;
   }

   // $FF: renamed from: b (ahb, java.util.Random, aji[], byte[], int, int, double) void
   public void method_5718(ahb var1, Random var2, aji[] var3, byte[] var4, int var5, int var6, double var7) {
      label17: {
         this.field_5034 = class_1192.field_6027;
         String[] var9 = class_752.method_4253();
         this.field_5035 = 0;
         this.field_5036 = class_1192.field_6028;
         double var10;
         int var10000 = (var10 = var7 - 1.75D) == 0.0D?0:(var10 < 0.0D?-1:1);
         if(var9 != null) {
            if(var10000 > 0) {
               this.field_5034 = class_1192.field_6026;
               this.field_5036 = class_1192.field_6026;
               if(var9 != null) {
                  break label17;
               }
            }

            double var11;
            var10000 = (var11 = var7 - -0.5D) == 0.0D?0:(var11 < 0.0D?-1:1);
         }

         if(var10000 > 0) {
            this.field_5034 = class_1192.field_6028;
            this.field_5035 = 1;
         }
      }

      this.method_5719(var1, var2, var3, var4, var5, var6, var7);
   }

   // $FF: renamed from: b (ahb, java.util.Random, int, int) void
   public void method_5714(ahb var1, Random var2, int var3, int var4) {
      this.field_5043.method_5828(var1, var2, this, var3, var4);
   }

   // $FF: renamed from: <clinit> () void
   static void method_5726() {
      boolean var10000 = true;
      char[] var10003 = "ëÌõàÁç«ö".toCharArray();
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
            field_5073 = (new String((char[])var4)).intern();
            String var2 = field_5073;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 86;
            break;
         case 1:
            var10009 = 40;
            break;
         case 2:
            var10009 = 109;
            break;
         case 3:
            var10009 = 59;
            break;
         case 4:
            var10009 = 46;
            break;
         case 5:
            var10009 = 213;
            break;
         default:
            var10009 = 15;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
