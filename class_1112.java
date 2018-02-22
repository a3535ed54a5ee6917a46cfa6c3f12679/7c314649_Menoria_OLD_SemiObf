import java.util.List;
import java.util.Random;

// $FF: renamed from: ie
public class class_1112 extends class_1099 {

   // $FF: renamed from: f int
   private int field_5798;
   // $FF: renamed from: g java.lang.String
   private static final String field_5799;
   // $FF: renamed from: i java.lang.String[]
   private static final String[] field_5800;


   // $FF: renamed from: <init> () void
   public void method_6191() {
      super.method_6191();
   }

   // $FF: renamed from: <init> (int, java.util.Random, hS, int) void
   public void method_6259(int var1, Random var2, class_1206 var3, int var4) {
      super.method_6192(var1);
      this.field_5753 = var4;
      this.field_5752 = var3;
      this.field_5798 = var2.nextInt();
   }

   // $FF: renamed from: b (java.util.List, java.util.Random, int, int, int, int, int) ie
   public static class_1112 method_6260(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      class_1206 var7 = class_1206.method_6479(var2, var3, var4, -1, -3, 0, 5, 10, 8, var5);
      class_1112 var10000;
      if(method_6234(var7) && class_1094.method_6201(var0, var7) == null) {
         var10000 = new class_1112;
         var10000.method_6259(var6, var1, var7, var5);
      } else {
         var10000 = null;
      }

      return var10000;
   }

   // $FF: renamed from: c (ro) void
   protected void method_6196(class_1583 var1) {
      super.method_6196(var1);
      String[] var10002 = field_5800;
      this.field_5798 = var1.method_8681("Seed");
   }

   // $FF: renamed from: b (ro) void
   protected void method_6194(class_1583 var1) {
      super.method_6194(var1);
      String[] var10001 = field_5800;
      var1.method_8667("Seed", this.field_5798);
   }

   // $FF: renamed from: b (ahb, java.util.Random, hS) boolean
   public boolean method_6198(ahb var1, Random var2, class_1206 var3) {
      String[] var10000 = class_752.method_4253();
      Random var5 = new Random((long)this.field_5798);
      String[] var4 = var10000;
      int var6 = 0;

      int var7;
      int var8;
      byte var9;
      while(true) {
         if(var6 <= 4) {
            var9 = 3;
            if(var4 == null) {
               break;
            }

            var7 = 3;

            while(true) {
               if(var7 <= 4) {
                  var8 = var5.nextInt(8);
                  this.method_6211(var1, var3, var6, var7, 0, var6, var7, var8, class_1192.field_6137, class_1192.field_6137, false);
                  ++var7;
                  if(var4 == null) {
                     break;
                  }

                  if(var4 != null) {
                     continue;
                  }
               }

               ++var6;
               break;
            }

            if(var4 != null) {
               continue;
            }
         }

         var6 = var5.nextInt(8);
         this.method_6211(var1, var3, 0, 5, 0, 0, 5, var6, class_1192.field_6137, class_1192.field_6137, false);
         var6 = var5.nextInt(8);
         this.method_6211(var1, var3, 4, 5, 0, 4, 5, var6, class_1192.field_6137, class_1192.field_6137, false);
         var9 = 0;
         break;
      }

      var6 = var9;

      while(true) {
         if(var6 <= 4) {
            var7 = var5.nextInt(5);
            this.method_6211(var1, var3, var6, 2, 0, var6, 2, var7, class_1192.field_6137, class_1192.field_6137, false);
            ++var6;
            if(var4 == null) {
               break;
            }

            if(var4 != null) {
               continue;
            }
         }

         var6 = 0;
         break;
      }

      boolean var10;
      while(true) {
         if(var6 <= 4) {
            var10 = false;
            if(var4 == null) {
               break;
            }

            var7 = 0;

            while(true) {
               if(var7 <= 1) {
                  var8 = var5.nextInt(3);
                  this.method_6211(var1, var3, var6, var7, 0, var6, var7, var8, class_1192.field_6137, class_1192.field_6137, false);
                  ++var7;
                  if(var4 == null) {
                     break;
                  }

                  if(var4 != null) {
                     continue;
                  }
               }

               ++var6;
               break;
            }

            if(var4 != null) {
               continue;
            }
         }

         var10 = true;
         break;
      }

      return var10;
   }

   // $FF: renamed from: <clinit> () void
   static void method_6222() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "|î°ÆInµlÇ>ä";
      int var4 = "|î°ÆInµlÇ>ä".length();
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
                  field_5800 = var5;
                  String[] var10 = field_5800;
                  field_5799 = "CL_00000455";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 222;
               break;
            case 1:
               var10009 = 67;
               break;
            case 2:
               var10009 = 186;
               break;
            case 3:
               var10009 = 97;
               break;
            case 4:
               var10009 = 23;
               break;
            case 5:
               var10009 = 88;
               break;
            default:
               var10009 = 152;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}
