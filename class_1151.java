import java.util.Random;

// $FF: renamed from: hb
public abstract class class_1151 {

   // $FF: renamed from: b boolean
   private final boolean field_5967;


   // $FF: renamed from: <init> () void
   public void method_6349() {
      super();
      this.field_5967 = false;
   }

   // $FF: renamed from: <init> (boolean) void
   public void method_6350(boolean var1) {
      super();
      this.field_5967 = var1;
   }

   // $FF: renamed from: b (ahb, java.util.Random, int, int, int) boolean
   public abstract boolean method_6351(ahb var1, Random var2, int var3, int var4, int var5);

   // $FF: renamed from: b (double, double, double) void
   public void method_6352(double var1, double var3, double var5) {}

   // $FF: renamed from: b (ahb, int, int, int, aji) void
   protected void method_6353(ahb var1, int var2, int var3, int var4, aji var5) {
      this.method_6354(var1, var2, var3, var4, var5, 0);
   }

   // $FF: renamed from: b (ahb, int, int, int, aji, int) void
   protected void method_6354(ahb var1, int var2, int var3, int var4, aji var5, int var6) {
      String[] var7 = class_752.method_4253();
      if(var7 != null) {
         if(this.field_5967) {
            var1.method_2054(var2, var3, var4, var5, var6, 3);
            if(var7 != null) {
               return;
            }
         }

         var1.method_2054(var2, var3, var4, var5, var6, 2);
      }

   }
}
