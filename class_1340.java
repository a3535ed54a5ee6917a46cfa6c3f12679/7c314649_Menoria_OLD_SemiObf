import java.io.File;

// $FF: renamed from: kb
public class class_1340 implements class_29 {

   // $FF: renamed from: h java.lang.String
   private static final String field_6896 = "none";


   // $FF: renamed from: <init> () void
   public void method_7076() {
      super();
   }

   // $FF: renamed from: a () jY
   public class_1303 method_125() {
      return null;
   }

   // $FF: renamed from: b () void
   public void method_126() {}

   // $FF: renamed from: b (gU) gN
   public class_26 method_127(class_1089 var1) {
      return null;
   }

   // $FF: renamed from: b (jY, ro) void
   public void method_128(class_1303 var1, class_1583 var2) {}

   // $FF: renamed from: b (jY) void
   public void method_129(class_1303 var1) {}

   // $FF: renamed from: c () kc
   public class_32 method_130() {
      return null;
   }

   // $FF: renamed from: d () void
   public void method_131() {}

   // $FF: renamed from: b (java.lang.String) java.io.File
   public File method_133(String var1) {
      return null;
   }

   // $FF: renamed from: f () java.lang.String
   public String method_134() {
      return "none";
   }

   // $FF: renamed from: e () java.io.File
   public File method_132() {
      return null;
   }

   // $FF: renamed from: <clinit> () void
   static void method_7077() {
      boolean var10000 = true;
      char[] var10003 = "ÔtÕ_".toCharArray();
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
            field_6896 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 115;
            break;
         case 1:
            var10009 = 210;
            break;
         case 2:
            var10009 = 114;
            break;
         case 3:
            var10009 = 243;
            break;
         case 4:
            var10009 = 187;
            break;
         case 5:
            var10009 = 31;
            break;
         default:
            var10009 = 207;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}
