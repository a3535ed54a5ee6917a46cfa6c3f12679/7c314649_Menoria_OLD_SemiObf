import java.util.List;

// $FF: renamed from: wK
public abstract class class_769 extends class_767 implements class_9 {

   // $FF: renamed from: bC int
   private int field_3485;
   // $FF: renamed from: bD int
   private int field_3486;
   // $FF: renamed from: bE yz
   private class_792 field_3487;
   // $FF: renamed from: bF java.lang.String
   private static final String field_3488;
   // $FF: renamed from: hb java.lang.String[]
   private static final String[] field_3489;


   // $FF: renamed from: <init> (ahb) void
   public void method_3847(ahb var1) {
      super.method_3847(var1);
   }

   // $FF: renamed from: bp () void
   protected void method_4235() {
      String[] var1 = class_752.method_4253();
      class_769 var10000 = this;
      if(var1 != null) {
         if(this.method_4354() != 0) {
            this.field_3485 = 0;
         }

         var10000 = this;
      }

      var10000.method_4235();
   }

   // $FF: renamed from: e () void
   public void method_4231() {
      class_769 var9;
      label37: {
         super.method_4231();
         String[] var1 = class_752.method_4253();
         int var10000 = this.method_4354();
         if(var1 != null) {
            if(var10000 != 0) {
               this.field_3485 = 0;
            }

            var9 = this;
            if(var1 == null) {
               break label37;
            }

            var10000 = this.field_3485;
         }

         if(var10000 > 0) {
            label23: {
               --this.field_3485;
               String[] var10 = field_3489;
               String var2 = "heart";
               var9 = this;
               if(var1 != null) {
                  if(this.field_3485 % 10 != 0) {
                     break label23;
                  }

                  var9 = this;
               }

               double var3 = var9.field_3028.nextGaussian() * 0.02D;
               double var5 = this.field_3028.nextGaussian() * 0.02D;
               double var7 = this.field_3028.nextGaussian() * 0.02D;
               this.field_2990.method_2087(var2, this.field_2994 + (double)(this.field_3028.nextFloat() * this.field_3014 * 2.0F) - (double)this.field_3014, this.field_2995 + 0.5D + (double)(this.field_3028.nextFloat() * this.field_3015), this.field_2996 + (double)(this.field_3028.nextFloat() * this.field_3014 * 2.0F) - (double)this.field_3014, var3, var5, var7);
            }

            if(var1 != null) {
               return;
            }
         }

         var9 = this;
      }

      var9.field_3486 = 0;
   }

