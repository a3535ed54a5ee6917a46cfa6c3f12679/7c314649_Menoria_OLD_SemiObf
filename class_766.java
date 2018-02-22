
// $FF: renamed from: wW
public class class_766 extends class_764 implements class_84 {

   // $FF: renamed from: bA java.lang.String
   private static final String field_3464;
   // $FF: renamed from: hb java.lang.String[]
   private static final String[] field_3465;


   // $FF: renamed from: <init> (ahb) void
   public void method_3847(ahb var1) {
      super.method_3847(var1);
      this.method_3852(0.4F, 1.8F);
      this.method_4257().method_9784(true);
      class_1776 var10000 = this.field_3373;
      class_1752 var10002 = new class_1752;
      var10002.method_9701(this, 1.25D, 20, 10.0F);
      var10000.method_9766(1, var10002);
      var10000 = this.field_3373;
      class_1753 var2 = new class_1753;
      var2.method_9705(this, 1.0D);
      var10000.method_9766(2, var2);
      var10000 = this.field_3373;
      class_1728 var3 = new class_1728;
      var3.method_9657(this, class_792.class, 6.0F);
      var10000.method_9766(3, var3);
      var10000 = this.field_3373;
      class_1754 var4 = new class_1754;
      var4.method_9706(this);
      var10000.method_9766(4, var4);
      var10000 = this.field_3374;
      class_1771 var5 = new class_1771;
      var5.method_9742(this, class_753.class, 0, true, false, class_10.field_0);
      var10000.method_9766(1, var5);
   }

   // $FF: renamed from: bk () boolean
   public boolean method_4225() {
      return true;
   }

   // $FF: renamed from: aD () void
   protected void method_4157() {
      super.method_4157();
      this.method_4211(class_1840.field_9390).method_390(4.0D);
      this.method_4211(class_1840.field_9393).method_390(0.20000000298023224D);
   }

   // $FF: renamed from: e () void
   public void method_4231() {
      String[] var10000 = class_752.method_4253();
      super.method_4231();
      int var2 = class_1715.method_9561(this.field_2994);
      int var3 = class_1715.method_9561(this.field_2995);
      String[] var1 = var10000;
      int var4 = class_1715.method_9561(this.field_2996);
      int var6 = this.method_3875();
      if(var1 != null) {
         if(var6 != 0) {
            this.method_3896(class_1691.field_8834, 1.0F);
         }

         float var7;
         var6 = (var7 = this.field_2990.method_35(var2, var4).method_5713(var2, var3, var4) - 1.0F) == 0.0F?0:(var7 < 0.0F?-1:1);
      }

      if(var1 != null) {
         if(var6 > 0) {
            this.method_3896(class_1691.field_8831, 1.0F);
         }

         var6 = 0;
      }

      int var5 = var6;

      while(var5 < 4) {
         var2 = class_1715.method_9561(this.field_2994 + (double)((float)(var5 % 2 * 2 - 1) * 0.25F));
         var3 = class_1715.method_9561(this.field_2995);
         var4 = class_1715.method_9561(this.field_2996 + (double)((float)(var5 / 2 % 2 * 2 - 1) * 0.25F));
         if(var1 != null) {
            if(this.field_2990.getBlock(var2, var3, var4).method_2424() == awt.field_4170) {
               label57: {
                  float var8;
                  var6 = (var8 = this.field_2990.method_35(var2, var4).method_5713(var2, var3, var4) - 0.8F) == 0.0F?0:(var8 < 0.0F?-1:1);
                  if(var1 != null) {
                     if(var6 >= 0) {
                        break label57;
                     }

                     var6 = class_1192.field_6104.method_2480(this.field_2990, var2, var3, var4);
                  }

                  if(var1 != null && var6 != 0) {
                     this.field_2990.method_2058(var2, var3, var4, class_1192.field_6104);
                  }
               }
            }

            ++var5;
         }

         if(var1 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: u () adb
   protected adb method_4267() {
      return class_1010.field_5190;
   }

   // $FF: renamed from: b (boolean, int) void
   protected void method_4196(boolean var1, int var2) {
      int var4 = this.field_3028.nextInt(16);
      String[] var10000 = class_752.method_4253();
      int var5 = 0;
      String[] var3 = var10000;

      while(var5 < var4) {
         this.method_3914(class_1010.field_5190, 1);
         ++var5;
         if(var3 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: b (sv, float) void
   public void method_404(class_752 var1, float var2) {
      class_802 var10000 = new class_802;
      var10000.method_4682(this.field_2990, this);
      class_802 var3 = var10000;
      double var4 = var1.field_2994 - this.field_2994;
      double var6 = var1.field_2995 + (double)var1.method_3880() - 1.100000023841858D - var3.field_2995;
      double var8 = var1.field_2996 - this.field_2996;
      float var10 = class_1715.method_9558(var4 * var4 + var8 * var8) * 0.2F;
      var3.method_29(var4, var6 + (double)var10, var8, 1.6F, 12.0F);
      String[] var10001 = field_3465;
      this.method_3868("random.bow", 1.0F, 1.0F / (this.method_4165().nextFloat() * 0.4F + 0.8F));
      this.field_2990.method_2089(var3);
   }

   // $FF: renamed from: <clinit> () void
   static void method_28() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "½0)ês¤5µdv·mGÏæd";
      int var4 = "½0)ês¤5µdv·mGÏæd".length();
      char var1 = 10;
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
            char[] var11 = var8;
            var8 = var10003;
            if(var10003 <= var6) {
               var5[var3++] = (new String((char[])var9)).intern();
               if((var0 += var1) >= var4) {
                  field_3465 = var5;
                  String[] var10 = field_3465;
                  field_3464 = "CL_00001650";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 220;
               break;
            case 1:
               var10009 = 83;
               break;
            case 2:
               var10009 = 121;
               break;
            case 3:
               var10009 = 254;
               break;
            case 4:
               var10009 = 236;
               break;
            case 5:
               var10009 = 45;
               break;
            default:
               var10009 = 247;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}
