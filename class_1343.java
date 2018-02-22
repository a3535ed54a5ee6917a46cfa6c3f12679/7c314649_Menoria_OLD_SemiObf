
// $FF: renamed from: kg
public class class_1343 {

   // $FF: renamed from: b double
   public double field_6909;
   // $FF: renamed from: c double
   public double field_6910;
   // $FF: renamed from: d double
   public double field_6911;
   // $FF: renamed from: e double
   public double field_6912;
   // $FF: renamed from: f double
   public double field_6913;
   // $FF: renamed from: g double
   public double field_6914;
   // $FF: renamed from: h java.lang.String
   private static final String field_6915;
   // $FF: renamed from: i java.lang.String[]
   private static final String[] field_6916;


   // $FF: renamed from: b (double, double, double, double, double, double) kg
   public static class_1343 method_7093(double var0, double var2, double var4, double var6, double var8, double var10) {
      class_1343 var10000 = new class_1343;
      var10000.method_7094(var0, var2, var4, var6, var8, var10);
      return var10000;
   }

   // $FF: renamed from: <init> (double, double, double, double, double, double) void
   public void method_7094(double var1, double var3, double var5, double var7, double var9, double var11) {
      super();
      this.field_6909 = var1;
      this.field_6910 = var3;
      this.field_6911 = var5;
      this.field_6912 = var7;
      this.field_6913 = var9;
      this.field_6914 = var11;
   }

   // $FF: renamed from: c (double, double, double, double, double, double) kg
   public class_1343 method_7095(double var1, double var3, double var5, double var7, double var9, double var11) {
      this.field_6909 = var1;
      this.field_6910 = var3;
      this.field_6911 = var5;
      this.field_6912 = var7;
      this.field_6913 = var9;
      this.field_6914 = var11;
      return this;
   }

   // $FF: renamed from: b (double, double, double) kg
   public class_1343 method_7096(double var1, double var3, double var5) {
      String[] var10000 = class_752.method_4253();
      double var8 = this.field_6909;
      String[] var7 = var10000;
      double var10 = this.field_6910;
      double var12 = this.field_6911;
      double var14 = this.field_6912;
      double var16 = this.field_6913;
      double var18 = this.field_6914;
      double var22;
      int var20 = (var22 = var1 - 0.0D) == 0.0D?0:(var22 < 0.0D?-1:1);
      if(var7 != null) {
         if(var20 < 0) {
            var8 += var1;
         }

         double var23;
         var20 = (var23 = var1 - 0.0D) == 0.0D?0:(var23 < 0.0D?-1:1);
      }

      if(var7 != null) {
         if(var20 > 0) {
            var14 += var1;
         }

         double var24;
         var20 = (var24 = var3 - 0.0D) == 0.0D?0:(var24 < 0.0D?-1:1);
      }

      if(var7 != null) {
         if(var20 < 0) {
            var10 += var3;
         }

         double var25;
         var20 = (var25 = var3 - 0.0D) == 0.0D?0:(var25 < 0.0D?-1:1);
      }

      if(var7 != null) {
         if(var20 > 0) {
            var16 += var3;
         }

         double var26;
         var20 = (var26 = var5 - 0.0D) == 0.0D?0:(var26 < 0.0D?-1:1);
      }

      double var10001;
      double var21;
      if(var7 != null) {
         if(var20 < 0) {
            var12 += var5;
         }

         var21 = var5;
         var10001 = 0.0D;
         if(var7 == null) {
            return method_7093(var21, var10001, var12, var14, var16, var18);
         }

         double var27;
         var20 = (var27 = var5 - 0.0D) == 0.0D?0:(var27 < 0.0D?-1:1);
      }

      if(var20 > 0) {
         var18 += var5;
      }

      var21 = var8;
      var10001 = var10;
      return method_7093(var21, var10001, var12, var14, var16, var18);
   }

