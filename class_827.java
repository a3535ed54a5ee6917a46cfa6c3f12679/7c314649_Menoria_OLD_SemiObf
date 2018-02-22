import org.lwjgl.opengl.GL11;

// $FF: renamed from: or
public abstract class class_827 extends boh {

   // $FF: renamed from: g java.lang.String
   private static final String field_3853 = "CL_00001015";


   // $FF: renamed from: <init> (bhr, float) void
   public void method_4798(bhr var1, float var2) {
      super.method_4798(var1, var2);
   }

   // $FF: renamed from: a (sw) boolean
   protected boolean method_4829(class_753 var1) {
      boolean var10000;
      label42: {
         String[] var2 = class_752.method_4253();
         var10000 = super.method_4816(var1);
         if(var2 != null) {
            if(!var10000) {
               break label42;
            }

            var10000 = var1.method_4221();
         }

         if(var2 == null) {
            return var10000;
         }

         if(!var10000) {
            class_753 var3 = var1;
            if(var2 != null) {
               if(!var1.method_4288()) {
                  break label42;
               }

               var3 = var1;
            }

            if(var3 != this.field_3788.field_7427) {
               break label42;
            }
         }

         var10000 = true;
         return var10000;
      }

      var10000 = false;
      return var10000;
   }

   // $FF: renamed from: a (sw, double, double, double, float, float) void
   public void method_4830(class_753 var1, double var2, double var4, double var6, float var8, float var9) {
      super.method_4801(var1, var2, var4, var6, var8, var9);
      this.method_4832(var1, var2, var4, var6, var8, var9);
   }

   // $FF: renamed from: b (double, double, double) double
   private double method_4831(double var1, double var3, double var5) {
      return var1 + (var3 - var1) * var5;
   }

