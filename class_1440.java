
// $FF: renamed from: ny
public class class_1440 {

   // $FF: renamed from: b bao
   private final bao field_7644;
   // $FF: renamed from: c nv
   private final class_1436 field_7645;
   // $FF: renamed from: d int
   private int field_7646;
   // $FF: renamed from: e int
   private int field_7647;
   // $FF: renamed from: f int
   private int field_7648;
   // $FF: renamed from: g add
   private add field_7649;
   // $FF: renamed from: h float
   private float field_7650;
   // $FF: renamed from: i float
   private float field_7651;
   // $FF: renamed from: j int
   private int field_7652;
   // $FF: renamed from: k boolean
   private boolean field_7653;
   // $FF: renamed from: l G
   private class_94 field_7654;
   // $FF: renamed from: m int
   private int field_7655;
   // $FF: renamed from: n java.lang.String
   private static final String field_7656 = "Disconnected from server";


   // $FF: renamed from: <init> (bao, nv) void
   public void method_7835(bao var1, class_1436 var2) {
      super();
      this.field_7646 = -1;
      this.field_7647 = -1;
      this.field_7648 = -1;
      this.field_7654 = class_94.field_45;
      this.field_7644 = var1;
      this.field_7645 = var2;
   }

   // $FF: renamed from: b (bao, ny, int, int, int, int) void
   public static void method_7836(bao var0, class_1440 var1, int var2, int var3, int var4, int var5) {
      String[] var6 = class_752.method_4253();
      if(var6 != null && !var0.cursorCounter6.method_2128(var0.cursorCounter8, var2, var3, var4, var5)) {
         var1.method_7842(var2, var3, var4, var5);
      }

   }

   // $FF: renamed from: b (yz) void
   public void method_7837(class_792 var1) {
      this.field_7654.method_445(var1.field_3640);
   }

   // $FF: renamed from: b () boolean
   public boolean method_7838() {
      return false;
   }

   // $FF: renamed from: b (G) void
   public void method_7839(class_94 var1) {
      this.field_7654 = var1;
      this.field_7654.method_445(this.field_7644.cursorCounter8.field_3640);
   }

   // $FF: renamed from: c (yz) void
   public void method_7840(class_792 var1) {
      var1.field_3000 = -180.0F;
   }

   // $FF: renamed from: c () boolean
   public boolean method_7841() {
      return this.field_7654.method_448();
   }

   // $FF: renamed from: b (int, int, int, int) boolean
   public boolean method_7842(int var1, int var2, int var3, int var4) {
      String[] var5;
      bao var12;
      label78: {
         class_1440 var11;
         label81: {
            var5 = class_752.method_4253();
            boolean var10000 = this.field_7654.method_446();
            if(var5 != null) {
               label82: {
                  if(var10000) {
                     var10000 = this.field_7644.cursorCounter8.method_4627(var1, var2, var3);
                     if(var5 == null) {
                        break label82;
                     }

                     if(!var10000) {
                        return false;
                     }
                  }

                  var11 = this;
                  if(var5 == null) {
                     break label81;
                  }

                  var10000 = this.field_7654.method_447();
               }
            }

            if(var10000) {
               var12 = this.field_7644;
               if(var5 == null) {
                  break label78;
               }

               if(this.field_7644.cursorCounter8.method_4214() != null) {
                  var12 = this.field_7644;
                  if(var5 == null) {
                     break label78;
                  }

                  if(this.field_7644.cursorCounter8.method_4214().method_3730() instanceof class_511) {
                     return false;
                  }
               }
            }

            var11 = this;
         }

         var12 = var11.field_7644;
      }

      bjf var6 = var12.cursorCounter6;
      aji var7 = var6.getBlock(var1, var2, var3);
      if(var5 != null) {
         if(var7.method_2424() == awt.field_4170) {
            return false;
         }

         var6.method_2210(2001, var1, var2, var3, aji.method_2415(var7) + (var6.method_33(var1, var2, var3) << 12));
      }

      int var8 = var6.method_33(var1, var2, var3);
      byte var9 = var6.method_2056(var1, var2, var3);
      int var13 = var9;
      if(var5 != null) {
         if(var9 != 0) {
            var7.method_2458(var6, var1, var2, var3, var8);
         }

         this.field_7647 = -1;
         var13 = this.field_7654.method_447();
      }

      if(var5 != null) {
         if(var13 == 0) {
            label83: {
               add var10 = this.field_7644.cursorCounter8.method_4593();
               add var14 = var10;
               if(var5 != null) {
                  if(var10 == null) {
                     break label83;
                  }

                  var10.method_3751(var6, var7, var1, var2, var3, this.field_7644.cursorCounter8);
                  var14 = var10;
               }

               var13 = var14.field_2958;
               if(var5 == null) {
                  return (boolean)var13;
               }

               if(var13 == 0) {
                  this.field_7644.cursorCounter8.method_4594();
               }
            }
         }

         var13 = var9;
      }

      return (boolean)var13;
   }