   // $FF: renamed from: c (double, double, double) kg
   public class_1343 method_7097(double var1, double var3, double var5) {
      double var7 = this.field_6909 - var1;
      double var9 = this.field_6910 - var3;
      double var11 = this.field_6911 - var5;
      double var13 = this.field_6912 + var1;
      double var15 = this.field_6913 + var3;
      double var17 = this.field_6914 + var5;
      return method_7093(var7, var9, var11, var13, var15, var17);
   }

   // $FF: renamed from: b (kg) kg
   public class_1343 method_7098(class_1343 var1) {
      double var2 = Math.min(this.field_6909, var1.field_6909);
      double var4 = Math.min(this.field_6910, var1.field_6910);
      double var6 = Math.min(this.field_6911, var1.field_6911);
      double var8 = Math.max(this.field_6912, var1.field_6912);
      double var10 = Math.max(this.field_6913, var1.field_6913);
      double var12 = Math.max(this.field_6914, var1.field_6914);
      return method_7093(var2, var4, var6, var8, var10, var12);
   }

   // $FF: renamed from: d (double, double, double) kg
   public class_1343 method_7099(double var1, double var3, double var5) {
      return method_7093(this.field_6909 + var1, this.field_6910 + var3, this.field_6911 + var5, this.field_6912 + var1, this.field_6913 + var3, this.field_6914 + var5);
   }

   // $FF: renamed from: b (kg, double) double
   public double method_7100(class_1343 var1, double var2) {
      String[] var4 = class_752.method_4253();
      double var10000 = var1.field_6913;
      if(var4 != null) {
         if(var1.field_6913 > this.field_6910) {
            var10000 = var1.field_6910;
            if(var4 == null) {
               return var10000;
            }

            if(var1.field_6910 < this.field_6913) {
               var10000 = var1.field_6914;
               if(var4 != null) {
                  if(var1.field_6914 > this.field_6911) {
                     var10000 = var1.field_6911;
                     if(var4 == null) {
                        return var10000;
                     }

                     if(var1.field_6911 < this.field_6914) {
                        double var8;
                        int var7 = (var8 = var2 - 0.0D) == 0.0D?0:(var8 < 0.0D?-1:1);
                        double var5;
                        if(var4 != null) {
                           label74: {
                              if(var7 > 0) {
                                 double var9;
                                 var7 = (var9 = var1.field_6912 - this.field_6909) == 0.0D?0:(var9 < 0.0D?-1:1);
                                 if(var4 == null) {
                                    break label74;
                                 }

                                 if(var7 <= 0) {
                                    var5 = this.field_6909 - var1.field_6912;
                                    double var10;
                                    var7 = (var10 = var5 - var2) == 0.0D?0:(var10 < 0.0D?-1:1);
                                    if(var4 == null) {
                                       break label74;
                                    }

                                    if(var7 < 0) {
                                       var2 = var5;
                                    }
                                 }
                              }

                              var10000 = var2;
                              if(var4 == null) {
                                 return var10000;
                              }

                              double var11;
                              var7 = (var11 = var2 - 0.0D) == 0.0D?0:(var11 < 0.0D?-1:1);
                           }
                        }

                        if(var7 < 0) {
                           var10000 = var1.field_6909;
                           if(var4 == null) {
                              return var10000;
                           }

                           if(var1.field_6909 >= this.field_6912) {
                              var5 = this.field_6912 - var1.field_6909;
                              var10000 = var5;
                              if(var4 == null) {
                                 return var10000;
                              }

                              if(var5 > var2) {
                                 var2 = var5;
                              }
                           }
                        }

                        var10000 = var2;
                        return var10000;
                     }
                  }

                  var10000 = var2;
               }

               return var10000;
            }
         }

         var10000 = var2;
      }

      return var10000;
   }

