
// $FF: renamed from: eW
public class class_429 extends class_428 {

   // $FF: renamed from: M boolean
   private boolean field_2153;
   // $FF: renamed from: N vL
   private class_73 field_2154;
   // $FF: renamed from: O vL
   private class_73 field_2155;
   // $FF: renamed from: P java.lang.String[]
   private static final String[] field_2156;


   // $FF: renamed from: <init> (boolean) void
   protected void method_2712(boolean var1) {
      super.method_2427(awt.field_4198);
      this.method_2440(true);
      this.field_2153 = var1;
      this.method_2521(class_872.field_4244);
   }

   // $FF: renamed from: a (int, int) vL
   public class_73 method_2448(int var1, int var2) {
      String[] var3 = class_752.method_4253();
      int var10000 = var1;
      if(var3 != null) {
         if(var1 == 1) {
            return this.field_2154;
         }

         var10000 = var1;
      }

      if(var3 != null) {
         if(var10000 == 0) {
            return this.field_2154;
         }

         var10000 = var2;
      }

      byte var10001;
      label80: {
         var10001 = 2;
         if(var3 != null) {
            label81: {
               if(var10000 == 2) {
                  var10000 = var1;
                  var10001 = 2;
                  if(var3 == null) {
                     break label81;
                  }

                  if(var1 == 2) {
                     return this.field_2155;
                  }
               }

               var10000 = var2;
               if(var3 == null) {
                  break label80;
               }

               var10001 = 3;
            }
         }

         if(var10000 == var10001) {
            var10000 = var1;
            if(var3 == null) {
               break label80;
            }

            if(var1 == 5) {
               return this.field_2155;
            }
         }

         var10000 = var2;
      }

      label58: {
         if(var3 != null) {
            if(var10000 == 0) {
               var10000 = var1;
               var10001 = 3;
               if(var3 == null) {
                  break label58;
               }

               if(var1 == 3) {
                  return this.field_2155;
               }
            }

            var10000 = var2;
         }

         var10001 = 1;
      }

      if(var3 != null) {
         if(var10000 != var10001) {
            return this.field_2010;
         }

         var10000 = var1;
         var10001 = 4;
      }

      if(var10000 == var10001) {
         return this.field_2155;
      } else {
         return this.field_2010;
      }
   }

