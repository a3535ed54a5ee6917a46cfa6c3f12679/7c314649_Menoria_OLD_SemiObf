
// $FF: renamed from: dx
public class class_1049 implements ahl {

   // $FF: renamed from: b int
   private int field_5549;
   // $FF: renamed from: c int
   private int field_5550;
   // $FF: renamed from: d gI[][]
   private class_1069[][] field_5551;
   // $FF: renamed from: e boolean
   private boolean field_5552;
   // $FF: renamed from: f ahb
   private ahb field_5553;


   // $FF: renamed from: <init> (ahb, int, int, int, int, int, int, int) void
   public void method_5949(ahb var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      super();
      this.field_5553 = var1;
      String[] var10000 = class_752.method_4253();
      this.field_5549 = var2 - var8 >> 4;
      String[] var9 = var10000;
      this.field_5550 = var4 - var8 >> 4;
      int var10 = var5 + var8 >> 4;
      int var11 = var7 + var8 >> 4;
      this.field_5551 = new class_1069[var10 - this.field_5549 + 1][var11 - this.field_5550 + 1];
      this.field_5552 = true;
      int var12 = this.field_5549;

      label165:
      while(true) {
         int var13;
         class_1069 var14;
         if(var12 <= var10) {
            if(var9 != null) {
               var13 = this.field_5550;

               while(true) {
                  if(var13 <= var11) {
                     var14 = var1.method_2053(var12, var13);
                     if(var9 != null) {
                        if(var9 == null) {
                           if(var14 != null && !var14.method_6056(var3, var6)) {
                              this.field_5552 = false;
                           }

                           ++var13;
                           if(var9 == null) {
                              ++var12;
                              if(var9 == null || var12 > var5 >> 4) {
                                 return;
                              }

                              var13 = var4 >> 4;
                           }
                           break;
                        }

                        if(var14 != null) {
                           this.field_5551[var12 - this.field_5549][var13 - this.field_5550] = var14;
                        }

                        ++var13;
                     }

                     if(var9 != null) {
                        continue;
                     }

                     ++var12;
                     if(var9 != null) {
                        continue label165;
                     }

                     var12 = var2 >> 4;
                     if(var12 > var5 >> 4) {
                        return;
                     }

                     var13 = var4 >> 4;
                     break;
                  }

                  ++var12;
                  if(var9 != null) {
                     continue label165;
                  }

                  var12 = var2 >> 4;
                  if(var12 > var5 >> 4) {
                     return;
                  }

                  var13 = var4 >> 4;
                  break;
               }
            } else {
               var12 = this.field_5550;
               if(var12 > var5 >> 4) {
                  break;
               }

               var13 = var4 >> 4;
            }
         } else {
            var12 = var2 >> 4;
            if(var12 > var5 >> 4) {
               break;
            }

            var13 = var4 >> 4;
         }

         while(true) {
            while(true) {
               if(var13 > var7 >> 4) {
                  ++var12;
                  if(var9 == null || var12 > var5 >> 4) {
                     return;
                  }

                  var13 = var4 >> 4;
               } else {
                  var14 = this.field_5551[var12 - this.field_5549][var13 - this.field_5550];
                  if(var9 != null) {
                     if(var9 != null) {
                        if(var14 != null && !var14.method_6056(var3, var6)) {
                           this.field_5552 = false;
                        }

                        ++var13;
                     }

                     if(var9 == null) {
                        ++var12;
                        if(var9 == null || var12 > var5 >> 4) {
                           return;
                        }

                        var13 = var4 >> 4;
                     }
                  } else {
                     if(var9 == null || var12 > var5 >> 4) {
                        return;
                     }

                     var13 = var4 >> 4;
                  }
               }
            }
         }
      }

   }

   // $FF: renamed from: T () boolean
   public boolean method_37() {
      return this.field_5552;
   }

