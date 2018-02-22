package ca.diiza.h;


// $FF: renamed from: ca.diiza.h.a
public class class_688 implements class_22 {

   // $FF: renamed from: a java.lang.String
   private String field_2970;
   // $FF: renamed from: b int
   private int field_2971;
   // $FF: renamed from: c add[]
   private add[] field_2972;
   // $FF: renamed from: d sa[]
   private static class_689[] field_2973;


   // $FF: renamed from: <init> (java.lang.String, int) void
   public void method_3801(String var1, int var2) {
      super();
      method_3812();
      this.field_2970 = var1;
      this.field_2971 = var2;
      this.field_2972 = new add[var2];
      if(class_689.method_3977() == 0) {
         method_3811(new class_689[2]);
      }

   }

   // $FF: renamed from: c (int) add
   public add method_84(int var1) {
      return this.field_2972[var1];
   }

   // $FF: renamed from: b (int, int) add
   public add method_85(int var1, int var2) {
      return null;
   }

   // $FF: renamed from: j (int) add
   public add method_86(int var1) {
      this.field_2972[var1] = null;
      return null;
   }

   // $FF: renamed from: f () int
   public int method_83() {
      return this.field_2971;
   }

   // $FF: renamed from: a () java.lang.String
   public String method_3802() {
      return this.field_2970;
   }

   // $FF: renamed from: k () int
   public int method_90() {
      return 64;
   }

   // $FF: renamed from: b (yz) boolean
   public boolean method_92(class_792 var1) {
      return false;
   }

   // $FF: renamed from: b () add
   public add method_3803() {
      return method_3804(this.field_2972[0]);
   }

   // $FF: renamed from: a (add) add
   public static add method_3804(add var0) {
      return var0 == null?null:var0;
   }

   // $FF: renamed from: b (add) void
   public void method_3805(add var1) {
      class_689[] var10000 = method_3812();
      add var10001 = new add;
      var10001.method_3726(var1.method_3730(), 1, var1.method_3745());
      var1 = var10001;
      class_689[] var2 = var10000;
      this.field_2972[0] = var1.method_3754();
      if(var2 != null) {
         int var3 = class_689.method_3976();
         ++var3;
         class_689.method_3975(var3);
      }

   }

   // $FF: renamed from: c () void
   public void method_3806() {
      this.field_2972[0] = null;
   }

   // $FF: renamed from: c (add) void
   public void method_3807(add var1) {
      this.field_2972[0] = var1;
   }

   // $FF: renamed from: d () add
   public add method_3808() {
      return this.field_2972[0];
   }

   // $FF: renamed from: b (int, add) void
   public void method_87(int var1, add var2) {}

   // $FF: renamed from: l () void
   public void method_91() {}

   // $FF: renamed from: a (int, add) void
   public void method_3809(int var1, add var2) {
      this.field_2972[var1] = null;
      this.field_2972[var1] = var2.method_3754();
   }

   // $FF: renamed from: e () void
   public void method_3810() {
      class_689[] var10000 = method_3812();
      int var2 = 0;
      class_689[] var1 = var10000;

      while(var2 < this.field_2971) {
         this.field_2972[var2] = null;
         ++var2;
         if(var1 != null) {
            break;
         }
      }

   }

   // $FF: renamed from: i () java.lang.String
   public String method_88() {
      return null;
   }

   // $FF: renamed from: j () boolean
   public boolean method_89() {
      return false;
   }

   // $FF: renamed from: d (int, add) boolean
   public boolean method_95(int var1, add var2) {
      return false;
   }

   // $FF: renamed from: m () void
   public void method_93() {}

   // $FF: renamed from: n () void
   public void method_94() {}

   // $FF: renamed from: b (sa[]) void
   public static void method_3811(class_689[] var0) {
      field_2973 = var0;
   }

   // $FF: renamed from: g () sa[]
   public static class_689[] method_3812() {
      return field_2973;
   }

   // $FF: renamed from: <clinit> () void
   static void method_3813() {
      if(method_3812() != null) {
         method_3811(new class_689[2]);
      }

   }
}
