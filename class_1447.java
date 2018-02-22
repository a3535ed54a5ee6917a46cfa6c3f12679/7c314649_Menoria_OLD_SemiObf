
// $FF: renamed from: od
public class class_1447 {

   // $FF: renamed from: b float[][]
   public float[][] field_7690;
   // $FF: renamed from: c float[]
   public float[] field_7691;
   // $FF: renamed from: d float[]
   public float[] field_7692;
   // $FF: renamed from: e float[]
   public float[] field_7693;
   // $FF: renamed from: f java.lang.String
   private static final String field_7694 = "CL_00000977";


   // $FF: renamed from: <init> () void
   public void method_7886() {
      super();
      this.field_7690 = new float[16][16];
      this.field_7691 = new float[16];
      this.field_7692 = new float[16];
      this.field_7693 = new float[16];
   }

   // $FF: renamed from: a (double, double, double, double, double, double) boolean
   public boolean method_7887(double var1, double var3, double var5, double var7, double var9, double var11) {
      String[] var10000 = class_752.method_4253();
      int var14 = 0;
      String[] var13 = var10000;

      int var21;
      while(true) {
         if(var14 < 6) {
            float var15 = (float)var1;
            float var16 = (float)var3;
            float var17 = (float)var5;
            float var18 = (float)var7;
            float var19 = (float)var9;
            float var20 = (float)var11;
            if(var13 != null) {
               float var22;
               var21 = (var22 = this.field_7690[var14][0] * var15 + this.field_7690[var14][1] * var16 + this.field_7690[var14][2] * var17 + this.field_7690[var14][3] - 0.0F) == 0.0F?0:(var22 < 0.0F?-1:1);
               if(var13 == null) {
                  break;
               }

               if(var21 <= 0) {
                  label86: {
                     float var23;
                     var21 = (var23 = this.field_7690[var14][0] * var18 + this.field_7690[var14][1] * var16 + this.field_7690[var14][2] * var17 + this.field_7690[var14][3] - 0.0F) == 0.0F?0:(var23 < 0.0F?-1:1);
                     if(var13 != null) {
                        if(var21 > 0) {
                           break label86;
                        }

                        float var24;
                        var21 = (var24 = this.field_7690[var14][0] * var15 + this.field_7690[var14][1] * var19 + this.field_7690[var14][2] * var17 + this.field_7690[var14][3] - 0.0F) == 0.0F?0:(var24 < 0.0F?-1:1);
                     }

                     if(var13 != null) {
                        if(var21 > 0) {
                           break label86;
                        }

                        float var25;
                        var21 = (var25 = this.field_7690[var14][0] * var18 + this.field_7690[var14][1] * var19 + this.field_7690[var14][2] * var17 + this.field_7690[var14][3] - 0.0F) == 0.0F?0:(var25 < 0.0F?-1:1);
                     }

                     if(var13 != null) {
                        if(var21 > 0) {
                           break label86;
                        }

                        float var26;
                        var21 = (var26 = this.field_7690[var14][0] * var15 + this.field_7690[var14][1] * var16 + this.field_7690[var14][2] * var20 + this.field_7690[var14][3] - 0.0F) == 0.0F?0:(var26 < 0.0F?-1:1);
                     }

                     if(var13 != null) {
                        if(var21 > 0) {
                           break label86;
                        }

                        float var27;
                        var21 = (var27 = this.field_7690[var14][0] * var18 + this.field_7690[var14][1] * var16 + this.field_7690[var14][2] * var20 + this.field_7690[var14][3] - 0.0F) == 0.0F?0:(var27 < 0.0F?-1:1);
                     }

                     if(var13 != null) {
                        if(var21 > 0) {
                           break label86;
                        }

                        float var28;
                        var21 = (var28 = this.field_7690[var14][0] * var15 + this.field_7690[var14][1] * var19 + this.field_7690[var14][2] * var20 + this.field_7690[var14][3] - 0.0F) == 0.0F?0:(var28 < 0.0F?-1:1);
                     }

                     if(var13 != null) {
                        if(var21 > 0) {
                           break label86;
                        }

                        float var29;
                        var21 = (var29 = this.field_7690[var14][0] * var18 + this.field_7690[var14][1] * var19 + this.field_7690[var14][2] * var20 + this.field_7690[var14][3] - 0.0F) == 0.0F?0:(var29 < 0.0F?-1:1);
                     }

                     if(var13 != null) {
                        if(var21 > 0) {
                           break label86;
                        }

                        var21 = 0;
                     }

                     return (boolean)var21;
                  }
               }

               ++var14;
            }

            if(var13 != null) {
               continue;
            }
         }

         var21 = 1;
         break;
      }

      return (boolean)var21;
   }

