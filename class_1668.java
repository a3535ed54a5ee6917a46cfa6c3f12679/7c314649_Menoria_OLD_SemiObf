
// $FF: renamed from: ui
public class class_1668 {

   // $FF: renamed from: b ahb
   public ahb field_8685;
   // $FF: renamed from: c xi
   public class_793 field_8686;
   // $FF: renamed from: d G
   private class_94 field_8687;
   // $FF: renamed from: e boolean
   private boolean field_8688;
   // $FF: renamed from: f int
   private int field_8689;
   // $FF: renamed from: g int
   private int field_8690;
   // $FF: renamed from: h int
   private int field_8691;
   // $FF: renamed from: i int
   private int field_8692;
   // $FF: renamed from: j int
   private int field_8693;
   // $FF: renamed from: k boolean
   private boolean field_8694;
   // $FF: renamed from: l int
   private int field_8695;
   // $FF: renamed from: m int
   private int field_8696;
   // $FF: renamed from: n int
   private int field_8697;
   // $FF: renamed from: o int
   private int field_8698;
   // $FF: renamed from: p int
   private int field_8699;


   // $FF: renamed from: <init> (ahb) void
   public void method_9198(ahb var1) {
      super();
      this.field_8687 = class_94.field_44;
      this.field_8699 = -1;
      this.field_8685 = var1;
   }

   // $FF: renamed from: b (G) void
   public void method_9199(class_94 var1) {
      this.field_8687 = var1;
      var1.method_445(this.field_8686.field_3640);
      this.field_8686.method_4630();
   }

   // $FF: renamed from: a () G
   public class_94 method_9200() {
      return this.field_8687;
   }

   // $FF: renamed from: b () boolean
   public boolean method_9201() {
      return this.field_8687.method_447();
   }

   // $FF: renamed from: c (G) void
   public void method_9202(class_94 var1) {
      String[] var2 = class_752.method_4253();
      class_1668 var10000 = this;
      if(var2 != null) {
         if(this.field_8687 == class_94.field_44) {
            this.field_8687 = var1;
         }

         var10000 = this;
      }

      var10000.method_9199(this.field_8687);
   }

   // $FF: renamed from: c () void
   public void method_9203() {
      String[] var1;
      float var4;
      int var5;
      class_1668 var11;
      label75: {
         String[] var10000 = class_752.method_4253();
         ++this.field_8693;
         var1 = var10000;
         boolean var8 = this.field_8694;
         if(var1 != null) {
            if(this.field_8694) {
               label77: {
                  int var2 = this.field_8693 - this.field_8698;
                  aji var3 = this.field_8685.getBlock(this.field_8695, this.field_8696, this.field_8697);
                  aji var9 = var3;
                  if(var1 != null) {
                     if(var3.method_2424() == awt.field_4170) {
                        this.field_8694 = false;
                        if(var1 != null) {
                           break label77;
                        }
                     }

                     var9 = var3;
                  }

                  var4 = var9.method_2465(this.field_8686, this.field_8686.field_2990, this.field_8695, this.field_8696, this.field_8697) * (float)(var2 + 1);
                  var5 = (int)(var4 * 10.0F);
                  int var10 = var5;
                  if(var1 != null) {
                     if(var5 != this.field_8699) {
                        this.field_8685.method_2217(this.field_8686.method_3845(), this.field_8695, this.field_8696, this.field_8697, var5);
                        this.field_8699 = var5;
                     }

                     float var12;
                     var10 = (var12 = var4 - 1.0F) == 0.0F?0:(var12 < 0.0F?-1:1);
                  }

                  if(var1 != null && var10 >= 0) {
                     this.field_8694 = false;
                     this.method_9208(this.field_8695, this.field_8696, this.field_8697);
                  }
               }

               if(var1 != null) {
                  return;
               }
            }

            var11 = this;
            if(var1 == null) {
               break label75;
            }

            var8 = this.field_8688;
         }

         if(!var8) {
            return;
         }

         var11 = this;
      }

      aji var6;
      label46: {
         var6 = var11.field_8685.getBlock(this.field_8690, this.field_8691, this.field_8692);
         if(var1 != null) {
            if(var6.method_2424() != awt.field_4170) {
               break label46;
            }

            this.field_8685.method_2217(this.field_8686.method_3845(), this.field_8690, this.field_8691, this.field_8692, -1);
            this.field_8699 = -1;
            this.field_8688 = false;
         }

         if(var1 != null) {
            return;
         }
      }

      int var7 = this.field_8693 - this.field_8689;
      var4 = var6.method_2465(this.field_8686, this.field_8686.field_2990, this.field_8690, this.field_8691, this.field_8692) * (float)(var7 + 1);
      var5 = (int)(var4 * 10.0F);
      if(var1 != null) {
         if(var5 == this.field_8699) {
            return;
         }

         this.field_8685.method_2217(this.field_8686.method_3845(), this.field_8690, this.field_8691, this.field_8692, var5);
      }

      this.field_8699 = var5;
   }

