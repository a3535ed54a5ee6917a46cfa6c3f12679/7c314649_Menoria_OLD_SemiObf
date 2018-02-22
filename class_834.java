
// $FF: renamed from: ot
public class class_834 extends class_827 {

   // $FF: renamed from: h bqx
   private static final bqx field_3870;
   // $FF: renamed from: k int
   private int field_3871;


   // $FF: renamed from: <init> () void
   public void method_4727() {
      class_1230 var10001 = new class_1230;
      var10001.method_6510();
      super.method_4798(var10001, 0.5F);
      this.field_3871 = ((class_1230)this.field_3844).drawRect6();
   }

   // $FF: renamed from: b (w2, double, double, double, float, float) void
   public void method_4851(class_790 var1, double var2, double var4, double var6, float var8, float var9) {
      String[] var10000 = class_752.method_4253();
      int var11 = ((class_1230)this.field_3844).drawRect6();
      String[] var10 = var10000;
      if(var10 != null) {
         if(var11 != this.field_3871) {
            this.field_3871 = var11;
            class_1230 var10001 = new class_1230;
            var10001.method_6510();
            this.field_3844 = var10001;
         }

         super.method_4830(var1, var2, var4, var6, var8, var9);
      }

   }

   // $FF: renamed from: b (w2) bqx
   protected bqx method_4852(class_790 var1) {
      return field_3870;
   }

   // $FF: renamed from: <clinit> () void
   static void method_4744() {
      boolean var10000 = true;
      char[] var10003 = "23ÄqíþÓ5yÙkìåÂ?yÞiùöÓh&Òb".toCharArray();
      Object var10004 = var10003.length;
      Object var5 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var1 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var6 = var10002;
         var10002 = var10003;
         if(var10003 <= var1) {
            String var0 = (new String((char[])var5)).intern();
            bqx var3 = new bqx;
            var3.method_8227(var0);
            field_3870 = var3;
            return;
         }

         char var10007 = (char)((Object[])var5)[var1];
         short var10009;
         switch(var1 % 7) {
         case 0:
            var10009 = 191;
            break;
         case 1:
            var10009 = 175;
            break;
         case 2:
            var10009 = 69;
            break;
         case 3:
            var10009 = 252;
            break;
         case 4:
            var10009 = 97;
            break;
         case 5:
            var10009 = 117;
            break;
         default:
            var10009 = 79;
         }

         ((Object[])var5)[var1] = (char)(var10007 ^ var6 ^ var10009);
         ++var1;
      }
   }
}