   // $FF: renamed from: b (double, double, double, double, double, double) boolean
   public boolean method_7888(double var1, double var3, double var5, double var7, double var9, double var11) {
      String[] var10000 = class_752.method_4253();
      int var14 = 0;
      String[] var13 = var10000;

      int var21;
      while(true) {
         if(var14 < 6) {
            float var15 = (float)var1;
            float var16 = (float)var3;
            float var17 = (float)var5;
            float var18 = (float)var7;
            float var19 = (float)var9;
            float var20 = (float)var11;
            var21 = var14;
            if(var13 == null) {
               break;
            }

            label142: {
               if(var13 != null) {
                  if(var14 < 4) {
                     float var22;
                     var21 = (var22 = this.field_7690[var14][0] * var15 + this.field_7690[var14][1] * var16 + this.field_7690[var14][2] * var17 + this.field_7690[var14][3] - 0.0F) == 0.0F?0:(var22 < 0.0F?-1:1);
                     if(var13 != null) {
                        if(var21 > 0) {
                           float var23;
                           var21 = (var23 = this.field_7690[var14][0] * var18 + this.field_7690[var14][1] * var16 + this.field_7690[var14][2] * var17 + this.field_7690[var14][3] - 0.0F) == 0.0F?0:(var23 < 0.0F?-1:1);
                           if(var13 == null) {
                              return (boolean)var21;
                           }

                           if(var21 > 0) {
                              float var24;
                              var21 = (var24 = this.field_7690[var14][0] * var15 + this.field_7690[var14][1] * var19 + this.field_7690[var14][2] * var17 + this.field_7690[var14][3] - 0.0F) == 0.0F?0:(var24 < 0.0F?-1:1);
                              if(var13 == null) {
                                 return (boolean)var21;
                              }

                              if(var21 > 0) {
                                 float var25;
                                 var21 = (var25 = this.field_7690[var14][0] * var18 + this.field_7690[var14][1] * var19 + this.field_7690[var14][2] * var17 + this.field_7690[var14][3] - 0.0F) == 0.0F?0:(var25 < 0.0F?-1:1);
                                 if(var13 == null) {
                                    return (boolean)var21;
                                 }

                                 if(var21 > 0) {
                                    float var26;
                                    var21 = (var26 = this.field_7690[var14][0] * var15 + this.field_7690[var14][1] * var16 + this.field_7690[var14][2] * var20 + this.field_7690[var14][3] - 0.0F) == 0.0F?0:(var26 < 0.0F?-1:1);
                                    if(var13 == null) {
                                       return (boolean)var21;
                                    }

                                    if(var21 > 0) {
                                       float var27;
                                       var21 = (var27 = this.field_7690[var14][0] * var18 + this.field_7690[var14][1] * var16 + this.field_7690[var14][2] * var20 + this.field_7690[var14][3] - 0.0F) == 0.0F?0:(var27 < 0.0F?-1:1);
                                       if(var13 == null) {
                                          return (boolean)var21;
                                       }

                                       if(var21 > 0) {
                                          float var28;
                                          var21 = (var28 = this.field_7690[var14][0] * var15 + this.field_7690[var14][1] * var19 + this.field_7690[var14][2] * var20 + this.field_7690[var14][3] - 0.0F) == 0.0F?0:(var28 < 0.0F?-1:1);
                                          if(var13 == null) {
                                             return (boolean)var21;
                                          }

                                          if(var21 > 0) {
                                             float var29;
                                             var21 = (var29 = this.field_7690[var14][0] * var18 + this.field_7690[var14][1] * var19 + this.field_7690[var14][2] * var20 + this.field_7690[var14][3] - 0.0F) == 0.0F?0:(var29 < 0.0F?-1:1);
                                             if(var13 == null) {
                                                return (boolean)var21;
                                             }

                                             if(var21 > 0) {
                                                break label142;
                                             }
                                          }
                                       }
                                    }
                                 }
                              }
                           }
                        }

                        var21 = 0;
                     }

                     return (boolean)var21;
                  }

                  float var30;
                  var21 = (var30 = this.field_7690[var14][0] * var15 + this.field_7690[var14][1] * var16 + this.field_7690[var14][2] * var17 + this.field_7690[var14][3] - 0.0F) == 0.0F?0:(var30 < 0.0F?-1:1);
               }

               if(var13 != null) {
                  if(var21 > 0) {
                     break label142;
                  }

                  float var31;
                  var21 = (var31 = this.field_7690[var14][0] * var18 + this.field_7690[var14][1] * var16 + this.field_7690[var14][2] * var17 + this.field_7690[var14][3] - 0.0F) == 0.0F?0:(var31 < 0.0F?-1:1);
               }

               if(var13 != null) {
                  if(var21 > 0) {
                     break label142;
                  }

                  float var32;
                  var21 = (var32 = this.field_7690[var14][0] * var15 + this.field_7690[var14][1] * var19 + this.field_7690[var14][2] * var17 + this.field_7690[var14][3] - 0.0F) == 0.0F?0:(var32 < 0.0F?-1:1);
               }

               if(var13 != null) {
                  if(var21 > 0) {
                     break label142;
                  }

                  float var33;
                  var21 = (var33 = this.field_7690[var14][0] * var18 + this.field_7690[var14][1] * var19 + this.field_7690[var14][2] * var17 + this.field_7690[var14][3] - 0.0F) == 0.0F?0:(var33 < 0.0F?-1:1);
               }

               if(var13 != null) {
                  if(var21 > 0) {
                     break label142;
                  }

                  float var34;
                  var21 = (var34 = this.field_7690[var14][0] * var15 + this.field_7690[var14][1] * var16 + this.field_7690[var14][2] * var20 + this.field_7690[var14][3] - 0.0F) == 0.0F?0:(var34 < 0.0F?-1:1);
               }

               if(var13 != null) {
                  if(var21 > 0) {
                     break label142;
                  }

                  float var35;
                  var21 = (var35 = this.field_7690[var14][0] * var18 + this.field_7690[var14][1] * var16 + this.field_7690[var14][2] * var20 + this.field_7690[var14][3] - 0.0F) == 0.0F?0:(var35 < 0.0F?-1:1);
               }

               if(var13 != null) {
                  if(var21 > 0) {
                     break label142;
                  }

                  float var36;
                  var21 = (var36 = this.field_7690[var14][0] * var15 + this.field_7690[var14][1] * var19 + this.field_7690[var14][2] * var20 + this.field_7690[var14][3] - 0.0F) == 0.0F?0:(var36 < 0.0F?-1:1);
               }

               if(var13 != null) {
                  if(var21 > 0) {
                     break label142;
                  }

                  float var37;
                  var21 = (var37 = this.field_7690[var14][0] * var18 + this.field_7690[var14][1] * var19 + this.field_7690[var14][2] * var20 + this.field_7690[var14][3] - 0.0F) == 0.0F?0:(var37 < 0.0F?-1:1);
               }

               if(var13 != null) {
                  if(var21 > 0) {
                     break label142;
                  }

                  var21 = 0;
               }

               return (boolean)var21;
            }

            ++var14;
            if(var13 != null) {
               continue;
            }
         }

         var21 = 1;
         break;
      }

      return (boolean)var21;
   }

   // $FF: renamed from: <clinit> () void
   static void method_7889() {
      boolean var10000 = true;
      char[] var10003 = "YèP¹oÿe1ï".toCharArray();
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
            field_7694 = (new String((char[])var4)).intern();
            String var2 = field_7694;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 226;
            break;
         case 1:
            var10009 = 113;
            break;
         case 2:
            var10009 = 43;
            break;
         case 3:
            var10009 = 245;
            break;
         case 4:
            var10009 = 77;
            break;
         case 5:
            var10009 = 164;
            break;
         default:
            var10009 = 114;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
