import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Map.Entry;

// $FF: renamed from: g8
public class class_1054 extends class_1052 {

   // $FF: renamed from: g java.util.List
   private List field_5576;
   // $FF: renamed from: h boolean
   private boolean field_5577;
   // $FF: renamed from: i de[]
   private class_1035[] field_5578;
   // $FF: renamed from: j double
   private double field_5579;
   // $FF: renamed from: k int
   private int width0;
   // $FF: renamed from: l java.lang.String
   private static final String width1;
   // $FF: renamed from: m java.lang.String[]
   private static final String[] width2;


   // $FF: renamed from: <init> () void
   public void method_5960() {
      super.method_5960();
      this.field_5578 = new class_1035[3];
      this.field_5579 = 32.0D;
      this.width0 = 3;
      this.field_5576 = new ArrayList();
      class_985[] var2 = class_985.method_5724();
      int var3 = var2.length;
      String[] var1 = class_752.method_4253();
      int var4 = 0;

      while(var4 < var3) {
         class_985 var5 = var2[var4];
         if(var1 != null) {
            if(var5 != null && var1 != null && var5.field_5038 > 0.0F) {
               this.field_5576.add(var5);
            }

            ++var4;
         }

         if(var1 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: <init> (java.util.Map) void
   public void method_5977(Map var1) {
      this.method_5960();
      String[] var10000 = class_752.method_4253();
      Iterator var3 = var1.entrySet().iterator();
      String[] var2 = var10000;

      while(var3.hasNext()) {
         label41: {
            Entry var4 = (Entry)var3.next();
            String var6 = (String)var4.getKey();
            String[] var5 = width2;
            boolean var7 = var6.equals("distance");
            if(var2 != null) {
               if(var7) {
                  this.field_5579 = class_1715.method_9584((String)var4.getValue(), this.field_5579, 1.0D);
                  if(var2 != null) {
                     break label41;
                  }
               }

               var6 = (String)var4.getKey();
               var5 = width2;
               var7 = var6.equals("count");
            }

            if(var2 != null) {
               if(var7) {
                  this.field_5578 = new class_1035[class_1715.method_9582((String)var4.getValue(), this.field_5578.length, 1)];
                  if(var2 != null) {
                     break label41;
                  }
               }

               var6 = (String)var4.getKey();
               String[] var10001 = width2;
               var7 = var6.equals("spread");
            }

            if(var7) {
               this.width0 = class_1715.method_9582((String)var4.getValue(), this.width0, 1);
            }
         }

         if(var2 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: b () java.lang.String
   public String method_5963() {
      String[] var10000 = width2;
      return "Stronghold";
   }

   // $FF: renamed from: b (int, int) boolean
   protected boolean method_5972(int var1, int var2) {
      String[] var3 = class_752.method_4253();
      class_1054 var10000 = this;
      if(var3 != null) {
         if(!this.field_5577) {
            Random var4 = new Random();
            var4.setSeed(this.field_5566.method_2183());
            double var5 = var4.nextDouble() * 3.141592653589793D * 2.0D;
            int var7 = 1;
            int var8 = 0;

            while(true) {
               if(var8 < this.field_5578.length) {
                  double var9 = (1.25D * (double)var7 + var4.nextDouble()) * this.field_5579 * (double)var7;
                  int var11 = (int)Math.round(Math.cos(var5) * var9);
                  int var12 = (int)Math.round(Math.sin(var5) * var9);
                  class_1034 var13 = this.field_5566.method_2041().method_5544((var11 << 4) + 8, (var12 << 4) + 8, 112, this.field_5576, var4);
                  if(var3 == null) {
                     break;
                  }

                  if(var3 != null) {
                     if(var13 != null) {
                        var11 = var13.field_5472 >> 4;
                        var12 = var13.field_5474 >> 4;
                     }

                     class_1035[] var17 = this.field_5578;
                     class_1035 var10002 = new class_1035;
                     var10002.method_5856(var11, var12);
                     var17[var8] = var10002;
                     var5 += 6.283185307179586D * (double)var7 / (double)this.width0;
                  }

                  if(var3 != null) {
                     if(var8 == this.width0) {
                        var7 += 2 + var4.nextInt(5);
                        this.width0 += 1 + var4.nextInt(2);
                     }

                     ++var8;
                  }

                  if(var3 != null) {
                     continue;
                  }
               }

               this.field_5577 = true;
               break;
            }
         }

         var10000 = this;
      }

      class_1035[] var14 = var10000.field_5578;
      int var15 = var14.length;
      int var6 = 0;

      int var18;
      while(true) {
         if(var6 < var15) {
            class_1035 var16 = var14[var6];
            if(var3 != null) {
               var18 = var1;
               if(var3 == null) {
                  break;
               }

               if(var1 == var16.field_5475) {
                  label44: {
                     var18 = var2;
                     if(var3 != null) {
                        if(var2 != var16.field_5476) {
                           break label44;
                        }

                        var18 = 1;
                     }

                     return (boolean)var18;
                  }
               }

               ++var6;
            }

            if(var3 != null) {
               continue;
            }
         }

         var18 = 0;
         break;
      }

      return (boolean)var18;
   }

   // $FF: renamed from: c () java.util.List
   protected List method_5969() {
      String[] var10000 = class_752.method_4253();
      ArrayList var2 = new ArrayList();
      class_1035[] var3 = this.field_5578;
      int var4 = var3.length;
      int var5 = 0;
      String[] var1 = var10000;

      while(var5 < var4) {
         class_1035 var6 = var3[var5];
         if(var1 != null) {
            if(var6 != null) {
               var2.add(var6.method_5860(64));
            }

            ++var5;
         }

         if(var1 == null) {
            break;
         }
      }

      return var2;
   }

   // $FF: renamed from: c (int, int) i2
   protected class_1199 method_5973(int var1, int var2) {
      String[] var10000 = class_752.method_4253();
      class_1201 var10001 = new class_1201;
      var10001.method_6465(this.field_5566, this.field_5565, var1, var2);
      class_1201 var4 = var10001;
      String[] var3 = var10000;

      class_1201 var5;
      do {
         label23: {
            if(!var4.method_6451().isEmpty()) {
               var5 = var4;
               if(var3 == null) {
                  break label23;
               }

               if(var3 == null) {
                  return var5;
               }

               if(((class_1138)var4.method_6451().get(0)).field_5876 != null) {
                  break;
               }
            }

            var5 = new class_1201;
            var5.method_6465(this.field_5566, this.field_5565, var1, var2);
         }

         var4 = var5;
      } while(var3 != null);

      var5 = var4;
      return var5;
   }

   // $FF: renamed from: <clinit> () void
   static void method_5975() {
      // $FF: Couldn't be decompiled
   }
}
