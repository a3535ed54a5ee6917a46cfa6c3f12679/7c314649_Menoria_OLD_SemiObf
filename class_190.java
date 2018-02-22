import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import java.util.List;
import org.apache.logging.log4j.Logger;
import org.lwjgl.input.Keyboard;

// $FF: renamed from: lY
public class class_190 extends bdw implements class_35 {

   // $FF: renamed from: b org.apache.logging.log4j.Logger
   private static final Logger field_755;
   // $FF: renamed from: i nH
   private final class_1388 field_756;
   // $FF: renamed from: r bdw
   private bdw field_757;
   // $FF: renamed from: s md
   private class_976 field_758;
   // $FF: renamed from: t nG
   private class_1387 field_759;
   // $FF: renamed from: u bcb
   private bcb field_760;
   // $FF: renamed from: v bcb
   private bcb field_761;
   // $FF: renamed from: w bcb
   private bcb field_762;
   // $FF: renamed from: x boolean
   private boolean field_763;
   // $FF: renamed from: y boolean
   private boolean field_764;
   // $FF: renamed from: z boolean
   private boolean field_765;
   // $FF: renamed from: A boolean
   private boolean field_766;
   // $FF: renamed from: B java.lang.String
   private String field_767;
   // $FF: renamed from: C nF
   private class_1386 field_768;
   // $FF: renamed from: D qe
   private class_1528 field_769;
   // $FF: renamed from: E AL
   private class_648 field_770;
   // $FF: renamed from: F boolean
   private boolean field_771;
   // $FF: renamed from: G java.lang.String[]
   private static final String[] field_772;


   // $FF: renamed from: <init> (bdw) void
   public void method_1008(bdw var1) {
      super.method_651();
      class_1388 var10001 = new class_1388;
      var10001.method_7581();
      this.field_756 = var10001;
      this.field_757 = var1;
   }

   // $FF: renamed from: b () void
   public void initGui() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: f () void
   public void method_1009() {
      List var10000 = this.buttonList;
      bcb var10002 = new bcb;
      int var10005 = this.width / 2 - 154;
      int var10006 = this.height - 28;
      String[] var1 = field_772;
      var10002.method_748(7, var10005, var10006, 70, 20, class_1450.method_7896("selectServer.edit", new Object[0]));
      var10000.add(this.field_760 = var10002);
      var10000 = this.buttonList;
      var10002 = new bcb;
      var10002.method_748(2, this.width / 2 - 74, this.height - 28, 70, 20, class_1450.method_7896("selectServer.delete", new Object[0]));
      var10000.add(this.field_762 = var10002);
      var10000 = this.buttonList;
      var10002 = new bcb;
      var10002.method_748(1, this.width / 2 - 154, this.height - 52, 100, 20, class_1450.method_7896("selectServer.select", new Object[0]));
      var10000.add(this.field_761 = var10002);
      var10000 = this.buttonList;
      bcb var10001 = new bcb;
      var10001.method_748(4, this.width / 2 - 50, this.height - 52, 100, 20, class_1450.method_7896("selectServer.direct", new Object[0]));
      var10000.add(var10001);
      var10000 = this.buttonList;
      var10001 = new bcb;
      var10001.method_748(3, this.width / 2 + 4 + 50, this.height - 52, 100, 20, class_1450.method_7896("selectServer.add", new Object[0]));
      var10000.add(var10001);
      var10000 = this.buttonList;
      var10001 = new bcb;
      var10001.method_748(8, this.width / 2 + 4, this.height - 28, 70, 20, class_1450.method_7896("selectServer.refresh", new Object[0]));
      var10000.add(var10001);
      var10000 = this.buttonList;
      var10001 = new bcb;
      var10001.method_748(0, this.width / 2 + 4 + 76, this.height - 28, 75, 20, class_1450.method_7896("gui.cancel", new Object[0]));
      var10000.add(var10001);
      this.method_1013(this.field_758.method_5616());
   }

   // $FF: renamed from: e () void
   public void method_871() {
      String[] var10000 = class_752.method_4253();
      super.method_871();
      String[] var1 = var10000;
      class_190 var3 = this;
      if(var1 != null) {
         if(this.field_769.method_8279()) {
            List var2 = this.field_769.method_8281();
            this.field_769.method_8280();
            this.field_758.method_5618(var2);
         }

         var3 = this;
      }

      var3.field_756.method_7584();
   }

