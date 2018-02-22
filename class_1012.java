import java.util.ArrayList;

// $FF: renamed from: co
public class class_1012 implements class_19 {

   // $FF: renamed from: <init> () void
   public void method_5770() {
      super();
   }

   // $FF: renamed from: b (aO, ahb) boolean
   public boolean method_60(class_897 var1, ahb var2) {
      add var4 = null;
      String[] var10000 = class_752.method_4253();
      ArrayList var5 = new ArrayList();
      String[] var3 = var10000;
      int var6 = 0;

      add var9;
      while(true) {
         if(var6 < var1.method_83()) {
            add var7 = var1.method_84(var6);
            var9 = var7;
            if(var3 == null) {
               break;
            }

            label79: {
               if(var3 != null) {
                  if(var7 == null) {
                     break label79;
                  }

                  var9 = var7;
               }

               adb var10 = var9.method_3730();
               if(var3 != null) {
                  if(var10 instanceof class_525) {
                     label81: {
                        class_525 var8 = (class_525)var7.method_3730();
                        if(var8.method_2991() == class_131.field_306) {
                           var9 = var4;
                           if(var3 != null) {
                              if(var4 != null) {
                                 return false;
                              }

                              var9 = var7;
                           }

                           var4 = var9;
                           if(var3 != null) {
                              if(var3 != null) {
                                 break label79;
                              }
                              break label81;
                           }
                        }

                        return false;
                     }
                  }

                  var10 = var7.method_3730();
               }

               if(var10 == class_1010.field_5208) {
                  var5.add(var7);
                  if(var3 != null) {
                     break label79;
                  }
               }

               return false;
            }

            ++var6;
            if(var3 != null) {
               continue;
            }
         }

         var9 = var4;
         break;
      }

      boolean var11;
      if(var9 != null) {
         var11 = var5.isEmpty();
         if(var3 == null) {
            return var11;
         }

         if(!var11) {
            var11 = true;
            return var11;
         }
      }

      var11 = false;
      return var11;
   }

   // $FF: renamed from: b (aO) add
   public add method_61(class_897 var1) {
      String[] var10000 = class_752.method_4253();
      add var3 = null;
      int[] var4 = new int[3];
      int var5 = 0;
      String[] var2 = var10000;
      int var6 = 0;
      class_525 var7 = null;
      int var8 = 0;

      int var13;
      int var15;
      float var16;
      float var17;
      while(true) {
         if(var8 < var1.method_83()) {
            add var9 = var1.method_84(var8);
            if(var2 == null) {
               break;
            }

            label66: {
               label80: {
                  add var19 = var9;
                  if(var2 != null) {
                     if(var9 == null) {
                        break label80;
                     }

                     var19 = var9;
                  }

                  adb var20 = var19.method_3730();
                  if(var2 != null) {
                     if(var20 instanceof class_525) {
                        var19 = var9;
                        if(var2 != null) {
                           var7 = (class_525)var9.method_3730();
                           if(var7.method_2991() != class_131.field_306) {
                              return null;
                           }

                           var19 = var3;
                        }

                        if(var2 != null) {
                           if(var19 != null) {
                              return null;
                           }

                           var3 = var9.method_3754();
                           var19 = var3;
                        }

                        var19.field_2958 = 1;
                        if(var2 == null) {
                           break label66;
                        }

                        if(var7.method_2992(var9)) {
                           var15 = var7.method_2993(var3);
                           var16 = (float)(var15 >> 16 & 255) / 255.0F;
                           var17 = (float)(var15 >> 8 & 255) / 255.0F;
                           float var18 = (float)(var15 & 255) / 255.0F;
                           var5 = (int)((float)var5 + Math.max(var16, Math.max(var17, var18)) * 255.0F);
                           var4[0] = (int)((float)var4[0] + var16 * 255.0F);
                           var4[1] = (int)((float)var4[1] + var17 * 255.0F);
                           var4[2] = (int)((float)var4[2] + var18 * 255.0F);
                           ++var6;
                           if(var2 == null) {
                              return null;
                           }
                        }
                        break label80;
                     }

                     var20 = var9.method_3730();
                  }

                  if(var20 == class_1010.field_5208) {
                     float[] var10 = class_770.field_3491[class_438.method_2751(var9.method_3745())];
                     int var11 = (int)(var10[0] * 255.0F);
                     int var12 = (int)(var10[1] * 255.0F);
                     var13 = (int)(var10[2] * 255.0F);
                     var5 += Math.max(var11, Math.max(var12, var13));
                     var4[0] += var11;
                     var4[1] += var12;
                     var4[2] += var13;
                     ++var6;
                     if(var2 != null) {
                        break label80;
                     }
                  }

                  return null;
               }

               ++var8;
            }

            if(var2 != null) {
               continue;
            }
         }

         if(var7 == null) {
            return null;
         }

         var8 = var4[0] / var6;
         break;
      }

      int var14 = var4[1] / var6;
      var15 = var4[2] / var6;
      var16 = (float)var5 / (float)var6;
      var17 = (float)Math.max(var8, Math.max(var14, var15));
      var8 = (int)((float)var8 * var16 / var17);
      var14 = (int)((float)var14 * var16 / var17);
      var15 = (int)((float)var15 * var16 / var17);
      var13 = (var8 << 8) + var14;
      var13 = (var13 << 8) + var15;
      var7.method_2995(var3, var13);
      return var3;
   }

   // $FF: renamed from: b () int
   public int method_62() {
      return 10;
   }

   // $FF: renamed from: c () add
   public add method_63() {
      return null;
   }
}
