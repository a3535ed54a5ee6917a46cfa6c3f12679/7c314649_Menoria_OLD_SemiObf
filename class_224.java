import java.util.Iterator;
import java.util.List;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GL11;

// $FF: renamed from: lJ
public class class_224 extends class_215 {

   // $FF: renamed from: S org.apache.logging.log4j.Logger
   private static final Logger field_1179;
   // $FF: renamed from: T bqx
   private static final bqx field_1180;
   // $FF: renamed from: U gk
   private class_596 field_1181;
   // $FF: renamed from: V k6
   private class_147 field_1182;
   // $FF: renamed from: W boolean
   private boolean field_1183;
   // $FF: renamed from: X java.lang.String
   private static final String field_1184;
   // $FF: renamed from: Y java.lang.String[]
   private static final String[] field_1185;


   // $FF: renamed from: <init> (Af, gk) void
   public void method_1216(class_666 var1, class_596 var2) {
      class_674 var10001 = new class_674;
      var10001.method_3685(var1, var2);
      super.method_1192(var10001);
      this.field_1181 = var2;
      this.field_1105 = 230;
      this.field_1106 = 219;
   }

   // $FF: renamed from: b () void
   public void initGui() {
      super.initGui();
      List var10000 = this.buttonList;
      class_147 var10002 = new class_147;
      var10002.method_769(this, -1, this.field_1108 + 164, this.field_1109 + 107);
      var10000.add(this.field_1182 = var10002);
      var10000 = this.buttonList;
      class_148 var10001 = new class_148;
      var10001.method_770(this, -2, this.field_1108 + 190, this.field_1109 + 107);
      var10000.add(var10001);
      this.field_1183 = true;
      this.field_1182.field_451 = false;
   }

   // $FF: renamed from: e () void
   public void method_871() {
      super.method_871();
      String[] var1 = class_752.method_4253();
      class_224 var10000 = this;
      int var10001;
      if(var1 != null) {
         label129: {
            if(this.field_1183) {
               var10000 = this;
               if(var1 == null) {
                  break label129;
               }

               if(this.field_1181.method_3179() >= 0) {
                  this.field_1183 = false;
                  int var7 = 0;

                  int var2;
                  int var3;
                  int var4;
                  int var5;
                  class_146 var6;
                  int var9;
                  byte var10;
                  class_146 var11;
                  label100:
                  while(true) {
                     var9 = var7;
                     var10001 = 2;

                     label97:
                     while(var9 <= var10001) {
                        var2 = class_596.field_2547[var7].length;
                        var3 = var2 * 22 + (var2 - 1) * 2;
                        var10 = 0;
                        if(var1 == null) {
                           break label100;
                        }

                        var4 = 0;

                        while(var4 < var2) {
                           var5 = class_596.field_2547[var7][var4].field_8526;
                           var11 = new class_146;
                           var11.method_768(this, var7 << 8 | var5, this.field_1108 + 76 + var4 * 24 - var3 / 2, this.field_1109 + 22 + var7 * 25, var5, var7);
                           var6 = var11;
                           this.buttonList.add(var6);
                           var9 = var7;
                           var10001 = this.field_1181.method_3179();
                           if(var1 == null) {
                              continue label97;
                           }

                           label91: {
                              if(var1 != null) {
                                 if(var7 >= var10001) {
                                    var6.field_451 = false;
                                    if(var1 != null) {
                                       break label91;
                                    }
                                 }

                                 var9 = var5;
                                 var10001 = this.field_1181.method_3177();
                              }

                              if(var9 == var10001) {
                                 var6.method_767(true);
                              }
                           }

                           ++var4;
                           if(var1 == null) {
                              break;
                           }
                        }

                        ++var7;
                        if(var1 != null) {
                           continue label100;
                        }
                        break;
                     }

                     var7 = 3;
                     var2 = class_596.field_2547[var7].length + 1;
                     var3 = var2 * 22 + (var2 - 1) * 2;
                     var10 = 0;
                     break;
                  }

                  var4 = var10;

                  while(true) {
                     if(var4 < var2 - 1) {
                        var5 = class_596.field_2547[var7][var4].field_8526;
                        var11 = new class_146;
                        var11.method_768(this, var7 << 8 | var5, this.field_1108 + 167 + var4 * 24 - var3 / 2, this.field_1109 + 47, var5, var7);
                        var6 = var11;
                        this.buttonList.add(var6);
                        var9 = var7;
                        if(var1 == null) {
                           break;
                        }

                        label73: {
                           var10001 = this.field_1181.method_3179();
                           if(var1 != null) {
                              if(var7 >= var10001) {
                                 var6.field_451 = false;
                                 if(var1 != null) {
                                    break label73;
                                 }
                              }

                              var9 = var5;
                              var10001 = this.field_1181.method_3178();
                           }

                           if(var9 == var10001) {
                              var6.method_767(true);
                           }
                        }

                        ++var4;
                        if(var1 != null) {
                           continue;
                        }
                     }

                     var10000 = this;
                     if(var1 == null) {
                        break label129;
                     }

                     var9 = this.field_1181.method_3177();
                     break;
                  }

                  if(var9 > 0) {
                     label114: {
                        var11 = new class_146;
                        var11.method_768(this, var7 << 8 | this.field_1181.method_3177(), this.field_1108 + 167 + (var2 - 1) * 24 - var3 / 2, this.field_1109 + 47, this.field_1181.method_3177(), var7);
                        class_146 var8 = var11;
                        this.buttonList.add(var8);
                        var9 = var7;
                        var10001 = this.field_1181.method_3179();
                        if(var1 != null) {
                           if(var7 >= var10001) {
                              var8.field_451 = false;
                              if(var1 != null) {
                                 break label114;
                              }
                           }

                           var10000 = this;
                           if(var1 == null) {
                              break label129;
                           }

                           var9 = this.field_1181.method_3177();
                           var10001 = this.field_1181.method_3178();
                        }

                        if(var9 == var10001) {
                           var8.method_767(true);
                        }
                     }
                  }
               }
            }

            var10000 = this;
         }
      }

      class_147 var13;
      label66: {
         label140: {
            var13 = var10000.field_1182;
            class_596 var12 = this.field_1181;
            if(var1 != null) {
               if(this.field_1181.method_84(0) == null) {
                  break label140;
               }

               var12 = this.field_1181;
            }

            var10001 = var12.method_3177();
            if(var1 == null) {
               break label66;
            }

            if(var10001 > 0) {
               var10001 = 1;
               break label66;
            }
         }

         var10001 = 0;
      }

      var13.field_451 = (boolean)var10001;
   }

