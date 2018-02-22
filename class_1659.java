import java.util.Iterator;
import net.minecraft.server.MinecraftServer;

// $FF: renamed from: ud
public class class_1659 implements class_21 {

   // $FF: renamed from: b net.minecraft.server.MinecraftServer
   private MinecraftServer field_8633;
   // $FF: renamed from: c dk
   private class_354 field_8634;


   // $FF: renamed from: <init> (net.minecraft.server.MinecraftServer, dk) void
   public void method_9128(MinecraftServer var1, class_354 var2) {
      super();
      this.field_8633 = var1;
      this.field_8634 = var2;
   }

   // $FF: renamed from: a (java.lang.String, double, double, double, double, double, double) void
   public void method_75(String var1, double var2, double var4, double var6, double var8, double var10, double var12) {}

   // $FF: renamed from: a (sa) void
   public void method_76(class_689 var1) {
      this.field_8634.method_2256().method_9114(var1);
   }

   // $FF: renamed from: b (sa) void
   public void method_77(class_689 var1) {
      this.field_8634.method_2256().method_9117(var1);
   }

   // $FF: renamed from: a (java.lang.String, double, double, double, float, float) void
   public void method_73(String var1, double var2, double var4, double var6, float var8, float var9) {
      double var11;
      class_1627 var10000;
      label14: {
         String[] var10 = class_752.method_4253();
         var10000 = this.field_8633.method_2383();
         float var10004 = var8;
         float var10005 = 1.0F;
         if(var10 != null) {
            if(var8 <= 1.0F) {
               var11 = 16.0D;
               break label14;
            }

            var10004 = 16.0F;
            var10005 = var8;
         }

         var11 = (double)(var10004 * var10005);
      }

      int var12 = this.field_8634.field_1820.field_5738;
      class_329 var10006 = new class_329;
      var10006.method_1863(var1, var2, var4, var6, var8, var9);
      var10000.method_8903(var2, var4, var6, var11, var12, var10006);
   }

   // $FF: renamed from: a (yz, java.lang.String, double, double, double, float, float) void
   public void method_74(class_792 var1, String var2, double var3, double var5, double var7, float var9, float var10) {
      double var12;
      class_1627 var10000;
      label14: {
         String[] var11 = class_752.method_4253();
         var10000 = this.field_8633.method_2383();
         float var10005 = var9;
         float var10006 = 1.0F;
         if(var11 != null) {
            if(var9 <= 1.0F) {
               var12 = 16.0D;
               break label14;
            }

            var10005 = 16.0F;
            var10006 = var9;
         }

         var12 = (double)(var10005 * var10006);
      }

      int var13 = this.field_8634.field_1820.field_5738;
      class_329 var10007 = new class_329;
      var10007.method_1863(var2, var3, var5, var7, var9, var10);
      var10000.method_8904(var1, var3, var5, var7, var12, var13, var10007);
   }

   // $FF: renamed from: a (int, int, int, int, int, int) void
   public void method_72(int var1, int var2, int var3, int var4, int var5, int var6) {}

   // $FF: renamed from: a (int, int, int) void
   public void method_70(int var1, int var2, int var3) {
      this.field_8634.method_2257().method_9135(var1, var2, var3);
   }

   // $FF: renamed from: b (int, int, int) void
   public void method_71(int var1, int var2, int var3) {}

   // $FF: renamed from: a (java.lang.String, int, int, int) void
   public void method_78(String var1, int var2, int var3, int var4) {}

   // $FF: renamed from: a (yz, int, int, int, int, int) void
   public void method_80(class_792 var1, int var2, int var3, int var4, int var5, int var6) {
      class_1627 var10000 = this.field_8633.method_2383();
      double var10002 = (double)var3;
      double var10003 = (double)var4;
      double var10004 = (double)var5;
      int var10006 = this.field_8634.field_1820.field_5738;
      class_277 var10007 = new class_277;
      var10007.method_1589(var2, var3, var4, var5, var6, false);
      var10000.method_8904(var1, var10002, var10003, var10004, 64.0D, var10006, var10007);
   }

   // $FF: renamed from: a (int, int, int, int, int) void
   public void method_79(int var1, int var2, int var3, int var4, int var5) {
      class_1627 var10000 = this.field_8633.method_2383();
      class_277 var10001 = new class_277;
      var10001.method_1589(var1, var2, var3, var4, var5, true);
      var10000.method_8889(var10001);
   }

   // $FF: renamed from: b (int, int, int, int, int) void
   public void method_81(int var1, int var2, int var3, int var4, int var5) {
      String[] var10000 = class_752.method_4253();
      Iterator var7 = this.field_8633.method_2383().field_8456.iterator();
      String[] var6 = var10000;

      while(var7.hasNext()) {
         class_793 var8 = (class_793)var7.next();
         class_793 var15 = var8;
         if(var6 != null) {
            if(var8 == null) {
               continue;
            }

            var15 = var8;
         }

         if(var6 != null) {
            if(var15.field_2990 != this.field_8634) {
               continue;
            }

            var15 = var8;
         }

         int var16 = var15.method_3845();
         if(var6 != null) {
            if(var16 == var1) {
               continue;
            }

            var16 = var2;
         }

         double var9 = (double)var16 - var8.field_2994;
         double var11 = (double)var3 - var8.field_2995;
         double var13 = (double)var4 - var8.field_2996;
         if(var9 * var9 + var11 * var11 + var13 * var13 < 1024.0D) {
            class_1684 var17 = var8.field_3654;
            class_301 var10001 = new class_301;
            var10001.method_1720(var1, var2, var3, var4, var5);
            var17.method_9291(var10001);
         }

         if(var6 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: b () void
   public void method_82() {}
}
