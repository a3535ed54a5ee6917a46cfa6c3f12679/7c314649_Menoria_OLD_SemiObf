
// $FF: renamed from: rd
public class class_1026 extends class_1025 {

   // $FF: renamed from: c java.lang.String
   private final String field_5404;
   // $FF: renamed from: f java.lang.Object
   private Object field_5405;


   // $FF: renamed from: <init> (java.lang.String) void
   public void method_5820(String var1) {
      super.method_5804();
      this.field_5404 = var1;
   }

   // $FF: renamed from: a (int, java.lang.String, java.lang.Object) void
   public void method_5812(int var1, String var2, Object var3) {
      String[] var4 = class_752.method_4253();
      class_1026 var10000 = this;
      if(var4 != null) {
         if(this.field_5404.equals(var2)) {
            this.field_5405 = var3;
         }

         var10000 = this;
      }

      var10000.method_5812(var1, var2, var3);
   }

   // $FF: renamed from: a (java.lang.String) java.lang.Object
   public Object method_5813(String var1) {
      String[] var10000 = class_752.method_4253();
      Object var3 = super.method_5813(var1);
      String[] var2 = var10000;
      Object var4 = var3;
      if(var2 != null) {
         var4 = var3 == null?this.field_5405:var3;
      }

      return var4;
   }

   // $FF: renamed from: a (int) java.lang.Object
   public Object method_5817(int var1) {
      String[] var10000 = class_752.method_4253();
      Object var3 = super.method_5817(var1);
      String[] var2 = var10000;
      Object var4 = var3;
      if(var2 != null) {
         var4 = var3 == null?this.field_5405:var3;
      }

      return var4;
   }
}
