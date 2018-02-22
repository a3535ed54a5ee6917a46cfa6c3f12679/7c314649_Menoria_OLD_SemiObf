import java.util.Map;
import org.apache.logging.log4j.Logger;

// $FF: renamed from: gi
public class class_580 {

   // $FF: renamed from: b org.apache.logging.log4j.Logger
   private static final Logger field_2461;
   // $FF: renamed from: c java.util.Map
   private static Map field_2462;
   // $FF: renamed from: d java.util.Map
   private static Map field_2463;
   // $FF: renamed from: e ahb
   protected ahb field_2464;
   // $FF: renamed from: f int
   public int field_2465;
   // $FF: renamed from: g int
   public int field_2466;
   // $FF: renamed from: h int
   public int field_2467;
   // $FF: renamed from: i boolean
   protected boolean field_2468;
   // $FF: renamed from: j int
   public int field_2469;
   // $FF: renamed from: k aji
   public aji field_2470;
   // $FF: renamed from: l java.lang.String
   private static final String field_2471;
   // $FF: renamed from: m java.lang.String[]
   private static final String[] field_2472;


   // $FF: renamed from: <init> () void
   public void getBlock88() {
      super();
      this.field_2469 = -1;
   }

   // $FF: renamed from: b (java.lang.Class, java.lang.String) void
   private static void getBlock89(Class var0, String var1) {
      try {
         if(field_2462.containsKey(var1)) {
            IllegalArgumentException var10000 = new IllegalArgumentException;
            StringBuilder var10002 = new StringBuilder();
            String[] var10003 = field_2472;
            var10000.<init>(var10002.append("Duplicate id: ").append(var1).toString());
            throw var10000;
         }
      } catch (IllegalArgumentException var2) {
         throw method_3109(var2);
      }

      field_2462.put(var1, var0);
      field_2463.put(var0, var1);
   }

   // $FF: renamed from: a () ahb
   public ahb method_99() {
      return this.field_2464;
   }

   // $FF: renamed from: b (ahb) void
   public void getBlock90(ahb var1) {
      this.field_2464 = var1;
   }

   // $FF: renamed from: c () boolean
   public boolean getBlock91() {
      boolean var10000;
      try {
         if(this.field_2464 != null) {
            var10000 = true;
            return var10000;
         }
      } catch (IllegalArgumentException var1) {
         throw method_3109(var1);
      }

      var10000 = false;
      return var10000;
   }

   // $FF: renamed from: b (ro) void
   public void getBlock92(class_1583 var1) {
      this.field_2465 = var1.method_8681("x");
      this.field_2466 = var1.method_8681("y");
      this.field_2467 = var1.method_8681("z");
   }

   // $FF: renamed from: c (ro) void
   public void getBlock93(class_1583 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: g () void
   public void getBlock94() {}

   // $FF: renamed from: d (ro) gi
   public static class_580 getBlock95(class_1583 param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: h () int
   public int getBlock96() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: l () void
   public void method_91() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (double, double, double) double
   public double getBlock97(double var1, double var3, double var5) {
      double var7 = (double)this.field_2465 + 0.5D - var1;
      double var9 = (double)this.field_2466 + 0.5D - var3;
      double var11 = (double)this.field_2467 + 0.5D - var5;
      return var7 * var7 + var9 * var9 + var11 * var11;
   }

   // $FF: renamed from: o () double
   public double getBlock98() {
      return 4096.0D;
   }

   // $FF: renamed from: p () aji
   public aji getBlock99() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: q () r1
   public class_250 method_3100() {
      return null;
   }

   // $FF: renamed from: s () boolean
   public boolean method_3101() {
      return this.field_2468;
   }

   // $FF: renamed from: t () void
   public void method_3102() {
      this.field_2468 = true;
   }

   // $FF: renamed from: u () void
   public void method_3103() {
      this.field_2468 = false;
   }

   // $FF: renamed from: a (int, int) boolean
   public boolean method_3104(int var1, int var2) {
      return false;
   }

   // $FF: renamed from: v () void
   public void method_3105() {
      this.field_2470 = null;
      this.field_2469 = -1;
   }

   // $FF: renamed from: b (tR) void
   public void method_3106(class_1605 var1) {
      String[] var2 = field_2472;
      class_1065 var10002 = new class_1065;
      var10002.method_5998(this);
      var1.method_8777("Name", var10002);
      class_1605.method_8785(var1, this.field_2465, this.field_2466, this.field_2467, this.getBlock99(), this.getBlock96());
      class_1066 var3 = new class_1066;
      var3.method_6001(this);
      var1.method_8777("Actual block type", var3);
      class_1067 var4 = new class_1067;
      var4.method_6004(this);
      var1.method_8777("Actual block data value", var4);
   }

   // $FF: renamed from: w () java.util.Map
   static Map method_3107() {
      return field_2463;
   }

   // $FF: renamed from: <clinit> () void
   static void method_3108() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.Exception) java.lang.Exception
   private static Exception method_3109(Exception var0) {
      return var0;
   }
}
