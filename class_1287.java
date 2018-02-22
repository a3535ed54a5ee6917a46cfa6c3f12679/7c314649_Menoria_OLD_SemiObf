
// $FF: renamed from: jI
public class class_1287 {

   // $FF: renamed from: b jJ[]
   private class_1288[] field_6595;
   // $FF: renamed from: c int
   private int field_6596;
   // $FF: renamed from: d java.lang.String
   private static final String field_6597;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_6598;


   // $FF: renamed from: <init> () void
   public void method_6723() {
      super();
      this.field_6595 = new class_1288[1024];
   }

   // $FF: renamed from: b (jJ) jJ
   public class_1288 method_6724(class_1288 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b () void
   public void method_6725() {
      this.field_6596 = 0;
   }

   // $FF: renamed from: d () jJ
   public class_1288 method_6726() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (jJ, float) void
   public void method_6727(class_1288 param1, float param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (int) void
   private void method_6728(int param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: c (int) void
   private void method_6729(int param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: f () boolean
   public boolean method_6730() {
      String[] var1 = class_752.method_4253();

      int var10000;
      label32: {
         try {
            var10000 = this.field_6596;
            if(var1 == null) {
               return (boolean)var10000;
            }

            if(this.field_6596 == 0) {
               break label32;
            }
         } catch (IllegalStateException var2) {
            throw method_6731(var2);
         }

         var10000 = 0;
         return (boolean)var10000;
      }

      var10000 = 1;
      return (boolean)var10000;
   }

   // $FF: renamed from: b (java.lang.IllegalStateException) java.lang.IllegalStateException
   private static IllegalStateException method_6731(IllegalStateException var0) {
      return var0;
   }

   // $FF: renamed from: <clinit> () void
   static void method_6732() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "\tÄÈe\bvåºü¯pqæ";
      int var4 = "\tÄÈe\bvåºü¯pqæ".length();
      char var1 = 9;
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
                  field_6598 = var5;
                  String[] var10 = field_6598;
                  field_6597 = "CL_00000573";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 90;
               break;
            case 1:
               var10009 = 94;
               break;
            case 2:
               var10009 = 51;
               break;
            case 3:
               var10009 = 207;
               break;
            case 4:
               var10009 = 144;
               break;
            case 5:
               var10009 = 214;
               break;
            default:
               var10009 = 133;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}