   // $FF: renamed from: c (int, int, int, int) void
   public void method_7843(int var1, int var2, int var3, int var4) {
      String[] var5 = class_752.method_4253();
      boolean var10000 = this.field_7654.method_446();
      if(var5 != null) {
         label91: {
            if(var10000) {
               var10000 = this.field_7644.cursorCounter8.method_4627(var1, var2, var3);
               if(var5 == null) {
                  break label91;
               }

               if(!var10000) {
                  return;
               }
            }

            var10000 = this.field_7654.method_447();
         }
      }

      class_1436 var9;
      class_262 var10001;
      if(var5 != null) {
         if(var10000) {
            var9 = this.field_7645;
            var10001 = new class_262;
            var10001.method_1511(0, var1, var2, var3, var4);
            var9.method_7821(var10001);
            method_7836(this.field_7644, this, var1, var2, var3, var4);
            this.field_7652 = 5;
            if(var5 != null) {
               return;
            }
         }

         var10000 = this.field_7653;
      }

      class_1440 var10;
      label96: {
         if(var5 != null) {
            label97: {
               if(var10000) {
                  var10000 = this.method_7848(var1, var2, var3);
                  if(var5 == null) {
                     break label97;
                  }

                  if(var10000) {
                     return;
                  }
               }

               var10 = this;
               if(var5 == null) {
                  break label96;
               }

               var10000 = this.field_7653;
            }
         }

         if(var10000) {
            var9 = this.field_7645;
            var10001 = new class_262;
            var10001.method_1511(1, this.field_7646, this.field_7647, this.field_7648, var4);
            var9.method_7821(var10001);
         }

         var9 = this.field_7645;
         var10001 = new class_262;
         var10001.method_1511(0, var1, var2, var3, var4);
         var9.method_7821(var10001);
         var10 = this;
      }

      aji var6 = var10.field_7644.cursorCounter6.getBlock(var1, var2, var3);
      int var7 = var6.method_2424() != awt.field_4170?1:0;
      int var8 = var7;
      if(var5 != null) {
         label63: {
            if(var7 != 0) {
               float var11;
               var8 = (var11 = this.field_7650 - 0.0F) == 0.0F?0:(var11 < 0.0F?-1:1);
               if(var5 == null) {
                  break label63;
               }

               if(var8 == 0) {
                  var6.method_2484(this.field_7644.cursorCounter6, var1, var2, var3, this.field_7644.cursorCounter8);
               }
            }

            var8 = var7;
         }
      }

      label98: {
         if(var5 != null) {
            if(var8 == 0) {
               break label98;
            }

            float var12;
            var8 = (var12 = var6.method_2465(this.field_7644.cursorCounter8, this.field_7644.cursorCounter8.field_2990, var1, var2, var3) - 1.0F) == 0.0F?0:(var12 < 0.0F?-1:1);
         }

         if(var5 != null) {
            if(var8 < 0) {
               break label98;
            }

            this.method_7842(var1, var2, var3, var4);
         }

         if(var5 != null) {
            return;
         }
      }

      this.field_7653 = true;
      this.field_7646 = var1;
      this.field_7647 = var2;
      this.field_7648 = var3;
      this.field_7649 = this.field_7644.cursorCounter8.method_4214();
      this.field_7650 = 0.0F;
      this.field_7651 = 0.0F;
      this.field_7644.cursorCounter6.method_2217(this.field_7644.cursorCounter8.method_3845(), this.field_7646, this.field_7647, this.field_7648, (int)(this.field_7650 * 10.0F) - 1);
   }