   // $FF: renamed from: a (sa, float) void
   protected void method_4330(class_689 var1, float var2) {
      String[] var3;
      class_769 var10;
      class_689 var11;
      label125: {
         var3 = class_752.method_4253();
         boolean var10000 = var1 instanceof class_792;
         if(var3 != null) {
            if(var10000) {
               if(var2 < 3.0F) {
                  double var4 = var1.field_2994 - this.field_2994;
                  double var6 = var1.field_2996 - this.field_2996;
                  this.field_3000 = (float)(Math.atan2(var6, var4) * 180.0D / 3.141592653589793D) - 90.0F;
                  this.field_3434 = true;
               }

               label108: {
                  label107: {
                     class_792 var8 = (class_792)var1;
                     if(var8.method_4593() != null) {
                        var10 = this;
                        if(var3 == null) {
                           break label107;
                        }

                        if(this.method_4378(var8.method_4593())) {
                           break label108;
                        }
                     }

                     var10 = this;
                  }

                  var10.field_3433 = null;
               }

               if(var3 != null) {
                  return;
               }
            }

            var11 = var1;
            if(var3 == null) {
               break label125;
            }

            var10000 = var1 instanceof class_769;
         }

         if(!var10000) {
            return;
         }

         var11 = var1;
      }

      label128: {
         class_769 var9 = (class_769)var11;
         int var12 = this.method_4354();
         if(var3 != null) {
            label129: {
               if(var12 > 0) {
                  var12 = var9.method_4354();
                  if(var3 == null) {
                     break label129;
                  }

                  if(var12 < 0) {
                     if((double)var2 >= 2.5D) {
                        return;
                     }

                     this.field_3434 = true;
                     if(var3 != null) {
                        return;
                     }
                  }
               }

               var10 = this;
               if(var3 == null) {
                  break label128;
               }

               var12 = this.field_3485;
            }
         }

         if(var12 > 0) {
            var10 = var9;
            if(var3 == null) {
               break label128;
            }

            if(var9.field_3485 > 0) {
               label130: {
                  var11 = var9.field_3433;
                  if(var3 != null) {
                     if(var9.field_3433 == null) {
                        var9.field_3433 = this;
                     }

                     var10 = var9;
                     if(var3 == null) {
                        break label130;
                     }

                     var11 = var9.field_3433;
                  }

                  if(var11 == this) {
                     label132: {
                        double var13;
                        var12 = (var13 = (double)var2 - 3.5D) == 0.0D?0:(var13 < 0.0D?-1:1);
                        if(var3 != null) {
                           if(var12 >= 0) {
                              break label132;
                           }

                           ++var9.field_3485;
                           ++this.field_3485;
                           ++this.field_3486;
                           var12 = this.field_3486 % 4;
                        }

                        label133: {
                           if(var3 != null) {
                              if(var12 == 0) {
                                 String[] var10001 = field_3489;
                                 this.field_2990.method_2087("heart", this.field_2994 + (double)(this.field_3028.nextFloat() * this.field_3014 * 2.0F) - (double)this.field_3014, this.field_2995 + 0.5D + (double)(this.field_3028.nextFloat() * this.field_3015), this.field_2996 + (double)(this.field_3028.nextFloat() * this.field_3014 * 2.0F) - (double)this.field_3014, 0.0D, 0.0D, 0.0D);
                              }

                              var10 = this;
                              if(var3 == null) {
                                 break label133;
                              }

                              var12 = this.field_3486;
                           }

                           if(var12 != 60) {
                              return;
                           }

                           var10 = this;
                        }

                        var10.method_4377((class_769)var1);
                        if(var3 != null) {
                           return;
                        }
                     }
                  }

                  var10 = this;
               }

               var10.field_3486 = 0;
               if(var3 != null) {
                  return;
               }
            }
         }

         this.field_3486 = 0;
         var10 = this;
      }

      var10.field_3433 = null;
   }

   // $FF: renamed from: a (wK) void
   private void method_4377(class_769 var1) {
      class_767 var3 = this.method_4353(var1);
      String[] var2 = class_752.method_4253();
      if(var3 != null) {
         byte var12;
         label49: {
            Object var11;
            label54: {
               class_792 var10000 = this.field_3487;
               if(var2 != null) {
                  label55: {
                     if(this.field_3487 == null) {
                        var10000 = var1.method_4380();
                        if(var2 == null) {
                           break label55;
                        }

                        if(var10000 != null) {
                           this.field_3487 = var1.method_4380();
                        }
                     }

                     var11 = this;
                     if(var2 == null) {
                        break label54;
                     }

                     var10000 = this.field_3487;
                  }
               }

               if(var10000 != null) {
                  this.field_3487.method_4614(class_1698.field_8903);
                  var12 = this instanceof class_773;
                  if(var2 == null) {
                     break label49;
                  }

                  if(var12 != 0) {
                     this.field_3487.method_4614(class_1600.field_8358);
                  }
               }

               this.method_4356(6000);
               var1.method_4356(6000);
               this.field_3485 = 0;
               this.field_3486 = 0;
               this.field_3433 = null;
               var1.field_3433 = null;
               var1.field_3486 = 0;
               var1.field_3485 = 0;
               var3.method_4356(-24000);
               var11 = var3;
            }

            ((class_767)var11).method_3887(this.field_2994, this.field_2995, this.field_2996, this.field_3000, this.field_3001);
            var12 = 0;
         }

         int var4 = var12;

         while(true) {
            if(var4 < 7) {
               double var5 = this.field_3028.nextGaussian() * 0.02D;
               double var7 = this.field_3028.nextGaussian() * 0.02D;
               double var9 = this.field_3028.nextGaussian() * 0.02D;
               String[] var10001 = field_3489;
               this.field_2990.method_2087("heart", this.field_2994 + (double)(this.field_3028.nextFloat() * this.field_3014 * 2.0F) - (double)this.field_3014, this.field_2995 + 0.5D + (double)(this.field_3028.nextFloat() * this.field_3015), this.field_2996 + (double)(this.field_3028.nextFloat() * this.field_3014 * 2.0F) - (double)this.field_3014, var5, var7, var9);
               ++var4;
               if(var2 == null) {
                  break;
               }

               if(var2 != null) {
                  continue;
               }
            }

            this.field_2990.method_2089(var3);
            break;
         }
      }

   }

