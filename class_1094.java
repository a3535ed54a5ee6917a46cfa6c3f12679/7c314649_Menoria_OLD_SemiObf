import java.util.Iterator;
import java.util.List;
import java.util.Random;

// $FF: renamed from: h7
public abstract class class_1094 {

   // $FF: renamed from: a hS
   protected class_1206 field_5752;
   // $FF: renamed from: b int
   protected int field_5753;
   // $FF: renamed from: c int
   protected int field_5754;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_5755;


   // $FF: renamed from: <init> () void
   public void method_6191() {
      super();
   }

   // $FF: renamed from: <init> (int) void
   protected void method_6192(int var1) {
      super();
      this.field_5754 = var1;
      this.field_5753 = -1;
   }

   // $FF: renamed from: a () ro
   public class_1583 method_6193() {
      class_1583 var10000 = new class_1583;
      var10000.method_8628();
      class_1583 var1 = var10000;
      String[] var2 = field_5755;
      var1.initGui1("id", class_1093.method_6186(this));
      var1.method_8664("BB", this.field_5752.method_6494());
      var1.method_8667("O", this.field_5753);
      var1.method_8667("GD", this.field_5754);
      this.method_6194(var1);
      return var1;
   }

   // $FF: renamed from: b (ro) void
   protected abstract void method_6194(class_1583 var1);

   // $FF: renamed from: b (ahb, ro) void
   public void method_6195(ahb var1, class_1583 var2) {
      String[] var3 = field_5755;
      if(var2.initGui7("BB")) {
         class_1206 var10001 = new class_1206;
         var10001.method_6477(var2.method_8687("BB"));
         this.field_5752 = var10001;
      }

      this.field_5753 = var2.method_8681("O");
      String[] var10002 = field_5755;
      this.field_5754 = var2.method_8681("GD");
      this.method_6196(var2);
   }

   // $FF: renamed from: c (ro) void
   protected abstract void method_6196(class_1583 var1);

   // $FF: renamed from: b (h7, java.util.List, java.util.Random) void
   public void method_6197(class_1094 var1, List var2, Random var3) {}

   // $FF: renamed from: b (ahb, java.util.Random, hS) boolean
   public abstract boolean method_6198(ahb var1, Random var2, class_1206 var3);

   // $FF: renamed from: b () hS
   public class_1206 method_6199() {
      return this.field_5752;
   }

   // $FF: renamed from: c () int
   public int method_6200() {
      return this.field_5754;
   }

   // $FF: renamed from: b (java.util.List, hS) h7
   public static class_1094 method_6201(List var0, class_1206 var1) {
      String[] var10000 = class_752.method_4253();
      Iterator var3 = var0.iterator();
      String[] var2 = var10000;

      while(true) {
         if(var3.hasNext()) {
            label37: {
               class_1094 var4 = (class_1094)var3.next();
               class_1206 var5 = var4.method_6199();
               class_1094 var6;
               if(var2 != null) {
                  if(var5 == null) {
                     break label37;
                  }

                  var6 = var4;
                  if(var2 == null) {
                     return var6;
                  }

                  var5 = var4.method_6199();
               }

               if(var5.method_6483(var1)) {
                  var6 = var4;
                  return var6;
               }
            }

            if(var2 != null) {
               continue;
            }
         }

         return null;
      }
   }

   // $FF: renamed from: d () dd
   public class_1034 method_6202() {
      class_1034 var10000 = new class_1034;
      var10000.method_5854(this.field_5752.method_6491(), this.field_5752.method_6492(), this.field_5752.method_6493());
      return var10000;
   }

   // $FF: renamed from: b (ahb, hS) boolean
   protected boolean method_6203(ahb var1, class_1206 var2) {
      int var4 = Math.max(this.field_5752.field_6244 - 1, var2.field_6244);
      String[] var10000 = class_752.method_4253();
      int var5 = Math.max(this.field_5752.field_6245 - 1, var2.field_6245);
      int var6 = Math.max(this.field_5752.field_6246 - 1, var2.field_6246);
      String[] var3 = var10000;
      int var7 = Math.min(this.field_5752.field_6247 + 1, var2.field_6247);
      int var8 = Math.min(this.field_5752.field_6248 + 1, var2.field_6248);
      int var9 = Math.min(this.field_5752.field_6249 + 1, var2.field_6249);
      int var10 = var4;

      label148:
      while(true) {
         int var12 = var10;

         int var11;
         label145:
         while(true) {
            if(var12 <= var7) {
               var12 = var6;
               if(var3 == null) {
                  break;
               }

               var11 = var6;

               while(true) {
                  if(var11 <= var9) {
                     label160: {
                        var12 = var1.getBlock(var10, var5, var11).method_2424().method_5062();
                        if(var3 == null) {
                           continue label145;
                        }

                        if(var3 != null) {
                           if(var12 != 0) {
                              return true;
                           }

                           var12 = var1.getBlock(var10, var8, var11).method_2424().method_5062();
                        }

                        if(var3 != null) {
                           if(var12 == 0) {
                              ++var11;
                              if(var3 != null) {
                                 continue;
                              }
                              break label160;
                           }

                           var12 = 1;
                        }

                        return (boolean)var12;
                     }
                  }

                  ++var10;
                  if(var3 != null) {
                     continue label148;
                  }
                  break;
               }
            }

            var12 = var4;
            break;
         }

         var10 = var12;

         label120:
         while(true) {
            var12 = var10;

            label117:
            while(true) {
               if(var12 <= var7) {
                  var12 = var5;
                  if(var3 == null) {
                     break;
                  }

                  var11 = var5;

                  while(var11 <= var8) {
                     var12 = var1.getBlock(var10, var11, var6).method_2424().method_5062();
                     if(var3 == null) {
                        continue label117;
                     }

                     if(var3 != null) {
                        if(var12 != 0) {
                           return true;
                        }

                        var12 = var1.getBlock(var10, var11, var9).method_2424().method_5062();
                     }

                     if(var3 != null) {
                        if(var12 == 0) {
                           ++var11;
                           if(var3 == null) {
                              break;
                           }
                           continue;
                        }

                        var12 = 1;
                     }

                     return (boolean)var12;
                  }

                  ++var10;
                  if(var3 != null) {
                     continue label120;
                  }
               }

               var12 = var6;
               break;
            }

            var10 = var12;

            label93:
            while(true) {
               var12 = var10;

               label90:
               while(true) {
                  if(var12 <= var9) {
                     var12 = var5;
                     if(var3 == null) {
                        break;
                     }

                     var11 = var5;

                     while(var11 <= var8) {
                        var12 = var1.getBlock(var4, var11, var10).method_2424().method_5062();
                        if(var3 == null) {
                           continue label90;
                        }

                        if(var3 != null) {
                           if(var12 != 0) {
                              return true;
                           }

                           var12 = var1.getBlock(var7, var11, var10).method_2424().method_5062();
                        }

                        if(var3 != null) {
                           if(var12 == 0) {
                              ++var11;
                              if(var3 == null) {
                                 break;
                              }
                              continue;
                           }

                           var12 = 1;
                        }

                        return (boolean)var12;
                     }

                     ++var10;
                     if(var3 != null) {
                        continue label93;
                     }
                  }

                  var12 = 0;
                  break;
               }

               return (boolean)var12;
            }
         }
      }
   }

