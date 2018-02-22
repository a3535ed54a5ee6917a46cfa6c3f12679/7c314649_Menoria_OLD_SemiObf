import java.io.DataInput;
import java.io.DataOutput;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// $FF: renamed from: rr
public class class_1580 extends class_1571 {

   // $FF: renamed from: a java.util.List
   private List field_8271;
   // $FF: renamed from: d byte
   private byte field_8272;
   // $FF: renamed from: e java.lang.String
   private static final String field_8273;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_8274;


   // $FF: renamed from: <init> () void
   public void method_8628() {
      super.method_8628();
      this.field_8271 = new ArrayList();
      this.field_8272 = 0;
   }

   // $FF: renamed from: b (java.io.DataOutput) void
   void method_8629(DataOutput param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.io.DataInput, int, ri) void
   void method_8630(DataInput param1, int param2, class_1567 param3) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b () byte
   public byte method_8631() {
      return (byte)9;
   }

   public String toString() {
      String var2 = "[";
      String[] var10000 = class_752.method_4253();
      int var3 = 0;
      Iterator var4 = this.field_8271.iterator();
      String[] var1 = var10000;

      String var6;
      while(true) {
         if(var4.hasNext()) {
            class_1571 var5 = (class_1571)var4.next();
            var6 = var2 + "" + var3 + ':' + var5 + ',';
            if(var1 == null) {
               break;
            }

            var2 = var6;
            ++var3;
            if(var1 != null) {
               continue;
            }
         }

         var6 = var2 + "]";
         break;
      }

      return var6;
   }

   // $FF: renamed from: b (rm) void
   public void method_8650(class_1571 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (int, rm) void
   public void method_8651(int param1, class_1571 param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (int) rm
   public class_1571 method_8652(int var1) {
      return (class_1571)this.field_8271.remove(var1);
   }

   // $FF: renamed from: c (int) ro
   public class_1583 method_8653(int param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: d (int) int[]
   public int[] method_8654(int param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: e (int) double
   public double method_8655(int param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: f (int) float
   public float method_8656(int param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: g (int) java.lang.String
   public String method_8657(int param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a () int
   public int method_8658() {
      return this.field_8271.size();
   }

   // $FF: renamed from: c () rm
   public class_1571 method_8633() {
      String[] var10000 = class_752.method_4253();
      class_1580 var10001 = new class_1580;
      var10001.method_8628();
      class_1580 var2 = var10001;
      String[] var1 = var10000;
      var2.field_8272 = this.field_8272;
      Iterator var3 = this.field_8271.iterator();

      class_1580 var7;
      while(true) {
         if(var3.hasNext()) {
            class_1571 var4 = (class_1571)var3.next();
            class_1571 var5 = var4.method_8633();

            try {
               var7 = var2;
               if(var1 == null) {
                  break;
               }

               var2.field_8271.add(var5);
               if(var1 != null) {
                  continue;
               }
            } catch (RuntimeException var6) {
               throw method_8660(var6);
            }
         }

         var7 = var2;
         break;
      }

      return var7;
   }

   public boolean equals(Object param1) {
      // $FF: Couldn't be decompiled
   }

   public int hashCode() {
      return super.hashCode() ^ this.field_8271.hashCode();
   }

   // $FF: renamed from: e () int
   public int method_8659() {
      return this.field_8272;
   }

   // $FF: renamed from: b (java.lang.RuntimeException) java.lang.RuntimeException
   private static RuntimeException method_8660(RuntimeException var0) {
      return var0;
   }

   // $FF: renamed from: <clinit> () void
   static void method_8635() {
      // $FF: Couldn't be decompiled
   }
}
