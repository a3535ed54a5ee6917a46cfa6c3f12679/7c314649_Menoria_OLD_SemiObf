
public class bjk extends class_796 {

   // $FF: renamed from: a nv
   public final class_1436 field_3707;
   // $FF: renamed from: bO vd
   private final class_1699 field_3708;
   // $FF: renamed from: bP double
   private double field_3709;
   // $FF: renamed from: bQ double
   private double field_3710;
   // $FF: renamed from: bR double
   private double field_3711;
   // $FF: renamed from: bS double
   private double field_3712;
   // $FF: renamed from: bT float
   private float field_3713;
   // $FF: renamed from: bU float
   private float field_3714;
   // $FF: renamed from: bV boolean
   private boolean field_3715;
   // $FF: renamed from: bW boolean
   private boolean field_3716;
   // $FF: renamed from: bX boolean
   private boolean field_3717;
   // $FF: renamed from: bY int
   private int field_3718;
   // $FF: renamed from: cd boolean
   private boolean field_3719;
   // $FF: renamed from: ce java.lang.String
   private String field_3720;
   private static final String __OBFID = "CL_00000887";


   // $FF: renamed from: <init> (bao, ahb, kT, nv, vd) void
   public void method_4674(bao var1, ahb var2, class_1331 var3, class_1436 var4, class_1699 var5) {
      super.method_4666(var1, var2, var3, 0);
      this.field_3707 = var4;
      this.field_3708 = var5;
   }

   // $FF: renamed from: a (vX, float) boolean
   public boolean method_3896(class_1691 var1, float var2) {
      return false;
   }

   // $FF: renamed from: f (float) void
   public void method_4187(float var1) {}

   // $FF: renamed from: a (sa) void
   public void method_3925(class_689 var1) {
      String[] var2 = class_752.method_4253();
      bjk var10000 = this;
      if(var2 != null) {
         super.method_3925(var1);
         if(!(var1 instanceof class_690)) {
            return;
         }

         var10000 = this;
      }

      class_1541 var3 = var10000.field_3690.method_5295();
      class_1426 var10001 = new class_1426;
      var10001.method_7773(this, (class_690)var1);
      var3.method_8366(var10001);
   }

   // $FF: renamed from: h () void
   public void method_3856() {
      bjk var2;
      label26: {
         String[] var1 = class_752.method_4253();
         boolean var10000 = this.field_2990.method_2048(class_1715.method_9561(this.field_2994), 0, class_1715.method_9561(this.field_2996));
         if(var1 != null) {
            if(!var10000) {
               return;
            }

            super.method_3856();
            var2 = this;
            if(var1 == null) {
               break label26;
            }

            var10000 = this.method_3937();
         }

         if(var10000) {
            class_1436 var3 = this.field_3707;
            class_265 var10001 = new class_265;
            var10001.method_1544(this.field_3000, this.field_3001, this.field_3005);
            var3.method_7821(var10001);
            var3 = this.field_3707;
            class_260 var4 = new class_260;
            var4.method_1500(this.field_3347, this.field_3348, this.field_3689.field_7408, this.field_3689.field_7409);
            var3.method_7821(var4);
            if(var1 != null) {
               return;
            }
         }

         var2 = this;
      }

      var2.method_4675();
   }

