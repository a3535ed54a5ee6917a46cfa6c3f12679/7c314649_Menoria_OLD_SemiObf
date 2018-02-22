
// $FF: renamed from: wM
public class class_778 extends class_776 {

   // $FF: renamed from: bH yU
   private class_1745 field_3553;
   // $FF: renamed from: bI java.lang.String
   private static final String field_3554;
   // $FF: renamed from: jb java.lang.String[]
   private static final String[] field_3555;


   // $FF: renamed from: <init> (ahb) void
   public void method_3847(ahb var1) {
      super.method_3847(var1);
      this.method_3852(0.6F, 0.8F);
      this.method_4257().method_9784(true);
      class_1776 var10000 = this.field_3373;
      class_1734 var10002 = new class_1734;
      var10002.method_9665(this);
      var10000.method_9766(1, var10002);
      this.field_3373.method_9766(2, this.field_3543);
      var10000 = this.field_3373;
      class_1745 var10003 = new class_1745;
      var10003.method_9691(this, 0.6D, class_1010.field_5206, true);
      var10000.method_9766(3, this.field_3553 = var10003);
      var10000 = this.field_3373;
      class_1743 var3 = new class_1743;
      var3.method_9687(this, class_792.class, 16.0F, 0.8D, 1.33D);
      var10000.method_9766(4, var3);
      var10000 = this.field_3373;
      class_1733 var4 = new class_1733;
      var4.method_9664(this, 1.0D, 10.0F, 5.0F);
      var10000.method_9766(5, var4);
      var10000 = this.field_3373;
      class_1758 var5 = new class_1758;
      var5.method_9713(this, 1.33D);
      var10000.method_9766(6, var5);
      var10000 = this.field_3373;
      class_1731 var6 = new class_1731;
      var6.method_9661(this, 0.3F);
      var10000.method_9766(7, var6);
      var10000 = this.field_3373;
      class_1759 var7 = new class_1759;
      var7.method_9717(this);
      var10000.method_9766(8, var7);
      var10000 = this.field_3373;
      class_1741 var8 = new class_1741;
      var8.method_9681(this, 0.8D);
      var10000.method_9766(9, var8);
      var10000 = this.field_3373;
      class_1753 var9 = new class_1753;
      var9.method_9705(this, 0.8D);
      var10000.method_9766(10, var9);
      var10000 = this.field_3373;
      class_1728 var10 = new class_1728;
      var10.method_9657(this, class_792.class, 10.0F);
      var10000.method_9766(11, var10);
      var10000 = this.field_3374;
      class_1772 var2 = new class_1772;
      var2.method_9744(this, class_775.class, 750, false);
      var10000.method_9766(1, var2);
   }

   // $FF: renamed from: c () void
   protected void method_3848() {
      super.method_3848();
      this.field_3036.method_9497(18, Byte.valueOf((byte)0));
   }

   // $FF: renamed from: bp () void
   public void method_4235() {
      String[] var1 = class_752.method_4253();
      class_778 var10000 = this;
      if(var1 != null) {
         if(this.method_4255().method_9981()) {
            label35: {
               double var2 = this.method_4255().method_9982();
               double var5;
               int var4 = (var5 = var2 - 0.6D) == 0.0D?0:(var5 < 0.0D?-1:1);
               if(var1 != null) {
                  if(var4 == 0) {
                     this.method_3939(true);
                     this.method_3941(false);
                     if(var1 != null) {
                        break label35;
                     }
                  }

                  double var6;
                  var4 = (var6 = var2 - 1.33D) == 0.0D?0:(var6 < 0.0D?-1:1);
               }

               if(var4 == 0) {
                  this.method_3939(false);
                  this.method_3941(true);
                  if(var1 != null) {
                     break label35;
                  }
               }

               this.method_3939(false);
               this.method_3941(false);
            }

            if(var1 != null) {
               return;
            }
         }

         this.method_3939(false);
         var10000 = this;
      }

      var10000.method_3941(false);
   }

