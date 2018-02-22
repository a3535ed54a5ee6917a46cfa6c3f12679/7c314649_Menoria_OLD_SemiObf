import java.util.List;
import net.minecraft.server.MinecraftServer;

// $FF: renamed from: zr
public class class_1799 extends class_1790 {

   // $FF: renamed from: i java.lang.String[]
   private static final String[] field_9340;


   // $FF: renamed from: <init> () void
   public void method_9832() {
      super.method_9832();
   }

   // $FF: renamed from: a () java.lang.String
   public String method_43() {
      String[] var10000 = field_9340;
      return "effect";
   }

   // $FF: renamed from: b () int
   public int method_9833() {
      return 2;
   }

   // $FF: renamed from: a (bh) java.lang.String
   public String method_44(class_20 var1) {
      String[] var10000 = field_9340;
      return "commands.effect.usage";
   }

   // $FF: renamed from: a (bh, java.lang.String[]) void
   public void method_46(class_20 param1, String[] param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (bh, java.lang.String[]) java.util.List
   public List method_48(class_20 param1, String[] param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: e () java.lang.String[]
   protected String[] method_9878() {
      return MinecraftServer.method_2348().method_2344();
   }

   // $FF: renamed from: b (java.lang.String[], int) boolean
   public boolean method_49(String[] var1, int var2) {
      String[] var3 = class_752.method_4253();

      int var10000;
      label32: {
         try {
            var10000 = var2;
            if(var3 == null) {
               return (boolean)var10000;
            }

            if(var2 == 0) {
               break label32;
            }
         } catch (class_637 var4) {
            throw method_9879(var4);
         }

         var10000 = 0;
         return (boolean)var10000;
      }

      var10000 = 1;
      return (boolean)var10000;
   }

   // $FF: renamed from: b (AA) AA
   private static class_637 method_9879(class_637 var0) {
      return var0;
   }

   // $FF: renamed from: <clinit> () void
   static void method_9862() {
      // $FF: Couldn't be decompiled
   }
}
