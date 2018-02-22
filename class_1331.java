import com.mojang.authlib.GameProfile;
import com.mojang.util.UUIDTypeAdapter;
import java.util.UUID;

// $FF: renamed from: kT
public class class_1331 {

   // $FF: renamed from: b java.lang.String
   private final String field_6835;
   // $FF: renamed from: c java.lang.String
   private final String field_6836;
   // $FF: renamed from: d java.lang.String
   private final String field_6837;
   // $FF: renamed from: e R
   private final class_103 field_6838;
   // $FF: renamed from: f java.lang.String
   private static final String field_6839;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_6840;


   // $FF: renamed from: <init> (java.lang.String, java.lang.String, java.lang.String, java.lang.String) void
   public void method_6992(String var1, String var2, String var3, String var4) {
      super();
      this.field_6835 = var1;
      this.field_6836 = var2;
      this.field_6837 = var3;
      this.field_6838 = class_103.method_488(var4);
   }

   // $FF: renamed from: b () java.lang.String
   public String method_6993() {
      StringBuilder var10000 = new StringBuilder();
      String[] var10001 = field_6840;
      return var10000.append("token:").append(this.field_6837).append(":").append(this.field_6836).toString();
   }

   // $FF: renamed from: c () java.lang.String
   public String method_6994() {
      return this.field_6836;
   }

   // $FF: renamed from: d () java.lang.String
   public String method_6995() {
      return this.field_6835;
   }

   // $FF: renamed from: e () java.lang.String
   public String method_6996() {
      return this.field_6837;
   }

   // $FF: renamed from: f () com.mojang.authlib.GameProfile
   public GameProfile method_6997() {
      GameProfile var10000;
      try {
         UUID var1 = UUIDTypeAdapter.fromString(this.method_6994());
         var10000 = new GameProfile;
         var10000.method_1305(var1, this.method_6995());
         return var10000;
      } catch (IllegalArgumentException var2) {
         var10000 = new GameProfile;
         var10000.method_1305((UUID)null, this.method_6995());
         return var10000;
      }
   }

   // $FF: renamed from: g () R
   public class_103 method_6998() {
      return this.field_6838;
   }

   // $FF: renamed from: <clinit> () void
   static void method_6999() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "\"Ê3!4©Q°Y(étj\t";
      int var4 = "\"Ê3!4©Q°Y(étj\t".length();
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
                  field_6840 = var5;
                  String[] var10 = field_6840;
                  field_6839 = "CL_00000659";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 33;
               break;
            case 1:
               var10009 = 198;
               break;
            case 2:
               var10009 = 44;
               break;
            case 3:
               var10009 = 81;
               break;
            case 4:
               var10009 = 68;
               break;
            case 5:
               var10009 = 115;
               break;
            default:
               var10009 = 217;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}