   // $FF: renamed from: d () void
   public void method_7844() {
      String[] var1 = class_752.method_4253();
      class_1440 var10000 = this;
      if(var1 != null) {
         if(this.field_7653) {
            class_1436 var2 = this.field_7645;
            class_262 var10001 = new class_262;
            var10001.method_1511(1, this.field_7646, this.field_7647, this.field_7648, -1);
            var2.method_7821(var10001);
         }

         this.field_7653 = false;
         this.field_7650 = 0.0F;
         var10000 = this;
      }

      var10000.field_7644.cursorCounter6.method_2217(this.field_7644.cursorCounter8.method_3845(), this.field_7646, this.field_7647, this.field_7648, -1);
   }

   // $FF: renamed from: d (int, int, int, int) void
   public void method_7845(int var1, int var2, int var3, int var4) {
      String[] var10000 = class_752.method_4253();
      this.method_7849();
      String[] var5 = var10000;
      int var7 = this.field_7652;
      if(var5 != null) {
         if(this.field_7652 > 0) {
            --this.field_7652;
            return;
         }

         var7 = this.field_7654.method_447();
      }

      class_1440 var8;
      int var10001;
      int var10002;
      int var10003;
      label62: {
         class_262 var10;
         class_1436 var13;
         if(var5 != null) {
            if(var7 != 0) {
               this.field_7652 = 5;
               var13 = this.field_7645;
               var10 = new class_262;
               var10.method_1511(0, var1, var2, var3, var4);
               var13.method_7821(var10);
               method_7836(this.field_7644, this, var1, var2, var3, var4);
               return;
            }

            var8 = this;
            var10001 = var1;
            var10002 = var2;
            var10003 = var3;
            if(var5 == null) {
               break label62;
            }

            var7 = this.method_7848(var1, var2, var3);
         }

         if(var7 != 0) {
            aji var6 = this.field_7644.cursorCounter6.getBlock(var1, var2, var3);
            if(var5 != null) {
               if(var6.method_2424() == awt.field_4170) {
                  this.field_7653 = false;
                  return;
               }

               this.field_7650 += var6.method_2465(this.field_7644.cursorCounter8, this.field_7644.cursorCounter8.field_2990, var1, var2, var3);
            }

            label65: {
               float var14;
               var7 = (var14 = this.field_7651 % 4.0F - 0.0F) == 0.0F?0:(var14 < 0.0F?-1:1);
               if(var5 != null) {
                  if(var7 == 0) {
                     class_1541 var11 = this.field_7644.method_5295();
                     class_1424 var9 = new class_1424;
                     bqx var12 = new bqx;
                     var12.method_8227(var6.field_2005.method_5995());
                     var9.method_7771(var12, (var6.field_2005.method_5992() + 1.0F) / 8.0F, var6.field_2005.method_5993() * 0.5F, (float)var1 + 0.5F, (float)var2 + 0.5F, (float)var3 + 0.5F);
                     var11.method_8366(var9);
                  }

                  ++this.field_7651;
                  var8 = this;
                  if(var5 == null) {
                     break label65;
                  }

                  float var15;
                  var7 = (var15 = this.field_7650 - 1.0F) == 0.0F?0:(var15 < 0.0F?-1:1);
               }

               if(var7 >= 0) {
                  this.field_7653 = false;
                  var13 = this.field_7645;
                  var10 = new class_262;
                  var10.method_1511(2, var1, var2, var3, var4);
                  var13.method_7821(var10);
                  this.method_7842(var1, var2, var3, var4);
                  this.field_7650 = 0.0F;
                  this.field_7651 = 0.0F;
                  this.field_7652 = 5;
               }

               var8 = this;
            }

            var8.field_7644.cursorCounter6.method_2217(this.field_7644.cursorCounter8.method_3845(), this.field_7646, this.field_7647, this.field_7648, (int)(this.field_7650 * 10.0F) - 1);
            if(var5 != null) {
               return;
            }
         }

         var8 = this;
         var10001 = var1;
         var10002 = var2;
         var10003 = var3;
      }

      var8.method_7843(var10001, var10002, var10003, var4);
   }

