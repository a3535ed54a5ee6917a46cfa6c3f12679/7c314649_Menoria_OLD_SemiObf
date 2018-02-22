
// $FF: renamed from: ou
public class class_833 extends class_827 {

   // $FF: renamed from: h bqx
   private static final bqx field_3869;


   // $FF: renamed from: <init> (bhr, float) void
   public void method_4798(bhr var1, float var2) {
      super.method_4798(var1, var2);
   }

   // $FF: renamed from: b (wO, double, double, double, float, float) void
   public void method_4848(class_775 var1, double var2, double var4, double var6, float var8, float var9) {
      super.method_4830(var1, var2, var4, var6, var8, var9);
   }

   // $FF: renamed from: b (wO) bqx
   protected bqx method_4849(class_775 var1) {
      return field_3869;
   }

   // $FF: renamed from: b (wO, float) float
   protected float method_4850(class_775 var1, float var2) {
      float var3 = var1.field_3537 + (var1.field_3534 - var1.field_3537) * var2;
      float var4 = var1.field_3536 + (var1.field_3535 - var1.field_3536) * var2;
      return (class_1715.method_9555(var3) + 1.0F) * var4;
   }

   // $FF: renamed from: b (sv, float) float
   // $FF: synthetic method
   protected float method_4806(class_752 var1, float var2) {
      return this.method_4850((class_775)var1, var2);
   }

   // $FF: renamed from: <clinit> () void
   static void method_4744() {
      boolean var10000 = true;
      char[] var10003 = "ðj.mÁíp/|Áëv2c¦n5".toCharArray();
      Object var10004 = var10003.length;
      Object var5 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var1 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var6 = var10002;
         var10002 = var10003;
         if(var10003 <= var1) {
            String var0 = (new String((char[])var5)).intern();
            bqx var3 = new bqx;
            var3.method_8227(var0);
            field_3869 = var3;
            return;
         }

         char var10007 = (char)((Object[])var5)[var1];
         short var10009;
         switch(var1 % 7) {
         case 0:
            var10009 = 187;
            break;
         case 1:
            var10009 = 188;
            break;
         case 2:
            var10009 = 218;
            break;
         case 3:
            var10009 = 76;
            break;
         case 4:
            var10009 = 9;
            break;
         case 5:
            var10009 = 167;
            break;
         default:
            var10009 = 90;
         }

         ((Object[])var5)[var1] = (char)(var10007 ^ var6 ^ var10009);
         ++var1;
      }
   }
}
