
// $FF: renamed from: yl
public class class_1740 extends class_1727 {

   // $FF: renamed from: c sw
   private final class_753 field_9088;
   // $FF: renamed from: d float
   private final float field_9089;
   // $FF: renamed from: e float
   private float field_9090;
   // $FF: renamed from: f boolean
   private boolean field_9091;
   // $FF: renamed from: g int
   private int field_9092;
   // $FF: renamed from: h int
   private int field_9093;
   // $FF: renamed from: i java.lang.String
   private static final String field_9094 = "CL_00001580";


   // $FF: renamed from: <init> (sw, float) void
   public void method_9675(class_753 var1, float var2) {
      super.method_9648();
      this.field_9088 = var1;
      this.field_9089 = var2;
      this.method_9655(7);
   }

   // $FF: renamed from: e () void
   public void method_9652() {
      this.field_9090 = 0.0F;
   }

   // $FF: renamed from: f () void
   public void method_9653() {
      this.field_9091 = false;
      this.field_9090 = 0.0F;
   }

   // $FF: renamed from: b () boolean
   public boolean method_9649() {
      boolean var2;
      label56: {
         String[] var1 = class_752.method_4253();
         Object var10000 = this.field_9088;
         if(var1 != null) {
            if(!this.field_9088.method_3917()) {
               break label56;
            }

            var10000 = this.field_9088.field_2987;
         }

         if(var1 != null) {
            if(var10000 == null) {
               break label56;
            }

            var10000 = this.field_9088.field_2987;
         }

         var2 = var10000 instanceof class_792;
         if(var1 != null) {
            if(!var2) {
               break label56;
            }

            var2 = this.field_9091;
         }

         if(var1 == null) {
            return var2;
         }

         if(!var2) {
            var2 = this.field_9088.method_4283();
            if(var1 == null) {
               return var2;
            }

            if(!var2) {
               break label56;
            }
         }

         var2 = true;
         return var2;
      }

      var2 = false;
      return var2;
   }

