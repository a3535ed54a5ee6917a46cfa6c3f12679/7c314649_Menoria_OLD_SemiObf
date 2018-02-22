import java.util.Arrays;
import java.util.Random;

// $FF: renamed from: dH
public class class_999 extends class_985 {

   // $FF: renamed from: aF byte[]
   private byte[] field_5079;
   // $FF: renamed from: aG long
   private long field_5080;
   // $FF: renamed from: aH jd
   private class_1307 field_5081;
   // $FF: renamed from: aI jd
   private class_1307 field_5082;
   // $FF: renamed from: aJ jd
   private class_1307 field_5083;
   // $FF: renamed from: aK boolean
   private boolean field_5084;
   // $FF: renamed from: aL boolean
   private boolean field_5085;
   // $FF: renamed from: aM java.lang.String
   private static final String field_5086;
   // $FF: renamed from: cb java.lang.String[]
   private static final String[] field_5087;


   // $FF: renamed from: <init> (int, boolean, boolean) void
   public void method_5732(int var1, boolean var2, boolean var3) {
      super.method_5691(var1);
      this.field_5084 = var2;
      this.field_5085 = var3;
      this.method_5695();
      this.method_5693(2.0F, 0.0F);
      this.field_5045.clear();
      this.field_5034 = class_1192.field_6037;
      this.field_5035 = 1;
      this.field_5036 = class_1192.field_6183;
      this.field_5043.field_5444 = -999;
      this.field_5043.field_5447 = 20;
      this.field_5043.field_5449 = 3;
      this.field_5043.field_5450 = 5;
      this.field_5043.field_5445 = 0;
      this.field_5045.clear();
      if(var3) {
         this.field_5043.field_5444 = 5;
      }

   }

   // $FF: renamed from: b (java.util.Random) hd
   public class_1162 method_5696(Random var1) {
      return this.field_5051;
   }

   // $FF: renamed from: d (int, int, int) int
   public int method_5716(int var1, int var2, int var3) {
      return 10387789;
   }

   // $FF: renamed from: c (int, int, int) int
   public int method_5715(int var1, int var2, int var3) {
      return 9470285;
   }

   // $FF: renamed from: b (ahb, java.util.Random, int, int) void
   public void method_5714(ahb var1, Random var2, int var3, int var4) {
      super.method_5714(var1, var2, var3, var4);
   }

