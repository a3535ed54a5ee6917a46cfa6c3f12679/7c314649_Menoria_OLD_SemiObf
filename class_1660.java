import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// $FF: renamed from: ue
public class class_1660 {

   // $FF: renamed from: b org.apache.logging.log4j.Logger
   private static final Logger field_8635;
   // $FF: renamed from: c dk
   private final class_354 field_8636;
   // $FF: renamed from: d java.util.List
   private final List field_8637;
   // $FF: renamed from: e vp
   private final class_1711 field_8638;
   // $FF: renamed from: f java.util.List
   private final List field_8639;
   // $FF: renamed from: g java.util.List
   private final List field_8640;
   // $FF: renamed from: h CompactArrayList
   public CompactArrayList field_8641;
   // $FF: renamed from: i int
   private int field_8642;
   // $FF: renamed from: j long
   private long field_8643;
   // $FF: renamed from: k int[][]
   private final int[][] field_8644;
   // $FF: renamed from: l java.lang.String
   private static final String field_8645 = "CL_00001434";


   // $FF: renamed from: <init> (dk) void
   public void method_9129(class_354 var1) {
      super();
      this.field_8637 = new ArrayList();
      class_1711 var10001 = new class_1711;
      var10001.method_9520();
      this.field_8638 = var10001;
      this.field_8639 = new ArrayList();
      this.field_8640 = new ArrayList();
      CompactArrayList var2 = new CompactArrayList;
      var2.method_3207(100, 0.8F);
      this.field_8641 = var2;
      this.field_8644 = new int[][]{{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
      this.field_8636 = var1;
      this.method_9142(var1.method_2255().method_2383().method_8920());
   }

   // $FF: renamed from: b () dk
   public class_354 method_9130() {
      return this.field_8636;
   }

   // $FF: renamed from: c () void
   public void method_9131() {
      String[] var1;
      int var25;
      label141: {
         label144: {
            String[] var10000 = class_752.method_4253();
            long var2 = this.field_8636.method_2184();
            var1 = var10000;
            long var27;
            var25 = (var27 = var2 - this.field_8643 - 8000L) == 0L?0:(var27 < 0L?-1:1);
            int var4;
            class_1663 var5;
            if(var1 != null) {
               if(var25 > 0) {
                  this.field_8643 = var2;
                  var4 = 0;

                  do {
                     if(var4 >= this.field_8640.size()) {
                        break label144;
                     }

                     var5 = (class_1663)this.field_8640.get(var4);
                     var5.method_9168();
                     var5.method_9164();
                     ++var4;
                     if(var1 == null) {
                        break label141;
                     }
                  } while(var1 != null);
               }

               var25 = 0;
            }

            var4 = var25;

            while(var4 < this.field_8639.size()) {
               var5 = (class_1663)this.field_8639.get(var4);
               var5.method_9168();
               ++var4;
               if(var1 == null) {
                  break label141;
               }

               if(var1 == null) {
                  break;
               }
            }
         }

         this.field_8639.clear();
      }

      var25 = this.field_8637.isEmpty();
      if(var1 != null) {
         label116: {
            if(var25 != 0) {
               class_1089 var6 = this.field_8636.field_1820;
               var25 = var6.method_6171();
               if(var1 == null) {
                  break label116;
               }

               if(var25 == 0) {
                  this.field_8636.field_1855.method_9190();
               }
            }

            var25 = this.field_8641.size();
         }
      }

      if(var1 != null) {
         if(var25 <= 0) {
            return;
         }

         var25 = 0;
      }

      int var24 = var25;

      while(true) {
         if(var24 < this.field_8637.size()) {
            label148: {
               Object var26 = this.field_8637.get(var24);

               int var14;
               class_1663 var15;
               class_1035 var16;
               label99:
               while(true) {
                  class_793 var7 = (class_793)var26;
                  int var8 = var7.field_3040;
                  int var9 = var7.field_3042;
                  int var10 = this.field_8642 + 1;
                  int var11 = var10 / 2;
                  int var12 = var10 * var10 + var11 * var11;
                  int var13 = var12;
                  var14 = -1;
                  var15 = null;
                  var16 = null;
                  if(var1 == null) {
                     return;
                  }

                  int var17 = 0;

                  while(true) {
                     if(var17 >= this.field_8641.size()) {
                        break label99;
                     }

                     class_1035 var18 = (class_1035)this.field_8641.get(var17);
                     if(var1 != null) {
                        var26 = var18;
                        if(var1 == null) {
                           break;
                        }

                        if(var18 != null) {
                           class_1663 var19 = this.method_9133(var18.field_5475, var18.field_5476, false);
                           if(var1 != null) {
                              label88: {
                                 if(var19 != null) {
                                    if(var1 == null) {
                                       break label88;
                                    }

                                    if(!var19.field_8660) {
                                       label79: {
                                          int var20 = var8 - var18.field_5475;
                                          int var21 = var9 - var18.field_5476;
                                          int var22 = var20 * var20 + var21 * var21;
                                          var25 = var22;
                                          if(var1 != null) {
                                             if(var22 >= var13) {
                                                break label79;
                                             }

                                             var13 = var22;
                                             var25 = var17;
                                          }

                                          var14 = var25;
                                          var15 = var19;
                                          var16 = var18;
                                       }

                                       if(var1 != null) {
                                          break label88;
                                       }
                                    }
                                 }

                                 this.field_8641.set(var17, (Object)null);
                              }
                           }
                        }

                        ++var17;
                     }

                     if(var1 == null) {
                        break label99;
                     }
                  }
               }

               if(var14 >= 0) {
                  this.field_8641.set(var14, (Object)null);
               }

               label68: {
                  class_1663 var23 = var15;
                  if(var1 != null) {
                     if(var15 == null) {
                        break label68;
                     }

                     var15.field_8660 = true;
                     this.method_9130().field_1855.method_105(var16.field_5475, var16.field_5476);
                     var23 = var15;
                  }

                  var23.method_9170();
                  if(var1 != null) {
                     break label148;
                  }
               }

               ++var24;
               if(var1 != null) {
                  continue;
               }
            }
         }

         this.field_8641.compact();
         return;
      }
   }

   // $FF: renamed from: b (int, int) boolean
   public boolean method_9132(int var1, int var2) {
      long var3 = (long)var1 + 2147483647L | (long)var2 + 2147483647L << 32;
      return this.field_8638.method_9525(var3) != null;
   }

   // $FF: renamed from: b (int, int, boolean) uf
   public class_1663 method_9133(int var1, int var2, boolean var3) {
      return this.method_9134(var1, var2, var3, false);
   }

   // $FF: renamed from: a (int, int, boolean, boolean) uf
   public class_1663 method_9134(int var1, int var2, boolean var3, boolean var4) {
      long var6 = (long)var1 + 2147483647L | (long)var2 + 2147483647L << 32;
      String[] var10000 = class_752.method_4253();
      class_1663 var8 = (class_1663)this.field_8638.method_9525(var6);
      String[] var5 = var10000;
      class_1663 var9 = var8;
      if(var5 != null) {
         if(var8 == null && var5 != null && var3) {
            var9 = new class_1663;
            var9.method_9160(this, var1, var2, var4);
            var8 = var9;
            this.field_8638.method_9528(var6, var8);
            this.field_8640.add(var8);
         }

         var9 = var8;
      }

      return var9;
   }

   // $FF: renamed from: b (int, int, int) void
   public void method_9135(int var1, int var2, int var3) {
      int var5 = var1 >> 4;
      String[] var10000 = class_752.method_4253();
      int var6 = var3 >> 4;
      String[] var4 = var10000;
      class_1663 var7 = this.method_9133(var5, var6, false);
      class_1663 var8 = var7;
      if(var4 != null) {
         if(var7 == null) {
            return;
         }

         var8 = var7;
      }

      var8.method_9166(var1 & 15, var2, var3 & 15);
   }

   // $FF: renamed from: b (xi) void
   public void method_9136(class_793 var1) {
      String[] var10000 = class_752.method_4253();
      int var3 = (int)var1.field_2994 >> 4;
      int var4 = (int)var1.field_2996 >> 4;
      var1.field_3657 = var1.field_2994;
      var1.field_3658 = var1.field_2996;
      String[] var2 = var10000;
      ArrayList var5 = new ArrayList(1);
      int var6 = var3 - this.field_8642;

      label60:
      while(true) {
         int var9 = var6;
         int var10001 = var3 + this.field_8642;

         label57:
         while(var9 <= var10001) {
            var9 = var4 - this.field_8642;
            if(var2 == null) {
               break label60;
            }

            int var7 = var9;

            while(var7 <= var4 + this.field_8642) {
               this.method_9133(var6, var7, true).method_9161(var1);
               if(var2 != null) {
                  var9 = var6;
                  var10001 = var3 - 1;
                  if(var2 == null) {
                     continue label57;
                  }

                  if(var6 >= var10001) {
                     label68: {
                        var9 = var6;
                        var10001 = var3 + 1;
                        if(var2 != null) {
                           if(var6 > var10001) {
                              break label68;
                           }

                           var9 = var7;
                           var10001 = var4 - 1;
                        }

                        if(var2 != null) {
                           if(var9 < var10001) {
                              break label68;
                           }

                           var9 = var7;
                           var10001 = var4 + 1;
                        }

                        if(var9 <= var10001) {
                           class_1069 var8 = this.method_9130().field_1855.method_105(var6, var7);
                           var5.add(var8);
                        }
                     }
                  }

                  ++var7;
               }

               if(var2 == null) {
                  break;
               }
            }

            ++var6;
            if(var2 != null) {
               continue label60;
            }
            break;
         }

         class_1684 var10 = var1.field_3654;
         class_278 var11 = new class_278;
         var11.method_1597(var5);
         var10.method_9291(var11);
         this.field_8637.add(var1);
         break;
      }

      this.method_9137(var1);
   }

   // $FF: renamed from: c (xi) void
   public void method_9137(class_793 var1) {
      ArrayList var3 = new ArrayList(var1.field_3659);
      String[] var10000 = class_752.method_4253();
      int var4 = 0;
      int var5 = this.field_8642;
      int var6 = (int)var1.field_2994 >> 4;
      int var7 = (int)var1.field_2996 >> 4;
      String[] var2 = var10000;
      int var8 = 0;
      int var9 = 0;
      class_1035 var10 = class_1663.method_9171(this.method_9133(var6, var7, true));
      var1.field_3659.clear();
      byte var15 = var3.contains(var10);
      if(var2 != null) {
         if(var15 != 0) {
            var1.field_3659.add(var10);
         }

         var15 = 1;
      }

      int var11 = var15;

      label84:
      while(true) {
         int var16 = var11;

         label81:
         while(var16 <= var5 * 2) {
            var15 = 0;
            if(var2 == null) {
               break label84;
            }

            int var12 = 0;

            label78:
            do {
               var16 = var12;

               label75:
               while(true) {
                  if(var16 >= 2) {
                     break label78;
                  }

                  int[] var13 = this.field_8644[var4++ % 4];
                  var16 = 0;
                  if(var2 == null) {
                     continue label81;
                  }

                  int var14 = 0;

                  while(true) {
                     if(var14 >= var11) {
                        break label75;
                     }

                     var8 += var13[0];
                     var9 += var13[1];
                     var10 = class_1663.method_9171(this.method_9133(var6 + var8, var7 + var9, true));
                     if(var2 != null) {
                        var16 = var3.contains(var10);
                        if(var2 == null) {
                           break;
                        }

                        if(var16 != 0) {
                           var1.field_3659.add(var10);
                        }

                        ++var14;
                     }

                     if(var2 == null) {
                        break label75;
                     }
                  }
               }

               ++var12;
            } while(var2 != null);

            ++var11;
            if(var2 != null) {
               continue label84;
            }
            break;
         }

         var4 %= 4;
         var15 = 0;
         break;
      }

      var11 = var15;

      while(var11 < var5 * 2) {
         var8 += this.field_8644[var4][0];
         var9 += this.field_8644[var4][1];
         var10 = class_1663.method_9171(this.method_9133(var6 + var8, var7 + var9, true));
         if(var2 != null) {
            if(var3.contains(var10)) {
               var1.field_3659.add(var10);
            }

            ++var11;
         }

         if(var2 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: d (xi) void
   public void method_9138(class_793 var1) {
      int var3 = (int)var1.field_3657 >> 4;
      String[] var10000 = class_752.method_4253();
      int var4 = (int)var1.field_3658 >> 4;
      String[] var2 = var10000;
      int var5 = var3 - this.field_8642;

      while(true) {
         if(var5 <= var3 + this.field_8642) {
            int var8 = var4 - this.field_8642;
            if(var2 == null) {
               break;
            }

            int var6 = var8;

            while(true) {
               if(var6 <= var4 + this.field_8642) {
                  class_1663 var7 = this.method_9133(var5, var6, false);
                  if(var2 == null) {
                     break;
                  }

                  if(var2 != null) {
                     if(var7 != null) {
                        var7.method_9163(var1, false);
                     }

                     ++var6;
                  }

                  if(var2 != null) {
                     continue;
                  }
               }

               ++var5;
               break;
            }

            if(var2 != null) {
               continue;
            }
         }

         this.field_8637.remove(var1);
         break;
      }

   }

   // $FF: renamed from: b (int, int, int, int, int) boolean
   private boolean method_9139(int var1, int var2, int var3, int var4, int var5) {
      int var10000;
      label53: {
         int var7 = var1 - var3;
         String[] var6 = class_752.method_4253();
         int var8 = var2 - var4;
         var10000 = var7;
         int var10001 = -var5;
         if(var6 != null) {
            if(var7 < var10001) {
               break label53;
            }

            var10000 = var7;
            var10001 = var5;
         }

         if(var6 != null) {
            if(var10000 > var10001) {
               break label53;
            }

            var10000 = var8;
            if(var6 == null) {
               return (boolean)var10000;
            }

            var10001 = -var5;
         }

         if(var10000 >= var10001) {
            var10000 = var8;
            if(var6 == null) {
               return (boolean)var10000;
            }

            if(var8 <= var5) {
               var10000 = 1;
               return (boolean)var10000;
            }
         }

         var10000 = 0;
         return (boolean)var10000;
      }

      var10000 = 0;
      return (boolean)var10000;
   }

   // $FF: renamed from: e (xi) void
   public void method_9140(class_793 var1) {
      int var3 = (int)var1.field_2994 >> 4;
      int var4 = (int)var1.field_2996 >> 4;
      String[] var10000 = class_752.method_4253();
      double var5 = var1.field_3657 - var1.field_2994;
      double var7 = var1.field_3658 - var1.field_2996;
      double var9 = var5 * var5 + var7 * var7;
      String[] var2 = var10000;
      double var23;
      int var20 = (var23 = var9 - 64.0D) == 0.0D?0:(var23 < 0.0D?-1:1);
      if(var2 != null) {
         if(var20 < 0) {
            return;
         }

         var20 = (int)var1.field_3657 >> 4;
      }

      int var11;
      int var12;
      int var13;
      int var14;
      int var15;
      label97: {
         var11 = var20;
         var12 = (int)var1.field_3658 >> 4;
         var13 = this.field_8642;
         var14 = var3 - var11;
         var15 = var4 - var12;
         var20 = var14;
         if(var2 != null) {
            if(var14 != 0) {
               break label97;
            }

            var20 = var15;
         }

         if(var20 == 0) {
            return;
         }
      }

      WorldServerOF var16;
      label89: {
         var16 = null;
         class_354 var21 = this.field_8636;
         if(var2 != null) {
            if(!(this.field_8636 instanceof WorldServerOF)) {
               break label89;
            }

            var21 = this.field_8636;
         }

         var16 = (WorldServerOF)var21;
      }

      int var17 = var3 - var13;

      label82:
      while(true) {
         var20 = var17;

         label79:
         while(var20 <= var3 + var13) {
            if(var2 == null) {
               break label82;
            }

            int var18 = var4 - var13;

            while(var18 <= var4 + var13) {
               var20 = this.method_9139(var17, var18, var11, var12, var13);
               if(var2 == null) {
                  continue label79;
               }

               label73: {
                  label109: {
                     int var10001;
                     int var10002;
                     int var10003;
                     class_1660 var22;
                     label110: {
                        if(var2 != null) {
                           int var10004;
                           label111: {
                              if(var20 == 0) {
                                 var22 = this;
                                 var10001 = var17;
                                 var10002 = var18;
                                 var10003 = 1;
                                 var10004 = 1;
                                 if(var2 == null) {
                                    break label111;
                                 }

                                 this.method_9134(var17, var18, true, true).method_9161(var1);
                                 if(var16 != null) {
                                    var16.addChunkToTickOnce(var17, var18);
                                 }
                              }

                              var22 = this;
                              var10001 = var17 - var14;
                              var10002 = var18 - var15;
                              var10003 = var3;
                              if(var2 == null) {
                                 break label110;
                              }

                              var10004 = var4;
                           }

                           var20 = var22.method_9139(var10001, var10002, var10003, var10004, var13);
                        }

                        if(var20 != 0) {
                           break label109;
                        }

                        var22 = this;
                        var10001 = var17 - var14;
                        var10002 = var18 - var15;
                        var10003 = 0;
                     }

                     class_1663 var19 = var22.method_9133(var10001, var10002, (boolean)var10003);
                     if(var2 == null) {
                        break label73;
                     }

                     if(var19 != null) {
                        var19.method_9162(var1);
                     }
                  }

                  ++var18;
               }

               if(var2 == null) {
                  break;
               }
            }

            ++var17;
            if(var2 != null) {
               continue label82;
            }
            break;
         }

         this.method_9137(var1);
         var1.field_3657 = var1.field_2994;
         break;
      }

      var1.field_3658 = var1.field_2996;
   }

   // $FF: renamed from: b (xi, int, int) boolean
   public boolean method_9141(class_793 var1, int var2, int var3) {
      boolean var7;
      label32: {
         String[] var10000 = class_752.method_4253();
         class_1663 var5 = this.method_9133(var2, var3, false);
         String[] var4 = var10000;
         class_1663 var6 = var5;
         if(var4 != null) {
            if(var5 == null) {
               break label32;
            }

            var6 = var5;
         }

         var7 = class_1663.method_9172(var6).contains(var1);
         if(var4 != null) {
            if(!var7) {
               break label32;
            }

            var7 = var1.field_3659.contains(class_1663.method_9171(var5));
         }

         if(var4 == null) {
            return var7;
         }

         if(!var7) {
            var7 = true;
            return var7;
         }
      }

      var7 = false;
      return var7;
   }

   // $FF: renamed from: b (int) void
   public void method_9142(int var1) {
      String[] var10000 = class_752.method_4253();
      var1 = class_1715.method_9568(var1, 3, 32);
      String[] var2 = var10000;
      int var11 = var1;
      int var10001 = this.field_8642;
      if(var2 != null) {
         if(var1 == this.field_8642) {
            return;
         }

         var11 = var1;
         var10001 = this.field_8642;
      }

      int var3 = var11 - var10001;
      Iterator var4 = this.field_8637.iterator();

      label108:
      while(true) {
         var11 = var4.hasNext();

         label105:
         while(var11 != 0) {
            class_793 var5 = (class_793)var4.next();
            int var6 = (int)var5.field_2994 >> 4;
            int var7 = (int)var5.field_2996 >> 4;
            if(var2 == null) {
               return;
            }

            label119: {
               var11 = var3;
               int var8;
               int var9;
               if(var2 != null) {
                  if(var3 > 0) {
                     var8 = var6 - var1;

                     do {
                        var11 = var8;

                        label92:
                        while(true) {
                           if(var11 > var6 + var1) {
                              break label119;
                           }

                           var11 = var7 - var1;
                           if(var2 == null) {
                              continue label105;
                           }

                           var9 = var11;

                           while(true) {
                              if(var9 > var7 + var1) {
                                 break label92;
                              }

                              class_1663 var10 = this.method_9134(var8, var9, true, true);
                              if(var2 != null) {
                                 var11 = class_1663.method_9172(var10).contains(var5);
                                 if(var2 == null) {
                                    break;
                                 }

                                 if(var11 == 0) {
                                    var10.method_9161(var5);
                                 }

                                 ++var9;
                              }

                              if(var2 == null) {
                                 break label92;
                              }
                           }
                        }

                        ++var8;
                     } while(var2 != null);
                  }

                  var11 = var6 - this.field_8642;
               }

               var8 = var11;

               label77:
               do {
                  var11 = var8;

                  label74:
                  while(true) {
                     if(var11 > var6 + this.field_8642) {
                        break label77;
                     }

                     var11 = var7 - this.field_8642;
                     if(var2 == null) {
                        continue label105;
                     }

                     var9 = var11;

                     while(true) {
                        if(var9 > var7 + this.field_8642) {
                           break label74;
                        }

                        label69: {
                           class_1660 var12 = this;
                           var10001 = var8;
                           int var10002 = var9;
                           int var10003 = var6;
                           if(var2 != null) {
                              var11 = this.method_9139(var8, var9, var6, var7, var1);
                              if(var2 == null) {
                                 break;
                              }

                              if(var11 != 0) {
                                 break label69;
                              }

                              var12 = this;
                              var10001 = var8;
                              var10002 = var9;
                              var10003 = 1;
                           }

                           var12.method_9133(var10001, var10002, (boolean)var10003).method_9162(var5);
                        }

                        ++var9;
                        if(var2 == null) {
                           break label74;
                        }
                     }
                  }

                  ++var8;
               } while(var2 != null);
            }

            if(var2 != null) {
               continue label108;
            }
            break;
         }

         this.field_8642 = var1;
         return;
      }
   }

   // $FF: renamed from: c (int) int
   public static int method_9143(int var0) {
      return var0 * 16 - 16;
   }

   // $FF: renamed from: d () org.apache.logging.log4j.Logger
   static Logger method_9144() {
      return field_8635;
   }

   // $FF: renamed from: b (ue) dk
   static class_354 method_9145(class_1660 var0) {
      return var0.field_8636;
   }

   // $FF: renamed from: c (ue) vp
   static class_1711 method_9146(class_1660 var0) {
      return var0.field_8638;
   }

   // $FF: renamed from: d (ue) java.util.List
   static List method_9147(class_1660 var0) {
      return var0.field_8640;
   }

   // $FF: renamed from: e (ue) java.util.List
   static List method_9148(class_1660 var0) {
      return var0.field_8639;
   }

   // $FF: renamed from: <clinit> () void
   static void method_9149() {
      boolean var10000 = true;
      char[] var10003 = "©å·>rÛà³".toCharArray();
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
            field_8645 = (new String((char[])var4)).intern();
            String var2 = field_8645;
            field_8635 = LogManager.getLogger();
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 180;
            break;
         case 1:
            var10009 = 138;
            break;
         case 2:
            var10009 = 228;
            break;
         case 3:
            var10009 = 217;
            break;
         case 4:
            var10009 = 101;
            break;
         case 5:
            var10009 = 80;
            break;
         default:
            var10009 = 28;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