   // $FF: renamed from: e () float
   public float method_7846() {
      return this.field_7654.method_447()?5.0F:4.5F;
   }

   // $FF: renamed from: f () void
   public void method_7847() {
      String[] var10000 = class_752.method_4253();
      this.method_7849();
      String[] var1 = var10000;
      class_120 var2 = this.field_7645.method_7822();
      if(var1 != null) {
         if(var2.method_563()) {
            this.field_7645.method_7822().method_556();
            if(var1 != null) {
               return;
            }
         }

         var2 = this.field_7645.method_7822();
      }

      if(var1 != null) {
         if(var2.method_565() != null) {
            this.field_7645.method_7822().method_564().method_237(this.field_7645.method_7822().method_565());
            if(var1 != null) {
               return;
            }
         }

         var2 = this.field_7645.method_7822();
      }

      class_57 var3 = var2.method_564();
      class_1082 var10001 = new class_1082;
      var10001.method_6134("Disconnected from server");
      var3.method_237(var10001);
   }

   // $FF: renamed from: b (int, int, int) boolean
   private boolean method_7848(int var1, int var2, int var3) {
      add var10000;
      String[] var4;
      add var5;
      byte var7;
      label106: {
         label105: {
            var5 = this.field_7644.cursorCounter8.method_4214();
            var4 = class_752.method_4253();
            var10000 = this.field_7649;
            if(var4 != null) {
               if(this.field_7649 != null) {
                  break label105;
               }

               var10000 = var5;
            }

            if(var10000 == null) {
               var7 = 1;
               break label106;
            }
         }

         var7 = 0;
      }

      int var6;
      int var8;
      label109: {
         var6 = var7;
         var10000 = this.field_7649;
         if(var4 != null) {
            if(this.field_7649 == null) {
               break label109;
            }

            var10000 = var5;
         }

         if(var4 != null) {
            if(var10000 == null) {
               break label109;
            }

            var10000 = var5;
         }

         label86: {
            label110: {
               if(var4 != null) {
                  if(var10000.method_3730() != this.field_7649.method_3730()) {
                     break label110;
                  }

                  var10000 = var5;
               }

               var8 = add.method_3755(var10000, this.field_7649);
               if(var4 != null) {
                  if(var8 == 0) {
                     break label110;
                  }

                  var8 = var5.method_3741();
               }

               if(var4 == null) {
                  break label86;
               }

               if(var8 == 0) {
                  var8 = var5.method_3745();
                  if(var4 == null) {
                     break label86;
                  }

                  if(var8 != this.field_7649.method_3745()) {
                     break label110;
                  }
               }

               var8 = 1;
               break label86;
            }

            var8 = 0;
         }

         var6 = var8;
      }

      label111: {
         var8 = var1;
         int var10001 = this.field_7646;
         if(var4 != null) {
            if(var1 != this.field_7646) {
               break label111;
            }

            var8 = var2;
            var10001 = this.field_7647;
         }

         label112: {
            if(var4 != null) {
               if(var8 != var10001) {
                  break label111;
               }

               var8 = var3;
               if(var4 == null) {
                  break label112;
               }

               var10001 = this.field_7648;
            }

            if(var8 != var10001) {
               break label111;
            }

            var8 = var6;
         }

         if(var4 == null) {
            return (boolean)var8;
         }

         if(var8 != 0) {
            var8 = 1;
            return (boolean)var8;
         }
      }

      var8 = 0;
      return (boolean)var8;
   }

   // $FF: renamed from: g () void
   private void method_7849() {
      String[] var10000 = class_752.method_4253();
      int var2 = this.field_7644.cursorCounter8.field_3616.field_2846;
      String[] var1 = var10000;
      if(var1 != null) {
         if(var2 == this.field_7655) {
            return;
         }

         this.field_7655 = var2;
      }

      class_1436 var3 = this.field_7645;
      class_259 var10001 = new class_259;
      var10001.method_1497(this.field_7655);
      var3.method_7821(var10001);
   }

