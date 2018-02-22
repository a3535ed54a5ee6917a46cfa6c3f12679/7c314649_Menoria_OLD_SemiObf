
// $FF: renamed from: yy
public class class_1729 extends class_1728 {

   // $FF: renamed from: i wU
   private final class_768 field_9045;
   // $FF: renamed from: j java.lang.String
   private static final String field_9046 = "CL_00001593";


   // $FF: renamed from: <init> (wU) void
   public void method_9660(class_768 var1) {
      super.method_9657(var1, class_792.class, 8.0F);
      this.field_9045 = var1;
   }

   // $FF: renamed from: b () boolean
   public boolean method_9649() {
      String[] var1 = class_752.method_4253();
      boolean var10000 = this.field_9045.method_4366();
      if(var1 != null) {
         if(var10000) {
            this.field_9039 = this.field_9045.method_55();
            return true;
         }

         var10000 = false;
      }

      return var10000;
   }

   // $FF: renamed from: <clinit> () void
   static void method_9659() {
      boolean var10000 = true;
      char[] var10003 = "%í_-ú/Wc\\".toCharArray();
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
            field_9046 = (new String((char[])var4)).intern();
            String var2 = field_9046;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 156;
            break;
         case 1:
            var10009 = 91;
            break;
         case 2:
            var10009 = 160;
            break;
         case 3:
            var10009 = 149;
            break;
         case 4:
            var10009 = 231;
            break;
         case 5:
            var10009 = 48;
            break;
         default:
            var10009 = 229;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
