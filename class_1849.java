import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;

// $FF: renamed from: za
public class class_1849 {

   // $FF: renamed from: b ahb
   private ahb field_9431;
   // $FF: renamed from: c java.util.List
   private final List field_9432;
   // $FF: renamed from: d vF
   private final class_1661 field_9433;
   // $FF: renamed from: e vF
   private final class_1661 field_9434;
   // $FF: renamed from: f int
   private int field_9435;
   // $FF: renamed from: g int
   private int field_9436;
   // $FF: renamed from: h int
   private int field_9437;
   // $FF: renamed from: i int
   private int field_9438;
   // $FF: renamed from: j int
   private int field_9439;
   // $FF: renamed from: k java.util.TreeMap
   private TreeMap field_9440;
   // $FF: renamed from: l java.util.List
   private List field_9441;
   // $FF: renamed from: m int
   private int field_9442;
   // $FF: renamed from: n java.lang.String
   private static final String field_9443;
   // $FF: renamed from: o java.lang.String[]
   private static final String[] field_9444;


   // $FF: renamed from: <init> () void
   public void method_9995() {
      super();
      this.field_9432 = new ArrayList();
      class_1661 var10001 = new class_1661;
      var10001.method_9151(0, 0, 0);
      this.field_9433 = var10001;
      var10001 = new class_1661;
      var10001.method_9151(0, 0, 0);
      this.field_9434 = var10001;
      this.field_9440 = new TreeMap();
      this.field_9441 = new ArrayList();
   }

   // $FF: renamed from: <init> (ahb) void
   public void method_9996(ahb var1) {
      super();
      this.field_9432 = new ArrayList();
      class_1661 var10001 = new class_1661;
      var10001.method_9151(0, 0, 0);
      this.field_9433 = var10001;
      var10001 = new class_1661;
      var10001.method_9151(0, 0, 0);
      this.field_9434 = var10001;
      this.field_9440 = new TreeMap();
      this.field_9441 = new ArrayList();
      this.field_9431 = var1;
   }

   // $FF: renamed from: b (ahb) void
   public void method_9997(ahb var1) {
      this.field_9431 = var1;
   }

   // $FF: renamed from: b (int) void
   public void method_9998(int var1) {
      String[] var10000 = class_752.method_4253();
      this.field_9437 = var1;
      String[] var2 = var10000;
      this.method_10019();
      this.method_10018();
      int var6 = var1 % 20;
      if(var2 != null) {
         if(var6 == 0) {
            this.method_10002();
         }

         var6 = var1 % 30;
      }

      if(var2 != null) {
         if(var6 == 0) {
            this.method_10001();
         }

         var6 = this.field_9438 / 10;
      }

      class_1849 var7;
      label52: {
         label53: {
            int var3 = var6;
            var6 = this.field_9442;
            int var10001 = var3;
            if(var2 != null) {
               if(this.field_9442 >= var3) {
                  return;
               }

               var6 = this.field_9432.size();
               if(var2 == null) {
                  break label53;
               }

               var10001 = 20;
            }

            if(var6 <= var10001) {
               return;
            }

            var7 = this;
            if(var2 == null) {
               break label52;
            }

            var6 = this.field_9431.field_1819.nextInt(7000);
         }

         if(var6 != 0) {
            return;
         }

         var7 = this;
      }

      azw var4 = var7.method_9999(class_1715.method_9559((float)this.field_9434.field_8646), class_1715.method_9559((float)this.field_9434.field_8647), class_1715.method_9559((float)this.field_9434.field_8648), 2, 4, 2);
      if(var4 != null) {
         class_765 var8 = new class_765;
         var8.method_3847(this.field_9431);
         class_765 var5 = var8;
         var5.method_3854(var4.field_4220, var4.field_4221, var4.field_4222);
         this.field_9431.method_2089(var5);
         ++this.field_9442;
      }

   }