   // $FF: renamed from: b (yz, ahb, add, int, int, int, int, azw) boolean
   public boolean method_7850(class_792 var1, ahb var2, add var3, int var4, int var5, int var6, int var7, azw var8) {
      String[] var9;
      float var10;
      float var11;
      float var12;
      boolean var13;
      boolean var18;
      label70: {
         label73: {
            this.method_7849();
            var10 = (float)var8.field_4220 - (float)var4;
            String[] var10000 = class_752.method_4253();
            var11 = (float)var8.field_4221 - (float)var5;
            var9 = var10000;
            var12 = (float)var8.field_4222 - (float)var6;
            var13 = false;
            var18 = var1.method_3938();
            if(var9 != null) {
               if(var18 && var1.method_4214() != null) {
                  break label73;
               }

               var18 = var2.getBlock(var4, var5, var6).method_2481(var2, var4, var5, var6, var1, var7, var10, var11, var12);
            }

            if(var9 == null) {
               break label70;
            }

            if(var18) {
               var13 = true;
            }
         }

         var18 = var13;
      }

      if(var9 != null) {
         label58: {
            if(!var18) {
               label74: {
                  add var19 = var3;
                  if(var9 != null) {
                     if(var3 == null) {
                        break label74;
                     }

                     var19 = var3;
                  }

                  var18 = var19.method_3730() instanceof abh;
                  if(var9 == null) {
                     break label58;
                  }

                  if(var18) {
                     abh var14 = (abh)var3.method_3730();
                     var18 = var14.getBlock53(var2, var4, var5, var6, var7, var1, var3);
                     if(var9 == null) {
                        break label58;
                     }

                     if(!var18) {
                        return false;
                     }
                  }
               }
            }

            class_1436 var20 = this.field_7645;
            class_256 var10001 = new class_256;
            var10001.method_1477(var4, var5, var6, var7, var1.field_3616.method_3593(), var10, var11, var12);
            var20.method_7821(var10001);
            var18 = var13;
         }
      }

      if(var9 != null) {
         if(!var18) {
            if(var3 == null) {
               return false;
            }

            var18 = this.field_7654.method_447();
            if(var9 != null) {
               if(var18) {
                  int var17 = var3.method_3745();
                  int var15 = var3.field_2958;
                  boolean var16 = var3.method_3733(var1, var2, var4, var5, var6, var7, var10, var11, var12);
                  var3.method_3746(var17);
                  var3.field_2958 = var15;
                  return var16;
               }

               var18 = var3.method_3733(var1, var2, var4, var5, var6, var7, var10, var11, var12);
            }

            return var18;
         }

         var18 = true;
      }

      return var18;
   }

   // $FF: renamed from: b (yz, ahb, add) boolean
   public boolean method_7851(class_792 var1, ahb var2, add var3) {
      String[] var10000 = class_752.method_4253();
      this.method_7849();
      String[] var4 = var10000;
      class_1436 var7 = this.field_7645;
      class_256 var10001 = new class_256;
      var10001.method_1477(-1, -1, -1, 255, var1.field_3616.method_3593(), 0.0F, 0.0F, 0.0F);
      var7.method_7821(var10001);
      int var5 = var3.field_2958;
      add var6 = var3.method_3735(var2, var1);
      add var8 = var6;
      int var9;
      if(var4 != null) {
         if(var6 == var3) {
            label43: {
               label40: {
                  var8 = var6;
                  if(var4 != null) {
                     if(var6 == null) {
                        break label40;
                     }

                     var8 = var6;
                  }

                  var9 = var8.field_2958;
                  if(var4 == null) {
                     return (boolean)var9;
                  }

                  if(var9 != var5) {
                     break label43;
                  }
               }

               var9 = 0;
               return (boolean)var9;
            }
         }

         var1.field_3616.field_2844[var1.field_3616.field_2846] = var6;
         var8 = var6;
      }

      var9 = var8.field_2958;
      if(var4 != null) {
         if(var9 == 0) {
            var1.field_3616.field_2844[var1.field_3616.field_2846] = null;
         }

         var9 = 1;
      }

      return (boolean)var9;
   }

   // $FF: renamed from: b (ahb, vd) bjk
   public bjk method_7852(ahb var1, class_1699 var2) {
      bjk var10000 = new bjk;
      var10000.method_4674(this.field_7644, var1, this.field_7644.method_5285(), this.field_7645, var2);
      return var10000;
   }

