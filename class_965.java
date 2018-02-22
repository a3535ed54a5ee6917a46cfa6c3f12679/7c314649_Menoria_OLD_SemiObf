
// $FF: renamed from: mn
class class_965 extends bcm {

   // $FF: renamed from: w java.lang.String
   private static final String field_4896 = "CL_00000726";
   // $FF: renamed from: x lF
   final class_195 field_4897;


   // $FF: renamed from: <init> (lF) void
   public void method_5588(class_195 var1) {
      this.field_4897 = var1;
      super.method_5549(var1.field_557, var1.width, var1.height, 32, var1.height - 64, 10);
      this.method_5551(false);
   }

   // $FF: renamed from: b () int
   protected int method_5553() {
      return class_1698.field_8882.size();
   }

   // $FF: renamed from: a (int, boolean, int, int) void
   protected void method_5554(int var1, boolean var2, int var3, int var4) {}

   // $FF: renamed from: a (int) boolean
   protected boolean method_5555(int var1) {
      return false;
   }

   // $FF: renamed from: e () int
   protected int method_5556() {
      return this.method_5553() * 10;
   }

   // $FF: renamed from: a () void
   protected void method_5557() {
      this.field_4897.method_873();
   }

   // $FF: renamed from: a (int, int, int, int, bmh, int, int) void
   protected void method_5558(int var1, int var2, int var3, int var4, bmh var5, int var6, int var7) {
      String[] var10000 = class_752.method_4253();
      class_1601 var9 = (class_1601)class_1698.field_8882.get(var1);
      String[] var8 = var10000;
      class_195 var11 = this.field_4897;
      FontRenderer var10001 = class_195.method_1056(this.field_4897);
      String var10002 = var9.method_8753().method_342();
      int var10003 = var2 + 2;
      int var10004 = var3 + 1;
      int var10005 = var1 % 2;
      if(var8 != null) {
         var10005 = var10005 == 0?16777215:9474192;
      }

      var11.method_657(var10001, var10002, var10003, var10004, var10005);
      String var10 = var9.method_8752(class_195.method_1044(this.field_4897).method_9402(var9));
      var11 = this.field_4897;
      var10001 = class_195.method_1057(this.field_4897);
      var10003 = var2 + 2 + 213 - class_195.method_1058(this.field_4897).getCharWidth(var10);
      var10004 = var3 + 1;
      var10005 = var1 % 2;
      if(var8 != null) {
         var10005 = var10005 == 0?16777215:9474192;
      }

      var11.method_657(var10001, var10, var10003, var10004, var10005);
   }

   // $FF: renamed from: <clinit> () void
   static void method_5579() {
      boolean var10000 = true;
      char[] var10003 = "DïàÈÔf?óé".toCharArray();
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
            field_4896 = (new String((char[])var4)).intern();
            String var2 = field_4896;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 157;
            break;
         case 1:
            var10009 = 195;
            break;
         case 2:
            var10009 = 10;
            break;
         case 3:
            var10009 = 20;
            break;
         case 4:
            var10009 = 27;
            break;
         case 5:
            var10009 = 51;
            break;
         default:
            var10009 = 47;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
