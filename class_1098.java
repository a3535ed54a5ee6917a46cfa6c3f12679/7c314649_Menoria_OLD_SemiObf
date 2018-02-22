import java.util.Random;

// $FF: renamed from: it
public class class_1098 extends class_1095 {

   // $FF: renamed from: i boolean[]
   private boolean[] field_5774;
   // $FF: renamed from: j vD[]
   private static final class_1652[] field_5775;
   // $FF: renamed from: k java.lang.String
   private static final String field_5776;
   // $FF: renamed from: l java.lang.String[]
   private static final String[] field_5777;


   // $FF: renamed from: <init> () void
   public void method_6191() {
      super.method_6191();
      this.field_5774 = new boolean[4];
   }

   // $FF: renamed from: <init> (java.util.Random, int, int) void
   public void method_6227(Random var1, int var2, int var3) {
      super.method_6223(var1, var2, 64, var3, 21, 15, 21);
      this.field_5774 = new boolean[4];
   }

   // $FF: renamed from: b (ro) void
   protected void method_6194(class_1583 var1) {
      super.method_6194(var1);
      String[] var2 = field_5777;
      var1.initGui4("hasPlacedChest0", this.field_5774[0]);
      var1.initGui4("hasPlacedChest1", this.field_5774[1]);
      var1.initGui4("hasPlacedChest2", this.field_5774[2]);
      var1.initGui4("hasPlacedChest3", this.field_5774[3]);
   }

   // $FF: renamed from: c (ro) void
   protected void method_6196(class_1583 var1) {
      super.method_6196(var1);
      String[] var2 = field_5777;
      this.field_5774[0] = var1.method_8690("hasPlacedChest0");
      this.field_5774[1] = var1.method_8690("hasPlacedChest1");
      this.field_5774[2] = var1.method_8690("hasPlacedChest2");
      this.field_5774[3] = var1.method_8690("hasPlacedChest3");
   }

