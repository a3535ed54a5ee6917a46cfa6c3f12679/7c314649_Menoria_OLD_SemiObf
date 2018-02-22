
// $FF: renamed from: gg
public class class_1193 {

   // $FF: renamed from: b ahb
   private final ahb field_6207;
   // $FF: renamed from: c int
   private final int field_6208;
   // $FF: renamed from: d int
   private final int field_6209;
   // $FF: renamed from: e int
   private final int field_6210;
   // $FF: renamed from: f int
   private int field_6211;
   // $FF: renamed from: g vF
   private class_1661 field_6212;
   // $FF: renamed from: h int
   private int field_6213;
   // $FF: renamed from: i int
   private int field_6214;


   // $FF: renamed from: <init> (ahb, int, int, int, int) void
   public void method_6412(ahb var1, int var2, int var3, int var4, int var5) {
      super();
      this.field_6211 = 0;
      this.field_6207 = var1;
      this.field_6208 = var5;
      String[] var10000 = class_752.method_4253();
      this.field_6210 = class_375.field_2048[var5][0];
      String[] var6 = var10000;
      this.field_6209 = class_375.field_2048[var5][1];
      int var7 = var3;

      int var9;
      while(true) {
         if(var3 > var7 - 21) {
            var9 = var3;
            if(var6 == null || var6 == null) {
               break;
            }

            if(var3 > 0) {
               var9 = this.method_6415(var1.getBlock(var2, var3 - 1, var4));
               if(var6 == null) {
                  break;
               }

               if(var9 != 0) {
                  --var3;
                  if(var6 != null) {
                     continue;
                  }
               }
            }
         }

         var9 = this.method_6413(var2, var3, var4, this.field_6210) - 1;
         break;
      }

      class_1193 var10;
      label49: {
         label48: {
            label68: {
               int var8 = var9;
               var9 = var8;
               if(var6 != null) {
                  if(var8 < 0) {
                     break label48;
                  }

                  class_1661 var10001 = new class_1661;
                  var10001.method_9151(var2 + var8 * class_1649.field_8587[this.field_6210], var3, var4 + var8 * class_1649.field_8588[this.field_6210]);
                  this.field_6212 = var10001;
                  this.field_6214 = this.method_6413(this.field_6212.field_8646, this.field_6212.field_8647, this.field_6212.field_8648, this.field_6209);
                  var10 = this;
                  if(var6 == null) {
                     break label68;
                  }

                  var9 = this.field_6214;
               }

               if(var9 >= 2) {
                  var10 = this;
                  if(var6 == null) {
                     break label49;
                  }

                  if(this.field_6214 <= 21) {
                     break label48;
                  }
               }

               this.field_6212 = null;
               var10 = this;
            }

            var10.field_6214 = 0;
         }

         var10 = this;
      }

      if(var6 != null) {
         if(var10.field_6212 == null) {
            return;
         }

         var10 = this;
      }

      var10.field_6213 = this.method_6414();
   }

   // $FF: renamed from: b (int, int, int, int) int
   protected int method_6413(int var1, int var2, int var3, int var4) {
      String[] var10000 = class_752.method_4253();
      int var7 = class_1649.field_8587[var4];
      String[] var5 = var10000;
      int var8 = class_1649.field_8588[var4];
      int var6 = 0;

      byte var12;
      while(true) {
         aji var9;
         if(var6 < 22) {
            label45: {
               var9 = this.field_6207.getBlock(var1 + var7 * var6, var2, var3 + var8 * var6);
               class_1193 var11 = this;
               if(var5 != null) {
                  var12 = this.method_6415(var9);
                  if(var5 == null) {
                     break;
                  }

                  if(var12 == 0 && var5 != null) {
                     break label45;
                  }

                  var11 = this;
               }

               aji var10 = var11.field_6207.getBlock(var1 + var7 * var6, var2 - 1, var3 + var8 * var6);
               if(var5 != null) {
                  if(var10 != class_1192.field_6076 && var5 != null) {
                     break label45;
                  }

                  ++var6;
               }

               if(var5 != null) {
                  continue;
               }
            }
         }

         var9 = this.field_6207.getBlock(var1 + var7 * var6, var2, var3 + var8 * var6);
         if(var9 == class_1192.field_6076) {
            return var6;
         }

         var12 = 0;
         break;
      }

      return var12;
   }