   // $FF: renamed from: c (kg, double) double
   public double method_7101(class_1343 var1, double var2) {
      String[] var4 = class_752.method_4253();
      double var10000 = var1.field_6912;
      if(var4 != null) {
         if(var1.field_6912 > this.field_6909) {
            var10000 = var1.field_6909;
            if(var4 == null) {
               return var10000;
            }

            if(var1.field_6909 < this.field_6912) {
               var10000 = var1.field_6914;
               if(var4 != null) {
                  if(var1.field_6914 > this.field_6911) {
                     var10000 = var1.field_6911;
                     if(var4 == null) {
                        return var10000;
                     }

                     if(var1.field_6911 < this.field_6914) {
                        double var8;
                        int var7 = (var8 = var2 - 0.0D) == 0.0D?0:(var8 < 0.0D?-1:1);
                        double var5;
                        if(var4 != null) {
                           label74: {
                              if(var7 > 0) {
                                 double var9;
                                 var7 = (var9 = var1.field_6913 - this.field_6910) == 0.0D?0:(var9 < 0.0D?-1:1);
                                 if(var4 == null) {
                                    break label74;
                                 }

                                 if(var7 <= 0) {
                                    var5 = this.field_6910 - var1.field_6913;
                                    double var10;
                                    var7 = (var10 = var5 - var2) == 0.0D?0:(var10 < 0.0D?-1:1);
                                    if(var4 == null) {
                                       break label74;
                                    }

                                    if(var7 < 0) {
                                       var2 = var5;
                                    }
                                 }
                              }

                              var10000 = var2;
                              if(var4 == null) {
                                 return var10000;
                              }

                              double var11;
                              var7 = (var11 = var2 - 0.0D) == 0.0D?0:(var11 < 0.0D?-1:1);
                           }
                        }

                        if(var7 < 0) {
                           var10000 = var1.field_6910;
                           if(var4 == null) {
                              return var10000;
                           }

                           if(var1.field_6910 >= this.field_6913) {
                              var5 = this.field_6913 - var1.field_6910;
                              var10000 = var5;
                              if(var4 == null) {
                                 return var10000;
                              }

                              if(var5 > var2) {
                                 var2 = var5;
                              }
                           }
                        }

                        var10000 = var2;
                        return var10000;
                     }
                  }

                  var10000 = var2;
               }

               return var10000;
            }
         }

         var10000 = var2;
      }

      return var10000;
   }

   // $FF: renamed from: d (kg, double) double
   public double method_7102(class_1343 var1, double var2) {
      String[] var4 = class_752.method_4253();
      double var10000 = var1.field_6912;
      if(var4 != null) {
         if(var1.field_6912 > this.field_6909) {
            var10000 = var1.field_6909;
            if(var4 == null) {
               return var10000;
            }

            if(var1.field_6909 < this.field_6912) {
               var10000 = var1.field_6913;
               if(var4 != null) {
                  if(var1.field_6913 > this.field_6910) {
                     var10000 = var1.field_6910;
                     if(var4 == null) {
                        return var10000;
                     }

                     if(var1.field_6910 < this.field_6913) {
                        double var8;
                        int var7 = (var8 = var2 - 0.0D) == 0.0D?0:(var8 < 0.0D?-1:1);
                        double var5;
                        if(var4 != null) {
                           label74: {
                              if(var7 > 0) {
                                 double var9;
                                 var7 = (var9 = var1.field_6914 - this.field_6911) == 0.0D?0:(var9 < 0.0D?-1:1);
                                 if(var4 == null) {
                                    break label74;
                                 }

                                 if(var7 <= 0) {
                                    var5 = this.field_6911 - var1.field_6914;
                                    double var10;
                                    var7 = (var10 = var5 - var2) == 0.0D?0:(var10 < 0.0D?-1:1);
                                    if(var4 == null) {
                                       break label74;
                                    }

                                    if(var7 < 0) {
                                       var2 = var5;
                                    }
                                 }
                              }

                              var10000 = var2;
                              if(var4 == null) {
                                 return var10000;
                              }

                              double var11;
                              var7 = (var11 = var2 - 0.0D) == 0.0D?0:(var11 < 0.0D?-1:1);
                           }
                        }

                        if(var7 < 0) {
                           var10000 = var1.field_6911;
                           if(var4 == null) {
                              return var10000;
                           }

                           if(var1.field_6911 >= this.field_6914) {
                              var5 = this.field_6914 - var1.field_6911;
                              var10000 = var5;
                              if(var4 == null) {
                                 return var10000;
                              }

                              if(var5 > var2) {
                                 var2 = var5;
                              }
                           }
                        }

                        var10000 = var2;
                        return var10000;
                     }
                  }

                  var10000 = var2;
               }

               return var10000;
            }
         }

         var10000 = var2;
      }

      return var10000;
   }

