import net.minecraft.server.MinecraftServer;

// $FF: renamed from: z3
public class class_1835 extends class_1790 {

   // $FF: renamed from: i java.lang.String[]
   private static final String[] field_9384;


   // $FF: renamed from: <init> () void
   public void method_9832() {
      super.method_9832();
   }

   // $FF: renamed from: a () java.lang.String
   public String method_43() {
      String[] var10000 = field_9384;
      return "toggledownfall";
   }

   // $FF: renamed from: b () int
   public int method_9833() {
      return 2;
   }

   // $FF: renamed from: a (bh) java.lang.String
   public String method_44(class_20 var1) {
      String[] var10000 = field_9384;
      return "commands.downfall.usage";
   }

   // $FF: renamed from: a (bh, java.lang.String[]) void
   public void method_46(class_20 var1, String[] var2) {
      this.method_9942();
      String[] var10002 = field_9384;
      method_9857(var1, this, "commands.downfall.success", new Object[0]);
   }

   // $FF: renamed from: e () void
   protected void method_9942() {
      class_1303 var2 = MinecraftServer.method_2348().field_1927[0].method_2195();
      String[] var1 = class_752.method_4253();
      boolean var10001 = var2.method_6860();
      if(var1 != null) {
         var10001 = !var10001;
      }

      var2.method_6861(var10001);
   }

   // $FF: renamed from: <clinit> () void
   static void method_9862() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "xxÐBznÐ ;lÍ\truÛsxÒxxÐBznÐ ;jË\tf";
      int var4 = "xxÐBznÐ ;lÍ\truÛsxÒxxÐBznÐ ;jË\tf".length();
      char var1 = 23;
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
                  field_9384 = var5;
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 141;
               break;
            case 1:
               var10009 = 11;
               break;
            case 2:
               var10009 = 130;
               break;
            case 3:
               var10009 = 114;
               break;
            case 4:
               var10009 = 126;
               break;
            case 5:
               var10009 = 217;
               break;
            default:
               var10009 = 141;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var10 ^ var10009);
            ++var6;
         }
      }
   }
}