   // $FF: renamed from: b (int, int, int, int, int, int) azw
   private azw method_9999(int var1, int var2, int var3, int var4, int var5, int var6) {
      String[] var10000 = class_752.method_4253();
      int var8 = 0;
      String[] var7 = var10000;

      while(true) {
         if(var8 < 10) {
            int var9 = var1 + this.field_9431.field_1819.nextInt(16) - 8;
            int var10 = var2 + this.field_9431.field_1819.nextInt(6) - 3;
            int var11 = var3 + this.field_9431.field_1819.nextInt(16) - 8;
            if(var7 != null) {
               if(this.method_10008(var9, var10, var11)) {
                  label21: {
                     int var12 = this.method_10000(var9, var10, var11, var4, var5, var6);
                     if(var7 != null) {
                        if(var12 == 0) {
                           break label21;
                        }

                        var12 = var9;
                     }

                     return azw.method_5086((double)var12, (double)var10, (double)var11);
                  }
               }

               ++var8;
            }

            if(var7 != null) {
               continue;
            }
         }

         return null;
      }
   }

   // $FF: renamed from: c (int, int, int, int, int, int) boolean
   private boolean method_10000(int var1, int var2, int var3, int var4, int var5, int var6) {
      String[] var7 = class_752.method_4253();
      int var10000 = ahb.method_2135(this.field_9431, var1, var2 - 1, var3);
      if(var7 != null) {
         if(var10000 == 0) {
            return false;
         }

         var10000 = var1 - var4 / 2;
      }

      int var8 = var10000;
      int var9 = var3 - var6 / 2;
      int var10 = var8;

      label68:
      while(true) {
         var10000 = var10;

         label65:
         while(true) {
            if(var10000 < var8 + var4) {
               var10000 = var2;
               if(var7 == null) {
                  break;
               }

               int var11 = var2;

               label57:
               while(true) {
                  var10000 = var11;

                  while(true) {
                     if(var10000 >= var2 + var5) {
                        break label57;
                     }

                     var10000 = var9;
                     if(var7 == null) {
                        continue label65;
                     }

                     int var12 = var9;

                     while(true) {
                        if(var12 < var9 + var6) {
                           label74: {
                              var10000 = this.field_9431.getBlock(var10, var11, var12).method_2433();
                              if(var7 == null) {
                                 break;
                              }

                              if(var7 != null) {
                                 if(var10000 == 0) {
                                    ++var12;
                                    if(var7 != null) {
                                       continue;
                                    }
                                    break label74;
                                 }

                                 var10000 = 0;
                              }

                              return (boolean)var10000;
                           }
                        }

                        ++var11;
                        if(var7 == null) {
                           break label57;
                        }
                        continue label57;
                     }
                  }
               }

               ++var10;
               if(var7 != null) {
                  continue label68;
               }
            }

            var10000 = 1;
            break;
         }

         return (boolean)var10000;
      }
   }

   // $FF: renamed from: a () void
   private void method_10001() {
      List var1 = this.field_9431.method_2157(class_765.class, class_1343.method_7093((double)(this.field_9434.field_8646 - this.field_9435), (double)(this.field_9434.field_8647 - 4), (double)(this.field_9434.field_8648 - this.field_9435), (double)(this.field_9434.field_8646 + this.field_9435), (double)(this.field_9434.field_8647 + 4), (double)(this.field_9434.field_8648 + this.field_9435)));
      this.field_9442 = var1.size();
   }

   // $FF: renamed from: b () void
   private void method_10002() {
      List var2 = this.field_9431.method_2157(class_768.class, class_1343.method_7093((double)(this.field_9434.field_8646 - this.field_9435), (double)(this.field_9434.field_8647 - 4), (double)(this.field_9434.field_8648 - this.field_9435), (double)(this.field_9434.field_8646 + this.field_9435), (double)(this.field_9434.field_8647 + 4), (double)(this.field_9434.field_8648 + this.field_9435)));
      String[] var1 = class_752.method_4253();
      this.field_9438 = var2.size();
      class_1849 var10000 = this;
      if(var1 != null) {
         if(this.field_9438 != 0) {
            return;
         }

         var10000 = this;
      }

      var10000.field_9440.clear();
   }

   // $FF: renamed from: c () vF
   public class_1661 method_10003() {
      return this.field_9434;
   }

   // $FF: renamed from: d () int
   public int method_10004() {
      return this.field_9435;
   }

   // $FF: renamed from: e () int
   public int method_10005() {
      return this.field_9432.size();
   }

   // $FF: renamed from: f () int
   public int method_10006() {
      return this.field_9437 - this.field_9436;
   }

   // $FF: renamed from: g () int
   public int method_10007() {
      return this.field_9438;
   }

