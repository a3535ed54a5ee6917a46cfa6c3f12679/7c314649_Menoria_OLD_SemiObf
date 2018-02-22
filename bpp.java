
public abstract class bpp implements bqh {

   // $FF: renamed from: a int
   protected int field_7755;


   // $FF: renamed from: <init> () void
   public void method_7950() {
      super();
      this.field_7755 = -1;
   }

   // $FF: renamed from: b () int
   public int method_222() {
      if(this.field_7755 == -1) {
         this.field_7755 = bqi.method_8143();
      }

      return this.field_7755;
   }

   // $FF: renamed from: c () void
   public void method_7951() {
      String[] var1 = class_752.method_4253();
      int var10000 = this.field_7755;
      if(var1 != null) {
         if(this.field_7755 == -1) {
            return;
         }

         var10000 = this.field_7755;
      }

      bqi.method_8144(var10000);
      this.field_7755 = -1;
   }
}