   // $FF: renamed from: b (int, int) int
   protected int method_6204(int var1, int var2) {
      String[] var3 = class_752.method_4253();
      int var10000 = this.field_5753;
      if(var3 != null) {
         switch(this.field_5753) {
         case 0:
         case 2:
            return this.field_5752.field_6244 + var1;
         case 1:
            return this.field_5752.field_6247 - var2;
         case 3:
            return this.field_5752.field_6244 + var2;
         default:
            var10000 = var1;
         }
      }

      return var10000;
   }

   // $FF: renamed from: b (int) int
   protected int method_6205(int var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = this.field_5753;
      int var10001 = -1;
      if(var2 != null) {
         if(this.field_5753 == -1) {
            return var1;
         }

         var10000 = var1;
         var10001 = this.field_5752.field_6245;
      }

      return var10000 + var10001;
   }

   // $FF: renamed from: c (int, int) int
   protected int method_6206(int var1, int var2) {
      String[] var3 = class_752.method_4253();
      int var10000 = this.field_5753;
      if(var3 != null) {
         switch(this.field_5753) {
         case 0:
            return this.field_5752.field_6246 + var2;
         case 1:
         case 3:
            return this.field_5752.field_6246 + var1;
         case 2:
            return this.field_5752.field_6249 - var2;
         default:
            var10000 = var2;
         }
      }

      return var10000;
   }

