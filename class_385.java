import java.util.Random;

// $FF: renamed from: fU
public class class_385 extends aji {

   // $FF: renamed from: N java.lang.String[]
   private static final String[] field_2066;


   // $FF: renamed from: <init> () void
   protected void method_2595() {
      super.method_2427(awt.field_4186);
      this.method_2440(true);
      this.method_2521(class_872.field_4245);
   }

   // $FF: renamed from: a (ahb, int, int, int) kg
   public class_1343 method_2452(ahb var1, int var2, int var3, int var4) {
      return null;
   }

   // $FF: renamed from: c () boolean
   public boolean method_2453() {
      return false;
   }

   // $FF: renamed from: d () boolean
   public boolean method_2434() {
      return false;
   }

   // $FF: renamed from: b () int
   public int method_2436() {
      return 2;
   }

   // $FF: renamed from: e (ahb, int, int, int) boolean
   private boolean method_2596(ahb var1, int var2, int var3, int var4) {
      String[] var5 = class_752.method_4253();
      ahb var10000 = var1;
      int var10001 = var2;
      int var10002 = var3;
      int var10003 = var4;
      if(var5 != null) {
         if(ahb.method_2135(var1, var2, var3, var4)) {
            return true;
         }

         var10000 = var1;
         var10001 = var2;
         var10002 = var3;
         var10003 = var4;
      }

      aji var6 = var10000.getBlock(var10001, var10002, var10003);
      aji var7 = var6;
      aji var8 = class_1192.field_6111;
      if(var5 != null) {
         if(var6 == class_1192.field_6111) {
            return true;
         }

         var7 = var6;
         var8 = class_1192.field_6138;
      }

      if(var5 != null) {
         if(var7 == var8) {
            return true;
         }

         var7 = var6;
         var8 = class_1192.field_6047;
      }

      if(var5 != null) {
         if(var7 == var8) {
            return true;
         }

         var7 = var6;
         var8 = class_1192.field_6163;
      }

      if(var7 != var8) {
         return false;
      } else {
         return true;
      }
   }

   // $FF: renamed from: c (ahb, int, int, int) boolean
   public boolean method_2480(ahb var1, int var2, int var3, int var4) {
      String[] var5 = class_752.method_4253();
      boolean var10000 = var1.method_2136(var2 - 1, var3, var4, true);
      if(var5 != null) {
         if(var10000) {
            return true;
         }

         var10000 = var1.method_2136(var2 + 1, var3, var4, true);
      }

      if(var5 != null) {
         if(var10000) {
            return true;
         }

         var10000 = var1.method_2136(var2, var3, var4 - 1, true);
      }

      if(var5 != null) {
         if(var10000) {
            return true;
         }

         var10000 = var1.method_2136(var2, var3, var4 + 1, true);
      }

      if(var5 != null) {
         if(var10000) {
            return true;
         }

         var10000 = this.method_2596(var1, var2, var3 - 1, var4);
      }

      if(var5 != null) {
         if(var10000) {
            return true;
         }

         var10000 = false;
      }

      return var10000;
   }

   // $FF: renamed from: a (ahb, int, int, int, int, float, float, float, int) int
   public int method_2483(ahb var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9) {
      String[] var10000 = class_752.method_4253();
      int var11 = var9;
      String[] var10 = var10000;
      int var12 = var5;
      byte var10001 = 1;
      if(var10 != null) {
         label81: {
            if(var5 == 1) {
               var12 = this.method_2596(var1, var2, var3 - 1, var4);
               if(var10 == null) {
                  break label81;
               }

               if(var12 != 0) {
                  var11 = 5;
               }
            }

            var12 = var5;
         }

         var10001 = 2;
      }

      if(var10 != null) {
         label73: {
            if(var12 == var10001) {
               var12 = var1.method_2136(var2, var3, var4 + 1, true);
               if(var10 == null) {
                  break label73;
               }

               if(var12 != 0) {
                  var11 = 4;
               }
            }

            var12 = var5;
         }

         var10001 = 3;
      }

      if(var10 != null) {
         label65: {
            if(var12 == var10001) {
               var12 = var1.method_2136(var2, var3, var4 - 1, true);
               if(var10 == null) {
                  break label65;
               }

               if(var12 != 0) {
                  var11 = 3;
               }
            }

            var12 = var5;
         }

         var10001 = 4;
      }

      if(var10 != null) {
         label53: {
            if(var12 == var10001) {
               var12 = var1.method_2136(var2 + 1, var3, var4, true);
               if(var10 == null) {
                  break label53;
               }

               if(var12 != 0) {
                  var11 = 2;
               }
            }

            var12 = var5;
         }

         if(var10 == null) {
            return var12;
         }

         var10001 = 5;
      }

      if(var12 == var10001) {
         var12 = var1.method_2136(var2 - 1, var3, var4, true);
         if(var10 == null) {
            return var12;
         }

         if(var12 != 0) {
            var11 = 1;
         }
      }

      var12 = var11;
      return var12;
   }

