import java.util.List;
import java.util.Random;

// $FF: renamed from: fR
public class class_389 extends aji {

   // $FF: renamed from: M java.lang.String
   private final String field_2075;
   // $FF: renamed from: N boolean
   private final boolean field_2076;
   // $FF: renamed from: O java.lang.String
   private final String field_2077;
   // $FF: renamed from: P vL
   private class_73 field_2078;


   // $FF: renamed from: <init> (java.lang.String, java.lang.String, awt, boolean) void
   protected void method_2605(String var1, String var2, awt var3, boolean var4) {
      super.method_2427(var3);
      this.field_2075 = var2;
      this.field_2076 = var4;
      this.field_2077 = var1;
      this.method_2521(class_872.field_4245);
   }

   // $FF: renamed from: a (int, java.util.Random, int) adb
   public adb method_2464(int var1, Random var2, int var3) {
      String[] var4 = class_752.method_4253();
      class_389 var10000 = this;
      if(var4 != null) {
         if(!this.field_2076) {
            return null;
         }

         var10000 = this;
      }

      return var10000.method_2464(var1, var2, var3);
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
      return this.field_2007 == awt.field_4188?41:18;
   }

   // $FF: renamed from: a (ahl, int, int, int, int) boolean
   public boolean method_2445(ahl var1, int var2, int var3, int var4, int var5) {
      return var1.getBlock(var2, var3, var4) == this?false:super.method_2445(var1, var2, var3, var4, var5);
   }

   // $FF: renamed from: a (ahb, int, int, int, kg, java.util.List, sa) void
   public void method_2451(ahb var1, int var2, int var3, int var4, class_1343 var5, List var6, class_689 var7) {
      String[] var8;
      boolean var9;
      boolean var10;
      boolean var11;
      boolean var12;
      boolean var13;
      label154: {
         label157: {
            label152: {
               label151: {
                  label158: {
                     var9 = this.method_2607(var1.getBlock(var2, var3, var4 - 1));
                     String[] var10000 = class_752.method_4253();
                     var10 = this.method_2607(var1.getBlock(var2, var3, var4 + 1));
                     var11 = this.method_2607(var1.getBlock(var2 - 1, var3, var4));
                     var8 = var10000;
                     var12 = this.method_2607(var1.getBlock(var2 + 1, var3, var4));
                     var13 = var11;
                     if(var8 != null) {
                        label148: {
                           if(var11) {
                              var13 = var12;
                              if(var8 == null) {
                                 break label148;
                              }

                              if(var12) {
                                 break label158;
                              }
                           }

                           var13 = var11;
                        }
                     }

                     if(var8 == null) {
                        break label152;
                     }

                     if(var13) {
                        break label151;
                     }

                     var13 = var12;
                     if(var8 == null) {
                        break label152;
                     }

                     if(var12) {
                        break label151;
                     }

                     var13 = var9;
                     if(var8 == null) {
                        break label152;
                     }

                     if(var9) {
                        break label151;
                     }

                     var13 = var10;
                     if(var8 == null) {
                        break label152;
                     }

                     if(var10) {
                        break label151;
                     }
                  }

                  this.method_2443(0.0F, 0.0F, 0.4375F, 1.0F, 1.0F, 0.5625F);
                  super.method_2451(var1, var2, var3, var4, var5, var6, var7);
                  if(var8 != null) {
                     break label157;
                  }
               }

               var13 = var11;
            }

            if(var8 != null) {
               label120: {
                  if(var13) {
                     var13 = var12;
                     if(var8 == null) {
                        break label120;
                     }

                     if(!var12) {
                        this.method_2443(0.0F, 0.0F, 0.4375F, 0.5F, 1.0F, 0.5625F);
                        super.method_2451(var1, var2, var3, var4, var5, var6, var7);
                        if(var8 != null) {
                           break label157;
                        }
                     }
                  }

                  var13 = var11;
               }
            }

            if(var8 == null) {
               break label154;
            }

            if(!var13) {
               var13 = var12;
               if(var8 == null) {
                  break label154;
               }

               if(var12) {
                  this.method_2443(0.5F, 0.0F, 0.4375F, 1.0F, 1.0F, 0.5625F);
                  super.method_2451(var1, var2, var3, var4, var5, var6, var7);
               }
            }
         }

         var13 = var9;
      }

      label104: {
         label103: {
            label160: {
               if(var8 != null) {
                  label100: {
                     if(var13) {
                        var13 = var10;
                        if(var8 == null) {
                           break label100;
                        }

                        if(var10) {
                           break label160;
                        }
                     }

                     var13 = var11;
                  }
               }

               if(var8 == null) {
                  break label104;
               }

               if(var13) {
                  break label103;
               }

               var13 = var12;
               if(var8 == null) {
                  break label104;
               }

               if(var12) {
                  break label103;
               }

               var13 = var9;
               if(var8 == null) {
                  break label104;
               }

               if(var9) {
                  break label103;
               }

               var13 = var10;
               if(var8 == null) {
                  break label104;
               }

               if(var10) {
                  break label103;
               }
            }

            this.method_2443(0.4375F, 0.0F, 0.0F, 0.5625F, 1.0F, 1.0F);
            super.method_2451(var1, var2, var3, var4, var5, var6, var7);
            if(var8 != null) {
               return;
            }
         }

         var13 = var9;
      }

      if(var8 != null) {
         label72: {
            if(var13) {
               var13 = var10;
               if(var8 == null) {
                  break label72;
               }

               if(!var10) {
                  this.method_2443(0.4375F, 0.0F, 0.0F, 0.5625F, 1.0F, 0.5F);
                  super.method_2451(var1, var2, var3, var4, var5, var6, var7);
                  if(var8 != null) {
                     return;
                  }
               }
            }

            var13 = var9;
         }
      }

      if(var8 != null) {
         if(var13) {
            return;
         }

         var13 = var10;
      }

      if(var13) {
         this.method_2443(0.4375F, 0.0F, 0.5F, 0.5625F, 1.0F, 1.0F);
         super.method_2451(var1, var2, var3, var4, var5, var6, var7);
      }

   }

