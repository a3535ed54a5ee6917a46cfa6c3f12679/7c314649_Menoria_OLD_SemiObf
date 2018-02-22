
// $FF: renamed from: cM
public class class_952 extends class_940 {

   // $FF: renamed from: C java.lang.String[]
   private static final String[] field_4830;
   // $FF: renamed from: G int[]
   private static final int[] field_4831;
   // $FF: renamed from: H int[]
   private static final int[] field_4832;
   // $FF: renamed from: I int[]
   private static final int[] field_4833;
   // $FF: renamed from: J int
   public final int field_4834;
   // $FF: renamed from: F java.lang.String[]
   private static final String[] field_4835;


   // $FF: renamed from: <init> (int, int, int) void
   public void method_5510(int var1, int var2, int var3) {
      super.method_5479(var1, var2, class_93.field_37);
      this.field_4834 = var3;
   }

   // $FF: renamed from: b (int) int
   public int method_5483(int var1) {
      return field_4831[this.field_4834] + (var1 - 1) * field_4832[this.field_4834];
   }

   // $FF: renamed from: c (int) int
   public int method_5484(int var1) {
      return this.method_5483(var1) + field_4833[this.field_4834];
   }

   // $FF: renamed from: c () int
   public int method_5482() {
      return 5;
   }

   // $FF: renamed from: b (int, at) float
   public float method_5486(int var1, class_923 var2) {
      String[] var3 = class_752.method_4253();
      int var10000 = this.field_4834;
      if(var3 != null) {
         if(this.field_4834 == 0) {
            return (float)var1 * 1.25F;
         }

         var10000 = this.field_4834;
      }

      byte var10001 = 1;
      if(var3 != null) {
         if(var10000 == 1 && var2 == class_923.field_4664) {
            return (float)var1 * 2.5F;
         }

         var10000 = this.field_4834;
         var10001 = 2;
      }

      return var10000 == var10001 && var2 == class_923.field_4665?(float)var1 * 2.5F:0.0F;
   }

   // $FF: renamed from: d () java.lang.String
   public String method_5489() {
      StringBuilder var10000 = new StringBuilder();
      String[] var10001 = field_4835;
      return var10000.append("enchantment.damage.").append(field_4830[this.field_4834]).toString();
   }

   // $FF: renamed from: b (cH) boolean
   public boolean method_5487(class_940 var1) {
      String[] var2 = class_752.method_4253();
      boolean var10000 = var1 instanceof class_952;
      if(var2 != null) {
         var10000 = !var10000;
      }

      return var10000;
   }

   // $FF: renamed from: b (add) boolean
   public boolean method_5491(add var1) {
      String[] var2 = class_752.method_4253();
      boolean var10000 = var1.method_3730() instanceof class_542;
      if(var2 != null) {
         if(var10000) {
            return true;
         }

         var10000 = super.method_5491(var1);
      }

      return var10000;
   }

   // $FF: renamed from: b (sv, sa, int) void
   public void method_5492(class_752 var1, class_689 var2, int var3) {
      String[] var4 = class_752.method_4253();
      class_689 var10000 = var2;
      if(var4 != null) {
         if(!(var2 instanceof class_752)) {
            return;
         }

         var10000 = var2;
      }

      class_752 var5 = (class_752)var10000;
      if(this.field_4834 == 2 && var5.method_4213() == class_923.field_4665) {
         int var6 = 20 + var1.method_4165().nextInt(10 * var3);
         class_1645 var10001 = new class_1645;
         var10001.method_9012(class_1635.field_8492.field_8526, var6, 3);
         var5.method_4179(var10001);
      }

   }

   // $FF: renamed from: <clinit> () void
   static void method_5494() {
      // $FF: Couldn't be decompiled
   }
}
