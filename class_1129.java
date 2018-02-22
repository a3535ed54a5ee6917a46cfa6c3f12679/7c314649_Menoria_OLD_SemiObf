import java.util.List;
import java.util.Random;

// $FF: renamed from: iM
public class class_1129 extends class_1116 {

   // $FF: renamed from: h aji
   private aji field_5844;
   // $FF: renamed from: i aji
   private aji field_5845;
   // $FF: renamed from: j aji
   private aji field_5846;
   // $FF: renamed from: k aji
   private aji field_5847;
   // $FF: renamed from: l java.lang.String
   private static final String field_5848;
   // $FF: renamed from: m java.lang.String[]
   private static final String[] field_5849;


   // $FF: renamed from: <init> () void
   public void method_6191() {
      super.method_6191();
   }

   // $FF: renamed from: <init> (iY, int, java.util.Random, hS, int) void
   public void method_6297(class_1118 var1, int var2, Random var3, class_1206 var4, int var5) {
      super.method_6266(var1, var2);
      this.field_5753 = var5;
      this.field_5752 = var4;
      this.field_5844 = this.method_6298(var3);
      this.field_5845 = this.method_6298(var3);
      this.field_5846 = this.method_6298(var3);
      this.field_5847 = this.method_6298(var3);
   }

   // $FF: renamed from: b (ro) void
   protected void method_6194(class_1583 var1) {
      super.method_6194(var1);
      String[] var2 = field_5849;
      var1.method_8667("CA", aji.field_1973.method_5816(this.field_5844));
      var1.method_8667("CB", aji.field_1973.method_5816(this.field_5845));
      var1.method_8667("CC", aji.field_1973.method_5816(this.field_5846));
      var1.method_8667("CD", aji.field_1973.method_5816(this.field_5847));
   }

   // $FF: renamed from: c (ro) void
   protected void method_6196(class_1583 var1) {
      super.method_6196(var1);
      String[] var2 = field_5849;
      this.field_5844 = aji.method_2416(var1.method_8681("CA"));
      this.field_5845 = aji.method_2416(var1.method_8681("CB"));
      this.field_5846 = aji.method_2416(var1.method_8681("CC"));
      this.field_5847 = aji.method_2416(var1.method_8681("CD"));
   }

   // $FF: renamed from: b (java.util.Random) aji
   private aji method_6298(Random var1) {
      switch(var1.nextInt(5)) {
      case 0:
         return class_1192.field_6165;
      case 1:
         return class_1192.field_6166;
      default:
         return class_1192.field_6086;
      }
   }

   // $FF: renamed from: b (iY, java.util.List, java.util.Random, int, int, int, int, int) iM
   public static class_1129 method_6299(class_1118 var0, List var1, Random var2, int var3, int var4, int var5, int var6, int var7) {
      class_1206 var8 = class_1206.method_6479(var3, var4, var5, 0, 0, 0, 13, 4, 9, var6);
      class_1129 var10000;
      if(method_6270(var8) && class_1094.method_6201(var1, var8) == null) {
         var10000 = new class_1129;
         var10000.method_6297(var0, var7, var2, var8, var6);
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
            class_1129 var7 = this;
            if(var4 != null) {
               if(this.field_5808 < 0) {
                  return true;
               }

               var7 = this;
            }

            var7.field_5752.method_6486(0, this.field_5808 - this.field_5752.field_6248 + 4 - 1, 0);
         }

         this.method_6211(var1, var3, 0, 1, 0, 12, 4, 8, class_1192.field_6025, class_1192.field_6025, false);
         this.method_6211(var1, var3, 1, 0, 1, 2, 0, 7, class_1192.field_6087, class_1192.field_6087, false);
         this.method_6211(var1, var3, 4, 0, 1, 5, 0, 7, class_1192.field_6087, class_1192.field_6087, false);
         this.method_6211(var1, var3, 7, 0, 1, 8, 0, 7, class_1192.field_6087, class_1192.field_6087, false);
         this.method_6211(var1, var3, 10, 0, 1, 11, 0, 7, class_1192.field_6087, class_1192.field_6087, false);
         this.method_6211(var1, var3, 0, 0, 0, 0, 0, 8, class_1192.field_6042, class_1192.field_6042, false);
         this.method_6211(var1, var3, 6, 0, 0, 6, 0, 8, class_1192.field_6042, class_1192.field_6042, false);
         this.method_6211(var1, var3, 12, 0, 0, 12, 0, 8, class_1192.field_6042, class_1192.field_6042, false);
         this.method_6211(var1, var3, 1, 0, 0, 11, 0, 0, class_1192.field_6042, class_1192.field_6042, false);
         this.method_6211(var1, var3, 1, 0, 8, 11, 0, 8, class_1192.field_6042, class_1192.field_6042, false);
         this.method_6211(var1, var3, 3, 0, 1, 3, 0, 7, class_1192.field_6034, class_1192.field_6034, false);
         this.method_6211(var1, var3, 9, 0, 1, 9, 0, 7, class_1192.field_6034, class_1192.field_6034, false);
         var10000 = 1;
      }

      int var5 = var10000;

      while(true) {
         if(var5 <= 7) {
            this.method_6208(var1, this.field_5844, class_1715.method_9575(var2, 2, 7), 1, 1, var5, var3);
            this.method_6208(var1, this.field_5844, class_1715.method_9575(var2, 2, 7), 2, 1, var5, var3);
            this.method_6208(var1, this.field_5845, class_1715.method_9575(var2, 2, 7), 4, 1, var5, var3);
            this.method_6208(var1, this.field_5845, class_1715.method_9575(var2, 2, 7), 5, 1, var5, var3);
            this.method_6208(var1, this.field_5846, class_1715.method_9575(var2, 2, 7), 7, 1, var5, var3);
            this.method_6208(var1, this.field_5846, class_1715.method_9575(var2, 2, 7), 8, 1, var5, var3);
            this.method_6208(var1, this.field_5847, class_1715.method_9575(var2, 2, 7), 10, 1, var5, var3);
            this.method_6208(var1, this.field_5847, class_1715.method_9575(var2, 2, 7), 11, 1, var5, var3);
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
               if(var6 < 13) {
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
      // $FF: Couldn't be decompiled
   }
}