   // $FF: renamed from: b (int, int, int, int) void
   public void method_9204(int var1, int var2, int var3, int var4) {
      String[] var5 = class_752.method_4253();
      boolean var10000 = this.field_8687.method_446();
      if(var5 != null) {
         label58: {
            if(var10000) {
               var10000 = this.field_8686.method_4627(var1, var2, var3);
               if(var5 == null) {
                  break label58;
               }

               if(!var10000) {
                  return;
               }
            }

            var10000 = this.method_9201();
         }
      }

      if(var5 != null) {
         if(var10000) {
            if(var5 != null && !this.field_8685.method_2128((class_792)null, var1, var2, var3, var4)) {
               this.method_9208(var1, var2, var3);
            }

            return;
         }

         this.field_8685.method_2128((class_792)null, var1, var2, var3, var4);
      }

      this.field_8689 = this.field_8693;
      float var6 = 1.0F;
      aji var7 = this.field_8685.getBlock(var1, var2, var3);
      awt var9 = var7.method_2424();
      awt var10001 = awt.field_4170;
      if(var5 != null) {
         if(var9 != awt.field_4170) {
            var7.method_2484(this.field_8685, var1, var2, var3, this.field_8686);
            var6 = var7.method_2465(this.field_8686, this.field_8686.field_2990, var1, var2, var3);
         }

         var9 = var7.method_2424();
         var10001 = awt.field_4170;
      }

      int var10;
      label48: {
         if(var9 != var10001) {
            float var11;
            var10 = (var11 = var6 - 1.0F) == 0.0F?0:(var11 < 0.0F?-1:1);
            if(var5 == null) {
               break label48;
            }

            if(var10 >= 0) {
               this.method_9208(var1, var2, var3);
               if(var5 != null) {
                  return;
               }
            }
         }

         this.field_8688 = true;
         this.field_8690 = var1;
         this.field_8691 = var2;
         this.field_8692 = var3;
         var10 = (int)(var6 * 10.0F);
      }

      int var8 = var10;
      this.field_8685.method_2217(this.field_8686.method_3845(), var1, var2, var3, var8);
      this.field_8699 = var8;
   }

   // $FF: renamed from: b (int, int, int) void
   public void method_9205(int var1, int var2, int var3) {
      String[] var4 = class_752.method_4253();
      int var10000 = var1;
      int var10001 = this.field_8690;
      if(var4 != null) {
         if(var1 != this.field_8690) {
            return;
         }

         var10000 = var2;
         var10001 = this.field_8691;
      }

      if(var4 != null) {
         if(var10000 != var10001) {
            return;
         }

         var10000 = var3;
         var10001 = this.field_8692;
      }

      if(var4 != null) {
         if(var10000 != var10001) {
            return;
         }

         var10000 = this.field_8693;
         var10001 = this.field_8689;
      }

      int var5 = var10000 - var10001;
      aji var6 = this.field_8685.getBlock(var1, var2, var3);
      aji var8 = var6;
      if(var4 != null) {
         if(var6.method_2424() == awt.field_4170) {
            return;
         }

         var8 = var6;
      }

      class_1668 var9;
      label59: {
         float var7 = var8.method_2465(this.field_8686, this.field_8686.field_2990, var1, var2, var3) * (float)(var5 + 1);
         float var10;
         var10000 = (var10 = var7 - 0.7F) == 0.0F?0:(var10 < 0.0F?-1:1);
         if(var4 != null) {
            if(var10000 >= 0) {
               this.field_8688 = false;
               this.field_8685.method_2217(this.field_8686.method_3845(), var1, var2, var3, -1);
               this.method_9208(var1, var2, var3);
               if(var4 != null) {
                  return;
               }
            }

            var9 = this;
            if(var4 == null) {
               break label59;
            }

            var10000 = this.field_8694;
         }

         if(var10000 != 0) {
            return;
         }

         this.field_8688 = false;
         this.field_8694 = true;
         this.field_8695 = var1;
         this.field_8696 = var2;
         this.field_8697 = var3;
         var9 = this;
      }

      var9.field_8698 = this.field_8689;
   }

