import java.util.Random;

// $FF: renamed from: iu
public class class_1097 extends class_1095 {

   // $FF: renamed from: i boolean
   private boolean field_5765;
   // $FF: renamed from: j boolean
   private boolean field_5766;
   // $FF: renamed from: k boolean
   private boolean field_5767;
   // $FF: renamed from: l boolean
   private boolean field_5768;
   // $FF: renamed from: m vD[]
   private static final class_1652[] field_5769;
   // $FF: renamed from: n vD[]
   private static final class_1652[] field_5770;
   // $FF: renamed from: o i0
   private static class_1197 field_5771;
   // $FF: renamed from: p java.lang.String
   private static final String field_5772;
   // $FF: renamed from: q java.lang.String[]
   private static final String[] field_5773;


   // $FF: renamed from: <init> () void
   public void method_6191() {
      super.method_6191();
   }

   // $FF: renamed from: <init> (java.util.Random, int, int) void
   public void method_6226(Random var1, int var2, int var3) {
      super.method_6223(var1, var2, 64, var3, 12, 10, 15);
   }

   // $FF: renamed from: b (ro) void
   protected void method_6194(class_1583 var1) {
      super.method_6194(var1);
      String[] var2 = field_5773;
      var1.initGui4("placedMainChest", this.field_5765);
      var1.initGui4("placedHiddenChest", this.field_5766);
      var1.initGui4("placedTrap1", this.field_5767);
      var1.initGui4("placedTrap2", this.field_5768);
   }

   // $FF: renamed from: c (ro) void
   protected void method_6196(class_1583 var1) {
      super.method_6196(var1);
      String[] var2 = field_5773;
      this.field_5765 = var1.method_8690("placedMainChest");
      this.field_5766 = var1.method_8690("placedHiddenChest");
      this.field_5767 = var1.method_8690("placedTrap1");
      this.field_5768 = var1.method_8690("placedTrap2");
   }

