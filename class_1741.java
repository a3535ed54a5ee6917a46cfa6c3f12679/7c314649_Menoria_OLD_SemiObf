import java.util.Iterator;
import java.util.List;
import java.util.Random;

// $FF: renamed from: yk
public class class_1741 extends class_1727 {

   // $FF: renamed from: a wK
   private class_769 field_9095;
   // $FF: renamed from: c ahb
   ahb field_9096;
   // $FF: renamed from: d wK
   private class_769 field_9097;
   // $FF: renamed from: e int
   int field_9098;
   // $FF: renamed from: f double
   double field_9099;
   // $FF: renamed from: g java.lang.String
   private static final String field_9100;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_9101;


   // $FF: renamed from: <init> (wK, double) void
   public void method_9681(class_769 var1, double var2) {
      super.method_9648();
      this.field_9095 = var1;
      this.field_9096 = var1.field_2990;
      this.field_9099 = var2;
      this.method_9655(3);
   }

   // $FF: renamed from: b () boolean
   public boolean method_9649() {
      String[] var1 = class_752.method_4253();
      class_769 var10000 = this.field_9095;
      if(var1 != null) {
         if(!this.field_9095.method_4381()) {
            return false;
         }

         this.field_9097 = this.method_9682();
         var10000 = this.field_9097;
      }

      return var10000 != null;
   }

   // $FF: renamed from: c () boolean
   public boolean method_9650() {
      int var10000;
      label32: {
         String[] var1 = class_752.method_4253();
         var10000 = this.field_9097.method_3917();
         if(var1 != null) {
            if(var10000 == 0) {
               break label32;
            }

            var10000 = this.field_9097.method_4381();
         }

         if(var1 != null) {
            if(var10000 == 0) {
               break label32;
            }

            var10000 = this.field_9098;
         }

         if(var1 == null) {
            return (boolean)var10000;
         }

         if(var10000 < 60) {
            var10000 = 1;
            return (boolean)var10000;
         }
      }

      var10000 = 0;
      return (boolean)var10000;
   }

   // $FF: renamed from: f () void
   public void method_9653() {
      this.field_9097 = null;
      this.field_9098 = 0;
   }

   // $FF: renamed from: g () void
   public void method_9654() {
      class_1741 var3;
      label24: {
         String[] var10000 = class_752.method_4253();
         this.field_9095.method_4254().method_9975(this.field_9097, 10.0F, (float)this.field_9095.method_4271());
         String[] var1 = var10000;
         this.field_9095.method_4257().method_9796(this.field_9097, this.field_9099);
         ++this.field_9098;
         int var2 = this.field_9098;
         if(var1 != null) {
            if(this.field_9098 < 60) {
               return;
            }

            var3 = this;
            if(var1 == null) {
               break label24;
            }

            double var4;
            var2 = (var4 = this.field_9095.method_3891(this.field_9097) - 9.0D) == 0.0D?0:(var4 < 0.0D?-1:1);
         }

         if(var2 >= 0) {
            return;
         }

         var3 = this;
      }

      var3.method_9683();
   }

   // $FF: renamed from: a () wK
   private class_769 method_9682() {
      float var2 = 8.0F;
      String[] var10000 = class_752.method_4253();
      List var3 = this.field_9096.method_2157(this.field_9095.getClass(), this.field_9095.field_3004.method_7097((double)var2, (double)var2, (double)var2));
      String[] var1 = var10000;
      double var4 = Double.MAX_VALUE;
      class_769 var6 = null;
      Iterator var7 = var3.iterator();

      class_769 var9;
      while(true) {
         if(var7.hasNext()) {
            class_769 var8 = (class_769)var7.next();
            var9 = this.field_9095;
            if(var1 == null) {
               break;
            }

            label30: {
               double var11;
               label40: {
                  int var10 = this.field_9095.method_4383(var8);
                  if(var1 != null) {
                     if(var10 == 0) {
                        break label30;
                     }

                     var11 = this.field_9095.method_3891(var8);
                     if(var1 == null) {
                        break label40;
                     }

                     double var12;
                     var10 = (var12 = var11 - var4) == 0.0D?0:(var12 < 0.0D?-1:1);
                  }

                  if(var10 >= 0) {
                     break label30;
                  }

                  var6 = var8;
                  var11 = this.field_9095.method_3891(var8);
               }

               var4 = var11;
            }

            if(var1 != null) {
               continue;
            }
         }

         var9 = var6;
         break;
      }

      return var9;
   }

