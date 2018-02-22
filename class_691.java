
// $FF: renamed from: xz
public class class_691 extends class_690 {

   // $FF: renamed from: aG int
   private int field_3072;
   // $FF: renamed from: eb java.lang.String[]
   private static final String[] field_3073;


   // $FF: renamed from: <init> (ahb) void
   public void method_3847(ahb var1) {
      super.method_3847(var1);
      this.field_3072 = -1;
   }

   // $FF: renamed from: <init> (ahb, double, double, double) void
   public void method_3980(ahb var1, double var2, double var4, double var6) {
      super.method_3980(var1, var2, var4, var6);
      this.field_3072 = -1;
   }

   // $FF: renamed from: s () int
   public int method_3994() {
      return 3;
   }

   // $FF: renamed from: u () aji
   public aji method_3996() {
      return class_1192.field_6073;
   }

   // $FF: renamed from: h () void
   public void method_3856() {
      class_691 var4;
      label39: {
         int var10000;
         label40: {
            String[] var1;
            label41: {
               super.method_3856();
               var1 = class_752.method_4253();
               var10000 = this.field_3072;
               if(var1 != null) {
                  if(this.field_3072 > 0) {
                     --this.field_3072;
                     String[] var10001 = field_3073;
                     this.field_2990.method_2087("smoke", this.field_2994, this.field_2995 + 0.5D, this.field_2996, 0.0D, 0.0D, 0.0D);
                     if(var1 != null) {
                        break label41;
                     }
                  }

                  var10000 = this.field_3072;
               }

               if(var1 == null) {
                  break label40;
               }

               if(var10000 == 0) {
                  this.method_4010(this.field_2997 * this.field_2997 + this.field_2999 * this.field_2999);
               }
            }

            var4 = this;
            if(var1 == null) {
               break label39;
            }

            var10000 = this.field_3006;
         }

         if(var10000 == 0) {
            return;
         }

         var4 = this;
      }

      double var2 = var4.field_2997 * this.field_2997 + this.field_2999 * this.field_2999;
      if(var2 >= 0.009999999776482582D) {
         this.method_4010(var2);
      }

   }

   // $FF: renamed from: b (vX) void
   public void method_3981(class_1691 var1) {
      String[] var10000 = class_752.method_4253();
      super.method_3981(var1);
      String[] var2 = var10000;
      double var3 = this.field_2997 * this.field_2997 + this.field_2999 * this.field_2999;
      int var5 = var1.method_9337();
      if(var2 != null) {
         if(var5 == 0) {
            add var10001 = new add;
            var10001.method_3722(class_1192.field_6073, 1);
            this.method_3916(var10001, 0.0F);
         }

         var5 = var1.method_9351();
      }

      label36: {
         if(var2 != null) {
            if(var5 != 0) {
               break label36;
            }

            var5 = var1.method_9337();
         }

         if(var2 != null) {
            if(var5 != 0) {
               break label36;
            }

            double var6;
            var5 = (var6 = var3 - 0.009999999776482582D) == 0.0D?0:(var6 < 0.0D?-1:1);
         }

         if(var5 < 0) {
            return;
         }
      }

      this.method_4010(var3);
   }

   // $FF: renamed from: b (double) void
   protected void method_4010(double var1) {
      String[] var3 = class_752.method_4253();
      if(!this.field_2990.field_1832) {
         double var4 = Math.sqrt(var1);
         if(var3 != null) {
            if(var4 > 5.0D) {
               var4 = 5.0D;
            }

            this.field_2990.method_2125(this, this.field_2994, this.field_2995, this.field_2996, (float)(4.0D + this.field_3028.nextDouble() * 1.5D * var4), true);
         }

         this.method_3851();
      }

   }

   // $FF: renamed from: b (float) void
   protected void method_3874(float var1) {
      label13: {
         String[] var2 = class_752.method_4253();
         float var10000 = var1;
         float var10001 = 3.0F;
         if(var2 != null) {
            if(var1 < 3.0F) {
               break label13;
            }

            var10000 = var1;
            var10001 = 10.0F;
         }

         float var3 = var10000 / var10001;
         this.method_4010((double)(var3 * var3));
      }

      super.method_3874(var1);
   }

