import java.util.Random;

// $FF: renamed from: wZ
public class class_763 extends class_762 {

   // $FF: renamed from: bA float
   public float field_3442;
   // $FF: renamed from: bB float
   public float field_3443;
   // $FF: renamed from: bC float
   public float field_3444;
   // $FF: renamed from: bD float
   public float field_3445;
   // $FF: renamed from: bE float
   public float field_3446;
   // $FF: renamed from: bF float
   public float field_3447;
   // $FF: renamed from: bG float
   public float field_3448;
   // $FF: renamed from: bH float
   public float field_3449;
   // $FF: renamed from: bI float
   private float field_3450;
   // $FF: renamed from: bJ float
   private float field_3451;
   // $FF: renamed from: bK float
   private float field_3452;
   // $FF: renamed from: bL float
   private float field_3453;
   // $FF: renamed from: bM float
   private float field_3454;
   // $FF: renamed from: bN float
   private float field_3455;
   // $FF: renamed from: bO java.lang.String
   private static final String field_3456 = "CL_00001651";


   // $FF: renamed from: <init> (ahb) void
   public void method_3847(ahb var1) {
      super.method_3847(var1);
      this.method_3852(0.95F, 0.95F);
      this.field_3451 = 1.0F / (this.field_3028.nextFloat() + 1.0F) * 0.2F;
   }

   // $FF: renamed from: aD () void
   protected void method_4157() {
      super.method_4157();
      this.method_4211(class_1840.field_9390).method_390(10.0D);
   }

   // $FF: renamed from: t () java.lang.String
   protected String method_4266() {
      return null;
   }

   // $FF: renamed from: aT () java.lang.String
   protected String method_4193() {
      return null;
   }

   // $FF: renamed from: aU () java.lang.String
   protected String method_4194() {
      return null;
   }

   // $FF: renamed from: bf () float
   protected float method_4216() {
      return 0.4F;
   }

   // $FF: renamed from: u () adb
   protected adb method_4267() {
      return adb.method_2919(0);
   }

   // $FF: renamed from: g_ () boolean
   protected boolean method_3869() {
      return false;
   }

