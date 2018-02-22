
// $FF: renamed from: pV
public class class_1483 {

   // $FF: renamed from: b int
   private final int field_7798;
   // $FF: renamed from: c int
   private final int field_7799;


   // $FF: renamed from: <init> (int) void
   public void method_7998(int var1) {
      this.method_7999(var1, -1);
   }

   // $FF: renamed from: <init> (int, int) void
   public void method_7999(int var1, int var2) {
      super();
      this.field_7798 = var1;
      this.field_7799 = var2;
   }

   // $FF: renamed from: b () boolean
   public boolean method_8000() {
      String[] var1 = class_752.method_4253();
      int var10000 = this.field_7799;
      if(var1 != null) {
         var10000 = this.field_7799 == -1?1:0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: c () int
   public int method_8001() {
      return this.field_7799;
   }

   // $FF: renamed from: d () int
   public int method_8002() {
      return this.field_7798;
   }
}