   // $FF: renamed from: b (int, int, int, boolean) void
   public void method_3982(int var1, int var2, int var3, boolean var4) {
      class_691 var6;
      label24: {
         String[] var5 = class_752.method_4253();
         int var10000 = var4;
         if(var5 != null) {
            if(var4 == 0) {
               return;
            }

            var6 = this;
            if(var5 == null) {
               break label24;
            }

            var10000 = this.field_3072;
         }

         if(var10000 >= 0) {
            return;
         }

         var6 = this;
      }

      var6.method_4011();
   }

   // $FF: renamed from: a (byte) void
   public void method_3932(byte var1) {
      String[] var2 = class_752.method_4253();
      if(var1 == 10) {
         this.method_4011();
         if(var2 != null) {
            return;
         }
      }

      super.method_3932(var1);
   }

   // $FF: renamed from: a () void
   public void method_4011() {
      String[] var10000 = class_752.method_4253();
      this.field_3072 = 80;
      String[] var1 = var10000;
      ahb var2 = this.field_2990;
      if(var1 != null) {
         if(this.field_2990.field_1832) {
            return;
         }

         this.field_2990.method_2191(this, (byte)10);
         var2 = this.field_2990;
      }

      String[] var10002 = field_3073;
      var2.method_2082(this, "game.tnt.primed", 1.0F, 1.0F);
   }

   // $FF: renamed from: b () int
   public int method_4012() {
      return this.field_3072;
   }

   // $FF: renamed from: d () boolean
   public boolean method_4013() {
      String[] var1 = class_752.method_4253();
      int var10000 = this.field_3072;
      if(var1 != null) {
         var10000 = this.field_3072 > -1?1:0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: a (df, ahb, int, int, int, aji) float
   public float method_3965(class_1036 var1, ahb var2, int var3, int var4, int var5, aji var6) {
      String[] var7 = class_752.method_4253();
      class_691 var10000 = this;
      if(var7 != null) {
         if(this.method_4013()) {
            boolean var8 = class_392.method_2613(var6);
            if(var7 != null) {
               if(var8) {
                  return 0.0F;
               }

               var8 = class_392.method_2612(var2, var3, var4 + 1, var5);
            }

            if(var8) {
               return 0.0F;
            }
         }

         var10000 = this;
      }

      return var10000.method_3965(var1, var2, var3, var4, var5, var6);
   }

   // $FF: renamed from: a (df, ahb, int, int, int, aji, float) boolean
   public boolean method_3966(class_1036 var1, ahb var2, int var3, int var4, int var5, aji var6, float var7) {
      String[] var8 = class_752.method_4253();
      boolean var10000 = this.method_4013();
      if(var8 != null) {
         if(var10000) {
            label22: {
               var10000 = class_392.method_2613(var6);
               if(var8 != null) {
                  if(!var10000) {
                     var10000 = class_392.method_2612(var2, var3, var4 + 1, var5);
                     if(var8 == null) {
                        return var10000;
                     }

                     if(!var10000) {
                        break label22;
                     }
                  }

                  var10000 = false;
               }

               return var10000;
            }
         }

         var10000 = super.method_3966(var1, var2, var3, var4, var5, var6, var7);
      }

      return var10000;
   }

   // $FF: renamed from: a (ro) void
   protected void method_3908(class_1583 var1) {
      String[] var2 = class_752.method_4253();
      class_691 var10000 = this;
      class_1583 var10001 = var1;
      if(var2 != null) {
         super.method_3908(var1);
         String[] var3 = field_3073;
         if(!var1.initGui8("TNTFuse", 99)) {
            return;
         }

         var10000 = this;
         var10001 = var1;
      }

      String[] var10002 = field_3073;
      var10000.field_3072 = var10001.method_8681("TNTFuse");
   }

   // $FF: renamed from: b (ro) void
   protected void method_3909(class_1583 var1) {
      super.method_3909(var1);
      String[] var10001 = field_3073;
      var1.method_8667("TNTFuse", this.field_3072);
   }

   // $FF: renamed from: <clinit> () void
   static void method_4009() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "jâHBâõ»EÛkåþ¨\nÆ|^üõ¸¯IÙeR";
      int var4 = "jâHBâõ»EÛkåþ¨\nÆ|^üõ¸¯IÙeR".length();
      char var1 = 7;
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
                  field_3073 = var5;
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 92;
               break;
            case 1:
               var10009 = 164;
               break;
            case 2:
               var10009 = 54;
               break;
            case 3:
               var10009 = 142;
               break;
            case 4:
               var10009 = 183;
               break;
            case 5:
               var10009 = 17;
               break;
            default:
               var10009 = 16;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var10 ^ var10009);
            ++var6;
         }
      }
   }
}