   // $FF: renamed from: b (aji, int) int
   protected int method_6207(aji var1, int var2) {
      int var4;
      label699: {
         String[] var3 = class_752.method_4253();
         aji var10000 = var1;
         aji var10001 = class_1192.field_6092;
         byte var5;
         if(var3 != null) {
            if(var1 == class_1192.field_6092) {
               var4 = this.field_5753;
               var5 = 1;
               if(var3 != null) {
                  if(this.field_5753 != 1) {
                     var4 = this.field_5753;
                     if(var3 == null) {
                        return var4;
                     }

                     if(this.field_5753 != 3) {
                        break label699;
                     }
                  }

                  var4 = var2;
                  if(var3 == null) {
                     return var4;
                  }

                  var5 = 1;
               }

               if(var4 == var5) {
                  return 0;
               }

               var4 = 1;
               return var4;
            }

            var10000 = var1;
            var10001 = class_1192.field_6090;
         }

         label702: {
            if(var3 != null) {
               if(var10000 == var10001) {
                  break label702;
               }

               var10000 = var1;
               var10001 = class_1192.field_6097;
            }

            if(var3 != null) {
               if(var10000 == var10001) {
                  break label702;
               }

               var10000 = var1;
               var10001 = class_1192.field_6093;
            }

            label703: {
               if(var3 != null) {
                  if(var10000 == var10001) {
                     break label703;
                  }

                  var10000 = var1;
                  var10001 = class_1192.field_6080;
               }

               if(var3 != null) {
                  if(var10000 == var10001) {
                     break label703;
                  }

                  var10000 = var1;
                  var10001 = class_1192.field_6139;
               }

               if(var3 != null) {
                  if(var10000 == var10001) {
                     break label703;
                  }

                  var10000 = var1;
                  var10001 = class_1192.field_6134;
               }

               if(var3 != null) {
                  if(var10000 == var10001) {
                     break label703;
                  }

                  var10000 = var1;
                  var10001 = class_1192.field_6152;
               }

               if(var3 != null) {
                  if(var10000 == var10001) {
                     break label703;
                  }

                  var10000 = var1;
                  var10001 = class_1192.field_6091;
               }

               label704: {
                  if(var3 != null) {
                     if(var10000 == var10001) {
                        var4 = this.field_5753;
                        if(var3 != null) {
                           if(this.field_5753 == 0) {
                              var4 = var2;
                              var5 = 2;
                              if(var3 != null) {
                                 if(var2 == 2) {
                                    return 3;
                                 }

                                 var4 = var2;
                                 if(var3 == null) {
                                    return var4;
                                 }

                                 var5 = 3;
                              }

                              if(var4 == var5) {
                                 return 2;
                              }
                              break label699;
                           }

                           var4 = this.field_5753;
                        }

                        var5 = 1;
                        if(var3 != null) {
                           if(var4 == 1) {
                              var4 = var2;
                              var5 = 2;
                              if(var3 != null) {
                                 if(var2 == 2) {
                                    return 4;
                                 }

                                 var4 = var2;
                                 var5 = 3;
                              }

                              if(var3 != null) {
                                 if(var4 == var5) {
                                    return 5;
                                 }

                                 var4 = var2;
                                 var5 = 4;
                              }

                              if(var3 != null) {
                                 if(var4 == var5) {
                                    return 2;
                                 }

                                 var4 = var2;
                                 if(var3 == null) {
                                    return var4;
                                 }

                                 var5 = 5;
                              }

                              if(var4 == var5) {
                                 return 3;
                              }
                              break label699;
                           }

                           var4 = this.field_5753;
                           if(var3 == null) {
                              return var4;
                           }

                           var5 = 3;
                        }

                        if(var4 == var5) {
                           var4 = var2;
                           var5 = 2;
                           if(var3 != null) {
                              if(var2 == 2) {
                                 return 5;
                              }

                              var4 = var2;
                              var5 = 3;
                           }

                           if(var3 != null) {
                              if(var4 == var5) {
                                 return 4;
                              }

                              var4 = var2;
                              var5 = 4;
                           }

                           if(var3 != null) {
                              if(var4 == var5) {
                                 return 2;
                              }

                              var4 = var2;
                              if(var3 == null) {
                                 return var4;
                              }

                              var5 = 5;
                           }

                           if(var4 == var5) {
                              return 3;
                           }
                        }
                        break label699;
                     }

                     var10000 = var1;
                     if(var3 == null) {
                        break label704;
                     }

                     var10001 = class_1192.field_6103;
                  }

                  if(var10000 == var10001) {
                     var4 = this.field_5753;
                     if(var3 != null) {
                        if(this.field_5753 == 0) {
                           var4 = var2;
                           var5 = 3;
                           if(var3 != null) {
                              if(var2 == 3) {
                                 return 4;
                              }

                              var4 = var2;
                              if(var3 == null) {
                                 return var4;
                              }

                              var5 = 4;
                           }

                           if(var4 == var5) {
                              return 3;
                           }
                           break label699;
                        }

                        var4 = this.field_5753;
                     }

                     var5 = 1;
                     if(var3 != null) {
                        if(var4 == 1) {
                           var4 = var2;
                           var5 = 3;
                           if(var3 != null) {
                              if(var2 == 3) {
                                 return 1;
                              }

                              var4 = var2;
                              var5 = 4;
                           }

                           if(var3 != null) {
                              if(var4 == var5) {
                                 return 2;
                              }

                              var4 = var2;
                              var5 = 2;
                           }

                           if(var3 != null) {
                              if(var4 == var5) {
                                 return 3;
                              }

                              var4 = var2;
                              if(var3 == null) {
                                 return var4;
                              }

                              var5 = 1;
                           }

                           if(var4 == var5) {
                              return 4;
                           }
                           break label699;
                        }

                        var4 = this.field_5753;
                        if(var3 == null) {
                           return var4;
                        }

                        var5 = 3;
                     }

                     if(var4 == var5) {
                        var4 = var2;
                        var5 = 3;
                        if(var3 != null) {
                           if(var2 == 3) {
                              return 2;
                           }

                           var4 = var2;
                           var5 = 4;
                        }

                        if(var3 != null) {
                           if(var4 == var5) {
                              return 1;
                           }

                           var4 = var2;
                           var5 = 2;
                        }

                        if(var3 != null) {
                           if(var4 == var5) {
                              return 3;
                           }

                           var4 = var2;
                           if(var3 == null) {
                              return var4;
                           }

                           var5 = 1;
                        }

                        if(var4 == var5) {
                           return 4;
                        }
                     }
                     break label699;
                  }

                  var10000 = var1;
               }

               label724: {
                  if(var3 != null) {
                     if(var10000 == class_1192.field_6155) {
                        break label724;
                     }

                     var10000 = var1;
                  }

                  if(var3 != null) {
                     if(var10000 instanceof class_428) {
                        break label724;
                     }

                     var10000 = var1;
                  }

                  label725: {
                     Object var6 = class_1192.field_6060;
                     if(var3 != null) {
                        if(var10000 == class_1192.field_6060) {
                           break label725;
                        }

                        var10000 = var1;
                        var6 = class_1192.field_6056;
                     }

                     if(var3 != null) {
                        if(var10000 == var6) {
                           break label725;
                        }

                        var10000 = var1;
                        var6 = class_1192.field_6095;
                     }

                     if(var3 != null) {
                        if(var10000 == var6) {
                           break label725;
                        }

                        var10000 = var1;
                        var6 = class_1192.field_6050;
                     }

                     if(var10000 != var6) {
                        break label699;
                     }
                  }

                  var4 = this.field_5753;
                  if(var3 != null) {
                     if(this.field_5753 == 0) {
                        var4 = var2;
                        if(var3 == null) {
                           return var4;
                        }

                        if(var2 != 2) {
                           var4 = var2;
                           if(var3 == null) {
                              return var4;
                           }

                           if(var2 != 3) {
                              break label699;
                           }
                        }

                        var4 = class_1707.field_8946[var2];
                        return var4;
                     }

                     var4 = this.field_5753;
                  }

                  var5 = 1;
                  if(var3 != null) {
                     if(var4 == 1) {
                        var4 = var2;
                        var5 = 2;
                        if(var3 != null) {
                           if(var2 == 2) {
                              return 4;
                           }

                           var4 = var2;
                           var5 = 3;
                        }

                        if(var3 != null) {
                           if(var4 == var5) {
                              return 5;
                           }

                           var4 = var2;
                           var5 = 4;
                        }

                        if(var3 != null) {
                           if(var4 == var5) {
                              return 2;
                           }

                           var4 = var2;
                           if(var3 == null) {
                              return var4;
                           }

                           var5 = 5;
                        }

                        if(var4 == var5) {
                           return 3;
                        }
                        break label699;
                     }

                     var4 = this.field_5753;
                     if(var3 == null) {
                        return var4;
                     }

                     var5 = 3;
                  }

                  if(var4 == var5) {
                     var4 = var2;
                     var5 = 2;
                     if(var3 != null) {
                        if(var2 == 2) {
                           return 5;
                        }

                        var4 = var2;
                        var5 = 3;
                     }

                     if(var3 != null) {
                        if(var4 == var5) {
                           return 4;
                        }

                        var4 = var2;
                        var5 = 4;
                     }

                     if(var3 != null) {
                        if(var4 == var5) {
                           return 2;
                        }

                        var4 = var2;
                        if(var3 == null) {
                           return var4;
                        }

                        var5 = 5;
                     }

                     if(var4 == var5) {
                        return 3;
                     }
                  }
                  break label699;
               }

               var4 = this.field_5753;
               if(var3 != null) {
                  if(this.field_5753 == 0) {
                     var4 = var2;
                     if(var3 == null) {
                        return var4;
                     }

                     if(var2 != 0) {
                        var4 = var2;
                        if(var3 == null) {
                           return var4;
                        }

                        if(var2 != 2) {
                           break label699;
                        }
                     }

                     var4 = class_1649.field_8592[var2];
                     return var4;
                  }

                  var4 = this.field_5753;
               }

               var5 = 1;
               if(var3 != null) {
                  if(var4 == 1) {
                     var4 = var2;
                     if(var3 != null) {
                        if(var2 == 2) {
                           return 1;
                        }

                        var4 = var2;
                     }

                     if(var3 != null) {
                        if(var4 == 0) {
                           return 3;
                        }

                        var4 = var2;
                     }

                     var5 = 1;
                     if(var3 != null) {
                        if(var4 == 1) {
                           return 2;
                        }

                        var4 = var2;
                        if(var3 == null) {
                           return var4;
                        }

                        var5 = 3;
                     }

                     if(var4 == var5) {
                        return 0;
                     }
                     break label699;
                  }

                  var4 = this.field_5753;
                  if(var3 == null) {
                     return var4;
                  }

                  var5 = 3;
               }

               if(var4 == var5) {
                  var4 = var2;
                  if(var3 != null) {
                     if(var2 == 2) {
                        return 3;
                     }

                     var4 = var2;
                  }

                  if(var3 != null) {
                     if(var4 == 0) {
                        return 1;
                     }

                     var4 = var2;
                  }

                  var5 = 1;
                  if(var3 != null) {
                     if(var4 == 1) {
                        return 2;
                     }

                     var4 = var2;
                     if(var3 == null) {
                        return var4;
                     }

                     var5 = 3;
                  }

                  if(var4 == var5) {
                     return 0;
                  }
               }
               break label699;
            }

            var4 = this.field_5753;
            if(var3 != null) {
               if(this.field_5753 == 0) {
                  var4 = var2;
                  var5 = 2;
                  if(var3 != null) {
                     if(var2 == 2) {
                        return 3;
                     }

                     var4 = var2;
                     if(var3 == null) {
                        return var4;
                     }

                     var5 = 3;
                  }

                  if(var4 == var5) {
                     return 2;
                  }
                  break label699;
               }

               var4 = this.field_5753;
            }

            var5 = 1;
            if(var3 != null) {
               if(var4 == 1) {
                  var4 = var2;
                  if(var3 != null) {
                     if(var2 == 0) {
                        return 2;
                     }

                     var4 = var2;
                  }

                  var5 = 1;
                  if(var3 != null) {
                     if(var4 == 1) {
                        return 3;
                     }

                     var4 = var2;
                     var5 = 2;
                  }

                  if(var3 != null) {
                     if(var4 == var5) {
                        return 0;
                     }

                     var4 = var2;
                     if(var3 == null) {
                        return var4;
                     }

                     var5 = 3;
                  }

                  if(var4 == var5) {
                     return 1;
                  }
                  break label699;
               }

               var4 = this.field_5753;
               if(var3 == null) {
                  return var4;
               }

               var5 = 3;
            }

            if(var4 == var5) {
               var4 = var2;
               if(var3 != null) {
                  if(var2 == 0) {
                     return 2;
                  }

                  var4 = var2;
               }

               var5 = 1;
               if(var3 != null) {
                  if(var4 == 1) {
                     return 3;
                  }

                  var4 = var2;
                  var5 = 2;
               }

               if(var3 != null) {
                  if(var4 == var5) {
                     return 1;
                  }

                  var4 = var2;
                  if(var3 == null) {
                     return var4;
                  }

                  var5 = 3;
               }

               if(var4 == var5) {
                  return 0;
               }
            }
            break label699;
         }

         var4 = this.field_5753;
         if(var3 != null) {
            if(this.field_5753 == 0) {
               var4 = var2;
               if(var3 != null) {
                  if(var2 == 0) {
                     return 2;
                  }

                  var4 = var2;
               }

               if(var3 == null) {
                  return var4;
               }

               if(var4 == 2) {
                  return 0;
               }
               break label699;
            }

            var4 = this.field_5753;
         }

         var5 = 1;
         if(var3 != null) {
            if(var4 == 1) {
               return var2 + 1 & 3;
            }

            var4 = this.field_5753;
            if(var3 == null) {
               return var4;
            }

            var5 = 3;
         }

         if(var4 == var5) {
            return var2 + 3 & 3;
         }
      }

      var4 = var2;
      return var4;
   }

