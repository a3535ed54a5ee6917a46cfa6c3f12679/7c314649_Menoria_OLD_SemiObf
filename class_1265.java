
// $FF: renamed from: jm
public abstract class class_1265 {

   // $FF: renamed from: a long
   private long field_6572;
   // $FF: renamed from: b jm
   protected class_1265 field_6573;
   // $FF: renamed from: c long
   private long field_6574;
   // $FF: renamed from: d long
   protected long field_6575;
   // $FF: renamed from: e java.lang.String
   private static final String field_6576;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_6577;


   // $FF: renamed from: b (long, du) jm[]
   public static class_1265[] method_6674(long var0, class_1046 var2) {
      byte var4 = 0;
      class_1271 var10000 = new class_1271;
      var10000.method_6675(1L);
      class_1271 var5 = var10000;
      class_1280 var28 = new class_1280;
      var28.method_6705(2000L, var5);
      class_1280 var6 = var28;
      class_1276 var29 = new class_1276;
      var29.method_6699(1L, var6);
      class_1276 var7 = var29;
      class_1279 var30 = new class_1279;
      var30.method_6705(2001L, var7);
      class_1279 var8 = var30;
      var29 = new class_1276;
      var29.method_6699(2L, var8);
      var7 = var29;
      var29 = new class_1276;
      var29.method_6699(50L, var7);
      var7 = var29;
      var29 = new class_1276;
      var29.method_6699(70L, var7);
      var7 = var29;
      class_1268 var31 = new class_1268;
      var31.method_6689(2L, var7);
      class_1268 var9 = var31;
      class_1274 var32 = new class_1274;
      var32.method_6697(2L, var9);
      class_1274 var10 = var32;
      var29 = new class_1276;
      var29.method_6699(3L, var10);
      var7 = var29;
      class_1277 var33 = new class_1277;
      var33.method_6700(2L, var7, class_99.field_78);
      class_1277 var11 = var33;
      String[] var34 = class_752.method_4253();
      class_1277 var10001 = new class_1277;
      var10001.method_6700(2L, var11, class_99.field_79);
      var11 = var10001;
      var10001 = new class_1277;
      var10001.method_6700(3L, var11, class_99.field_80);
      var11 = var10001;
      String[] var3 = var34;
      var30 = new class_1279;
      var30.method_6705(2002L, var11);
      var8 = var30;
      var30 = new class_1279;
      var30.method_6705(2003L, var8);
      var8 = var30;
      var29 = new class_1276;
      var29.method_6699(4L, var8);
      var7 = var29;
      class_1275 var35 = new class_1275;
      var35.method_6698(5L, var7);
      class_1275 var12 = var35;
      class_1278 var36 = new class_1278;
      var36.method_6704(4L, var12);
      class_1278 var13 = var36;
      class_1265 var14 = class_1279.method_6706(1000L, var13, 0);
      byte var15 = 4;
      if(var2 == class_1046.field_5529) {
         var15 = 6;
      }

      label59: {
         byte var37;
         label58: {
            try {
               var37 = var4;
               if(var3 == null) {
                  break label58;
               }

               if(var4 == 0) {
                  break label59;
               }
            } catch (class_643 var27) {
               throw method_6684(var27);
            }

            var37 = 4;
         }

         var15 = var37;
      }

      class_1265 var16 = class_1279.method_6706(1000L, var14, 0);
      class_1267 var38 = new class_1267;
      var38.method_6688(100L, var16);
      class_1267 var17 = var38;
      class_1272 var39 = new class_1272;
      var39.method_6692(200L, var14, var2);
      Object var18 = var39;
      class_1265 var19;
      if(var4 == 0) {
         var19 = class_1279.method_6706(1000L, (class_1265)var18, 2);
         class_1273 var40 = new class_1273;
         var40.method_6693(1000L, var19);
         var18 = var40;
      }

      var19 = class_1279.method_6706(1000L, var17, 2);
      class_1269 var41 = new class_1269;
      var41.method_6690(1000L, (class_1265)var18, var19);
      class_1269 var20 = var41;
      var16 = class_1279.method_6706(1000L, var17, 2);
      var16 = class_1279.method_6706(1000L, var16, var15);
      class_1266 var43 = new class_1266;
      var43.method_6686(1L, var16);
      class_1266 var21 = var43;
      class_1282 var44 = new class_1282;
      var44.method_6708(1000L, var21);
      class_1282 var22 = var44;
      class_1270 var45 = new class_1270;
      var45.method_6691(1001L, var20);
      var18 = var45;
      int var23 = 0;

      while(var23 < var15) {
         var30 = new class_1279;
         var30.method_6705((long)(1000 + var23), (class_1265)var18);
         var18 = var30;

         int var46;
         label46: {
            label45: {
               try {
                  var46 = var23;
                  if(var3 == null) {
                     break label46;
                  }

                  if(var23 != 0) {
                     break label45;
                  }
               } catch (class_643 var26) {
                  throw method_6684(var26);
               }

               var29 = new class_1276;
               var29.method_6699(3L, (class_1265)var18);
               var18 = var29;
            }

            var46 = var23;
         }

         if(var46 == 1) {
            class_1283 var47 = new class_1283;
            var47.method_6709(1000L, (class_1265)var18);
            var18 = var47;
         }

         ++var23;
         if(var3 == null) {
            break;
         }
      }

      var44 = new class_1282;
      var44.method_6708(1000L, (class_1265)var18);
      class_1282 var42 = var44;
      class_1284 var48 = new class_1284;
      var48.method_6713(100L, var42, var22);
      class_1284 var24 = var48;
      class_1281 var49 = new class_1281;
      var49.method_6707(10L, var24);
      class_1281 var25 = var49;
      var24.method_6676(var0);
      var25.method_6676(var0);
      return new class_1265[]{var24, var25, var24};
   }

