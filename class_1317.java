import java.util.concurrent.Callable;
import org.lwjgl.Sys;

// $FF: renamed from: kI
class class_1317 implements Callable {

   // $FF: renamed from: a java.lang.String
   private static final String field_6741 = "CL_00000644";
   // $FF: renamed from: b bao
   final bao field_6742;


   // $FF: renamed from: <init> (bao) void
   void method_6933(bao var1) {
      this.field_6742 = var1;
      super();
   }

   // $FF: renamed from: b () java.lang.String
   public String method_6934() {
      return Sys.getVersion();
   }

   // $FF: renamed from: c () java.lang.Object
   public Object method_6935() {
      return this.method_6934();
   }

   // $FF: renamed from: <clinit> () void
   static void method_6936() {
      boolean var10000 = true;
      char[] var10003 = "?Ìrÿ$Ln§v".toCharArray();
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
            field_6741 = (new String((char[])var4)).intern();
            String var2 = field_6741;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 248;
            break;
         case 1:
            var10009 = 220;
            break;
         case 2:
            var10009 = 23;
            break;
         case 3:
            var10009 = 198;
            break;
         case 4:
            var10009 = 75;
            break;
         case 5:
            var10009 = 144;
            break;
         default:
            var10009 = 40;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
