import java.io.DataInput;
import java.io.DataOutput;

// $FF: renamed from: rm
public abstract class class_1571 {

   // $FF: renamed from: b java.lang.String[]
   public static final String[] field_8259;
   // $FF: renamed from: c java.lang.String
   private static final String field_8260;


   // $FF: renamed from: <init> () void
   public void method_8628() {
      super();
   }

   // $FF: renamed from: b (java.io.DataOutput) void
   abstract void method_8629(DataOutput var1);

   // $FF: renamed from: b (java.io.DataInput, int, ri) void
   abstract void method_8630(DataInput var1, int var2, class_1567 var3);

   public abstract String toString();

   // $FF: renamed from: b () byte
   public abstract byte method_8631();

   // $FF: renamed from: b (byte) rm
   protected static class_1571 method_8632(byte var0) {
      switch(var0) {
      case 0:
         class_1582 var11 = new class_1582;
         var11.method_8628();
         return var11;
      case 1:
         class_1578 var10 = new class_1578;
         var10.method_8628();
         return var10;
      case 2:
         class_1573 var9 = new class_1573;
         var9.method_8628();
         return var9;
      case 3:
         class_1575 var8 = new class_1575;
         var8.method_8628();
         return var8;
      case 4:
         class_1574 var7 = new class_1574;
         var7.method_8628();
         return var7;
      case 5:
         class_1576 var6 = new class_1576;
         var6.method_8628();
         return var6;
      case 6:
         class_1577 var5 = new class_1577;
         var5.method_8628();
         return var5;
      case 7:
         class_1584 var4 = new class_1584;
         var4.method_8628();
         return var4;
      case 8:
         class_1579 var3 = new class_1579;
         var3.method_8628();
         return var3;
      case 9:
         class_1580 var2 = new class_1580;
         var2.method_8628();
         return var2;
      case 10:
         class_1583 var1 = new class_1583;
         var1.method_8628();
         return var1;
      case 11:
         class_1581 var10000 = new class_1581;
         var10000.method_8628();
         return var10000;
      default:
         return null;
      }
   }

   // $FF: renamed from: c () rm
   public abstract class_1571 method_8633();

   public boolean equals(Object var1) {
      String[] var2 = class_752.method_4253();
      Object var10000 = var1;
      if(var2 != null) {
         if(!(var1 instanceof class_1571)) {
            return false;
         }

         var10000 = var1;
      }

      class_1571 var3 = (class_1571)var10000;
      int var4 = this.method_8631();
      if(var2 != null) {
         var4 = var4 == var3.method_8631()?1:0;
      }

      return (boolean)var4;
   }

   public int hashCode() {
      return this.method_8631();
   }

   // $FF: renamed from: d () java.lang.String
   protected String method_8634() {
      return this.toString();
   }

   // $FF: renamed from: <clinit> () void
   static void method_8635() {
      // $FF: Couldn't be decompiled
   }
}