   // $FF: renamed from: b (ahb, aji, int, int, int, int, hS) void
   protected void method_6208(ahb var1, aji var2, int var3, int var4, int var5, int var6, class_1206 var7) {
      String[] var10000 = class_752.method_4253();
      int var9 = this.method_6204(var4, var6);
      int var10 = this.method_6205(var5);
      int var11 = this.method_6206(var4, var6);
      String[] var8 = var10000;
      boolean var12 = var7.method_6487(var9, var10, var11);
      if(var8 != null) {
         if(!var12) {
            return;
         }

         var1.method_2054(var9, var10, var11, var2, var3, 2);
      }

   }

   // $FF: renamed from: b (ahb, int, int, int, hS) aji
   protected aji method_6209(ahb var1, int var2, int var3, int var4, class_1206 var5) {
      int var6 = this.method_6204(var2, var4);
      int var7 = this.method_6205(var3);
      int var8 = this.method_6206(var2, var4);
      return !var5.method_6487(var6, var7, var8)?class_1192.field_6025:var1.getBlock(var6, var7, var8);
   }

   // $FF: renamed from: b (ahb, hS, int, int, int, int, int, int) void
   protected void method_6210(ahb var1, class_1206 var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      String[] var10000 = class_752.method_4253();
      int var10 = var4;
      String[] var9 = var10000;

      do {
         int var13 = var10;

         label40:
         while(true) {
            if(var13 > var7) {
               return;
            }

            int var11 = var3;

            while(true) {
               if(var11 > var6) {
                  break label40;
               }

               var13 = var5;
               if(var9 == null) {
                  break;
               }

               int var12 = var5;

               while(true) {
                  if(var12 <= var8) {
                     this.method_6208(var1, class_1192.field_6025, 0, var11, var10, var12, var2);
                     ++var12;
                     if(var9 == null) {
                        break;
                     }

                     if(var9 != null) {
                        continue;
                     }
                  }

                  ++var11;
                  break;
               }

               if(var9 == null) {
                  break label40;
               }
            }
         }

         ++var10;
      } while(var9 != null);

   }