   // $FF: renamed from: a (vX, float) boolean
   public boolean method_3896(class_1691 var1, float var2) {
      String[] var3 = class_752.method_4253();
      boolean var10000 = this.method_3961();
      if(var3 != null) {
         if(var10000) {
            return false;
         }

         this.field_3435 = 60;
         var10000 = this.method_4225();
      }

      if(var3 != null) {
         label24: {
            if(!var10000) {
               class_80 var4 = this.method_4211(class_1840.field_9393);
               if(var3 == null) {
                  break label24;
               }

               if(var4.method_392(field_3430) == null) {
                  var4.method_393(field_3431);
               }
            }

            this.field_3433 = null;
            this.field_3485 = 0;
         }

         var10000 = super.method_3896(var1, var2);
      }

      return var10000;
   }

   // $FF: renamed from: b (int, int, int) float
   public float method_4331(int var1, int var2, int var3) {
      String[] var4 = class_752.method_4253();
      ahb var10000 = this.field_2990;
      int var10001 = var1;
      int var10002 = var2 - 1;
      int var10003 = var3;
      float var5;
      if(var4 != null) {
         if(this.field_2990.getBlock(var1, var10002, var3) == class_1192.field_6027) {
            var5 = 10.0F;
            return var5;
         }

         var10000 = this.field_2990;
         var10001 = var1;
         var10002 = var2;
         var10003 = var3;
      }

      var5 = var10000.method_2077(var10001, var10002, var10003) - 0.5F;
      return var5;
   }

   // $FF: renamed from: b (ro) void
   public void method_3909(class_1583 var1) {
      super.method_3909(var1);
      String[] var10001 = field_3489;
      var1.method_8667("InLove", this.field_3485);
   }

   // $FF: renamed from: a (ro) void
   public void method_3908(class_1583 var1) {
      super.method_3908(var1);
      String[] var10002 = field_3489;
      this.field_3485 = var1.method_8681("InLove");
   }