   // $FF: renamed from: b (ahb, java.util.Random, aji[], byte[], int, int, double) void
   public void method_5718(ahb var1, Random var2, aji[] var3, byte[] var4, int var5, int var6, double var7) {
      String[] var9;
      class_999 var10000;
      label316: {
         label315: {
            var9 = class_752.method_4253();
            var10000 = this;
            if(var9 != null) {
               if(this.field_5079 != null) {
                  var10000 = this;
                  if(var9 == null) {
                     break label316;
                  }

                  if(this.field_5080 == var1.method_2183()) {
                     break label315;
                  }
               }

               var10000 = this;
            }

            var10000.method_5733(var1.method_2183());
         }

         var10000 = this;
      }

      label305: {
         label304: {
            label319: {
               label320: {
                  class_1307 var29 = var10000.field_5081;
                  if(var9 != null) {
                     if(var10000.field_5081 == null) {
                        break label319;
                     }

                     var10000 = this;
                     if(var9 == null) {
                        break label320;
                     }

                     var29 = this.field_5082;
                  }

                  if(var29 == null) {
                     break label319;
                  }

                  var10000 = this;
               }

               if(var9 == null) {
                  break label305;
               }

               if(var10000.field_5080 == var1.method_2183()) {
                  break label304;
               }
            }

            Random var10 = new Random(this.field_5080);
            class_1307 var10001 = new class_1307;
            var10001.method_6899(var10, 4);
            this.field_5081 = var10001;
            var10001 = new class_1307;
            var10001.method_6899(var10, 1);
            this.field_5082 = var10001;
         }

         var10000 = this;
      }

      int var12;
      int var13;
      double var26;
      int var34;
      label286: {
         var10000.field_5080 = var1.method_2183();
         var26 = 0.0D;
         var34 = this.field_5084;
         if(var9 != null) {
            if(this.field_5084) {
               var12 = (var5 & -16) + (var6 & 15);
               var13 = (var6 & -16) + (var5 & 15);
               double var14 = Math.min(Math.abs(var7), this.field_5081.method_6900((double)var12 * 0.25D, (double)var13 * 0.25D));
               double var38;
               var34 = (var38 = var14 - 0.0D) == 0.0D?0:(var38 < 0.0D?-1:1);
               if(var9 == null) {
                  break label286;
               }

               if(var34 > 0) {
                  double var16 = 0.001953125D;
                  double var18 = Math.abs(this.field_5082.method_6900((double)var12 * var16, (double)var13 * var16));
                  var26 = var14 * var14 * 2.5D;
                  double var20 = Math.ceil(var18 * 50.0D) + 14.0D;
                  double var35 = var26;
                  double var28 = var20;
                  if(var9 != null) {
                     if(var26 > var20) {
                        var26 = var20;
                     }

                     var35 = var26;
                     var28 = 64.0D;
                  }

                  var26 = var35 + var28;
               }
            }

            var34 = var5 & 15;
         }

         var12 = var34;
         var13 = var6 & 15;
         boolean var36 = true;
      }

      aji var15 = class_1192.field_6183;
      aji var27 = this.field_5036;
      int var17 = (int)(var7 / 3.0D + 3.0D + var2.nextDouble() * 0.25D);
      double var39;
      var34 = (var39 = Math.cos(var7 / 3.0D * 3.141592653589793D) - 0.0D) == 0.0D?0:(var39 < 0.0D?-1:1);
      if(var9 != null) {
         var34 = var34 > 0?1:0;
      }

      int var30 = var34;
      int var19 = -1;
      int var33 = 0;
      int var21 = var3.length / 256;
      int var22 = 255;

      while(var22 >= 0) {
         int var23;
         int var31;
         aji var37;
         label274: {
            label323: {
               label272: {
                  var23 = (var13 * 16 + var12) * var21 + var22;
                  var37 = var3[var23];
                  if(var9 != null) {
                     if(var37 == null) {
                        break label272;
                     }

                     var37 = var3[var23];
                  }

                  if(var37.method_2424() != awt.field_4170) {
                     break label323;
                  }
               }

               var34 = var22;
               var31 = (int)var26;
               if(var9 == null) {
                  break label274;
               }

               if(var22 < var31) {
                  var3[var23] = class_1192.field_6026;
               }
            }

            var34 = var22;
            var31 = 0 + var2.nextInt(5);
         }

         label324: {
            if(var34 <= var31) {
               var3[var23] = class_1192.field_6032;
               if(var9 != null) {
                  break label324;
               }
            }

            label325: {
               aji var24 = var3[var23];
               var37 = var24;
               if(var9 != null) {
                  if(var24 == null) {
                     break label325;
                  }

                  var37 = var24;
               }

               if(var9 != null) {
                  if(var37.method_2424() == awt.field_4170) {
                     break label325;
                  }

                  var37 = var24;
               }

               if(var37 != class_1192.field_6026) {
                  break label324;
               }

               label326: {
                  var34 = var19;
                  int var25;
                  if(var9 != null) {
                     if(var19 == -1) {
                        byte var32;
                        label196: {
                           label328: {
                              var33 = 0;
                              var34 = var17;
                              if(var9 != null) {
                                 if(var17 <= 0) {
                                    var15 = null;
                                    var27 = class_1192.field_6026;
                                    break label328;
                                 }

                                 var34 = var22;
                              }

                              var32 = 59;
                              if(var9 == null) {
                                 break label196;
                              }

                              if(var34 >= 59) {
                                 var34 = var22;
                                 var32 = 64;
                                 if(var9 == null) {
                                    break label196;
                                 }

                                 if(var22 <= 64) {
                                    var15 = class_1192.field_6183;
                                    var27 = this.field_5036;
                                 }
                              }
                           }

                           var34 = var22;
                           var32 = 63;
                        }

                        label329: {
                           if(var9 != null) {
                              if(var34 < var32) {
                                 label183: {
                                    var37 = var15;
                                    if(var9 != null) {
                                       label181: {
                                          if(var15 != null) {
                                             var37 = var15;
                                             if(var9 == null) {
                                                break label181;
                                             }

                                             if(var15.method_2424() != awt.field_4170) {
                                                break label183;
                                             }
                                          }

                                          var37 = class_1192.field_6034;
                                       }
                                    }

                                    var15 = var37;
                                 }
                              }

                              var19 = var17 + Math.max(0, var22 - 63);
                              if(var9 == null) {
                                 break label329;
                              }

                              var34 = var22;
                              var32 = 62;
                           }

                           if(var34 >= var32) {
                              label331: {
                                 label332: {
                                    var34 = this.field_5085;
                                    if(var9 != null) {
                                       if(this.field_5085) {
                                          var34 = var22;
                                          var31 = 86 + var17 * 2;
                                          if(var9 == null) {
                                             break label332;
                                          }

                                          if(var22 > var31) {
                                             if(var30 != 0) {
                                                var3[var23] = class_1192.field_6028;
                                                var4[var23] = 1;
                                                if(var9 != null) {
                                                   break label326;
                                                }
                                             }

                                             var3[var23] = class_1192.field_6027;
                                             if(var9 != null) {
                                                break label326;
                                             }
                                          }
                                       }

                                       var34 = var22;
                                    }

                                    if(var9 == null) {
                                       break label331;
                                    }

                                    var31 = 66 + var17;
                                 }

                                 if(var34 > var31) {
                                    label174: {
                                       label173: {
                                          var25 = 16;
                                          var34 = var22;
                                          if(var9 != null) {
                                             label171: {
                                                if(var22 >= 64) {
                                                   var34 = var22;
                                                   if(var9 == null) {
                                                      break label171;
                                                   }

                                                   if(var22 <= 127) {
                                                      var34 = var30;
                                                      if(var9 == null) {
                                                         break label174;
                                                      }

                                                      if(var30 != 0) {
                                                         break label173;
                                                      }

                                                      var25 = this.method_5734(var5, var22, var6);
                                                      if(var9 != null) {
                                                         break label173;
                                                      }
                                                   }
                                                }

                                                var34 = 1;
                                             }
                                          }

                                          var25 = var34;
                                       }

                                       var34 = var25;
                                    }

                                    if(var34 < 16) {
                                       var3[var23] = class_1192.field_6183;
                                       var4[var23] = (byte)var25;
                                       if(var9 != null) {
                                          break label326;
                                       }
                                    }

                                    var3[var23] = class_1192.field_6186;
                                    if(var9 != null) {
                                       break label326;
                                    }
                                 }

                                 var3[var23] = this.field_5034;
                                 var4[var23] = (byte)this.field_5035;
                                 var34 = 1;
                              }

                              var33 = var34;
                              if(var9 != null) {
                                 break label326;
                              }
                           }

                           var3[var23] = var27;
                        }

                        if(var9 != null) {
                           if(var27 != class_1192.field_6183) {
                              break label326;
                           }

                           var4[var23] = 1;
                        }

                        if(var9 != null) {
                           break label326;
                        }
                     }

                     var34 = var19;
                  }

                  if(var9 != null) {
                     if(var34 <= 0) {
                        break label326;
                     }

                     --var19;
                     var34 = var33;
                  }

                  if(var9 != null) {
                     if(var34 != 0) {
                        var3[var23] = class_1192.field_6183;
                        var4[var23] = 1;
                        if(var9 != null) {
                           break label326;
                        }
                     }

                     var34 = this.method_5734(var5, var22, var6);
                  }

                  label146: {
                     var25 = var34;
                     if(var9 != null) {
                        if(var25 >= 16) {
                           break label146;
                        }

                        var3[var23] = class_1192.field_6183;
                        var4[var23] = (byte)var25;
                     }

                     if(var9 != null) {
                        break label326;
                     }
                  }

                  var3[var23] = class_1192.field_6186;
               }

               if(var9 != null) {
                  break label324;
               }
            }

            var19 = -1;
         }

         --var22;
         if(var9 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: b (long) void
   private void method_5733(long var1) {
      this.field_5079 = new byte[64];
      String[] var3 = class_752.method_4253();
      Arrays.fill(this.field_5079, (byte)16);
      Random var4 = new Random(var1);
      class_1307 var10001 = new class_1307;
      var10001.method_6899(var4, 1);
      this.field_5083 = var10001;
      int var5 = 0;

      byte var14;
      int var10000;
      while(true) {
         if(var5 < 64) {
            var5 += var4.nextInt(5) + 1;
            if(var3 != null) {
               var10000 = var5;
               var14 = 64;
               if(var3 == null) {
                  break;
               }

               if(var5 < 64) {
                  this.field_5079[var5] = 1;
               }

               ++var5;
            }

            if(var3 != null) {
               continue;
            }
         }

         var10000 = var4.nextInt(4);
         var14 = 2;
         break;
      }

      var5 = var10000 + var14;
      int var6 = 0;

      int var7;
      int var8;
      int var9;
      byte var15;
      int var16;
      label182:
      while(true) {
         var10000 = var6;
         var16 = var5;

         label179:
         while(var10000 < var16) {
            var7 = var4.nextInt(3) + 1;
            var8 = var4.nextInt(64);
            var15 = 0;
            if(var3 == null) {
               break label182;
            }

            var9 = 0;

            while(var8 + var9 < 64) {
               var10000 = var9;
               var16 = var7;
               if(var3 == null) {
                  continue label179;
               }

               if(var9 >= var7) {
                  break;
               }

               this.field_5079[var8 + var9] = 4;
               ++var9;
               if(var3 == null) {
                  break;
               }
            }

            ++var6;
            if(var3 != null) {
               continue label182;
            }
            break;
         }

         var6 = var4.nextInt(4) + 2;
         var15 = 0;
         break;
      }

      var7 = var15;

      int var10;
      label158:
      while(true) {
         var10000 = var7;
         var16 = var6;

         label155:
         while(var10000 < var16) {
            var8 = var4.nextInt(3) + 2;
            var9 = var4.nextInt(64);
            var15 = 0;
            if(var3 == null) {
               break label158;
            }

            var10 = 0;

            while(var9 + var10 < 64) {
               var10000 = var10;
               var16 = var8;
               if(var3 == null) {
                  continue label155;
               }

               if(var10 >= var8) {
                  break;
               }

               this.field_5079[var9 + var10] = 12;
               ++var10;
               if(var3 == null) {
                  break;
               }
            }

            ++var7;
            if(var3 != null) {
               continue label158;
            }
            break;
         }

         var7 = var4.nextInt(4) + 2;
         var15 = 0;
         break;
      }

      var8 = var15;

      label134:
      while(true) {
         var10000 = var8;
         var16 = var7;

         label131:
         while(var10000 < var16) {
            var9 = var4.nextInt(3) + 1;
            var10 = var4.nextInt(64);
            var15 = 0;
            if(var3 == null) {
               break label134;
            }

            int var11 = 0;

            while(var10 + var11 < 64) {
               var10000 = var11;
               var16 = var9;
               if(var3 == null) {
                  continue label131;
               }

               if(var11 >= var9) {
                  break;
               }

               this.field_5079[var10 + var11] = 14;
               ++var11;
               if(var3 == null) {
                  break;
               }
            }

            ++var8;
            if(var3 != null) {
               continue label134;
            }
            break;
         }

         var8 = var4.nextInt(3) + 3;
         var9 = 0;
         var15 = 0;
         break;
      }

      var10 = var15;

      do {
         var10000 = var10;
         var16 = var8;

         label107:
         while(true) {
            if(var10000 >= var16) {
               return;
            }

            byte var13 = 1;
            var9 += var4.nextInt(16) + 4;
            int var12 = 0;

            while(true) {
               if(var9 + var12 >= 64) {
                  break label107;
               }

               var10000 = var12;
               var16 = var13;
               if(var3 == null) {
                  break;
               }

               if(var3 != null) {
                  if(var12 >= var13) {
                     break label107;
                  }

                  this.field_5079[var9 + var12] = 0;
                  var10000 = var9 + var12;
                  var16 = 1;
               }

               label102: {
                  label210: {
                     if(var3 != null) {
                        label91: {
                           if(var10000 > var16) {
                              var10000 = var4.nextBoolean();
                              if(var3 == null) {
                                 break label91;
                              }

                              if(var10000 != 0) {
                                 this.field_5079[var9 + var12 - 1] = 8;
                              }
                           }

                           var10000 = var9 + var12;
                        }

                        if(var3 == null) {
                           break label210;
                        }

                        var16 = 63;
                     }

                     if(var10000 >= var16) {
                        break label102;
                     }

                     var10000 = var4.nextBoolean();
                  }

                  if(var10000 != 0) {
                     this.field_5079[var9 + var12 + 1] = 8;
                  }
               }

               ++var12;
               if(var3 == null) {
                  break label107;
               }
            }
         }

         ++var10;
      } while(var3 != null);

   }

   // $FF: renamed from: a (int, int, int) byte
   private byte method_5734(int var1, int var2, int var3) {
      int var4 = (int)Math.round(this.field_5083.method_6900((double)var1 * 1.0D / 512.0D, (double)var1 * 1.0D / 512.0D) * 2.0D);
      return this.field_5079[(var2 + var4 + 64) % 64];
   }

   // $FF: renamed from: l () dz
   protected class_985 method_5720() {
      String[] var1 = class_752.method_4253();
      int var10000 = this.field_5050;
      if(var1 != null) {
         var10000 = this.field_5050 == class_985.field_5025.field_5050?1:0;
      }

      class_999 var3;
      label24: {
         StringBuilder var10001;
         label23: {
            int var2 = var10000;
            class_999 var5 = new class_999;
            var5.method_5732(this.field_5050 + 128, (boolean)var2, this.field_5085);
            var3 = var5;
            if(var1 != null) {
               if(var2 != 0) {
                  break label23;
               }

               var3.method_5694(field_4979);
               var10001 = (new StringBuilder()).append(this.field_5031);
               String[] var4 = field_5087;
               var3.method_5700(var10001.append(" M").toString());
            }

            if(var1 != null) {
               break label24;
            }
         }

         var10001 = (new StringBuilder()).append(this.field_5031);
         String[] var10002 = field_5087;
         var3.method_5700(var10001.append(" (Bryce)").toString());
      }

      var3.method_5704(this.field_5032, true);
      return var3;
   }

   // $FF: renamed from: <clinit> () void
   static void method_5726() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "ãýgj\bsà_J4Ì";
      int var4 = "ãýgj\bsà_J4Ì".length();
      char var1 = 11;
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
                  field_5087 = var5;
                  String[] var10 = field_5087;
                  field_5086 = "CL_00000176";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 35;
               break;
            case 1:
               var10009 = 216;
               break;
            case 2:
               var10009 = 33;
               break;
            case 3:
               var10009 = 174;
               break;
            case 4:
               var10009 = 176;
               break;
            case 5:
               var10009 = 212;
               break;
            default:
               var10009 = 42;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}
