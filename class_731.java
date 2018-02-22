
// $FF: renamed from: wl
public class class_731 extends class_716 {

   // $FF: renamed from: aJ int
   private int field_3249;
   // $FF: renamed from: aK int
   private int field_3250;
   // $FF: renamed from: eb java.lang.String
   private static final String field_3251 = "largeexplode";


   // $FF: renamed from: <init> (ahb, double, double, double, double, double, double) void
   public void method_4093(ahb var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super.method_4093(var1, var2, var4, var6, 0.0D, 0.0D, 0.0D);
      this.field_3250 = 8;
   }

   // $FF: renamed from: b (bmh, float, float, float, float, float, float) void
   public void method_4101(bmh var1, float var2, float var3, float var4, float var5, float var6, float var7) {}

   // $FF: renamed from: h () void
   public void method_3856() {
      String[] var10000 = class_752.method_4253();
      int var2 = 0;
      String[] var1 = var10000;

      while(true) {
         if(var2 < 6) {
            double var3 = this.field_2994 + (this.field_3028.nextDouble() - this.field_3028.nextDouble()) * 4.0D;
            double var5 = this.field_2995 + (this.field_3028.nextDouble() - this.field_3028.nextDouble()) * 4.0D;
            double var7 = this.field_2996 + (this.field_3028.nextDouble() - this.field_3028.nextDouble()) * 4.0D;
            this.field_2990.method_2087("largeexplode", var3, var5, var7, (double)((float)this.field_3249 / (float)this.field_3250), 0.0D, 0.0D);
            ++var2;
            if(var1 == null) {
               break;
            }

            if(var1 != null) {
               continue;
            }
         }

         ++this.field_3249;
         break;
      }

      class_731 var9 = this;
      if(var1 != null) {
         if(this.field_3249 != this.field_3250) {
            return;
         }

         var9 = this;
      }

      var9.method_3851();
   }

   // $FF: renamed from: e () int
   public int method_4102() {
      return 1;
   }

   // $FF: renamed from: <clinit> () void
   static void method_4107() {
      boolean var10000 = true;
      char[] var10003 = "ÇÀ¹ÊuÊÝºÊ".toCharArray();
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
            field_3251 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 94;
            break;
         case 1:
            var10009 = 23;
            break;
         case 2:
            var10009 = 3;
            break;
         case 3:
            var10009 = 111;
            break;
         case 4:
            var10009 = 30;
            break;
         case 5:
            var10009 = 161;
            break;
         default:
            var10009 = 94;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}