   // $FF: renamed from: bR () sa
   protected class_689 method_4332() {
      String[] var1 = class_752.method_4253();
      if(this.field_3435 > 0) {
         return null;
      } else {
         float var2 = 8.0F;
         int var10000 = this.field_3485;
         List var3;
         int var4;
         class_769 var5;
         class_769 var7;
         if(var1 != null) {
            if(this.field_3485 > 0) {
               var3 = this.field_2990.method_2157(this.getClass(), this.field_3004.method_7097((double)var2, (double)var2, (double)var2));
               var4 = 0;

               do {
                  if(var4 >= var3.size()) {
                     return null;
                  }

                  var5 = (class_769)var3.get(var4);
                  if(var1 != null) {
                     if(var5 != this) {
                        label88: {
                           var7 = var5;
                           if(var1 != null) {
                              if(var5.field_3485 <= 0) {
                                 break label88;
                              }

                              var7 = var5;
                           }

                           return var7;
                        }
                     }

                     ++var4;
                  }
               } while(var1 != null);
            }

            var10000 = this.method_4354();
         }

         label109: {
            if(var1 != null) {
               if(var10000 == 0) {
                  var3 = this.field_2990.method_2157(class_792.class, this.field_3004.method_7097((double)var2, (double)var2, (double)var2));
                  var4 = 0;

                  do {
                     if(var4 >= var3.size()) {
                        return null;
                     }

                     class_792 var6 = (class_792)var3.get(var4);
                     if(var1 != null) {
                        if(var6.method_4593() != null && this.method_4378(var6.method_4593())) {
                           return var6;
                        }

                        ++var4;
                     }
                  } while(var1 != null);
               }

               var7 = this;
               if(var1 == null) {
                  break label109;
               }

               var10000 = this.method_4354();
            }

            if(var10000 <= 0) {
               return null;
            }

            var7 = this;
         }

         var3 = var7.field_2990.method_2157(this.getClass(), this.field_3004.method_7097((double)var2, (double)var2, (double)var2));
         var4 = 0;

         while(var4 < var3.size()) {
            var5 = (class_769)var3.get(var4);
            if(var1 != null) {
               if(var5 != this) {
                  label58: {
                     var7 = var5;
                     if(var1 != null) {
                        if(var5.method_4354() >= 0) {
                           break label58;
                        }

                        var7 = var5;
                     }

                     return var7;
                  }
               }

               ++var4;
            }

            if(var1 == null) {
               break;
            }
         }

         return null;
      }
   }

   // $FF: renamed from: by () boolean
   public boolean method_4274() {
      int var5;
      label32: {
         int var2 = class_1715.method_9561(this.field_2994);
         int var3 = class_1715.method_9561(this.field_3004.field_6910);
         String[] var1 = class_752.method_4253();
         int var4 = class_1715.method_9561(this.field_2996);
         ahb var10000 = this.field_2990;
         int var10001 = var2;
         int var10002 = var3 - 1;
         int var10003 = var4;
         if(var1 != null) {
            if(this.field_2990.getBlock(var2, var10002, var4) != class_1192.field_6027) {
               break label32;
            }

            var10000 = this.field_2990;
            var10001 = var2;
            var10002 = var3;
            var10003 = var4;
         }

         var5 = var10000.method_2068(var10001, var10002, var10003);
         if(var1 != null) {
            if(var5 <= 8) {
               break label32;
            }

            var5 = super.method_4274();
         }

         if(var1 == null) {
            return (boolean)var5;
         }

         if(var5 != 0) {
            var5 = 1;
            return (boolean)var5;
         }
      }

      var5 = 0;
      return (boolean)var5;
   }

   // $FF: renamed from: q () int
   public int method_4263() {
      return 120;
   }

   // $FF: renamed from: v () boolean
   protected boolean method_4269() {
      return false;
   }

   // $FF: renamed from: e (yz) int
   protected int method_4163(class_792 var1) {
      return 1 + this.field_2990.field_1819.nextInt(3);
   }

   // $FF: renamed from: d (add) boolean
   public boolean method_4378(add var1) {
      return var1.method_3730() == class_1010.field_5154;
   }

   // $FF: renamed from: a (yz) boolean
   public boolean method_4295(class_792 var1) {
      String[] var10000 = class_752.method_4253();
      add var3 = var1.field_3616.method_3593();
      String[] var2 = var10000;
      int var4;
      if(var3 != null) {
         var4 = this.method_4378(var3);
         if(var2 == null) {
            return (boolean)var4;
         }

         if(var4 != 0) {
            var4 = this.method_4354();
            if(var2 == null) {
               return (boolean)var4;
            }

            if(var4 == 0) {
               var4 = this.field_3485;
               if(var2 == null) {
                  return (boolean)var4;
               }

               if(this.field_3485 <= 0) {
                  var4 = var1.field_3640.field_2839;
                  if(var2 != null) {
                     if(!var1.field_3640.field_2839) {
                        --var3.field_2958;
                        var4 = var3.field_2958;
                        if(var2 == null) {
                           return (boolean)var4;
                        }

                        if(var3.field_2958 <= 0) {
                           var1.field_3616.method_87(var1.field_3616.field_2846, (add)null);
                        }
                     }

                     this.method_4379(var1);
                     var4 = 1;
                  }

                  return (boolean)var4;
               }
            }
         }
      }

      var4 = super.method_4295(var1);
      return (boolean)var4;
   }