   // $FF: renamed from: b (ahb, int, int, int) void
   public void method_2461(ahb var1, int var2, int var3, int var4) {
      String[] var10000 = class_752.method_4253();
      super.method_2461(var1, var2, var3, var4);
      String[] var5 = var10000;
      aji var13 = var1.getBlock(var2, var3 - 1, var4);
      aji var10001 = class_1192.field_6106;
      if(var5 != null) {
         label136: {
            if(var13 == class_1192.field_6106) {
               var13 = var1.getBlock(var2, var3 - 2, var4);
               var10001 = class_1192.field_6106;
               if(var5 == null) {
                  break label136;
               }

               if(var13 == class_1192.field_6106) {
                  byte var14 = var1.field_1832;
                  if(var5 != null) {
                     if(!var1.field_1832) {
                        var1.method_2054(var2, var3, var4, method_2416(0), 0, 2);
                        var1.method_2054(var2, var3 - 1, var4, method_2416(0), 0, 2);
                        var1.method_2054(var2, var3 - 2, var4, method_2416(0), 0, 2);
                        class_766 var15 = new class_766;
                        var15.method_3847(var1);
                        class_766 var6 = var15;
                        var6.method_3887((double)var2 + 0.5D, (double)var3 - 1.95D, (double)var4 + 0.5D, 0.0F, 0.0F);
                        var1.method_2089(var6);
                        var1.method_2060(var2, var3, var4, method_2416(0));
                        var1.method_2060(var2, var3 - 1, var4, method_2416(0));
                        var1.method_2060(var2, var3 - 2, var4, method_2416(0));
                     }

                     var14 = 0;
                  }

                  int var11 = var14;

                  while(var11 < 120) {
                     String[] var10 = field_2156;
                     var1.method_2087("snowshovel", (double)var2 + var1.field_1819.nextDouble(), (double)(var3 - 2) + var1.field_1819.nextDouble() * 2.5D, (double)var4 + var1.field_1819.nextDouble(), 0.0D, 0.0D, 0.0D);
                     ++var11;
                     if(var5 == null) {
                        return;
                     }

                     if(var5 == null) {
                        break;
                     }
                  }

                  if(var5 != null) {
                     return;
                  }
               }
            }

            var13 = var1.getBlock(var2, var3 - 1, var4);
            var10001 = class_1192.field_6069;
         }
      }

      if(var5 != null) {
         if(var13 != var10001) {
            return;
         }

         var13 = var1.getBlock(var2, var3 - 2, var4);
         var10001 = class_1192.field_6069;
      }

      if(var5 != null) {
         if(var13 != var10001) {
            return;
         }

         var13 = var1.getBlock(var2 - 1, var3 - 1, var4);
         var10001 = class_1192.field_6069;
      }

      boolean var16;
      label108: {
         label107: {
            if(var5 != null) {
               if(var13 != var10001) {
                  break label107;
               }

               var13 = var1.getBlock(var2 + 1, var3 - 1, var4);
               var10001 = class_1192.field_6069;
            }

            if(var13 == var10001) {
               var16 = true;
               break label108;
            }
         }

         var16 = false;
      }

      boolean var12;
      label99: {
         label98: {
            var12 = var16;
            var13 = var1.getBlock(var2, var3 - 1, var4 - 1);
            var10001 = class_1192.field_6069;
            if(var5 != null) {
               if(var13 != class_1192.field_6069) {
                  break label98;
               }

               var13 = var1.getBlock(var2, var3 - 1, var4 + 1);
               var10001 = class_1192.field_6069;
            }

            if(var13 == var10001) {
               var16 = true;
               break label99;
            }
         }

         var16 = false;
      }

      boolean var7 = var16;
      var16 = var12;
      if(var5 != null) {
         label89: {
            if(!var12) {
               var16 = var7;
               if(var5 == null) {
                  break label89;
               }

               if(!var7) {
                  return;
               }
            }

            var1.method_2054(var2, var3, var4, method_2416(0), 0, 2);
            var1.method_2054(var2, var3 - 1, var4, method_2416(0), 0, 2);
            var1.method_2054(var2, var3 - 2, var4, method_2416(0), 0, 2);
            var16 = var12;
         }
      }

      if(var5 != null) {
         label79: {
            if(var16) {
               var1.method_2054(var2 - 1, var3 - 1, var4, method_2416(0), 0, 2);
               var1.method_2054(var2 + 1, var3 - 1, var4, method_2416(0), 0, 2);
               if(var5 != null) {
                  break label79;
               }
            }

            var1.method_2054(var2, var3 - 1, var4 - 1, method_2416(0), 0, 2);
            var1.method_2054(var2, var3 - 1, var4 + 1, method_2416(0), 0, 2);
         }
      }

      class_765 var18 = new class_765;
      var18.method_3847(var1);
      class_765 var8 = var18;
      var8.method_4351(true);
      var8.method_3887((double)var2 + 0.5D, (double)var3 - 1.95D, (double)var4 + 0.5D, 0.0F, 0.0F);
      var1.method_2089(var8);
      int var9 = 0;

      while(true) {
         if(var9 < 120) {
            String[] var17 = field_2156;
            var1.method_2087("snowballpoof", (double)var2 + var1.field_1819.nextDouble(), (double)(var3 - 2) + var1.field_1819.nextDouble() * 3.9D, (double)var4 + var1.field_1819.nextDouble(), 0.0D, 0.0D, 0.0D);
            ++var9;
            if(var5 == null) {
               break;
            }

            if(var5 != null) {
               continue;
            }
         }

         var1.method_2060(var2, var3, var4, method_2416(0));
         var1.method_2060(var2, var3 - 1, var4, method_2416(0));
         var1.method_2060(var2, var3 - 2, var4, method_2416(0));
         break;
      }

      if(var5 != null) {
         if(var12) {
            var1.method_2060(var2 - 1, var3 - 1, var4, method_2416(0));
            var1.method_2060(var2 + 1, var3 - 1, var4, method_2416(0));
            if(var5 != null) {
               return;
            }
         }

         var1.method_2060(var2, var3 - 1, var4 - 1, method_2416(0));
      }

      var1.method_2060(var2, var3 - 1, var4 + 1, method_2416(0));
   }

   // $FF: renamed from: c (ahb, int, int, int) boolean
   public boolean method_2480(ahb var1, int var2, int var3, int var4) {
      boolean var10000;
      label24: {
         String[] var5 = class_752.method_4253();
         var10000 = var1.getBlock(var2, var3, var4).field_2007.method_5071();
         if(var5 != null) {
            if(!var10000) {
               break label24;
            }

            var10000 = ahb.method_2135(var1, var2, var3 - 1, var4);
         }

         if(var5 == null) {
            return var10000;
         }

         if(var10000) {
            var10000 = true;
            return var10000;
         }
      }

      var10000 = false;
      return var10000;
   }

   // $FF: renamed from: a (ahb, int, int, int, sv, add) void
   public void method_2506(ahb var1, int var2, int var3, int var4, class_752 var5, add var6) {
      int var7 = class_1715.method_9561((double)(var5.field_3000 * 4.0F / 360.0F) + 2.5D) & 3;
      var1.method_2055(var2, var3, var4, var7, 2);
   }

   // $FF: renamed from: a (vM) void
   public void method_2535(class_74 var1) {
      String[] var2 = class_752.method_4253();
      StringBuilder var10002 = (new StringBuilder()).append(this.method_2533());
      String[] var3 = field_2156;
      String var10003 = "_face_";
      if(var2 != null) {
         var10002 = var10002.append("_face_");
         if(this.field_2153) {
            var10003 = "on";
         } else {
            var3 = field_2156;
            var10003 = "off";
         }
      }

      this.field_2155 = var1.method_375(var10002.append(var10003).toString());
      var10002 = (new StringBuilder()).append(this.method_2533());
      var3 = field_2156;
      this.field_2154 = var1.method_375(var10002.append("_top").toString());
      this.field_2010 = var1.method_375(this.method_2533() + "_side");
   }

   // $FF: renamed from: <clinit> () void
   static void method_2537() {
      // $FF: Couldn't be decompiled
   }
}
