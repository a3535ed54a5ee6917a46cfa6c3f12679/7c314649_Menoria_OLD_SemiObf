import java.util.ArrayList;
import java.util.List;
import org.lwjgl.opengl.GL11;

public class bix {

   // $FF: renamed from: a float
   public float field_6541;
   // $FF: renamed from: b float
   public float field_6542;
   // $FF: renamed from: r int
   private int field_6543;
   // $FF: renamed from: s int
   private int field_6544;
   // $FF: renamed from: c float
   public float field_6545;
   // $FF: renamed from: d float
   public float field_6546;
   // $FF: renamed from: e float
   public float field_6547;
   // $FF: renamed from: f float
   public float field_6548;
   // $FF: renamed from: g float
   public float field_6549;
   // $FF: renamed from: h float
   public float field_6550;
   // $FF: renamed from: t boolean
   private boolean field_6551;
   // $FF: renamed from: u int
   private int field_6552;
   // $FF: renamed from: i boolean
   public boolean field_6553;
   // $FF: renamed from: j boolean
   public boolean field_6554;
   // $FF: renamed from: k boolean
   public boolean field_6555;
   // $FF: renamed from: l java.util.List
   public List field_6556;
   // $FF: renamed from: m java.util.List
   public List field_6557;
   // $FF: renamed from: n java.lang.String
   public final String field_6558;
   // $FF: renamed from: v bhr
   private bhr field_6559;
   // $FF: renamed from: o float
   public float field_6560;
   // $FF: renamed from: p float
   public float field_6561;
   // $FF: renamed from: q float
   public float field_6562;
   private static final String __OBFID = "CL_00000874";


   // $FF: renamed from: <init> (bhr, java.lang.String) void
   public void method_6637(bhr var1, String var2) {
      super();
      this.field_6541 = 64.0F;
      this.field_6542 = 32.0F;
      this.field_6554 = true;
      this.field_6556 = new ArrayList();
      this.field_6559 = var1;
      var1.field_6261.add(this);
      this.field_6558 = var2;
      this.method_6650(var1.field_6264, var1.field_6265);
   }

   // $FF: renamed from: <init> (bhr) void
   public void method_6638(bhr var1) {
      this.method_6637(var1, (String)null);
   }

   // $FF: renamed from: <init> (bhr, int, int) void
   public void method_6639(bhr var1, int var2, int var3) {
      this.method_6638(var1);
      this.method_6641(var2, var3);
   }

   // $FF: renamed from: a (bix) void
   public void method_6640(bix var1) {
      if(this.field_6557 == null) {
         this.field_6557 = new ArrayList();
      }

      this.field_6557.add(var1);
   }

   // $FF: renamed from: a (int, int) bix
   public bix method_6641(int var1, int var2) {
      this.field_6543 = var1;
      this.field_6544 = var2;
      return this;
   }

   // $FF: renamed from: a (java.lang.String, float, float, float, int, int, int) bix
   public bix method_6642(String var1, float var2, float var3, float var4, int var5, int var6, int var7) {
      var1 = this.field_6558 + "." + var1;
      class_1431 var8 = this.field_6559.method_6516(var1);
      this.method_6641(var8.field_7596, var8.field_7597);
      List var10000 = this.field_6556;
      class_1430 var10001 = new class_1430;
      var10001.method_7787(this, this.field_6543, this.field_6544, var2, var3, var4, var5, var6, var7, 0.0F);
      var10000.add(var10001.method_7789(var1));
      return this;
   }

   // $FF: renamed from: a (float, float, float, int, int, int) bix
   public bix method_6643(float var1, float var2, float var3, int var4, int var5, int var6) {
      List var10000 = this.field_6556;
      class_1430 var10001 = new class_1430;
      var10001.method_7787(this, this.field_6543, this.field_6544, var1, var2, var3, var4, var5, var6, 0.0F);
      var10000.add(var10001);
      return this;
   }

