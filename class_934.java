
// $FF: renamed from: cB
public class class_934 implements class_19 {

   // $FF: renamed from: b int
   private int field_4764;
   // $FF: renamed from: c int
   private int field_4765;
   // $FF: renamed from: d add[]
   private add[] field_4766;
   // $FF: renamed from: e add
   private add field_4767;
   // $FF: renamed from: f boolean
   private boolean field_4768;


   // $FF: renamed from: <init> (int, int, add[], add) void
   public void method_5464(int var1, int var2, add[] var3, add var4) {
      super();
      this.field_4764 = var1;
      this.field_4765 = var2;
      this.field_4766 = var3;
      this.field_4767 = var4;
   }

   // $FF: renamed from: c () add
   public add method_63() {
      return this.field_4767;
   }

   // $FF: renamed from: b (aO, ahb) boolean
   public boolean method_60(class_897 var1, ahb var2) {
      String[] var10000 = class_752.method_4253();
      int var4 = 0;
      String[] var3 = var10000;

      label52:
      while(true) {
         int var6 = var4;

         boolean var7;
         label49:
         while(true) {
            if(var6 <= 3 - this.field_4764) {
               var7 = false;
               if(var3 == null) {
                  break;
               }

               int var5 = 0;

               while(true) {
                  if(var5 <= 3 - this.field_4765) {
                     label58: {
                        var6 = this.method_5465(var1, var4, var5, true);
                        if(var3 == null) {
                           continue label49;
                        }

                        if(var3 != null) {
                           if(var6 != 0) {
                              return true;
                           }

                           var6 = this.method_5465(var1, var4, var5, false);
                        }

                        if(var3 != null) {
                           if(var6 == 0) {
                              ++var5;
                              if(var3 != null) {
                                 continue;
                              }
                              break label58;
                           }

                           var6 = 1;
                        }

                        return (boolean)var6;
                     }
                  }

                  ++var4;
                  if(var3 != null) {
                     continue label52;
                  }
                  break;
               }
            }

            var7 = false;
            break;
         }

         return var7;
      }
   }

   // $FF: renamed from: b (aO, int, int, boolean) boolean
   private boolean method_5465(class_897 var1, int var2, int var3, boolean var4) {
      String[] var10000 = class_752.method_4253();
      int var6 = 0;
      String[] var5 = var10000;

      label146:
      while(true) {
         int var12 = var6;

         boolean var13;
         label143:
         while(true) {
            if(var12 < 3) {
               var13 = false;
               if(var5 == null) {
                  break;
               }

               int var7 = 0;

               while(true) {
                  if(var7 < 3) {
                     int var8 = var6 - var2;
                     int var9 = var7 - var3;
                     add var10 = null;
                     var12 = var8;
                     if(var5 == null) {
                        continue label143;
                     }

                     int var10001;
                     label151: {
                        if(var5 != null) {
                           if(var8 < 0) {
                              break label151;
                           }

                           var12 = var9;
                        }

                        if(var5 != null) {
                           if(var12 < 0) {
                              break label151;
                           }

                           var12 = var8;
                        }

                        label152: {
                           var10001 = this.field_4764;
                           if(var5 != null) {
                              if(var12 >= this.field_4764) {
                                 break label151;
                              }

                              var12 = var9;
                              if(var5 == null) {
                                 break label152;
                              }

                              var10001 = this.field_4765;
                           }

                           if(var12 >= var10001) {
                              break label151;
                           }

                           var12 = var4;
                        }

                        if(var12 != 0) {
                           var10 = this.field_4766[this.field_4764 - var8 - 1 + var9 * this.field_4764];
                        } else {
                           var10 = this.field_4766[var8 + var9 * this.field_4764];
                        }
                     }

                     label167: {
                        add var11 = var1.method_5203(var6, var7);
                        add var14 = var11;
                        if(var5 != null) {
                           label129: {
                              if(var11 == null) {
                                 var14 = var10;
                                 if(var5 == null) {
                                    break label129;
                                 }

                                 if(var10 == null && var5 != null) {
                                    break label167;
                                 }
                              }

                              var14 = var11;
                           }
                        }

                        if(var5 != null) {
                           label117: {
                              if(var14 == null) {
                                 var14 = var10;
                                 if(var5 == null) {
                                    break label117;
                                 }

                                 if(var10 != null) {
                                    return false;
                                 }
                              }

                              var14 = var11;
                           }
                        }

                        label104:
                        if(var5 != null) {
                           if(var14 != null) {
                              var14 = var10;
                              if(var5 == null) {
                                 break label104;
                              }

                              if(var10 == null) {
                                 return false;
                              }
                           }

                           var14 = var10;
                        }

                        if(var5 != null) {
                           if(var14.method_3730() != var11.method_3730()) {
                              return false;
                           }

                           var14 = var10;
                        }

                        var12 = var14.method_3745();
                        var10001 = 32767;
                        if(var5 != null) {
                           if(var12 == 32767) {
                              break label167;
                           }

                           var12 = var10.method_3745();
                           if(var5 == null) {
                              return (boolean)var12;
                           }

                           var10001 = var11.method_3745();
                        }

                        if(var12 != var10001) {
                           var12 = 0;
                           return (boolean)var12;
                        }
                     }

                     ++var7;
                     if(var5 != null) {
                        continue;
                     }
                  }

                  ++var6;
                  if(var5 != null) {
                     continue label146;
                  }
                  break;
               }
            }

            var13 = true;
            break;
         }

         return var13;
      }
   }

   // $FF: renamed from: b (aO) add
   public add method_61(class_897 var1) {
      add var3;
      add var7;
      label45: {
         String[] var10000 = class_752.method_4253();
         var3 = this.method_63().method_3754();
         String[] var2 = var10000;
         byte var6 = this.field_4768;
         if(var2 != null) {
            if(!this.field_4768) {
               break label45;
            }

            var6 = 0;
         }

         int var4 = var6;

         while(var4 < var1.method_83()) {
            add var5 = var1.method_84(var4);
            if(var2 != null) {
               var7 = var5;
               if(var2 == null) {
                  return var7;
               }

               if(var5 != null) {
                  label24: {
                     var7 = var5;
                     if(var2 != null) {
                        if(!var5.method_3766()) {
                           break label24;
                        }

                        var7 = var3;
                     }

                     var7.method_3769((class_1583)var5.field_2961.method_8633());
                  }
               }

               ++var4;
            }

            if(var2 == null) {
               break;
            }
         }
      }

      var7 = var3;
      return var7;
   }

   // $FF: renamed from: b () int
   public int method_62() {
      return this.field_4764 * this.field_4765;
   }

   // $FF: renamed from: a () cB
   public class_934 method_5466() {
      this.field_4768 = true;
      return this;
   }
}
