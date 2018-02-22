import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class bjf extends ahb {

   // $FF: renamed from: a nv
   private class_1436 field_1841;
   // $FF: renamed from: b nx
   private class_1439 field_1842;
   // $FF: renamed from: c vl
   private class_1706 field_1843;
   // $FF: renamed from: J java.util.Set
   private Set field_1844;
   // $FF: renamed from: K java.util.Set
   private Set field_1845;
   // $FF: renamed from: L bao
   private final bao field_1846;
   // $FF: renamed from: M java.util.Set
   private final Set field_1847;
   private static final String __OBFID;
   // $FF: renamed from: O java.lang.String[]
   private static final String[] field_1848;


   // $FF: renamed from: <init> (nv, dt, int, aq, qi) void
   public void method_2227(class_1436 var1, class_1045 var2, int var3, class_918 var4, class_1535 var5) {
      class_1340 var10001 = new class_1340;
      var10001.method_7076();
      String[] var10002 = field_1848;
      super.method_2042(var10001, "MpServer", class_1089.method_6172(var3), var2, var5);
      class_1706 var6 = new class_1706;
      var6.method_9472();
      this.field_1843 = var6;
      this.field_1844 = new HashSet();
      this.field_1845 = new HashSet();
      this.field_1846 = bao.method_5273();
      this.field_1847 = new HashSet();
      this.field_1841 = var1;
      this.field_1818 = var4;
      this.method_2188(8, 64, 8);
      this.field_1826 = var1.field_7624;
   }

   // $FF: renamed from: b () void
   public void method_2139() {
      String[] var10000 = class_752.method_4253();
      super.method_2139();
      String[] var1 = var10000;
      this.method_2182(this.method_2184() + 1L);
      class_1038 var5 = this.method_2196();
      String[] var4 = field_1848;
      byte var6 = var5.method_5878("doDaylightCycle");
      if(var1 != null) {
         if(var6 != 0) {
            this.method_2186(this.method_2185() + 1L);
         }

         var4 = field_1848;
         this.field_1829.method_8332("reEntryProcessing");
         var6 = 0;
      }

      int var2 = var6;

      while(true) {
         if(var2 < 10) {
            boolean var7 = this.field_1845.isEmpty();
            if(var1 == null || var1 == null) {
               break;
            }

            if(!var7) {
               class_689 var3 = (class_689)this.field_1845.iterator().next();
               this.field_1845.remove(var3);
               if(var1 != null) {
                  if(!this.field_1802.contains(var3)) {
                     this.method_2089(var3);
                  }

                  ++var2;
               }

               if(var1 != null) {
                  continue;
               }
            }
         }

         var4 = field_1848;
         this.field_1829.method_8335("connection");
         this.field_1841.method_239();
         this.field_1829.method_8335("chunkCache");
         this.field_1842.method_108();
         break;
      }

      String[] var10001 = field_1848;
      this.field_1829.method_8335("blocks");
      this.method_2145();
      this.field_1829.method_8333();
   }

   // $FF: renamed from: a (int, int, int, int, int, int) void
   public void method_2228(int var1, int var2, int var3, int var4, int var5, int var6) {}

   // $FF: renamed from: j () gG
   protected class_25 method_2044() {
      class_1439 var10001 = new class_1439;
      var10001.method_7832(this);
      this.field_1842 = var10001;
      return this.field_1842;
   }

   // $FF: renamed from: g () void
   protected void method_2145() {
      String[] var10000 = class_752.method_4253();
      super.method_2145();
      String[] var1 = var10000;
      this.field_1847.retainAll(this.field_1833);
      int var8 = this.field_1847.size();
      if(var1 != null) {
         if(var8 == this.field_1833.size()) {
            this.field_1847.clear();
         }

         var8 = 0;
      }

      int var2 = var8;
      Iterator var3 = this.field_1833.iterator();

      while(var3.hasNext()) {
         label29: {
            class_1035 var4 = (class_1035)var3.next();
            var8 = this.field_1847.contains(var4);
            if(var1 != null) {
               if(var8 != 0) {
                  break label29;
               }

               var8 = var4.field_5475 * 16;
            }

            int var5 = var8;
            int var6 = var4.field_5476 * 16;
            String[] var10001 = field_1848;
            this.field_1829.method_8332("getChunk");
            class_1069 var7 = this.method_2053(var4.field_5475, var4.field_5476);
            this.method_2144(var5, var6, var7);
            this.field_1829.method_8333();
            this.field_1847.add(var4);
            ++var2;
            if(var2 >= 10) {
               return;
            }
         }

         if(var1 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: a (int, int, boolean) void
   public void method_2229(int var1, int var2, boolean var3) {
      label21: {
         label20: {
            String[] var4 = class_752.method_4253();
            if(var4 != null) {
               if(!var3) {
                  break label20;
               }

               this.field_1842.method_105(var1, var2);
            }

            if(var4 != null) {
               break label21;
            }
         }

         this.field_1842.method_7833(var1, var2);
      }

      if(!var3) {
         this.method_2062(var1 * 16, 0, var2 * 16, var1 * 16 + 15, 256, var2 * 16 + 15);
      }

   }

   // $FF: renamed from: d (sa) boolean
   public boolean method_2089(class_689 var1) {
      boolean var3;
      boolean var4;
      label25: {
         String[] var10000 = class_752.method_4253();
         var3 = super.method_2089(var1);
         String[] var2 = var10000;
         this.field_1844.add(var1);
         var4 = var3;
         if(var2 != null) {
            if(!var3) {
               this.field_1845.add(var1);
               if(var2 != null) {
                  break label25;
               }
            }

            var4 = var1 instanceof class_690;
         }

         if(var2 == null) {
            return var4;
         }

         if(var4) {
            class_1541 var5 = this.field_1846.method_5295();
            class_1427 var10001 = new class_1427;
            var10001.method_7776((class_690)var1);
            var5.method_8366(var10001);
         }
      }

      var4 = var3;
      return var4;
   }

   // $FF: renamed from: e (sa) void
   public void method_2092(class_689 var1) {
      super.method_2092(var1);
      this.field_1844.remove(var1);
   }

   // $FF: renamed from: a (sa) void
   protected void method_2090(class_689 var1) {
      String[] var10000 = class_752.method_4253();
      super.method_2090(var1);
      String[] var2 = var10000;
      if(var2 != null && this.field_1845.contains(var1)) {
         this.field_1845.remove(var1);
      }

   }

   // $FF: renamed from: b (sa) void
   protected void method_2091(class_689 var1) {
      String[] var10000 = class_752.method_4253();
      super.method_2091(var1);
      String[] var2 = var10000;
      boolean var3 = false;
      boolean var4 = this.field_1844.contains(var1);
      if(var2 != null) {
         if(var4) {
            var4 = var1.method_3917();
            if(var2 != null) {
               label28: {
                  if(var4) {
                     this.field_1845.add(var1);
                     var3 = true;
                     if(var2 != null) {
                        break label28;
                     }
                  }

                  this.field_1844.remove(var1);
               }
            }
         }

         var4 = bnn.field_7418.method_7618(var1).method_4730();
      }

      if(var2 != null) {
         if(!var4) {
            return;
         }

         var4 = var3;
      }

      if(!var4) {
         this.field_1846.cursorCounter7.method_82();
      }

   }

   // $FF: renamed from: a (int, sa) void
   public void method_2230(int var1, class_689 var2) {
      class_689 var4 = this.method_2160(var1);
      String[] var3 = class_752.method_4253();
      class_689 var10000 = var4;
      if(var3 != null) {
         if(var4 != null) {
            this.method_2092(var4);
         }

         this.field_1844.add(var2);
         var10000 = var2;
      }

      bjf var6;
      label34: {
         var10000.method_3846(var1);
         boolean var5 = this.method_2089(var2);
         if(var3 != null) {
            if(!var5) {
               this.field_1845.add(var2);
            }

            var6 = this;
            if(var3 == null) {
               break label34;
            }

            this.field_1843.method_9478(var1, var2);
            var5 = bnn.field_7418.method_7618(var2).method_4730();
         }

         if(!var5) {
            return;
         }

         var6 = this;
      }

      var6.field_1846.cursorCounter7.method_82();
   }

   // $FF: renamed from: a (int) sa
   public class_689 method_2160(int var1) {
      return (class_689)(var1 == this.field_1846.cursorCounter8.method_3845()?this.field_1846.cursorCounter8:(class_689)this.field_1843.method_9475(var1));
   }

   // $FF: renamed from: b (int) sa
   public class_689 method_2231(int var1) {
      String[] var10000 = class_752.method_4253();
      class_689 var3 = (class_689)this.field_1843.method_9481(var1);
      String[] var2 = var10000;
      class_689 var4 = var3;
      if(var2 != null) {
         if(var3 != null) {
            this.field_1844.remove(var3);
            this.method_2092(var3);
         }

         var4 = var3;
      }

      return var4;
   }

   // $FF: renamed from: c (int, int, int, aji, int) boolean
   public boolean method_2232(int var1, int var2, int var3, aji var4, int var5) {
      this.method_2228(var1, var2, var3, var1, var2, var3);
      return super.method_2054(var1, var2, var3, var4, var5, 3);
   }

   // $FF: renamed from: F () void
   public void method_2180() {
      class_120 var10000 = this.field_1841.method_7822();
      class_1082 var10001 = new class_1082;
      String[] var10003 = field_1848;
      var10001.method_6134("Quitting");
      var10000.method_558(var10001);
   }

   // $FF: renamed from: o () void
   protected void method_2141() {
      if(!this.field_1820.field_5736) {
         ;
      }

   }

   // $FF: renamed from: p () int
   protected int method_2143() {
      return this.field_1846.canLoseFocus7.field_4487;
   }

   // $FF: renamed from: C (int, int, int) void
   public void method_2233(int var1, int var2, int var3) {
      byte var5 = 16;
      Random var6 = new Random();
      String[] var4 = class_752.method_4253();
      int var7 = 0;

      while(var7 < 1000) {
         label37: {
            int var8 = var1 + this.field_1819.nextInt(var5) - this.field_1819.nextInt(var5);
            int var9 = var2 + this.field_1819.nextInt(var5) - this.field_1819.nextInt(var5);
            int var10 = var3 + this.field_1819.nextInt(var5) - this.field_1819.nextInt(var5);
            aji var11 = this.getBlock(var8, var9, var10);
            aji var10000 = var11;
            if(var4 != null) {
               if(var11.method_2424() == awt.field_4170) {
                  bjf var13;
                  label45: {
                     int var12 = this.field_1819.nextInt(8);
                     if(var4 != null) {
                        if(var12 <= var9) {
                           break label37;
                        }

                        var13 = this;
                        if(var4 == null) {
                           break label45;
                        }

                        var12 = this.field_1820.method_6177();
                     }

                     if(var12 == 0) {
                        break label37;
                     }

                     var13 = this;
                  }

                  String[] var10001 = field_1848;
                  var13.method_2087("depthsuspend", (double)((float)var8 + this.field_1819.nextFloat()), (double)((float)var9 + this.field_1819.nextFloat()), (double)((float)var10 + this.field_1819.nextFloat()), 0.0D, 0.0D, 0.0D);
                  if(var4 != null) {
                     break label37;
                  }
               }

               var10000 = var11;
            }

            var10000.method_2457(this, var8, var9, var10, var6);
         }

         ++var7;
         if(var4 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: a () void
   public void method_2234() {
      String[] var10000 = class_752.method_4253();
      this.field_1802.removeAll(this.field_1803);
      String[] var1 = var10000;
      int var2 = 0;

      class_689 var3;
      int var4;
      int var5;
      byte var6;
      bjf var7;
      while(true) {
         if(var2 < this.field_1803.size()) {
            var3 = (class_689)this.field_1803.get(var2);
            var4 = var3.field_3040;
            var5 = var3.field_3042;
            if(var1 != null) {
               var6 = var3.field_3039;
               if(var1 == null) {
                  break;
               }

               if(var3.field_3039) {
                  label98: {
                     var7 = this;
                     int var10001 = var4;
                     int var10002 = var5;
                     if(var1 != null) {
                        if(!this.method_2051(var4, var5)) {
                           break label98;
                        }

                        var7 = this;
                        var10001 = var4;
                        var10002 = var5;
                     }

                     var7.method_2053(var10001, var10002).method_6036(var3);
                  }
               }

               ++var2;
            }

            if(var1 != null) {
               continue;
            }
         }

         var6 = 0;
         break;
      }

      var2 = var6;

      while(true) {
         if(var2 < this.field_1803.size()) {
            this.method_2091((class_689)this.field_1803.get(var2));
            ++var2;
            if(var1 == null) {
               break;
            }

            if(var1 != null) {
               continue;
            }
         }

         this.field_1803.clear();
         break;
      }

      var2 = 0;

      while(var2 < this.field_1802.size()) {
         label112: {
            var3 = (class_689)this.field_1802.get(var2);
            class_689 var8 = var3.field_2988;
            if(var1 != null) {
               if(var3.field_2988 != null) {
                  var8 = var3.field_2988;
                  if(var1 != null) {
                     label70: {
                        if(!var3.field_2988.field_3012) {
                           var8 = var3.field_2988.field_2987;
                           if(var1 == null) {
                              break label70;
                           }

                           if(var3.field_2988.field_2987 == var3 && var1 != null) {
                              break label112;
                           }
                        }

                        var3.field_2988.field_2987 = null;
                        var8 = var3;
                     }
                  }

                  var8.field_2988 = null;
               }

               var8 = var3;
            }

            int var9 = var8.field_3012;
            if(var1 != null) {
               if(var8.field_3012 == 0) {
                  break label112;
               }

               var9 = var3.field_3040;
            }

            label56: {
               var4 = var9;
               var5 = var3.field_3042;
               if(var1 != null) {
                  if(var3.field_3039) {
                     var7 = this;
                     if(var1 == null) {
                        break label56;
                     }

                     if(this.method_2051(var4, var5)) {
                        this.method_2053(var4, var5).method_6036(var3);
                     }
                  }

                  this.field_1802.remove(var2--);
               }

               var7 = this;
            }

            var7.method_2091(var3);
         }

         ++var2;
         if(var1 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: a (kj) tR
   public class_1605 method_2216(class_1346 var1) {
      class_1605 var2 = super.method_2216(var1);
      String[] var3 = field_1848;
      class_1442 var10002 = new class_1442;
      var10002.method_7869(this);
      var2.method_8777("Forced entities", var10002);
      class_1381 var4 = new class_1381;
      var4.method_7541(this);
      var2.method_8777("Retry entities", var4);
      class_1382 var5 = new class_1382;
      var5.method_7544(this);
      var2.method_8777("Server brand", var5);
      class_1383 var6 = new class_1383;
      var6.method_7547(this);
      var2.method_8777("Server type", var6);
      return var2;
   }

   // $FF: renamed from: a (double, double, double, java.lang.String, float, float, boolean) void
   public void method_2085(double var1, double var3, double var5, String var7, float var8, float var9, boolean var10) {
      class_1424 var14;
      label25: {
         String[] var11;
         double var18;
         double var19;
         label28: {
            double var12 = this.field_1846.cursorCounter9.method_3889(var1, var3, var5);
            String[] var10000 = class_752.method_4253();
            class_1424 var10001 = new class_1424;
            bqx var10003 = new bqx;
            var10003.method_8227(var7);
            var10001.method_7771(var10003, var8, var9, (float)var1, (float)var3, (float)var5);
            var14 = var10001;
            var11 = var10000;
            int var17 = var10;
            if(var11 != null) {
               if(var10 == 0) {
                  break label25;
               }

               var18 = var12;
               var19 = 100.0D;
               if(var11 == null) {
                  break label28;
               }

               double var20;
               var17 = (var20 = var12 - 100.0D) == 0.0D?0:(var20 < 0.0D?-1:1);
            }

            if(var17 <= 0) {
               break label25;
            }

            var18 = Math.sqrt(var12);
            var19 = 40.0D;
         }

         double var15 = var18 / var19;
         this.field_1846.method_5295().method_8367(var14, (int)(var15 * 20.0D));
         if(var11 != null) {
            return;
         }
      }

      this.field_1846.method_5295().method_8366(var14);
   }

   // $FF: renamed from: a (double, double, double, double, double, double, ro) void
   public void method_2219(double var1, double var3, double var5, double var7, double var9, double var11, class_1583 var13) {
      bkn var10000 = this.field_1846.enableBackgroundDrawing1;
      class_736 var10001 = new class_736;
      var10001.method_4121(this, var1, var3, var5, var7, var9, var11, this.field_1846.enableBackgroundDrawing1, var13);
      var10000.method_6968(var10001);
   }

   // $FF: renamed from: a (kl) void
   public void method_2235(class_1348 var1) {
      this.field_1831 = var1;
   }

   // $FF: renamed from: b (long) void
   public void method_2186(long var1) {
      label17: {
         String[] var4;
         class_1038 var5;
         label16: {
            String[] var3 = class_752.method_4253();
            long var10000 = var1;
            if(var3 != null) {
               if(var1 >= 0L) {
                  break label16;
               }

               var10000 = -var1;
            }

            var1 = var10000;
            var5 = this.method_2196();
            var4 = field_1848;
            var5.method_5876("doDaylightCycle", "false");
            if(var3 != null) {
               break label17;
            }
         }

         var5 = this.method_2196();
         var4 = field_1848;
         var5.method_5876("doDaylightCycle", "true");
      }

      super.method_2186(var1);
   }

   // $FF: renamed from: a (bjf) java.util.Set
   static Set method_2236(bjf var0) {
      return var0.field_1844;
   }

   // $FF: renamed from: b (bjf) java.util.Set
   static Set method_2237(bjf var0) {
      return var0.field_1845;
   }

   // $FF: renamed from: c (bjf) bao
   static bao method_2238(bjf var0) {
      return var0.field_1846;
   }

   // $FF: renamed from: <clinit> () void
   static void method_2226() {
      // $FF: Couldn't be decompiled
   }
}
