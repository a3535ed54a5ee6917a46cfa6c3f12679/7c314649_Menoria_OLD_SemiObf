import java.io.DataInput;
import java.io.DataOutput;

// $FF: renamed from: rp
public class class_1582 extends class_1571 {

   // $FF: renamed from: h java.lang.String
   private static final String field_8276 = "END";


   // $FF: renamed from: <init> () void
   void method_8628() {
      super.method_8628();
   }

   // $FF: renamed from: b (java.io.DataInput, int, ri) void
   void method_8630(DataInput var1, int var2, class_1567 var3) {}

   // $FF: renamed from: b (java.io.DataOutput) void
   void method_8629(DataOutput var1) {}

   // $FF: renamed from: b () byte
   public byte method_8631() {
      return (byte)0;
   }

   public String toString() {
      return "END";
   }

   // $FF: renamed from: c () rm
   public class_1571 method_8633() {
      class_1582 var10000 = new class_1582;
      var10000.method_8628();
      return var10000;
   }

   // $FF: renamed from: <clinit> () void
   static void method_8635() {
      boolean var10000 = true;
      char[] var10003 = "9g".toCharArray();
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
            field_8276 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 166;
            break;
         case 1:
            var10009 = 235;
            break;
         case 2:
            var10009 = 249;
            break;
         case 3:
            var10009 = 88;
            break;
         case 4:
            var10009 = 107;
            break;
         case 5:
            var10009 = 170;
            break;
         default:
            var10009 = 87;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}