   // $FF: renamed from: b (ahb, hS, int, int, int, int, int, int, aji, aji, boolean) void
   protected void method_6211(ahb var1, class_1206 var2, int var3, int var4, int var5, int var6, int var7, int var8, aji var9, aji var10, boolean var11) {
      String[] var10000 = class_752.method_4253();
      int var13 = var4;
      String[] var12 = var10000;

      do {
         int var16 = var13;

         label103:
         while(true) {
            if(var16 > var7) {
               return;
            }

            int var14 = var3;

            while(true) {
               var16 = var14;

               label99:
               while(true) {
                  if(var16 > var6) {
                     break label103;
                  }

                  var16 = var5;
                  if(var12 == null) {
                     continue label103;
                  }

                  int var15 = var5;

                  while(var15 <= var8) {
                     var16 = var11;
                     if(var12 == null) {
                        continue label99;
                     }

                     label114: {
                        if(var12 != null) {
                           if(var11 != 0 && this.method_6209(var1, var14, var13, var15, var2).method_2424() == awt.field_4170 && var12 != null) {
                              break label114;
                           }

                           var16 = var13;
                        }

                        label85: {
                           label115: {
                              int var10001 = var4;
                              if(var12 != null) {
                                 if(var16 == var4) {
                                    break label115;
                                 }

                                 var16 = var13;
                                 var10001 = var7;
                              }

                              if(var12 != null) {
                                 if(var16 == var10001) {
                                    break label115;
                                 }

                                 var16 = var14;
                                 var10001 = var3;
                              }

                              if(var12 != null) {
                                 if(var16 == var10001) {
                                    break label115;
                                 }

                                 var16 = var14;
                                 var10001 = var6;
                              }

                              if(var12 != null) {
                                 if(var16 == var10001) {
                                    break label115;
                                 }

                                 var16 = var15;
                                 var10001 = var5;
                              }

                              if(var12 != null) {
                                 if(var16 == var10001) {
                                    break label115;
                                 }

                                 var16 = var15;
                                 var10001 = var8;
                              }

                              if(var16 != var10001) {
                                 break label85;
                              }
                           }

                           this.method_6208(var1, var9, 0, var14, var13, var15, var2);
                           if(var12 != null) {
                              break label114;
                           }
                        }

                        this.method_6208(var1, var10, 0, var14, var13, var15, var2);
                     }

                     ++var15;
                     if(var12 == null) {
                        break;
                     }
                  }

                  ++var14;
                  if(var12 == null) {
                     break label103;
                  }
                  break;
               }
            }
         }

         ++var13;
      } while(var12 != null);

   }

