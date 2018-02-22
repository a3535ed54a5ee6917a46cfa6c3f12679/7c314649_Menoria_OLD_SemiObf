
// $FF: renamed from: ta
public class class_276 extends class_250 {

   // $FF: renamed from: c an
   private class_913 field_1466;
   // $FF: renamed from: d java.lang.String
   private static final String field_1467 = "CL_00001348";


   // $FF: renamed from: <init> () void
   public void method_1449() {
      super.method_1449();
   }

   // $FF: renamed from: <init> (an) void
   public void method_1586(class_913 var1) {
      super.method_1449();
      this.field_1466 = var1;
   }

   // $FF: renamed from: b (d) void
   public void method_1453(class_112 var1) {
      this.field_1466 = class_913.method_5376()[var1.readByte() % class_913.method_5376().length];
   }

   // $FF: renamed from: c (d) void
   public void method_1454(class_112 var1) {
      var1.writeByte(class_913.method_5377(this.field_1466));
   }

   // $FF: renamed from: b (tL) void
   public void method_1587(class_63 var1) {
      var1.method_253(this);
   }

   // $FF: renamed from: a () an
   public class_913 method_1588() {
      return this.field_1466;
   }

   // $FF: renamed from: b (rP) void
   public void method_1455(class_57 var1) {
      this.method_1587((class_63)var1);
   }

   // $FF: renamed from: <clinit> () void
   static void method_1458() {
      boolean var10000 = true;
      char[] var10003 = "Í\bõ3Ã¿wú".toCharArray();
      Object var10004 = var10003.length;
      Object var4 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var0 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var5 = var10002;
         var10002 = var10003;
         if(var10003 <= var0) {
            field_1467 = (new String((char[])var4)).intern();
            String var2 = field_1467;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 70;
            break;
         case 1:
            var10009 = 140;
            break;
         case 2:
            var10009 = 6;
            break;
         case 3:
            var10009 = 112;
            break;
         case 4:
            var10009 = 13;
            break;
         case 5:
            var10009 = 203;
            break;
         default:
            var10009 = 59;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
