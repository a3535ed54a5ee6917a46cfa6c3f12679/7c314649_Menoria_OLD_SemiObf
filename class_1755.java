import java.util.Iterator;
import java.util.List;

// $FF: renamed from: yK
public class class_1755 extends class_1727 {

   // $FF: renamed from: c wU
   private class_768 field_9169;
   // $FF: renamed from: d sv
   private class_752 field_9170;
   // $FF: renamed from: e double
   private double field_9171;
   // $FF: renamed from: f int
   private int field_9172;
   // $FF: renamed from: g java.lang.String
   private static final String field_9173 = "CL_00001605";


   // $FF: renamed from: <init> (wU, double) void
   public void method_9708(class_768 var1, double var2) {
      super.method_9648();
      this.field_9169 = var1;
      this.field_9171 = var2;
      this.method_9655(1);
   }

   // $FF: renamed from: b () boolean
   public boolean method_9649() {
      String[] var1;
      class_768 var12;
      int var10000;
      label87: {
         var1 = class_752.method_4253();
         var10000 = this.field_9169.method_4354();
         if(var1 != null) {
            if(var10000 >= 0) {
               return false;
            }

            var12 = this.field_9169;
            if(var1 == null) {
               break label87;
            }

            var10000 = this.field_9169.method_4165().nextInt(400);
         }

         if(var10000 != 0) {
            return false;
         }

         var12 = this.field_9169;
      }

      List var2 = var12.field_2990.method_2157(class_768.class, this.field_9169.field_3004.method_7097(6.0D, 3.0D, 6.0D));
      double var3 = Double.MAX_VALUE;
      Iterator var5 = var2.iterator();

      class_1755 var10;
      label89: {
         Object var13;
         while(true) {
            if(var5.hasNext()) {
               class_768 var6 = (class_768)var5.next();
               var13 = var6;
               if(var1 == null) {
                  break;
               }

               label92: {
                  if(var1 != null) {
                     if(var6 == this.field_9169) {
                        break label92;
                     }

                     var13 = var6;
                  }

                  label93: {
                     var10000 = ((class_768)var13).method_4365();
                     if(var1 != null) {
                        if(var10000 != 0) {
                           break label92;
                        }

                        var12 = var6;
                        if(var1 == null) {
                           break label93;
                        }

                        var10000 = var6.method_4354();
                     }

                     if(var10000 >= 0) {
                        break label92;
                     }

                     var12 = var6;
                  }

                  double var7 = var12.method_3891(this.field_9169);
                  double var9 = var7;
                  if(var1 != null) {
                     if(var7 > var3) {
                        break label92;
                     }

                     var9 = var7;
                  }

                  var3 = var9;
                  this.field_9170 = var6;
               }

               if(var1 != null) {
                  continue;
               }
            }

            var10 = this;
            if(var1 == null) {
               break label89;
            }

            var13 = this.field_9170;
            break;
         }

         if(var13 != null) {
            return true;
         }

         var10 = this;
      }

      azw var11 = class_1787.method_9818(var10.field_9169, 16, 3);
      if(var11 == null) {
         return false;
      } else {
         return true;
      }
   }

   // $FF: renamed from: c () boolean
   public boolean method_9650() {
      String[] var1 = class_752.method_4253();
      int var10000 = this.field_9172;
      if(var1 != null) {
         var10000 = this.field_9172 > 0?1:0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: e () void
   public void method_9652() {
      String[] var1 = class_752.method_4253();
      class_1755 var10000 = this;
      if(var1 != null) {
         if(this.field_9170 != null) {
            this.field_9169.method_4364(true);
         }

         var10000 = this;
      }

      var10000.field_9172 = 1000;
   }

   // $FF: renamed from: f () void
   public void method_9653() {
      this.field_9169.method_4364(false);
      this.field_9170 = null;
   }

   // $FF: renamed from: g () void
   public void method_9654() {
      String[] var10000 = class_752.method_4253();
      --this.field_9172;
      String[] var1 = var10000;
      class_1755 var3 = this;
      if(var1 != null) {
         if(this.field_9170 != null) {
            double var6;
            int var4 = (var6 = this.field_9169.method_3891(this.field_9170) - 4.0D) == 0.0D?0:(var6 < 0.0D?-1:1);
            if(var1 != null) {
               if(var4 <= 0) {
                  return;
               }

               this.field_9169.method_4257().method_9796(this.field_9170, this.field_9171);
            }

            if(var1 != null) {
               return;
            }
         }

         var3 = this;
      }

      class_768 var5 = var3.field_9169;
      if(var1 != null) {
         if(!var5.method_4257().method_9801()) {
            return;
         }

         var5 = this.field_9169;
      }

      azw var2 = class_1787.method_9818(var5, 16, 3);
      if(var2 != null) {
         this.field_9169.method_4257().method_9794(var2.field_4220, var2.field_4221, var2.field_4222, this.field_9171);
      }
   }

   // $FF: renamed from: <clinit> () void
   static void method_9709() {
      boolean var10000 = true;
      char[] var10003 = "ÛgG;©ü\b".toCharArray();
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
            field_9173 = (new String((char[])var4)).intern();
            String var2 = field_9173;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 137;
            break;
         case 1:
            var10009 = 219;
            break;
         case 2:
            var10009 = 41;
            break;
         case 3:
            var10009 = 161;
            break;
         case 4:
            var10009 = 55;
            break;
         case 5:
            var10009 = 102;
            break;
         default:
            var10009 = 26;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