   // $FF: renamed from: g () void
   public void method_2500() {
      this.method_2443(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
   }

   // $FF: renamed from: a (ahl, int, int, int) void
   public void method_2486(ahl var1, int var2, int var3, int var4) {
      String[] var5;
      float var6;
      float var7;
      float var8;
      float var9;
      boolean var10;
      boolean var11;
      boolean var12;
      boolean var13;
      boolean var14;
      label154: {
         label157: {
            label152: {
               label151: {
                  label158: {
                     var6 = 0.4375F;
                     String[] var10000 = class_752.method_4253();
                     var7 = 0.5625F;
                     var8 = 0.4375F;
                     var9 = 0.5625F;
                     var10 = this.method_2607(var1.getBlock(var2, var3, var4 - 1));
                     var11 = this.method_2607(var1.getBlock(var2, var3, var4 + 1));
                     var12 = this.method_2607(var1.getBlock(var2 - 1, var3, var4));
                     var5 = var10000;
                     var13 = this.method_2607(var1.getBlock(var2 + 1, var3, var4));
                     var14 = var12;
                     if(var5 != null) {
                        label148: {
                           if(var12) {
                              var14 = var13;
                              if(var5 == null) {
                                 break label148;
                              }

                              if(var13) {
                                 break label158;
                              }
                           }

                           var14 = var12;
                        }
                     }

                     if(var5 == null) {
                        break label152;
                     }

                     if(var14) {
                        break label151;
                     }

                     var14 = var13;
                     if(var5 == null) {
                        break label152;
                     }

                     if(var13) {
                        break label151;
                     }

                     var14 = var10;
                     if(var5 == null) {
                        break label152;
                     }

                     if(var10) {
                        break label151;
                     }

                     var14 = var11;
                     if(var5 == null) {
                        break label152;
                     }

                     if(var11) {
                        break label151;
                     }
                  }

                  var6 = 0.0F;
                  var7 = 1.0F;
                  if(var5 != null) {
                     break label157;
                  }
               }

               var14 = var12;
            }

            if(var5 != null) {
               label120: {
                  if(var14) {
                     var14 = var13;
                     if(var5 == null) {
                        break label120;
                     }

                     if(!var13) {
                        var6 = 0.0F;
                        if(var5 != null) {
                           break label157;
                        }
                     }
                  }

                  var14 = var12;
               }
            }

            if(var5 == null) {
               break label154;
            }

            if(!var14) {
               var14 = var13;
               if(var5 == null) {
                  break label154;
               }

               if(var13) {
                  var7 = 1.0F;
               }
            }
         }

         var14 = var10;
      }

      label159: {
         label104: {
            label103: {
               label160: {
                  if(var5 != null) {
                     label100: {
                        if(var14) {
                           var14 = var11;
                           if(var5 == null) {
                              break label100;
                           }

                           if(var11) {
                              break label160;
                           }
                        }

                        var14 = var12;
                     }
                  }

                  if(var5 == null) {
                     break label104;
                  }

                  if(var14) {
                     break label103;
                  }

                  var14 = var13;
                  if(var5 == null) {
                     break label104;
                  }

                  if(var13) {
                     break label103;
                  }

                  var14 = var10;
                  if(var5 == null) {
                     break label104;
                  }

                  if(var10) {
                     break label103;
                  }

                  var14 = var11;
                  if(var5 == null) {
                     break label104;
                  }

                  if(var11) {
                     break label103;
                  }
               }

               var8 = 0.0F;
               var9 = 1.0F;
               if(var5 != null) {
                  break label159;
               }
            }

            var14 = var10;
         }

         if(var5 != null) {
            label72: {
               if(var14) {
                  var14 = var11;
                  if(var5 == null) {
                     break label72;
                  }

                  if(!var11) {
                     var8 = 0.0F;
                     if(var5 != null) {
                        break label159;
                     }
                  }
               }

               var14 = var10;
            }
         }

         if(var5 != null) {
            if(var14) {
               break label159;
            }

            var14 = var11;
         }

         if(var14) {
            var9 = 1.0F;
         }
      }

      this.method_2443(var6, 0.0F, var8, var7, 1.0F, var9);
   }

   // $FF: renamed from: i () vL
   public class_73 method_2606() {
      return this.field_2078;
   }

   // $FF: renamed from: d (aji) boolean
   public final boolean method_2607(aji var1) {
      String[] var2 = class_752.method_4253();
      boolean var10000 = var1.method_2419();
      if(var2 != null) {
         if(!var10000) {
            label53: {
               aji var3;
               label54: {
                  var3 = var1;
                  Object var10001 = this;
                  if(var2 != null) {
                     if(var1 == this) {
                        break label53;
                     }

                     var3 = var1;
                     if(var2 == null) {
                        break label54;
                     }

                     var10001 = class_1192.field_6047;
                  }

                  if(var3 == var10001) {
                     break label53;
                  }

                  var3 = var1;
               }

               if(var2 != null) {
                  if(var3 == class_1192.field_6192) {
                     break label53;
                  }

                  var3 = var1;
               }

               if(var2 != null) {
                  if(var3 == class_1192.field_6193) {
                     break label53;
                  }

                  var3 = var1;
               }

               var10000 = var3 instanceof class_389;
               if(var2 == null) {
                  return var10000;
               }

               if(!var10000) {
                  var10000 = false;
                  return var10000;
               }
            }
         }

         var10000 = true;
      }

      return var10000;
   }

   // $FF: renamed from: E () boolean
   protected boolean method_2502() {
      return true;
   }

   // $FF: renamed from: j (int) add
   protected add method_2503(int var1) {
      add var10000 = new add;
      var10000.method_3726(adb.method_2920(this), 1, var1);
      return var10000;
   }

   // $FF: renamed from: a (vM) void
   public void method_2535(class_74 var1) {
      this.field_2010 = var1.method_375(this.field_2077);
      this.field_2078 = var1.method_375(this.field_2075);
   }
}
