import java.util.Iterator;
import java.util.List;

// $FF: renamed from: zc
public class class_1851 {

   // $FF: renamed from: b ahb
   private ahb field_9449;
   // $FF: renamed from: c boolean
   private boolean field_9450;
   // $FF: renamed from: d int
   private int field_9451;
   // $FF: renamed from: e int
   private int field_9452;
   // $FF: renamed from: f int
   private int field_9453;
   // $FF: renamed from: g za
   private class_1849 field_9454;
   // $FF: renamed from: h int
   private int field_9455;
   // $FF: renamed from: i int
   private int field_9456;
   // $FF: renamed from: j int
   private int field_9457;
   // $FF: renamed from: k java.lang.String
   private static final String field_9458 = "CL_00001634";


   // $FF: renamed from: <init> (ahb) void
   public void method_10033(ahb var1) {
      super();
      this.field_9451 = -1;
      this.field_9449 = var1;
   }

   // $FF: renamed from: b () void
   public void method_10034() {
      String[] var1;
      int var5;
      label110: {
         label121: {
            String[] var10000 = class_752.method_4253();
            byte var2 = 0;
            var1 = var10000;
            var5 = var2;
            if(var1 != null) {
               if(var2 != 0) {
                  var5 = this.field_9451;
                  if(var1 == null) {
                     break label110;
                  }

                  if(this.field_9451 == 2) {
                     this.field_9452 = 100;
                     return;
                  }
                  break label121;
               }

               var5 = this.field_9449.method_2078();
            }

            if(var1 != null) {
               if(var5 != 0) {
                  this.field_9451 = 0;
                  return;
               }

               var5 = this.field_9451;
            }

            if(var1 != null) {
               if(var5 == 2) {
                  return;
               }

               var5 = this.field_9451;
            }

            if(var1 == null) {
               break label110;
            }

            if(var5 == 0) {
               float var3 = this.field_9449.method_2101(0.0F);
               double var6;
               var5 = (var6 = (double)var3 - 0.5D) == 0.0D?0:(var6 < 0.0D?-1:1);
               if(var1 != null) {
                  if(var5 < 0) {
                     return;
                  }

                  double var7;
                  var5 = (var7 = (double)var3 - 0.501D) == 0.0D?0:(var7 < 0.0D?-1:1);
               }

               if(var5 > 0) {
                  return;
               }

               int var10001 = this.field_9449.field_1819.nextInt(10);
               if(var1 != null) {
                  var10001 = var10001 == 0?1:2;
               }

               this.field_9451 = var10001;
               this.field_9450 = false;
               var5 = this.field_9451;
               if(var1 == null) {
                  break label110;
               }

               if(this.field_9451 == 2) {
                  return;
               }
            }
         }

         var5 = this.field_9450;
      }

      class_1851 var4;
      if(var1 != null) {
         if(var5 == 0) {
            var4 = this;
            if(var1 != null) {
               if(!this.method_10035()) {
                  return;
               }

               var4 = this;
            }

            var4.field_9450 = true;
         }

         var5 = this.field_9453;
      }

      label116: {
         if(var1 != null) {
            if(var5 > 0) {
               --this.field_9453;
               if(var1 != null) {
                  return;
               }
            }

            this.field_9453 = 2;
            var4 = this;
            if(var1 == null) {
               break label116;
            }

            var5 = this.field_9452;
         }

         if(var5 > 0) {
            this.method_10036();
            --this.field_9452;
            if(var1 != null) {
               return;
            }
         }

         var4 = this;
      }

      var4.field_9451 = 2;
   }

