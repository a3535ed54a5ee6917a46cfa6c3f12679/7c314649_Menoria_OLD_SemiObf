import java.util.Random;

// $FF: renamed from: ei
public class class_476 extends class_473 {

   // $FF: renamed from: M java.lang.Class
   private Class field_2247;
   // $FF: renamed from: N boolean
   private boolean field_2248;


   // $FF: renamed from: <init> (java.lang.Class, boolean) void
   protected void method_2829(Class var1, boolean var2) {
      super.method_2427(awt.field_4173);
      this.field_2248 = var2;
      this.field_2247 = var1;
      float var3 = 0.25F;
      float var4 = 1.0F;
      this.method_2443(0.5F - var3, 0.0F, 0.5F - var3, 0.5F + var3, var4, 0.5F + var3);
   }

   // $FF: renamed from: a (int, int) vL
   public IIcon method_2448(int var1, int var2) {
      return class_1192.field_6030.getBlockTextureFromSide(var1);
   }

   // $FF: renamed from: a (ahb, int, int, int) kg
   public class_1343 method_2452(ahb var1, int var2, int var3, int var4) {
      return null;
   }

   // $FF: renamed from: g (ahb, int, int, int) kg
   public class_1343 method_2450(ahb var1, int var2, int var3, int var4) {
      this.method_2486(var1, var2, var3, var4);
      return super.method_2450(var1, var2, var3, var4);
   }

   // $FF: renamed from: a (ahl, int, int, int) void
   public void method_2486(ahl param1, int param2, int param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b () int
   public int method_2436() {
      return -1;
   }

   // $FF: renamed from: d () boolean
   public boolean method_2434() {
      return false;
   }

   // $FF: renamed from: b (ahl, int, int, int) boolean
   public boolean method_2435(ahl var1, int var2, int var3, int var4) {
      return true;
   }

   // $FF: renamed from: c () boolean
   public boolean method_2453() {
      return false;
   }

   // $FF: renamed from: a (ahb, int) gi
   public class_580 method_124(ahb var1, int var2) {
      try {
         return (class_580)this.field_2247.newInstance();
      } catch (Exception var4) {
         throw new RuntimeException(var4);
      }
   }

   // $FF: renamed from: a (int, java.util.Random, int) adb
   public adb method_2464(int var1, Random var2, int var3) {
      return class_1010.field_5181;
   }

   // $FF: renamed from: a (ahb, int, int, int, aji) void
   public void method_2459(ahb param1, int param2, int param3, int param4, aji param5) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: d (ahb, int, int, int) adb
   public adb method_2517(ahb var1, int var2, int var3, int var4) {
      return class_1010.field_5181;
   }

   // $FF: renamed from: a (vM) void
   public void method_2535(class_74 var1) {}

   // $FF: renamed from: b (java.lang.RuntimeException) java.lang.RuntimeException
   private static RuntimeException method_2830(RuntimeException var0) {
      return var0;
   }
}
