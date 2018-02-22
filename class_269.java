
// $FF: renamed from: th
public class class_269 extends class_250 {

   // $FF: renamed from: c int
   private int field_1437;
   // $FF: renamed from: d ao
   private class_915 field_1438;
   // $FF: renamed from: e java.lang.String
   private static final String field_1439 = "CL_00001357";


   // $FF: renamed from: <init> () void
   public void method_1449() {
      super.method_1449();
   }

   // $FF: renamed from: <init> (sa, ao) void
   public void method_1550(class_689 var1, class_915 var2) {
      super.method_1449();
      this.field_1437 = var1.method_3845();
      this.field_1438 = var2;
   }

   // $FF: renamed from: b (d) void
   public void method_1453(class_112 var1) {
      this.field_1437 = var1.readInt();
      this.field_1438 = class_915.method_5383()[var1.readByte() % class_915.method_5383().length];
   }

   // $FF: renamed from: c (d) void
   public void method_1454(class_112 var1) {
      var1.writeInt(this.field_1437);
      var1.writeByte(class_915.method_5384(this.field_1438));
   }

   // $FF: renamed from: b (tL) void
   public void method_1551(class_63 var1) {
      var1.method_260(this);
   }

   // $FF: renamed from: b (ahb) sa
   public class_689 method_1552(ahb var1) {
      return var1.method_2160(this.field_1437);
   }

   // $FF: renamed from: a () ao
   public class_915 method_1553() {
      return this.field_1438;
   }

   // $FF: renamed from: b (rP) void
   public void method_1455(class_57 var1) {
      this.method_1551((class_63)var1);
   }

   // $FF: renamed from: <clinit> () void
   static void method_1458() {
      boolean var10000 = true;
      char[] var10003 = "Kÿ ´ëú9æ\'".toCharArray();
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
            field_1439 = (new String((char[])var4)).intern();
            String var2 = field_1439;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 71;
            break;
         case 1:
            var10009 = 154;
            break;
         case 2:
            var10009 = 239;
            break;
         case 3:
            var10009 = 95;
            break;
         case 4:
            var10009 = 203;
            break;
         case 5:
            var10009 = 148;
            break;
         default:
            var10009 = 133;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