   // $FF: renamed from: d (int, int, int) void
   public void method_9206(int var1, int var2, int var3) {
      this.field_8688 = false;
      this.field_8685.method_2217(this.field_8686.method_3845(), this.field_8690, this.field_8691, this.field_8692, -1);
   }

   // $FF: renamed from: e (int, int, int) boolean
   private boolean method_9207(int var1, int var2, int var3) {
      aji var5 = this.field_8685.getBlock(var1, var2, var3);
      String[] var4 = class_752.method_4253();
      int var6 = this.field_8685.method_33(var1, var2, var3);
      var5.method_2522(this.field_8685, var1, var2, var3, var6, this.field_8686);
      boolean var7 = this.field_8685.method_2056(var1, var2, var3);
      boolean var10000 = var7;
      if(var4 != null) {
         if(var7) {
            var5.method_2458(this.field_8685, var1, var2, var3, var6);
         }

         var10000 = var7;
      }

      return var10000;
   }

   // $FF: renamed from: f (int, int, int) boolean
   public boolean method_9208(int var1, int var2, int var3) {
      String[] var4;
      class_1668 var11;
      label84: {
         var4 = class_752.method_4253();
         boolean var10000 = this.field_8687.method_446();
         if(var4 != null) {
            label85: {
               if(var10000) {
                  var10000 = this.field_8686.method_4627(var1, var2, var3);
                  if(var4 == null) {
                     break label85;
                  }

                  if(!var10000) {
                     return false;
                  }
               }

               var11 = this;
               if(var4 == null) {
                  break label84;
               }

               var10000 = this.field_8687.method_447();
            }
         }

         if(var10000) {
            var11 = this;
            if(var4 == null) {
               break label84;
            }

            if(this.field_8686.method_4214() != null) {
               var11 = this;
               if(var4 == null) {
                  break label84;
               }

               if(this.field_8686.method_4214().method_3730() instanceof class_511) {
                  return false;
               }
            }
         }

         var11 = this;
      }

      byte var7;
      int var10;
      label86: {
         aji var5 = var11.field_8685.getBlock(var1, var2, var3);
         int var6 = this.field_8685.method_33(var1, var2, var3);
         this.field_8685.method_2211(this.field_8686, 2001, var1, var2, var3, aji.method_2415(var5) + (this.field_8685.method_33(var1, var2, var3) << 12));
         var7 = this.method_9207(var1, var2, var3);
         var11 = this;
         if(var4 != null) {
            if(this.method_9201()) {
               class_1684 var12 = this.field_8686.field_3654;
               class_295 var10001 = new class_295;
               var10001.method_1691(var1, var2, var3, this.field_8685);
               var12.method_9291(var10001);
               if(var4 != null) {
                  break label86;
               }
            }

            var11 = this;
         }

         byte var9;
         label48: {
            label87: {
               add var8 = var11.field_8686.method_4593();
               var9 = this.field_8686.method_4574(var5);
               add var13 = var8;
               if(var4 != null) {
                  if(var8 == null) {
                     break label87;
                  }

                  var8.method_3751(this.field_8685, var5, var1, var2, var3, this.field_8686);
                  var13 = var8;
               }

               var10 = var13.field_2958;
               if(var4 == null) {
                  break label48;
               }

               if(var10 == 0) {
                  this.field_8686.method_4594();
               }
            }

            var10 = var7;
         }

         if(var4 == null) {
            return (boolean)var10;
         }

         if(var10 != 0) {
            var10 = var9;
            if(var4 == null) {
               return (boolean)var10;
            }

            if(var9 != 0) {
               var5.method_2501(this.field_8685, this.field_8686, var1, var2, var3, var6);
            }
         }
      }

      var10 = var7;
      return (boolean)var10;
   }

