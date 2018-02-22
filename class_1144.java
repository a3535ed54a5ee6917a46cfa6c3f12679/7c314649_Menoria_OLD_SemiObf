import java.util.List;
import java.util.Random;

// $FF: renamed from: iB
public class class_1144 extends class_1143 {

   // $FF: renamed from: g java.lang.String
   private static final String field_5892 = "CL_00000495";


   // $FF: renamed from: <init> () void
   public void method_6191() {
      super.method_6191();
   }

   // $FF: renamed from: b (h7, java.util.List, java.util.Random) void
   public void method_6197(class_1094 var1, List var2, Random var3) {
      String[] var4 = class_752.method_4253();
      if(var4 != null) {
         if(this.field_5753 != 2) {
            if(var4 == null) {
               return;
            }

            if(this.field_5753 != 3) {
               this.method_6305((class_1138)var1, var2, var3, 1, 1);
               if(var4 != null) {
                  return;
               }
            }
         }

         this.method_6306((class_1138)var1, var2, var3, 1, 1);
      }

   }

   // $FF: renamed from: b (ahb, java.util.Random, hS) boolean
   public boolean method_6198(ahb var1, Random var2, class_1206 var3) {
      class_1144 var5;
      label33: {
         String[] var4 = class_752.method_4253();
         int var10000 = this.method_6203(var1, var3);
         if(var4 != null) {
            if(var10000 != 0) {
               return false;
            }

            this.method_6213(var1, var3, 0, 0, 0, 4, 4, 4, true, var2, class_1252.method_6598());
            this.method_6302(var1, var2, var3, this.field_5851, 1, 1, 0);
            var5 = this;
            if(var4 == null) {
               break label33;
            }

            var10000 = this.field_5753;
         }

         if(var10000 != 2) {
            var5 = this;
            if(var4 == null) {
               break label33;
            }

            if(this.field_5753 != 3) {
               this.method_6211(var1, var3, 0, 1, 1, 0, 3, 3, class_1192.field_6025, class_1192.field_6025, false);
               if(var4 != null) {
                  return true;
               }
            }
         }

         var5 = this;
      }

      var5.method_6211(var1, var3, 4, 1, 1, 4, 3, 3, class_1192.field_6025, class_1192.field_6025, false);
      return true;
   }

   // $FF: renamed from: <clinit> () void
   static void method_6222() {
      boolean var10000 = true;
      char[] var10003 = "#}¦m[".toCharArray();
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
            field_5892 = (new String((char[])var4)).intern();
            String var2 = field_5892;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 17;
            break;
         case 1:
            var10009 = 35;
            break;
         case 2:
            var10009 = 110;
            break;
         case 3:
            var10009 = 245;
            break;
         case 4:
            var10009 = 218;
            break;
         case 5:
            var10009 = 229;
            break;
         default:
            var10009 = 122;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
