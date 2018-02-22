import com.google.common.collect.ComparisonChain;
import java.util.Comparator;

// $FF: renamed from: nT
public class class_1405 implements Comparator {

   // $FF: renamed from: b int
   int field_7479;
   // $FF: renamed from: c int
   int field_7480;


   // $FF: renamed from: <init> (int, int) void
   public void method_7665(int var1, int var2) {
      super();
      this.field_7479 = var1;
      this.field_7480 = var2;
   }

   // $FF: renamed from: b (n1, n1) int
   public int method_7666(class_1378 var1, class_1378 var2) {
      int var3 = var1.field_7314 - this.field_7479;
      int var4 = var1.field_7316 - this.field_7480;
      int var5 = var2.field_7314 - this.field_7479;
      int var6 = var2.field_7316 - this.field_7480;
      int var7 = var3 * var3 + var4 * var4;
      int var8 = var5 * var5 + var6 * var6;
      return ComparisonChain.start().compare(var8, var7).result();
   }

   // $FF: synthetic method
   public int compare(Object var1, Object var2) {
      return this.method_7666((class_1378)var1, (class_1378)var2);
   }
}
