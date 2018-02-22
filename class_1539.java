import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

// $FF: renamed from: qk
public class class_1539 implements class_65 {

   // $FF: renamed from: b java.util.List
   private final List field_8074;
   // $FF: renamed from: c java.util.Random
   private final Random field_8075;
   // $FF: renamed from: d bqx
   private final bqx field_8076;
   // $FF: renamed from: e aw
   private final class_930 field_8077;
   // $FF: renamed from: f double
   private double field_8078;
   // $FF: renamed from: g double
   private double field_8079;


   // $FF: renamed from: <init> (bqx, double, double, aw) void
   public void method_8356(bqx var1, double var2, double var4, class_930 var6) {
      super();
      this.field_8074 = Lists.newArrayList();
      this.field_8075 = new Random();
      this.field_8076 = var1;
      this.field_8079 = var4;
      this.field_8078 = var2;
      this.field_8077 = var6;
   }

   // $FF: renamed from: b () int
   public int method_335() {
      int var2 = 0;
      String[] var1 = class_752.method_4253();
      Iterator var3 = this.field_8074.iterator();

      int var10000;
      while(true) {
         if(var3.hasNext()) {
            class_65 var4 = (class_65)var3.next();
            var10000 = var2 + var4.method_335();
            if(var1 == null) {
               break;
            }

            var2 = var10000;
            if(var1 != null) {
               continue;
            }
         }

         var10000 = var2;
         break;
      }

      return var10000;
   }

   // $FF: renamed from: a () qg
   public class_1531 method_8357() {
      int var2 = this.method_335();
      String[] var1 = class_752.method_4253();
      int var10000 = this.field_8074.isEmpty();
      if(var1 != null) {
         if(var10000 != 0) {
            return class_1541.field_8087;
         }

         var10000 = var2;
      }

      if(var1 != null) {
         if(var10000 == 0) {
            return class_1541.field_8087;
         }

         var10000 = this.field_8075.nextInt(var2);
      }

      int var3 = var10000;
      Iterator var4 = this.field_8074.iterator();

      while(var4.hasNext()) {
         class_65 var5 = (class_65)var4.next();
         var3 -= var5.method_335();
         if(var3 < 0) {
            class_1531 var6 = (class_1531)var5.method_336();
            var6.method_8294(var6.method_8293() * this.field_8078);
            var6.method_8296(var6.method_8295() * this.field_8079);
            return var6;
         }

         if(var1 == null) {
            break;
         }
      }

      return class_1541.field_8087;
   }

   // $FF: renamed from: b (qp) void
   public void method_8358(class_65 var1) {
      this.field_8074.add(var1);
   }

   // $FF: renamed from: d () bqx
   public bqx method_8359() {
      return this.field_8076;
   }

   // $FF: renamed from: e () aw
   public class_930 method_8360() {
      return this.field_8077;
   }

   // $FF: renamed from: c () java.lang.Object
   // $FF: synthetic method
   public Object method_336() {
      return this.method_8357();
   }
}
