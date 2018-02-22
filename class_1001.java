import java.util.Random;

// $FF: renamed from: dF
public class class_1001 extends class_985 {

   // $FF: renamed from: aF boolean
   private boolean field_5090;
   // $FF: renamed from: aG hD
   private class_1188 field_5091;
   // $FF: renamed from: aH hC
   private class_1189 field_5092;
   // $FF: renamed from: cb java.lang.String
   private static final String field_5093 = " Spikes";


   // $FF: renamed from: <init> (int, boolean) void
   public void method_5736(int var1, boolean var2) {
      super.method_5691(var1);
      class_1188 var10001 = new class_1188;
      var10001.method_6349();
      this.field_5091 = var10001;
      class_1189 var3 = new class_1189;
      var3.method_6407(4);
      this.field_5092 = var3;
      this.field_5090 = var2;
      if(var2) {
         this.field_5034 = class_1192.field_6106;
      }

      this.field_5045.clear();
   }

   // $FF: renamed from: b (ahb, java.util.Random, int, int) void
   public void method_5714(ahb var1, Random var2, int var3, int var4) {
      String[] var5 = class_752.method_4253();
      class_1001 var10000 = this;
      if(var5 != null) {
         if(this.field_5090) {
            int var6 = 0;

            int var7;
            int var8;
            while(true) {
               if(var6 < 3) {
                  var7 = var3 + var2.nextInt(16) + 8;
                  var8 = var4 + var2.nextInt(16) + 8;
                  this.field_5091.method_6351(var1, var2, var7, var1.method_2071(var7, var8), var8);
                  ++var6;
                  if(var5 == null) {
                     break;
                  }

                  if(var5 != null) {
                     continue;
                  }
               }

               var6 = 0;
               break;
            }

            while(var6 < 2) {
               var7 = var3 + var2.nextInt(16) + 8;
               var8 = var4 + var2.nextInt(16) + 8;
               this.field_5092.method_6351(var1, var2, var7, var1.method_2071(var7, var8), var8);
               ++var6;
               if(var5 == null) {
                  return;
               }

               if(var5 == null) {
                  break;
               }
            }
         }

         var10000 = this;
      }

      var10000.method_5714(var1, var2, var3, var4);
   }

   // $FF: renamed from: b (java.util.Random) hd
   public class_1162 method_5696(Random var1) {
      class_1166 var10000 = new class_1166;
      var10000.method_6350(false);
      return var10000;
   }

   // $FF: renamed from: l () dz
   protected class_985 method_5720() {
      class_1001 var10000 = new class_1001;
      var10000.method_5736(this.field_5050 + 128, true);
      class_985 var2 = var10000.method_5704(13828095, true).method_5700(this.field_5031 + " Spikes").method_5699().method_5693(0.0F, 0.5F);
      class_1019 var10001 = new class_1019;
      var10001.method_5793(this.field_5038 + 0.1F, this.field_5039 + 0.1F);
      class_985 var1 = var2.method_5694(var10001);
      var1.field_5038 = this.field_5038 + 0.3F;
      var1.field_5039 = this.field_5039 + 0.4F;
      return var1;
   }

   // $FF: renamed from: <clinit> () void
   static void method_5726() {
      boolean var10000 = true;
      char[] var10003 = "P¿]Ý1´Ý".toCharArray();
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
            field_5093 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 188;
            break;
         case 1:
            var10009 = 32;
            break;
         case 2:
            var10009 = 225;
            break;
         case 3:
            var10009 = 120;
            break;
         case 4:
            var10009 = 150;
            break;
         case 5:
            var10009 = 29;
            break;
         default:
            var10009 = 98;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}
