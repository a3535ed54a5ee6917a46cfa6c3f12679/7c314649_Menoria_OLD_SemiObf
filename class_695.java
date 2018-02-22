
// $FF: renamed from: xt
public abstract class class_695 extends class_690 implements class_22 {

   // $FF: renamed from: aG add[]
   private add[] field_3081;
   // $FF: renamed from: aH boolean
   private boolean field_3082;
   // $FF: renamed from: eb java.lang.String[]
   private static final String[] field_3083;


   // $FF: renamed from: <init> (ahb) void
   public void method_3847(ahb var1) {
      super.method_3847(var1);
      this.field_3081 = new add[36];
      this.field_3082 = true;
   }

   // $FF: renamed from: <init> (ahb, double, double, double) void
   public void method_3980(ahb var1, double var2, double var4, double var6) {
      super.method_3980(var1, var2, var4, var6);
      this.field_3081 = new add[36];
      this.field_3082 = true;
   }

   // $FF: renamed from: b (vX) void
   public void method_3981(class_1691 var1) {
      String[] var10000 = class_752.method_4253();
      super.method_3981(var1);
      String[] var2 = var10000;
      int var3 = 0;

      label44:
      do {
         int var11 = var3;
         int var10001 = this.method_83();

         label41:
         while(var11 < var10001) {
            add var4 = this.method_84(var3);
            if(var2 == null) {
               continue label44;
            }

            if(var4 != null) {
               float var5 = this.field_3028.nextFloat() * 0.8F + 0.1F;
               float var6 = this.field_3028.nextFloat() * 0.8F + 0.1F;
               float var7 = this.field_3028.nextFloat() * 0.8F + 0.1F;

               while(var4.field_2958 > 0) {
                  int var8 = this.field_3028.nextInt(21) + 10;
                  if(var2 != null) {
                     var11 = var8;
                     var10001 = var4.field_2958;
                     if(var2 == null) {
                        continue label41;
                     }

                     if(var8 > var4.field_2958) {
                        var8 = var4.field_2958;
                     }

                     var4.field_2958 -= var8;
                  }

                  class_699 var12 = new class_699;
                  ahb var10002 = this.field_2990;
                  double var10003 = this.field_2994 + (double)var5;
                  double var10004 = this.field_2995 + (double)var6;
                  double var10005 = this.field_2996 + (double)var7;
                  add var10006 = new add;
                  var10006.method_3726(var4.method_3730(), var8, var4.method_3745());
                  var12.method_4025(var10002, var10003, var10004, var10005, var10006);
                  class_699 var9 = var12;
                  float var10 = 0.05F;
                  var9.field_2997 = (double)((float)this.field_3028.nextGaussian() * var10);
                  var9.field_2998 = (double)((float)this.field_3028.nextGaussian() * var10 + 0.2F);
                  var9.field_2999 = (double)((float)this.field_3028.nextGaussian() * var10);
                  this.field_2990.method_2089(var9);
                  if(var2 == null) {
                     break;
                  }
               }
            }

            ++var3;
            continue label44;
         }

         return;
      } while(var2 != null);

   }

   // $FF: renamed from: c (int) add
   public add method_84(int var1) {
      return this.field_3081[var1];
   }

   // $FF: renamed from: b (int, int) add
   public add method_85(int var1, int var2) {
      String[] var3 = class_752.method_4253();
      add var10000 = this.field_3081[var1];
      if(var3 != null) {
         if(var10000 == null) {
            return null;
         }

         var10000 = this.field_3081[var1];
      }

      add var4;
      if(var3 != null) {
         if(var10000.field_2958 <= var2) {
            var4 = this.field_3081[var1];
            this.field_3081[var1] = null;
            return var4;
         }

         var10000 = this.field_3081[var1].method_3729(var2);
      }

      var4 = var10000;
      var10000 = this.field_3081[var1];
      if(var3 != null) {
         if(var10000.field_2958 == 0) {
            this.field_3081[var1] = null;
         }

         var10000 = var4;
      }

      return var10000;
   }