   // $FF: renamed from: a () void
   public void method_4675() {
      String[] var10000 = class_752.method_4253();
      boolean var2 = this.method_3940();
      String[] var1 = var10000;
      boolean var17 = var2;
      class_261 var10001;
      class_1436 var18;
      if(var1 != null) {
         if(var2 != this.field_3717) {
            label121: {
               if(var2) {
                  var18 = this.field_3707;
                  var10001 = new class_261;
                  var10001.method_1506(this, 4);
                  var18.method_7821(var10001);
                  if(var1 != null) {
                     break label121;
                  }
               }

               var18 = this.field_3707;
               var10001 = new class_261;
               var10001.method_1506(this, 5);
               var18.method_7821(var10001);
            }

            this.field_3717 = var2;
         }

         var17 = this.method_3938();
      }

      label128: {
         boolean var3 = var17;
         var17 = var3;
         if(var1 != null) {
            if(var3 == this.field_3716) {
               break label128;
            }

            var17 = var3;
         }

         label110: {
            if(var17) {
               var18 = this.field_3707;
               var10001 = new class_261;
               var10001.method_1506(this, 1);
               var18.method_7821(var10001);
               if(var1 != null) {
                  break label110;
               }
            }

            var18 = this.field_3707;
            var10001 = new class_261;
            var10001.method_1506(this, 2);
            var18.method_7821(var10001);
         }

         this.field_3716 = var3;
      }

      double var4 = this.field_2994 - this.field_3709;
      double var6 = this.field_3004.field_6910 - this.field_3710;
      double var8 = this.field_2996 - this.field_3712;
      double var10 = (double)(this.field_3000 - this.field_3713);
      double var12 = (double)(this.field_3001 - this.field_3714);
      double var24;
      int var22 = (var24 = var4 * var4 + var6 * var6 + var8 * var8 - 9.0E-4D) == 0.0D?0:(var24 < 0.0D?-1:1);
      if(var1 != null) {
         label104: {
            if(var22 <= 0) {
               var22 = this.field_3718;
               if(var1 == null) {
                  break label104;
               }

               if(this.field_3718 < 20) {
                  var22 = 0;
                  break label104;
               }
            }

            var22 = 1;
         }
      }

      int var14 = var22;
      double var25;
      var22 = (var25 = var10 - 0.0D) == 0.0D?0:(var25 < 0.0D?-1:1);
      if(var1 != null) {
         label96: {
            if(var22 == 0) {
               double var26;
               var22 = (var26 = var12 - 0.0D) == 0.0D?0:(var26 < 0.0D?-1:1);
               if(var1 == null) {
                  break label96;
               }

               if(var22 == 0) {
                  var22 = 0;
                  break label96;
               }
            }

            var22 = 1;
         }
      }

      int var15;
      label129: {
         class_266 var19;
         label88: {
            var15 = var22;
            bjk var16 = this;
            if(var1 != null) {
               if(this.field_2988 == null) {
                  break label88;
               }

               var16 = this;
            }

            var18 = var16.field_3707;
            var19 = new class_266;
            var19.method_1545(this.field_2997, -999.0D, -999.0D, this.field_2999, this.field_3000, this.field_3001, this.field_3005);
            var18.method_7821(var19);
            var14 = 0;
            if(var1 != null) {
               break label129;
            }
         }

         var22 = var14;
         if(var1 != null) {
            label79: {
               if(var14 != 0) {
                  var22 = var15;
                  if(var1 == null) {
                     break label79;
                  }

                  if(var15 != 0) {
                     var18 = this.field_3707;
                     var19 = new class_266;
                     var19.method_1545(this.field_2994, this.field_3004.field_6910, this.field_2995, this.field_2996, this.field_3000, this.field_3001, this.field_3005);
                     var18.method_7821(var19);
                     if(var1 != null) {
                        break label129;
                     }
                  }
               }

               var22 = var14;
            }
         }

         if(var1 != null) {
            if(var22 != 0) {
               var18 = this.field_3707;
               class_267 var20 = new class_267;
               var20.method_1546(this.field_2994, this.field_3004.field_6910, this.field_2995, this.field_2996, this.field_3005);
               var18.method_7821(var20);
               if(var1 != null) {
                  break label129;
               }
            }

            var22 = var15;
         }

         if(var22 != 0) {
            var18 = this.field_3707;
            class_265 var21 = new class_265;
            var21.method_1544(this.field_3000, this.field_3001, this.field_3005);
            var18.method_7821(var21);
            if(var1 != null) {
               break label129;
            }
         }

         var18 = this.field_3707;
         class_264 var23 = new class_264;
         var23.method_1532(this.field_3005);
         var18.method_7821(var23);
      }

      ++this.field_3718;
      this.field_3715 = this.field_3005;
      var22 = var14;
      if(var1 != null) {
         if(var14 != 0) {
            this.field_3709 = this.field_2994;
            this.field_3710 = this.field_3004.field_6910;
            this.field_3711 = this.field_2995;
            this.field_3712 = this.field_2996;
            this.field_3718 = 0;
         }

         var22 = var15;
      }

      if(var22 != 0) {
         this.field_3713 = this.field_3000;
         this.field_3714 = this.field_3001;
      }

   }

