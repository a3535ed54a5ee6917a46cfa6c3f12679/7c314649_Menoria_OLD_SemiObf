
// $FF: renamed from: jt
public class class_1272 extends class_1265 {

   // $FF: renamed from: f dz[]
   private class_985[] field_6581;
   // $FF: renamed from: g dz[]
   private class_985[] field_6582;
   // $FF: renamed from: h dz[]
   private class_985[] field_6583;
   // $FF: renamed from: i dz[]
   private class_985[] field_6584;


   // $FF: renamed from: <init> (long, jm, du) void
   public void method_6692(long var1, class_1265 var3, class_1046 var4) {
      super.method_6675(var1);
      String[] var10000 = class_752.method_4253();
      this.field_6581 = new class_985[]{class_985.field_4990, class_985.field_4990, class_985.field_4990, class_985.field_5023, class_985.field_5023, class_985.field_4989};
      this.field_6582 = new class_985[]{class_985.field_4992, class_985.field_5017, class_985.field_4991, class_985.field_4989, class_985.field_5015, class_985.field_4994};
      this.field_6583 = new class_985[]{class_985.field_4992, class_985.field_4991, class_985.field_4993, class_985.field_4989};
      String[] var5 = var10000;
      this.field_6584 = new class_985[]{class_985.field_5000, class_985.field_5000, class_985.field_5000, class_985.field_5018};
      class_1272 var6 = this;
      if(var5 != null) {
         this.field_6573 = var3;
         if(var4 != class_1046.field_5531) {
            return;
         }

         var6 = this;
      }

      var6.field_6581 = new class_985[]{class_985.field_4990, class_985.field_4992, class_985.field_4991, class_985.field_4994, class_985.field_4989, class_985.field_4993};
   }

   // $FF: renamed from: b (int, int, int, int) int[]
   public int[] method_6679(int var1, int var2, int var3, int var4) {
      String[] var10000 = class_752.method_4253();
      int[] var6 = this.field_6573.method_6679(var1, var2, var3, var4);
      int[] var7 = class_1323.method_6956(var3 * var4);
      String[] var5 = var10000;
      int var8 = 0;

      do {
         int var12 = var8;

         label110:
         while(true) {
            if(var12 >= var4) {
               return var7;
            }

            int var9 = 0;

            while(true) {
               if(var9 >= var3) {
                  break label110;
               }

               this.method_6677((long)(var9 + var1), (long)(var8 + var2));
               int var10 = var6[var9 + var8 * var3];
               int var11 = (var10 & 3840) >> 8;
               var10 &= -3841;
               var12 = method_6681(var10);
               if(var5 == null) {
                  break;
               }

               label120: {
                  if(var5 != null) {
                     if(var12 != 0) {
                        var7[var9 + var8 * var3] = var10;
                        if(var5 != null) {
                           break label120;
                        }
                     }

                     var12 = var10;
                  }

                  int var10001 = class_985.field_5002.field_5050;
                  if(var5 != null) {
                     if(var12 == class_985.field_5002.field_5050) {
                        var7[var9 + var8 * var3] = var10;
                        if(var5 != null) {
                           break label120;
                        }
                     }

                     var12 = var10;
                     var10001 = 1;
                  }

                  if(var5 != null) {
                     if(var12 == var10001) {
                        label121: {
                           var12 = var11;
                           if(var5 != null) {
                              if(var11 <= 0) {
                                 break label121;
                              }

                              var12 = this.method_6678(3);
                           }

                           if(var12 == 0) {
                              var7[var9 + var8 * var3] = class_985.field_5027.field_5050;
                              if(var5 != null) {
                                 break label120;
                              }
                           }

                           var7[var9 + var8 * var3] = class_985.field_5026.field_5050;
                           if(var5 != null) {
                              break label120;
                           }
                        }

                        var7[var9 + var8 * var3] = this.field_6581[this.method_6678(this.field_6581.length)].field_5050;
                        if(var5 != null) {
                           break label120;
                        }
                     }

                     var12 = var10;
                     var10001 = 2;
                  }

                  if(var5 != null) {
                     if(var12 == var10001) {
                        if(var11 > 0) {
                           var7[var9 + var8 * var3] = class_985.field_5009.field_5050;
                           if(var5 != null) {
                              break label120;
                           }
                        }

                        var7[var9 + var8 * var3] = this.field_6582[this.method_6678(this.field_6582.length)].field_5050;
                        if(var5 != null) {
                           break label120;
                        }
                     }

                     var12 = var10;
                     var10001 = 3;
                  }

                  if(var5 != null) {
                     if(var12 == var10001) {
                        if(var11 > 0) {
                           var7[var9 + var8 * var3] = class_985.field_5020.field_5050;
                           if(var5 != null) {
                              break label120;
                           }
                        }

                        var7[var9 + var8 * var3] = this.field_6583[this.method_6678(this.field_6583.length)].field_5050;
                        if(var5 != null) {
                           break label120;
                        }
                     }

                     var12 = var10;
                     var10001 = 4;
                  }

                  if(var12 == var10001) {
                     var7[var9 + var8 * var3] = this.field_6584[this.method_6678(this.field_6584.length)].field_5050;
                     if(var5 != null) {
                        break label120;
                     }
                  }

                  var7[var9 + var8 * var3] = class_985.field_5002.field_5050;
               }

               ++var9;
               if(var5 == null) {
                  break label110;
               }
            }
         }

         ++var8;
      } while(var5 != null);

      return var7;
   }
}