   // $FF: renamed from: j (int) add
   public add method_86(int var1) {
      String[] var2 = class_752.method_4253();
      add var10000 = this.field_3081[var1];
      if(var2 != null) {
         if(var10000 == null) {
            return null;
         }

         var10000 = this.field_3081[var1];
      }

      add var3 = var10000;
      this.field_3081[var1] = null;
      return var3;
   }

   // $FF: renamed from: b (int, add) void
   public void method_87(int var1, add var2) {
      String[] var10000 = class_752.method_4253();
      this.field_3081[var1] = var2;
      String[] var3 = var10000;
      add var4 = var2;
      if(var3 != null) {
         if(var2 == null) {
            return;
         }

         var4 = var2;
      }

      if(var3 != null) {
         if(var4.field_2958 <= this.method_90()) {
            return;
         }

         var4 = var2;
      }

      var4.field_2958 = this.method_90();
   }

   // $FF: renamed from: l () void
   public void method_91() {}

   // $FF: renamed from: b (yz) boolean
   public boolean method_92(class_792 var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = this.field_3012;
      if(var2 != null) {
         if(this.field_3012) {
            return false;
         }

         double var3;
         var10000 = (var3 = var1.method_3891(this) - 64.0D) == 0.0D?0:(var3 < 0.0D?-1:1);
      }

      if(var2 != null) {
         if(var10000 > 0) {
            return false;
         }

         var10000 = 1;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: m () void
   public void method_93() {}

   // $FF: renamed from: n () void
   public void method_94() {}

   // $FF: renamed from: d (int, add) boolean
   public boolean method_95(int var1, add var2) {
      return true;
   }

   // $FF: renamed from: i () java.lang.String
   public String method_88() {
      String[] var1 = class_752.method_4253();
      class_695 var10000 = this;
      String var2;
      if(var1 != null) {
         if(!this.method_89()) {
            String[] var3 = field_3083;
            var2 = "container.minecart";
            return var2;
         }

         var10000 = this;
      }

      var2 = var10000.method_4008();
      return var2;
   }

   // $FF: renamed from: k () int
   public int method_90() {
      return 64;
   }

   // $FF: renamed from: b (int) void
   public void method_3964(int var1) {
      this.field_3082 = false;
      super.method_3964(var1);
   }

   // $FF: renamed from: B () void
   public void method_3851() {
      String[] var1 = class_752.method_4253();
      class_695 var10000 = this;
      if(var1 != null) {
         if(this.field_3082) {
            int var2 = 0;

            label62:
            do {
               int var10 = var2;
               int var10001 = this.method_83();

               label59:
               while(true) {
                  if(var10 >= var10001) {
                     break label62;
                  }

                  add var3 = this.method_84(var2);
                  if(var1 == null) {
                     return;
                  }

                  if(var1 == null) {
                     break;
                  }

                  if(var3 != null) {
                     float var4 = this.field_3028.nextFloat() * 0.8F + 0.1F;
                     float var5 = this.field_3028.nextFloat() * 0.8F + 0.1F;
                     float var6 = this.field_3028.nextFloat() * 0.8F + 0.1F;

                     while(var3.field_2958 > 0) {
                        int var7 = this.field_3028.nextInt(21) + 10;
                        if(var1 != null) {
                           var10 = var7;
                           var10001 = var3.field_2958;
                           if(var1 == null) {
                              continue label59;
                           }

                           if(var7 > var3.field_2958) {
                              var7 = var3.field_2958;
                           }

                           var3.field_2958 -= var7;
                        }

                        class_699 var8;
                        label35: {
                           class_699 var11 = new class_699;
                           ahb var10002 = this.field_2990;
                           double var10003 = this.field_2994 + (double)var4;
                           double var10004 = this.field_2995 + (double)var5;
                           double var10005 = this.field_2996 + (double)var6;
                           add var10006 = new add;
                           var10006.method_3726(var3.method_3730(), var7, var3.method_3745());
                           var11.method_4025(var10002, var10003, var10004, var10005, var10006);
                           var8 = var11;
                           add var12 = var3;
                           if(var1 != null) {
                              if(!var3.method_3766()) {
                                 break label35;
                              }

                              var12 = var8.method_4030();
                           }

                           var12.method_3769((class_1583)var3.method_3767().method_8633());
                        }

                        float var9 = 0.05F;
                        var8.field_2997 = (double)((float)this.field_3028.nextGaussian() * var9);
                        var8.field_2998 = (double)((float)this.field_3028.nextGaussian() * var9 + 0.2F);
                        var8.field_2999 = (double)((float)this.field_3028.nextGaussian() * var9);
                        this.field_2990.method_2089(var8);
                        if(var1 == null) {
                           break;
                        }
                     }
                  }

                  ++var2;
                  break;
               }
            } while(var1 != null);
         }

         var10000 = this;
      }

      var10000.method_3851();
   }

   // $FF: renamed from: b (ro) void
   protected void method_3909(class_1583 var1) {
      String[] var10000 = class_752.method_4253();
      super.method_3909(var1);
      class_1580 var10001 = new class_1580;
      var10001.method_8628();
      class_1580 var3 = var10001;
      String[] var2 = var10000;
      int var4 = 0;

      while(true) {
         if(var4 < this.field_3081.length) {
            if(var2 == null) {
               break;
            }

            if(this.field_3081[var4] != null) {
               class_1583 var7 = new class_1583;
               var7.method_8628();
               class_1583 var5 = var7;
               String[] var6 = field_3083;
               var5.method_8665("Slot", (byte)var4);
               this.field_3081[var4].method_3737(var5);
               var3.method_8650(var5);
            }

            ++var4;
            if(var2 != null) {
               continue;
            }
         }

         String[] var8 = field_3083;
         var1.method_8664("Items", var3);
         break;
      }

   }

   // $FF: renamed from: a (ro) void
   protected void method_3908(class_1583 var1) {
      String[] var10000 = class_752.method_4253();
      super.method_3908(var1);
      String[] var7 = field_3083;
      class_1580 var3 = var1.method_8689("Items", 10);
      String[] var2 = var10000;
      this.field_3081 = new add[this.method_83()];
      int var4 = 0;

      while(var4 < var3.method_8658()) {
         class_1583 var5 = var3.method_8653(var4);
         String[] var10001 = field_3083;
         int var6 = var5.initGui9("Slot") & 255;
         if(var2 != null) {
            if(var6 >= 0 && var6 < this.field_3081.length) {
               this.field_3081[var6] = add.method_3727(var5);
            }

            ++var4;
         }

         if(var2 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: c (yz) boolean
   public boolean method_3919(class_792 var1) {
      String[] var2 = class_752.method_4253();
      boolean var10000 = this.field_2990.field_1832;
      if(var2 != null) {
         if(!this.field_2990.field_1832) {
            var1.method_4575(this);
         }

         var10000 = true;
      }

      return var10000;
   }

   // $FF: renamed from: o () void
   protected void method_3985() {
      int var1 = 15 - class_671.method_3676(this);
      float var2 = 0.98F + (float)var1 * 0.001F;
      this.field_2997 *= (double)var2;
      this.field_2998 *= 0.0D;
      this.field_2999 *= (double)var2;
   }

   // $FF: renamed from: <clinit> () void
   static void method_4009() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "êÎÍì«ðÖÇõÀÕÆõ¹LÆÈì±GÀÛÚõ";
      int var4 = "êÎÍì«ðÖÇõÀÕÆõ¹LÆÈì±GÀÛÚõ".length();
      char var1 = 5;
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
                  field_3083 = var5;
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 54;
               break;
            case 1:
               var10009 = 47;
               break;
            case 2:
               var10009 = 61;
               break;
            case 3:
               var10009 = 20;
               break;
            case 4:
               var10009 = 77;
               break;
            case 5:
               var10009 = 109;
               break;
            default:
               var10009 = 183;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var10 ^ var10009);
            ++var6;
         }
      }
   }
}
