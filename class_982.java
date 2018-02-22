import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// $FF: renamed from: c_
public abstract class class_982 {

   // $FF: renamed from: a int
   public int field_4953;
   // $FF: renamed from: b java.lang.String
   private String field_4954;
   // $FF: renamed from: c java.util.List
   private List field_4955;
   // $FF: renamed from: d vB
   private class_1654 field_4956;
   // $FF: renamed from: e double
   public double field_4957;
   // $FF: renamed from: f double
   public double field_4958;
   // $FF: renamed from: h int
   private int field_4959;
   // $FF: renamed from: i int
   private int field_4960;
   // $FF: renamed from: j int
   private int field_4961;
   // $FF: renamed from: k sa
   private class_689 field_4962;
   // $FF: renamed from: l int
   private int field_4963;
   // $FF: renamed from: m int
   private int field_4964;
   // $FF: renamed from: n int
   private int field_4965;
   // $FF: renamed from: o java.lang.String
   private static final String field_4966;
   // $FF: renamed from: p java.lang.String[]
   private static final String[] field_4967;


   // $FF: renamed from: <init> () void
   public void method_5670() {
      super();
      this.field_4953 = 20;
      String[] var10001 = field_4967;
      this.field_4954 = "Pig";
      this.field_4959 = 200;
      this.field_4960 = 800;
      this.field_4961 = 4;
      this.field_4963 = 6;
      this.field_4964 = 16;
      this.field_4965 = 4;
   }

   // $FF: renamed from: a () java.lang.String
   public String method_5671() {
      String[] var1 = class_752.method_4253();
      class_1654 var10000 = this.method_5681();
      if(var1 != null) {
         if(var10000 == null) {
            String var3 = this.field_4954;
            if(var1 != null) {
               String[] var2 = field_4967;
               if(this.field_4954.equals("Minecart")) {
                  this.field_4954 = "MinecartRideable";
               }

               var3 = this.field_4954;
            }

            return var3;
         }

         var10000 = this.method_5681();
      }

      return var10000.field_8610;
   }

   // $FF: renamed from: b (java.lang.String) void
   public void method_5672(String var1) {
      this.field_4954 = var1;
   }

   // $FF: renamed from: b () boolean
   public boolean method_5673() {
      return this.method_5684().method_2175((double)this.method_5685() + 0.5D, (double)this.method_5686() + 0.5D, (double)this.method_5687() + 0.5D, (double)this.field_4964) != null;
   }