   // $FF: renamed from: m () void
   public void method_872() {
      String[] var10000 = class_752.method_4253();
      Keyboard.enableRepeatEvents(false);
      String[] var1 = var10000;
      class_190 var2 = this;
      if(var1 != null) {
         if(this.field_770 != null) {
            this.field_770.interrupt();
            this.field_770 = null;
         }

         var2 = this;
      }

      var2.field_756.method_7585();
   }

   // $FF: renamed from: a (bcb) void
   protected void method_865(bcb var1) {
      String[] var2;
      class_31 var15;
      int var10000;
      label113: {
         class_976 var14;
         label116: {
            var2 = class_752.method_4253();
            var10000 = var1.field_451;
            if(var2 != null) {
               if(!var1.field_451) {
                  return;
               }

               var14 = this.field_758;
               if(var2 == null) {
                  break label116;
               }

               var10000 = this.field_758.method_5616();
            }

            if(var10000 < 0) {
               var15 = null;
               break label113;
            }

            var14 = this.field_758;
         }

         var15 = var14.method_5606(this.field_758.method_5616());
      }

      class_31 var3 = var15;
      var10000 = var1.field_450;
      byte var10001 = 2;
      String[] var10;
      if(var2 != null) {
         label99: {
            if(var1.field_450 == 2) {
               var10000 = var3 instanceof Gui9;
               if(var2 == null) {
                  break label99;
               }

               if(var10000 != 0) {
                  label90: {
                     String var4 = ((Gui9)var3).setCanLoseFocus9().field_7361;
                     String var17 = var4;
                     if(var2 != null) {
                        if(var4 == null) {
                           break label90;
                        }

                        this.field_763 = true;
                        var10 = field_772;
                        var17 = class_1450.method_7896("selectServer.deleteQuestion", new Object[0]);
                     }

                     String var5 = var17;
                     StringBuilder var19 = (new StringBuilder()).append("\'").append(var4);
                     var10 = field_772;
                     String var6 = var19.append("\' ").append(class_1450.method_7896("selectServer.deleteWarning", new Object[0])).toString();
                     String var7 = class_1450.method_7896("selectServer.deleteButton", new Object[0]);
                     String var8 = class_1450.method_7896("gui.cancel", new Object[0]);
                     class_183 var11 = new class_183;
                     var11.method_970(this, var5, var6, var7, var8, this.field_758.method_5616());
                     class_183 var9 = var11;
                     this.field_557.method_5236(var9);
                  }

                  if(var2 != null) {
                     return;
                  }
               }
            }

            var10000 = var1.field_450;
         }

         var10001 = 1;
      }

      if(var2 != null) {
         if(var10000 == var10001) {
            this.method_1011();
            if(var2 != null) {
               return;
            }
         }

         var10000 = var1.field_450;
         var10001 = 4;
      }

      bao var12;
      class_1386 var10005;
      if(var2 != null) {
         if(var10000 == var10001) {
            this.field_766 = true;
            var12 = this.field_557;
            class_177 var16 = new class_177;
            var10005 = new class_1386;
            var10 = field_772;
            var10005.method_7558(class_1450.method_7896("selectServer.defaultName", new Object[0]), "");
            var16.method_938(this, this.field_768 = var10005);
            var12.method_5236(var16);
            if(var2 != null) {
               return;
            }
         }

         var10000 = var1.field_450;
         var10001 = 3;
      }

      label119: {
         class_175 var18;
         if(var2 != null) {
            if(var10000 == var10001) {
               this.field_764 = true;
               var12 = this.field_557;
               var18 = new class_175;
               var10005 = new class_1386;
               String[] var10007 = field_772;
               var10005.method_7558(class_1450.method_7896("selectServer.defaultName", new Object[0]), "");
               var18.method_934(this, this.field_768 = var10005);
               var12.method_5236(var18);
               if(var2 != null) {
                  return;
               }
            }

            var10000 = var1.field_450;
            if(var2 == null) {
               break label119;
            }

            var10001 = 7;
         }

         if(var10000 == var10001) {
            var10000 = var3 instanceof Gui9;
            if(var2 == null) {
               break label119;
            }

            if(var10000 != 0) {
               this.field_765 = true;
               class_1386 var13 = ((Gui9)var3).setCanLoseFocus9();
               class_1386 var20 = new class_1386;
               var20.method_7558(var13.field_7361, var13.field_7362);
               this.field_768 = var20;
               this.field_768.method_7566(var13);
               var12 = this.field_557;
               var18 = new class_175;
               var18.method_934(this, this.field_768);
               var12.method_5236(var18);
               if(var2 != null) {
                  return;
               }
            }
         }

         var10000 = var1.field_450;
      }

      if(var2 != null) {
         if(var10000 == 0) {
            this.field_557.method_5236(this.field_757);
            if(var2 != null) {
               return;
            }
         }

         var10000 = var1.field_450;
      }

      if(var10000 == 8) {
         this.method_1010();
      }

   }