   // $FF: renamed from: a (ahb, int, int, int, java.util.Random) void
   public void method_2456(ahb var1, int var2, int var3, int var4, Random var5) {
      String[] var6 = class_752.method_4253();
      class_385 var10000 = this;
      ahb var10001 = var1;
      int var10002 = var2;
      int var10003 = var3;
      int var10004 = var4;
      if(var6 != null) {
         super.method_2456(var1, var2, var3, var4, var5);
         if(var1.method_33(var2, var3, var4) != 0) {
            return;
         }

         var10000 = this;
         var10001 = var1;
         var10002 = var2;
         var10003 = var3;
         var10004 = var4;
      }

      var10000.method_2461(var10001, var10002, var10003, var10004);
   }

   // $FF: renamed from: b (ahb, int, int, int) void
   public void method_2461(ahb var1, int var2, int var3, int var4) {
      String[] var5 = class_752.method_4253();
      int var10000 = var1.method_33(var2, var3, var4);
      if(var5 != null) {
         if(var10000 == 0) {
            label59: {
               boolean var6 = var1.method_2136(var2 - 1, var3, var4, true);
               if(var5 != null) {
                  if(var6) {
                     var1.method_2055(var2, var3, var4, 1, 2);
                     if(var5 != null) {
                        break label59;
                     }
                  }

                  var6 = var1.method_2136(var2 + 1, var3, var4, true);
               }

               if(var5 != null) {
                  if(var6) {
                     var1.method_2055(var2, var3, var4, 2, 2);
                     if(var5 != null) {
                        break label59;
                     }
                  }

                  var6 = var1.method_2136(var2, var3, var4 - 1, true);
               }

               if(var5 != null) {
                  if(var6) {
                     var1.method_2055(var2, var3, var4, 3, 2);
                     if(var5 != null) {
                        break label59;
                     }
                  }

                  var6 = var1.method_2136(var2, var3, var4 + 1, true);
               }

               if(var5 != null) {
                  if(var6) {
                     var1.method_2055(var2, var3, var4, 4, 2);
                     if(var5 != null) {
                        break label59;
                     }
                  }

                  var6 = this.method_2596(var1, var2, var3 - 1, var4);
               }

               if(var5 == null) {
                  return;
               }

               if(var6) {
                  var1.method_2055(var2, var3, var4, 5, 2);
               }
            }
         }

         this.method_2598(var1, var2, var3, var4);
      }

   }

   // $FF: renamed from: a (ahb, int, int, int, aji) void
   public void method_2459(ahb var1, int var2, int var3, int var4, aji var5) {
      this.method_2597(var1, var2, var3, var4, var5);
   }