   // $FF: renamed from: c () void
   public void method_5674() {
      String[] var1 = class_752.method_4253();
      int var10000 = this.method_5673();
      if(var1 != null) {
         if(var10000 == 0) {
            return;
         }

         var10000 = this.method_5684().field_1832;
      }

      double var2;
      if(var1 != null) {
         if(var10000 != 0) {
            double var4 = (double)((float)this.method_5685() + this.method_5684().field_1819.nextFloat());
            double var6 = (double)((float)this.method_5686() + this.method_5684().field_1819.nextFloat());
            var2 = (double)((float)this.method_5687() + this.method_5684().field_1819.nextFloat());
            ahb var18 = this.method_5684();
            String[] var13 = field_4967;
            var18.method_2087("smoke", var4, var6, var2, 0.0D, 0.0D, 0.0D);
            this.method_5684().method_2087("flame", var4, var6, var2, 0.0D, 0.0D, 0.0D);
            class_982 var19 = this;
            if(var1 != null) {
               if(this.field_4953 > 0) {
                  --this.field_4953;
               }

               this.field_4958 = this.field_4957;
               var19 = this;
            }

            var19.field_4957 = (this.field_4957 + (double)(1000.0F / ((float)this.field_4953 + 200.0F))) % 360.0D;
            if(var1 != null) {
               return;
            }
         }

         var10000 = this.field_4953;
      }

      if(var1 != null) {
         if(var10000 == -1) {
            this.method_5676();
         }

         var10000 = this.field_4953;
      }

      if(var1 != null) {
         if(var10000 > 0) {
            --this.field_4953;
            return;
         }

         var10000 = 0;
      }

      int var16 = var10000;
      int var5 = 0;

      while(true) {
         if(var5 < this.field_4961) {
            class_689 var17 = class_1775.method_9754(this.method_5671(), this.method_5684());
            if(var1 == null) {
               break;
            }

            if(var17 == null) {
               return;
            }

            int var7 = this.method_5684().method_2157(var17.getClass(), class_1343.method_7093((double)this.method_5685(), (double)this.method_5686(), (double)this.method_5687(), (double)(this.method_5685() + 1), (double)(this.method_5686() + 1), (double)(this.method_5687() + 1)).method_7097((double)(this.field_4965 * 2), 4.0D, (double)(this.field_4965 * 2))).size();
            var10000 = var7;
            if(var1 != null) {
               if(var7 >= this.field_4963) {
                  this.method_5676();
                  return;
               }

               var10000 = this.method_5685();
            }

            double var8;
            double var10;
            class_753 var15;
            label85: {
               var2 = (double)var10000 + (this.method_5684().field_1819.nextDouble() - this.method_5684().field_1819.nextDouble()) * (double)this.field_4965;
               var8 = (double)(this.method_5686() + this.method_5684().field_1819.nextInt(3) - 1);
               var10 = (double)this.method_5687() + (this.method_5684().field_1819.nextDouble() - this.method_5684().field_1819.nextDouble()) * (double)this.field_4965;
               class_689 var14 = var17;
               if(var1 != null) {
                  if(!(var17 instanceof class_753)) {
                     var15 = null;
                     break label85;
                  }

                  var14 = var17;
               }

               var15 = (class_753)var14;
            }

            label114: {
               class_753 var12 = var15;
               var17.method_3887(var2, var8, var10, this.method_5684().field_1819.nextFloat() * 360.0F, 0.0F);
               var15 = var12;
               if(var1 != null) {
                  label78: {
                     if(var12 != null) {
                        var15 = var12;
                        if(var1 == null) {
                           break label78;
                        }

                        if(!var12.method_4274()) {
                           break label114;
                        }
                     }

                     this.method_5675(var17);
                     this.method_5684().method_2210(2004, this.method_5685(), this.method_5686(), this.method_5687(), 0);
                     var15 = var12;
                  }
               }

               label70: {
                  if(var1 != null) {
                     if(var15 == null) {
                        break label70;
                     }

                     var15 = var12;
                  }

                  var15.method_4265();
               }

               var16 = 1;
            }

            ++var5;
            if(var1 != null) {
               continue;
            }
         }

         if(var16 != 0) {
            this.method_5676();
         }
         break;
      }

   }

   // $FF: renamed from: b (sa) sa
   public class_689 method_5675(class_689 var1) {
      class_689 var14;
      label91: {
         String[] var2 = class_752.method_4253();
         if(this.method_5681() != null) {
            class_1583 var10000 = new class_1583;
            var10000.method_8628();
            class_1583 var3 = var10000;
            var1.method_3903(var3);
            Iterator var4 = this.method_5681().field_8609.method_8663().iterator();

            while(true) {
               if(var4.hasNext()) {
                  String var5 = (String)var4.next();
                  class_1571 var6 = this.method_5681().field_8609.initGui5(var5);
                  var3.method_8664(var5, var6.method_8633());
                  if(var2 == null) {
                     break;
                  }

                  if(var2 != null) {
                     continue;
                  }
               }

               var1.method_3905(var3);
               break;
            }

            var14 = var1;
            if(var2 != null) {
               if(var1.field_2990 != null) {
                  var1.field_2990.method_2089(var1);
               }

               var14 = var1;
            }

            class_689 var15 = var14;

            do {
               String[] var12 = field_4967;
               if(!var3.initGui8("Riding", 10)) {
                  break;
               }

               class_1583 var13 = var3.method_8688("Riding");
               class_689 var7 = class_1775.method_9754(var13.method_8685("id"), var1.field_2990);
               var14 = var7;
               if(var2 == null) {
                  return var14;
               }

               if(var2 != null) {
                  if(var7 != null) {
                     var10000 = new class_1583;
                     var10000.method_8628();
                     class_1583 var8 = var10000;
                     var7.method_3903(var8);
                     Iterator var9 = var13.method_8663().iterator();

                     while(true) {
                        if(var9.hasNext()) {
                           String var10 = (String)var9.next();
                           class_1571 var11 = var13.initGui5(var10);
                           var8.method_8664(var10, var11.method_8633());
                           if(var2 == null) {
                              break;
                           }

                           if(var2 != null) {
                              continue;
                           }
                        }

                        var7.method_3905(var8);
                        var7.method_3887(var15.field_2994, var15.field_2995, var15.field_2996, var15.field_3000, var15.field_3001);
                        break;
                     }

                     var14 = var1;
                     if(var2 != null) {
                        if(var1.field_2990 != null) {
                           var1.field_2990.method_2089(var7);
                        }

                        var14 = var15;
                     }

                     var14.method_3925(var7);
                  }

                  var14 = var7;
               }

               var15 = var14;
               var3 = var13;
            } while(var2 != null);

            if(var2 != null) {
               break label91;
            }
         }

         var14 = var1;
         if(var2 == null) {
            return var14;
         }

         if(var1 instanceof class_752) {
            var14 = var1;
            if(var2 == null) {
               return var14;
            }

            if(var1.field_2990 != null) {
               ((class_753)var1).method_4282((class_83)null);
               this.method_5684().method_2089(var1);
            }
         }
      }

      var14 = var1;
      return var14;
   }