   // $FF: renamed from: i () void
   private void method_9683() {
      class_767 var2 = this.field_9095.method_4353(this.field_9097);
      String[] var1 = class_752.method_4253();
      if(var2 != null) {
         class_792 var3 = this.field_9095.method_4380();
         class_792 var10000 = var3;
         if(var1 != null) {
            label56: {
               if(var3 == null) {
                  var10000 = this.field_9097.method_4380();
                  if(var1 == null) {
                     break label56;
                  }

                  if(var10000 != null) {
                     var3 = this.field_9097.method_4380();
                  }
               }

               var10000 = var3;
            }
         }

         label50: {
            label62: {
               if(var1 != null) {
                  if(var10000 == null) {
                     break label62;
                  }

                  var10000 = var3;
               }

               var10000.method_4614(class_1698.field_8903);
               boolean var14 = this.field_9095 instanceof class_773;
               if(var1 == null) {
                  break label50;
               }

               if(var14) {
                  var3.method_4614(class_1600.field_8358);
               }
            }

            this.field_9095.method_4356(6000);
            this.field_9097.method_4356(6000);
            this.field_9095.method_4382();
            this.field_9097.method_4382();
            var2.method_4356(-24000);
            var2.method_3887(this.field_9095.field_2994, this.field_9095.field_2995, this.field_9095.field_2996, 0.0F, 0.0F);
            this.field_9096.method_2089(var2);
         }

         Random var4 = this.field_9095.method_4165();
         int var5 = 0;

         while(true) {
            if(var5 < 7) {
               double var6 = var4.nextGaussian() * 0.02D;
               double var8 = var4.nextGaussian() * 0.02D;
               double var10 = var4.nextGaussian() * 0.02D;
               String[] var12 = field_9101;
               this.field_9096.method_2087("heart", this.field_9095.field_2994 + (double)(var4.nextFloat() * this.field_9095.field_3014 * 2.0F) - (double)this.field_9095.field_3014, this.field_9095.field_2995 + 0.5D + (double)(var4.nextFloat() * this.field_9095.field_3015), this.field_9095.field_2996 + (double)(var4.nextFloat() * this.field_9095.field_3014 * 2.0F) - (double)this.field_9095.field_3014, var6, var8, var10);
               ++var5;
               if(var1 == null) {
                  break;
               }

               if(var1 != null) {
                  continue;
               }
            }

            class_1038 var15 = this.field_9096.method_2196();
            String[] var10001 = field_9101;
            if(var1 != null && var15.method_5878("doMobLoot")) {
               ahb var16 = this.field_9096;
               class_715 var13 = new class_715;
               var13.method_4087(this.field_9096, this.field_9095.field_2994, this.field_9095.field_2995, this.field_9095.field_2996, var4.nextInt(7) + 1);
               var16.method_2089(var13);
            }
            break;
         }
      }

   }

   // $FF: renamed from: <clinit> () void
   static void method_9684() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "9©07Ct·Ê`NÿK\t5&Ë>";
      int var4 = "9©07Ct·Ê`NÿK\t5&Ë>".length();
      char var1 = 5;
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
            char[] var11 = var8;
            var8 = var10003;
            if(var10003 <= var6) {
               var5[var3++] = (new String((char[])var9)).intern();
               if((var0 += var1) >= var4) {
                  field_9101 = var5;
                  String[] var10 = field_9101;
                  field_9100 = "CL_00001578";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 51;
               break;
            case 1:
               var10009 = 25;
               break;
            case 2:
               var10009 = 170;
               break;
            case 3:
               var10009 = 17;
               break;
            case 4:
               var10009 = 38;
               break;
            case 5:
               var10009 = 229;
               break;
            default:
               var10009 = 152;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}
