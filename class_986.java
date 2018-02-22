import java.util.List;

// $FF: renamed from: dU
public class class_986 extends class_985 {

   // $FF: renamed from: aF java.lang.String
   private static final String field_5056 = "CL_00000187";


   // $FF: renamed from: <init> (int) void
   public void method_5691(int var1) {
      super.method_5691(var1);
      this.field_5044.clear();
      this.field_5045.clear();
      this.field_5046.clear();
      this.field_5047.clear();
      List var10000 = this.field_5044;
      class_1653 var10001 = new class_1653;
      var10001.method_9099(class_780.class, 10, 4, 4);
      var10000.add(var10001);
      this.field_5034 = class_1192.field_6028;
      this.field_5036 = class_1192.field_6028;
      class_1030 var2 = new class_1030;
      var2.method_5827();
      this.field_5043 = var2;
   }

   // $FF: renamed from: b (float) int
   public int method_5705(float var1) {
      return 0;
   }

   // $FF: renamed from: <clinit> () void
   static void method_5726() {
      boolean var10000 = true;
      char[] var10003 = "P\bó}>#uz".toCharArray();
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
            field_5056 = (new String((char[])var4)).intern();
            String var2 = field_5056;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 225;
            break;
         case 1:
            var10009 = 182;
            break;
         case 2:
            var10009 = 94;
            break;
         case 3:
            var10009 = 191;
            break;
         case 4:
            var10009 = 73;
            break;
         case 5:
            var10009 = 252;
            break;
         default:
            var10009 = 210;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