   // $FF: renamed from: d () void
   private void method_5676() {
      String[] var1;
      label29: {
         var1 = class_752.method_4253();
         int var10000 = this.field_4960;
         int var10001 = this.field_4959;
         if(var1 != null) {
            if(this.field_4960 <= this.field_4959) {
               this.field_4953 = this.field_4959;
               if(var1 != null) {
                  break label29;
               }
            }

            var10000 = this.field_4960;
            var10001 = this.field_4959;
         }

         int var2 = var10000 - var10001;
         this.field_4953 = this.field_4959 + this.method_5684().field_1819.nextInt(var2);
      }

      class_982 var3 = this;
      if(var1 != null) {
         label21: {
            if(this.field_4955 != null) {
               var3 = this;
               if(var1 == null) {
                  break label21;
               }

               if(this.field_4955.size() > 0) {
                  this.method_5682((class_1654)class_1725.method_9638(this.method_5684().field_1819, this.field_4955));
               }
            }

            var3 = this;
         }
      }

      var3.method_5683(1);
   }

   // $FF: renamed from: b (ro) void
   public void method_5677(class_1583 var1) {
      String[] var2;
      String[] var5;
      class_982 var6;
      class_1654 var10001;
      label75: {
         String[] var10000 = class_752.method_4253();
         var5 = field_4967;
         this.field_4954 = var1.method_8685("EntityId");
         var2 = var10000;
         var6 = this;
         if(var2 != null) {
            this.field_4953 = var1.method_8680("Delay");
            if(var1.initGui8("SpawnPotentials", 9)) {
               this.field_4955 = new ArrayList();
               class_1580 var3 = var1.method_8689("SpawnPotentials", 10);
               int var4 = 0;

               while(var4 < var3.method_8658()) {
                  List var7 = this.field_4955;
                  var10001 = new class_1654;
                  var10001.method_9100(this, var3.method_8653(var4));
                  var7.add(var10001);
                  ++var4;
                  if(var2 == null) {
                     break label75;
                  }

                  if(var2 == null) {
                     break;
                  }
               }

               if(var2 != null) {
                  break label75;
               }
            }

            var6 = this;
         }

         var6.field_4955 = null;
      }

      label59: {
         var5 = field_4967;
         if(var1.initGui8("SpawnData", 10)) {
            var10001 = new class_1654;
            var10001.method_9101(this, var1.method_8688("SpawnData"), this.field_4954);
            this.method_5682(var10001);
            if(var2 != null) {
               break label59;
            }
         }

         this.method_5682((class_1654)null);
      }

      var5 = field_4967;
      boolean var8 = var1.initGui8("MinSpawnDelay", 99);
      if(var2 != null) {
         if(var8) {
            this.field_4959 = var1.method_8680("MinSpawnDelay");
            this.field_4960 = var1.method_8680("MaxSpawnDelay");
            this.field_4961 = var1.method_8680("SpawnCount");
         }

         var5 = field_4967;
         var8 = var1.initGui8("MaxNearbyEntities", 99);
      }

      if(var2 != null) {
         if(var8) {
            var5 = field_4967;
            this.field_4963 = var1.method_8680("MaxNearbyEntities");
            this.field_4964 = var1.method_8680("RequiredPlayerRange");
         }

         var5 = field_4967;
         var8 = var1.initGui8("SpawnRange", 99);
      }

      if(var8) {
         String[] var10002 = field_4967;
         this.field_4965 = var1.method_8680("SpawnRange");
      }

      label80: {
         ahb var9 = this.method_5684();
         if(var2 != null) {
            if(var9 == null) {
               return;
            }

            var6 = this;
            if(var2 == null) {
               break label80;
            }

            var9 = this.method_5684();
         }

         if(!var9.field_1832) {
            return;
         }

         var6 = this;
      }

      var6.field_4962 = null;
   }

