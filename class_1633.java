import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import java.util.Date;
import java.util.UUID;

// $FF: renamed from: uO
public class class_1633 extends class_1632 {

   // $FF: renamed from: a java.lang.String
   private static final String field_8486;
   // $FF: renamed from: j java.lang.String[]
   private static final String[] field_8487;


   // $FF: renamed from: <init> (com.mojang.authlib.GameProfile) void
   public void method_8955(GameProfile var1) {
      this.method_8956(var1, (Date)null, (String)null, (Date)null, (String)null);
   }

   // $FF: renamed from: <init> (com.mojang.authlib.GameProfile, java.util.Date, java.lang.String, java.util.Date, java.lang.String) void
   public void method_8956(GameProfile var1, Date var2, String var3, Date var4, String var5) {
      super.method_8950(var1, var4, var3, var4, var5);
   }

   // $FF: renamed from: <init> (com.google.gson.JsonObject) void
   public void method_8957(JsonObject var1) {
      super.method_8935(method_8958(var1), var1);
   }

   // $FF: renamed from: b (com.google.gson.JsonObject) void
   protected void method_8938(JsonObject var1) {
      String[] var2 = class_752.method_4253();
      if(this.method_8936() != null) {
         String var4;
         label16: {
            String[] var3 = field_8487;
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
         String[] var10001 = field_8487;
         var1.addProperty("name", ((GameProfile)this.method_8936()).getName());
         super.method_8938(var1);
      }

   }

   // $FF: renamed from: a (com.google.gson.JsonObject) com.mojang.authlib.GameProfile
   private static GameProfile method_8958(JsonObject param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.Throwable) java.lang.Throwable
   private static Throwable method_8959(Throwable var0) {
      return var0;
   }

   // $FF: renamed from: <clinit> () void
   static void method_8953() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "e}&~i\"HPÙÀx!:$|Û";
      int var4 = "e}&~i\"HPÙÀx!:$|Û".length();
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
                  field_8487 = var5;
                  String[] var10 = field_8487;
                  field_8486 = "CL_00001872";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 172;
               break;
            case 1:
               var10009 = 187;
               break;
            case 2:
               var10009 = 236;
               break;
            case 3:
               var10009 = 78;
               break;
            case 4:
               var10009 = 87;
               break;
            case 5:
               var10009 = 239;
               break;
            default:
               var10009 = 182;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}