   // $FF: renamed from: b (ahb, java.util.Random, hS) boolean
   public boolean method_6198(ahb var1, Random var2, class_1206 var3) {
      String[] var10000 = class_752.method_4253();
      this.method_6211(var1, var3, 0, -4, 0, this.field_5756 - 1, 0, this.field_5758 - 1, class_1192.field_6051, class_1192.field_6051, false);
      String[] var4 = var10000;
      int var5 = 1;

      while(true) {
         if(var5 <= 9) {
            this.method_6211(var1, var3, var5, var5, var5, this.field_5756 - 1 - var5, var5, this.field_5758 - 1 - var5, class_1192.field_6051, class_1192.field_6051, false);
            this.method_6211(var1, var3, var5 + 1, var5, var5 + 1, this.field_5756 - 2 - var5, var5, this.field_5758 - 2 - var5, class_1192.field_6025, class_1192.field_6025, false);
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

      int var6;
      int var15;
      while(true) {
         if(var5 < this.field_5756) {
            var15 = 0;
            if(var4 == null) {
               break;
            }

            var6 = 0;

            while(true) {
               if(var6 < this.field_5758) {
                  byte var7 = -5;
                  this.method_6218(var1, class_1192.field_6051, 0, var5, var7, var6, var3);
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

         var5 = this.method_6207(class_1192.field_6152, 3);
         var15 = this.method_6207(class_1192.field_6152, 2);
         break;
      }

      var6 = var15;
      int var14 = this.method_6207(class_1192.field_6152, 0);
      int var8 = this.method_6207(class_1192.field_6152, 1);
      byte var9 = 1;
      byte var10 = 11;
      this.method_6211(var1, var3, 0, 0, 0, 4, 9, 4, class_1192.field_6051, class_1192.field_6025, false);
      this.method_6211(var1, var3, 1, 10, 1, 3, 10, 3, class_1192.field_6051, class_1192.field_6051, false);
      this.method_6208(var1, class_1192.field_6152, var5, 2, 10, 0, var3);
      this.method_6208(var1, class_1192.field_6152, var6, 2, 10, 4, var3);
      this.method_6208(var1, class_1192.field_6152, var14, 0, 10, 2, var3);
      this.method_6208(var1, class_1192.field_6152, var8, 4, 10, 2, var3);
      this.method_6211(var1, var3, this.field_5756 - 5, 0, 0, this.field_5756 - 1, 9, 4, class_1192.field_6051, class_1192.field_6025, false);
      this.method_6211(var1, var3, this.field_5756 - 4, 10, 1, this.field_5756 - 2, 10, 3, class_1192.field_6051, class_1192.field_6051, false);
      this.method_6208(var1, class_1192.field_6152, var5, this.field_5756 - 3, 10, 0, var3);
      this.method_6208(var1, class_1192.field_6152, var6, this.field_5756 - 3, 10, 4, var3);
      this.method_6208(var1, class_1192.field_6152, var14, this.field_5756 - 5, 10, 2, var3);
      this.method_6208(var1, class_1192.field_6152, var8, this.field_5756 - 1, 10, 2, var3);
      this.method_6211(var1, var3, 8, 0, 0, 12, 4, 4, class_1192.field_6051, class_1192.field_6025, false);
      this.method_6211(var1, var3, 9, 1, 0, 11, 3, 4, class_1192.field_6025, class_1192.field_6025, false);
      this.method_6208(var1, class_1192.field_6051, 2, 9, 1, 1, var3);
      this.method_6208(var1, class_1192.field_6051, 2, 9, 2, 1, var3);
      this.method_6208(var1, class_1192.field_6051, 2, 9, 3, 1, var3);
      this.method_6208(var1, class_1192.field_6051, 2, 10, 3, 1, var3);
      this.method_6208(var1, class_1192.field_6051, 2, 11, 3, 1, var3);
      this.method_6208(var1, class_1192.field_6051, 2, 11, 2, 1, var3);
      this.method_6208(var1, class_1192.field_6051, 2, 11, 1, 1, var3);
      this.method_6211(var1, var3, 4, 1, 1, 8, 3, 3, class_1192.field_6051, class_1192.field_6025, false);
      this.method_6211(var1, var3, 4, 1, 2, 8, 2, 2, class_1192.field_6025, class_1192.field_6025, false);
      this.method_6211(var1, var3, 12, 1, 1, 16, 3, 3, class_1192.field_6051, class_1192.field_6025, false);
      this.method_6211(var1, var3, 12, 1, 2, 16, 2, 2, class_1192.field_6025, class_1192.field_6025, false);
      this.method_6211(var1, var3, 5, 4, 5, this.field_5756 - 6, 4, this.field_5758 - 6, class_1192.field_6051, class_1192.field_6051, false);
      this.method_6211(var1, var3, 9, 4, 9, 11, 4, 11, class_1192.field_6025, class_1192.field_6025, false);
      this.method_6212(var1, var3, 8, 1, 8, 8, 3, 8, class_1192.field_6051, 2, class_1192.field_6051, 2, false);
      this.method_6212(var1, var3, 12, 1, 8, 12, 3, 8, class_1192.field_6051, 2, class_1192.field_6051, 2, false);
      this.method_6212(var1, var3, 8, 1, 12, 8, 3, 12, class_1192.field_6051, 2, class_1192.field_6051, 2, false);
      this.method_6212(var1, var3, 12, 1, 12, 12, 3, 12, class_1192.field_6051, 2, class_1192.field_6051, 2, false);
      this.method_6211(var1, var3, 1, 1, 5, 4, 4, 11, class_1192.field_6051, class_1192.field_6051, false);
      this.method_6211(var1, var3, this.field_5756 - 5, 1, 5, this.field_5756 - 2, 4, 11, class_1192.field_6051, class_1192.field_6051, false);
      this.method_6211(var1, var3, 6, 7, 9, 6, 7, 11, class_1192.field_6051, class_1192.field_6051, false);
      this.method_6211(var1, var3, this.field_5756 - 7, 7, 9, this.field_5756 - 7, 7, 11, class_1192.field_6051, class_1192.field_6051, false);
      this.method_6212(var1, var3, 5, 5, 9, 5, 7, 11, class_1192.field_6051, 2, class_1192.field_6051, 2, false);
      this.method_6212(var1, var3, this.field_5756 - 6, 5, 9, this.field_5756 - 6, 7, 11, class_1192.field_6051, 2, class_1192.field_6051, 2, false);
      this.method_6208(var1, class_1192.field_6025, 0, 5, 5, 10, var3);
      this.method_6208(var1, class_1192.field_6025, 0, 5, 6, 10, var3);
      this.method_6208(var1, class_1192.field_6025, 0, 6, 6, 10, var3);
      this.method_6208(var1, class_1192.field_6025, 0, this.field_5756 - 6, 5, 10, var3);
      this.method_6208(var1, class_1192.field_6025, 0, this.field_5756 - 6, 6, 10, var3);
      this.method_6208(var1, class_1192.field_6025, 0, this.field_5756 - 7, 6, 10, var3);
      this.method_6211(var1, var3, 2, 4, 4, 2, 6, 4, class_1192.field_6025, class_1192.field_6025, false);
      this.method_6211(var1, var3, this.field_5756 - 3, 4, 4, this.field_5756 - 3, 6, 4, class_1192.field_6025, class_1192.field_6025, false);
      this.method_6208(var1, class_1192.field_6152, var5, 2, 4, 5, var3);
      this.method_6208(var1, class_1192.field_6152, var5, 2, 3, 4, var3);
      this.method_6208(var1, class_1192.field_6152, var5, this.field_5756 - 3, 4, 5, var3);
      this.method_6208(var1, class_1192.field_6152, var5, this.field_5756 - 3, 3, 4, var3);
      this.method_6211(var1, var3, 1, 1, 3, 2, 2, 3, class_1192.field_6051, class_1192.field_6051, false);
      this.method_6211(var1, var3, this.field_5756 - 3, 1, 3, this.field_5756 - 2, 2, 3, class_1192.field_6051, class_1192.field_6051, false);
      this.method_6208(var1, class_1192.field_6152, 0, 1, 1, 2, var3);
      this.method_6208(var1, class_1192.field_6152, 0, this.field_5756 - 2, 1, 2, var3);
      this.method_6208(var1, class_1192.field_6071, 1, 1, 2, 2, var3);
      this.method_6208(var1, class_1192.field_6071, 1, this.field_5756 - 2, 2, 2, var3);
      this.method_6208(var1, class_1192.field_6152, var8, 2, 1, 2, var3);
      this.method_6208(var1, class_1192.field_6152, var14, this.field_5756 - 3, 1, 2, var3);
      this.method_6211(var1, var3, 4, 3, 5, 4, 3, 18, class_1192.field_6051, class_1192.field_6051, false);
      this.method_6211(var1, var3, this.field_5756 - 5, 3, 5, this.field_5756 - 5, 3, 17, class_1192.field_6051, class_1192.field_6051, false);
      this.method_6211(var1, var3, 3, 1, 5, 4, 2, 16, class_1192.field_6025, class_1192.field_6025, false);
      this.method_6211(var1, var3, this.field_5756 - 6, 1, 5, this.field_5756 - 5, 2, 16, class_1192.field_6025, class_1192.field_6025, false);
      int var11 = 5;

      while(true) {
         if(var11 <= 17) {
            this.method_6208(var1, class_1192.field_6051, 2, 4, 1, var11, var3);
            this.method_6208(var1, class_1192.field_6051, 1, 4, 2, var11, var3);
            this.method_6208(var1, class_1192.field_6051, 2, this.field_5756 - 5, 1, var11, var3);
            this.method_6208(var1, class_1192.field_6051, 1, this.field_5756 - 5, 2, var11, var3);
            var11 += 2;
            if(var4 == null) {
               break;
            }

            if(var4 != null) {
               continue;
            }
         }

         this.method_6208(var1, class_1192.field_6062, var9, 10, 0, 7, var3);
         this.method_6208(var1, class_1192.field_6062, var9, 10, 0, 8, var3);
         this.method_6208(var1, class_1192.field_6062, var9, 9, 0, 9, var3);
         this.method_6208(var1, class_1192.field_6062, var9, 11, 0, 9, var3);
         this.method_6208(var1, class_1192.field_6062, var9, 8, 0, 10, var3);
         this.method_6208(var1, class_1192.field_6062, var9, 12, 0, 10, var3);
         this.method_6208(var1, class_1192.field_6062, var9, 7, 0, 10, var3);
         this.method_6208(var1, class_1192.field_6062, var9, 13, 0, 10, var3);
         this.method_6208(var1, class_1192.field_6062, var9, 9, 0, 11, var3);
         this.method_6208(var1, class_1192.field_6062, var9, 11, 0, 11, var3);
         this.method_6208(var1, class_1192.field_6062, var9, 10, 0, 12, var3);
         this.method_6208(var1, class_1192.field_6062, var9, 10, 0, 13, var3);
         this.method_6208(var1, class_1192.field_6062, var10, 10, 0, 10, var3);
         break;
      }

      var11 = 0;

      while(true) {
         if(var11 <= this.field_5756 - 1) {
            this.method_6208(var1, class_1192.field_6051, 2, var11, 2, 1, var3);
            this.method_6208(var1, class_1192.field_6062, var9, var11, 2, 2, var3);
            this.method_6208(var1, class_1192.field_6051, 2, var11, 2, 3, var3);
            this.method_6208(var1, class_1192.field_6051, 2, var11, 3, 1, var3);
            this.method_6208(var1, class_1192.field_6062, var9, var11, 3, 2, var3);
            this.method_6208(var1, class_1192.field_6051, 2, var11, 3, 3, var3);
            this.method_6208(var1, class_1192.field_6062, var9, var11, 4, 1, var3);
            this.method_6208(var1, class_1192.field_6051, 1, var11, 4, 2, var3);
            this.method_6208(var1, class_1192.field_6062, var9, var11, 4, 3, var3);
            this.method_6208(var1, class_1192.field_6051, 2, var11, 5, 1, var3);
            this.method_6208(var1, class_1192.field_6062, var9, var11, 5, 2, var3);
            this.method_6208(var1, class_1192.field_6051, 2, var11, 5, 3, var3);
            this.method_6208(var1, class_1192.field_6062, var9, var11, 6, 1, var3);
            this.method_6208(var1, class_1192.field_6051, 1, var11, 6, 2, var3);
            this.method_6208(var1, class_1192.field_6062, var9, var11, 6, 3, var3);
            this.method_6208(var1, class_1192.field_6062, var9, var11, 7, 1, var3);
            this.method_6208(var1, class_1192.field_6062, var9, var11, 7, 2, var3);
            this.method_6208(var1, class_1192.field_6062, var9, var11, 7, 3, var3);
            this.method_6208(var1, class_1192.field_6051, 2, var11, 8, 1, var3);
            this.method_6208(var1, class_1192.field_6051, 2, var11, 8, 2, var3);
            this.method_6208(var1, class_1192.field_6051, 2, var11, 8, 3, var3);
            var11 += this.field_5756 - 1;
            if(var4 == null) {
               break;
            }

            if(var4 != null) {
               continue;
            }
         }

         var11 = 2;
         break;
      }

      while(true) {
         if(var11 <= this.field_5756 - 3) {
            this.method_6208(var1, class_1192.field_6051, 2, var11 - 1, 2, 0, var3);
            this.method_6208(var1, class_1192.field_6062, var9, var11, 2, 0, var3);
            this.method_6208(var1, class_1192.field_6051, 2, var11 + 1, 2, 0, var3);
            this.method_6208(var1, class_1192.field_6051, 2, var11 - 1, 3, 0, var3);
            this.method_6208(var1, class_1192.field_6062, var9, var11, 3, 0, var3);
            this.method_6208(var1, class_1192.field_6051, 2, var11 + 1, 3, 0, var3);
            this.method_6208(var1, class_1192.field_6062, var9, var11 - 1, 4, 0, var3);
            this.method_6208(var1, class_1192.field_6051, 1, var11, 4, 0, var3);
            this.method_6208(var1, class_1192.field_6062, var9, var11 + 1, 4, 0, var3);
            this.method_6208(var1, class_1192.field_6051, 2, var11 - 1, 5, 0, var3);
            this.method_6208(var1, class_1192.field_6062, var9, var11, 5, 0, var3);
            this.method_6208(var1, class_1192.field_6051, 2, var11 + 1, 5, 0, var3);
            this.method_6208(var1, class_1192.field_6062, var9, var11 - 1, 6, 0, var3);
            this.method_6208(var1, class_1192.field_6051, 1, var11, 6, 0, var3);
            this.method_6208(var1, class_1192.field_6062, var9, var11 + 1, 6, 0, var3);
            this.method_6208(var1, class_1192.field_6062, var9, var11 - 1, 7, 0, var3);
            this.method_6208(var1, class_1192.field_6062, var9, var11, 7, 0, var3);
            this.method_6208(var1, class_1192.field_6062, var9, var11 + 1, 7, 0, var3);
            this.method_6208(var1, class_1192.field_6051, 2, var11 - 1, 8, 0, var3);
            this.method_6208(var1, class_1192.field_6051, 2, var11, 8, 0, var3);
            this.method_6208(var1, class_1192.field_6051, 2, var11 + 1, 8, 0, var3);
            var11 += this.field_5756 - 3 - 2;
            if(var4 == null) {
               break;
            }

            if(var4 != null) {
               continue;
            }
         }

         this.method_6212(var1, var3, 8, 4, 0, 12, 6, 0, class_1192.field_6051, 2, class_1192.field_6051, 2, false);
         this.method_6208(var1, class_1192.field_6025, 0, 8, 6, 0, var3);
         this.method_6208(var1, class_1192.field_6025, 0, 12, 6, 0, var3);
         this.method_6208(var1, class_1192.field_6062, var9, 9, 5, 0, var3);
         this.method_6208(var1, class_1192.field_6051, 1, 10, 5, 0, var3);
         this.method_6208(var1, class_1192.field_6062, var9, 11, 5, 0, var3);
         this.method_6212(var1, var3, 8, -14, 8, 12, -11, 12, class_1192.field_6051, 2, class_1192.field_6051, 2, false);
         this.method_6212(var1, var3, 8, -10, 8, 12, -10, 12, class_1192.field_6051, 1, class_1192.field_6051, 1, false);
         this.method_6212(var1, var3, 8, -9, 8, 12, -9, 12, class_1192.field_6051, 2, class_1192.field_6051, 2, false);
         this.method_6211(var1, var3, 8, -8, 8, 12, -1, 12, class_1192.field_6051, class_1192.field_6051, false);
         this.method_6211(var1, var3, 9, -11, 9, 11, -1, 11, class_1192.field_6025, class_1192.field_6025, false);
         this.method_6208(var1, class_1192.field_6096, 0, 10, -11, 10, var3);
         this.method_6211(var1, var3, 9, -13, 9, 11, -13, 11, class_1192.field_6073, class_1192.field_6025, false);
         this.method_6208(var1, class_1192.field_6025, 0, 8, -11, 10, var3);
         this.method_6208(var1, class_1192.field_6025, 0, 8, -10, 10, var3);
         this.method_6208(var1, class_1192.field_6051, 1, 7, -10, 10, var3);
         this.method_6208(var1, class_1192.field_6051, 2, 7, -11, 10, var3);
         this.method_6208(var1, class_1192.field_6025, 0, 12, -11, 10, var3);
         this.method_6208(var1, class_1192.field_6025, 0, 12, -10, 10, var3);
         this.method_6208(var1, class_1192.field_6051, 1, 13, -10, 10, var3);
         this.method_6208(var1, class_1192.field_6051, 2, 13, -11, 10, var3);
         this.method_6208(var1, class_1192.field_6025, 0, 10, -11, 8, var3);
         this.method_6208(var1, class_1192.field_6025, 0, 10, -10, 8, var3);
         this.method_6208(var1, class_1192.field_6051, 1, 10, -10, 7, var3);
         this.method_6208(var1, class_1192.field_6051, 2, 10, -11, 7, var3);
         this.method_6208(var1, class_1192.field_6025, 0, 10, -11, 12, var3);
         this.method_6208(var1, class_1192.field_6025, 0, 10, -10, 12, var3);
         this.method_6208(var1, class_1192.field_6051, 1, 10, -10, 13, var3);
         this.method_6208(var1, class_1192.field_6051, 2, 10, -11, 13, var3);
         break;
      }

      var11 = 0;

      while(true) {
         if(var11 < 4) {
            var15 = this.field_5774[var11];
            if(var4 == null) {
               break;
            }

            label49: {
               if(var4 != null) {
                  if(var15 != 0) {
                     break label49;
                  }

                  var15 = class_1649.field_8587[var11] * 2;
               }

               int var12 = var15;
               int var13 = class_1649.field_8588[var11] * 2;
               this.field_5774[var11] = this.method_6219(var1, var3, var2, 10 + var12, -11, 10 + var13, class_1652.method_9098(field_5775, new class_1652[]{class_1010.field_5259.getBlock06(var2)}), 2 + var2.nextInt(5));
            }

            ++var11;
            if(var4 != null) {
               continue;
            }
         }

         var15 = 1;
         break;
      }

      return (boolean)var15;
   }

   // $FF: renamed from: <clinit> () void
   static void method_6222() {
      // $FF: Couldn't be decompiled
   }
}
