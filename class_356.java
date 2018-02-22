import net.minecraft.server.MinecraftServer;

// $FF: renamed from: dl
public class class_356 extends class_354 {

   // $FF: renamed from: af long
   private static final long field_1868;
   // $FF: renamed from: ag dt
   public static final class_1045 field_1869;


   // $FF: renamed from: <init> (net.minecraft.server.MinecraftServer, j9, java.lang.String, int, qi) void
   public void method_2262(MinecraftServer var1, class_29 var2, String var3, int var4, class_1535 var5) {
      super.method_2239(var1, var2, var3, var4, field_1869, var5);
   }

   // $FF: renamed from: <clinit> () void
   static void method_2226() {
      boolean var10000 = true;
      char[] var10003 = "r¯ójn÷6]²îro¹".toCharArray();
      Object var10004 = var10003.length;
      Object var5 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var1 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var6 = var10002;
         var10002 = var10003;
         if(var10003 <= var1) {
            String var0 = (new String((char[])var5)).intern();
            field_1868 = (long)var0.hashCode();
            class_1045 var3 = new class_1045;
            var3.method_5905(field_1868, class_94.field_45, true, false, class_1046.field_5527);
            field_1869 = var3.method_5907();
            return;
         }

         char var10007 = (char)((Object[])var5)[var1];
         short var10009;
         switch(var1 % 7) {
         case 0:
            var10009 = 170;
            break;
         case 1:
            var10009 = 86;
            break;
         case 2:
            var10009 = 23;
            break;
         case 3:
            var10009 = 136;
            break;
         case 4:
            var10009 = 144;
            break;
         case 5:
            var10009 = 65;
            break;
         default:
            var10009 = 227;
         }

         ((Object[])var5)[var1] = (char)(var10007 ^ var6 ^ var10009);
         ++var1;
      }
   }
}