   // $FF: renamed from: c (kg) boolean
   public boolean method_7103(class_1343 var1) {
      int var10000;
      label67: {
         String[] var2 = class_752.method_4253();
         double var3;
         var10000 = (var3 = var1.field_6912 - this.field_6909) == 0.0D?0:(var3 < 0.0D?-1:1);
         if(var2 != null) {
            if(var10000 <= 0) {
               break label67;
            }

            double var4;
            var10000 = (var4 = var1.field_6909 - this.field_6912) == 0.0D?0:(var4 < 0.0D?-1:1);
         }

         if(var2 != null) {
            if(var10000 >= 0) {
               break label67;
            }

            double var5;
            var10000 = (var5 = var1.field_6913 - this.field_6910) == 0.0D?0:(var5 < 0.0D?-1:1);
         }

         if(var2 != null) {
            if(var10000 > 0) {
               double var6;
               var10000 = (var6 = var1.field_6910 - this.field_6913) == 0.0D?0:(var6 < 0.0D?-1:1);
               if(var2 == null) {
                  return (boolean)var10000;
               }

               if(var10000 < 0) {
                  double var7;
                  var10000 = (var7 = var1.field_6914 - this.field_6911) == 0.0D?0:(var7 < 0.0D?-1:1);
                  if(var2 != null) {
                     if(var10000 > 0) {
                        double var8;
                        var10000 = (var8 = var1.field_6911 - this.field_6914) == 0.0D?0:(var8 < 0.0D?-1:1);
                        if(var2 == null) {
                           return (boolean)var10000;
                        }

                        if(var10000 < 0) {
                           var10000 = 1;
                           return (boolean)var10000;
                        }
                     }

                     var10000 = 0;
                  }

                  return (boolean)var10000;
               }
            }

            var10000 = 0;
         }

         return (boolean)var10000;
      }

      var10000 = 0;
      return (boolean)var10000;
   }

   // $FF: renamed from: e (double, double, double) kg
   public class_1343 method_7104(double var1, double var3, double var5) {
      this.field_6909 += var1;
      this.field_6910 += var3;
      this.field_6911 += var5;
      this.field_6912 += var1;
      this.field_6913 += var3;
      this.field_6914 += var5;
      return this;
   }

   // $FF: renamed from: b (azw) boolean
   public boolean method_7105(azw var1) {
      int var10000;
      label67: {
         String[] var2 = class_752.method_4253();
         double var3;
         var10000 = (var3 = var1.field_4220 - this.field_6909) == 0.0D?0:(var3 < 0.0D?-1:1);
         if(var2 != null) {
            if(var10000 <= 0) {
               break label67;
            }

            double var4;
            var10000 = (var4 = var1.field_4220 - this.field_6912) == 0.0D?0:(var4 < 0.0D?-1:1);
         }

         if(var2 != null) {
            if(var10000 >= 0) {
               break label67;
            }

            double var5;
            var10000 = (var5 = var1.field_4221 - this.field_6910) == 0.0D?0:(var5 < 0.0D?-1:1);
         }

         if(var2 != null) {
            if(var10000 > 0) {
               double var6;
               var10000 = (var6 = var1.field_4221 - this.field_6913) == 0.0D?0:(var6 < 0.0D?-1:1);
               if(var2 == null) {
                  return (boolean)var10000;
               }

               if(var10000 < 0) {
                  double var7;
                  var10000 = (var7 = var1.field_4222 - this.field_6911) == 0.0D?0:(var7 < 0.0D?-1:1);
                  if(var2 != null) {
                     if(var10000 > 0) {
                        double var8;
                        var10000 = (var8 = var1.field_4222 - this.field_6914) == 0.0D?0:(var8 < 0.0D?-1:1);
                        if(var2 == null) {
                           return (boolean)var10000;
                        }

                        if(var10000 < 0) {
                           var10000 = 1;
                           return (boolean)var10000;
                        }
                     }

                     var10000 = 0;
                  }

                  return (boolean)var10000;
               }
            }

            var10000 = 0;
         }

         return (boolean)var10000;
      }

      var10000 = 0;
      return (boolean)var10000;
   }

