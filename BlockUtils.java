
public class BlockUtils {

   private static ReflectorClass ForgeBlock;
   private static ReflectorMethod ForgeBlock_setLightOpacity;
   private static boolean directAccessValid;


   // $FF: renamed from: <init> () void
   public void method_5056() {
      super();
   }

   public static void setLightOpacity(aji param0, int param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: <clinit> () void
   static void method_5057() {
      boolean var10000 = true;
      char[] var10003 = "ÙüÓÊª(ÞÖ×°À¤4Ó".toCharArray();
      Object var10004 = var10003.length;
      Object var6 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var1 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var7 = var10002;
         var10002 = var10003;
         if(var10003 <= var1) {
            String var0 = (new String((char[])var6)).intern();
            ReflectorClass var3 = new ReflectorClass;
            var3.method_5108(aji.class);
            ForgeBlock = var3;
            ReflectorMethod var4 = new ReflectorMethod;
            var4.method_3243(ForgeBlock, var0);
            ForgeBlock_setLightOpacity = var4;
            directAccessValid = true;
            return;
         }

         char var10007 = (char)((Object[])var6)[var1];
         short var10009;
         switch(var1 % 7) {
         case 0:
            var10009 = 30;
            break;
         case 1:
            var10009 = 45;
            break;
         case 2:
            var10009 = 19;
            break;
         case 3:
            var10009 = 101;
            break;
         case 4:
            var10009 = 23;
            break;
         case 5:
            var10009 = 121;
            break;
         default:
            var10009 = 244;
         }

         ((Object[])var6)[var1] = (char)(var10007 ^ var7 ^ var10009);
         ++var1;
      }
   }

   // $FF: renamed from: b (java.lang.IllegalAccessError) java.lang.IllegalAccessError
   private static IllegalAccessError method_5058(IllegalAccessError var0) {
      return var0;
   }
}
