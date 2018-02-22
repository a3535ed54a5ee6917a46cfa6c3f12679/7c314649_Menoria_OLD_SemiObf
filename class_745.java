
// $FF: renamed from: v_
public class class_745 extends class_716 {

   // $FF: renamed from: aJ sa
   private class_689 field_3288;
   // $FF: renamed from: aK int
   private int field_3289;
   // $FF: renamed from: aL int
   private int field_3290;
   // $FF: renamed from: aM java.lang.String
   private String field_3291;
   // $FF: renamed from: eb java.lang.String
   private static final String field_3292 = "crit";


   // $FF: renamed from: <init> (ahb, sa) void
   public void method_4134(ahb var1, class_689 var2) {
      this.method_4135(var1, var2, "crit");
   }

   // $FF: renamed from: <init> (ahb, sa, java.lang.String) void
   public void method_4135(ahb var1, class_689 var2, String var3) {
      super.method_4093(var1, var2.field_2994, var2.field_3004.field_6910 + (double)(var2.field_3015 / 2.0F), var2.field_2996, var2.field_2997, var2.field_2998, var2.field_2999);
      this.field_3288 = var2;
      this.field_3290 = 3;
      this.field_3291 = var3;
      this.method_3856();
   }

   // $FF: renamed from: b (bmh, float, float, float, float, float, float) void
   public void method_4101(bmh var1, float var2, float var3, float var4, float var5, float var6, float var7) {}

   // $FF: renamed from: h () void
   public void method_3856() {
      String[] var10000 = class_752.method_4253();
      int var2 = 0;
      String[] var1 = var10000;

      class_745 var17;
      label43: {
         int var16;
         while(true) {
            if(var2 < 16) {
               label33: {
                  double var3 = (double)(this.field_3028.nextFloat() * 2.0F - 1.0F);
                  double var5 = (double)(this.field_3028.nextFloat() * 2.0F - 1.0F);
                  double var7 = (double)(this.field_3028.nextFloat() * 2.0F - 1.0F);
                  double var15 = var3 * var3 + var5 * var5 + var7 * var7;
                  double var10001 = 1.0D;
                  if(var1 != null) {
                     double var18;
                     var16 = (var18 = var15 - 1.0D) == 0.0D?0:(var18 < 0.0D?-1:1);
                     if(var1 == null) {
                        break;
                     }

                     if(var16 > 0) {
                        break label33;
                     }

                     var15 = this.field_3288.field_2994;
                     var10001 = var3 * (double)this.field_3288.field_3014 / 4.0D;
                  }

                  double var9 = var15 + var10001;
                  double var11 = this.field_3288.field_3004.field_6910 + (double)(this.field_3288.field_3015 / 2.0F) + var5 * (double)this.field_3288.field_3015 / 4.0D;
                  double var13 = this.field_3288.field_2996 + var7 * (double)this.field_3288.field_3014 / 4.0D;
                  this.field_2990.method_2087(this.field_3291, var9, var11, var13, var3, var5 + 0.2D, var7);
               }

               ++var2;
               if(var1 != null) {
                  continue;
               }
            }

            ++this.field_3289;
            var17 = this;
            if(var1 == null) {
               break label43;
            }

            var16 = this.field_3289;
            break;
         }

         if(var16 < this.field_3290) {
            return;
         }

         var17 = this;
      }

      var17.method_3851();
   }

   // $FF: renamed from: e () int
   public int method_4102() {
      return 3;
   }

   // $FF: renamed from: <clinit> () void
   static void method_4107() {
      boolean var10000 = true;
      char[] var10003 = "Q*i".toCharArray();
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
            field_3292 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 128;
            break;
         case 1:
            var10009 = 213;
            break;
         case 2:
            var10009 = 181;
            break;
         case 3:
            var10009 = 235;
            break;
         case 4:
            var10009 = 197;
            break;
         case 5:
            var10009 = 34;
            break;
         default:
            var10009 = 47;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}