   // $FF: renamed from: b () double
   public double method_7106() {
      double var1 = this.field_6912 - this.field_6909;
      double var3 = this.field_6913 - this.field_6910;
      double var5 = this.field_6914 - this.field_6911;
      return (var1 + var3 + var5) / 3.0D;
   }

   // $FF: renamed from: f (double, double, double) kg
   public class_1343 method_7107(double var1, double var3, double var5) {
      double var7 = this.field_6909 + var1;
      double var9 = this.field_6910 + var3;
      double var11 = this.field_6911 + var5;
      double var13 = this.field_6912 - var1;
      double var15 = this.field_6913 - var3;
      double var17 = this.field_6914 - var5;
      return method_7093(var7, var9, var11, var13, var15, var17);
   }

   // $FF: renamed from: c () kg
   public class_1343 method_7108() {
      return method_7093(this.field_6909, this.field_6910, this.field_6911, this.field_6912, this.field_6913, this.field_6914);
   }

   // $FF: renamed from: b (azw, azw) azu
   public azu method_7109(azw var1, azw var2) {
      azw var4 = var1.method_5098(var2, this.field_6909);
      String[] var10000 = class_752.method_4253();
      azw var5 = var1.method_5098(var2, this.field_6912);
      azw var6 = var1.method_5099(var2, this.field_6910);
      azw var7 = var1.method_5099(var2, this.field_6913);
      azw var8 = var1.method_5100(var2, this.field_6911);
      String[] var3 = var10000;
      azw var9 = var1.method_5100(var2, this.field_6914);
      boolean var13 = this.GuiTextField0(var4);
      if(var3 != null) {
         if(!var13) {
            var4 = null;
         }

         var13 = this.GuiTextField0(var5);
      }

      if(var3 != null) {
         if(!var13) {
            var5 = null;
         }

         var13 = this.GuiTextField1(var6);
      }

      if(var3 != null) {
         if(!var13) {
            var6 = null;
         }

         var13 = this.GuiTextField1(var7);
      }

      if(var3 != null) {
         if(!var13) {
            var7 = null;
         }

         var13 = this.GuiTextField2(var8);
      }

      if(var3 != null) {
         if(!var13) {
            var8 = null;
         }

         var13 = this.GuiTextField2(var9);
      }

      if(!var13) {
         var9 = null;
      }

      azw var10 = null;
      azw var14;
      if(var4 != null) {
         label211: {
            label210: {
               if(var10 != null) {
                  var14 = var1;
                  if(var3 == null) {
                     break label210;
                  }

                  if(var1.method_5095(var4) >= var1.method_5095(var10)) {
                     break label211;
                  }
               }

               var14 = var4;
            }

            var10 = var14;
         }
      }

      var14 = var5;
      if(var3 != null) {
         label201: {
            if(var5 != null) {
               label199: {
                  var14 = var10;
                  if(var3 != null) {
                     if(var10 != null) {
                        var14 = var1;
                        if(var3 == null) {
                           break label201;
                        }

                        if(var1.method_5095(var5) >= var1.method_5095(var10)) {
                           break label199;
                        }
                     }

                     var14 = var5;
                  }

                  var10 = var14;
               }
            }

            var14 = var6;
         }
      }

      if(var3 != null) {
         label188: {
            if(var14 != null) {
               label186: {
                  var14 = var10;
                  if(var3 != null) {
                     if(var10 != null) {
                        var14 = var1;
                        if(var3 == null) {
                           break label188;
                        }

                        if(var1.method_5095(var6) >= var1.method_5095(var10)) {
                           break label186;
                        }
                     }

                     var14 = var6;
                  }

                  var10 = var14;
               }
            }

            var14 = var7;
         }
      }

      if(var3 != null) {
         label175: {
            if(var14 != null) {
               label173: {
                  var14 = var10;
                  if(var3 != null) {
                     if(var10 != null) {
                        var14 = var1;
                        if(var3 == null) {
                           break label175;
                        }

                        if(var1.method_5095(var7) >= var1.method_5095(var10)) {
                           break label173;
                        }
                     }

                     var14 = var7;
                  }

                  var10 = var14;
               }
            }

            var14 = var8;
         }
      }

      if(var3 != null) {
         label162: {
            if(var14 != null) {
               label160: {
                  var14 = var10;
                  if(var3 != null) {
                     if(var10 != null) {
                        var14 = var1;
                        if(var3 == null) {
                           break label162;
                        }

                        if(var1.method_5095(var8) >= var1.method_5095(var10)) {
                           break label160;
                        }
                     }

                     var14 = var8;
                  }

                  var10 = var14;
               }
            }

            var14 = var9;
         }
      }

      if(var3 != null) {
         label149: {
            if(var14 != null) {
               label147: {
                  var14 = var10;
                  if(var3 != null) {
                     if(var10 != null) {
                        var14 = var1;
                        if(var3 == null) {
                           break label149;
                        }

                        if(var1.method_5095(var9) >= var1.method_5095(var10)) {
                           break label147;
                        }
                     }

                     var14 = var9;
                  }

                  var10 = var14;
               }
            }

            var14 = var10;
         }
      }

      if(var14 == null) {
         return null;
      } else {
         byte var11 = -1;
         var14 = var10;
         azw var10001 = var4;
         if(var3 != null) {
            if(var10 == var4) {
               var11 = 4;
            }

            var14 = var10;
            var10001 = var5;
         }

         if(var3 != null) {
            if(var14 == var10001) {
               var11 = 5;
            }

            var14 = var10;
            var10001 = var6;
         }

         if(var3 != null) {
            if(var14 == var10001) {
               var11 = 0;
            }

            var14 = var10;
            var10001 = var7;
         }

         if(var3 != null) {
            if(var14 == var10001) {
               var11 = 1;
            }

            var14 = var10;
            var10001 = var8;
         }

         if(var3 != null) {
            if(var14 == var10001) {
               var11 = 2;
            }

            var14 = var10;
            var10001 = var9;
         }

         if(var14 == var10001) {
            var11 = 3;
         }

         azu var12 = new azu;
         var12.method_5081(0, 0, 0, var11, var10);
         return var12;
      }
   }