   // $FF: renamed from: g () void
   private void method_1010() {
      bao var10000 = this.field_557;
      class_190 var10001 = new class_190;
      var10001.method_1008(this.field_757);
      var10000.method_5236(var10001);
   }

   // $FF: renamed from: a (boolean, int) void
   public void method_160(boolean var1, int var2) {
      String[] var3;
      class_31 var6;
      label99: {
         var3 = class_752.method_4253();
         class_976 var10000 = this.field_758;
         if(var3 != null) {
            if(this.field_758.method_5616() < 0) {
               var6 = null;
               break label99;
            }

            var10000 = this.field_758;
         }

         var6 = var10000.method_5606(this.field_758.method_5616());
      }

      class_31 var4 = var6;
      boolean var7 = this.field_763;
      if(var3 != null) {
         if(this.field_763) {
            this.field_763 = false;
            if(var3 != null) {
               if(var1 && var4 instanceof Gui9) {
                  this.field_759.method_7573(this.field_758.method_5616());
                  this.field_759.method_7571();
                  this.field_758.method_5615(-1);
                  this.field_758.method_5617(this.field_759);
               }

               this.field_557.method_5236(this);
            }

            if(var3 != null) {
               return;
            }
         }

         var7 = this.field_766;
      }

      if(var3 != null) {
         if(var7) {
            this.field_766 = false;
            if(var3 != null) {
               if(var1) {
                  this.method_1012(this.field_768);
                  if(var3 != null) {
                     return;
                  }
               }

               this.field_557.method_5236(this);
            }

            if(var3 != null) {
               return;
            }
         }

         var7 = this.field_764;
      }

      if(var3 != null) {
         if(var7) {
            this.field_764 = false;
            if(var3 != null) {
               if(var1) {
                  this.field_759.method_7574(this.field_768);
                  this.field_759.method_7571();
                  this.field_758.method_5615(-1);
                  this.field_758.method_5617(this.field_759);
               }

               this.field_557.method_5236(this);
            }

            if(var3 != null) {
               return;
            }
         }

         var7 = this.field_765;
      }

      class_190 var8;
      label103: {
         if(var3 != null) {
            if(!var7) {
               return;
            }

            var8 = this;
            if(var3 == null) {
               break label103;
            }

            this.field_765 = false;
            var7 = var1;
         }

         if(var7) {
            label57: {
               var6 = var4;
               if(var3 != null) {
                  if(!(var4 instanceof Gui9)) {
                     break label57;
                  }

                  var6 = var4;
               }

               class_1386 var5 = ((Gui9)var6).setCanLoseFocus9();
               var5.field_7361 = this.field_768.field_7361;
               var5.field_7362 = this.field_768.field_7362;
               var5.method_7566(this.field_768);
               this.field_759.method_7571();
               this.field_758.method_5617(this.field_759);
            }
         }

         var8 = this;
      }

      var8.field_557.method_5236(this);
   }