   // $FF: renamed from: c (ro) void
   public void method_5678(class_1583 var1) {
      String[] var2;
      List var9;
      label72: {
         class_982 var8;
         label73: {
            String[] var6 = field_4967;
            var1.initGui1("EntityId", this.method_5671());
            var1.method_8666("Delay", (short)this.field_4953);
            var1.method_8666("MinSpawnDelay", (short)this.field_4959);
            var1.method_8666("MaxSpawnDelay", (short)this.field_4960);
            String[] var10000 = class_752.method_4253();
            var1.method_8666("SpawnCount", (short)this.field_4961);
            var1.method_8666("MaxNearbyEntities", (short)this.field_4963);
            var1.method_8666("RequiredPlayerRange", (short)this.field_4964);
            var2 = var10000;
            var1.method_8666("SpawnRange", (short)this.field_4965);
            class_1654 var7 = this.method_5681();
            if(var2 != null) {
               if(var7 != null) {
                  var1.method_8664("SpawnData", this.method_5681().field_8609.method_8633());
               }

               var8 = this;
               if(var2 == null) {
                  break label73;
               }

               var7 = this.method_5681();
            }

            if(var7 != null) {
               break label72;
            }

            var8 = this;
         }

         var9 = var8.field_4955;
         if(var2 != null) {
            if(var9 == null) {
               return;
            }

            var9 = this.field_4955;
         }

         if(var9.size() <= 0) {
            return;
         }
      }

      class_1580 var3;
      label51: {
         label75: {
            class_1580 var10 = new class_1580;
            var10.method_8628();
            var3 = var10;
            var9 = this.field_4955;
            if(var2 != null) {
               if(this.field_4955 == null) {
                  break label75;
               }

               var9 = this.field_4955;
            }

            if(var2 != null) {
               if(var9.size() <= 0) {
                  break label75;
               }

               var9 = this.field_4955;
            }

            Iterator var4 = var9.iterator();

            while(var4.hasNext()) {
               class_1654 var5 = (class_1654)var4.next();
               var3.method_8650(var5.method_9102());
               if(var2 == null) {
                  break label51;
               }

               if(var2 == null) {
                  break;
               }
            }

            if(var2 != null) {
               break label51;
            }
         }

         var3.method_8650(this.method_5681().method_9102());
      }

      String[] var10001 = field_4967;
      var1.method_8664("SpawnPotentials", var3);
   }

   // $FF: renamed from: e () sa
   public class_689 method_5679() {
      String[] var1 = class_752.method_4253();
      class_689 var10000 = this.field_4962;
      if(var1 != null) {
         if(this.field_4962 == null) {
            class_689 var2 = class_1775.method_9754(this.method_5671(), (ahb)null);
            var2 = this.method_5675(var2);
            this.field_4962 = var2;
         }

         var10000 = this.field_4962;
      }

      return var10000;
   }

   // $FF: renamed from: a (int) boolean
   public boolean method_5680(int var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = var1;
      if(var2 != null) {
         if(var1 == 1) {
            var10000 = this.method_5684().field_1832;
            if(var2 == null) {
               return (boolean)var10000;
            }

            if(var10000 != 0) {
               this.field_4953 = this.field_4959;
               return true;
            }
         }

         var10000 = 0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: f () vB
   public class_1654 method_5681() {
      return this.field_4956;
   }

   // $FF: renamed from: b (vB) void
   public void method_5682(class_1654 var1) {
      this.field_4956 = var1;
   }

   // $FF: renamed from: b (int) void
   public abstract void method_5683(int var1);

   // $FF: renamed from: g () ahb
   public abstract ahb method_5684();

   // $FF: renamed from: h () int
   public abstract int method_5685();

   // $FF: renamed from: i () int
   public abstract int method_5686();

   // $FF: renamed from: j () int
   public abstract int method_5687();

   // $FF: renamed from: <clinit> () void
   static void method_5688() {
      // $FF: Couldn't be decompiled
   }
}