   // $FF: renamed from: c (azw) boolean
   private boolean GuiTextField0(azw var1) {
      String[] var2 = class_752.method_4253();
      azw var10000 = var1;
      int var3;
      if(var2 != null) {
         if(var1 == null) {
            var3 = 0;
            return (boolean)var3;
         }

         var10000 = var1;
      }

      label50: {
         double var4;
         var3 = (var4 = var10000.field_4221 - this.field_6910) == 0.0D?0:(var4 < 0.0D?-1:1);
         if(var2 != null) {
            if(var3 < 0) {
               break label50;
            }

            double var5;
            var3 = (var5 = var1.field_4221 - this.field_6913) == 0.0D?0:(var5 < 0.0D?-1:1);
         }

         if(var2 != null) {
            if(var3 > 0) {
               break label50;
            }

            double var6;
            var3 = (var6 = var1.field_4222 - this.field_6911) == 0.0D?0:(var6 < 0.0D?-1:1);
         }

         if(var2 != null) {
            if(var3 < 0) {
               break label50;
            }

            double var7;
            var3 = (var7 = var1.field_4222 - this.field_6914) == 0.0D?0:(var7 < 0.0D?-1:1);
         }

         if(var2 == null) {
            return (boolean)var3;
         }

         if(var3 <= 0) {
            var3 = 1;
            return (boolean)var3;
         }
      }

      var3 = 0;
      return (boolean)var3;
   }

