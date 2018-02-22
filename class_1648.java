import net.minecraft.server.MinecraftServer;

// $FF: renamed from: uY
public class class_1648 implements class_20 {

   // $FF: renamed from: b uY
   public static final class_1648 field_8584;
   // $FF: renamed from: c java.lang.StringBuffer
   private StringBuffer field_8585;
   // $FF: renamed from: h java.lang.String
   private static final String field_8586 = "Rcon";


   // $FF: renamed from: <init> () void
   public void method_9084() {
      super();
      this.field_8585 = new StringBuffer();
   }

   // $FF: renamed from: b_ () java.lang.String
   public String method_64() {
      return "Rcon";
   }

   // $FF: renamed from: c_ () rV
   public class_66 method_65() {
      class_1082 var10000 = new class_1082;
      var10000.method_6134(this.method_64());
      return var10000;
   }

   // $FF: renamed from: a (rV) void
   public void method_66(class_66 var1) {
      this.field_8585.append(var1.method_342());
   }

   // $FF: renamed from: a (int, java.lang.String) boolean
   public boolean method_67(int var1, String var2) {
      return true;
   }

   // $FF: renamed from: f_ () vF
   public class_1661 method_68() {
      class_1661 var10000 = new class_1661;
      var10000.method_9151(0, 0, 0);
      return var10000;
   }

   // $FF: renamed from: d () ahb
   public ahb method_69() {
      return MinecraftServer.method_2348().method_69();
   }

   // $FF: renamed from: <clinit> () void
   static void method_9085() {
      boolean var10000 = true;
      char[] var10003 = "î_]".toCharArray();
      Object var10004 = var10003.length;
      Object var4 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var0 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var5 = var10002;
         var10002 = var10003;
         if(var10003 <= var0) {
            field_8586 = (new String((char[])var4)).intern();
            class_1648 var2 = new class_1648;
            var2.method_9084();
            field_8584 = var2;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 10;
            break;
         case 1:
            var10009 = 138;
            break;
         case 2:
            var10009 = 132;
            break;
         case 3:
            var10009 = 214;
            break;
         case 4:
            var10009 = 33;
            break;
         case 5:
            var10009 = 50;
            break;
         default:
            var10009 = 152;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
