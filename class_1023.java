
// $FF: renamed from: rc
public class class_1023 extends class_1022 {

   // $FF: renamed from: c java.lang.Object
   private final Object field_5399;


   // $FF: renamed from: <init> (java.lang.Object) void
   public void method_5809(Object var1) {
      super.method_5804();
      this.field_5399 = var1;
   }

   // $FF: renamed from: a (java.lang.Object) java.lang.Object
   public Object method_188(Object var1) {
      String[] var10000 = class_752.method_4253();
      Object var3 = super.method_188(var1);
      String[] var2 = var10000;
      Object var4 = var3;
      if(var2 != null) {
         var4 = var3 == null?this.field_5399:var3;
      }

      return var4;
   }
}
