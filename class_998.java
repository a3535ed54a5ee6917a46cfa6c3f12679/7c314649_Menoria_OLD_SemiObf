import java.util.List;

// $FF: renamed from: dI
public class class_998 extends class_985 {

   // $FF: renamed from: aF java.lang.String
   private static final String field_5078 = "CL_00000177";


   // $FF: renamed from: <init> (int) void
   public void method_5691(int var1) {
      super.method_5691(var1);
      this.field_5043.field_5444 = -100;
      this.field_5043.field_5445 = -100;
      this.field_5043.field_5446 = -100;
      this.field_5043.field_5448 = 1;
      this.field_5043.field_5454 = 1;
      this.field_5034 = class_1192.field_6135;
      this.field_5044.clear();
      this.field_5045.clear();
      this.field_5046.clear();
      List var10000 = this.field_5045;
      class_1653 var10001 = new class_1653;
      var10001.method_9099(class_774.class, 8, 4, 8);
      var10000.add(var10001);
   }

   // $FF: renamed from: <clinit> () void
   static void method_5726() {
      boolean var10000 = true;
      char[] var10003 = "Þ,¿0­Qá¸".toCharArray();
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
            field_5078 = (new String((char[])var4)).intern();
            String var2 = field_5078;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 201;
            break;
         case 1:
            var10009 = 52;
            break;
         case 2:
            var10009 = 130;
            break;
         case 3:
            var10009 = 219;
            break;
         case 4:
            var10009 = 228;
            break;
         case 5:
            var10009 = 242;
            break;
         default:
            var10009 = 84;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