   // $FF: renamed from: g () void
   public void method_9654() {
      class_792 var2 = (class_792)this.field_9088.field_2987;
      String[] var10000 = class_752.method_4253();
      class_761 var3 = (class_761)this.field_9088;
      float var4 = class_1715.method_9579(var2.field_3000 - this.field_9088.field_3000) * 0.5F;
      String[] var1 = var10000;
      float var32;
      int var23 = (var32 = var4 - 5.0F) == 0.0F?0:(var32 < 0.0F?-1:1);
      if(var1 != null) {
         if(var23 > 0) {
            var4 = 5.0F;
         }

         float var33;
         var23 = (var33 = var4 - -5.0F) == 0.0F?0:(var33 < 0.0F?-1:1);
      }

      if(var1 != null) {
         if(var23 < 0) {
            var4 = -5.0F;
         }

         this.field_9088.field_3000 = class_1715.method_9579(this.field_9088.field_3000 + var4);
         float var34;
         var23 = (var34 = this.field_9090 - this.field_9089) == 0.0F?0:(var34 < 0.0F?-1:1);
      }

      if(var1 != null) {
         if(var23 < 0) {
            this.field_9090 += (this.field_9089 - this.field_9090) * 0.01F;
         }

         float var35;
         var23 = (var35 = this.field_9090 - this.field_9089) == 0.0F?0:(var35 < 0.0F?-1:1);
      }

      if(var1 != null) {
         if(var23 > 0) {
            this.field_9090 = this.field_9089;
         }

         var23 = class_1715.method_9561(this.field_9088.field_2994);
      }

      int var5;
      int var6;
      int var7;
      float var8;
      int var10001;
      class_1740 var24;
      label216: {
         label215: {
            label225: {
               var5 = var23;
               var6 = class_1715.method_9561(this.field_9088.field_2995);
               var7 = class_1715.method_9561(this.field_9088.field_2996);
               var8 = this.field_9090;
               var23 = this.field_9091;
               if(var1 != null) {
                  if(!this.field_9091) {
                     break label216;
                  }

                  var24 = this;
                  var10001 = this.field_9092;
                  if(var1 == null) {
                     break label225;
                  }

                  var23 = this.field_9092++;
               }

               if(var23 <= this.field_9093) {
                  break label215;
               }

               var24 = this;
               var10001 = 0;
            }

            var24.field_9091 = (boolean)var10001;
         }

         var8 += var8 * 1.15F * class_1715.method_9555((float)this.field_9092 / (float)this.field_9093 * 3.1415927F);
      }

      float var9;
      class_753 var25;
      label202: {
         var9 = 0.91F;
         var25 = this.field_9088;
         if(var1 != null) {
            if(!this.field_9088.field_3005) {
               break label202;
            }

            var25 = this.field_9088;
         }

         var9 = var25.field_2990.getBlock(class_1715.method_9559((float)var5), class_1715.method_9559((float)var6) - 1, class_1715.method_9559((float)var7)).field_2008 * 0.91F;
      }

      float var17;
      label196: {
         float var16;
         label227: {
            float var10 = 0.16277136F / (var9 * var9 * var9);
            float var11 = class_1715.method_9555(var3.field_3000 * 3.1415927F / 180.0F);
            float var12 = class_1715.method_9556(var3.field_3000 * 3.1415927F / 180.0F);
            float var13 = var3.method_4226() * var10;
            float var14 = Math.max(var8, 1.0F);
            var14 = var13 / var14;
            float var15 = var8 * var14;
            var16 = -(var15 * var11);
            var17 = var15 * var12;
            float var36;
            var23 = (var36 = class_1715.method_9564(var16) - class_1715.method_9564(var17)) == 0.0F?0:(var36 < 0.0F?-1:1);
            if(var1 != null) {
               if(var23 > 0) {
                  float var28;
                  label228: {
                     float var37;
                     var23 = (var37 = var16 - 0.0F) == 0.0F?0:(var37 < 0.0F?-1:1);
                     if(var1 != null) {
                        if(var23 < 0) {
                           var16 -= this.field_9088.field_3014 / 2.0F;
                        }

                        var28 = var16;
                        if(var1 == null) {
                           break label228;
                        }

                        float var38;
                        var23 = (var38 = var16 - 0.0F) == 0.0F?0:(var38 < 0.0F?-1:1);
                     }

                     if(var23 > 0) {
                        var16 += this.field_9088.field_3014 / 2.0F;
                     }

                     var28 = 0.0F;
                  }

                  var17 = var28;
                  if(var1 != null) {
                     break label227;
                  }
               }

               var16 = 0.0F;
               float var39;
               var23 = (var39 = var17 - 0.0F) == 0.0F?0:(var39 < 0.0F?-1:1);
            }

            if(var1 != null) {
               if(var23 < 0) {
                  var17 -= this.field_9088.field_3014 / 2.0F;
               }

               float var40;
               var23 = (var40 = var17 - 0.0F) == 0.0F?0:(var40 < 0.0F?-1:1);
            }

            if(var1 == null) {
               break label196;
            }

            if(var23 > 0) {
               var17 += this.field_9088.field_3014 / 2.0F;
            }
         }

         var23 = class_1715.method_9561(this.field_9088.field_2994 + (double)var16);
      }

      label177: {
         label230: {
            int var18;
            int var19;
            class_1288 var20;
            label175: {
               var18 = var23;
               var19 = class_1715.method_9561(this.field_9088.field_2996 + (double)var17);
               class_1288 var29 = new class_1288;
               var29.method_6733(class_1715.method_9559(this.field_9088.field_3014 + 1.0F), class_1715.method_9559(this.field_9088.field_3015 + var2.field_3015 + 1.0F), class_1715.method_9559(this.field_9088.field_3014 + 1.0F));
               var20 = var29;
               var23 = var5;
               var10001 = var18;
               if(var1 != null) {
                  if(var5 != var18) {
                     break label175;
                  }

                  var23 = var7;
                  if(var1 == null) {
                     break label177;
                  }

                  var10001 = var19;
               }

               if(var23 == var10001) {
                  break label230;
               }
            }

            byte var30;
            label153: {
               aji var21 = this.field_9088.field_2990.getBlock(var5, var6, var7);
               if(!this.method_9676(var21)) {
                  label151: {
                     if(var21.method_2424() == awt.field_4170) {
                        var30 = this.method_9676(this.field_9088.field_2990.getBlock(var5, var6 - 1, var7));
                        if(var1 == null) {
                           break label153;
                        }

                        if(var30 != 0) {
                           break label151;
                        }
                     }

                     var30 = 1;
                     break label153;
                  }
               }

               var30 = 0;
            }

            byte var22 = var30;
            var23 = var22;
            if(var1 == null) {
               break label177;
            }

            if(var22 != 0) {
               var23 = class_1290.method_6761(this.field_9088, var18, var6, var19, var20, false, false, true);
               if(var1 == null) {
                  break label177;
               }

               if(var23 == 0) {
                  var23 = class_1290.method_6761(this.field_9088, var5, var6 + 1, var7, var20, false, false, true);
                  if(var1 == null) {
                     break label177;
                  }

                  if(var23 == 1) {
                     var23 = class_1290.method_6761(this.field_9088, var18, var6 + 1, var19, var20, false, false, true);
                     if(var1 == null) {
                        break label177;
                     }

                     if(var23 == 1) {
                        var3.method_4256().method_9972();
                     }
                  }
               }
            }
         }

         var23 = var2.field_3640.field_2839;
      }

      label142: {
         label141: {
            label140: {
               if(var1 != null) {
                  if(var23 != 0) {
                     break label140;
                  }

                  var24 = this;
                  if(var1 == null) {
                     break label141;
                  }

                  float var41;
                  var23 = (var41 = this.field_9090 - this.field_9089 * 0.5F) == 0.0F?0:(var41 < 0.0F?-1:1);
               }

               if(var23 >= 0) {
                  var25 = this.field_9088;
                  if(var1 == null) {
                     break label142;
                  }

                  if(this.field_9088.method_4165().nextFloat() < 0.006F) {
                     var24 = this;
                     if(var1 == null) {
                        break label141;
                     }

                     if(!this.field_9091) {
                        add var26 = var2.method_4214();
                        if(var1 == null) {
                           return;
                        }

                        if(var26 != null) {
                           label122: {
                              add var31 = var26;
                              if(var1 != null) {
                                 if(var26.method_3730() != class_1010.field_5254) {
                                    break label122;
                                 }

                                 var26.method_3749(1, var2);
                                 if(var1 == null) {
                                    return;
                                 }

                                 var31 = var26;
                              }

                              if(var31.field_2958 == 0) {
                                 var31 = new add;
                                 var31.method_3724(class_1010.field_5203);
                                 add var27 = var31;
                                 var27.method_3769(var26.field_2961);
                                 var2.field_3616.field_2844[var2.field_3616.field_2846] = var27;
                              }
                           }
                        }
                     }
                  }
               }
            }

            var24 = this;
         }

         var25 = var24.field_9088;
      }

      var25.method_4224(0.0F, var8);
   }

