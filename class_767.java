
// $FF: renamed from: wJ
public abstract class class_767 extends class_761 {

   // $FF: renamed from: bA float
   private float field_3466;
   // $FF: renamed from: bB float
   private float field_3467;
   // $FF: renamed from: gb java.lang.String
   private static final String field_3468 = "Age";


   // $FF: renamed from: <init> (ahb) void
   public void method_3847(ahb var1) {
      super.method_3847(var1);
      this.field_3466 = -1.0F;
   }

   // $FF: renamed from: b (wJ) wJ
   public abstract class_767 method_4353(class_767 var1);

   // $FF: renamed from: a (yz) boolean
   public boolean method_4295(class_792 var1) {
      String[] var10000 = class_752.method_4253();
      add var3 = var1.field_3616.method_3593();
      String[] var2 = var10000;
      add var6 = var3;
      if(var2 != null) {
         if(var3 == null) {
            return false;
         }

         var6 = var3;
      }

      if(var6.method_3730() == class_1010.field_5239) {
         int var7 = this.field_2990.field_1832;
         if(var2 != null) {
            if(!this.field_2990.field_1832) {
               var7 = var3.method_3745();
               if(var2 == null) {
                  return (boolean)var7;
               }

               Class var4 = class_1775.method_9758(var7);
               if(var4 != null) {
                  var7 = var4.isAssignableFrom(this.getClass());
                  if(var2 == null) {
                     return (boolean)var7;
                  }

                  if(var7 != 0) {
                     label62: {
                        class_767 var5 = this.method_4353(this);
                        class_767 var8 = var5;
                        if(var2 != null) {
                           if(var5 == null) {
                              break label62;
                           }

                           var5.method_4356(-24000);
                           var5.method_3887(this.field_2994, this.field_2995, this.field_2996, 0.0F, 0.0F);
                           var8 = this;
                        }

                        var8.field_2990.method_2089(var5);
                        var7 = var3.method_3773();
                        if(var2 != null) {
                           if(var7 != 0) {
                              var5.method_4286(var3.method_3770());
                           }

                           var7 = var1.field_3640.field_2839;
                        }

                        if(var2 == null) {
                           return (boolean)var7;
                        }

                        if(var7 == 0) {
                           --var3.field_2958;
                           var7 = var3.field_2958;
                           if(var2 == null) {
                              return (boolean)var7;
                           }

                           if(var3.field_2958 <= 0) {
                              var1.field_3616.method_87(var1.field_3616.field_2846, (add)null);
                           }
                        }
                     }
                  }
               }
            }

            var7 = 1;
         }

         return (boolean)var7;
      } else {
         return false;
      }
   }

   // $FF: renamed from: c () void
   protected void method_3848() {
      super.method_3848();
      this.field_3036.method_9497(12, new Integer(0));
   }

   // $FF: renamed from: a8 () int
   public int method_4354() {
      return this.field_3036.method_9501(12);
   }

   // $FF: renamed from: c (int) void
   public void method_4355(int var1) {
      String[] var10000 = class_752.method_4253();
      int var3 = this.method_4354();
      String[] var2 = var10000;
      var3 += var1 * 20;
      if(var2 != null) {
         if(var3 > 0) {
            var3 = 0;
         }

         this.method_4356(var3);
      }

   }

   // $FF: renamed from: s (int) void
   public void method_4356(int var1) {
      this.field_3036.method_9506(12, Integer.valueOf(var1));
      this.method_4357(this.method_4159());
   }

   // $FF: renamed from: b (ro) void
   public void method_3909(class_1583 var1) {
      super.method_3909(var1);
      var1.method_8667("Age", this.method_4354());
   }

   // $FF: renamed from: a (ro) void
   public void method_3908(class_1583 var1) {
      super.method_3908(var1);
      this.method_4356(var1.method_8681("Age"));
   }

   // $FF: renamed from: e () void
   public void method_4231() {
      String[] var10000 = class_752.method_4253();
      super.method_4231();
      String[] var1 = var10000;
      int var3 = this.field_2990.field_1832;
      if(var1 != null) {
         if(this.field_2990.field_1832) {
            this.method_4357(this.method_4159());
            if(var1 != null) {
               return;
            }
         }

         var3 = this.method_4354();
      }

      int var2 = var3;
      var3 = var2;
      if(var1 != null) {
         if(var2 < 0) {
            ++var2;
            this.method_4356(var2);
            if(var1 != null) {
               return;
            }
         }

         var3 = var2;
      }

      if(var3 > 0) {
         --var2;
         this.method_4356(var2);
      }

   }

   // $FF: renamed from: f () boolean
   public boolean method_4159() {
      String[] var1 = class_752.method_4253();
      int var10000 = this.method_4354();
      if(var1 != null) {
         var10000 = var10000 < 0?1:0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: i (boolean) void
   public void method_4357(boolean var1) {
      this.method_4358(var1?0.5F:1.0F);
   }

   // $FF: renamed from: a (float, float) void
   protected final void method_3852(float var1, float var2) {
      String[] var3 = class_752.method_4253();
      float var6;
      int var10000 = (var6 = this.field_3466 - 0.0F) == 0.0F?0:(var6 < 0.0F?-1:1);
      if(var3 != null) {
         var10000 = var10000 > 0?1:0;
      }

      int var4 = var10000;
      this.field_3466 = var1;
      class_767 var5 = this;
      float var10001 = var2;
      if(var3 != null) {
         this.field_3467 = var2;
         if(var4 != 0) {
            return;
         }

         var5 = this;
         var10001 = 1.0F;
      }

      var5.method_4358(var10001);
   }

   // $FF: renamed from: o (float) void
   protected final void method_4358(float var1) {
      super.method_3852(this.field_3466 * var1, this.field_3467 * var1);
   }

   // $FF: renamed from: <clinit> () void
   static void method_28() {
      boolean var10000 = true;
      char[] var10003 = "<¨\r".toCharArray();
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
            field_3468 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 139;
            break;
         case 1:
            var10009 = 57;
            break;
         case 2:
            var10009 = 158;
            break;
         case 3:
            var10009 = 45;
            break;
         case 4:
            var10009 = 58;
            break;
         case 5:
            var10009 = 35;
            break;
         default:
            var10009 = 137;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}
