import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import java.io.File;
import java.util.Iterator;

// $FF: renamed from: uT
public class class_1643 extends class_1640 {

   // $FF: renamed from: <init> (java.io.File) void
   public void method_8987(File var1) {
      super.method_8987(var1);
   }

   // $FF: renamed from: b (com.google.gson.JsonObject) uL
   protected class_1629 method_8997(JsonObject var1) {
      class_1631 var10000 = new class_1631;
      var10000.method_8945(var1);
      return var10000;
   }

   // $FF: renamed from: b () java.lang.String[]
   public String[] method_8993() {
      String[] var2 = new String[this.method_8998().size()];
      String[] var10000 = class_752.method_4253();
      int var3 = 0;
      Iterator var4 = this.method_8998().values().iterator();
      String[] var1 = var10000;

      while(true) {
         if(var4.hasNext()) {
            class_1631 var5 = (class_1631)var4.next();
            var10000 = var2;
            if(var1 == null) {
               break;
            }

            var2[var3++] = ((GameProfile)var5.method_8936()).getName();
            if(var1 != null) {
               continue;
            }
         }

         var10000 = var2;
         break;
      }

      return var10000;
   }

   // $FF: renamed from: a (com.mojang.authlib.GameProfile) java.lang.String
   protected String method_9006(GameProfile var1) {
      return var1.getId().toString();
   }

   // $FF: renamed from: b (java.lang.String) com.mojang.authlib.GameProfile
   public GameProfile method_9007(String var1) {
      String[] var10000 = class_752.method_4253();
      Iterator var3 = this.method_8998().values().iterator();
      String[] var2 = var10000;

      while(true) {
         if(var3.hasNext()) {
            class_1631 var4 = (class_1631)var3.next();
            Object var5 = var1;
            if(var2 != null) {
               if(!var1.equalsIgnoreCase(((GameProfile)var4.method_8936()).getName())) {
                  if(var2 != null) {
                     continue;
                  }

                  return null;
               }

               var5 = var4.method_8936();
            }

            return (GameProfile)var5;
         }

         return null;
      }
   }

   // $FF: renamed from: c (java.lang.Object) java.lang.String
   // $FF: synthetic method
   protected String method_8994(Object var1) {
      return this.method_9006((GameProfile)var1);
   }
}