   // $FF: renamed from: v () boolean
   protected boolean method_4269() {
      int var10000;
      label24: {
         String[] var1 = class_752.method_4253();
         var10000 = this.method_4476();
         if(var1 != null) {
            if(var10000 != 0) {
               break label24;
            }

            var10000 = this.field_3029;
         }

         if(var1 == null) {
            return (boolean)var10000;
         }

         if(var10000 > 2400) {
            var10000 = 1;
            return (boolean)var10000;
         }
      }

      var10000 = 0;
      return (boolean)var10000;
   }

   // $FF: renamed from: bk () boolean
   public boolean method_4225() {
      return true;
   }

   // $FF: renamed from: aD () void
   protected void method_4157() {
      super.method_4157();
      this.method_4211(class_1840.field_9390).method_390(10.0D);
      this.method_4211(class_1840.field_9393).method_390(0.30000001192092896D);
   }

   // $FF: renamed from: b (float) void
   protected void method_3874(float var1) {}

   // $FF: renamed from: b (ro) void
   public void method_3909(class_1583 var1) {
      super.method_3909(var1);
      String[] var10001 = field_3555;
      var1.method_8667("CatType", this.method_4499());
   }

   // $FF: renamed from: a (ro) void
   public void method_3908(class_1583 var1) {
      super.method_3908(var1);
      String[] var10002 = field_3555;
      this.method_4500(var1.method_8681("CatType"));
   }

   // $FF: renamed from: t () java.lang.String
   protected String method_4266() {
      String[] var1 = class_752.method_4253();
      int var10000 = this.method_4476();
      String var3;
      if(var1 != null) {
         if(var10000 == 0) {
            var3 = "";
            return var3;
         }

         var10000 = this.method_4381();
      }

      String[] var2;
      if(var1 != null) {
         if(var10000 != 0) {
            var2 = field_3555;
            var3 = "mob.cat.purr";
            return var3;
         }

         var10000 = this.field_3028.nextInt(4);
      }

      if(var10000 == 0) {
         var2 = field_3555;
         var3 = "mob.cat.purreow";
      } else {
         String[] var4 = field_3555;
         var3 = "mob.cat.meow";
      }

      return var3;
   }

   // $FF: renamed from: aT () java.lang.String
   protected String method_4193() {
      String[] var10000 = field_3555;
      return "mob.cat.hitt";
   }

   // $FF: renamed from: aU () java.lang.String
   protected String method_4194() {
      String[] var10000 = field_3555;
      return "mob.cat.hitt";
   }

   // $FF: renamed from: bf () float
   protected float method_4216() {
      return 0.4F;
   }

   // $FF: renamed from: u () adb
   protected adb method_4267() {
      return class_1010.field_5192;
   }

   // $FF: renamed from: n (sa) boolean
   public boolean method_4228(class_689 var1) {
      return var1.method_3896(class_1691.method_9324(this), 3.0F);
   }

   // $FF: renamed from: a (vX, float) boolean
   public boolean method_3896(class_1691 var1, float var2) {
      String[] var3 = class_752.method_4253();
      boolean var10000 = this.method_3961();
      if(var3 != null) {
         if(var10000) {
            return false;
         }

         this.field_3543.method_9697(false);
         var10000 = super.method_3896(var1, var2);
      }

      return var10000;
   }

   // $FF: renamed from: b (boolean, int) void
   protected void method_4196(boolean var1, int var2) {}

