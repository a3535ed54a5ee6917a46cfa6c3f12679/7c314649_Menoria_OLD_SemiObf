import java.util.List;
import java.util.Random;

// $FF: renamed from: ia
public class class_1115 extends class_1094 {

   // $FF: renamed from: d java.lang.String
   private static final String field_5807 = "CL_00000449";


   // $FF: renamed from: <init> () void
   public void method_6191() {
      super.method_6191();
   }

   // $FF: renamed from: <init> (int, java.util.Random, hS, int) void
   public void method_6264(int var1, Random var2, class_1206 var3, int var4) {
      super.method_6192(var1);
      this.field_5753 = var4;
      this.field_5752 = var3;
   }

   // $FF: renamed from: b (ro) void
   protected void method_6194(class_1583 var1) {}

   // $FF: renamed from: c (ro) void
   protected void method_6196(class_1583 var1) {}

   // $FF: renamed from: b (java.util.List, java.util.Random, int, int, int, int) hS
   public static class_1206 method_6265(List var0, Random var1, int var2, int var3, int var4, int var5) {
      class_1206 var7;
      label36: {
         String[] var6;
         label35: {
            label34: {
               String[] var10000 = class_752.method_4253();
               class_1206 var10001 = new class_1206;
               var10001.method_6481(var2, var3 - 5, var4, var2, var3 + 2, var4);
               var7 = var10001;
               var6 = var10000;
               if(var6 != null) {
                  switch(var5) {
                  case 0:
                     var7.field_6247 = var2 + 2;
                     var7.field_6249 = var4 + 8;
                     break;
                  case 1:
                     break label34;
                  case 2:
                     break label35;
                  case 3:
                     break label36;
                  default:
                     return class_1094.method_6201(var0, var7) != null?null:var7;
                  }
               }

               if(var6 != null) {
                  return class_1094.method_6201(var0, var7) != null?null:var7;
               }
            }

            var7.field_6244 = var2 - 8;
            var7.field_6249 = var4 + 2;
            if(var6 != null) {
               return class_1094.method_6201(var0, var7) != null?null:var7;
            }
         }

         var7.field_6247 = var2 + 2;
         var7.field_6246 = var4 - 8;
         if(var6 != null) {
            return class_1094.method_6201(var0, var7) != null?null:var7;
         }
      }

      var7.field_6247 = var2 + 8;
      var7.field_6249 = var4 + 2;
      return class_1094.method_6201(var0, var7) != null?null:var7;
   }

   // $FF: renamed from: b (h7, java.util.List, java.util.Random) void
   public void method_6197(class_1094 var1, List var2, Random var3) {
      int var5;
      label31: {
         String[] var4;
         label30: {
            label29: {
               String[] var10000 = class_752.method_4253();
               var5 = this.method_6200();
               var4 = var10000;
               if(var4 != null) {
                  switch(this.field_5753) {
                  case 0:
                     class_1207.method_6500(var1, var2, var3, this.field_5752.field_6244, this.field_5752.field_6245, this.field_5752.field_6249 + 1, 0, var5);
                     break;
                  case 1:
                     break label29;
                  case 2:
                     break label30;
                  case 3:
                     break label31;
                  default:
                     return;
                  }
               }

               if(var4 != null) {
                  return;
               }
            }

            class_1207.method_6500(var1, var2, var3, this.field_5752.field_6244 - 1, this.field_5752.field_6245, this.field_5752.field_6246, 1, var5);
            if(var4 != null) {
               return;
            }
         }

         class_1207.method_6500(var1, var2, var3, this.field_5752.field_6244, this.field_5752.field_6245, this.field_5752.field_6246 - 1, 2, var5);
         if(var4 != null) {
            return;
         }
      }

      class_1207.method_6500(var1, var2, var3, this.field_5752.field_6247 + 1, this.field_5752.field_6245, this.field_5752.field_6246, 3, var5);
   }

   // $FF: renamed from: b (ahb, java.util.Random, hS) boolean
   public boolean method_6198(ahb var1, Random var2, class_1206 var3) {
      String[] var4 = class_752.method_4253();
      byte var10000 = this.method_6203(var1, var3);
      if(var4 != null) {
         if(var10000 != 0) {
            return false;
         }

         this.method_6211(var1, var3, 0, 5, 0, 2, 7, 1, class_1192.field_6025, class_1192.field_6025, false);
         this.method_6211(var1, var3, 0, 0, 7, 2, 2, 8, class_1192.field_6025, class_1192.field_6025, false);
         var10000 = 0;
      }

      int var5 = var10000;

      while(var5 < 5) {
         int var10004 = 5 - var5;
         int var10005 = var5;
         if(var4 != null) {
            var10005 = var5 < 4?1:0;
         }

         this.method_6211(var1, var3, 0, var10004 - var10005, 2 + var5, 2, 7 - var5, 2 + var5, class_1192.field_6025, class_1192.field_6025, false);
         ++var5;
         if(var4 == null) {
            break;
         }
      }

      return true;
   }

   // $FF: renamed from: <clinit> () void
   static void method_6222() {
      boolean var10000 = true;
      char[] var10003 = "@?`zX²3Gs".toCharArray();
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
            field_5807 = (new String((char[])var4)).intern();
            String var2 = field_5807;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 38;
            break;
         case 1:
            var10009 = 86;
            break;
         case 2:
            var10009 = 26;
            break;
         case 3:
            var10009 = 111;
            break;
         case 4:
            var10009 = 77;
            break;
         case 5:
            var10009 = 167;
            break;
         default:
            var10009 = 129;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
