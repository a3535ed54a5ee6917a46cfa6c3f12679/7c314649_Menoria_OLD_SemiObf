import java.util.List;
import net.minecraft.server.MinecraftServer;

// $FF: renamed from: zs
public class class_1798 extends class_1790 {

   // $FF: renamed from: i java.lang.String[]
   private static final String[] field_9339;


   // $FF: renamed from: <init> () void
   public void method_9832() {
      super.method_9832();
   }

   // $FF: renamed from: a () java.lang.String
   public String method_43() {
      String[] var10000 = field_9339;
      return "me";
   }

   // $FF: renamed from: b () int
   public int method_9833() {
      return 0;
   }

   // $FF: renamed from: a (bh) java.lang.String
   public String method_44(class_20 var1) {
      String[] var10000 = field_9339;
      return "commands.me.usage";
   }

   // $FF: renamed from: a (bh, java.lang.String[]) void
   public void method_46(class_20 var1, String[] var2) {
      if(var2.length > 0) {
         String[] var4 = field_9339;
         class_66 var3 = method_9845(var1, var2, 0, var1.method_67(1, "me"));
         class_1627 var5 = MinecraftServer.method_2348().method_2383();
         class_1081 var10001 = new class_1081;
         var10001.method_6126("chat.type.emote", new Object[]{var1.method_65(), var3});
         var5.method_8928(var10001);
      } else {
         class_641 var10000 = new class_641;
         String[] var10002 = field_9339;
         var10000.method_3515("commands.me.usage", new Object[0]);
         throw var10000;
      }
   }

   // $FF: renamed from: b (bh, java.lang.String[]) java.util.List
   public List method_48(class_20 var1, String[] var2) {
      return method_9855(var2, MinecraftServer.method_2348().method_2344());
   }

   // $FF: renamed from: <clinit> () void
   static void method_9862() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "|nì»²Ï*l/ì³ýÔ=~färd|ià¢ýÕ7od¯³¾Î:z";
      int var4 = "|nì»²Ï*l/ì³ýÔ=~färd|ià¢ýÕ7od¯³¾Î:z".length();
      char var1 = 17;
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
                  field_9339 = var5;
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 131;
               break;
            case 1:
               var10009 = 157;
               break;
            case 2:
               var10009 = 29;
               break;
            case 3:
               var10009 = 74;
               break;
            case 4:
               var10009 = 79;
               break;
            case 5:
               var10009 = 61;
               break;
            default:
               var10009 = 210;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var10 ^ var10009);
            ++var6;
         }
      }
   }
}
