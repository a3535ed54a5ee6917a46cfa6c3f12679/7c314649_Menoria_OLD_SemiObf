import java.util.Comparator;

// $FF: renamed from: t8
public class class_1593 implements Comparator {

   // $FF: renamed from: b vF
   private final class_1661 field_8305;


   // $FF: renamed from: <init> (vF) void
   public void method_8724(class_1661 var1) {
      super();
      this.field_8305 = var1;
   }

   // $FF: renamed from: b (xi, xi) int
   public int method_8725(class_793 var1, class_793 var2) {
      String[] var10000 = class_752.method_4253();
      double var4 = var1.method_3889((double)this.field_8305.field_8646, (double)this.field_8305.field_8647, (double)this.field_8305.field_8648);
      String[] var3 = var10000;
      double var6 = var2.method_3889((double)this.field_8305.field_8646, (double)this.field_8305.field_8647, (double)this.field_8305.field_8648);
      double var9;
      int var8 = (var9 = var4 - var6) == 0.0D?0:(var9 < 0.0D?-1:1);
      if(var3 != null) {
         if(var8 < 0) {
            return -1;
         }

         double var10;
         var8 = (var10 = var4 - var6) == 0.0D?0:(var10 < 0.0D?-1:1);
      }

      if(var3 != null) {
         if(var8 > 0) {
            return 1;
         }

         var8 = 0;
      }

      return var8;
   }

   // $FF: synthetic method
   public int compare(Object var1, Object var2) {
      return this.method_8725((class_793)var1, (class_793)var2);
   }
}