   // $FF: renamed from: <init> (long) void
   public void method_6675(long var1) {
      super();
      this.field_6575 = var1;
      this.field_6575 *= this.field_6575 * 6364136223846793005L + 1442695040888963407L;
      this.field_6575 += var1;
      this.field_6575 *= this.field_6575 * 6364136223846793005L + 1442695040888963407L;
      this.field_6575 += var1;
      this.field_6575 *= this.field_6575 * 6364136223846793005L + 1442695040888963407L;
      this.field_6575 += var1;
   }

   // $FF: renamed from: b (long) void
   public void method_6676(long param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (long, long) void
   public void method_6677(long var1, long var3) {
      this.field_6574 = this.field_6572;
      this.field_6574 *= this.field_6574 * 6364136223846793005L + 1442695040888963407L;
      this.field_6574 += var1;
      this.field_6574 *= this.field_6574 * 6364136223846793005L + 1442695040888963407L;
      this.field_6574 += var3;
      this.field_6574 *= this.field_6574 * 6364136223846793005L + 1442695040888963407L;
      this.field_6574 += var1;
      this.field_6574 *= this.field_6574 * 6364136223846793005L + 1442695040888963407L;
      this.field_6574 += var3;
   }

   // $FF: renamed from: b (int) int
   protected int method_6678(int var1) {
      int var3 = (int)((this.field_6574 >> 24) % (long)var1);
      String[] var2 = class_752.method_4253();

      int var10000;
      label20: {
         try {
            var10000 = var3;
            if(var2 == null) {
               return var10000;
            }

            if(var3 >= 0) {
               break label20;
            }
         } catch (class_643 var4) {
            throw method_6684(var4);
         }

         var3 += var1;
      }

      this.field_6574 *= this.field_6574 * 6364136223846793005L + 1442695040888963407L;
      this.field_6574 += this.field_6572;
      var10000 = var3;
      return var10000;
   }

   // $FF: renamed from: b (int, int, int, int) int[]
   public abstract int[] method_6679(int var1, int var2, int var3, int var4);

   // $FF: renamed from: b (int, int) boolean
   protected static boolean method_6680(int param0, int param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: c (int) boolean
   protected static boolean method_6681(int param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (int[]) int
   protected int method_6682(int ... var1) {
      return var1[this.method_6678(var1.length)];
   }

   // $FF: renamed from: c (int, int, int, int) int
   protected int method_6683(int param1, int param2, int param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.Throwable) java.lang.Throwable
   private static Throwable method_6684(Throwable var0) {
      return var0;
   }

   // $FF: renamed from: <clinit> () void
   static void method_6685() {
      // $FF: Couldn't be decompiled
   }
}
