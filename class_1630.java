import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import java.util.UUID;

// $FF: renamed from: uQ
public class class_1630 extends class_1629 {

   // $FF: renamed from: a java.lang.String
   private static final String field_8474;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_8475;


   // $FF: renamed from: <init> (com.mojang.authlib.GameProfile) void
   public void method_8939(GameProfile var1) {
      super.method_8934(var1);
   }

   // $FF: renamed from: <init> (com.google.gson.JsonObject) void
   public void method_8940(JsonObject var1) {
      super.method_8935(method_8941(var1), var1);
   }

   // $FF: renamed from: b (com.google.gson.JsonObject) void
   protected void method_8938(JsonObject var1) {
      String[] var2 = class_752.method_4253();
      if(this.method_8936() != null) {
         String var4;
         label16: {
            String[] var3 = field_8475;
            UUID var10002 = ((GameProfile)this.method_8936()).getId();
            if(var2 != null) {
               if(var10002 == null) {
                  var4 = "";
                  break label16;
               }

               var10002 = ((GameProfile)this.method_8936()).getId();
            }

            var4 = var10002.toString();
         }

         var1.addProperty("uuid", var4);
         String[] var10001 = field_8475;
         var1.addProperty("name", ((GameProfile)this.method_8936()).getName());
         super.method_8938(var1);
      }

   }

   // $FF: renamed from: a (com.google.gson.JsonObject) com.mojang.authlib.GameProfile
   private static GameProfile method_8941(JsonObject param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.Throwable) java.lang.Throwable
   private static Throwable method_8942(Throwable var0) {
      return var0;
   }

   // $FF: renamed from: <clinit> () void
   static void method_8943() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "ËqýH¬Â¯p+<ÄÂÐe";
      int var4 = "ËqýH¬Â¯p+<ÄÂÐe".length();
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
            char[] var11 = var8;
            var8 = var10003;
            if(var10003 <= var6) {
               var5[var3++] = (new String((char[])var9)).intern();
               if((var0 += var1) >= var4) {
                  field_8475 = var5;
                  String[] var10 = field_8475;
                  field_8474 = "CL_00001870";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 144;
               break;
            case 1:
               var10009 = 42;
               break;
            case 2:
               var10009 = 221;
               break;
            case 3:
               var10009 = 220;
               break;
            case 4:
               var10009 = 177;
               break;
            case 5:
               var10009 = 110;
               break;
            default:
               var10009 = 53;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}
