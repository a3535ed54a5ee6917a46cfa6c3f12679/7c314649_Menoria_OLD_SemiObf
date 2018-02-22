import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// $FF: renamed from: d0
public class class_958 {

   // $FF: renamed from: a jm
   private class_1265 field_4846;
   // $FF: renamed from: b jm
   private class_1265 field_4847;
   // $FF: renamed from: c dW
   private class_1021 field_4848;
   // $FF: renamed from: d java.util.List
   private List field_4849;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_4850;


   // $FF: renamed from: <init> () void
   protected void method_5533() {
      super();
      class_1021 var10001 = new class_1021;
      var10001.method_5797(this);
      this.field_4848 = var10001;
      this.field_4849 = new ArrayList();
      this.field_4849.add(class_985.field_4992);
      this.field_4849.add(class_985.field_4989);
      this.field_4849.add(class_985.field_4993);
      this.field_4849.add(class_985.field_5007);
      this.field_4849.add(class_985.field_5006);
      this.field_4849.add(class_985.field_5009);
      this.field_4849.add(class_985.field_5010);
   }

   // $FF: renamed from: <init> (long, du) void
   public void method_5534(long var1, class_1046 var3) {
      this.method_5533();
      class_1265[] var4 = class_1265.method_6674(var1, var3);
      this.field_4846 = var4[0];
      this.field_4847 = var4[1];
   }

   // $FF: renamed from: <init> (ahb) void
   public void method_5535(ahb var1) {
      this.method_5534(var1.method_2183(), var1.method_2195().method_6868());
   }

   // $FF: renamed from: b () java.util.List
   public List method_5536() {
      return this.field_4849;
   }

   // $FF: renamed from: b (int, int) dz
   public class_985 method_5537(int var1, int var2) {
      return this.field_4848.method_5799(var1, var2);
   }

   // $FF: renamed from: b (float[], int, int, int, int) float[]
   public float[] method_5538(float[] param1, int param2, int param3, int param4, int param5) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (float, int) float
   public float method_5539(float var1, int var2) {
      return var1;
   }

   // $FF: renamed from: b (dz[], int, int, int, int) dz[]
   public class_985[] method_5540(class_985[] param1, int param2, int param3, int param4, int param5) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: c (dz[], int, int, int, int) dz[]
   public class_985[] method_5541(class_985[] var1, int var2, int var3, int var4, int var5) {
      return this.method_5542(var1, var2, var3, var4, var5, true);
   }

   // $FF: renamed from: b (dz[], int, int, int, int, boolean) dz[]
   public class_985[] method_5542(class_985[] param1, int param2, int param3, int param4, int param5, boolean param6) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (int, int, int, java.util.List) boolean
   public boolean method_5543(int param1, int param2, int param3, List param4) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (int, int, int, java.util.List, java.util.Random) dd
   public class_1034 method_5544(int param1, int param2, int param3, List param4, Random param5) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: c () void
   public void method_5545() {
      this.field_4848.method_5800();
   }

   // $FF: renamed from: b (java.lang.Throwable) java.lang.Throwable
   private static Throwable method_5546(Throwable var0) {
      return var0;
   }

   // $FF: renamed from: <clinit> () void
   static void method_5547() {
      // $FF: Couldn't be decompiled
   }
}