   // $FF: renamed from: b (yz) void
   public void method_4379(class_792 var1) {
      this.field_3485 = 600;
      this.field_3487 = var1;
      this.field_3433 = null;
      this.field_2990.method_2191(this, (byte)18);
   }

   // $FF: renamed from: a9 () yz
   public class_792 method_4380() {
      return this.field_3487;
   }

   // $FF: renamed from: a_ () boolean
   public boolean method_4381() {
      String[] var1 = class_752.method_4253();
      int var10000 = this.field_3485;
      if(var1 != null) {
         var10000 = this.field_3485 > 0?1:0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: bw () void
   public void method_4382() {
      this.field_3485 = 0;
   }

   // $FF: renamed from: b (wK) boolean
   public boolean method_4383(class_769 var1) {
      String[] var2 = class_752.method_4253();
      class_769 var10000 = var1;
      boolean var3;
      if(var2 != null) {
         if(var1 == this) {
            var3 = false;
            return var3;
         }

         var10000 = var1;
      }

      if(var2 != null) {
         if(var10000.getClass() != this.getClass()) {
            var3 = false;
            return var3;
         }

         var10000 = this;
      }

      label43: {
         var3 = var10000.method_4381();
         if(var2 != null) {
            if(!var3) {
               break label43;
            }

            var3 = var1.method_4381();
         }

         if(var2 == null) {
            return var3;
         }

         if(var3) {
            var3 = true;
            return var3;
         }
      }

      var3 = false;
      return var3;
   }

   // $FF: renamed from: a (byte) void
   public void method_3932(byte var1) {
      label32: {
         String[] var2 = class_752.method_4253();
         byte var10000 = var1;
         if(var2 != null) {
            if(var1 != 18) {
               break label32;
            }

            var10000 = 0;
         }

         int var3 = var10000;

         while(var3 < 7) {
            double var4 = this.field_3028.nextGaussian() * 0.02D;
            double var6 = this.field_3028.nextGaussian() * 0.02D;
            double var8 = this.field_3028.nextGaussian() * 0.02D;
            String[] var10001 = field_3489;
            this.field_2990.method_2087("heart", this.field_2994 + (double)(this.field_3028.nextFloat() * this.field_3014 * 2.0F) - (double)this.field_3014, this.field_2995 + 0.5D + (double)(this.field_3028.nextFloat() * this.field_3015), this.field_2996 + (double)(this.field_3028.nextFloat() * this.field_3014 * 2.0F) - (double)this.field_3014, var4, var6, var8);
            ++var3;
            if(var2 == null) {
               return;
            }

            if(var2 == null) {
               break;
            }
         }

         if(var2 != null) {
            return;
         }
      }

      super.method_3932(var1);
   }

   // $FF: renamed from: <clinit> () void
   static void method_4384() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "Û?ÒrXðì0³Ql8ú4ÿoZæ";
      int var4 = "Û?ÒrXðì0³Ql8ú4ÿoZæ".length();
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
            char[] var11 = var8;
            var8 = var10003;
            if(var10003 <= var6) {
               var5[var3++] = (new String((char[])var9)).intern();
               if((var0 += var1) >= var4) {
                  field_3489 = var5;
                  String[] var10 = field_3489;
                  field_3488 = "CL_00001638";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 65;
               break;
            case 1:
               var10009 = 168;
               break;
            case 2:
               var10009 = 65;
               break;
            case 3:
               var10009 = 242;
               break;
            case 4:
               var10009 = 222;
               break;
            case 5:
               var10009 = 113;
               break;
            default:
               var10009 = 147;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}