   // $FF: renamed from: a (yz) boolean
   public boolean method_4295(class_792 var1) {
      int var5;
      label100: {
         String[] var10000 = class_752.method_4253();
         add var3 = var1.field_3616.method_3593();
         String[] var2 = var10000;
         var5 = this.method_4476();
         if(var2 != null) {
            if(var5 != 0) {
               var5 = this.method_4482(var1);
               if(var2 == null) {
                  return (boolean)var5;
               }

               if(var5 == 0) {
                  break label100;
               }

               var5 = this.field_2990.field_1832;
               if(var2 == null) {
                  return (boolean)var5;
               }

               if(this.field_2990.field_1832) {
                  break label100;
               }

               var5 = this.method_4378(var3);
               if(var2 == null) {
                  return (boolean)var5;
               }

               if(var5 != 0) {
                  break label100;
               }

               class_1748 var6 = this.field_3543;
               boolean var10001 = this.method_4478();
               if(var2 != null) {
                  var10001 = !var10001;
               }

               var6.method_9697(var10001);
               if(var2 != null) {
                  break label100;
               }
            }

            var5 = this.field_3553.method_9692();
         }

         if(var2 == null) {
            return (boolean)var5;
         }

         if(var5 != 0) {
            label79: {
               add var7 = var3;
               if(var2 != null) {
                  if(var3 == null) {
                     break label79;
                  }

                  var7 = var3;
               }

               if(var7.method_3730() == class_1010.field_5206) {
                  double var8;
                  var5 = (var8 = var1.method_3891(this) - 9.0D) == 0.0D?0:(var8 < 0.0D?-1:1);
                  if(var2 == null) {
                     return (boolean)var5;
                  }

                  if(var5 < 0) {
                     var5 = var1.field_3640.field_2839;
                     if(var2 != null) {
                        if(!var1.field_3640.field_2839) {
                           --var3.field_2958;
                        }

                        var5 = var3.field_2958;
                     }

                     if(var2 != null) {
                        if(var5 <= 0) {
                           var1.field_3616.method_87(var1.field_3616.field_2846, (add)null);
                        }

                        var5 = this.field_2990.field_1832;
                     }

                     if(var2 != null) {
                        if(var5 == 0) {
                           label58: {
                              class_778 var4 = this;
                              if(var2 != null) {
                                 if(this.field_3028.nextInt(3) == 0) {
                                    this.method_4477(true);
                                    this.method_4500(1 + this.field_2990.field_1819.nextInt(3));
                                    this.method_4480(var1.method_3972().toString());
                                    this.method_4475(true);
                                    this.field_3543.method_9697(true);
                                    this.field_2990.method_2191(this, (byte)7);
                                    if(var2 != null) {
                                       break label58;
                                    }
                                 }

                                 this.method_4475(false);
                                 var4 = this;
                              }

                              var4.field_2990.method_2191(this, (byte)6);
                           }
                        }

                        var5 = 1;
                     }

                     return (boolean)var5;
                  }
               }
            }
         }
      }

      var5 = super.method_4295(var1);
      return (boolean)var5;
   }

   // $FF: renamed from: a (wJ) wM
   public class_778 method_4498(class_767 var1) {
      String[] var10000 = class_752.method_4253();
      class_778 var10001 = new class_778;
      var10001.method_3847(this.field_2990);
      class_778 var3 = var10001;
      String[] var2 = var10000;
      class_778 var4 = this;
      if(var2 != null) {
         if(this.method_4476()) {
            var3.method_4480(this.method_382());
            var3.method_4477(true);
            var3.method_4500(this.method_4499());
         }

         var4 = var3;
      }

      return var4;
   }

   // $FF: renamed from: d (add) boolean
   public boolean method_4378(add var1) {
      boolean var3;
      label17: {
         String[] var2 = class_752.method_4253();
         add var10000 = var1;
         if(var2 != null) {
            if(var1 == null) {
               break label17;
            }

            var10000 = var1;
         }

         if(var10000.method_3730() == class_1010.field_5206) {
            var3 = true;
            return var3;
         }
      }

      var3 = false;
      return var3;
   }