   // $FF: renamed from: a (float, float, float, int, int, int, float) void
   public void method_6644(float var1, float var2, float var3, int var4, int var5, int var6, float var7) {
      List var10000 = this.field_6556;
      class_1430 var10001 = new class_1430;
      var10001.method_7787(this, this.field_6543, this.field_6544, var1, var2, var3, var4, var5, var6, var7);
      var10000.add(var10001);
   }

   // $FF: renamed from: a (float, float, float) void
   public void method_6645(float var1, float var2, float var3) {
      this.field_6545 = var1;
      this.field_6546 = var2;
      this.field_6547 = var3;
   }

   // $FF: renamed from: a (float) void
   public void method_6646(float var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = this.field_6555;
      if(var2 != null) {
         if(this.field_6555) {
            return;
         }

         var10000 = this.field_6554;
      }

      if(var2 != null) {
         if(var10000 == 0) {
            return;
         }

         var10000 = this.field_6551;
      }

      if(var2 != null) {
         if(var10000 == 0) {
            this.method_6649(var1);
         }

         GL11.glTranslatef(this.field_6560, this.field_6561, this.field_6562);
         float var5;
         var10000 = (var5 = this.field_6548 - 0.0F) == 0.0F?0:(var5 < 0.0F?-1:1);
      }

      bix var4;
      label148: {
         label163: {
            int var3;
            if(var2 != null) {
               label145: {
                  if(var10000 == 0) {
                     float var6;
                     var10000 = (var6 = this.field_6549 - 0.0F) == 0.0F?0:(var6 < 0.0F?-1:1);
                     if(var2 == null) {
                        break label145;
                     }

                     if(var10000 == 0) {
                        float var7;
                        var10000 = (var7 = this.field_6550 - 0.0F) == 0.0F?0:(var7 < 0.0F?-1:1);
                        if(var2 == null) {
                           break label145;
                        }

                        if(var10000 == 0) {
                           float var8;
                           var10000 = (var8 = this.field_6545 - 0.0F) == 0.0F?0:(var8 < 0.0F?-1:1);
                           if(var2 != null) {
                              label134: {
                                 if(var10000 == 0) {
                                    float var9;
                                    var10000 = (var9 = this.field_6546 - 0.0F) == 0.0F?0:(var9 < 0.0F?-1:1);
                                    if(var2 == null) {
                                       break label134;
                                    }

                                    if(var10000 == 0) {
                                       float var10;
                                       var10000 = (var10 = this.field_6547 - 0.0F) == 0.0F?0:(var10 < 0.0F?-1:1);
                                       if(var2 == null) {
                                          break label134;
                                       }

                                       if(var10000 == 0) {
                                          GL11.glCallList(this.field_6552);
                                          var4 = this;
                                          if(var2 == null) {
                                             break label148;
                                          }

                                          if(this.field_6557 == null) {
                                             break label163;
                                          }

                                          var3 = 0;

                                          do {
                                             if(var3 >= this.field_6557.size()) {
                                                break label163;
                                             }

                                             ((bix)this.field_6557.get(var3)).method_6646(var1);
                                             ++var3;
                                             if(var2 == null) {
                                                return;
                                             }
                                          } while(var2 != null);
                                       }
                                    }
                                 }

                                 GL11.glTranslatef(this.field_6545 * var1, this.field_6546 * var1, this.field_6547 * var1);
                                 var10000 = this.field_6552;
                              }
                           }

                           label108: {
                              GL11.glCallList(var10000);
                              var4 = this;
                              if(var2 != null) {
                                 if(this.field_6557 != null) {
                                    var3 = 0;

                                    while(var3 < this.field_6557.size()) {
                                       ((bix)this.field_6557.get(var3)).method_6646(var1);
                                       ++var3;
                                       if(var2 == null) {
                                          break label108;
                                       }

                                       if(var2 == null) {
                                          break;
                                       }
                                    }
                                 }

                                 var4 = this;
                              }

                              GL11.glTranslatef(-var4.field_6545 * var1, -this.field_6546 * var1, -this.field_6547 * var1);
                           }

                           if(var2 != null) {
                              break label163;
                           }
                        }
                     }
                  }

                  GL11.glPushMatrix();
                  GL11.glTranslatef(this.field_6545 * var1, this.field_6546 * var1, this.field_6547 * var1);
                  float var11;
                  var10000 = (var11 = this.field_6550 - 0.0F) == 0.0F?0:(var11 < 0.0F?-1:1);
               }
            }

            if(var2 != null) {
               if(var10000 != 0) {
                  GL11.glRotatef(this.field_6550 * 57.295776F, 0.0F, 0.0F, 1.0F);
               }

               float var12;
               var10000 = (var12 = this.field_6549 - 0.0F) == 0.0F?0:(var12 < 0.0F?-1:1);
            }

            if(var2 != null) {
               if(var10000 != 0) {
                  GL11.glRotatef(this.field_6549 * 57.295776F, 0.0F, 1.0F, 0.0F);
               }

               float var13;
               var10000 = (var13 = this.field_6548 - 0.0F) == 0.0F?0:(var13 < 0.0F?-1:1);
            }

            if(var2 != null) {
               if(var10000 != 0) {
                  GL11.glRotatef(this.field_6548 * 57.295776F, 1.0F, 0.0F, 0.0F);
               }

               var10000 = this.field_6552;
            }

            label168: {
               if(var2 != null) {
                  GL11.glCallList(var10000);
                  if(this.field_6557 == null) {
                     break label168;
                  }

                  var10000 = 0;
               }

               var3 = var10000;

               while(var3 < this.field_6557.size()) {
                  ((bix)this.field_6557.get(var3)).method_6646(var1);
                  ++var3;
                  if(var2 == null) {
                     break label163;
                  }

                  if(var2 == null) {
                     break;
                  }
               }
            }

            GL11.glPopMatrix();
         }

         var4 = this;
      }

      GL11.glTranslatef(-var4.field_6560, -this.field_6561, -this.field_6562);
   }