   // $FF: renamed from: b (yz, sa) void
   public void method_7853(class_792 var1, class_689 var2) {
      this.method_7849();
      class_1436 var10000 = this.field_7645;
      class_269 var10001 = new class_269;
      var10001.method_1550(var2, class_915.field_4610);
      var10000.method_7821(var10001);
      var1.method_4595(var2);
   }

   // $FF: renamed from: c (yz, sa) boolean
   public boolean method_7854(class_792 var1, class_689 var2) {
      this.method_7849();
      class_1436 var10000 = this.field_7645;
      class_269 var10001 = new class_269;
      var10001.method_1550(var2, class_915.field_4609);
      var10000.method_7821(var10001);
      return var1.method_4592(var2);
   }

   // $FF: renamed from: b (int, int, int, int, yz) add
   public add method_7855(int var1, int var2, int var3, int var4, class_792 var5) {
      short var6 = var5.field_3619.method_3663(var5.field_3616);
      add var7 = var5.field_3619.method_3655(var2, var3, var4, var5);
      class_1436 var10000 = this.field_7645;
      class_272 var10001 = new class_272;
      var10001.method_1562(var1, var2, var3, var4, var7, var6);
      var10000.method_7821(var10001);
      return var7;
   }

   // $FF: renamed from: b (int, int) void
   public void method_7856(int var1, int var2) {
      class_1436 var10000 = this.field_7645;
      class_273 var10001 = new class_273;
      var10001.method_1570(var1, var2);
      var10000.method_7821(var10001);
   }

   // $FF: renamed from: b (add, int) void
   public void method_7857(add var1, int var2) {
      String[] var3 = class_752.method_4253();
      class_1440 var10000 = this;
      if(var3 != null) {
         if(!this.field_7654.method_447()) {
            return;
         }

         var10000 = this;
      }

      class_1436 var4 = var10000.field_7645;
      class_258 var10001 = new class_258;
      var10001.method_1493(var2, var1);
      var4.method_7821(var10001);
   }

   // $FF: renamed from: b (add) void
   public void method_7858(add var1) {
      if(this.field_7654.method_447() && var1 != null) {
         class_1436 var10000 = this.field_7645;
         class_258 var10001 = new class_258;
         var10001.method_1493(-1, var1);
         var10000.method_7821(var10001);
      }

   }

   // $FF: renamed from: d (yz) void
   public void method_7859(class_792 var1) {
      this.method_7849();
      class_1436 var10000 = this.field_7645;
      class_262 var10001 = new class_262;
      var10001.method_1511(5, 0, 0, 0, 255);
      var10000.method_7821(var10001);
      var1.method_4559();
   }

   // $FF: renamed from: h () boolean
   public boolean method_7860() {
      return this.field_7654.method_448();
   }

   // $FF: renamed from: i () boolean
   public boolean method_7861() {
      String[] var1 = class_752.method_4253();
      boolean var10000 = this.field_7654.method_447();
      if(var1 != null) {
         var10000 = !var10000;
      }

      return var10000;
   }

   // $FF: renamed from: j () boolean
   public boolean method_7862() {
      return this.field_7654.method_447();
   }

   // $FF: renamed from: k () boolean
   public boolean method_7863() {
      return this.field_7654.method_447();
   }

   // $FF: renamed from: l () boolean
   public boolean method_7864() {
      boolean var10000;
      label24: {
         String[] var1 = class_752.method_4253();
         var10000 = this.field_7644.cursorCounter8.method_3937();
         if(var1 != null) {
            if(!var10000) {
               break label24;
            }

            var10000 = this.field_7644.cursorCounter8.field_2988 instanceof class_772;
         }

         if(var1 == null) {
            return var10000;
         }

         if(var10000) {
            var10000 = true;
            return var10000;
         }
      }

      var10000 = false;
      return var10000;
   }

   // $FF: renamed from: <clinit> () void
   static void method_7865() {
      boolean var10000 = true;
      char[] var10003 = "\\ßÚÀ}ØÈjÁÚÑÜnÞ".toCharArray();
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
            field_7656 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 222;
            break;
         case 1:
            var10009 = 190;
            break;
         case 2:
            var10009 = 106;
            break;
         case 3:
            var10009 = 60;
            break;
         case 4:
            var10009 = 62;
            break;
         case 5:
            var10009 = 114;
            break;
         default:
            var10009 = 104;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}
