import java.util.List;
import java.util.Random;

// $FF: renamed from: iN
public class class_1128 extends class_1116 {

   // $FF: renamed from: h aji
   private aji field_5840;
   // $FF: renamed from: i aji
   private aji field_5841;
   // $FF: renamed from: j java.lang.String
   private static final String field_5842;
   // $FF: renamed from: k java.lang.String[]
   private static final String[] field_5843;


   // $FF: renamed from: <init> () void
   public void method_6191() {
      super.method_6191();
   }

   // $FF: renamed from: <init> (iY, int, java.util.Random, hS, int) void
   public void method_6294(class_1118 var1, int var2, Random var3, class_1206 var4, int var5) {
      super.method_6266(var1, var2);
      this.field_5753 = var5;
      this.field_5752 = var4;
      this.field_5840 = this.method_6295(var3);
      this.field_5841 = this.method_6295(var3);
   }

   // $FF: renamed from: b (ro) void
   protected void method_6194(class_1583 var1) {
      super.method_6194(var1);
      String[] var2 = field_5843;
      var1.method_8667("CA", aji.field_1973.method_5816(this.field_5840));
      var1.method_8667("CB", aji.field_1973.method_5816(this.field_5841));
   }

   // $FF: renamed from: c (ro) void
   protected void method_6196(class_1583 var1) {
      super.method_6196(var1);
      String[] var2 = field_5843;
      this.field_5840 = aji.method_2416(var1.method_8681("CA"));
      this.field_5841 = aji.method_2416(var1.method_8681("CB"));
   }

   // $FF: renamed from: b (java.util.Random) aji
   private aji method_6295(Random var1) {
      switch(var1.nextInt(5)) {
      case 0:
         return class_1192.field_6165;
      case 1:
         return class_1192.field_6166;
      default:
         return class_1192.field_6086;
      }
   }

   // $FF: renamed from: b (iY, java.util.List, java.util.Random, int, int, int, int, int) iN
   public static class_1128 method_6296(class_1118 var0, List var1, Random var2, int var3, int var4, int var5, int var6, int var7) {
      class_1206 var8 = class_1206.method_6479(var3, var4, var5, 0, 0, 0, 7, 4, 9, var6);
      class_1128 var10000;
      if(method_6270(var8) && class_1094.method_6201(var1, var8) == null) {
         var10000 = new class_1128;
         var10000.method_6294(var0, var7, var2, var8, var6);
      } else {
         var10000 = null;
      }

      return var10000;
   }

   // $FF: renamed from: b (ahb, java.util.Random, hS) boolean
   public boolean method_6198(ahb var1, Random var2, class_1206 var3) {
      String[] var4 = class_752.method_4253();
      int var10000 = this.field_5808;
      if(var4 != null) {
         if(this.field_5808 < 0) {
            this.field_5808 = this.method_6269(var1, var3);
            class_1128 var7 = this;
            if(var4 != null) {
               if(this.field_5808 < 0) {
                  return true;
               }

               var7 = this;
            }

            var7.field_5752.method_6486(0, this.field_5808 - this.field_5752.field_6248 + 4 - 1, 0);
         }

         this.method_6211(var1, var3, 0, 1, 0, 6, 4, 8, class_1192.field_6025, class_1192.field_6025, false);
         this.method_6211(var1, var3, 1, 0, 1, 2, 0, 7, class_1192.field_6087, class_1192.field_6087, false);
         this.method_6211(var1, var3, 4, 0, 1, 5, 0, 7, class_1192.field_6087, class_1192.field_6087, false);
         this.method_6211(var1, var3, 0, 0, 0, 0, 0, 8, class_1192.field_6042, class_1192.field_6042, false);
         this.method_6211(var1, var3, 6, 0, 0, 6, 0, 8, class_1192.field_6042, class_1192.field_6042, false);
         this.method_6211(var1, var3, 1, 0, 0, 5, 0, 0, class_1192.field_6042, class_1192.field_6042, false);
         this.method_6211(var1, var3, 1, 0, 8, 5, 0, 8, class_1192.field_6042, class_1192.field_6042, false);
         this.method_6211(var1, var3, 3, 0, 1, 3, 0, 7, class_1192.field_6034, class_1192.field_6034, false);
         var10000 = 1;
      }

      int var5 = var10000;

      while(true) {
         if(var5 <= 7) {
            this.method_6208(var1, this.field_5840, class_1715.method_9575(var2, 2, 7), 1, 1, var5, var3);
            this.method_6208(var1, this.field_5840, class_1715.method_9575(var2, 2, 7), 2, 1, var5, var3);
            this.method_6208(var1, this.field_5841, class_1715.method_9575(var2, 2, 7), 4, 1, var5, var3);
            this.method_6208(var1, this.field_5841, class_1715.method_9575(var2, 2, 7), 5, 1, var5, var3);
            ++var5;
            if(var4 == null) {
               break;
            }

            if(var4 != null) {
               continue;
            }
         }

         var5 = 0;
         break;
      }

      boolean var8;
      while(true) {
         if(var5 < 9) {
            var8 = false;
            if(var4 == null) {
               break;
            }

            int var6 = 0;

            while(true) {
               if(var6 < 7) {
                  this.method_6217(var1, var6, 4, var5, var3);
                  this.method_6218(var1, class_1192.field_6028, 0, var6, -1, var5, var3);
                  ++var6;
                  if(var4 == null) {
                     break;
                  }

                  if(var4 != null) {
                     continue;
                  }
               }

               ++var5;
               break;
            }

            if(var4 != null) {
               continue;
            }
         }

         var8 = true;
         break;
      }

      return var8;
   }

   // $FF: renamed from: <clinit> () void
   static void method_6222() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "6èñ|eO}á;8";
      int var4 = "6èñ|eO}á;8".length();
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
                  field_5843 = var5;
                  String[] var10 = field_5843;
                  field_5842 = "CL_00000519";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 133;
               break;
            case 1:
               var10009 = 170;
               break;
            case 2:
               var10009 = 156;
               break;
            case 3:
               var10009 = 8;
               break;
            case 4:
               var10009 = 17;
               break;
            case 5:
               var10009 = 117;
               break;
            default:
               var10009 = 156;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}
