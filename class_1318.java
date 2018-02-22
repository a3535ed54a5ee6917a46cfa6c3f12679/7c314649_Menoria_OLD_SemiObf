import java.util.concurrent.Callable;
import org.lwjgl.opengl.GL11;

// $FF: renamed from: kJ
class class_1318 implements Callable {

   // $FF: renamed from: a java.lang.String
   private static final String field_6743;
   // $FF: renamed from: b bao
   final bao field_6744;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_6745;


   // $FF: renamed from: <init> (bao) void
   void method_6937(bao var1) {
      this.field_6744 = var1;
      super();
   }

   // $FF: renamed from: b () java.lang.String
   public String method_6938() {
      StringBuilder var10000 = (new StringBuilder()).append(GL11.glGetString(7937));
      String[] var1 = field_6745;
      return var10000.append(" GL version ").append(GL11.glGetString(7938)).append(", ").append(GL11.glGetString(7936)).toString();
   }

   // $FF: renamed from: c () java.lang.Object
   public Object method_6939() {
      return this.method_6938();
   }

   // $FF: renamed from: <clinit> () void
   static void method_6940() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "ù©Ååb\bå¿g\fõÎörP]Å¦àÕ<";
      int var4 = "ù©Ååb\bå¿g\fõÎörP]Å¦àÕ<".length();
      char var1 = 2;
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
                  field_6745 = var5;
                  String[] var10 = field_6745;
                  field_6743 = "CL_00000645";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 122;
               break;
            case 1:
               var10009 = 38;
               break;
            case 2:
               var10009 = 21;
               break;
            case 3:
               var10009 = 253;
               break;
            case 4:
               var10009 = 137;
               break;
            case 5:
               var10009 = 151;
               break;
            default:
               var10009 = 24;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}