   // $FF: renamed from: b (boolean, int) void
   protected void method_4196(boolean var1, int var2) {
      int var4 = this.field_3028.nextInt(3 + var2) + 1;
      String[] var10000 = class_752.method_4253();
      int var5 = 0;
      String[] var3 = var10000;

      while(var5 < var4) {
         add var10001 = new add;
         var10001.method_3726(class_1010.field_5208, 1, 0);
         this.method_3916(var10001, 0.0F);
         ++var5;
         if(var3 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: M () boolean
   public boolean method_3876() {
      return this.field_2990.method_2122(this.field_3004.method_7097(0.0D, -0.6000000238418579D, 0.0D), awt.field_4177, this);
   }

   // $FF: renamed from: e () void
   public void method_4231() {
      super.method_4231();
      this.field_3443 = this.field_3442;
      this.field_3445 = this.field_3444;
      this.field_3447 = this.field_3446;
      this.field_3449 = this.field_3448;
      String[] var10000 = class_752.method_4253();
      this.field_3446 += this.field_3451;
      String[] var1 = var10000;
      float var5;
      int var3 = (var5 = this.field_3446 - 6.2831855F) == 0.0F?0:(var5 < 0.0F?-1:1);
      if(var1 != null) {
         label67: {
            if(var3 > 0) {
               this.field_3446 -= 6.2831855F;
               var3 = this.field_3028.nextInt(10);
               if(var1 == null) {
                  break label67;
               }

               if(var3 == 0) {
                  this.field_3451 = 1.0F / (this.field_3028.nextFloat() + 1.0F) * 0.2F;
               }
            }

            var3 = this.method_3876();
         }
      }

      class_763 var4;
      label71: {
         if(var1 != null) {
            if(var3 != 0) {
               float var2;
               label49: {
                  var4 = this;
                  if(var1 != null) {
                     if(this.field_3446 < 3.1415927F) {
                        var2 = this.field_3446 / 3.1415927F;
                        this.field_3448 = class_1715.method_9555(var2 * var2 * 3.1415927F) * 3.1415927F * 0.25F;
                        if(var1 != null) {
                           if((double)var2 > 0.75D) {
                              this.field_3450 = 1.0F;
                              this.field_3452 = 1.0F;
                              if(var1 != null) {
                                 break label49;
                              }
                           }

                           this.field_3452 *= 0.8F;
                        }

                        if(var1 != null) {
                           break label49;
                        }
                     }

                     this.field_3448 = 0.0F;
                     this.field_3450 *= 0.9F;
                     var4 = this;
                  }

                  var4.field_3452 *= 0.99F;
               }

               var4 = this;
               if(var1 != null) {
                  if(!this.field_2990.field_1832) {
                     this.field_2997 = (double)(this.field_3453 * this.field_3450);
                     this.field_2998 = (double)(this.field_3454 * this.field_3450);
                     this.field_2999 = (double)(this.field_3455 * this.field_3450);
                  }

                  var4 = this;
               }

               var2 = class_1715.method_9558(var4.field_2997 * this.field_2997 + this.field_2999 * this.field_2999);
               this.field_3330 += (-((float)Math.atan2(this.field_2997, this.field_2999)) * 180.0F / 3.1415927F - this.field_3330) * 0.1F;
               this.field_3000 = this.field_3330;
               this.field_3444 += 3.1415927F * this.field_3452 * 1.5F;
               this.field_3442 += (-((float)Math.atan2((double)var2, this.field_2998)) * 180.0F / 3.1415927F - this.field_3442) * 0.1F;
               if(var1 != null) {
                  return;
               }
            }

            this.field_3448 = class_1715.method_9564(class_1715.method_9555(this.field_3446)) * 3.1415927F * 0.25F;
            var4 = this;
            if(var1 == null) {
               break label71;
            }

            var3 = this.field_2990.field_1832;
         }

         if(var3 == 0) {
            this.field_2997 = 0.0D;
            this.field_2998 -= 0.08D;
            this.field_2998 *= 0.9800000190734863D;
            this.field_2999 = 0.0D;
         }

         var4 = this;
      }

      var4.field_3442 = (float)((double)this.field_3442 + (double)(-90.0F - this.field_3442) * 0.02D);
   }

   // $FF: renamed from: e (float, float) void
   public void method_4224(float var1, float var2) {
      this.method_3864(this.field_2997, this.field_2998, this.field_2999);
   }

   // $FF: renamed from: bq () void
   protected void method_4236() {
      class_763 var4;
      label52: {
         label51: {
            Random var3;
            label54: {
               ++this.field_3338;
               String[] var1 = class_752.method_4253();
               int var10000 = this.field_3338;
               if(var1 != null) {
                  if(this.field_3338 > 100) {
                     this.field_3453 = this.field_3454 = this.field_3455 = 0.0F;
                     if(var1 != null) {
                        break label51;
                     }
                  }

                  var3 = this.field_3028;
                  if(var1 == null) {
                     break label54;
                  }

                  var10000 = this.field_3028.nextInt(50);
               }

               label43: {
                  if(var10000 != 0) {
                     var4 = this;
                     if(var1 == null) {
                        break label43;
                     }

                     if(this.field_3032) {
                        var4 = this;
                        if(var1 == null) {
                           break label52;
                        }

                        if(this.field_3453 != 0.0F) {
                           break label51;
                        }

                        var4 = this;
                        if(var1 == null) {
                           break label52;
                        }

                        if(this.field_3454 != 0.0F) {
                           break label51;
                        }

                        var4 = this;
                        if(var1 == null) {
                           break label52;
                        }

                        if(this.field_3455 != 0.0F) {
                           break label51;
                        }
                     }
                  }

                  var4 = this;
               }

               var3 = var4.field_3028;
            }

            float var2 = var3.nextFloat() * 3.1415927F * 2.0F;
            this.field_3453 = class_1715.method_9556(var2) * 0.2F;
            this.field_3454 = -0.1F + this.field_3028.nextFloat() * 0.2F;
            this.field_3455 = class_1715.method_9555(var2) * 0.2F;
         }

         var4 = this;
      }

      var4.method_4270();
   }

   // $FF: renamed from: by () boolean
   public boolean method_4274() {
      int var10000;
      label32: {
         String[] var1 = class_752.method_4253();
         double var2;
         var10000 = (var2 = this.field_2995 - 45.0D) == 0.0D?0:(var2 < 0.0D?-1:1);
         if(var1 != null) {
            if(var10000 <= 0) {
               break label32;
            }

            double var3;
            var10000 = (var3 = this.field_2995 - 63.0D) == 0.0D?0:(var3 < 0.0D?-1:1);
         }

         if(var1 != null) {
            if(var10000 >= 0) {
               break label32;
            }

            var10000 = super.method_4274();
         }

         if(var1 == null) {
            return (boolean)var10000;
         }

         if(var10000 != 0) {
            var10000 = 1;
            return (boolean)var10000;
         }
      }

      var10000 = 0;
      return (boolean)var10000;
   }

   // $FF: renamed from: <clinit> () void
   static void method_4345() {
      boolean var10000 = true;
      char[] var10003 = "Ñ(ËèV,Ü£R¡é".toCharArray();
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
            field_3456 = (new String((char[])var4)).intern();
            String var2 = field_3456;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 149;
            break;
         case 1:
            var10009 = 99;
            break;
         case 2:
            var10009 = 147;
            break;
         case 3:
            var10009 = 223;
            break;
         case 4:
            var10009 = 97;
            break;
         case 5:
            var10009 = 27;
            break;
         default:
            var10009 = 235;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
