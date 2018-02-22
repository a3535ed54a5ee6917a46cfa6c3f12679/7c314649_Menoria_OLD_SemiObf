import java.util.concurrent.Callable;

// $FF: renamed from: nX
class class_1416 implements Callable {

   // $FF: renamed from: a java.lang.String
   private static final String field_7538;
   // $FF: renamed from: b l8
   final class_1338 field_7539;
   // $FF: renamed from: c blt
   final blt field_7540;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_7541;


   // $FF: renamed from: <init> (blt, l8) void
   void method_7727(blt var1, class_1338 var2) {
      this.field_7540 = var1;
      this.field_7539 = var2;
      super();
   }

   // $FF: renamed from: b () java.lang.String
   public String method_7728() {
      String[] var10000 = field_7541;
      return String.format("Scaled: (%d, %d). Absolute: (%d, %d). Scale factor of %d", new Object[]{Integer.valueOf(this.field_7539.method_7061()), Integer.valueOf(this.field_7539.method_7062()), Integer.valueOf(blt.setFocused3(this.field_7540).cursorCounter2), Integer.valueOf(blt.setFocused3(this.field_7540).cursorCounter3), Integer.valueOf(this.field_7539.method_7065())});
   }

   // $FF: renamed from: c () java.lang.Object
   public Object method_7729() {
      return this.method_7728();
   }

   // $FF: renamed from: d () java.lang.Object
   public Object method_7730() {
      return this.method_7728();
   }

   // $FF: renamed from: <clinit> () void
   static void method_7731() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "?Þ°\\Gñt¸µuüxAG¾0Ê¨\\ùyÛðPørZBX´|Ù½ZW[£|ÐºPàì\táeí";
      int var4 = "?Þ°\\Gñt¸µuüxAG¾0Ê¨\\ùyÛðPørZBX´|Ù½ZW[£|ÐºPàì\táeí".length();
      char var1 = 56;
      int var0 = -1;

      while(true) {
         ++var0;
         String var10002 = var2.substring(var0, var0 + var1);
         boolean var10000 = true;
         char[] var10003 = var10002.toCharArray();
         Object var10004 = var10003.length;
         Object var9 = true;
         char[] var8 = var10003;
         char[] var10001 = (char[])var10004;
         int var6 = 0;

         while(true) {
            var10003 = var8;
            var8 = var10001;
            var10001 = var10003;
            char[] var11 = var8;
            var8 = var10003;
            if(var10003 <= var6) {
               var5[var3++] = (new String((char[])var9)).intern();
               if((var0 += var1) >= var4) {
                  field_7541 = var5;
                  String[] var10 = field_7541;
                  field_7538 = "CL_00000951";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 230;
               break;
            case 1:
               var10009 = 107;
               break;
            case 2:
               var10009 = 136;
               break;
            case 3:
               var10009 = 235;
               break;
            case 4:
               var10009 = 14;
               break;
            case 5:
               var10009 = 20;
               break;
            default:
               var10009 = 3;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}
