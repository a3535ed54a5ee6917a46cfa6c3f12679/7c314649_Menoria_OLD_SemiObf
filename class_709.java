
// $FF: renamed from: xG
public class class_709 extends class_708 {

   // $FF: renamed from: eb java.lang.String
   private static final String field_3176 = "mobGriefing";


   // $FF: renamed from: <init> (ahb) void
   public void method_3847(ahb var1) {
      super.method_3847(var1);
      this.method_3852(0.3125F, 0.3125F);
   }

   // $FF: renamed from: <init> (ahb, sv, double, double, double) void
   public void method_4065(ahb var1, class_752 var2, double var3, double var5, double var7) {
      super.method_4065(var1, var2, var3, var5, var7);
      this.method_3852(0.3125F, 0.3125F);
   }

   // $FF: renamed from: a () float
   protected float method_4066() {
      String[] var1 = class_752.method_4253();
      class_709 var10000 = this;
      float var2;
      if(var1 != null) {
         if(this.method_4069()) {
            var2 = 0.73F;
            return var2;
         }

         var10000 = this;
      }

      var2 = var10000.method_4066();
      return var2;
   }

   // $FF: renamed from: <init> (ahb, double, double, double, double, double, double) void
   public void method_4064(ahb var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super.method_4064(var1, var2, var4, var6, var8, var10, var12);
      this.method_3852(0.3125F, 0.3125F);
   }

   // $FF: renamed from: al () boolean
   public boolean method_3936() {
      return false;
   }

   // $FF: renamed from: a (df, ahb, int, int, int, aji) float
   public float method_3965(class_1036 var1, ahb var2, int var3, int var4, int var5, aji var6) {
      float var8 = super.method_3965(var1, var2, var3, var4, var5, var6);
      String[] var7 = class_752.method_4253();
      if(this.method_4069()) {
         aji var10000 = var6;
         aji var10001 = class_1192.field_6032;
         if(var7 != null) {
            if(var6 == class_1192.field_6032) {
               return var8;
            }

            var10000 = var6;
            var10001 = class_1192.field_6143;
         }

         if(var7 != null) {
            if(var10000 == var10001) {
               return var8;
            }

            var10000 = var6;
            var10001 = class_1192.field_6144;
         }

         if(var7 != null) {
            if(var10000 == var10001) {
               return var8;
            }

            var10000 = var6;
            var10001 = class_1192.field_6161;
         }

         if(var10000 != var10001) {
            var8 = Math.min(0.8F, var8);
         }
      }

      return var8;
   }

   // $FF: renamed from: b (azu) void
   protected void method_4067(azu var1) {
      String[] var2 = class_752.method_4253();
      Object var10000 = this;
      if(var2 != null) {
         if(this.field_2990.field_1832) {
            return;
         }

         var10000 = var1.field_4218;
      }

      if(var10000 != null) {
         label71: {
            byte var5;
            label60: {
               label59: {
                  var10000 = this.field_3168;
                  if(var2 != null) {
                     if(this.field_3168 != null) {
                        var5 = var1.field_4218.method_3896(class_1691.method_9324(this.field_3168), 8.0F);
                        if(var2 == null) {
                           break label60;
                        }

                        if(var5 == 0) {
                           break label59;
                        }

                        var5 = var1.field_4218.method_3917();
                        if(var2 == null) {
                           break label60;
                        }

                        if(var5 != 0) {
                           break label59;
                        }

                        this.field_3168.method_4187(5.0F);
                        if(var2 != null) {
                           break label59;
                        }
                     }

                     var10000 = var1.field_4218;
                  }

                  ((class_689)var10000).method_3896(class_1691.field_8840, 5.0F);
               }

               var5 = var1.field_4218 instanceof class_752;
            }

            if(var2 != null) {
               if(var5 == 0) {
                  break label71;
               }

               var5 = 0;
            }

            byte var3;
            label38: {
               var3 = var5;
               class_918 var7 = this.field_2990.field_1818;
               class_918 var10001 = class_918.field_4629;
               if(var2 != null) {
                  if(this.field_2990.field_1818 == class_918.field_4629) {
                     var3 = 10;
                     if(var2 != null) {
                        break label38;
                     }
                  }

                  var7 = this.field_2990.field_1818;
                  var10001 = class_918.field_4630;
               }

               if(var7 == var10001) {
                  var3 = 40;
               }
            }

            if(var3 > 0) {
               class_752 var4 = (class_752)var1.field_4218;
               class_1645 var6 = new class_1645;
               var6.method_9012(class_1635.field_8510.field_8526, 20 * var3, 1);
               var4.method_4179(var6);
            }
         }
      }

      this.field_2990.method_2126(this, this.field_2994, this.field_2995, this.field_2996, 1.0F, false, this.field_2990.method_2196().method_5878("mobGriefing"));
      this.method_3851();
   }

   // $FF: renamed from: R () boolean
   public boolean method_3897() {
      return false;
   }

   // $FF: renamed from: a (vX, float) boolean
   public boolean method_3896(class_1691 var1, float var2) {
      return false;
   }

   // $FF: renamed from: c () void
   protected void method_3848() {
      this.field_3036.method_9497(10, Byte.valueOf((byte)0));
   }

   // $FF: renamed from: b () boolean
   public boolean method_4069() {
      String[] var1 = class_752.method_4253();
      int var10000 = this.field_3036.method_9499(10);
      if(var1 != null) {
         var10000 = var10000 == 1?1:0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: f (boolean) void
   public void method_4070(boolean var1) {
      String[] var2 = class_752.method_4253();
      int var10002 = var1;
      if(var2 != null) {
         var10002 = var1 != 0?1:0;
      }

      this.field_3036.method_9506(10, Byte.valueOf((byte)var10002));
   }

   // $FF: renamed from: <clinit> () void
   static void method_4068() {
      boolean var10000 = true;
      char[] var10003 = "úí¼Akõñë°a".toCharArray();
      Object var10004 = var10003.length;
      Object var3 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var0 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var4 = var10002;
         var10002 = var10003;
         if(var10003 <= var0) {
            field_3176 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 112;
            break;
         case 1:
            var10009 = 101;
            break;
         case 2:
            var10009 = 57;
            break;
         case 3:
            var10009 = 225;
            break;
         case 4:
            var10009 = 254;
            break;
         case 5:
            var10009 = 123;
            break;
         default:
            var10009 = 22;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}
