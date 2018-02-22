
// $FF: renamed from: qU
final class class_1466 extends class_1460 {

   // $FF: renamed from: a boolean
   private boolean field_7737;
   // $FF: renamed from: c java.lang.String
   private static final String field_7738 = "CL_00001401";


   // $FF: renamed from: <init> () void
   void method_7939() {
      super.method_7939();
      this.field_7737 = true;
   }

   // $FF: renamed from: a (qH, add) add
   protected add method_7940(class_48 var1, add var2) {
      add var10;
      label38: {
         class_905 var4 = class_484.method_2849(var1.method_186());
         ahb var5 = var1.method_182();
         int var6 = var1.method_183() + var4.method_5322();
         String[] var10000 = class_752.method_4253();
         int var7 = var1.method_184() + var4.method_5323();
         int var8 = var1.method_185() + var4.method_5324();
         String[] var3 = var10000;
         ahb var9 = var5;
         int var10001 = var6;
         int var10002 = var7;
         int var10003 = var8;
         if(var3 != null) {
            if(var5.method_34(var6, var7, var8)) {
               var5.method_2058(var6, var7, var8, class_1192.field_6078);
               var10 = var2;
               if(var3 == null) {
                  return var10;
               }

               if(!var2.method_3748(1, var5.field_1819)) {
                  break label38;
               }

               var2.field_2958 = 0;
               if(var3 != null) {
                  break label38;
               }
            }

            var9 = var5;
            var10001 = var6;
            var10002 = var7;
            var10003 = var8;
         }

         label23: {
            aji var11 = var9.getBlock(var10001, var10002, var10003);
            if(var3 != null) {
               if(var11 != class_1192.field_6073) {
                  break label23;
               }

               var11 = class_1192.field_6073;
            }

            var11.method_2458(var5, var6, var7, var8, 1);
            var5.method_2056(var6, var7, var8);
            if(var3 != null) {
               break label38;
            }
         }

         this.field_7737 = false;
      }

      var10 = var2;
      return var10;
   }

   // $FF: renamed from: b (qH) void
   protected void method_7942(class_48 var1) {
      label16: {
         String[] var2 = class_752.method_4253();
         if(var2 != null) {
            if(!this.field_7737) {
               break label16;
            }

            var1.method_182().method_2210(1000, var1.method_183(), var1.method_184(), var1.method_185(), 0);
         }

         if(var2 != null) {
            return;
         }
      }

      var1.method_182().method_2210(1001, var1.method_183(), var1.method_184(), var1.method_185(), 0);
   }

   // $FF: renamed from: <clinit> () void
   static void method_177() {
      boolean var10000 = true;
      char[] var10003 = "Ç¨Ô§@àBµÐ»¦".toCharArray();
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
            field_7738 = (new String((char[])var4)).intern();
            String var2 = field_7738;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 185;
            break;
         case 1:
            var10009 = 217;
            break;
         case 2:
            var10009 = 182;
            break;
         case 3:
            var10009 = 170;
            break;
         case 4:
            var10009 = 77;
            break;
         case 5:
            var10009 = 237;
            break;
         default:
            var10009 = 79;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