   // $FF: renamed from: a (int, int, int) aji
   public aji getBlock(int var1, int var2, int var3) {
      String[] var10000 = class_752.method_4253();
      aji var5 = class_1192.field_6025;
      String[] var4 = var10000;
      int var9 = var2;
      if(var4 != null) {
         if(var2 < 0) {
            return var5;
         }

         var9 = var2;
      }

      int var10001 = 256;
      if(var4 != null) {
         if(var9 >= 256) {
            return var5;
         }

         var9 = var1 >> 4;
         var10001 = this.field_5549;
      }

      int var6 = var9 - var10001;
      int var7 = (var3 >> 4) - this.field_5550;
      var9 = var6;
      if(var4 != null) {
         if(var6 < 0) {
            return var5;
         }

         var9 = var6;
      }

      if(var4 != null) {
         if(var9 >= this.field_5551.length) {
            return var5;
         }

         var9 = var7;
      }

      if(var4 != null) {
         if(var9 < 0) {
            return var5;
         }

         var9 = var7;
      }

      if(var9 < this.field_5551[var6].length) {
         class_1069 var8 = this.field_5551[var6][var7];
         class_1069 var10 = var8;
         if(var4 != null) {
            if(var8 == null) {
               return var5;
            }

            var10 = var8;
         }

         var5 = var10.method_6028(var1 & 15, var2, var3 & 15);
      }

      return var5;
   }

   // $FF: renamed from: o (int, int, int) gi
   public class_580 method_31(int var1, int var2, int var3) {
      int var4 = (var1 >> 4) - this.field_5549;
      int var5 = (var3 >> 4) - this.field_5550;
      return this.field_5551[var4][var5].method_6039(var1 & 15, var2, var3 & 15);
   }

   // $FF: renamed from: c (int, int, int, int) int
   public int method_32(int var1, int var2, int var3, int var4) {
      String[] var10000 = class_752.method_4253();
      int var6 = this.method_5950(class_95.field_53, var1, var2, var3);
      String[] var5 = var10000;
      int var7 = this.method_5950(class_95.field_54, var1, var2, var3);
      int var8 = var7;
      int var10001 = var4;
      if(var5 != null) {
         if(var7 < var4) {
            var7 = var4;
         }

         var8 = var6 << 20;
         var10001 = var7 << 4;
      }

      return var8 | var10001;
   }

   // $FF: renamed from: e (int, int, int) int
   public int method_33(int var1, int var2, int var3) {
      String[] var4 = class_752.method_4253();
      int var10000 = var2;
      if(var4 != null) {
         if(var2 < 0) {
            return 0;
         }

         var10000 = var2;
      }

      int var10001 = 256;
      if(var4 != null) {
         if(var10000 >= 256) {
            return 0;
         }

         var10000 = var1 >> 4;
         var10001 = this.field_5549;
      }

      int var5 = var10000 - var10001;
      int var6 = (var3 >> 4) - this.field_5550;
      return this.field_5551[var5][var6].method_6029(var1 & 15, var2, var3 & 15);
   }

   // $FF: renamed from: a (int, int) dz
   public class_985 method_35(int var1, int var2) {
      return this.field_5553.method_35(var1, var2);
   }

   // $FF: renamed from: c (int, int, int) boolean
   public boolean method_34(int var1, int var2, int var3) {
      return this.getBlock(var1, var2, var3).method_2424() == awt.field_4170;
   }