   // $FF: renamed from: b (ahb, hS, int, int, int, int, int, int, aji, int, aji, int, boolean) void
   protected void method_6212(ahb var1, class_1206 var2, int var3, int var4, int var5, int var6, int var7, int var8, aji var9, int var10, aji var11, int var12, boolean var13) {
      String[] var10000 = class_752.method_4253();
      int var15 = var4;
      String[] var14 = var10000;

      do {
         int var18 = var15;

         label103:
         while(true) {
            if(var18 > var7) {
               return;
            }

            int var16 = var3;

            while(true) {
               var18 = var16;

               label99:
               while(true) {
                  if(var18 > var6) {
                     break label103;
                  }

                  var18 = var5;
                  if(var14 == null) {
                     continue label103;
                  }

                  int var17 = var5;

                  while(var17 <= var8) {
                     var18 = var13;
                     if(var14 == null) {
                        continue label99;
                     }

                     label114: {
                        if(var14 != null) {
                           if(var13 != 0 && this.method_6209(var1, var16, var15, var17, var2).method_2424() == awt.field_4170 && var14 != null) {
                              break label114;
                           }

                           var18 = var15;
                        }

                        label85: {
                           label115: {
                              int var10001 = var4;
                              if(var14 != null) {
                                 if(var18 == var4) {
                                    break label115;
                                 }

                                 var18 = var15;
                                 var10001 = var7;
                              }

                              if(var14 != null) {
                                 if(var18 == var10001) {
                                    break label115;
                                 }

                                 var18 = var16;
                                 var10001 = var3;
                              }

                              if(var14 != null) {
                                 if(var18 == var10001) {
                                    break label115;
                                 }

                                 var18 = var16;
                                 var10001 = var6;
                              }

                              if(var14 != null) {
                                 if(var18 == var10001) {
                                    break label115;
                                 }

                                 var18 = var17;
                                 var10001 = var5;
                              }

                              if(var14 != null) {
                                 if(var18 == var10001) {
                                    break label115;
                                 }

                                 var18 = var17;
                                 var10001 = var8;
                              }

                              if(var18 != var10001) {
                                 break label85;
                              }
                           }

                           this.method_6208(var1, var9, var10, var16, var15, var17, var2);
                           if(var14 != null) {
                              break label114;
                           }
                        }

                        this.method_6208(var1, var11, var12, var16, var15, var17, var2);
                     }

                     ++var17;
                     if(var14 == null) {
                        break;
                     }
                  }

                  ++var16;
                  if(var14 == null) {
                     break label103;
                  }
                  break;
               }
            }
         }

         ++var15;
      } while(var14 != null);

   }

   // $FF: renamed from: b (ahb, hS, int, int, int, int, int, int, boolean, java.util.Random, iZ) void
   protected void method_6213(ahb var1, class_1206 var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, Random var10, class_1195 var11) {
      String[] var10000 = class_752.method_4253();
      int var13 = var4;
      String[] var12 = var10000;

      do {
         int var16 = var13;

         label87:
         while(true) {
            if(var16 > var7) {
               return;
            }

            int var14 = var3;

            while(true) {
               var16 = var14;

               label83:
               while(true) {
                  if(var16 > var6) {
                     break label87;
                  }

                  var16 = var5;
                  if(var12 == null) {
                     continue label87;
                  }

                  int var15 = var5;

                  while(var15 <= var8) {
                     var16 = var9;
                     if(var12 == null) {
                        continue label83;
                     }

                     if(var9 == 0 || this.method_6209(var1, var14, var13, var15, var2).method_2424() != awt.field_4170 || var12 == null) {
                        int var10005 = var13;
                        if(var12 != null) {
                           label68: {
                              if(var13 != var4) {
                                 var10005 = var13;
                                 if(var12 == null) {
                                    break label68;
                                 }

                                 if(var13 != var7) {
                                    var10005 = var14;
                                    if(var12 == null) {
                                       break label68;
                                    }

                                    if(var14 != var3) {
                                       var10005 = var14;
                                       if(var12 == null) {
                                          break label68;
                                       }

                                       if(var14 != var6) {
                                          var10005 = var15;
                                          if(var12 == null) {
                                             break label68;
                                          }

                                          if(var15 != var5) {
                                             var10005 = var15;
                                             if(var12 == null) {
                                                break label68;
                                             }

                                             if(var15 != var8) {
                                                var10005 = 0;
                                                break label68;
                                             }
                                          }
                                       }
                                    }
                                 }
                              }

                              var10005 = 1;
                           }
                        }

                        var11.method_6423(var10, var14, var13, var15, (boolean)var10005);
                        this.method_6208(var1, var11.method_6424(), var11.method_6425(), var14, var13, var15, var2);
                     }

                     ++var15;
                     if(var12 == null) {
                        break;
                     }
                  }

                  ++var14;
                  if(var12 == null) {
                     break label87;
                  }
                  break;
               }
            }
         }

         ++var13;
      } while(var12 != null);

   }

