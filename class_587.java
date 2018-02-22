
// $FF: renamed from: gt
public class class_587 extends class_580 {

   // $FF: renamed from: m float
   public float field_2497;
   // $FF: renamed from: n float
   public float field_2498;
   // $FF: renamed from: o int
   public int field_2499;
   // $FF: renamed from: p int
   private int field_2500;
   // $FF: renamed from: q java.lang.String[]
   private static final String[] field_2501;


   // $FF: renamed from: <init> () void
   public void getBlock88() {
      super.getBlock88();
   }

   // $FF: renamed from: g () void
   public void getBlock94() {
      super.getBlock94();
      String[] var1 = class_752.method_4253();
      class_587 var10000 = this;
      class_587 var10001 = this;
      if(var1 != null) {
         if(++this.field_2500 % 20 * 4 == 0) {
            this.field_2464.method_2193(this.field_2465, this.field_2466, this.field_2467, class_1192.field_6154, 1, this.field_2499);
         }

         var10000 = this;
         var10001 = this;
      }

      var10000.field_2498 = var10001.field_2497;
      float var2 = 0.1F;
      int var11 = this.field_2499;
      double var5;
      double var10002;
      if(var1 != null) {
         label99: {
            if(this.field_2499 > 0) {
               float var13;
               var11 = (var13 = this.field_2497 - 0.0F) == 0.0F?0:(var13 < 0.0F?-1:1);
               if(var1 == null) {
                  break label99;
               }

               if(var11 == 0) {
                  double var3 = (double)this.field_2465 + 0.5D;
                  var5 = (double)this.field_2467 + 0.5D;
                  var10002 = (double)this.field_2466 + 0.5D;
                  String[] var9 = field_2501;
                  this.field_2464.method_2084(var3, var10002, var5, "random.chestopen", 0.5F, this.field_2464.field_1819.nextFloat() * 0.1F + 0.9F);
               }
            }

            var11 = this.field_2499;
         }
      }

      float var12;
      label92: {
         label105: {
            if(var1 != null) {
               if(var11 == 0) {
                  var12 = this.field_2497;
                  if(var1 == null) {
                     break label92;
                  }

                  if(this.field_2497 > 0.0F) {
                     break label105;
                  }
               }

               var11 = this.field_2499;
            }

            if(var1 != null) {
               if(var11 <= 0) {
                  return;
               }

               var12 = this.field_2497;
               if(var1 == null) {
                  break label92;
               }

               float var14;
               var11 = (var14 = this.field_2497 - 1.0F) == 0.0F?0:(var14 < 0.0F?-1:1);
            }

            if(var11 >= 0) {
               return;
            }
         }

         var12 = this.field_2497;
      }

      float var10;
      label73: {
         var10 = var12;
         var10000 = this;
         if(var1 != null) {
            if(this.field_2499 > 0) {
               this.field_2497 += var2;
               if(var1 != null) {
                  break label73;
               }
            }

            var10000 = this;
         }

         var10000.field_2497 -= var2;
      }

      var12 = this.field_2497;
      if(var1 != null) {
         if(this.field_2497 > 1.0F) {
            this.field_2497 = 1.0F;
         }

         var12 = 0.5F;
      }

      label107: {
         float var4 = var12;
         float var15;
         var11 = (var15 = this.field_2497 - var4) == 0.0F?0:(var15 < 0.0F?-1:1);
         if(var1 != null) {
            label108: {
               if(var11 < 0) {
                  float var16;
                  var11 = (var16 = var10 - var4) == 0.0F?0:(var16 < 0.0F?-1:1);
                  if(var1 == null) {
                     break label108;
                  }

                  if(var11 >= 0) {
                     var5 = (double)this.field_2465 + 0.5D;
                     double var7 = (double)this.field_2467 + 0.5D;
                     var10002 = (double)this.field_2466 + 0.5D;
                     String[] var10004 = field_2501;
                     this.field_2464.method_2084(var5, var10002, var7, "random.chestclosed", 0.5F, this.field_2464.field_1819.nextFloat() * 0.1F + 0.9F);
                  }
               }

               var10000 = this;
               if(var1 == null) {
                  break label107;
               }

               float var17;
               var11 = (var17 = this.field_2497 - 0.0F) == 0.0F?0:(var17 < 0.0F?-1:1);
            }
         }

         if(var11 >= 0) {
            return;
         }

         var10000 = this;
      }

      var10000.field_2497 = 0.0F;
   }

   // $FF: renamed from: a (int, int) boolean
   public boolean method_3104(int var1, int var2) {
      String[] var3 = class_752.method_4253();
      int var10000 = var1;
      if(var3 != null) {
         if(var1 == 1) {
            this.field_2499 = var2;
            return true;
         }

         var10000 = super.method_3104(var1, var2);
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: t () void
   public void method_3102() {
      this.method_3105();
      super.method_3102();
   }

   // $FF: renamed from: b () void
   public void method_3149() {
      ++this.field_2499;
      this.field_2464.method_2193(this.field_2465, this.field_2466, this.field_2467, class_1192.field_6154, 1, this.field_2499);
   }

   // $FF: renamed from: d () void
   public void method_3150() {
      --this.field_2499;
      this.field_2464.method_2193(this.field_2465, this.field_2466, this.field_2467, class_1192.field_6154, 1, this.field_2499);
   }

   // $FF: renamed from: b (yz) boolean
   public boolean method_3151(class_792 var1) {
      String[] var2 = class_752.method_4253();
      if(this.field_2464.method_31(this.field_2465, this.field_2466, this.field_2467) != this) {
         return false;
      } else {
         double var3;
         int var10000 = (var3 = var1.method_3889((double)this.field_2465 + 0.5D, (double)this.field_2466 + 0.5D, (double)this.field_2467 + 0.5D) - 64.0D) == 0.0D?0:(var3 < 0.0D?-1:1);
         if(var2 != null) {
            if(var10000 > 0) {
               return false;
            }

            var10000 = 1;
         }

         return (boolean)var10000;
      }
   }

   // $FF: renamed from: <clinit> () void
   static void method_3108() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "ùû¨ê¡Õèò£ñ£îôùû¨ê¡Õèò£ñ¯äé£";
      int var4 = "ùû¨ê¡Õèò£ñ£îôùû¨ê¡Õèò£ñ¯äé£".length();
      char var1 = 16;
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
            char[] var10 = var8;
            var8 = var10003;
            if(var10003 <= var6) {
               var5[var3++] = (new String((char[])var9)).intern();
               if((var0 += var1) >= var4) {
                  field_2501 = var5;
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 185;
               break;
            case 1:
               var10009 = 168;
               break;
            case 2:
               var10009 = 244;
               break;
            case 3:
               var10009 = 206;
               break;
            case 4:
               var10009 = 183;
               break;
            case 5:
               var10009 = 254;
               break;
            default:
               var10009 = 201;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var10 ^ var10009);
            ++var6;
         }
      }
   }
}