   // $FF: renamed from: c (ahb, int, int, int, aji) boolean
   protected boolean method_2597(ahb var1, int var2, int var3, int var4, aji var5) {
      String[] var6 = class_752.method_4253();
      boolean var10000 = this.method_2598(var1, var2, var3, var4);
      if(var6 != null) {
         if(var10000) {
            label111: {
               int var7 = var1.method_33(var2, var3, var4);
               byte var8 = 0;
               int var9 = var1.method_2136(var2 - 1, var3, var4, true);
               if(var6 != null) {
                  label107: {
                     if(var9 == 0) {
                        var9 = var7;
                        if(var6 == null) {
                           break label107;
                        }

                        if(var7 == 1) {
                           var8 = 1;
                        }
                     }

                     var9 = var1.method_2136(var2 + 1, var3, var4, true);
                  }
               }

               if(var6 != null) {
                  label108: {
                     if(var9 == 0) {
                        var9 = var7;
                        if(var6 == null) {
                           break label108;
                        }

                        if(var7 == 2) {
                           var8 = 1;
                        }
                     }

                     var9 = var1.method_2136(var2, var3, var4 - 1, true);
                  }
               }

               if(var6 != null) {
                  label109: {
                     if(var9 == 0) {
                        var9 = var7;
                        if(var6 == null) {
                           break label109;
                        }

                        if(var7 == 3) {
                           var8 = 1;
                        }
                     }

                     var9 = var1.method_2136(var2, var3, var4 + 1, true);
                  }
               }

               if(var6 != null) {
                  label110: {
                     if(var9 == 0) {
                        var9 = var7;
                        if(var6 == null) {
                           break label110;
                        }

                        if(var7 == 4) {
                           var8 = 1;
                        }
                     }

                     var9 = this.method_2596(var1, var2, var3 - 1, var4);
                  }
               }

               if(var6 != null) {
                  label54: {
                     if(var9 == 0) {
                        var9 = var7;
                        if(var6 == null) {
                           break label54;
                        }

                        if(var7 == 5) {
                           var8 = 1;
                        }
                     }

                     var9 = var8;
                  }
               }

               if(var6 != null) {
                  if(var9 == 0) {
                     if(var6 != null) {
                        return false;
                     }
                     break label111;
                  }

                  this.method_2466(var1, var2, var3, var4, var1.method_33(var2, var3, var4), 0);
                  var1.method_2056(var2, var3, var4);
                  var9 = 1;
               }

               return (boolean)var9;
            }
         }

         var10000 = true;
      }

      return var10000;
   }

   // $FF: renamed from: h (ahb, int, int, int) boolean
   protected boolean method_2598(ahb var1, int var2, int var3, int var4) {
      String[] var5 = class_752.method_4253();
      boolean var10000 = this.method_2480(var1, var2, var3, var4);
      if(var5 != null) {
         if(!var10000) {
            ahb var6 = var1;
            int var10001 = var2;
            int var10002 = var3;
            int var10003 = var4;
            if(var5 != null) {
               if(var1.getBlock(var2, var3, var4) != this) {
                  return false;
               }

               this.method_2466(var1, var2, var3, var4, var1.method_33(var2, var3, var4), 0);
               var6 = var1;
               var10001 = var2;
               var10002 = var3;
               var10003 = var4;
            }

            var6.method_2056(var10001, var10002, var10003);
            return false;
         }

         var10000 = true;
      }

      return var10000;
   }

   // $FF: renamed from: a (ahb, int, int, int, azw, azw) azu
   public azu method_2472(ahb var1, int var2, int var3, int var4, azw var5, azw var6) {
      int var8 = var1.method_33(var2, var3, var4) & 7;
      String[] var10000 = class_752.method_4253();
      float var9 = 0.15F;
      String[] var7 = var10000;
      int var10 = var8;
      byte var10001 = 1;
      if(var7 != null) {
         if(var8 == 1) {
            this.method_2443(0.0F, 0.2F, 0.5F - var9, var9 * 2.0F, 0.8F, 0.5F + var9);
            if(var7 != null) {
               return super.method_2472(var1, var2, var3, var4, var5, var6);
            }
         }

         var10 = var8;
         var10001 = 2;
      }

      if(var7 != null) {
         if(var10 == var10001) {
            this.method_2443(1.0F - var9 * 2.0F, 0.2F, 0.5F - var9, 1.0F, 0.8F, 0.5F + var9);
            if(var7 != null) {
               return super.method_2472(var1, var2, var3, var4, var5, var6);
            }
         }

         var10 = var8;
         var10001 = 3;
      }

      if(var7 != null) {
         if(var10 == var10001) {
            this.method_2443(0.5F - var9, 0.2F, 0.0F, 0.5F + var9, 0.8F, var9 * 2.0F);
            if(var7 != null) {
               return super.method_2472(var1, var2, var3, var4, var5, var6);
            }
         }

         var10 = var8;
         var10001 = 4;
      }

      if(var10 == var10001) {
         this.method_2443(0.5F - var9, 0.2F, 1.0F - var9 * 2.0F, 0.5F + var9, 0.8F, 1.0F);
         if(var7 != null) {
            return super.method_2472(var1, var2, var3, var4, var5, var6);
         }
      }

      var9 = 0.1F;
      this.method_2443(0.5F - var9, 0.0F, 0.5F - var9, 0.5F + var9, 0.6F, 0.5F + var9);
      return super.method_2472(var1, var2, var3, var4, var5, var6);
   }