   // $FF: renamed from: b (ahb, hS, java.util.Random, float, int, int, int, int, int, int, aji, aji, boolean) void
   protected void method_6214(ahb var1, class_1206 var2, Random var3, float var4, int var5, int var6, int var7, int var8, int var9, int var10, aji var11, aji var12, boolean var13) {
      String[] var10000 = class_752.method_4253();
      int var15 = var6;
      String[] var14 = var10000;

      do {
         int var18 = var15;

         label112:
         while(true) {
            if(var18 > var9) {
               return;
            }

            int var16 = var5;

            while(true) {
               var18 = var16;

               label108:
               while(true) {
                  if(var18 > var8) {
                     break label112;
                  }

                  var18 = var7;
                  if(var14 == null) {
                     continue label112;
                  }

                  int var17 = var7;

                  while(var17 <= var10) {
                     float var19;
                     var18 = (var19 = var3.nextFloat() - var4) == 0.0F?0:(var19 < 0.0F?-1:1);
                     if(var14 == null) {
                        continue label108;
                     }

                     label123: {
                        if(var14 != null) {
                           if(var18 > 0 && var14 != null) {
                              break label123;
                           }

                           var18 = var13;
                        }

                        if(var14 != null) {
                           if(var18 != 0 && this.method_6209(var1, var16, var15, var17, var2).method_2424() == awt.field_4170 && var14 != null) {
                              break label123;
                           }

                           var18 = var15;
                        }

                        label92: {
                           label124: {
                              int var10001 = var6;
                              if(var14 != null) {
                                 if(var18 == var6) {
                                    break label124;
                                 }

                                 var18 = var15;
                                 var10001 = var9;
                              }

                              if(var14 != null) {
                                 if(var18 == var10001) {
                                    break label124;
                                 }

                                 var18 = var16;
                                 var10001 = var5;
                              }

                              if(var14 != null) {
                                 if(var18 == var10001) {
                                    break label124;
                                 }

                                 var18 = var16;
                                 var10001 = var8;
                              }

                              if(var14 != null) {
                                 if(var18 == var10001) {
                                    break label124;
                                 }

                                 var18 = var17;
                                 var10001 = var7;
                              }

                              if(var14 != null) {
                                 if(var18 == var10001) {
                                    break label124;
                                 }

                                 var18 = var17;
                                 var10001 = var10;
                              }

                              if(var18 != var10001) {
                                 break label92;
                              }
                           }

                           this.method_6208(var1, var11, 0, var16, var15, var17, var2);
                           if(var14 != null) {
                              break label123;
                           }
                        }

                        this.method_6208(var1, var12, 0, var16, var15, var17, var2);
                     }

                     ++var17;
                     if(var14 == null) {
                        break;
                     }
                  }

                  ++var16;
                  if(var14 == null) {
                     break label112;
                  }
                  break;
               }
            }
         }

         ++var15;
      } while(var14 != null);

   }

   // $FF: renamed from: b (ahb, hS, java.util.Random, float, int, int, int, aji, int) void
   protected void method_6215(ahb var1, class_1206 var2, Random var3, float var4, int var5, int var6, int var7, aji var8, int var9) {
      if(var3.nextFloat() < var4) {
         this.method_6208(var1, var8, var9, var5, var6, var7, var2);
      }

   }

   // $FF: renamed from: b (ahb, hS, int, int, int, int, int, int, aji, boolean) void
   protected void method_6216(ahb var1, class_1206 var2, int var3, int var4, int var5, int var6, int var7, int var8, aji var9, boolean var10) {
      float var12 = (float)(var6 - var3 + 1);
      String[] var10000 = class_752.method_4253();
      float var13 = (float)(var7 - var4 + 1);
      float var14 = (float)(var8 - var5 + 1);
      String[] var11 = var10000;
      float var15 = (float)var3 + var12 / 2.0F;
      float var16 = (float)var5 + var14 / 2.0F;
      int var17 = var4;

      do {
         int var24 = var17;

         label60:
         while(true) {
            if(var24 > var7) {
               return;
            }

            float var18 = (float)(var17 - var4) / var13;
            int var19 = var3;

            while(true) {
               var24 = var19;

               label56:
               while(true) {
                  if(var24 > var6) {
                     break label60;
                  }

                  float var20 = ((float)var19 - var15) / (var12 * 0.5F);
                  var24 = var5;
                  if(var11 == null) {
                     continue label60;
                  }

                  int var21 = var5;

                  while(var21 <= var8) {
                     float var22 = ((float)var21 - var16) / (var14 * 0.5F);
                     var24 = var10;
                     if(var11 == null) {
                        continue label56;
                     }

                     label73: {
                        if(var10 == 0 || this.method_6209(var1, var19, var17, var21, var2).method_2424() != awt.field_4170 || var11 == null) {
                           float var23 = var20 * var20 + var18 * var18 + var22 * var22;
                           if(var11 == null) {
                              break label73;
                           }

                           if(var23 <= 1.05F) {
                              this.method_6208(var1, var9, 0, var19, var17, var21, var2);
                           }
                        }

                        ++var21;
                     }

                     if(var11 == null) {
                        break;
                     }
                  }

                  ++var19;
                  if(var11 == null) {
                     break label60;
                  }
                  break;
               }
            }
         }

         ++var17;
      } while(var11 != null);

   }