   // $FF: renamed from: b (float) void
   public void method_6647(float var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = this.field_6555;
      if(var2 != null) {
         if(this.field_6555) {
            return;
         }

         var10000 = this.field_6554;
      }

      if(var2 != null) {
         if(var10000 == 0) {
            return;
         }

         var10000 = this.field_6551;
      }

      if(var2 != null) {
         if(var10000 == 0) {
            this.method_6649(var1);
         }

         GL11.glPushMatrix();
         GL11.glTranslatef(this.field_6545 * var1, this.field_6546 * var1, this.field_6547 * var1);
         float var3;
         var10000 = (var3 = this.field_6549 - 0.0F) == 0.0F?0:(var3 < 0.0F?-1:1);
      }

      if(var2 != null) {
         if(var10000 != 0) {
            GL11.glRotatef(this.field_6549 * 57.295776F, 0.0F, 1.0F, 0.0F);
         }

         float var4;
         var10000 = (var4 = this.field_6548 - 0.0F) == 0.0F?0:(var4 < 0.0F?-1:1);
      }

      if(var2 != null) {
         if(var10000 != 0) {
            GL11.glRotatef(this.field_6548 * 57.295776F, 1.0F, 0.0F, 0.0F);
         }

         float var5;
         var10000 = (var5 = this.field_6550 - 0.0F) == 0.0F?0:(var5 < 0.0F?-1:1);
      }

      if(var2 != null) {
         if(var10000 != 0) {
            GL11.glRotatef(this.field_6550 * 57.295776F, 0.0F, 0.0F, 1.0F);
         }

         var10000 = this.field_6552;
      }

      GL11.glCallList(var10000);
      GL11.glPopMatrix();
   }

