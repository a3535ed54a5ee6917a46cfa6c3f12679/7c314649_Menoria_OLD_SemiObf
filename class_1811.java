import net.minecraft.server.MinecraftServer;

// $FF: renamed from: zV
public class class_1811 extends class_1790 {

   // $FF: renamed from: i java.lang.String[]
   private static final String[] field_9357;


   // $FF: renamed from: <init> () void
   public void method_9832() {
      super.method_9832();
   }

   // $FF: renamed from: b (bh) boolean
   public boolean method_47(class_20 var1) {
      String[] var2 = class_752.method_4253();
      boolean var10000 = MinecraftServer.method_2348().method_2353();
      if(var2 != null) {
         if(!var10000) {
            var10000 = super.method_47(var1);
            if(var2 == null) {
               return var10000;
            }

            if(!var10000) {
               var10000 = false;
               return var10000;
            }
         }

         var10000 = true;
      }

      return var10000;
   }

   // $FF: renamed from: a () java.lang.String
   public String method_43() {
      String[] var10000 = field_9357;
      return "seed";
   }

   // $FF: renamed from: b () int
   public int method_9833() {
      return 2;
   }

   // $FF: renamed from: a (bh) java.lang.String
   public String method_44(class_20 var1) {
      String[] var10000 = field_9357;
      return "commands.seed.usage";
   }

   // $FF: renamed from: a (bh, java.lang.String[]) void
   public void method_46(class_20 var1, String[] var2) {
      Object var5;
      label14: {
         String[] var3 = class_752.method_4253();
         class_20 var10000 = var1;
         if(var3 != null) {
            if(!(var1 instanceof class_792)) {
               var5 = MinecraftServer.method_2348().method_2340(0);
               break label14;
            }

            var10000 = var1;
         }

         var5 = ((class_792)var10000).field_2990;
      }

      Object var4 = var5;
      class_1081 var10001 = new class_1081;
      String[] var10003 = field_9357;
      var10001.method_6126("commands.seed.success", new Object[]{Long.valueOf(((ahb)var4).method_2183())});
      var1.method_66(var10001);
   }

   // $FF: renamed from: <clinit> () void
   static void method_9862() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "_f<On59¯_@p==¥\\_`;=²On59¯_@p==¥\\Yb?=";
      int var4 = "_f<On59¯_@p==¥\\_`;=²On59¯_@p==¥\\Yb?=".length();
      char var1 = 4;
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
                  field_9357 = var5;
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 4;
               break;
            case 1:
               var10009 = 70;
               break;
            case 2:
               var10009 = 43;
               break;
            case 3:
               var10009 = 112;
               break;
            case 4:
               var10009 = 112;
               break;
            case 5:
               var10009 = 233;
               break;
            default:
               var10009 = 90;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var10 ^ var10009);
            ++var6;
         }
      }
   }
}
