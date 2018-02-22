import java.util.Random;

// $FF: renamed from: ff
public class class_376 extends class_373 {

   // $FF: renamed from: O java.lang.String
   private static final String field_2050 = "ice";


   // $FF: renamed from: <init> () void
   public void method_2581() {
      super.method_2576("ice", awt.field_4192, false);
      this.field_2008 = 0.98F;
      this.method_2440(true);
      this.method_2521(class_872.field_4244);
   }

   // $FF: renamed from: w () int
   public int method_2477() {
      return 1;
   }

   // $FF: renamed from: a (ahl, int, int, int, int) boolean
   public boolean method_2445(ahl var1, int var2, int var3, int var4, int var5) {
      return super.method_2445(var1, var2, var3, var4, 1 - var5);
   }

   // $FF: renamed from: a (ahb, yz, int, int, int, int) void
   public void method_2501(ahb var1, class_792 var2, int var3, int var4, int var5, int var6) {
      var2.method_4615(class_1698.field_8908[aji.method_2415(this)], 1);
      String[] var7 = class_752.method_4253();
      var2.method_4622(0.025F);
      int var10000 = this.method_2502();
      if(var7 != null) {
         label45: {
            if(var10000 != 0) {
               var10000 = class_980.method_5655(var2);
               if(var7 == null) {
                  break label45;
               }

               if(var10000 != 0) {
                  add var8 = this.method_2503(var6);
                  if(var8 != null) {
                     this.method_2468(var1, var3, var4, var5, var8);
                  }

                  if(var7 != null) {
                     return;
                  }
               }
            }

            var10000 = var1.field_1820.field_5735;
         }
      }

      if(var7 != null) {
         if(var10000 != 0) {
            var1.method_2056(var3, var4, var5);
            return;
         }

         var10000 = class_980.method_5656(var2);
      }

      int var10 = var10000;
      this.method_2466(var1, var3, var4, var5, var6, var10);
      awt var9 = var1.getBlock(var3, var4 - 1, var5).method_2424();
      if(var7 != null && (var9.method_5065() || var7 != null && var9.method_5062())) {
         var1.method_2058(var3, var4, var5, class_1192.field_6033);
      }

   }

   // $FF: renamed from: a (java.util.Random) int
   public int method_2463(Random var1) {
      return 0;
   }

   // $FF: renamed from: a (ahb, int, int, int, java.util.Random) void
   public void method_2456(ahb var1, int var2, int var3, int var4, Random var5) {
      String[] var6 = class_752.method_4253();
      int var10000 = var1.method_2074(class_95.field_54, var2, var3, var4);
      if(var6 != null) {
         if(var10000 <= 11 - this.method_2420()) {
            return;
         }

         var10000 = var1.field_1820.field_5735;
      }

      if(var6 != null) {
         if(var10000 != 0) {
            var1.method_2056(var2, var3, var4);
            return;
         }

         this.method_2466(var1, var2, var3, var4, var1.method_33(var2, var3, var4), 0);
         var1.method_2058(var2, var3, var4, class_1192.field_6034);
      }

   }

   // $FF: renamed from: h () int
   public int method_2514() {
      return 0;
   }

   // $FF: renamed from: <clinit> () void
   static void method_2537() {
      boolean var10000 = true;
      char[] var10003 = "Ût".toCharArray();
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
            field_2050 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 24;
            break;
         case 1:
            var10009 = 189;
            break;
         case 2:
            var10009 = 83;
            break;
         case 3:
            var10009 = 7;
            break;
         case 4:
            var10009 = 181;
            break;
         case 5:
            var10009 = 157;
            break;
         default:
            var10009 = 181;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}
