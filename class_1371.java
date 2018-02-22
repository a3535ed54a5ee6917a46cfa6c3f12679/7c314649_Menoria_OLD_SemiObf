import java.util.List;
import org.lwjgl.opengl.GL11;

// $FF: renamed from: mI
public abstract class class_1371 implements class_31 {

   // $FF: renamed from: a bqx
   private static final bqx field_7275;
   // $FF: renamed from: b bao
   protected final bao field_7276;
   // $FF: renamed from: c lZ
   protected final class_189 field_7277;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_7278;


   // $FF: renamed from: <init> (lZ) void
   public void method_7471(class_189 var1) {
      super();
      this.field_7277 = var1;
      this.field_7276 = bao.method_5273();
   }

   // $FF: renamed from: b (int, int, int, int, int, bmh, int, int, boolean) void
   public void method_147(int var1, int var2, int var3, int var4, int var5, bmh var6, int var7, int var8, boolean var9) {
      String[] var10;
      int var12;
      class_1371 var18;
      label144: {
         label143: {
            this.method_7474();
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            String[] var10000 = class_752.method_4253();
            Gui.method_660(var2, var3, 0.0F, 0.0F, 32, 32, 32.0F, 32.0F);
            var10 = var10000;
            boolean var17 = this.field_7276.canLoseFocus7.field_4509;
            if(var10 != null) {
               label147: {
                  if(!this.field_7276.canLoseFocus7.field_4509) {
                     var17 = var9;
                     if(var10 == null) {
                        break label147;
                     }

                     if(!var9) {
                        break label143;
                     }
                  }

                  var18 = this;
                  if(var10 == null) {
                     break label144;
                  }

                  var17 = this.method_7475();
               }
            }

            if(var17) {
               label148: {
                  this.field_7276.method_5288().bindTexture(field_7275);
                  Gui.drawRect(var2, var3, var2 + 32, var3 + 32, -1601138544);
                  GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
                  int var11 = var7 - var2;
                  var12 = var8 - var3;
                  var17 = this.method_7476();
                  int var10001;
                  int var19;
                  if(var10 != null) {
                     if(var17) {
                        var19 = var11;
                        var10001 = 32;
                        if(var10 != null) {
                           if(var11 < 32) {
                              Gui.method_660(var2, var3, 0.0F, 32.0F, 32, 32, 256.0F, 256.0F);
                              if(var10 != null) {
                                 break label148;
                              }
                           }

                           var19 = var2;
                           var10001 = var3;
                        }

                        Gui.method_660(var19, var10001, 0.0F, 0.0F, 32, 32, 256.0F, 256.0F);
                        if(var10 != null) {
                           break label148;
                        }
                     }

                     var17 = this.method_7477();
                  }

                  if(var10 != null) {
                     if(var17) {
                        label110: {
                           var19 = var11;
                           var10001 = 16;
                           if(var10 != null) {
                              if(var11 < 16) {
                                 Gui.method_660(var2, var3, 32.0F, 32.0F, 32, 32, 256.0F, 256.0F);
                                 if(var10 != null) {
                                    break label110;
                                 }
                              }

                              var19 = var2;
                              var10001 = var3;
                           }

                           Gui.method_660(var19, var10001, 32.0F, 0.0F, 32, 32, 256.0F, 256.0F);
                        }
                     }

                     var17 = this.method_7478();
                  }

                  if(var10 != null) {
                     if(var17) {
                        label103: {
                           var19 = var11;
                           var10001 = 32;
                           if(var10 != null) {
                              label101: {
                                 if(var11 < 32) {
                                    var19 = var11;
                                    var10001 = 16;
                                    if(var10 == null) {
                                       break label101;
                                    }

                                    if(var11 > 16) {
                                       var19 = var12;
                                       var10001 = 16;
                                       if(var10 == null) {
                                          break label101;
                                       }

                                       if(var12 < 16) {
                                          Gui.method_660(var2, var3, 96.0F, 32.0F, 32, 32, 256.0F, 256.0F);
                                          if(var10 != null) {
                                             break label103;
                                          }
                                       }
                                    }
                                 }

                                 var19 = var2;
                                 var10001 = var3;
                              }
                           }

                           Gui.method_660(var19, var10001, 96.0F, 0.0F, 32, 32, 256.0F, 256.0F);
                        }
                     }

                     var18 = this;
                     if(var10 == null) {
                        break label144;
                     }

                     var17 = this.method_7479();
                  }

                  if(var17) {
                     label89: {
                        var19 = var11;
                        var10001 = 32;
                        if(var10 != null) {
                           label87: {
                              if(var11 < 32) {
                                 var19 = var11;
                                 var10001 = 16;
                                 if(var10 == null) {
                                    break label87;
                                 }

                                 if(var11 > 16) {
                                    var19 = var12;
                                    var10001 = 16;
                                    if(var10 == null) {
                                       break label87;
                                    }

                                    if(var12 > 16) {
                                       Gui.method_660(var2, var3, 64.0F, 32.0F, 32, 32, 256.0F, 256.0F);
                                       if(var10 != null) {
                                          break label89;
                                       }
                                    }
                                 }
                              }

                              var19 = var2;
                              var10001 = var3;
                           }
                        }

                        Gui.method_660(var19, var10001, 64.0F, 0.0F, 32, 32, 256.0F, 256.0F);
                     }
                  }
               }
            }
         }

         var18 = this;
      }

      String var16 = var18.method_7473();
      var12 = this.field_7276.enableBackgroundDrawing4.getCharWidth(var16);
      if(var10 != null) {
         if(var12 > 157) {
            StringBuilder var20 = new StringBuilder();
            String[] var15 = field_7278;
            var16 = var20.append(this.field_7276.enableBackgroundDrawing4.trimStringToWidth(var16, 157 - this.field_7276.enableBackgroundDrawing4.getCharWidth("..."))).append("...").toString();
         }

         this.field_7276.enableBackgroundDrawing4.drawStringWithShadow(var16, var2 + 32 + 2, var3 + 1, 16777215);
      }

      List var13 = this.field_7276.enableBackgroundDrawing4.listFormattedStringToWidth(this.method_7472(), 157);
      int var14 = 0;

      while(var14 < 2) {
         if(var10 != null) {
            if(var14 >= var13.size()) {
               break;
            }

            this.field_7276.enableBackgroundDrawing4.drawStringWithShadow((String)var13.get(var14), var2 + 32 + 2, var3 + 12 + 10 * var14, 8421504);
         }

         ++var14;
         if(var10 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: b () java.lang.String
   protected abstract String method_7472();

   // $FF: renamed from: c () java.lang.String
   protected abstract String method_7473();

   // $FF: renamed from: d () void
   protected abstract void method_7474();

   // $FF: renamed from: e () boolean
   protected boolean method_7475() {
      return true;
   }

   // $FF: renamed from: f () boolean
   protected boolean method_7476() {
      String[] var1 = class_752.method_4253();
      boolean var10000 = this.field_7277.method_1002(this);
      if(var1 != null) {
         var10000 = !var10000;
      }

      return var10000;
   }

   // $FF: renamed from: g () boolean
   protected boolean method_7477() {
      return this.field_7277.method_1002(this);
   }

   // $FF: renamed from: h () boolean
   protected boolean method_7478() {
      int var4;
      label24: {
         String[] var10000 = class_752.method_4253();
         List var2 = this.field_7277.method_1003(this);
         String[] var1 = var10000;
         int var3 = var2.indexOf(this);
         var4 = var3;
         if(var1 != null) {
            if(var3 <= 0) {
               break label24;
            }

            var4 = ((class_1371)var2.get(var3 - 1)).method_7475();
         }

         if(var1 == null) {
            return (boolean)var4;
         }

         if(var4 != 0) {
            var4 = 1;
            return (boolean)var4;
         }
      }

      var4 = 0;
      return (boolean)var4;
   }

   // $FF: renamed from: i () boolean
   protected boolean method_7479() {
      int var10000;
      label32: {
         List var2 = this.field_7277.method_1003(this);
         String[] var1 = class_752.method_4253();
         int var3 = var2.indexOf(this);
         var10000 = var3;
         if(var1 != null) {
            if(var3 < 0) {
               break label32;
            }

            var10000 = var3;
         }

         if(var1 != null) {
            if(var10000 >= var2.size() - 1) {
               break label32;
            }

            var10000 = ((class_1371)var2.get(var3 + 1)).method_7475();
         }

         if(var1 == null) {
            return (boolean)var10000;
         }

         if(var10000 != 0) {
            var10000 = 1;
            return (boolean)var10000;
         }
      }

      var10000 = 0;
      return (boolean)var10000;
   }

   // $FF: renamed from: b (int, int, int, int, int, int) boolean
   public boolean method_148(int var1, int var2, int var3, int var4, int var5, int var6) {
      String[] var7 = class_752.method_4253();
      int var10000 = this.method_7475();
      if(var7 != null) {
         if(var10000 != 0) {
            var10000 = var5;
            if(var7 == null) {
               return (boolean)var10000;
            }

            if(var5 <= 32) {
               var10000 = this.method_7476();
               if(var7 != null) {
                  if(var10000 != 0) {
                     this.field_7277.method_1003(this).remove(this);
                     this.field_7277.method_1005().add(0, this);
                     return true;
                  }

                  var10000 = var5;
               }

               byte var10001 = 16;
               if(var7 != null) {
                  label47: {
                     if(var10000 < 16) {
                        var10000 = this.method_7477();
                        if(var7 == null) {
                           break label47;
                        }

                        if(var10000 != 0) {
                           this.field_7277.method_1003(this).remove(this);
                           this.field_7277.method_1004().add(0, this);
                           return true;
                        }
                     }

                     var10000 = var5;
                  }

                  var10001 = 16;
               }

               List var8;
               int var9;
               if(var7 != null) {
                  label81: {
                     label69: {
                        if(var10000 > var10001) {
                           var10000 = var6;
                           var10001 = 16;
                           if(var7 == null) {
                              break label81;
                           }

                           if(var6 < 16) {
                              var10000 = this.method_7478();
                              if(var7 == null) {
                                 break label69;
                              }

                              if(var10000 != 0) {
                                 var8 = this.field_7277.method_1003(this);
                                 var9 = var8.indexOf(this);
                                 var8.remove(this);
                                 var8.add(var9 - 1, this);
                                 return true;
                              }
                           }
                        }

                        var10000 = var5;
                     }

                     if(var7 == null) {
                        return (boolean)var10000;
                     }

                     var10001 = 16;
                  }
               }

               if(var10000 > var10001) {
                  var10000 = var6;
                  if(var7 == null) {
                     return (boolean)var10000;
                  }

                  if(var6 > 16) {
                     var10000 = this.method_7479();
                     if(var7 == null) {
                        return (boolean)var10000;
                     }

                     if(var10000 != 0) {
                        var8 = this.field_7277.method_1003(this);
                        var9 = var8.indexOf(this);
                        var8.remove(this);
                        var8.add(var9 + 1, this);
                        return true;
                     }
                  }
               }
            }
         }

         var10000 = 0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: c (int, int, int, int, int, int) void
   public void method_149(int var1, int var2, int var3, int var4, int var5, int var6) {}

   // $FF: renamed from: <clinit> () void
   static void method_7480() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "UÐÄL\fCRÛMËTDÆÓMC~ÅÝ[\bQÛÛ";
      int var4 = "UÐÄL\fCRÛMËTDÆÓMC~ÅÝ[\bQÛÛ".length();
      char var1 = 3;
      int var0 = -1;

      while(true) {
         ++var0;
         String var10002 = var2.substring(var0, var0 + var1);
         boolean var10000 = true;
         char[] var10003 = var10002.toCharArray();
         Object var10004 = var10003.length;
         String[] var10 = true;
         char[] var9 = var10003;
         char[] var10001 = (char[])var10004;
         int var6 = 0;

         while(true) {
            var10003 = var9;
            var9 = var10001;
            var10001 = var10003;
            char[] var11 = var9;
            var9 = var10003;
            if(var10003 <= var6) {
               var5[var3++] = (new String((char[])var10)).intern();
               if((var0 += var1) >= var4) {
                  field_7278 = var5;
                  bqx var8 = new bqx;
                  var10 = field_7278;
                  var8.method_8227("textures/gui/resource_packs.png");
                  field_7275 = var8;
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)var10[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 131;
               break;
            case 1:
               var10009 = 23;
               break;
            case 2:
               var10009 = 30;
               break;
            case 3:
               var10009 = 154;
               break;
            case 4:
               var10009 = 219;
               break;
            case 5:
               var10009 = 70;
               break;
            default:
               var10009 = 132;
            }

            var10[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}