   // $FF: renamed from: b (H, int, int, int) int
   public int method_5950(class_95 var1, int var2, int var3, int var4) {
      String[] var5 = class_752.method_4253();
      int var10000 = var3;
      if(var5 != null) {
         if(var3 < 0) {
            var3 = 0;
         }

         var10000 = var3;
      }

      if(var5 != null) {
         if(var10000 >= 256) {
            var3 = 255;
         }

         var10000 = var3;
      }

      if(var5 != null) {
         if(var10000 >= 0) {
            var10000 = var3;
            if(var5 == null) {
               return var10000;
            }

            if(var3 < 256) {
               var10000 = var2;
               if(var5 == null) {
                  return var10000;
               }

               if(var2 >= -30000000) {
                  var10000 = var4;
                  if(var5 == null) {
                     return var10000;
                  }

                  if(var4 >= -30000000) {
                     var10000 = var2;
                     if(var5 == null) {
                        return var10000;
                     }

                     if(var2 < 30000000) {
                        var10000 = var4;
                        if(var5 == null) {
                           return var10000;
                        }

                        if(var4 <= 30000000) {
                           label84: {
                              if(var1 == class_95.field_53) {
                                 var10000 = this.field_5553.field_1820.field_5736;
                                 if(var5 == null) {
                                    break label84;
                                 }

                                 if(this.field_5553.field_1820.field_5736) {
                                    return 0;
                                 }
                              }

                              var10000 = this.getBlock(var2, var3, var4).method_2423();
                           }

                           int var6;
                           int var7;
                           if(var5 != null) {
                              if(var10000 != 0) {
                                 var6 = this.method_5951(var1, var2, var3 + 1, var4);
                                 var7 = this.method_5951(var1, var2 + 1, var3, var4);
                                 int var8 = this.method_5951(var1, var2 - 1, var3, var4);
                                 int var9 = this.method_5951(var1, var2, var3, var4 + 1);
                                 int var10 = this.method_5951(var1, var2, var3, var4 - 1);
                                 var10000 = var7;
                                 int var10001 = var6;
                                 if(var5 != null) {
                                    if(var7 > var6) {
                                       var6 = var7;
                                    }

                                    var10000 = var8;
                                    var10001 = var6;
                                 }

                                 if(var5 != null) {
                                    if(var10000 > var10001) {
                                       var6 = var8;
                                    }

                                    var10000 = var9;
                                    var10001 = var6;
                                 }

                                 if(var5 != null) {
                                    if(var10000 > var10001) {
                                       var6 = var9;
                                    }

                                    var10000 = var10;
                                    if(var5 == null) {
                                       return var10000;
                                    }

                                    var10001 = var6;
                                 }

                                 if(var10000 > var10001) {
                                    var6 = var10;
                                 }

                                 var10000 = var6;
                                 return var10000;
                              }

                              var10000 = (var2 >> 4) - this.field_5549;
                           }

                           var6 = var10000;
                           var7 = (var4 >> 4) - this.field_5550;
                           return this.field_5551[var6][var7].method_6032(var1, var2 & 15, var3, var4 & 15);
                        }
                     }
                  }
               }
            }
         }

         var10000 = var1.field_55;
      }

      return var10000;
   }

   // $FF: renamed from: c (H, int, int, int) int
   public int method_5951(class_95 var1, int var2, int var3, int var4) {
      String[] var5 = class_752.method_4253();
      int var10000 = var3;
      if(var5 != null) {
         if(var3 < 0) {
            var3 = 0;
         }

         var10000 = var3;
      }

      if(var5 != null) {
         if(var10000 >= 256) {
            var3 = 255;
         }

         var10000 = var3;
      }

      if(var5 != null) {
         if(var10000 >= 0) {
            var10000 = var3;
            if(var5 == null) {
               return var10000;
            }

            if(var3 < 256) {
               var10000 = var2;
               if(var5 == null) {
                  return var10000;
               }

               if(var2 >= -30000000) {
                  var10000 = var4;
                  if(var5 == null) {
                     return var10000;
                  }

                  if(var4 >= -30000000) {
                     var10000 = var2;
                     if(var5 == null) {
                        return var10000;
                     }

                     if(var2 < 30000000) {
                        label38: {
                           var10000 = var4;
                           int var10001 = 30000000;
                           if(var5 != null) {
                              if(var4 > 30000000) {
                                 break label38;
                              }

                              var10000 = var2 >> 4;
                              var10001 = this.field_5549;
                           }

                           int var6 = var10000 - var10001;
                           int var7 = (var4 >> 4) - this.field_5550;
                           return this.field_5551[var6][var7].method_6032(var1, var2 & 15, var3, var4 & 15);
                        }
                     }
                  }
               }
            }
         }

         var10000 = var1.field_55;
      }

      return var10000;
   }

   // $FF: renamed from: R () int
   public int method_36() {
      return 256;
   }

   // $FF: renamed from: e (int, int, int, int) int
   public int method_38(int var1, int var2, int var3, int var4) {
      return this.getBlock(var1, var2, var3).method_2499(this, var1, var2, var3, var4);
   }
}