   // $FF: renamed from: b (aji) boolean
   private boolean method_9676(aji var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = var1.method_2436();
      if(var2 != null) {
         if(var10000 != 10) {
            var10000 = var1 instanceof class_378;
            if(var2 == null) {
               return (boolean)var10000;
            }

            if(var10000 == 0) {
               var10000 = 0;
               return (boolean)var10000;
            }
         }

         var10000 = 1;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: a () boolean
   public boolean method_9677() {
      return this.field_9091;
   }

   // $FF: renamed from: i () void
   public void method_9678() {
      this.field_9091 = true;
      this.field_9092 = 0;
      this.field_9093 = this.field_9088.method_4165().nextInt(841) + 140;
   }

   // $FF: renamed from: j () boolean
   public boolean method_9679() {
      int var10000;
      label24: {
         String[] var1 = class_752.method_4253();
         var10000 = this.method_9677();
         if(var1 != null) {
            if(var10000 != 0) {
               break label24;
            }

            float var2;
            var10000 = (var2 = this.field_9090 - this.field_9089 * 0.3F) == 0.0F?0:(var2 < 0.0F?-1:1);
         }

         if(var1 == null) {
            return (boolean)var10000;
         }

         if(var10000 > 0) {
            var10000 = 1;
            return (boolean)var10000;
         }
      }

      var10000 = 0;
      return (boolean)var10000;
   }

   // $FF: renamed from: <clinit> () void
   static void method_9680() {
      boolean var10000 = true;
      char[] var10003 = "êÑ&Ô§Bþ¶&".toCharArray();
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
            field_9094 = (new String((char[])var4)).intern();
            String var2 = field_9094;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 91;
            break;
         case 1:
            var10009 = 50;
            break;
         case 2:
            var10009 = 26;
            break;
         case 3:
            var10009 = 130;
            break;
         case 4:
            var10009 = 112;
            break;
         case 5:
            var10009 = 3;
            break;
         default:
            var10009 = 230;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
