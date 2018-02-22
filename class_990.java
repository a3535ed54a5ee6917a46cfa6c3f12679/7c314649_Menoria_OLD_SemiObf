import java.util.List;
import java.util.Random;

// $FF: renamed from: dQ
public class class_990 extends class_985 {

   // $FF: renamed from: aF hl
   private static final class_1167 field_5066;
   // $FF: renamed from: aG java.lang.String
   private static final String field_5067 = "CL_00000182";


   // $FF: renamed from: <init> (int) void
   protected void method_5691(int var1) {
      super.method_5691(var1);
      List var10000 = this.field_5045;
      class_1653 var10001 = new class_1653;
      var10001.method_9099(class_772.class, 1, 2, 6);
      var10000.add(var10001);
      this.field_5043.field_5444 = 1;
      this.field_5043.field_5445 = 4;
      this.field_5043.field_5446 = 20;
   }

   // $FF: renamed from: b (java.util.Random) hd
   public class_1162 method_5696(Random var1) {
      return (class_1162)(var1.nextInt(5) > 0?field_5066:this.field_5051);
   }

   // $FF: renamed from: l () dz
   protected class_985 method_5720() {
      class_995 var10000 = new class_995;
      var10000.method_5729(this.field_5050 + 128, this);
      class_995 var1 = var10000;
      var1.field_5040 = (this.field_5040 + 1.0F) * 0.5F;
      var1.field_5038 = this.field_5038 * 0.5F + 0.3F;
      var1.field_5039 = this.field_5039 * 0.5F + 1.2F;
      return var1;
   }

   // $FF: renamed from: b (ahb, java.util.Random, int, int) void
   public void method_5714(ahb var1, Random var2, int var3, int var4) {
      field_5030.method_6357(2);
      String[] var10000 = class_752.method_4253();
      int var6 = 0;
      String[] var5 = var10000;

      while(true) {
         if(var6 < 7) {
            int var7 = var3 + var2.nextInt(16) + 8;
            int var8 = var4 + var2.nextInt(16) + 8;
            int var9 = var2.nextInt(var1.method_2071(var7, var8) + 32);
            field_5030.method_6351(var1, var2, var7, var9, var8);
            ++var6;
            if(var5 == null) {
               break;
            }

            if(var5 != null) {
               continue;
            }
         }

         super.method_5714(var1, var2, var3, var4);
         break;
      }

   }

   // $FF: renamed from: <clinit> () void
   static void method_5726() {
      boolean var10000 = true;
      char[] var10003 = ":Ñ¦ aGeÓ".toCharArray();
      Object var10004 = var10003.length;
      Object var5 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var0 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var6 = var10002;
         var10002 = var10003;
         if(var10003 <= var0) {
            field_5067 = (new String((char[])var5)).intern();
            String var2 = field_5067;
            class_1167 var3 = new class_1167;
            var3.method_6350(false);
            field_5066 = var3;
            return;
         }

         char var10007 = (char)((Object[])var5)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 122;
            break;
         case 1:
            var10009 = 93;
            break;
         case 2:
            var10009 = 118;
            break;
         case 3:
            var10009 = 202;
            break;
         case 4:
            var10009 = 145;
            break;
         case 5:
            var10009 = 189;
            break;
         default:
            var10009 = 187;
         }

         ((Object[])var5)[var0] = (char)(var10007 ^ var6 ^ var10009);
         ++var0;
      }
   }
}