   // $FF: renamed from: b () int
   protected int method_6414() {
      String[] var10000 = class_752.method_4253();
      this.field_6213 = 0;
      String[] var1 = var10000;

      int var2;
      int var3;
      int var4;
      int var5;
      int var7;
      byte var8;
      label113:
      while(true) {
         var7 = this.field_6213;

         label110:
         while(var7 < 21) {
            var2 = this.field_6212.field_8647 + this.field_6213;
            var8 = 0;
            if(var1 == null) {
               break label113;
            }

            var3 = 0;

            while(var3 < this.field_6214) {
               var4 = this.field_6212.field_8646 + var3 * class_1649.field_8587[class_375.field_2048[this.field_6208][1]];
               var5 = this.field_6212.field_8648 + var3 * class_1649.field_8588[class_375.field_2048[this.field_6208][1]];
               aji var6 = this.field_6207.getBlock(var4, var2, var5);
               var7 = this.method_6415(var6);
               if(var1 == null) {
                  continue label110;
               }

               if(var7 == 0 && var1 != null) {
                  break label110;
               }

               if(var6 == class_1192.field_6116) {
                  ++this.field_6211;
               }

               label101: {
                  label100: {
                     var7 = var3;
                     if(var1 != null) {
                        if(var3 == 0) {
                           var6 = this.field_6207.getBlock(var4 + class_1649.field_8587[class_375.field_2048[this.field_6208][0]], var2, var5 + class_1649.field_8588[class_375.field_2048[this.field_6208][0]]);
                           if(var1 == null) {
                              break label101;
                           }

                           if(var6 == class_1192.field_6076) {
                              break label100;
                           }

                           if(var1 != null) {
                              break label110;
                           }
                        }

                        var7 = var3;
                     }

                     if(var7 == this.field_6214 - 1) {
                        var6 = this.field_6207.getBlock(var4 + class_1649.field_8587[class_375.field_2048[this.field_6208][1]], var2, var5 + class_1649.field_8588[class_375.field_2048[this.field_6208][1]]);
                        if(var1 == null) {
                           break label101;
                        }

                        if(var6 != class_1192.field_6076 && var1 != null) {
                           break label110;
                        }
                     }
                  }

                  ++var3;
               }

               if(var1 == null) {
                  break;
               }
            }

            ++this.field_6213;
            if(var1 != null) {
               continue label113;
            }
            break;
         }

         var8 = 0;
         break;
      }

      var2 = var8;

      class_1193 var9;
      while(true) {
         if(var2 < this.field_6214) {
            label66: {
               var3 = this.field_6212.field_8646 + var2 * class_1649.field_8587[class_375.field_2048[this.field_6208][1]];
               var4 = this.field_6212.field_8647 + this.field_6213;
               var5 = this.field_6212.field_8648 + var2 * class_1649.field_8588[class_375.field_2048[this.field_6208][1]];
               if(var1 != null) {
                  var9 = this;
                  if(var1 == null) {
                     break;
                  }

                  if(this.field_6207.getBlock(var3, var4, var5) != class_1192.field_6076) {
                     this.field_6213 = 0;
                     if(var1 != null) {
                        break label66;
                     }
                  }

                  ++var2;
               }

               if(var1 != null) {
                  continue;
               }
            }
         }

         var9 = this;
         break;
      }

      var7 = var9.field_6213;
      if(var1 != null) {
         if(var9.field_6213 <= 21) {
            label52: {
               var7 = this.field_6213;
               if(var1 != null) {
                  if(this.field_6213 < 3) {
                     break label52;
                  }

                  var7 = this.field_6213;
               }

               return var7;
            }
         }

         this.field_6212 = null;
         this.field_6214 = 0;
         this.field_6213 = 0;
         var7 = 0;
      }

      return var7;
   }

   // $FF: renamed from: b (aji) boolean
   protected boolean method_6415(aji var1) {
      boolean var3;
      label28: {
         String[] var2 = class_752.method_4253();
         aji var10000 = var1;
         if(var2 != null) {
            if(var1.field_2007 == awt.field_4170) {
               break label28;
            }

            var10000 = var1;
         }

         if(var2 != null) {
            if(var10000 == class_1192.field_6078) {
               break label28;
            }

            var10000 = var1;
         }

         if(var10000 != class_1192.field_6116) {
            var3 = false;
            return var3;
         }
      }

      var3 = true;
      return var3;
   }

   // $FF: renamed from: c () boolean
   public boolean method_6416() {
      int var2;
      label48: {
         String[] var1 = class_752.method_4253();
         class_1193 var10000 = this;
         if(var1 != null) {
            if(this.field_6212 == null) {
               break label48;
            }

            var10000 = this;
         }

         var2 = var10000.field_6214;
         byte var10001 = 2;
         if(var1 != null) {
            if(var2 < 2) {
               break label48;
            }

            var2 = this.field_6214;
            var10001 = 21;
         }

         if(var1 != null) {
            if(var2 > var10001) {
               break label48;
            }

            var2 = this.field_6213;
            var10001 = 3;
         }

         if(var1 != null) {
            if(var2 < var10001) {
               break label48;
            }

            var2 = this.field_6213;
            if(var1 == null) {
               return (boolean)var2;
            }

            var10001 = 21;
         }

         if(var2 <= var10001) {
            var2 = 1;
            return (boolean)var2;
         }
      }

      var2 = 0;
      return (boolean)var2;
   }

   // $FF: renamed from: d () void
   public void method_6417() {
      String[] var10000 = class_752.method_4253();
      int var2 = 0;
      String[] var1 = var10000;

      while(var2 < this.field_6214) {
         int var3 = this.field_6212.field_8646 + class_1649.field_8587[this.field_6209] * var2;
         int var4 = this.field_6212.field_8648 + class_1649.field_8588[this.field_6209] * var2;
         int var5 = 0;

         while(true) {
            if(var5 < this.field_6213) {
               int var6 = this.field_6212.field_8647 + var5;
               this.field_6207.method_2054(var3, var6, var4, class_1192.field_6116, this.field_6208, 2);
               ++var5;
               if(var1 == null) {
                  break;
               }

               if(var1 != null) {
                  continue;
               }
            }

            ++var2;
            break;
         }

         if(var1 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: b (gg) int
   // $FF: synthetic method
   static int method_6418(class_1193 var0) {
      return var0.field_6211;
   }

   // $FF: renamed from: c (gg) int
   // $FF: synthetic method
   static int method_6419(class_1193 var0) {
      return var0.field_6214;
   }

   // $FF: renamed from: d (gg) int
   // $FF: synthetic method
   static int method_6420(class_1193 var0) {
      return var0.field_6213;
   }
}