   // $FF: renamed from: b (ahb, int, int, int, java.util.Random) void
   public void method_2457(ahb var1, int var2, int var3, int var4, Random var5) {
      int var7 = var1.method_33(var2, var3, var4);
      double var8 = (double)((float)var2 + 0.5F);
      String[] var10000 = class_752.method_4253();
      double var10 = (double)((float)var3 + 0.7F);
      double var12 = (double)((float)var4 + 0.5F);
      String[] var6 = var10000;
      double var14 = 0.2199999988079071D;
      double var16 = 0.27000001072883606D;
      int var19 = var7;
      byte var10001 = 1;
      String[] var18;
      if(var6 != null) {
         if(var7 == 1) {
            var18 = field_2066;
            var1.method_2087("smoke", var8 - var16, var10 + var14, var12, 0.0D, 0.0D, 0.0D);
            var1.method_2087("flame", var8 - var16, var10 + var14, var12, 0.0D, 0.0D, 0.0D);
            if(var6 != null) {
               return;
            }
         }

         var19 = var7;
         var10001 = 2;
      }

      if(var6 != null) {
         if(var19 == var10001) {
            var18 = field_2066;
            var1.method_2087("smoke", var8 + var16, var10 + var14, var12, 0.0D, 0.0D, 0.0D);
            var1.method_2087("flame", var8 + var16, var10 + var14, var12, 0.0D, 0.0D, 0.0D);
            if(var6 != null) {
               return;
            }
         }

         var19 = var7;
         var10001 = 3;
      }

      if(var6 != null) {
         if(var19 == var10001) {
            var18 = field_2066;
            var1.method_2087("smoke", var8, var10 + var14, var12 - var16, 0.0D, 0.0D, 0.0D);
            var1.method_2087("flame", var8, var10 + var14, var12 - var16, 0.0D, 0.0D, 0.0D);
            if(var6 != null) {
               return;
            }
         }

         var19 = var7;
         var10001 = 4;
      }

      if(var19 == var10001) {
         var18 = field_2066;
         var1.method_2087("smoke", var8, var10 + var14, var12 + var16, 0.0D, 0.0D, 0.0D);
         var1.method_2087("flame", var8, var10 + var14, var12 + var16, 0.0D, 0.0D, 0.0D);
         if(var6 != null) {
            return;
         }
      }

      var18 = field_2066;
      var1.method_2087("smoke", var8, var10, var12, 0.0D, 0.0D, 0.0D);
      var1.method_2087("flame", var8, var10, var12, 0.0D, 0.0D, 0.0D);
   }

   // $FF: renamed from: <clinit> () void
   static void method_2537() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "ÉÈ7ËÜÉ9Í";
      int var4 = "ÉÈ7ËÜÉ9Í".length();
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
                  field_2066 = var5;
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 245;
               break;
            case 1:
               var10009 = 234;
               break;
            case 2:
               var10009 = 23;
               break;
            case 3:
               var10009 = 239;
               break;
            case 4:
               var10009 = 175;
               break;
            case 5:
               var10009 = 58;
               break;
            default:
               var10009 = 29;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var10 ^ var10009);
            ++var6;
         }
      }
   }
}