   // $FF: renamed from: a (boolean) xq
   public class_699 method_4569(boolean var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = var1;
      if(var2 != null) {
         var10000 = var1 != 0?3:4;
      }

      int var3 = var10000;
      class_1436 var4 = this.field_3707;
      class_262 var10001 = new class_262;
      var10001.method_1511(var3, 0, 0, 0, 0);
      var4.method_7821(var10001);
      return null;
   }

   // $FF: renamed from: a (xq) void
   protected void method_4572(class_699 var1) {}

   // $FF: renamed from: a (java.lang.String) void
   public void method_4676(String var1) {
      class_1436 var10000 = this.field_3707;
      class_304 var10001 = new class_304;
      var10001.method_1734(var1);
      var10000.method_7821(var10001);
   }

   // $FF: renamed from: ba () void
   public void method_4209() {
      super.method_4209();
      class_1436 var10000 = this.field_3707;
      class_333 var10001 = new class_333;
      var10001.method_1888(this, 1);
      var10000.method_7821(var10001);
   }

   // $FF: renamed from: bH () void
   public void method_4598() {
      class_1436 var10000 = this.field_3707;
      class_276 var10001 = new class_276;
      var10001.method_1586(class_913.field_4598);
      var10000.method_7821(var10001);
   }

   // $FF: renamed from: d (vX, float) void
   protected void method_4203(class_1691 var1, float var2) {
      String[] var3 = class_752.method_4253();
      bjk var10000 = this;
      if(var3 != null) {
         if(this.method_3961()) {
            return;
         }

         var10000 = this;
      }

      var10000.method_4188(this.method_406() - var2);
   }

   // $FF: renamed from: k () void
   public void method_4564() {
      class_1436 var10000 = this.field_3707;
      class_271 var10001 = new class_271;
      var10001.method_1560(this.field_3619.field_2870);
      var10000.method_7821(var10001);
      this.method_4677();
   }

   // $FF: renamed from: b () void
   public void method_4677() {
      this.field_3616.method_3616((add)null);
      super.method_4564();
   }

   // $FF: renamed from: n (float) void
   public void method_4668(float var1) {
      String[] var2 = class_752.method_4253();
      bjk var10000 = this;
      if(var2 != null) {
         if(this.field_3719) {
            super.method_4668(var1);
            if(var2 != null) {
               return;
            }
         }

         this.method_4188(var1);
         var10000 = this;
      }

      var10000.field_3719 = true;
   }

   // $FF: renamed from: a (u2, int) void
   public void method_4615(class_1601 var1, int var2) {
      String[] var3 = class_752.method_4253();
      class_1601 var10000 = var1;
      if(var3 != null) {
         if(var1 == null) {
            return;
         }

         var10000 = var1;
      }

      if(var10000.field_8366) {
         super.method_4615(var1, var2);
      }

   }

   // $FF: renamed from: q () void
   public void method_4630() {
      class_1436 var10000 = this.field_3707;
      class_263 var10001 = new class_263;
      var10001.method_1518(this.field_3640);
      var10000.method_7821(var10001);
   }

   // $FF: renamed from: i () void
   protected void method_4673() {
      class_1436 var10000 = this.field_3707;
      class_261 var10001 = new class_261;
      var10001.method_1507(this, 6, (int)(this.method_4672() * 100.0F));
      var10000.method_7821(var10001);
   }

   // $FF: renamed from: j () void
   public void method_4678() {
      class_1436 var10000 = this.field_3707;
      class_261 var10001 = new class_261;
      var10001.method_1506(this, 7);
      var10000.method_7821(var10001);
   }

   // $FF: renamed from: b (java.lang.String) void
   public void method_4679(String var1) {
      this.field_3720 = var1;
   }

   // $FF: renamed from: l () java.lang.String
   public String method_4680() {
      return this.field_3720;
   }

   // $FF: renamed from: m () vd
   public class_1699 method_4681() {
      return this.field_3708;
   }

   // $FF: renamed from: <clinit> () void
   static void method_4636() {
      boolean var10000 = true;
      char[] var10003 = "}×Iïz1£{N".toCharArray();
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
            __OBFID = (new String((char[])var4)).intern();
            String var2 = __OBFID;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 226;
            break;
         case 1:
            var10009 = 71;
            break;
         case 2:
            var10009 = 159;
            break;
         case 3:
            var10009 = 165;
            break;
         case 4:
            var10009 = 3;
            break;
         case 5:
            var10009 = 150;
            break;
         default:
            var10009 = 221;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
