
public class EntityUtils {

   private static ReflectorClass ForgeEntityLivingBase;
   private static class_891 ForgeEntityLivingBase_entityAge;
   private static boolean directEntityAge;
   private static ReflectorClass ForgeEntityLiving;
   private static ReflectorMethod ForgeEntityLiving_despawnEntity;
   private static boolean directDespawnEntity;


   // $FF: renamed from: <init> () void
   public void method_3225() {
      super();
   }

   public static int getEntityAge(class_752 param0) {
      // $FF: Couldn't be decompiled
   }

   public static void setEntityAge(class_752 param0, int param1) {
      // $FF: Couldn't be decompiled
   }

   public static void despawnEntity(class_753 param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: <clinit> () void
   static void method_3226() {
      String[] var6 = new String[2];
      int var4 = 0;
      String var3 = "¿kýPÔ¨ läEÚ\t¾ läEÚ¼";
      int var5 = "¿kýPÔ¨ läEÚ\t¾ läEÚ¼".length();
      char var2 = 13;
      int var1 = -1;

      while(true) {
         ++var1;
         String var10002 = var3.substring(var1, var1 + var2);
         boolean var10000 = true;
         char[] var10003 = var10002.toCharArray();
         Object var10004 = var10003.length;
         Object var13 = true;
         char[] var10 = var10003;
         char[] var10001 = (char[])var10004;
         int var7 = 0;

         while(true) {
            var10003 = var10;
            var10 = var10001;
            var10001 = var10003;
            char[] var14 = var10;
            var10 = var10003;
            if(var10003 <= var7) {
               var6[var4++] = (new String((char[])var13)).intern();
               if((var1 += var2) >= var5) {
                  ReflectorClass var9 = new ReflectorClass;
                  var9.method_5108(class_752.class);
                  ForgeEntityLivingBase = var9;
                  class_891 var11 = new class_891;
                  var11.method_5180(ForgeEntityLivingBase, "entityAge");
                  ForgeEntityLivingBase_entityAge = var11;
                  directEntityAge = true;
                  var9 = new ReflectorClass;
                  var9.method_5108(class_753.class);
                  ForgeEntityLiving = var9;
                  ReflectorMethod var12 = new ReflectorMethod;
                  var12.method_3243(ForgeEntityLiving, "despawnEntity");
                  ForgeEntityLiving_despawnEntity = var12;
                  directDespawnEntity = true;
                  return;
               }

               var2 = var3.charAt(var1);
               break;
            }

            char var10007 = (char)((Object[])var13)[var7];
            short var10009;
            switch(var7 % 7) {
            case 0:
               var10009 = 236;
               break;
            case 1:
               var10009 = 89;
               break;
            case 2:
               var10009 = 47;
               break;
            case 3:
               var10009 = 186;
               break;
            case 4:
               var10009 = 6;
               break;
            case 5:
               var10009 = 148;
               break;
            default:
               var10009 = 241;
            }

            ((Object[])var13)[var7] = (char)(var10007 ^ var14 ^ var10009);
            ++var7;
         }
      }
   }

   // $FF: renamed from: b (java.lang.IllegalAccessError) java.lang.IllegalAccessError
   private static IllegalAccessError method_3227(IllegalAccessError var0) {
      return var0;
   }
}