   // $FF: renamed from: a (bcb) void
   protected void method_865(bcb param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (int, int) void
   protected void method_1194(int var1, int var2) {
      bam.method_5212();
      String[] var6 = field_1185;
      this.drawCenteredString(this.fontRendererObj, class_1450.method_7896("tile.beacon.primary", new Object[0]), 62, 10, 14737632);
      String[] var3 = class_752.method_4253();
      this.drawCenteredString(this.fontRendererObj, class_1450.method_7896("tile.beacon.secondary", new Object[0]), 169, 10, 14737632);
      Iterator var4 = this.buttonList.iterator();

      while(true) {
         if(var4.hasNext()) {
            label32: {
               bcb var5 = (bcb)var4.next();
               if(var3 == null) {
                  break;
               }

               label23: {
                  bcb var10000 = var5;
                  if(var3 != null) {
                     if(!var5.method_754()) {
                        break label23;
                     }

                     var10000 = var5;
                  }

                  var10000.method_755(var1 - this.field_1108, var2 - this.field_1109);
                  if(var3 != null) {
                     break label32;
                  }
               }

               if(var3 != null) {
                  continue;
               }
            }
         }

         bam.method_5216();
         break;
      }

   }

   // $FF: renamed from: b (float, int, int) void
   protected void method_1195(float var1, int var2, int var3) {
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.field_557.method_5288().bindTexture(field_1180);
      int var4 = (this.width - this.field_1105) / 2;
      int var5 = (this.height - this.field_1106) / 2;
      this.method_658(var4, var5, 0, 0, this.field_1105, this.field_1106);
      field_556.field_3806 = 100.0F;
      class_811 var10000 = field_556;
      FontRenderer var10001 = this.fontRendererObj;
      bqf var10002 = this.field_557.method_5288();
      add var10003 = new add;
      var10003.method_3724(class_1010.field_5244);
      var10000.method_4756(var10001, var10002, var10003, var4 + 42, var5 + 109);
      var10000 = field_556;
      var10001 = this.fontRendererObj;
      var10002 = this.field_557.method_5288();
      var10003 = new add;
      var10003.method_3724(class_1010.field_5122);
      var10000.method_4756(var10001, var10002, var10003, var4 + 42 + 22, var5 + 109);
      var10000 = field_556;
      var10001 = this.fontRendererObj;
      var10002 = this.field_557.method_5288();
      var10003 = new add;
      var10003.method_3724(class_1010.field_5124);
      var10000.method_4756(var10001, var10002, var10003, var4 + 42 + 44, var5 + 109);
      var10000 = field_556;
      var10001 = this.fontRendererObj;
      var10002 = this.field_557.method_5288();
      var10003 = new add;
      var10003.method_3724(class_1010.field_5123);
      var10000.method_4756(var10001, var10002, var10003, var4 + 42 + 66, var5 + 109);
      field_556.field_3806 = 0.0F;
   }

   // $FF: renamed from: g () bqx
   static bqx method_1217() {
      return field_1180;
   }

   // $FF: renamed from: b (lJ, java.lang.String, int, int) void
   static void method_1218(class_224 var0, String var1, int var2, int var3) {
      var0.method_860(var1, var2, var3);
   }

   // $FF: renamed from: c (lJ, java.lang.String, int, int) void
   static void method_1219(class_224 var0, String var1, int var2, int var3) {
      var0.method_860(var1, var2, var3);
   }

   // $FF: renamed from: d (lJ, java.lang.String, int, int) void
   static void method_1220(class_224 var0, String var1, int var2, int var3) {
      var0.method_860(var1, var2, var3);
   }

   // $FF: renamed from: <clinit> () void
   static void method_1203() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: c (java.lang.Exception) java.lang.Exception
   private static Exception method_1221(Exception var0) {
      return var0;
   }
}
