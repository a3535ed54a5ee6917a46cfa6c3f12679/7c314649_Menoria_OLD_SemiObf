import java.io.DataInput;
import java.io.DataOutput;
import java.util.Arrays;

// $FF: renamed from: rq
public class class_1581 extends class_1571 {

   // $FF: renamed from: a int[]
   private int[] field_8275;


   // $FF: renamed from: <init> () void
   void method_8628() {
      super.method_8628();
   }

   // $FF: renamed from: <init> (int[]) void
   public void method_8661(int[] var1) {
      super.method_8628();
      this.field_8275 = var1;
   }

   // $FF: renamed from: b (java.io.DataOutput) void
   void method_8629(DataOutput var1) {
      String[] var10000 = class_752.method_4253();
      var1.writeInt(this.field_8275.length);
      String[] var2 = var10000;
      int var3 = 0;

      while(var3 < this.field_8275.length) {
         var1.writeInt(this.field_8275[var3]);
         ++var3;
         if(var2 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: b (java.io.DataInput, int, ri) void
   void method_8630(DataInput var1, int var2, class_1567 var3) {
      int var5 = var1.readInt();
      var3.method_8604((long)(32 * var5));
      String[] var10000 = class_752.method_4253();
      this.field_8275 = new int[var5];
      String[] var4 = var10000;
      int var6 = 0;

      while(var6 < var5) {
         this.field_8275[var6] = var1.readInt();
         ++var6;
         if(var4 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: b () byte
   public byte method_8631() {
      return (byte)11;
   }

   public String toString() {
      String[] var10000 = class_752.method_4253();
      String var2 = "[";
      int[] var3 = this.field_8275;
      int var4 = var3.length;
      String[] var1 = var10000;
      int var5 = 0;

      String var7;
      while(true) {
         if(var5 < var4) {
            int var6 = var3[var5];
            var7 = var2 + var6 + ",";
            if(var1 == null) {
               break;
            }

            var2 = var7;
            ++var5;
            if(var1 != null) {
               continue;
            }
         }

         var7 = var2 + "]";
         break;
      }

      return var7;
   }

   // $FF: renamed from: c () rm
   public class_1571 method_8633() {
      int[] var1 = new int[this.field_8275.length];
      System.arraycopy(this.field_8275, 0, var1, 0, this.field_8275.length);
      class_1581 var10000 = new class_1581;
      var10000.method_8661(var1);
      return var10000;
   }

   public boolean equals(Object var1) {
      String[] var2 = class_752.method_4253();
      boolean var10000 = super.equals(var1);
      if(var2 != null) {
         if(var10000) {
            return Arrays.equals(this.field_8275, ((class_1581)var1).field_8275);
         }

         var10000 = false;
      }

      return var10000;
   }

   public int hashCode() {
      return super.hashCode() ^ Arrays.hashCode(this.field_8275);
   }

   // $FF: renamed from: a () int[]
   public int[] method_8662() {
      return this.field_8275;
   }
}