   // $FF: renamed from: c (ahb, int, int, int, hS) void
   protected void method_6217(ahb var1, int var2, int var3, int var4, class_1206 var5) {
      int var7 = this.method_6204(var2, var4);
      String[] var6 = class_752.method_4253();
      int var8 = this.method_6205(var3);
      int var9 = this.method_6206(var2, var4);
      boolean var10000 = var5.method_6487(var7, var8, var9);
      if(var6 != null) {
         if(!var10000) {
            return;
         }

         var10000 = var1.method_34(var7, var8, var9);
      }

      while(!var10000) {
         if(var6 != null) {
            if(var8 >= 255) {
               break;
            }

            var1.method_2054(var7, var8, var9, class_1192.field_6025, 0, 2);
         }

         ++var8;
         if(var6 == null) {
            break;
         }

         var10000 = var1.method_34(var7, var8, var9);
      }

   }

   // $FF: renamed from: c (ahb, aji, int, int, int, int, hS) void
   protected void method_6218(ahb var1, aji var2, int var3, int var4, int var5, int var6, class_1206 var7) {
      String[] var10000 = class_752.method_4253();
      int var9 = this.method_6204(var4, var6);
      String[] var8 = var10000;
      int var10 = this.method_6205(var5);
      int var11 = this.method_6206(var4, var6);
      boolean var12 = var7.method_6487(var9, var10, var11);
      if(var8 != null) {
         if(!var12) {
            return;
         }

         var12 = var1.method_34(var9, var10, var11);
      }

      while(true) {
         int var13;
         label32: {
            if(!var12) {
               var13 = var1.getBlock(var9, var10, var11).method_2424().method_5062();
               if(var8 == null || var8 == null) {
                  break label32;
               }

               if(var13 == 0) {
                  break;
               }
            }

            var13 = var10;
         }

         if(var8 != null) {
            if(var13 <= 1) {
               break;
            }

            var1.method_2054(var9, var10, var11, var2, var3, 2);
         }

         --var10;
         if(var8 == null) {
            break;
         }

         var12 = var1.method_34(var9, var10, var11);
      }

   }

   // $FF: renamed from: b (ahb, hS, java.util.Random, int, int, int, vD[], int) boolean
   protected boolean method_6219(ahb var1, class_1206 var2, Random var3, int var4, int var5, int var6, class_1652[] var7, int var8) {
      String[] var10000 = class_752.method_4253();
      int var10 = this.method_6204(var4, var6);
      String[] var9 = var10000;
      int var11 = this.method_6205(var5);
      int var12 = this.method_6206(var4, var6);
      boolean var14 = var2.method_6487(var10, var11, var12);
      if(var9 != null) {
         if(var14) {
            label25: {
               ahb var15 = var1;
               int var10001 = var10;
               int var10002 = var11;
               int var10003 = var12;
               if(var9 != null) {
                  if(var1.getBlock(var10, var11, var12) == class_1192.field_6081) {
                     break label25;
                  }

                  var1.method_2054(var10, var11, var12, class_1192.field_6081, 0, 2);
                  var15 = var1;
                  var10001 = var10;
                  var10002 = var11;
                  var10003 = var12;
               }

               class_594 var13 = (class_594)var15.method_31(var10001, var10002, var10003);
               if(var13 != null) {
                  class_1652.method_9096(var3, var7, var13, var8);
               }

               return true;
            }
         }

         var14 = false;
      }

      return var14;
   }

   // $FF: renamed from: b (ahb, hS, java.util.Random, int, int, int, int, vD[], int) boolean
   protected boolean method_6220(ahb var1, class_1206 var2, Random var3, int var4, int var5, int var6, int var7, class_1652[] var8, int var9) {
      String[] var10000 = class_752.method_4253();
      int var11 = this.method_6204(var4, var6);
      String[] var10 = var10000;
      int var12 = this.method_6205(var5);
      int var13 = this.method_6206(var4, var6);
      boolean var15 = var2.method_6487(var11, var12, var13);
      if(var10 != null) {
         if(var15) {
            label25: {
               ahb var16 = var1;
               int var10001 = var11;
               int var10002 = var12;
               int var10003 = var13;
               if(var10 != null) {
                  if(var1.getBlock(var11, var12, var13) == class_1192.field_6050) {
                     break label25;
                  }

                  var1.method_2054(var11, var12, var13, class_1192.field_6050, this.method_6207(class_1192.field_6050, var7), 2);
                  var16 = var1;
                  var10001 = var11;
                  var10002 = var12;
                  var10003 = var13;
               }

               class_589 var14 = (class_589)var16.method_31(var10001, var10002, var10003);
               if(var14 != null) {
                  class_1652.method_9097(var3, var8, var14, var9);
               }

               return true;
            }
         }

         var15 = false;
      }

      return var15;
   }

   // $FF: renamed from: b (ahb, hS, java.util.Random, int, int, int, int) void
   protected void method_6221(ahb var1, class_1206 var2, Random var3, int var4, int var5, int var6, int var7) {
      int var8 = this.method_6204(var4, var6);
      int var9 = this.method_6205(var5);
      int var10 = this.method_6206(var4, var6);
      if(var2.method_6487(var8, var9, var10)) {
         class_538.getBlock11(var1, var8, var9, var10, var7, class_1192.field_6090);
      }

   }

   // $FF: renamed from: <clinit> () void
   static void method_6222() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "r¼R¹T";
      int var4 = "r¼R¹T".length();
      char var1 = 2;
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
                  field_5755 = var5;
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 12;
               break;
            case 1:
               var10009 = 225;
               break;
            case 2:
               var10009 = 3;
               break;
            case 3:
               var10009 = 49;
               break;
            case 4:
               var10009 = 131;
               break;
            case 5:
               var10009 = 82;
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