   // $FF: renamed from: a (char, int) void
   protected void method_856(char var1, int var2) {
      int var4 = this.field_758.method_5616();
      String[] var3 = class_752.method_4253();
      class_31 var5 = var4 < 0?null:this.field_758.method_5606(var4);
      int var10000 = var2;
      if(var3 != null) {
         if(var2 == 63) {
            this.method_1010();
            return;
         }

         var10000 = var4;
      }

      label155: {
         if(var3 != null) {
            if(var10000 < 0) {
               break label155;
            }

            var10000 = var2;
         }

         short var10001 = 200;
         class_190 var6;
         if(var3 != null) {
            if(var10000 == 200) {
               var10000 = method_878();
               if(var3 != null) {
                  if(var10000 != 0) {
                     var10000 = var4;
                     if(var3 != null) {
                        if(var4 <= 0) {
                           return;
                        }

                        var10000 = var5 instanceof Gui9;
                     }

                     if(var10000 == 0) {
                        return;
                     }

                     this.field_759.method_7576(var4, var4 - 1);
                     this.method_1013(this.field_758.method_5616() - 1);
                     this.field_758.method_5568(-this.field_758.method_5578());
                     this.field_758.method_5617(this.field_759);
                     if(var3 != null) {
                        return;
                     }
                  }

                  var10000 = var4;
               }

               label158: {
                  if(var3 != null) {
                     if(var10000 <= 0) {
                        break label158;
                     }

                     this.method_1013(this.field_758.method_5616() - 1);
                     this.field_758.method_5568(-this.field_758.method_5578());
                     var10000 = this.field_758.method_5606(this.field_758.method_5616()) instanceof Gui7;
                  }

                  label159: {
                     if(var3 != null) {
                        if(var10000 == 0) {
                           return;
                        }

                        var6 = this;
                        if(var3 == null) {
                           break label159;
                        }

                        var10000 = this.field_758.method_5616();
                     }

                     if(var10000 > 0) {
                        this.method_1013(this.field_758.method_5553() - 1);
                        this.field_758.method_5568(-this.field_758.method_5578());
                        if(var3 != null) {
                           return;
                        }
                     }

                     var6 = this;
                  }

                  var6.method_1013(-1);
                  if(var3 != null) {
                     return;
                  }
               }

               this.method_1013(-1);
               if(var3 != null) {
                  return;
               }
            }

            var10000 = var2;
            var10001 = 208;
         }

         if(var3 != null) {
            if(var10000 == var10001) {
               var10000 = method_878();
               if(var3 != null) {
                  if(var10000 != 0) {
                     if(var4 >= this.field_759.method_7575() - 1) {
                        return;
                     }

                     this.field_759.method_7576(var4, var4 + 1);
                     this.method_1013(var4 + 1);
                     this.field_758.method_5568(this.field_758.method_5578());
                     this.field_758.method_5617(this.field_759);
                     if(var3 != null) {
                        return;
                     }
                  }

                  var10000 = var4;
               }

               label162: {
                  if(var3 != null) {
                     if(var10000 >= this.field_758.method_5553()) {
                        break label162;
                     }

                     this.method_1013(this.field_758.method_5616() + 1);
                     this.field_758.method_5568(this.field_758.method_5578());
                     var10000 = this.field_758.method_5606(this.field_758.method_5616()) instanceof Gui7;
                  }

                  label163: {
                     if(var3 != null) {
                        if(var10000 == 0) {
                           return;
                        }

                        var6 = this;
                        if(var3 == null) {
                           break label163;
                        }

                        var10000 = this.field_758.method_5616();
                     }

                     if(var10000 < this.field_758.method_5553() - 1) {
                        this.method_1013(this.field_758.method_5553() + 1);
                        this.field_758.method_5568(this.field_758.method_5578());
                        if(var3 != null) {
                           return;
                        }
                     }

                     var6 = this;
                  }

                  var6.method_1013(-1);
                  if(var3 != null) {
                     return;
                  }
               }

               this.method_1013(-1);
               if(var3 != null) {
                  return;
               }
            }

            var10000 = var2;
            var10001 = 28;
         }

         label108: {
            label107: {
               if(var3 != null) {
                  if(var10000 == var10001) {
                     break label107;
                  }

                  var10000 = var2;
                  var10001 = 156;
               }

               if(var10000 != var10001) {
                  break label108;
               }
            }

            this.method_865((bcb)this.buttonList.get(2));
            if(var3 != null) {
               return;
            }
         }

         super.method_856(var1, var2);
         if(var3 != null) {
            return;
         }
      }

      super.method_856(var1, var2);
   }

