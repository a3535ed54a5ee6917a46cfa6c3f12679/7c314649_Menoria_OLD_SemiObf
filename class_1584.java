import java.io.DataInput;
import java.io.DataOutput;
import java.util.Arrays;

// $FF: renamed from: rn
public class class_1584 extends class_1571 {

   // $FF: renamed from: a byte[]
   private byte[] field_8281;
   // $FF: renamed from: h java.lang.String
   private static final String field_8282 = " bytes]";


   // $FF: renamed from: <init> () void
   void method_8628() {
      super.method_8628();
   }

   // $FF: renamed from: <init> (byte[]) void
   public void method_8700(byte[] var1) {
      super.method_8628();
      this.field_8281 = var1;
   }

   // $FF: renamed from: b (java.io.DataOutput) void
   void method_8629(DataOutput var1) {
      var1.writeInt(this.field_8281.length);
      var1.write(this.field_8281);
   }

   // $FF: renamed from: b (java.io.DataInput, int, ri) void
   void method_8630(DataInput var1, int var2, class_1567 var3) {
      int var4 = var1.readInt();
      var3.method_8604((long)(8 * var4));
      this.field_8281 = new byte[var4];
      var1.readFully(this.field_8281);
   }

   // $FF: renamed from: b () byte
   public byte method_8631() {
      return (byte)7;
   }

   public String toString() {
      return "[" + this.field_8281.length + " bytes]";
   }

   // $FF: renamed from: c () rm
   public class_1571 method_8633() {
      byte[] var1 = new byte[this.field_8281.length];
      System.arraycopy(this.field_8281, 0, var1, 0, this.field_8281.length);
      class_1584 var10000 = new class_1584;
      var10000.method_8700(var1);
      return var10000;
   }

   public boolean equals(Object var1) {
      String[] var2 = class_752.method_4253();
      boolean var10000 = super.equals(var1);
      if(var2 != null) {
         if(var10000) {
            return Arrays.equals(this.field_8281, ((class_1584)var1).field_8281);
         }

         var10000 = false;
      }

      return var10000;
   }

   public int hashCode() {
      return super.hashCode() ^ Arrays.hashCode(this.field_8281);
   }

   // $FF: renamed from: a () byte[]
   public byte[] method_8701() {
      return this.field_8281;
   }

   // $FF: renamed from: <clinit> () void
   static void method_8635() {
      boolean var10000 = true;
      char[] var10003 = "£Ç\'¥k".toCharArray();
      Object var10004 = var10003.length;
      Object var3 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var0 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var4 = var10002;
         var10002 = var10003;
         if(var10003 <= var0) {
            field_8282 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 53;
            break;
         case 1:
            var10009 = 230;
            break;
         case 2:
            var10009 = 217;
            break;
         case 3:
            var10009 = 176;
            break;
         case 4:
            var10009 = 65;
            break;
         case 5:
            var10009 = 213;
            break;
         default:
            var10009 = 53;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}