   // $FF: renamed from: d (azw) boolean
   private boolean GuiTextField1(azw var1) {
      String[] var2 = class_752.method_4253();
      azw var10000 = var1;
      int var3;
      if(var2 != null) {
         if(var1 == null) {
            var3 = 0;
            return (boolean)var3;
         }

         var10000 = var1;
      }

      label50: {
         double var4;
         var3 = (var4 = var10000.field_4220 - this.field_6909) == 0.0D?0:(var4 < 0.0D?-1:1);
         if(var2 != null) {
            if(var3 < 0) {
               break label50;
            }

            double var5;
            var3 = (var5 = var1.field_4220 - this.field_6912) == 0.0D?0:(var5 < 0.0D?-1:1);
         }

         if(var2 != null) {
            if(var3 > 0) {
               break label50;
            }

            double var6;
            var3 = (var6 = var1.field_4222 - this.field_6911) == 0.0D?0:(var6 < 0.0D?-1:1);
         }

         if(var2 != null) {
            if(var3 < 0) {
               break label50;
            }

            double var7;
            var3 = (var7 = var1.field_4222 - this.field_6914) == 0.0D?0:(var7 < 0.0D?-1:1);
         }

         if(var2 == null) {
            return (boolean)var3;
         }

         if(var3 <= 0) {
            var3 = 1;
            return (boolean)var3;
         }
      }

      var3 = 0;
      return (boolean)var3;
   }

   // $FF: renamed from: e (azw) boolean
   private boolean GuiTextField2(azw var1) {
      String[] var2 = class_752.method_4253();
      azw var10000 = var1;
      int var3;
      if(var2 != null) {
         if(var1 == null) {
            var3 = 0;
            return (boolean)var3;
         }

         var10000 = var1;
      }

      label50: {
         double var4;
         var3 = (var4 = var10000.field_4220 - this.field_6909) == 0.0D?0:(var4 < 0.0D?-1:1);
         if(var2 != null) {
            if(var3 < 0) {
               break label50;
            }

            double var5;
            var3 = (var5 = var1.field_4220 - this.field_6912) == 0.0D?0:(var5 < 0.0D?-1:1);
         }

         if(var2 != null) {
            if(var3 > 0) {
               break label50;
            }

            double var6;
            var3 = (var6 = var1.field_4221 - this.field_6910) == 0.0D?0:(var6 < 0.0D?-1:1);
         }

         if(var2 != null) {
            if(var3 < 0) {
               break label50;
            }

            double var7;
            var3 = (var7 = var1.field_4221 - this.field_6913) == 0.0D?0:(var7 < 0.0D?-1:1);
         }

         if(var2 == null) {
            return (boolean)var3;
         }

         if(var3 <= 0) {
            var3 = 1;
            return (boolean)var3;
         }
      }

      var3 = 0;
      return (boolean)var3;
   }

   // $FF: renamed from: e (kg) void
   public void GuiTextField3(class_1343 var1) {
      this.field_6909 = var1.field_6909;
      this.field_6910 = var1.field_6910;
      this.field_6911 = var1.field_6911;
      this.field_6912 = var1.field_6912;
      this.field_6913 = var1.field_6913;
      this.field_6914 = var1.field_6914;
   }

   public String toString() {
      StringBuilder var10000 = new StringBuilder();
      String[] var1 = field_6916;
      return var10000.append("box[").append(this.field_6909).append(", ").append(this.field_6910).append(", ").append(this.field_6911).append(" -> ").append(this.field_6912).append(", ").append(this.field_6913).append(", ").append(this.field_6914).append("]").toString();
   }

   // $FF: renamed from: <clinit> () void
   static void GuiTextField4() {
      // $FF: Couldn't be decompiled
   }
}