   // $FF: renamed from: a (int, int, float) void
   public void drawScreen(int var1, int var2, float var3) {
      String[] var10000 = class_752.method_4253();
      this.field_767 = null;
      String[] var4 = var10000;
      this.method_873();
      this.field_758.method_5570(var1, var2, var3);
      String[] var10002 = field_772;
      this.drawCenteredString(this.fontRendererObj, class_1450.method_7896("multiplayer.title", new Object[0]), this.width / 2, 20, 16777215);
      super.drawScreen(var1, var2, var3);
      class_190 var5 = this;
      if(var4 != null) {
         if(this.field_767 == null) {
            return;
         }

         var5 = this;
      }

      var5.method_861(Lists.newArrayList(Splitter.on("\n").split(this.field_767)), var1, var2);
   }

   // $FF: renamed from: h () void
   public void method_1011() {
      String[] var1;
      class_31 var4;
      label35: {
         var1 = class_752.method_4253();
         class_976 var10000 = this.field_758;
         if(var1 != null) {
            if(this.field_758.method_5616() < 0) {
               var4 = null;
               break label35;
            }

            var10000 = this.field_758;
         }

         var4 = var10000.method_5606(this.field_758.method_5616());
      }

      label38: {
         class_31 var2 = var4;
         boolean var5 = var2 instanceof Gui9;
         if(var1 != null) {
            if(var5) {
               this.method_1012(((Gui9)var2).setCanLoseFocus9());
               if(var1 != null) {
                  return;
               }
            }

            var4 = var2;
            if(var1 == null) {
               break label38;
            }

            var5 = var2 instanceof Gui8;
         }

         if(!var5) {
            return;
         }

         var4 = var2;
      }

      class_1527 var3 = ((Gui8)var4).setCanLoseFocus5();
      class_1386 var10001 = new class_1386;
      var10001.method_7559(var3.method_8274(), var3.method_8275(), true);
      this.method_1012(var10001);
   }

   // $FF: renamed from: b (nF) void
   private void method_1012(class_1386 var1) {
      bao var10000 = this.field_557;
      class_182 var10001 = new class_182;
      var10001.method_960(this, this.field_557, var1);
      var10000.method_5236(var10001);
   }

   // $FF: renamed from: a (int) void
   public void method_1013(int var1) {
      String[] var2;
      class_31 var4;
      label41: {
         var2 = class_752.method_4253();
         class_976 var10000 = this.field_758;
         int var10001 = var1;
         if(var2 != null) {
            this.field_758.method_5615(var1);
            if(var1 < 0) {
               var4 = null;
               break label41;
            }

            var10000 = this.field_758;
            var10001 = var1;
         }

         var4 = var10000.method_5606(var10001);
      }

      class_31 var3 = var4;
      this.field_761.field_451 = false;
      this.field_760.field_451 = false;
      this.field_762.field_451 = false;
      var4 = var3;
      if(var2 != null) {
         if(var3 == null) {
            return;
         }

         var4 = var3;
      }

      label45: {
         boolean var5 = var4 instanceof Gui7;
         if(var2 != null) {
            if(var5) {
               return;
            }

            this.field_761.field_451 = true;
            if(var2 == null) {
               break label45;
            }

            var5 = var3 instanceof Gui9;
         }

         if(!var5) {
            return;
         }

         this.field_760.field_451 = true;
      }

      this.field_762.field_451 = true;
   }

   // $FF: renamed from: i () nH
   public class_1388 method_1014() {
      return this.field_756;
   }

   // $FF: renamed from: b (java.lang.String) void
   public void method_1015(String var1) {
      this.field_767 = var1;
   }

   // $FF: renamed from: a (int, int, int) void
   protected void method_862(int var1, int var2, int var3) {
      super.method_862(var1, var2, var3);
      this.field_758.method_5604(var1, var2, var3);
   }

   // $FF: renamed from: b (int, int, int) void
   protected void method_863(int var1, int var2, int var3) {
      super.method_863(var1, var2, var3);
      this.field_758.method_5605(var1, var2, var3);
   }

   // $FF: renamed from: j () nG
   public class_1387 method_1016() {
      return this.field_759;
   }

   // $FF: renamed from: <clinit> () void
   static void method_1017() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: c (java.lang.Exception) java.lang.Exception
   private static Exception method_1018(Exception var0) {
      return var0;
   }
}