   // $FF: renamed from: b (ahb, java.util.Random, hS) boolean
   public boolean method_6198(ahb var1, Random var2, class_1206 var3) {
      String[] var4 = class_752.method_4253();
      int var10000 = this.method_6224(var1, var3, 0);
      if(var4 != null) {
         if(var10000 == 0) {
            return false;
         }

         var10000 = this.method_6207(class_1192.field_6093, 3);
      }

      int var5 = var10000;
      int var6 = this.method_6207(class_1192.field_6093, 2);
      int var7 = this.method_6207(class_1192.field_6093, 0);
      int var8 = this.method_6207(class_1192.field_6093, 1);
      this.method_6213(var1, var3, 0, -4, 0, this.field_5756 - 1, 0, this.field_5758 - 1, false, var2, field_5771);
      this.method_6213(var1, var3, 2, 1, 2, 9, 2, 2, false, var2, field_5771);
      this.method_6213(var1, var3, 2, 1, 12, 9, 2, 12, false, var2, field_5771);
      this.method_6213(var1, var3, 2, 1, 3, 2, 2, 11, false, var2, field_5771);
      this.method_6213(var1, var3, 9, 1, 3, 9, 2, 11, false, var2, field_5771);
      this.method_6213(var1, var3, 1, 3, 1, 10, 6, 1, false, var2, field_5771);
      this.method_6213(var1, var3, 1, 3, 13, 10, 6, 13, false, var2, field_5771);
      this.method_6213(var1, var3, 1, 3, 2, 1, 6, 12, false, var2, field_5771);
      this.method_6213(var1, var3, 10, 3, 2, 10, 6, 12, false, var2, field_5771);
      this.method_6213(var1, var3, 2, 3, 2, 9, 3, 12, false, var2, field_5771);
      this.method_6213(var1, var3, 2, 6, 2, 9, 6, 12, false, var2, field_5771);
      this.method_6213(var1, var3, 3, 7, 3, 8, 7, 11, false, var2, field_5771);
      this.method_6213(var1, var3, 4, 8, 4, 7, 8, 10, false, var2, field_5771);
      this.method_6210(var1, var3, 3, 1, 3, 8, 2, 11);
      this.method_6210(var1, var3, 4, 3, 6, 7, 3, 9);
      this.method_6210(var1, var3, 2, 4, 2, 9, 5, 12);
      this.method_6210(var1, var3, 4, 6, 5, 7, 6, 9);
      this.method_6210(var1, var3, 5, 7, 6, 6, 7, 8);
      this.method_6210(var1, var3, 5, 1, 2, 6, 2, 2);
      this.method_6210(var1, var3, 5, 2, 12, 6, 2, 12);
      this.method_6210(var1, var3, 5, 5, 1, 6, 5, 1);
      this.method_6210(var1, var3, 5, 5, 13, 6, 5, 13);
      this.method_6208(var1, class_1192.field_6025, 0, 1, 5, 5, var3);
      this.method_6208(var1, class_1192.field_6025, 0, 10, 5, 5, var3);
      this.method_6208(var1, class_1192.field_6025, 0, 1, 5, 9, var3);
      this.method_6208(var1, class_1192.field_6025, 0, 10, 5, 9, var3);
      int var9 = 0;

      while(true) {
         if(var9 <= 14) {
            this.method_6213(var1, var3, 2, 4, var9, 2, 5, var9, false, var2, field_5771);
            this.method_6213(var1, var3, 4, 4, var9, 4, 5, var9, false, var2, field_5771);
            this.method_6213(var1, var3, 7, 4, var9, 7, 5, var9, false, var2, field_5771);
            this.method_6213(var1, var3, 9, 4, var9, 9, 5, var9, false, var2, field_5771);
            var9 += 14;
            if(var4 == null) {
               break;
            }

            if(var4 != null) {
               continue;
            }
         }

         this.method_6213(var1, var3, 5, 6, 0, 6, 6, 0, false, var2, field_5771);
         break;
      }

      var9 = 0;

      byte var11;
      while(true) {
         if(var9 <= 11) {
            var11 = 2;
            if(var4 == null) {
               break;
            }

            int var10 = 2;

            while(true) {
               if(var10 <= 12) {
                  this.method_6213(var1, var3, var9, 4, var10, var9, 5, var10, false, var2, field_5771);
                  var10 += 2;
                  if(var4 == null) {
                     break;
                  }

                  if(var4 != null) {
                     continue;
                  }
               }

               this.method_6213(var1, var3, var9, 6, 5, var9, 6, 5, false, var2, field_5771);
               this.method_6213(var1, var3, var9, 6, 9, var9, 6, 9, false, var2, field_5771);
               var9 += 11;
               break;
            }

            if(var4 != null) {
               continue;
            }
         }

         this.method_6213(var1, var3, 2, 7, 2, 2, 9, 2, false, var2, field_5771);
         this.method_6213(var1, var3, 9, 7, 2, 9, 9, 2, false, var2, field_5771);
         this.method_6213(var1, var3, 2, 7, 12, 2, 9, 12, false, var2, field_5771);
         this.method_6213(var1, var3, 9, 7, 12, 9, 9, 12, false, var2, field_5771);
         this.method_6213(var1, var3, 4, 9, 4, 4, 9, 4, false, var2, field_5771);
         this.method_6213(var1, var3, 7, 9, 4, 7, 9, 4, false, var2, field_5771);
         this.method_6213(var1, var3, 4, 9, 10, 4, 9, 10, false, var2, field_5771);
         this.method_6213(var1, var3, 7, 9, 10, 7, 9, 10, false, var2, field_5771);
         this.method_6213(var1, var3, 5, 9, 7, 6, 9, 7, false, var2, field_5771);
         this.method_6208(var1, class_1192.field_6093, var5, 5, 9, 6, var3);
         this.method_6208(var1, class_1192.field_6093, var5, 6, 9, 6, var3);
         this.method_6208(var1, class_1192.field_6093, var6, 5, 9, 8, var3);
         this.method_6208(var1, class_1192.field_6093, var6, 6, 9, 8, var3);
         this.method_6208(var1, class_1192.field_6093, var5, 4, 0, 0, var3);
         this.method_6208(var1, class_1192.field_6093, var5, 5, 0, 0, var3);
         this.method_6208(var1, class_1192.field_6093, var5, 6, 0, 0, var3);
         this.method_6208(var1, class_1192.field_6093, var5, 7, 0, 0, var3);
         this.method_6208(var1, class_1192.field_6093, var5, 4, 1, 8, var3);
         this.method_6208(var1, class_1192.field_6093, var5, 4, 2, 9, var3);
         this.method_6208(var1, class_1192.field_6093, var5, 4, 3, 10, var3);
         this.method_6208(var1, class_1192.field_6093, var5, 7, 1, 8, var3);
         this.method_6208(var1, class_1192.field_6093, var5, 7, 2, 9, var3);
         this.method_6208(var1, class_1192.field_6093, var5, 7, 3, 10, var3);
         this.method_6213(var1, var3, 4, 1, 9, 4, 1, 9, false, var2, field_5771);
         this.method_6213(var1, var3, 7, 1, 9, 7, 1, 9, false, var2, field_5771);
         this.method_6213(var1, var3, 4, 1, 10, 7, 2, 10, false, var2, field_5771);
         this.method_6213(var1, var3, 5, 4, 5, 6, 4, 5, false, var2, field_5771);
         this.method_6208(var1, class_1192.field_6093, var7, 4, 4, 5, var3);
         this.method_6208(var1, class_1192.field_6093, var8, 7, 4, 5, var3);
         var11 = 0;
         break;
      }

      var9 = var11;

      while(true) {
         if(var9 < 4) {
            this.method_6208(var1, class_1192.field_6093, var6, 5, 0 - var9, 6 + var9, var3);
            this.method_6208(var1, class_1192.field_6093, var6, 6, 0 - var9, 6 + var9, var3);
            this.method_6210(var1, var3, 5, 0 - var9, 7 + var9, 6, 0 - var9, 9 + var9);
            ++var9;
            if(var4 == null) {
               break;
            }

            if(var4 != null) {
               continue;
            }
         }

         this.method_6210(var1, var3, 1, -3, 12, 10, -1, 13);
         this.method_6210(var1, var3, 1, -3, 1, 3, -1, 13);
         this.method_6210(var1, var3, 1, -3, 1, 9, -1, 5);
         break;
      }

      var9 = 1;

      while(true) {
         if(var9 <= 13) {
            this.method_6213(var1, var3, 1, -3, var9, 1, -2, var9, false, var2, field_5771);
            var9 += 2;
            if(var4 == null) {
               break;
            }

            if(var4 != null) {
               continue;
            }
         }

         var9 = 2;
         break;
      }

      while(true) {
         if(var9 <= 12) {
            this.method_6213(var1, var3, 1, -1, var9, 3, -1, var9, false, var2, field_5771);
            var9 += 2;
            if(var4 == null) {
               break;
            }

            if(var4 != null) {
               continue;
            }
         }

         this.method_6213(var1, var3, 2, -2, 1, 5, -2, 1, false, var2, field_5771);
         this.method_6213(var1, var3, 7, -2, 1, 9, -2, 1, false, var2, field_5771);
         this.method_6213(var1, var3, 6, -3, 1, 6, -3, 1, false, var2, field_5771);
         this.method_6213(var1, var3, 6, -1, 1, 6, -1, 1, false, var2, field_5771);
         this.method_6208(var1, class_1192.field_6155, this.method_6207(class_1192.field_6155, 3) | 4, 1, -3, 8, var3);
         this.method_6208(var1, class_1192.field_6155, this.method_6207(class_1192.field_6155, 1) | 4, 4, -3, 8, var3);
         this.method_6208(var1, class_1192.field_6156, 4, 2, -3, 8, var3);
         this.method_6208(var1, class_1192.field_6156, 4, 3, -3, 8, var3);
         this.method_6208(var1, class_1192.field_6082, 0, 5, -3, 7, var3);
         this.method_6208(var1, class_1192.field_6082, 0, 5, -3, 6, var3);
         this.method_6208(var1, class_1192.field_6082, 0, 5, -3, 5, var3);
         this.method_6208(var1, class_1192.field_6082, 0, 5, -3, 4, var3);
         this.method_6208(var1, class_1192.field_6082, 0, 5, -3, 3, var3);
         this.method_6208(var1, class_1192.field_6082, 0, 5, -3, 2, var3);
         this.method_6208(var1, class_1192.field_6082, 0, 5, -3, 1, var3);
         this.method_6208(var1, class_1192.field_6082, 0, 4, -3, 1, var3);
         this.method_6208(var1, class_1192.field_6075, 0, 3, -3, 1, var3);
         break;
      }

      boolean var12 = this.field_5767;
      if(var4 != null) {
         if(!this.field_5767) {
            this.field_5767 = this.method_6220(var1, var3, var2, 3, -2, 1, 2, field_5770, 2);
         }

         this.method_6208(var1, class_1192.field_6131, 15, 3, -2, 2, var3);
         this.method_6208(var1, class_1192.field_6155, this.method_6207(class_1192.field_6155, 2) | 4, 7, -3, 1, var3);
         this.method_6208(var1, class_1192.field_6155, this.method_6207(class_1192.field_6155, 0) | 4, 7, -3, 5, var3);
         this.method_6208(var1, class_1192.field_6156, 4, 7, -3, 2, var3);
         this.method_6208(var1, class_1192.field_6156, 4, 7, -3, 3, var3);
         this.method_6208(var1, class_1192.field_6156, 4, 7, -3, 4, var3);
         this.method_6208(var1, class_1192.field_6082, 0, 8, -3, 6, var3);
         this.method_6208(var1, class_1192.field_6082, 0, 9, -3, 6, var3);
         this.method_6208(var1, class_1192.field_6082, 0, 9, -3, 5, var3);
         this.method_6208(var1, class_1192.field_6075, 0, 9, -3, 4, var3);
         this.method_6208(var1, class_1192.field_6082, 0, 9, -2, 4, var3);
         var12 = this.field_5768;
      }

      if(var4 != null) {
         if(!var12) {
            this.field_5768 = this.method_6220(var1, var3, var2, 9, -2, 3, 4, field_5770, 2);
         }

         this.method_6208(var1, class_1192.field_6131, 15, 8, -1, 3, var3);
         this.method_6208(var1, class_1192.field_6131, 15, 8, -2, 3, var3);
         var12 = this.field_5765;
      }

      if(var4 != null) {
         if(!var12) {
            this.field_5765 = this.method_6219(var1, var3, var2, 8, -3, 3, class_1652.method_9098(field_5769, new class_1652[]{class_1010.field_5259.getBlock06(var2)}), 2 + var2.nextInt(5));
         }

         this.method_6208(var1, class_1192.field_6075, 0, 9, -3, 2, var3);
         this.method_6208(var1, class_1192.field_6075, 0, 8, -3, 1, var3);
         this.method_6208(var1, class_1192.field_6075, 0, 4, -3, 5, var3);
         this.method_6208(var1, class_1192.field_6075, 0, 5, -2, 5, var3);
         this.method_6208(var1, class_1192.field_6075, 0, 5, -1, 5, var3);
         this.method_6208(var1, class_1192.field_6075, 0, 6, -3, 5, var3);
         this.method_6208(var1, class_1192.field_6075, 0, 7, -2, 5, var3);
         this.method_6208(var1, class_1192.field_6075, 0, 7, -1, 5, var3);
         this.method_6208(var1, class_1192.field_6075, 0, 8, -3, 5, var3);
         this.method_6213(var1, var3, 9, -1, 1, 9, -1, 5, false, var2, field_5771);
         this.method_6210(var1, var3, 8, -3, 8, 10, -1, 10);
         this.method_6208(var1, class_1192.field_6123, 3, 8, -2, 11, var3);
         this.method_6208(var1, class_1192.field_6123, 3, 9, -2, 11, var3);
         this.method_6208(var1, class_1192.field_6123, 3, 10, -2, 11, var3);
         this.method_6208(var1, class_1192.field_6095, class_369.method_2570(this.method_6207(class_1192.field_6095, 2)), 8, -2, 12, var3);
         this.method_6208(var1, class_1192.field_6095, class_369.method_2570(this.method_6207(class_1192.field_6095, 2)), 9, -2, 12, var3);
         this.method_6208(var1, class_1192.field_6095, class_369.method_2570(this.method_6207(class_1192.field_6095, 2)), 10, -2, 12, var3);
         this.method_6213(var1, var3, 8, -3, 8, 8, -3, 10, false, var2, field_5771);
         this.method_6213(var1, var3, 10, -3, 8, 10, -3, 10, false, var2, field_5771);
         this.method_6208(var1, class_1192.field_6075, 0, 10, -2, 9, var3);
         this.method_6208(var1, class_1192.field_6082, 0, 8, -2, 9, var3);
         this.method_6208(var1, class_1192.field_6082, 0, 8, -2, 10, var3);
         this.method_6208(var1, class_1192.field_6082, 0, 10, -1, 9, var3);
         this.method_6208(var1, class_1192.field_6056, 1, 9, -2, 8, var3);
         this.method_6208(var1, class_1192.field_6056, this.method_6207(class_1192.field_6056, 4), 10, -2, 8, var3);
         this.method_6208(var1, class_1192.field_6056, this.method_6207(class_1192.field_6056, 4), 10, -1, 8, var3);
         this.method_6208(var1, class_1192.field_6119, this.method_6207(class_1192.field_6119, 2), 10, -2, 10, var3);
         var12 = this.field_5766;
      }

      if(var4 != null) {
         if(!var12) {
            this.field_5766 = this.method_6219(var1, var3, var2, 9, -3, 10, class_1652.method_9098(field_5769, new class_1652[]{class_1010.field_5259.getBlock06(var2)}), 2 + var2.nextInt(5));
         }

         var12 = true;
      }

      return var12;
   }

   // $FF: renamed from: <clinit> () void
   static void method_6222() {
      // $FF: Couldn't be decompiled
   }
}
