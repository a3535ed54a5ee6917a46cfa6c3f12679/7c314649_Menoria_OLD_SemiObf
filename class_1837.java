
// $FF: renamed from: z1
public class class_1837 extends class_1790 {

   // $FF: renamed from: i java.lang.String[]
   private static final String[] field_9386;


   // $FF: renamed from: <init> () void
   public void method_9832() {
      super.method_9832();
   }

   // $FF: renamed from: a () java.lang.String
   public String method_43() {
      String[] var10000 = field_9386;
      return "testfor";
   }

   // $FF: renamed from: b () int
   public int method_9833() {
      return 2;
   }

   // $FF: renamed from: a (bh) java.lang.String
   public String method_44(class_20 var1) {
      String[] var10000 = field_9386;
      return "commands.testfor.usage";
   }

   // $FF: renamed from: a (bh, java.lang.String[]) void
   public void method_46(class_20 param1, String[] param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.String[], int) boolean
   public boolean method_49(String[] var1, int var2) {
      String[] var3 = class_752.method_4253();

      int var10000;
      label32: {
         try {
            var10000 = var2;
            if(var3 == null) {
               return (boolean)var10000;
            }

            if(var2 == 0) {
               break label32;
            }
         } catch (class_637 var4) {
            throw method_9946(var4);
         }

         var10000 = 0;
         return (boolean)var10000;
      }

      var10000 = 1;
      return (boolean)var10000;
   }

   // $FF: renamed from: b (AA) AA
   private static class_637 method_9946(class_637 var0) {
      return var0;
   }

   // $FF: renamed from: <clinit> () void
   static void method_9862() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "ú£`<g»ºh.}çàx.hú£`<g»ºh.}çàk<`ñð½y;f";
      int var4 = "ú£`<g»ºh.}çàx.hú£`<g»ºh.}çàk<`ñð½y;f".length();
      char var1 = 22;
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
            char[] var10 = var8;
            var8 = var10003;
            if(var10003 <= var6) {
               var5[var3++] = (new String((char[])var9)).intern();
               if((var0 += var1) >= var4) {
                  field_9386 = var5;
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 6;
               break;
            case 1:
               var10009 = 125;
               break;
            case 2:
               var10009 = 38;
               break;
            case 3:
               var10009 = 229;
               break;
            case 4:
               var10009 = 181;
               break;
            case 5:
               var10009 = 225;
               break;
            default:
               var10009 = 14;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var10 ^ var10009);
            ++var6;
         }
      }
   }
}
