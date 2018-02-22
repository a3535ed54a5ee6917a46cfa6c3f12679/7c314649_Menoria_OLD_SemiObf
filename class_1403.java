import java.util.Comparator;

// $FF: renamed from: nS
public class class_1403 implements Comparator {

   // $FF: renamed from: b double
   private double field_7454;
   // $FF: renamed from: c double
   private double field_7455;
   // $FF: renamed from: d double
   private double field_7456;


   // $FF: renamed from: <init> (sa) void
   public void method_7647(class_689 var1) {
      super();
      this.field_7454 = -var1.field_2994;
      this.field_7455 = -var1.field_2995;
      this.field_7456 = -var1.field_2996;
   }

   // $FF: renamed from: b (blo, blo) int
   public int method_7648(blo var1, blo var2) {
      double var3 = (double)var1.field_1899 + this.field_7454;
      double var5 = (double)var1.field_1900 + this.field_7455;
      double var7 = (double)var1.field_1901 + this.field_7456;
      double var9 = (double)var2.field_1899 + this.field_7454;
      double var11 = (double)var2.field_1900 + this.field_7455;
      double var13 = (double)var2.field_1901 + this.field_7456;
      return (int)((var3 * var3 + var5 * var5 + var7 * var7 - (var9 * var9 + var11 * var11 + var13 * var13)) * 1024.0D);
   }

   // $FF: synthetic method
   public int compare(Object var1, Object var2) {
      return this.method_7648((blo)var1, (blo)var2);
   }
}