   // $FF: renamed from: c () boolean
   private boolean method_10035() {
      String[] var10000 = class_752.method_4253();
      List var2 = this.field_9449.field_1807;
      String[] var1 = var10000;
      Iterator var3 = var2.iterator();

      while(true) {
         Iterator var13 = var3;

         label118:
         while(true) {
            if(var13.hasNext()) {
               class_792 var4 = (class_792)var3.next();
               this.field_9454 = this.field_9449.field_1827.method_6780((int)var4.field_2994, (int)var4.field_2995, (int)var4.field_2996, 1);
               class_1849 var14 = this.field_9454;

               label113:
               while(true) {
                  if(var1 != null) {
                     if(var14 == null) {
                        break;
                     }

                     var14 = this.field_9454;
                  }

                  int var15 = var14.method_10005();
                  byte var10001 = 10;
                  if(var1 != null) {
                     if(var15 < 10) {
                        break;
                     }

                     var15 = this.field_9454.method_10006();
                     var10001 = 20;
                  }

                  label124: {
                     if(var1 != null) {
                        if(var15 < var10001) {
                           break;
                        }

                        var14 = this.field_9454;
                        if(var1 == null) {
                           break label124;
                        }

                        var15 = this.field_9454.method_10007();
                        var10001 = 20;
                     }

                     if(var15 < var10001) {
                        break;
                     }

                     var14 = this.field_9454;
                  }

                  class_1661 var5 = var14.method_10003();
                  float var6 = (float)this.field_9454.method_10004();
                  boolean var7 = false;
                  int var8 = 0;

                  boolean var11;
                  while(true) {
                     if(var8 < 10) {
                        this.field_9455 = var5.field_8646 + (int)((double)(class_1715.method_9556(this.field_9449.field_1819.nextFloat() * 3.1415927F * 2.0F) * var6) * 0.9D);
                        this.field_9456 = var5.field_8647;
                        this.field_9457 = var5.field_8648 + (int)((double)(class_1715.method_9555(this.field_9449.field_1819.nextFloat() * 3.1415927F * 2.0F) * var6) * 0.9D);
                        var7 = false;
                        var13 = this.field_9449.field_1827.method_6779().iterator();
                        if(var1 == null) {
                           continue label118;
                        }

                        Iterator var9 = var13;

                        while(var9.hasNext()) {
                           class_1849 var10 = (class_1849)var9.next();
                           var14 = var10;
                           if(var1 == null) {
                              continue label113;
                           }

                           label128: {
                              class_1851 var16 = this;
                              if(var1 != null) {
                                 if(var10 == this.field_9454) {
                                    break label128;
                                 }

                                 var14 = var10;
                                 var16 = this;
                              }

                              var11 = var14.method_10008(var16.field_9455, this.field_9456, this.field_9457);
                              if(var1 != null) {
                                 if(!var11) {
                                    break label128;
                                 }

                                 var11 = true;
                              }

                              var7 = var11;
                              if(var1 != null) {
                                 break;
                              }
                           }

                           if(var1 == null) {
                              break;
                           }
                        }

                        var11 = var7;
                        if(var1 == null) {
                           break;
                        }

                        if(var7) {
                           ++var8;
                           if(var1 != null) {
                              continue;
                           }
                        }
                     }

                     var11 = var7;
                     break;
                  }

                  if(var1 != null) {
                     if(!var11) {
                        azw var12 = this.method_10037(this.field_9455, this.field_9456, this.field_9457);
                        if(var1 != null) {
                           if(var12 == null) {
                              break;
                           }

                           this.field_9453 = 0;
                           this.field_9452 = 20;
                        }

                        return true;
                     }

                     var11 = false;
                  }

                  return var11;
               }

               if(var1 != null) {
                  break;
               }
            }

            return false;
         }
      }
   }

   // $FF: renamed from: d () boolean
   private boolean method_10036() {
      azw var1 = this.method_10037(this.field_9455, this.field_9456, this.field_9457);

      try {
         if(var1 == null) {
            return false;
         }
      } catch (Exception var5) {
         throw method_10038(var5);
      }

      class_781 var2;
      try {
         class_781 var10000 = new class_781;
         var10000.method_3847(this.field_9449);
         var2 = var10000;
         var2.method_4282((class_83)null);
         var2.method_4516(false);
      } catch (Exception var4) {
         var4.printStackTrace();
         return false;
      }

      var2.method_3887(var1.field_4220, var1.field_4221, var1.field_4222, this.field_9449.field_1819.nextFloat() * 360.0F, 0.0F);
      this.field_9449.method_2089(var2);
      class_1661 var3 = this.field_9454.method_10003();
      var2.method_4339(var3.field_8646, var3.field_8647, var3.field_8648, this.field_9454.method_10004());
      return true;
   }

   // $FF: renamed from: b (int, int, int) azw
   private azw method_10037(int var1, int var2, int var3) {
      String[] var10000 = class_752.method_4253();
      int var5 = 0;
      String[] var4 = var10000;

      while(var5 < 10) {
         int var6 = var1 + this.field_9449.field_1819.nextInt(16) - 8;
         int var7 = var2 + this.field_9449.field_1819.nextInt(6) - 3;
         int var8 = var3 + this.field_9449.field_1819.nextInt(16) - 8;
         if(var4 != null) {
            if(this.field_9454.method_10008(var6, var7, var8)) {
               label22: {
                  int var9 = class_1047.method_5939(class_922.field_4652, this.field_9449, var6, var7, var8);
                  if(var4 != null) {
                     if(var9 == 0) {
                        break label22;
                     }

                     var9 = var6;
                  }

                  azw.method_5086((double)var9, (double)var7, (double)var8);
               }
            }

            ++var5;
         }

         if(var4 == null) {
            break;
         }
      }

      return null;
   }

   // $FF: renamed from: b (java.lang.Exception) java.lang.Exception
   private static Exception method_10038(Exception var0) {
      return var0;
   }

   // $FF: renamed from: <clinit> () void
   static void method_10039() {
      boolean var10000 = true;
      char[] var10003 = "iÔ¡©óm®Í­".toCharArray();
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
            field_9458 = (new String((char[])var4)).intern();
            String var2 = field_9458;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 138;
            break;
         case 1:
            var10009 = 56;
            break;
         case 2:
            var10009 = 94;
            break;
         case 3:
            var10009 = 57;
            break;
         case 4:
            var10009 = 27;
            break;
         case 5:
            var10009 = 99;
            break;
         default:
            var10009 = 253;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