   // $FF: renamed from: b (yz, ahb, add) boolean
   public boolean method_9209(class_792 var1, ahb var2, add var3) {
      String[] var4;
      int var5;
      int var6;
      add var7;
      int var9;
      label83: {
         var5 = var3.field_2958;
         String[] var10000 = class_752.method_4253();
         var6 = var3.method_3745();
         var7 = var3.method_3735(var2, var1);
         var4 = var10000;
         if(var4 != null) {
            if(var7 == var3) {
               label84: {
                  label77: {
                     add var8 = var7;
                     if(var4 != null) {
                        if(var7 == null) {
                           break label77;
                        }

                        var8 = var7;
                     }

                     var9 = var8.field_2958;
                     if(var4 == null) {
                        break label83;
                     }

                     if(var9 != var5) {
                        break label84;
                     }

                     var9 = var7.method_3763();
                     if(var4 == null) {
                        break label83;
                     }

                     if(var9 > 0) {
                        break label84;
                     }

                     var9 = var7.method_3745();
                     if(var4 == null) {
                        return (boolean)var9;
                     }

                     if(var9 != var6) {
                        break label84;
                     }
                  }

                  var9 = 0;
                  return (boolean)var9;
               }
            }

            var1.field_3616.field_2844[var1.field_3616.field_2846] = var7;
         }

         var9 = this.method_9201();
      }

      if(var4 != null) {
         label47: {
            if(var9 != 0) {
               var7.field_2958 = var5;
               var9 = var7.method_3741();
               if(var4 == null) {
                  break label47;
               }

               if(var9 != 0) {
                  var7.method_3746(var6);
               }
            }

            var9 = var7.field_2958;
         }
      }

      if(var4 != null) {
         if(var9 == 0) {
            var1.field_3616.field_2844[var1.field_3616.field_2846] = null;
         }

         var9 = var1.method_4557();
      }

      if(var4 != null) {
         if(var9 == 0) {
            ((class_793)var1).method_4644(var1.field_3618);
         }

         var9 = 1;
      }

      return (boolean)var9;
   }

   // $FF: renamed from: b (yz, ahb, add, int, int, int, int, float, float, float) boolean
   public boolean method_9210(class_792 var1, ahb var2, add var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
      String[] var11;
      add var15;
      boolean var10000;
      label41: {
         label44: {
            var11 = class_752.method_4253();
            var10000 = var1.method_3938();
            if(var11 != null) {
               if(var10000) {
                  var15 = var1.method_4214();
                  if(var11 == null) {
                     break label41;
                  }

                  if(var15 != null) {
                     break label44;
                  }
               }

               var10000 = var2.getBlock(var4, var5, var6).method_2481(var2, var4, var5, var6, var1, var7, var8, var9, var10);
            }

            if(var11 != null) {
               if(!var10000) {
                  break label44;
               }

               var10000 = true;
            }

            return var10000;
         }

         var15 = var3;
      }

      if(var15 == null) {
         return false;
      } else {
         var10000 = this.method_9201();
         if(var11 != null) {
            if(var10000) {
               int var12 = var3.method_3745();
               int var13 = var3.field_2958;
               boolean var14 = var3.method_3733(var1, var2, var4, var5, var6, var7, var8, var9, var10);
               var3.method_3746(var12);
               var3.field_2958 = var13;
               return var14;
            }

            var10000 = var3.method_3733(var1, var2, var4, var5, var6, var7, var8, var9, var10);
         }

         return var10000;
      }
   }

   // $FF: renamed from: b (dk) void
   public void method_9211(class_354 var1) {
      this.field_8685 = var1;
   }
}
