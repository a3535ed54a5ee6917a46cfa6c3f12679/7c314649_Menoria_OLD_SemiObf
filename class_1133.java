import java.util.List;
import java.util.Random;

// $FF: renamed from: iy
public class class_1133 extends class_1131 {

   // $FF: renamed from: d int
   private int field_5860;
   // $FF: renamed from: g java.lang.String
   private static final String field_5861;
   // $FF: renamed from: j java.lang.String[]
   private static final String[] field_5862;


   // $FF: renamed from: <init> () void
   public void method_6191() {
      super.method_6191();
   }

   // $FF: renamed from: <init> (int, java.util.Random, hS, int) void
   public void method_6310(int var1, Random var2, class_1206 var3, int var4) {
      class_1133 var6;
      int var7;
      label20: {
         String[] var10000 = class_752.method_4253();
         super.method_6192(var1);
         String[] var5 = var10000;
         this.field_5753 = var4;
         var6 = this;
         class_1206 var10001 = var3;
         if(var5 != null) {
            this.field_5752 = var3;
            var6 = this;
            if(var4 != 2) {
               var7 = var4;
               if(var5 == null) {
                  break label20;
               }

               if(var4 != 0) {
                  var7 = var3.method_6488();
                  break label20;
               }
            }

            var10001 = var3;
         }

         var7 = var10001.method_6490();
      }

      var6.field_5860 = var7;
   }

   // $FF: renamed from: b (ro) void
   protected void method_6194(class_1583 var1) {
      super.method_6194(var1);
      String[] var10001 = field_5862;
      var1.method_8667("Steps", this.field_5860);
   }

   // $FF: renamed from: c (ro) void
   protected void method_6196(class_1583 var1) {
      super.method_6196(var1);
      String[] var10002 = field_5862;
      this.field_5860 = var1.method_8681("Steps");
   }

   // $FF: renamed from: b (java.util.List, java.util.Random, int, int, int, int) hS
   public static class_1206 method_6311(List var0, Random var1, int var2, int var3, int var4, int var5) {
      boolean var7 = true;
      String[] var6 = class_752.method_4253();
      class_1206 var8 = class_1206.method_6479(var2, var3, var4, -1, -1, 0, 5, 5, 4, var5);
      class_1094 var9 = class_1094.method_6201(var0, var8);
      class_1094 var10000 = var9;
      if(var6 != null) {
         if(var9 == null) {
            return null;
         }

         var10000 = var9;
      }

      int var11 = var10000.method_6199().field_6245;
      if(var6 != null) {
         if(var11 != var8.field_6245) {
            return null;
         }

         var11 = 3;
      }

      int var10 = var11;

      while(var10 >= 1) {
         var8 = class_1206.method_6479(var2, var3, var4, -1, -1, 0, 5, 5, var10 - 1, var5);
         if(var6 != null) {
            if(!var9.method_6199().method_6483(var8)) {
               return class_1206.method_6479(var2, var3, var4, -1, -1, 0, 5, 5, var10, var5);
            }

            --var10;
         }

         if(var6 == null) {
            break;
         }
      }

      return null;
   }

   // $FF: renamed from: b (ahb, java.util.Random, hS) boolean
   public boolean method_6198(ahb var1, Random var2, class_1206 var3) {
      String[] var4 = class_752.method_4253();
      byte var10000 = this.method_6203(var1, var3);
      if(var4 != null) {
         if(var10000 != 0) {
            return false;
         }

         var10000 = 0;
      }

      int var5 = var10000;

      boolean var7;
      while(true) {
         if(var5 < this.field_5860) {
            this.method_6208(var1, class_1192.field_6123, 0, 0, 0, var5, var3);
            this.method_6208(var1, class_1192.field_6123, 0, 1, 0, var5, var3);
            this.method_6208(var1, class_1192.field_6123, 0, 2, 0, var5, var3);
            this.method_6208(var1, class_1192.field_6123, 0, 3, 0, var5, var3);
            this.method_6208(var1, class_1192.field_6123, 0, 4, 0, var5, var3);
            var7 = true;
            if(var4 == null) {
               break;
            }

            int var6 = 1;

            while(true) {
               if(var6 <= 3) {
                  this.method_6208(var1, class_1192.field_6123, 0, 0, var6, var5, var3);
                  this.method_6208(var1, class_1192.field_6025, 0, 1, var6, var5, var3);
                  this.method_6208(var1, class_1192.field_6025, 0, 2, var6, var5, var3);
                  this.method_6208(var1, class_1192.field_6025, 0, 3, var6, var5, var3);
                  this.method_6208(var1, class_1192.field_6123, 0, 4, var6, var5, var3);
                  ++var6;
                  if(var4 == null) {
                     break;
                  }

                  if(var4 != null) {
                     continue;
                  }
               }

               this.method_6208(var1, class_1192.field_6123, 0, 0, 4, var5, var3);
               this.method_6208(var1, class_1192.field_6123, 0, 1, 4, var5, var3);
               this.method_6208(var1, class_1192.field_6123, 0, 2, 4, var5, var3);
               this.method_6208(var1, class_1192.field_6123, 0, 3, 4, var5, var3);
               this.method_6208(var1, class_1192.field_6123, 0, 4, 4, var5, var3);
               ++var5;
               break;
            }

            if(var4 != null) {
               continue;
            }
         }

         var7 = true;
         break;
      }

      return var7;
   }

   // $FF: renamed from: <clinit> () void
   static void method_6222() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "ÙYÖÌq¡>ácÇØ";
      int var4 = "ÙYÖÌq¡>ácÇØ".length();
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
                  field_5862 = var5;
                  String[] var10 = field_5862;
                  field_5861 = "CL_00000488";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 97;
               break;
            case 1:
               var10009 = 181;
               break;
            case 2:
               var10009 = 38;
               break;
            case 3:
               var10009 = 151;
               break;
            case 4:
               var10009 = 139;
               break;
            case 5:
               var10009 = 198;
               break;
            default:
               var10009 = 220;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}