   // $FF: renamed from: c (float) void
   public void method_6648(float var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = this.field_6555;
      if(var2 != null) {
         if(this.field_6555) {
            return;
         }

         var10000 = this.field_6554;
      }

      if(var2 != null) {
         if(var10000 == 0) {
            return;
         }

         var10000 = this.field_6551;
      }

      if(var2 != null) {
         if(var10000 == 0) {
            this.method_6649(var1);
         }

         float var4;
         var10000 = (var4 = this.field_6548 - 0.0F) == 0.0F?0:(var4 < 0.0F?-1:1);
      }

      float var10001;
      float var3;
      if(var2 != null) {
         label81: {
            if(var10000 == 0) {
               float var5;
               var10000 = (var5 = this.field_6549 - 0.0F) == 0.0F?0:(var5 < 0.0F?-1:1);
               if(var2 == null) {
                  break label81;
               }

               if(var10000 == 0) {
                  float var6;
                  var10000 = (var6 = this.field_6550 - 0.0F) == 0.0F?0:(var6 < 0.0F?-1:1);
                  if(var2 == null) {
                     break label81;
                  }

                  if(var10000 == 0) {
                     var3 = this.field_6545;
                     var10001 = 0.0F;
                     if(var2 != null) {
                        label70: {
                           if(this.field_6545 == 0.0F) {
                              var3 = this.field_6546;
                              var10001 = 0.0F;
                              if(var2 == null) {
                                 break label70;
                              }

                              if(this.field_6546 == 0.0F) {
                                 var3 = this.field_6547;
                                 var10001 = 0.0F;
                                 if(var2 == null) {
                                    break label70;
                                 }

                                 if(this.field_6547 == 0.0F) {
                                    return;
                                 }
                              }
                           }

                           var3 = this.field_6545 * var1;
                           var10001 = this.field_6546 * var1;
                        }
                     }

                     GL11.glTranslatef(var3, var10001, this.field_6547 * var1);
                     if(var2 != null) {
                        return;
                     }
                  }
               }
            }

            GL11.glTranslatef(this.field_6545 * var1, this.field_6546 * var1, this.field_6547 * var1);
            float var7;
            var10000 = (var7 = this.field_6550 - 0.0F) == 0.0F?0:(var7 < 0.0F?-1:1);
         }
      }

      if(var2 != null) {
         if(var10000 != 0) {
            GL11.glRotatef(this.field_6550 * 57.295776F, 0.0F, 0.0F, 1.0F);
         }

         float var8;
         var10000 = (var8 = this.field_6549 - 0.0F) == 0.0F?0:(var8 < 0.0F?-1:1);
      }

      label97: {
         if(var2 != null) {
            if(var10000 != 0) {
               GL11.glRotatef(this.field_6549 * 57.295776F, 0.0F, 1.0F, 0.0F);
            }

            var3 = this.field_6548;
            var10001 = 0.0F;
            if(var2 == null) {
               break label97;
            }

            float var9;
            var10000 = (var9 = this.field_6548 - 0.0F) == 0.0F?0:(var9 < 0.0F?-1:1);
         }

         if(var10000 == 0) {
            return;
         }

         var3 = this.field_6548 * 57.295776F;
         var10001 = 1.0F;
      }

      GL11.glRotatef(var3, var10001, 0.0F, 0.0F);
   }

   // $FF: renamed from: d (float) void
   private void method_6649(float var1) {
      this.field_6552 = ban.method_5195(1);
      String[] var10000 = class_752.method_4253();
      GL11.glNewList(this.field_6552, 4864);
      bmh var3 = bmh.instance;
      int var4 = 0;
      String[] var2 = var10000;

      while(true) {
         if(var4 < this.field_6556.size()) {
            ((class_1430)this.field_6556.get(var4)).method_7788(var3, var1);
            ++var4;
            if(var2 == null) {
               break;
            }

            if(var2 != null) {
               continue;
            }
         }

         GL11.glEndList();
         this.field_6551 = true;
         break;
      }

   }

   // $FF: renamed from: b (int, int) bix
   public bix method_6650(int var1, int var2) {
      this.field_6541 = (float)var1;
      this.field_6542 = (float)var2;
      return this;
   }

   // $FF: renamed from: <clinit> () void
   static void method_6651() {
      boolean var10000 = true;
      char[] var10003 = "Á¸]Näå³²Ì5J".toCharArray();
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
            __OBFID = (new String((char[])var4)).intern();
            String var2 = __OBFID;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 239;
            break;
         case 1:
            var10009 = 153;
            break;
         case 2:
            var10009 = 111;
            break;
         case 3:
            var10009 = 19;
            break;
         case 4:
            var10009 = 185;
            break;
         case 5:
            var10009 = 184;
            break;
         default:
            var10009 = 238;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
