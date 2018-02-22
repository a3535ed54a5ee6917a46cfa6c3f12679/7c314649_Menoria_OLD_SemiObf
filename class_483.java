import java.util.Random;

// $FF: renamed from: eb
public class class_483 extends class_473 {

   // $FF: renamed from: M vL
   private class_73 field_2260;
   // $FF: renamed from: N vL
   private class_73 field_2261;
   // $FF: renamed from: O java.lang.String[]
   private static final String[] field_2262;


   // $FF: renamed from: <init> () void
   protected void method_2843() {
      super.method_2427(awt.field_4174);
      this.method_2443(0.0F, 0.0F, 0.0F, 1.0F, 0.75F, 1.0F);
      this.method_2429(0);
      this.method_2521(class_872.field_4245);
   }

   // $FF: renamed from: d () boolean
   public boolean method_2434() {
      return false;
   }

   // $FF: renamed from: b (ahb, int, int, int, java.util.Random) void
   public void method_2457(ahb var1, int var2, int var3, int var4, Random var5) {
      String[] var10000 = class_752.method_4253();
      super.method_2457(var1, var2, var3, var4, var5);
      String[] var6 = var10000;
      int var7 = var2 - 2;

      do {
         int var10 = var7;
         int var10001 = var2 + 2;

         label90:
         while(true) {
            if(var10 > var10001) {
               return;
            }

            int var8 = var4 - 2;

            while(true) {
               if(var8 > var4 + 2) {
                  break label90;
               }

               var10 = var7;
               if(var6 != null) {
                  label100: {
                     var10001 = var2 - 2;
                     if(var6 == null) {
                        break;
                     }

                     if(var7 > var10001) {
                        var10 = var7;
                        if(var6 == null) {
                           break label100;
                        }

                        if(var7 < var2 + 2) {
                           var10 = var8;
                           if(var6 == null) {
                              break label100;
                           }

                           if(var8 == var4 - 1) {
                              var8 = var4 + 2;
                           }
                        }
                     }

                     var10 = var5.nextInt(16);
                  }
               }

               label85: {
                  label101: {
                     if(var6 != null) {
                        if(var10 != 0) {
                           break label101;
                        }

                        var10 = var3;
                     }

                     int var9 = var10;

                     while(var9 <= var3 + 1) {
                        if(var6 == null) {
                           break label85;
                        }

                        label75: {
                           ahb var12;
                           label103: {
                              var12 = var1;
                              var10001 = var7;
                              int var10002 = var9;
                              int var10003 = var8;
                              if(var6 != null) {
                                 if(var1.getBlock(var7, var9, var8) != class_1192.field_6074) {
                                    break label75;
                                 }

                                 var12 = var1;
                                 if(var6 == null) {
                                    break label103;
                                 }

                                 var10001 = (var7 - var2) / 2 + var2;
                                 var10002 = var9;
                                 var10003 = (var8 - var4) / 2 + var4;
                              }

                              if(!var12.method_34(var10001, var10002, var10003)) {
                                 break;
                              }

                              var12 = var1;
                           }

                           String[] var11 = field_2262;
                           var12.method_2087("enchantmenttable", (double)var2 + 0.5D, (double)var3 + 2.0D, (double)var4 + 0.5D, (double)((float)(var7 - var2) + var5.nextFloat()) - 0.5D, (double)((float)(var9 - var3) - var5.nextFloat() - 1.0F), (double)((float)(var8 - var4) + var5.nextFloat()) - 0.5D);
                        }

                        ++var9;
                        if(var6 == null) {
                           break;
                        }
                     }
                  }

                  ++var8;
               }

               if(var6 == null) {
                  break label90;
               }
            }
         }

         ++var7;
      } while(var6 != null);

   }

   // $FF: renamed from: c () boolean
   public boolean method_2453() {
      return false;
   }

   // $FF: renamed from: a (int, int) vL
   public class_73 method_2448(int var1, int var2) {
      String[] var3 = class_752.method_4253();
      int var10000 = var1;
      if(var3 != null) {
         if(var1 == 0) {
            return this.field_2261;
         }

         var10000 = var1;
      }

      return var10000 == 1?this.field_2260:this.field_2010;
   }

   // $FF: renamed from: a (ahb, int) gi
   public class_580 method_124(ahb var1, int var2) {
      class_588 var10000 = new class_588;
      var10000.getBlock88();
      return var10000;
   }

   // $FF: renamed from: a (ahb, int, int, int, yz, int, float, float, float) boolean
   public boolean method_2481(ahb var1, int var2, int var3, int var4, class_792 var5, int var6, float var7, float var8, float var9) {
      String[] var10 = class_752.method_4253();
      ahb var10000 = var1;
      if(var10 != null) {
         if(var1.field_1832) {
            return true;
         }

         var10000 = var1;
      }

      String var12;
      label21: {
         class_588 var11 = (class_588)var10000.method_31(var2, var3, var4);
         class_588 var10004 = var11;
         if(var10 != null) {
            if(!var11.method_3153()) {
               var12 = null;
               break label21;
            }

            var10004 = var11;
         }

         var12 = var10004.method_3152();
      }

      var5.method_4579(var2, var3, var4, var12);
      return true;
   }

   // $FF: renamed from: a (ahb, int, int, int, sv, add) void
   public void method_2506(ahb var1, int var2, int var3, int var4, class_752 var5, add var6) {
      super.method_2506(var1, var2, var3, var4, var5, var6);
      if(var6.method_3773()) {
         ((class_588)var1.method_31(var2, var3, var4)).method_3154(var6.method_3770());
      }

   }

   // $FF: renamed from: a (vM) void
   public void method_2535(class_74 var1) {
      StringBuilder var10002 = (new StringBuilder()).append(this.method_2533()).append("_");
      String[] var2 = field_2262;
      this.field_2010 = var1.method_375(var10002.append("side").toString());
      this.field_2260 = var1.method_375(this.method_2533() + "_" + "top");
      this.field_2261 = var1.method_375(this.method_2533() + "_" + "bottom");
   }

   // $FF: renamed from: <clinit> () void
   static void method_2537() {
      // $FF: Couldn't be decompiled
   }
}