   // $FF: renamed from: b (int, int, int) boolean
   public boolean method_10008(int var1, int var2, int var3) {
      String[] var4 = class_752.method_4253();
      float var5;
      int var10000 = (var5 = this.field_9434.method_9155(var1, var2, var3) - (float)(this.field_9435 * this.field_9435)) == 0.0F?0:(var5 < 0.0F?-1:1);
      if(var4 != null) {
         var10000 = var10000 < 0?1:0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: h () java.util.List
   public List method_10009() {
      return this.field_9432;
   }

   // $FF: renamed from: c (int, int, int) y_
   public class_1841 method_10010(int var1, int var2, int var3) {
      String[] var10000 = class_752.method_4253();
      class_1841 var5 = null;
      String[] var4 = var10000;
      int var6 = Integer.MAX_VALUE;
      Iterator var7 = this.field_9432.iterator();

      class_1841 var10;
      while(true) {
         if(var7.hasNext()) {
            class_1841 var8 = (class_1841)var7.next();
            var10 = var8;
            if(var4 == null) {
               break;
            }

            label21: {
               int var9 = var8.method_9959(var1, var2, var3);
               int var11 = var9;
               if(var4 != null) {
                  if(var9 >= var6) {
                     break label21;
                  }

                  var5 = var8;
                  var11 = var9;
               }

               var6 = var11;
            }

            if(var4 != null) {
               continue;
            }
         }

         var10 = var5;
         break;
      }

      return var10;
   }

   // $FF: renamed from: d (int, int, int) y_
   public class_1841 method_10011(int var1, int var2, int var3) {
      String[] var10000 = class_752.method_4253();
      class_1841 var5 = null;
      String[] var4 = var10000;
      int var6 = Integer.MAX_VALUE;
      Iterator var7 = this.field_9432.iterator();

      class_1841 var10;
      while(true) {
         if(var7.hasNext()) {
            class_1841 var8 = (class_1841)var7.next();
            var10 = var8;
            if(var4 == null) {
               break;
            }

            int var9;
            int var11;
            label33: {
               var9 = var8.method_9959(var1, var2, var3);
               var11 = var9;
               if(var4 != null) {
                  if(var9 > 256) {
                     var9 *= 1000;
                     if(var4 != null) {
                        break label33;
                     }
                  }

                  var11 = var8.method_9967();
               }

               var9 = var11;
            }

            label26: {
               var11 = var9;
               if(var4 != null) {
                  if(var9 >= var6) {
                     break label26;
                  }

                  var5 = var8;
                  var11 = var9;
               }

               var6 = var11;
            }

            if(var4 != null) {
               continue;
            }
         }

         var10 = var5;
         break;
      }

      return var10;
   }

   // $FF: renamed from: f (int, int, int) y_
   public class_1841 method_10012(int var1, int var2, int var3) {
      String[] var4 = class_752.method_4253();
      class_1849 var10000 = this;
      if(var4 != null) {
         if(this.field_9434.method_9155(var1, var2, var3) > (float)(this.field_9435 * this.field_9435)) {
            return null;
         }

         var10000 = this;
      }

      Iterator var5 = var10000.field_9432.iterator();

      while(var5.hasNext()) {
         class_1841 var6 = (class_1841)var5.next();
         int var7 = var6.field_9397;
         int var10001 = var1;
         if(var4 != null) {
            if(var6.field_9397 != var1) {
               continue;
            }

            var7 = var6.field_9399;
            var10001 = var3;
         }

         if(var4 != null) {
            if(var7 != var10001) {
               continue;
            }

            var7 = Math.abs(var6.field_9398 - var2);
            var10001 = 1;
         }

         if(var7 <= var10001) {
            return var6;
         }
      }

      return null;
   }

   // $FF: renamed from: b (y_) void
   public void method_10013(class_1841 var1) {
      this.field_9432.add(var1);
      this.field_9433.field_8646 += var1.field_9397;
      this.field_9433.field_8647 += var1.field_9398;
      this.field_9433.field_8648 += var1.field_9399;
      this.method_10021();
      this.field_9436 = var1.field_9402;
   }

   // $FF: renamed from: i () boolean
   public boolean method_10014() {
      return this.field_9432.isEmpty();
   }

   // $FF: renamed from: b (sv) void
   public void method_10015(class_752 var1) {
      String[] var10000 = class_752.method_4253();
      Iterator var3 = this.field_9441.iterator();
      String[] var2 = var10000;

      while(true) {
         if(!var3.hasNext()) {
            List var5 = this.field_9441;
            class_1850 var10001 = new class_1850;
            var10001.method_10031(this, var1, this.field_9437);
            var5.add(var10001);
            break;
         }

         class_1850 var4 = (class_1850)var3.next();
         if(var4.field_9445 == var1) {
            var4.field_9446 = this.field_9437;
            if(var2 != null) {
               return;
            }
            break;
         }
      }

   }

   // $FF: renamed from: c (sv) sv
   public class_752 method_10016(class_752 var1) {
      double var3 = Double.MAX_VALUE;
      String[] var10000 = class_752.method_4253();
      class_1850 var5 = null;
      String[] var2 = var10000;
      int var6 = 0;

      class_752 var11;
      while(true) {
         if(var6 < this.field_9441.size()) {
            class_1850 var7 = (class_1850)this.field_9441.get(var6);
            double var8 = var7.field_9445.method_3891(var1);
            if(var2 == null) {
               break;
            }

            if(var2 != null) {
               if(var8 <= var3) {
                  var5 = var7;
                  var3 = var8;
               }

               ++var6;
            }

            if(var2 != null) {
               continue;
            }
         }

         class_1850 var10 = var5;
         if(var2 != null) {
            if(var5 == null) {
               break;
            }

            var10 = var5;
         }

         var11 = var10.field_9445;
         return var11;
      }

      var11 = null;
      return var11;
   }

   // $FF: renamed from: d (sv) yz
   public class_792 method_10017(class_752 var1) {
      String[] var10000 = class_752.method_4253();
      double var3 = Double.MAX_VALUE;
      class_792 var5 = null;
      String[] var2 = var10000;
      Iterator var6 = this.field_9440.keySet().iterator();

      while(var6.hasNext()) {
         label43: {
            String var7 = (String)var6.next();
            class_1849 var11 = this;
            if(var2 != null) {
               if(!this.method_10024(var7)) {
                  break label43;
               }

               var11 = this;
            }

            class_792 var8 = var11.field_9431.method_2178(var7);
            class_792 var12 = var8;
            if(var2 != null) {
               if(var8 == null) {
                  break label43;
               }

               var12 = var8;
            }

            double var9 = var12.method_3891(var1);
            double var13 = var9;
            if(var2 != null) {
               if(var9 > var3) {
                  break label43;
               }

               var5 = var8;
               var13 = var9;
            }

            var3 = var13;
         }

         if(var2 == null) {
            break;
         }
      }

      return var5;
   }

   // $FF: renamed from: j () void
   private void method_10018() {
      String[] var10000 = class_752.method_4253();
      Iterator var2 = this.field_9441.iterator();
      String[] var1 = var10000;

      while(var2.hasNext()) {
         label23: {
            label22: {
               class_1850 var3 = (class_1850)var2.next();
               int var4 = var3.field_9445.method_3917();
               if(var1 != null) {
                  if(var4 == 0) {
                     break label22;
                  }

                  var4 = Math.abs(this.field_9437 - var3.field_9446);
               }

               if(var4 <= 300) {
                  break label23;
               }
            }

            var2.remove();
         }

         if(var1 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: k () void
   private void method_10019() {
      String[] var10000 = class_752.method_4253();
      int var2 = 0;
      String[] var1 = var10000;
      int var6 = this.field_9431.field_1819.nextInt(50);
      if(var1 != null) {
         var6 = var6 == 0?1:0;
      }

      int var3 = var6;
      Iterator var4 = this.field_9432.iterator();

      while(true) {
         if(var4.hasNext()) {
            class_1841 var5 = (class_1841)var4.next();
            var6 = var3;
            if(var1 == null) {
               break;
            }

            if(var1 != null) {
               if(var3 != 0) {
                  var5.method_9965();
               }

               var6 = this.method_10020(var5.field_9397, var5.field_9398, var5.field_9399);
            }

            label47: {
               if(var1 != null) {
                  label45: {
                     if(var6 != 0) {
                        var6 = Math.abs(this.field_9437 - var5.field_9402);
                        if(var1 == null) {
                           break label45;
                        }

                        if(var6 <= 1200) {
                           break label47;
                        }
                     }

                     this.field_9433.field_8646 -= var5.field_9397;
                     this.field_9433.field_8647 -= var5.field_9398;
                     this.field_9433.field_8648 -= var5.field_9399;
                     var6 = 1;
                  }
               }

               var2 = var6;
               var5.field_9403 = true;
               var4.remove();
            }

            if(var1 != null) {
               continue;
            }
         }

         var6 = var2;
         break;
      }

      if(var6 != 0) {
         this.method_10021();
      }

   }

   // $FF: renamed from: g (int, int, int) boolean
   private boolean method_10020(int var1, int var2, int var3) {
      return this.field_9431.getBlock(var1, var2, var3) == class_1192.field_6090;
   }

   // $FF: renamed from: l () void
   private void method_10021() {
      int var2 = this.field_9432.size();
      String[] var1 = class_752.method_4253();
      int var10000 = var2;
      if(var1 != null) {
         if(var2 == 0) {
            this.field_9434.method_9154(0, 0, 0);
            this.field_9435 = 0;
            if(var1 != null) {
               return;
            }
         }

         this.field_9434.method_9154(this.field_9433.field_8646 / var2, this.field_9433.field_8647 / var2, this.field_9433.field_8648 / var2);
         var10000 = 0;
      }

      int var3 = var10000;
      Iterator var5 = this.field_9432.iterator();

      while(true) {
         if(var5.hasNext()) {
            class_1841 var4 = (class_1841)var5.next();
            var3 = Math.max(var4.method_9959(this.field_9434.field_8646, this.field_9434.field_8647, this.field_9434.field_8648), var3);
            if(var1 == null) {
               break;
            }

            if(var1 != null) {
               continue;
            }
         }

         this.field_9435 = Math.max(32, (int)Math.sqrt((double)var3) + 1);
         break;
      }

   }

   // $FF: renamed from: b (java.lang.String) int
   public int method_10022(String var1) {
      String[] var10000 = class_752.method_4253();
      Integer var3 = (Integer)this.field_9440.get(var1);
      String[] var2 = var10000;
      Integer var4 = var3;
      int var5;
      if(var2 != null) {
         if(var3 == null) {
            var5 = 0;
            return var5;
         }

         var4 = var3;
      }

      var5 = var4.intValue();
      return var5;
   }

   // $FF: renamed from: b (java.lang.String, int) int
   public int method_10023(String var1, int var2) {
      int var3 = this.method_10022(var1);
      int var4 = class_1715.method_9568(var3 + var2, -30, 10);
      this.field_9440.put(var1, Integer.valueOf(var4));
      return var4;
   }

   // $FF: renamed from: c (java.lang.String) boolean
   public boolean method_10024(String var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = this.method_10022(var1);
      if(var2 != null) {
         var10000 = var10000 <= -15?1:0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: b (ro) void
   public void method_10025(class_1583 var1) {
      String[] var7 = field_9444;
      this.field_9438 = var1.method_8681("PopSize");
      this.field_9435 = var1.method_8681("Radius");
      String[] var10000 = class_752.method_4253();
      this.field_9442 = var1.method_8681("Golems");
      this.field_9436 = var1.method_8681("Stable");
      this.field_9437 = var1.method_8681("Tick");
      this.field_9439 = var1.method_8681("MTick");
      String[] var2 = var10000;
      this.field_9434.field_8646 = var1.method_8681("CX");
      this.field_9434.field_8647 = var1.method_8681("CY");
      this.field_9434.field_8648 = var1.method_8681("CZ");
      this.field_9433.field_8646 = var1.method_8681("ACX");
      this.field_9433.field_8647 = var1.method_8681("ACY");
      this.field_9433.field_8648 = var1.method_8681("ACZ");
      class_1580 var3 = var1.method_8689("Doors", 10);
      int var4 = 0;

      class_1583 var11;
      while(true) {
         if(var4 < var3.method_8658()) {
            var11 = var3.method_8653(var4);
            if(var2 == null) {
               break;
            }

            class_1583 var5 = var11;
            class_1841 var12 = new class_1841;
            int var10002 = var5.method_8681("X");
            int var10003 = var5.method_8681("Y");
            int var10004 = var5.method_8681("Z");
            var7 = field_9444;
            var12.method_9958(var10002, var10003, var10004, var5.method_8681("IDX"), var5.method_8681("IDZ"), var5.method_8681("TS"));
            class_1841 var6 = var12;
            this.field_9432.add(var6);
            ++var4;
            if(var2 != null) {
               continue;
            }
         }

         var11 = var1;
         break;
      }

      var7 = field_9444;
      class_1580 var8 = var11.method_8689("Players", 10);
      int var9 = 0;

      while(var9 < var8.method_8658()) {
         class_1583 var10 = var8.method_8653(var9);
         String[] var13 = field_9444;
         this.field_9440.put(var10.method_8685("Name"), Integer.valueOf(var10.method_8681("S")));
         ++var9;
         if(var2 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: c (ro) void
   public void method_10026(class_1583 var1) {
      String[] var9 = field_9444;
      var1.method_8667("PopSize", this.field_9438);
      var1.method_8667("Radius", this.field_9435);
      var1.method_8667("Golems", this.field_9442);
      String[] var10000 = class_752.method_4253();
      var1.method_8667("Stable", this.field_9436);
      var1.method_8667("Tick", this.field_9437);
      var1.method_8667("MTick", this.field_9439);
      var1.method_8667("CX", this.field_9434.field_8646);
      var1.method_8667("CY", this.field_9434.field_8647);
      var1.method_8667("CZ", this.field_9434.field_8648);
      var1.method_8667("ACX", this.field_9433.field_8646);
      var1.method_8667("ACY", this.field_9433.field_8647);
      var1.method_8667("ACZ", this.field_9433.field_8648);
      class_1580 var10001 = new class_1580;
      var10001.method_8628();
      class_1580 var3 = var10001;
      Iterator var4 = this.field_9432.iterator();
      String[] var2 = var10000;

      class_1583 var11;
      while(true) {
         if(var4.hasNext()) {
            class_1841 var5 = (class_1841)var4.next();
            var11 = new class_1583;
            var11.method_8628();
            class_1583 var6 = var11;
            var6.method_8667("X", var5.field_9397);
            var6.method_8667("Y", var5.field_9398);
            var6.method_8667("Z", var5.field_9399);
            var9 = field_9444;
            var6.method_8667("IDX", var5.field_9400);
            var6.method_8667("IDZ", var5.field_9401);
            var6.method_8667("TS", var5.field_9402);
            var3.method_8650(var6);
            if(var2 == null) {
               break;
            }

            if(var2 != null) {
               continue;
            }
         }

         var9 = field_9444;
         var1.method_8664("Doors", var3);
         break;
      }

      class_1580 var12 = new class_1580;
      var12.method_8628();
      class_1580 var10 = var12;
      Iterator var13 = this.field_9440.keySet().iterator();

      while(true) {
         if(var13.hasNext()) {
            String var7 = (String)var13.next();
            var11 = new class_1583;
            var11.method_8628();
            class_1583 var8 = var11;
            var9 = field_9444;
            var8.initGui1("Name", var7);
            var8.method_8667("S", ((Integer)this.field_9440.get(var7)).intValue());
            var10.method_8650(var8);
            if(var2 == null) {
               break;
            }

            if(var2 != null) {
               continue;
            }
         }

         String[] var14 = field_9444;
         var1.method_8664("Players", var10);
         break;
      }

   }

   // $FF: renamed from: m () void
   public void method_10027() {
      this.field_9439 = this.field_9437;
   }

   // $FF: renamed from: n () boolean
   public boolean method_10028() {
      String[] var1 = class_752.method_4253();
      int var10000 = this.field_9439;
      if(var1 != null) {
         if(this.field_9439 != 0) {
            var10000 = this.field_9437 - this.field_9439;
            if(var1 == null) {
               return (boolean)var10000;
            }

            if(var10000 < 3600) {
               var10000 = 0;
               return (boolean)var10000;
            }
         }

         var10000 = 1;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: c (int) void
   public void method_10029(int var1) {
      String[] var10000 = class_752.method_4253();
      Iterator var3 = this.field_9440.keySet().iterator();
      String[] var2 = var10000;

      while(var3.hasNext()) {
         String var4 = (String)var3.next();
         this.method_10023(var4, var1);
         if(var2 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: <clinit> () void
   static void method_10030() {
      // $FF: Couldn't be decompiled
   }
}