   // $FF: renamed from: b (wK) boolean
   public boolean method_4383(class_769 var1) {
      String[] var2 = class_752.method_4253();
      if(var1 == this) {
         return false;
      } else {
         boolean var10000;
         class_769 var4;
         label56: {
            var10000 = this.method_4476();
            if(var2 != null) {
               if(!var10000) {
                  return false;
               }

               var4 = var1;
               if(var2 == null) {
                  break label56;
               }

               var10000 = var1 instanceof class_778;
            }

            if(!var10000) {
               return false;
            }

            var4 = var1;
         }

         class_778 var3 = (class_778)var4;
         var10000 = var3.method_4476();
         if(var2 != null) {
            if(!var10000) {
               var10000 = false;
               return var10000;
            }

            var10000 = this.method_4381();
         }

         label59: {
            if(var2 != null) {
               if(!var10000) {
                  break label59;
               }

               var10000 = var3.method_4381();
            }

            if(var2 == null) {
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
   }

   // $FF: renamed from: bT () int
   public int method_4499() {
      return this.field_3036.method_9499(18);
   }

   // $FF: renamed from: a (int) void
   public void method_4500(int var1) {
      this.field_3036.method_9506(18, Byte.valueOf((byte)var1));
   }

   // $FF: renamed from: by () boolean
   public boolean method_4274() {
      String[] var1 = class_752.method_4253();
      int var10000 = this.field_2990.field_1819.nextInt(3);
      if(var1 != null) {
         if(var10000 == 0) {
            return false;
         }

         var10000 = this.field_2990.method_2117(this.field_3004);
      }

      if(var1 != null) {
         if(var10000 != 0) {
            var10000 = this.field_2990.method_2096(this, this.field_3004).isEmpty();
            if(var1 == null) {
               return (boolean)var10000;
            }

            if(var10000 != 0) {
               var10000 = this.field_2990.method_2120(this.field_3004);
               if(var1 == null) {
                  return (boolean)var10000;
               }

               if(var10000 == 0) {
                  label58: {
                     int var2 = class_1715.method_9561(this.field_2994);
                     int var3 = class_1715.method_9561(this.field_3004.field_6910);
                     int var4 = class_1715.method_9561(this.field_2996);
                     var10000 = var3;
                     if(var1 != null) {
                        if(var3 >= 63) {
                           aji var5 = this.field_2990.getBlock(var2, var3 - 1, var4);
                           aji var6 = var5;
                           if(var1 != null) {
                              if(var5 == class_1192.field_6027) {
                                 return true;
                              }

                              var6 = var5;
                           }

                           if(var6.method_2424() != awt.field_4179) {
                              break label58;
                           }

                           return true;
                        }

                        var10000 = 0;
                     }

                     return (boolean)var10000;
                  }
               }
            }
         }

         var10000 = 0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: b_ () java.lang.String
   public String method_4284() {
      class_778 var2;
      String var4;
      label26: {
         String[] var1 = class_752.method_4253();
         boolean var10000 = this.method_4288();
         if(var1 != null) {
            if(var10000) {
               var4 = this.method_4287();
               return var4;
            }

            var2 = this;
            if(var1 == null) {
               break label26;
            }

            var10000 = this.method_4476();
         }

         if(var10000) {
            String[] var3 = field_3555;
            var4 = class_1563.method_8581("entity.Cat.name");
            return var4;
         }

         var2 = this;
      }

      var4 = var2.method_4284();
      return var4;
   }

   // $FF: renamed from: a (xY) xY
   public class_83 method_4282(class_83 var1) {
      String[] var2 = class_752.method_4253();
      class_83 var10000 = super.method_4282(var1);
      if(var2 != null) {
         var1 = var10000;
         if(this.field_2990.field_1819.nextInt(7) == 0) {
            int var3 = 0;

            while(var3 < 2) {
               class_778 var5 = new class_778;
               var5.method_3847(this.field_2990);
               class_778 var4 = var5;
               var4.method_3887(this.field_2994, this.field_2995, this.field_2996, this.field_3000, 0.0F);
               var4.method_4356(-24000);
               this.field_2990.method_2089(var4);
               ++var3;
               if(var2 == null) {
                  break;
               }
            }
         }

         var10000 = var1;
      }

      return var10000;
   }

   // $FF: renamed from: <clinit> () void
   static void method_4384() {
      // $FF: Couldn't be decompiled
   }
}
