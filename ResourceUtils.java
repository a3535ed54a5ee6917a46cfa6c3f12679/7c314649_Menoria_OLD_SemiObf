import java.io.File;

public class ResourceUtils {

   private static ReflectorClass ForgeAbstractResourcePack;
   private static class_891 ForgeAbstractResourcePack_resourcePackFile;
   private static boolean directAccessValid;


   // $FF: renamed from: <init> () void
   public void method_5667() {
      super();
   }

   public static File getResourcePackFile(class_1502 param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: <clinit> () void
   static void method_5668() {
      boolean var10000 = true;
      char[] var10003 = "c@«!\b±tu§?<»}@".toCharArray();
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
            var3.method_5108(class_1502.class);
            ForgeAbstractResourcePack = var3;
            class_891 var4 = new class_891;
            var4.method_5180(ForgeAbstractResourcePack, var0);
            ForgeAbstractResourcePack_resourcePackFile = var4;
            directAccessValid = true;
            return;
         }

         char var10007 = (char)((Object[])var6)[var1];
         short var10009;
         switch(var1 % 7) {
         case 0:
            var10009 = 207;
            break;
         case 1:
            var10009 = 251;
            break;
         case 2:
            var10009 = 41;
            break;
         case 3:
            var10009 = 26;
            break;
         case 4:
            var10009 = 138;
            break;
         case 5:
            var10009 = 164;
            break;
         default:
            var10009 = 12;
         }

         ((Object[])var6)[var1] = (char)(var10007 ^ var7 ^ var10009);
         ++var1;
      }
   }

   // $FF: renamed from: b (java.lang.IllegalAccessError) java.lang.IllegalAccessError
   private static IllegalAccessError method_5669(IllegalAccessError var0) {
      return var0;
   }
}
