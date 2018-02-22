import net.minecraft.server.MinecraftServer;

// $FF: renamed from: um
public class class_1673 implements class_62 {

   // $FF: renamed from: b net.minecraft.server.MinecraftServer
   private final MinecraftServer field_8738;
   // $FF: renamed from: c l
   private final class_120 field_8739;
   // $FF: renamed from: d java.lang.String
   private static final String field_8740;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_8741;


   // $FF: renamed from: <init> (net.minecraft.server.MinecraftServer, l) void
   public void method_9232(MinecraftServer var1, class_120 var2) {
      super();
      this.field_8738 = var1;
      this.field_8739 = var2;
   }

   // $FF: renamed from: b (tv) void
   public void method_249(class_255 var1) {
      this.field_8739.method_550(var1.method_1475());
   }

   // $FF: renamed from: b (rV) void
   public void method_237(class_66 var1) {}

   // $FF: renamed from: b (ag, ag) void
   public void method_238(class_906 param1, class_906 param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b () void
   public void method_239() {}

   // $FF: renamed from: b (java.lang.UnsupportedOperationException) java.lang.UnsupportedOperationException
   private static UnsupportedOperationException method_9233(UnsupportedOperationException var0) {
      return var0;
   }

   // $FF: renamed from: <clinit> () void
   static void method_9234() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "}F0ûUi-5pPk3|x»ÍJ8} »Ú\nJ2zo§";
      int var4 = "}F0ûUi-5pPk3|x»ÍJ8} »Ú\nJ2zo§".length();
      char var1 = 11;
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
                  field_8741 = var5;
                  String[] var10 = field_8741;
                  field_8740 = "CL_00001445";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 79;
               break;
            case 1:
               var10009 = 44;
               break;
            case 2:
               var10009 = 104;
               break;
            case 3:
               var10009 = 113;
               break;
            case 4:
               var10009 = 186;
               break;
            case 5:
               var10009 = 217;
               break;
            default:
               var10009 = 20;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}
