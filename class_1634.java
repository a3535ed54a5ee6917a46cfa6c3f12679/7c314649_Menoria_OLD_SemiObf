import com.google.gson.JsonObject;
import java.util.Date;

// $FF: renamed from: uN
public class class_1634 extends class_1632 {

   // $FF: renamed from: j java.lang.String
   private static final String field_8488 = "ip";


   // $FF: renamed from: <init> (java.lang.String) void
   public void method_8960(String var1) {
      this.method_8961(var1, (Date)null, (String)null, (Date)null, (String)null);
   }

   // $FF: renamed from: <init> (java.lang.String, java.util.Date, java.lang.String, java.util.Date, java.lang.String) void
   public void method_8961(String var1, Date var2, String var3, Date var4, String var5) {
      super.method_8950(var1, var2, var3, var4, var5);
   }

   // $FF: renamed from: <init> (com.google.gson.JsonObject) void
   public void method_8962(JsonObject var1) {
      super.method_8935(method_8963(var1), var1);
   }

   // $FF: renamed from: a (com.google.gson.JsonObject) java.lang.String
   private static String method_8963(JsonObject var0) {
      String[] var1 = class_752.method_4253();
      JsonObject var10000 = var0;
      String var10001 = "ip";
      String var2;
      if(var1 != null) {
         if(!var0.has("ip")) {
            var2 = null;
            return var2;
         }

         var10000 = var0;
         var10001 = "ip";
      }

      var2 = var10000.get(var10001).getAsString();
      return var2;
   }

   // $FF: renamed from: b (com.google.gson.JsonObject) void
   protected void method_8938(JsonObject var1) {
      String[] var2 = class_752.method_4253();
      class_1634 var10000 = this;
      if(var2 != null) {
         if(this.method_8936() == null) {
            return;
         }

         var1.addProperty("ip", (String)this.method_8936());
         var10000 = this;
      }

      var10000.method_8938(var1);
   }

   // $FF: renamed from: <clinit> () void
   static void method_8953() {
      boolean var10000 = true;
      char[] var10003 = "´".toCharArray();
      Object var10004 = var10003.length;
      Object var3 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var0 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var4 = var10002;
         var10002 = var10003;
         if(var10003 <= var0) {
            field_8488 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 139;
            break;
         case 1:
            var10009 = 48;
            break;
         case 2:
            var10009 = 79;
            break;
         case 3:
            var10009 = 240;
            break;
         case 4:
            var10009 = 155;
            break;
         case 5:
            var10009 = 180;
            break;
         default:
            var10009 = 62;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}
