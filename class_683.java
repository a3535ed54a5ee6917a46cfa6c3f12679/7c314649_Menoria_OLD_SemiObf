import java.util.List;
import java.util.Random;

// $FF: renamed from: Ao
public class class_683 extends class_671 {

   // $FF: renamed from: i vI
   public class_22 field_2924;
   // $FF: renamed from: l ahb
   private ahb field_2925;
   // $FF: renamed from: m int
   private int field_2926;
   // $FF: renamed from: n int
   private int field_2927;
   // $FF: renamed from: o int
   private int field_2928;
   // $FF: renamed from: p java.util.Random
   private Random field_2929;
   // $FF: renamed from: q long
   public long field_2930;
   // $FF: renamed from: r int[]
   public int[] field_2931;
   // $FF: renamed from: s java.lang.String
   private static final String field_2932;
   // $FF: renamed from: t java.lang.String[]
   private static final String[] field_2933;


   // $FF: renamed from: <init> (Af, ahb, int, int, int) void
   public void method_3703(class_666 var1, ahb var2, int var3, int var4, int var5) {
      super.method_3645();
      class_1678 var10001 = new class_1678;
      String[] var10004 = field_2933;
      var10001.method_9247(this, "Enchant", true, 1);
      this.field_2924 = var10001;
      String[] var10000 = class_752.method_4253();
      this.field_2929 = new Random();
      String[] var6 = var10000;
      this.field_2931 = new int[3];
      this.field_2925 = var2;
      this.field_2926 = var3;
      this.field_2927 = var4;
      this.field_2928 = var5;
      class_498 var10 = new class_498;
      var10.method_2894(this, this.field_2924, 0, 25, 47);
      this.method_3646(var10);
      int var7 = 0;

      byte var9;
      class_492 var11;
      while(true) {
         if(var7 < 3) {
            var9 = 0;
            if(var6 == null) {
               break;
            }

            int var8 = 0;

            while(true) {
               if(var8 < 9) {
                  var11 = new class_492;
                  var11.method_2869(var1, var8 + var7 * 9 + 9, 8 + var8 * 18, 84 + var7 * 18);
                  this.method_3646(var11);
                  ++var8;
                  if(var6 == null) {
                     break;
                  }

                  if(var6 != null) {
                     continue;
                  }
               }

               ++var7;
               break;
            }

            if(var6 != null) {
               continue;
            }
         }

         var9 = 0;
         break;
      }

      var7 = var9;

      while(var7 < 9) {
         var11 = new class_492;
         var11.method_2869(var1, var7, 8 + var7 * 18, 142);
         this.method_3646(var11);
         ++var7;
         if(var6 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: b (aN) void
   public void method_3647(class_16 var1) {
      super.method_3647(var1);
      var1.method_52(this, 0, this.field_2931[0]);
      var1.method_52(this, 1, this.field_2931[1]);
      var1.method_52(this, 2, this.field_2931[2]);
   }

   // $FF: renamed from: c () void
   public void method_3650() {
      super.method_3650();
      String[] var10000 = class_752.method_4253();
      int var2 = 0;
      String[] var1 = var10000;

      while(var2 < this.field_2875.size()) {
         class_16 var3 = (class_16)this.field_2875.get(var2);
         var3.method_52(this, 0, this.field_2931[0]);
         var3.method_52(this, 1, this.field_2931[1]);
         var3.method_52(this, 2, this.field_2931[2]);
         ++var2;
         if(var1 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: a (int, int) void
   public void method_3662(int var1, int var2) {
      label18: {
         String[] var3 = class_752.method_4253();
         int var10000 = var1;
         if(var3 != null) {
            if(var1 < 0) {
               break label18;
            }

            var10000 = var1;
         }

         if(var10000 <= 2) {
            this.field_2931[var1] = var2;
            if(var3 != null) {
               return;
            }
         }
      }

      super.method_3662(var1, var2);
   }

   // $FF: renamed from: b (vI) void
   public void method_3659(class_22 var1) {
      String[] var2 = class_752.method_4253();
      class_22 var10000 = var1;
      if(var2 != null) {
         if(var1 != this.field_2924) {
            return;
         }

         var10000 = var1;
      }

      int var4;
      byte var8;
      label169: {
         label178: {
            add var3 = var10000.method_84(0);
            add var7 = var3;
            if(var2 != null) {
               if(var3 == null) {
                  break label178;
               }

               var7 = var3;
            }

            var8 = var7.method_3777();
            if(var2 == null) {
               break label169;
            }

            if(var8 != 0) {
               this.field_2930 = this.field_2929.nextLong();
               var8 = this.field_2925.field_1832;
               if(var2 != null) {
                  if(this.field_2925.field_1832) {
                     return;
                  }

                  var8 = 0;
               }

               var4 = var8;
               int var5 = -1;

               byte var11;
               label150:
               while(true) {
                  int var10 = var5;

                  label147:
                  while(var10 <= 1) {
                     var11 = -1;
                     if(var2 == null) {
                        break label150;
                     }

                     int var6 = -1;

                     while(var6 <= 1) {
                        var10 = var5;
                        if(var2 == null) {
                           continue label147;
                        }

                        label183: {
                           if(var2 != null) {
                              label139: {
                                 if(var5 == 0) {
                                    var10 = var6;
                                    if(var2 == null) {
                                       break label139;
                                    }

                                    if(var6 == 0) {
                                       break label183;
                                    }
                                 }

                                 var10 = this.field_2925.method_34(this.field_2926 + var6, this.field_2927, this.field_2928 + var5);
                              }
                           }

                           ahb var12;
                           int var10001;
                           int var10002;
                           int var10003;
                           label184: {
                              if(var2 != null) {
                                 if(var10 == 0) {
                                    break label183;
                                 }

                                 var12 = this.field_2925;
                                 var10001 = this.field_2926 + var6;
                                 var10002 = this.field_2927 + 1;
                                 var10003 = this.field_2928 + var5;
                                 if(var2 == null) {
                                    break label184;
                                 }

                                 var10 = this.field_2925.method_34(var10001, var10002, var10003);
                              }

                              if(var10 == 0) {
                                 break label183;
                              }

                              var12 = this.field_2925;
                              var10001 = this.field_2926 + var6 * 2;
                              var10002 = this.field_2927;
                              var10003 = this.field_2928 + var5 * 2;
                           }

                           aji var13 = var12.getBlock(var10001, var10002, var10003);
                           aji var9 = class_1192.field_6074;
                           if(var2 != null) {
                              if(var13 == class_1192.field_6074) {
                                 ++var4;
                              }

                              var13 = this.field_2925.getBlock(this.field_2926 + var6 * 2, this.field_2927 + 1, this.field_2928 + var5 * 2);
                              var9 = class_1192.field_6074;
                           }

                           if(var13 == var9) {
                              ++var4;
                           }

                           var10 = var6;
                           if(var2 != null) {
                              if(var6 == 0) {
                                 break label183;
                              }

                              var10 = var5;
                           }

                           if(var10 != 0) {
                              var13 = this.field_2925.getBlock(this.field_2926 + var6 * 2, this.field_2927, this.field_2928 + var5);
                              var9 = class_1192.field_6074;
                              if(var2 != null) {
                                 if(var13 == class_1192.field_6074) {
                                    ++var4;
                                 }

                                 var13 = this.field_2925.getBlock(this.field_2926 + var6 * 2, this.field_2927 + 1, this.field_2928 + var5);
                                 var9 = class_1192.field_6074;
                              }

                              if(var2 != null) {
                                 if(var13 == var9) {
                                    ++var4;
                                 }

                                 var13 = this.field_2925.getBlock(this.field_2926 + var6, this.field_2927, this.field_2928 + var5 * 2);
                                 var9 = class_1192.field_6074;
                              }

                              if(var2 != null) {
                                 if(var13 == var9) {
                                    ++var4;
                                 }

                                 var13 = this.field_2925.getBlock(this.field_2926 + var6, this.field_2927 + 1, this.field_2928 + var5 * 2);
                                 var9 = class_1192.field_6074;
                              }

                              if(var13 == var9) {
                                 ++var4;
                              }
                           }
                        }

                        ++var6;
                        if(var2 == null) {
                           break;
                        }
                     }

                     ++var5;
                     if(var2 != null) {
                        continue label150;
                     }
                     break;
                  }

                  var11 = 0;
                  break;
               }

               var5 = var11;

               while(true) {
                  if(var5 < 3) {
                     this.field_2931[var5] = class_980.method_5662(this.field_2929, var5, var4, var3);
                     ++var5;
                     if(var2 == null) {
                        break;
                     }

                     if(var2 != null) {
                        continue;
                     }
                  }

                  this.method_3650();
                  break;
               }

               if(var2 != null) {
                  return;
               }
            }
         }

         var8 = 0;
      }

      var4 = var8;

      while(var4 < 3) {
         this.field_2931[var4] = 0;
         ++var4;
         if(var2 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: b (yz, int) boolean
   public boolean method_3651(class_792 var1, int var2) {
      String[] var10000 = class_752.method_4253();
      add var4 = this.field_2924.method_84(0);
      String[] var3 = var10000;
      int var10 = this.field_2931[var2];
      if(var3 != null) {
         if(var10 > 0 && var4 != null) {
            label113: {
               var10 = var1.field_3641;
               if(var3 != null) {
                  if(var1.field_3641 < this.field_2931[var2]) {
                     var10 = var1.field_3640.field_2839;
                     if(var3 == null) {
                        return (boolean)var10;
                     }

                     if(!var1.field_3640.field_2839) {
                        break label113;
                     }
                  }

                  var10 = this.field_2925.field_1832;
               }

               if(var3 != null) {
                  if(var10 == 0) {
                     label114: {
                        List var5 = class_980.method_5664(this.field_2929, var4, this.field_2931[var2]);
                        int var6 = var4.method_3730() == class_1010.field_5198?1:0;
                        if(var3 != null) {
                           if(var5 == null) {
                              break label114;
                           }

                           var1.method_4620(-this.field_2931[var2]);
                        }

                        var10 = var6;
                        if(var3 != null) {
                           if(var6 != 0) {
                              var4.method_3788(class_1010.field_5259);
                           }

                           var10 = var6;
                        }

                        label75: {
                           label115: {
                              if(var3 != null) {
                                 if(var10 == 0) {
                                    break label115;
                                 }

                                 var10 = var5.size();
                              }

                              if(var3 == null) {
                                 break label75;
                              }

                              if(var10 > 1) {
                                 var10 = this.field_2929.nextInt(var5.size());
                                 break label75;
                              }
                           }

                           var10 = -1;
                        }

                        int var7 = var10;
                        int var8 = 0;

                        while(var8 < var5.size()) {
                           class_1655 var9 = (class_1655)var5.get(var8);
                           var10 = var6;
                           if(var3 == null) {
                              return (boolean)var10;
                           }

                           label117: {
                              if(var3 != null) {
                                 label63: {
                                    if(var6 != 0) {
                                       var10 = var8;
                                       if(var3 == null) {
                                          break label63;
                                       }

                                       if(var8 == var7) {
                                          break label117;
                                       }
                                    }

                                    var10 = var6;
                                 }
                              }

                              if(var10 != 0) {
                                 class_1010.field_5259.getBlock03(var4, var9);
                                 if(var3 != null) {
                                    break label117;
                                 }
                              }

                              var4.method_3778(var9.field_8614, var9.field_8615);
                           }

                           ++var8;
                           if(var3 == null) {
                              break;
                           }
                        }

                        this.method_3659(this.field_2924);
                     }
                  }

                  var10 = 1;
               }

               return (boolean)var10;
            }
         }

         var10 = 0;
      }

      return (boolean)var10;
   }

   // $FF: renamed from: a (yz) void
   public void method_3658(class_792 var1) {
      String[] var10000 = class_752.method_4253();
      super.method_3658(var1);
      String[] var2 = var10000;
      class_683 var4 = this;
      if(var2 != null) {
         if(this.field_2925.field_1832) {
            return;
         }

         var4 = this;
      }

      add var3 = var4.field_2924.method_86(0);
      if(var3 != null) {
         var1.method_4570(var3, false);
      }

   }

   // $FF: renamed from: c (yz) boolean
   public boolean method_3666(class_792 var1) {
      String[] var2 = class_752.method_4253();
      int var10000;
      if(this.field_2925.getBlock(this.field_2926, this.field_2927, this.field_2928) != class_1192.field_6141) {
         var10000 = 0;
      } else {
         double var3;
         var10000 = (var3 = var1.method_3889((double)this.field_2926 + 0.5D, (double)this.field_2927 + 0.5D, (double)this.field_2928 + 0.5D) - 64.0D) == 0.0D?0:(var3 < 0.0D?-1:1);
         if(var2 != null) {
            var10000 = var10000 <= 0?1:0;
         }
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: c (yz, int) add
   public add method_3654(class_792 var1, int var2) {
      String[] var10000 = class_752.method_4253();
      add var4 = null;
      String[] var3 = var10000;
      class_492 var5 = (class_492)this.field_2869.get(var2);
      class_492 var7 = var5;
      if(var3 != null) {
         if(var5 == null) {
            return var4;
         }

         var7 = var5;
      }

      if(var3 != null) {
         if(!var7.method_2876()) {
            return var4;
         }

         var7 = var5;
      }

      add var6;
      int var8;
      label82: {
         label108: {
            var6 = var7.method_2875();
            var4 = var6.method_3754();
            var8 = var2;
            if(var3 != null) {
               if(var2 == 0) {
                  var8 = this.method_3667(var6, 1, 37, true);
                  if(var3 == null) {
                     break label82;
                  }

                  if(var8 == 0) {
                     return null;
                  }
                  break label108;
               }

               var8 = ((class_492)this.field_2869.get(0)).method_2876();
            }

            if(var3 != null) {
               if(var8 != 0) {
                  return null;
               }

               var8 = ((class_492)this.field_2869.get(0)).method_2874(var6);
            }

            if(var3 != null) {
               if(var8 == 0) {
                  return null;
               }

               var8 = var6.method_3766();
            }

            byte var10001;
            label98: {
               if(var3 != null) {
                  if(var8 != 0) {
                     var8 = var6.field_2958;
                     var10001 = 1;
                     if(var3 == null) {
                        break label98;
                     }

                     if(var6.field_2958 == 1) {
                        ((class_492)this.field_2869.get(0)).method_2877(var6.method_3754());
                        var6.field_2958 = 0;
                        if(var3 != null) {
                           break label108;
                        }
                     }
                  }

                  var8 = var6.field_2958;
               }

               if(var3 == null) {
                  break label82;
               }

               var10001 = 1;
            }

            if(var8 >= var10001) {
               var7 = (class_492)this.field_2869.get(0);
               add var9 = new add;
               var9.method_3726(var6.method_3730(), 1, var6.method_3745());
               var7.method_2877(var9);
               --var6.field_2958;
            }
         }

         var8 = var6.field_2958;
      }

      label48: {
         if(var8 == 0) {
            var5.method_2877((add)null);
            if(var3 != null) {
               break label48;
            }
         }

         var5.method_2878();
      }

      if(var6.field_2958 == var4.field_2958) {
         return null;
      } else {
         var5.method_2873(var1, var6);
         return var4;
      }
   }

   // $FF: renamed from: <clinit> () void
   static void method_3678() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "Úú§}øÆÑö\\9v­Ô";
      int var4 = "Úú§}øÆÑö\\9v­Ô".length();
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
            char[] var11 = var8;
            var8 = var10003;
            if(var10003 <= var6) {
               var5[var3++] = (new String((char[])var9)).intern();
               if((var0 += var1) >= var4) {
                  field_2933 = var5;
                  String[] var10 = field_2933;
                  field_2932 = "CL_00001745";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 40;
               break;
            case 1:
               var10009 = 219;
               break;
            case 2:
               var10009 = 246;
               break;
            case 3:
               var10009 = 142;
               break;
            case 4:
               var10009 = 169;
               break;
            case 5:
               var10009 = 3;
               break;
            default:
               var10009 = 102;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}
