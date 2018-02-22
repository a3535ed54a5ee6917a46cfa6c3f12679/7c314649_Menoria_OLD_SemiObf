
// $FF: renamed from: xj
public class class_706 extends class_689 {

   // $FF: renamed from: at zg
   public final class_86 field_3157;
   // $FF: renamed from: au java.lang.String
   public final String field_3158;


   // $FF: renamed from: <init> (zg, java.lang.String, float, float) void
   public void method_4061(class_86 var1, String var2, float var3, float var4) {
      super.method_3847(var1.method_408());
      this.method_3852(var3, var4);
      this.field_3157 = var1;
      this.field_3158 = var2;
   }

   // $FF: renamed from: c () void
   protected void method_3848() {}

   // $FF: renamed from: a (ro) void
   protected void method_3908(class_1583 var1) {}

   // $FF: renamed from: b (ro) void
   protected void method_3909(class_1583 var1) {}

   // $FF: renamed from: R () boolean
   public boolean method_3897() {
      return true;
   }

   // $FF: renamed from: a (vX, float) boolean
   public boolean method_3896(class_1691 var1, float var2) {
      String[] var3 = class_752.method_4253();
      boolean var10000 = this.method_3961();
      if(var3 != null) {
         if(var10000) {
            return false;
         }

         var10000 = this.field_3157.method_409(this, var1, var2);
      }

      return var10000;
   }

   // $FF: renamed from: i (sa) boolean
   public boolean method_3956(class_689 var1) {
      boolean var3;
      label17: {
         String[] var2 = class_752.method_4253();
         class_706 var10000 = this;
         if(var2 != null) {
            if(this == var1) {
               break label17;
            }

            var10000 = this;
         }

         if(var10000.field_3157 != var1) {
            var3 = false;
            return var3;
         }
      }

      var3 = true;
      return var3;
   }
}
