import java.util.List;

// $FF: renamed from: dE
public class class_1002 extends class_985 {

   // $FF: renamed from: aF java.lang.String
   private static final String field_5094 = "CL_00000173";


   // $FF: renamed from: <init> (int) void
   public void method_5691(int var1) {
      super.method_5691(var1);
      this.field_5044.clear();
      this.field_5045.clear();
      this.field_5046.clear();
      this.field_5047.clear();
      List var10000 = this.field_5044;
      class_1653 var10001 = new class_1653;
      var10001.method_9099(class_760.class, 50, 4, 4);
      var10000.add(var10001);
      var10000 = this.field_5044;
      var10001 = new class_1653;
      var10001.method_9099(class_782.class, 100, 4, 4);
      var10000.add(var10001);
      var10000 = this.field_5044;
      var10001 = new class_1653;
      var10001.method_9099(class_755.class, 1, 4, 4);
      var10000.add(var10001);
   }

   // $FF: renamed from: <clinit> () void
   static void method_5726() {
      boolean var10000 = true;
      char[] var10003 = "øÐ/ÇBÜ~­GÄ".toCharArray();
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
            field_5094 = (new String((char[])var4)).intern();
            String var2 = field_5094;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 244;
            break;
         case 1:
            var10009 = 211;
            break;
         case 2:
            var10009 = 63;
            break;
         case 3:
            var10009 = 184;
            break;
         case 4:
            var10009 = 61;
            break;
         case 5:
            var10009 = 163;
            break;
         default:
            var10009 = 1;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
