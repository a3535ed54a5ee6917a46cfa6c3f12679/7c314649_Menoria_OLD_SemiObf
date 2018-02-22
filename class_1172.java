import java.util.Random;

// $FF: renamed from: hh
public class class_1172 extends class_1170 {

   // $FF: renamed from: a java.lang.String
   private static final String field_5989 = "CL_00000420";


   // $FF: renamed from: <init> (boolean, int, int, int, int) void
   public void method_6370(boolean var1, int var2, int var3, int var4, int var5) {
      super.method_6370(var1, var2, var3, var4, var5);
   }

   // $FF: renamed from: b (ahb, java.util.Random, int, int, int) boolean
   public boolean method_6351(ahb var1, Random var2, int var3, int var4, int var5) {
      int var7 = this.method_6371(var2);
      String[] var6 = class_752.method_4253();
      int var10000 = this.method_6374(var1, var2, var3, var4, var5, var7);
      if(var6 != null) {
         if(var10000 == 0) {
            return false;
         }

         this.method_6381(var1, var3, var5, var4 + var7, 2, var2);
         var10000 = var4 + var7 - 2 - var2.nextInt(4);
      }

      int var8 = var10000;

      byte var17;
      while(true) {
         if(var8 > var4 + var7 / 2) {
            float var9 = var2.nextFloat() * 3.1415927F * 2.0F;
            int var10 = var3 + (int)(0.5F + class_1715.method_9556(var9) * 4.0F);
            int var11 = var5 + (int)(0.5F + class_1715.method_9555(var9) * 4.0F);
            var17 = 0;
            if(var6 == null) {
               break;
            }

            int var12 = 0;

            while(true) {
               if(var12 < 5) {
                  var10 = var3 + (int)(1.5F + class_1715.method_9556(var9) * (float)var12);
                  var11 = var5 + (int)(1.5F + class_1715.method_9555(var9) * (float)var12);
                  this.method_6354(var1, var10, var8 - 3 + var12 / 2, var11, class_1192.field_6042, this.field_5985);
                  ++var12;
                  if(var6 == null) {
                     break;
                  }

                  if(var6 != null) {
                     continue;
                  }
               }

               var12 = 1 + var2.nextInt(2);
               break;
            }

            int var13 = var8;
            int var14 = var8 - var12;

            while(true) {
               if(var14 <= var13) {
                  int var15 = var14 - var13;
                  this.method_6376(var1, var10, var14, var11, 1 - var15, var2);
                  ++var14;
                  if(var6 == null) {
                     break;
                  }

                  if(var6 != null) {
                     continue;
                  }
               }

               var8 -= 2 + var2.nextInt(4);
               break;
            }

            if(var6 != null) {
               continue;
            }
         }

         var17 = 0;
         break;
      }

      var8 = var17;

      while(var8 < var7) {
         aji var16;
         label238: {
            label274: {
               var16 = var1.getBlock(var3, var4 + var8, var5);
               if(var6 != null) {
                  if(var16.method_2424() != awt.field_4170 && var16.method_2424() != awt.field_4179) {
                     break label274;
                  }

                  this.method_6354(var1, var3, var4 + var8, var5, class_1192.field_6042, this.field_5985);
               }

               var10000 = var8;
               if(var6 == null) {
                  break label238;
               }

               if(var8 > 0) {
                  var10000 = var2.nextInt(3);
                  if(var6 != null) {
                     label220: {
                        if(var10000 > 0) {
                           var10000 = var1.method_34(var3 - 1, var4 + var8, var5);
                           if(var6 == null) {
                              break label220;
                           }

                           if(var10000 != 0) {
                              this.method_6354(var1, var3 - 1, var4 + var8, var5, class_1192.field_6131, 8);
                           }
                        }

                        var10000 = var2.nextInt(3);
                     }
                  }

                  if(var6 == null) {
                     break label238;
                  }

                  if(var10000 > 0) {
                     var10000 = var1.method_34(var3, var4 + var8, var5 - 1);
                     if(var6 == null) {
                        break label238;
                     }

                     if(var10000 != 0) {
                        this.method_6354(var1, var3, var4 + var8, var5 - 1, class_1192.field_6131, 1);
                     }
                  }
               }
            }

            var10000 = var8;
         }

         label214: {
            if(var10000 < var7 - 1) {
               label276: {
                  label277: {
                     awt var10001;
                     awt var19;
                     label278: {
                        label209: {
                           int var18;
                           int var10002;
                           int var10003;
                           ahb var20;
                           label208: {
                              label279: {
                                 label280: {
                                    label281: {
                                       label204: {
                                          label203: {
                                             label282: {
                                                var16 = var1.getBlock(var3 + 1, var4 + var8, var5);
                                                if(var6 != null) {
                                                   if(var16.method_2424() != awt.field_4170) {
                                                      var19 = var16.method_2424();
                                                      var10001 = awt.field_4179;
                                                      if(var6 == null) {
                                                         break label281;
                                                      }

                                                      if(var19 != awt.field_4179) {
                                                         break label282;
                                                      }
                                                   }

                                                   this.method_6354(var1, var3 + 1, var4 + var8, var5, class_1192.field_6042, this.field_5985);
                                                }

                                                if(var6 == null) {
                                                   break label204;
                                                }

                                                if(var8 > 0) {
                                                   label283: {
                                                      var10000 = var2.nextInt(3);
                                                      if(var6 != null) {
                                                         label146: {
                                                            if(var10000 > 0) {
                                                               var10000 = var1.method_34(var3 + 2, var4 + var8, var5);
                                                               if(var6 == null) {
                                                                  break label146;
                                                               }

                                                               if(var10000 != 0) {
                                                                  this.method_6354(var1, var3 + 2, var4 + var8, var5, class_1192.field_6131, 2);
                                                               }
                                                            }

                                                            var10000 = var2.nextInt(3);
                                                         }
                                                      }

                                                      if(var6 != null) {
                                                         if(var10000 <= 0) {
                                                            break label283;
                                                         }

                                                         var20 = var1;
                                                         var18 = var3 + 1;
                                                         var10002 = var4 + var8;
                                                         var10003 = var5 - 1;
                                                         if(var6 == null) {
                                                            break label203;
                                                         }

                                                         var10000 = var1.method_34(var18, var10002, var10003);
                                                      }

                                                      if(var10000 != 0) {
                                                         this.method_6354(var1, var3 + 1, var4 + var8, var5 - 1, class_1192.field_6131, 1);
                                                      }
                                                   }
                                                }
                                             }

                                             var20 = var1;
                                             var18 = var3 + 1;
                                             var10002 = var4 + var8;
                                             var10003 = var5 + 1;
                                          }

                                          var16 = var20.getBlock(var18, var10002, var10003);
                                       }

                                       if(var6 == null) {
                                          break label280;
                                       }

                                       var19 = var16.method_2424();
                                       var10001 = awt.field_4170;
                                    }

                                    if(var19 != var10001) {
                                       var19 = var16.method_2424();
                                       var10001 = awt.field_4179;
                                       if(var6 == null) {
                                          break label278;
                                       }

                                       if(var19 != awt.field_4179) {
                                          break label279;
                                       }
                                    }

                                    this.method_6354(var1, var3 + 1, var4 + var8, var5 + 1, class_1192.field_6042, this.field_5985);
                                 }

                                 if(var6 == null) {
                                    break label209;
                                 }

                                 if(var8 > 0) {
                                    label285: {
                                       var10000 = var2.nextInt(3);
                                       if(var6 != null) {
                                          label140: {
                                             if(var10000 > 0) {
                                                var10000 = var1.method_34(var3 + 2, var4 + var8, var5 + 1);
                                                if(var6 == null) {
                                                   break label140;
                                                }

                                                if(var10000 != 0) {
                                                   this.method_6354(var1, var3 + 2, var4 + var8, var5 + 1, class_1192.field_6131, 2);
                                                }
                                             }

                                             var10000 = var2.nextInt(3);
                                          }
                                       }

                                       if(var6 != null) {
                                          if(var10000 <= 0) {
                                             break label285;
                                          }

                                          var20 = var1;
                                          var18 = var3 + 1;
                                          var10002 = var4 + var8;
                                          var10003 = var5 + 2;
                                          if(var6 == null) {
                                             break label208;
                                          }

                                          var10000 = var1.method_34(var18, var10002, var10003);
                                       }

                                       if(var10000 != 0) {
                                          this.method_6354(var1, var3 + 1, var4 + var8, var5 + 2, class_1192.field_6131, 4);
                                       }
                                    }
                                 }
                              }

                              var20 = var1;
                              var18 = var3;
                              var10002 = var4 + var8;
                              var10003 = var5 + 1;
                           }

                           var16 = var20.getBlock(var18, var10002, var10003);
                        }

                        if(var6 == null) {
                           break label277;
                        }

                        var19 = var16.method_2424();
                        var10001 = awt.field_4170;
                     }

                     if(var19 != var10001 && var16.method_2424() != awt.field_4179) {
                        break label276;
                     }

                     this.method_6354(var1, var3, var4 + var8, var5 + 1, class_1192.field_6042, this.field_5985);
                  }

                  if(var6 == null) {
                     break label214;
                  }

                  if(var8 > 0) {
                     label287: {
                        var10000 = var2.nextInt(3);
                        if(var6 != null) {
                           label132: {
                              if(var10000 > 0) {
                                 var10000 = var1.method_34(var3 - 1, var4 + var8, var5 + 1);
                                 if(var6 == null) {
                                    break label132;
                                 }

                                 if(var10000 != 0) {
                                    this.method_6354(var1, var3 - 1, var4 + var8, var5 + 1, class_1192.field_6131, 8);
                                 }
                              }

                              var10000 = var2.nextInt(3);
                           }
                        }

                        if(var6 != null) {
                           if(var10000 <= 0) {
                              break label287;
                           }

                           var10000 = var1.method_34(var3, var4 + var8, var5 + 2);
                        }

                        if(var10000 != 0) {
                           this.method_6354(var1, var3, var4 + var8, var5 + 2, class_1192.field_6131, 4);
                        }
                     }
                  }
               }
            }

            ++var8;
         }

         if(var6 == null) {
            break;
         }
      }

      return true;
   }

   // $FF: renamed from: a (ahb, int, int, int, int, java.util.Random) void
   private void method_6381(ahb var1, int var2, int var3, int var4, int var5, Random var6) {
      byte var8 = 2;
      String[] var10000 = class_752.method_4253();
      int var9 = var4 - var8;
      String[] var7 = var10000;

      while(var9 <= var4) {
         int var10 = var9 - var4;
         this.method_6375(var1, var2, var9, var3, var5 + 1 - var10, var6);
         ++var9;
         if(var7 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: <clinit> () void
   static void method_6382() {
      boolean var10000 = true;
      char[] var10003 = "®=jLn{Ã=".toCharArray();
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
            field_5989 = (new String((char[])var4)).intern();
            String var2 = field_5989;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 66;
            break;
         case 1:
            var10009 = 83;
            break;
         case 2:
            var10009 = 237;
            break;
         case 3:
            var10009 = 17;
            break;
         case 4:
            var10009 = 70;
            break;
         case 5:
            var10009 = 96;
            break;
         default:
            var10009 = 50;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