   // $FF: renamed from: c (sw, double, double, double, float, float) void
   protected void method_4832(class_753 var1, double var2, double var4, double var6, float var8, float var9) {
      String[] var10000 = class_752.method_4253();
      class_689 var11 = var1.method_4300();
      String[] var10 = var10000;
      if(var10 != null) {
         if(var11 == null) {
            return;
         }

         var4 -= (1.6D - (double)var1.field_3015) * 0.5D;
      }

      bmh var12;
      double var15;
      double var17;
      double var19;
      double var21;
      label61: {
         var12 = bmh.instance;
         double var13 = this.method_4831((double)var11.field_3002, (double)var11.field_3000, (double)(var9 * 0.5F)) * 0.01745329238474369D;
         var15 = this.method_4831((double)var11.field_3003, (double)var11.field_3001, (double)(var9 * 0.5F)) * 0.01745329238474369D;
         var17 = Math.cos(var13);
         var19 = Math.sin(var13);
         var21 = Math.sin(var15);
         if(var10 != null) {
            if(!(var11 instanceof class_748)) {
               break label61;
            }

            var17 = 0.0D;
            var19 = 0.0D;
         }

         var21 = -1.0D;
      }

      double var23 = Math.cos(var15);
      double var25 = this.method_4831(var11.field_2991, var11.field_2994, (double)var9) - var17 * 0.7D - var19 * 0.5D * var23;
      double var27 = this.method_4831(var11.field_2992 + (double)var11.method_3880() * 0.7D, var11.field_2995 + (double)var11.method_3880() * 0.7D, (double)var9) - var21 * 0.5D - 0.25D;
      double var29 = this.method_4831(var11.field_2993, var11.field_2996, (double)var9) - var19 * 0.7D + var17 * 0.5D * var23;
      double var31 = this.method_4831((double)var1.field_3331, (double)var1.field_3330, (double)var9) * 0.01745329238474369D + 1.5707963267948966D;
      var17 = Math.cos(var31) * (double)var1.field_3014 * 0.4D;
      var19 = Math.sin(var31) * (double)var1.field_3014 * 0.4D;
      double var33 = this.method_4831(var1.field_2991, var1.field_2994, (double)var9) + var17;
      double var35 = this.method_4831(var1.field_2992, var1.field_2995, (double)var9);
      double var37 = this.method_4831(var1.field_2993, var1.field_2996, (double)var9) + var19;
      var2 += var17;
      var6 += var19;
      double var39 = (double)((float)(var25 - var33));
      double var41 = (double)((float)(var27 - var35));
      double var43 = (double)((float)(var29 - var37));
      GL11.glDisable(3553);
      GL11.glDisable(2896);
      GL11.glDisable(2884);
      boolean var45 = true;
      double var46 = 0.025D;
      var12.setVisible3(5);
      int var48 = 0;

      float var49;
      int var50;
      while(true) {
         if(var48 <= 24) {
            var50 = var48 % 2;
            if(var10 == null) {
               break;
            }

            label49: {
               if(var50 == 0) {
                  var12.setVisible7(0.5F, 0.4F, 0.3F, 1.0F);
                  if(var10 != null) {
                     break label49;
                  }
               }

               var12.setVisible7(0.35F, 0.28F, 0.21000001F, 1.0F);
            }

            var49 = (float)var48 / 24.0F;
            var12.method_7462(var2 + var39 * (double)var49 + 0.0D, var4 + var41 * (double)(var49 * var49 + var49) * 0.5D + (double)((24.0F - (float)var48) / 18.0F + 0.125F), var6 + var43 * (double)var49);
            var12.method_7462(var2 + var39 * (double)var49 + 0.025D, var4 + var41 * (double)(var49 * var49 + var49) * 0.5D + (double)((24.0F - (float)var48) / 18.0F + 0.125F) + 0.025D, var6 + var43 * (double)var49);
            ++var48;
            if(var10 != null) {
               continue;
            }
         }

         var12.getVisible8();
         var12.setVisible3(5);
         var50 = 0;
         break;
      }

      var48 = var50;

      while(true) {
         if(var48 <= 24) {
            var50 = var48 % 2;
            if(var10 == null) {
               break;
            }

            label35: {
               if(var50 == 0) {
                  var12.setVisible7(0.5F, 0.4F, 0.3F, 1.0F);
                  if(var10 != null) {
                     break label35;
                  }
               }

               var12.setVisible7(0.35F, 0.28F, 0.21000001F, 1.0F);
            }

            var49 = (float)var48 / 24.0F;
            var12.method_7462(var2 + var39 * (double)var49 + 0.0D, var4 + var41 * (double)(var49 * var49 + var49) * 0.5D + (double)((24.0F - (float)var48) / 18.0F + 0.125F) + 0.025D, var6 + var43 * (double)var49);
            var12.method_7462(var2 + var39 * (double)var49 + 0.025D, var4 + var41 * (double)(var49 * var49 + var49) * 0.5D + (double)((24.0F - (float)var48) / 18.0F + 0.125F), var6 + var43 * (double)var49 + 0.025D);
            ++var48;
            if(var10 != null) {
               continue;
            }
         }

         var12.getVisible8();
         GL11.glEnable(2896);
         GL11.glEnable(3553);
         var50 = 2884;
         break;
      }

      GL11.glEnable(var50);
   }

   // $FF: renamed from: b (sv) boolean
   protected boolean method_4816(class_752 var1) {
      return this.method_4829((class_753)var1);
   }

   // $FF: renamed from: a (sv, double, double, double, float, float) void
   public void method_4801(class_752 var1, double var2, double var4, double var6, float var8, float var9) {
      this.method_4830((class_753)var1, var2, var4, var6, var8, var9);
   }

   // $FF: renamed from: a (sa, double, double, double, float, float) void
   public void method_4728(class_689 var1, double var2, double var4, double var6, float var8, float var9) {
      this.method_4830((class_753)var1, var2, var4, var6, var8, var9);
   }

   // $FF: renamed from: <clinit> () void
   static void method_4744() {
      boolean var10000 = true;
      char[] var10003 = "°Aö}T3kÌ/ó".toCharArray();
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
            field_3853 = (new String((char[])var4)).intern();
            String var2 = field_3853;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 81;
            break;
         case 1:
            var10009 = 247;
            break;
         case 2:
            var10009 = 21;
            break;
         case 3:
            var10009 = 205;
            break;
         case 4:
            var10009 = 70;
            break;
         case 5:
            var10009 = 111;
            break;
         default:
            var10009 = 8;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
