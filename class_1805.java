import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import net.minecraft.server.MinecraftServer;

// $FF: renamed from: zl
public class class_1805 extends class_1790 {

   // $FF: renamed from: d java.util.regex.Pattern
   public static final Pattern field_9349;
   // $FF: renamed from: i java.lang.String[]
   private static final String[] field_9350;


   // $FF: renamed from: <init> () void
   public void method_9832() {
      super.method_9832();
   }

   // $FF: renamed from: a () java.lang.String
   public String method_43() {
      String[] var10000 = field_9350;
      return "ban-ip";
   }

   // $FF: renamed from: b () int
   public int method_9833() {
      return 3;
   }

   // $FF: renamed from: b (bh) boolean
   public boolean method_47(class_20 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (bh) java.lang.String
   public String method_44(class_20 var1) {
      String[] var10000 = field_9350;
      return "commands.banip.usage";
   }

   // $FF: renamed from: a (bh, java.lang.String[]) void
   public void method_46(class_20 param1, String[] param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (bh, java.lang.String[]) java.util.List
   public List method_48(class_20 param1, String[] param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (bh, java.lang.String, java.lang.String) void
   protected void method_9890(class_20 var1, String var2, String var3) {
      class_1634 var10000 = new class_1634;
      var10000.method_8961(var2, (Date)null, var1.method_64(), (Date)null, var3);
      class_1634 var5 = var10000;
      MinecraftServer.method_2348().method_2383().method_8895().method_8990(var5);
      String[] var14 = class_752.method_4253();
      List var6 = MinecraftServer.method_2348().method_2383().method_8919(var2);
      String[] var7 = new String[var6.size()];
      int var8 = 0;
      String[] var4 = var14;
      Iterator var9 = var6.iterator();

      while(true) {
         String[] var11;
         if(var9.hasNext()) {
            class_793 var10 = (class_793)var9.next();

            try {
               var11 = field_9350;
               var10.field_3654.method_9289("You have been IP banned.");
               var7[var8++] = var10.method_64();
               if(var4 == null) {
                  break;
               }

               if(var4 != null) {
                  continue;
               }
            } catch (class_639 var13) {
               throw method_9891(var13);
            }
         }

         try {
            if(var6.isEmpty()) {
               var11 = field_9350;
               method_9857(var1, this, "commands.banip.success", new Object[]{var2});
               if(var4 != null) {
                  return;
               }
            }
            break;
         } catch (class_639 var12) {
            throw method_9891(var12);
         }
      }

      String[] var10002 = field_9350;
      method_9857(var1, this, "commands.banip.success.players", new Object[]{var2, method_9851(var7)});
   }

   // $FF: renamed from: <clinit> () void
   static void method_9862() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (AE) AE
   private static class_639 method_9891(class_639 var0) {
      return var0;
   }
}
