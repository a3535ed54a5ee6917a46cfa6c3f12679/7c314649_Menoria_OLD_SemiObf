import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import javax.vecmath.Matrix4f;
import org.apache.logging.log4j.Logger;
import org.lwjgl.BufferUtils;

// $FF: renamed from: o9
public class class_1417 {

   // $FF: renamed from: b org.apache.logging.log4j.Logger
   private static final Logger field_7542;
   // $FF: renamed from: c int
   private int field_7543;
   // $FF: renamed from: d int
   private final int field_7544;
   // $FF: renamed from: e int
   private final int field_7545;
   // $FF: renamed from: f java.nio.IntBuffer
   private final IntBuffer field_7546;
   // $FF: renamed from: g java.nio.FloatBuffer
   private final FloatBuffer field_7547;
   // $FF: renamed from: h java.lang.String
   private final String field_7548;
   // $FF: renamed from: i boolean
   private boolean field_7549;
   // $FF: renamed from: j o4
   private final class_1404 field_7550;
   // $FF: renamed from: k java.lang.String[]
   private static final String[] field_7551;


   // $FF: renamed from: <init> (java.lang.String, int, int, o4) void
   public void method_7732(String var1, int var2, int var3, class_1404 var4) {
      super();
      this.field_7548 = var1;
      this.field_7544 = var3;
      this.field_7545 = var2;
      this.field_7550 = var4;
      if(var2 <= 3) {
         this.field_7546 = BufferUtils.createIntBuffer(var3);
         this.field_7547 = null;
      } else {
         this.field_7546 = null;
         this.field_7547 = BufferUtils.createFloatBuffer(var3);
      }

      this.field_7543 = -1;
      this.method_7733();
   }

   // $FF: renamed from: a () void
   private void method_7733() {
      this.field_7549 = true;
      if(this.field_7550 != null) {
         this.field_7550.method_7653();
      }

   }

   // $FF: renamed from: b (java.lang.String) int
   public static int method_7734(String var0) {
      byte var2;
      byte var4;
      label60: {
         String[] var10000 = class_752.method_4253();
         var2 = -1;
         String[] var1 = var10000;
         String[] var3 = field_7551;
         var4 = var0.equals("int");
         if(var1 != null) {
            if(var4 != 0) {
               var2 = 0;
               if(var1 != null) {
                  break label60;
               }
            }

            var3 = field_7551;
            var4 = var0.equals("float");
         }

         if(var1 != null) {
            if(var4 != 0) {
               var2 = 4;
               if(var1 != null) {
                  break label60;
               }
            }

            var3 = field_7551;
            var4 = var0.startsWith("matrix");
         }

         if(var1 == null) {
            return var4;
         }

         if(var4 != 0) {
            label61: {
               var3 = field_7551;
               var4 = var0.endsWith("2x2");
               if(var1 != null) {
                  if(var4 != 0) {
                     var2 = 8;
                     if(var1 != null) {
                        break label61;
                     }
                  }

                  var3 = field_7551;
                  var4 = var0.endsWith("3x3");
               }

               if(var1 != null) {
                  if(var4 != 0) {
                     var2 = 9;
                     if(var1 != null) {
                        break label61;
                     }
                  }

                  String[] var10001 = field_7551;
                  var4 = var0.endsWith("4x4");
               }

               if(var1 == null) {
                  return var4;
               }

               if(var4 != 0) {
                  var2 = 10;
               }
            }
         }
      }

      var4 = var2;
      return var4;
   }

   // $FF: renamed from: a (int) void
   public void method_7735(int var1) {
      this.field_7543 = var1;
   }

   // $FF: renamed from: b () java.lang.String
   public String method_7736() {
      return this.field_7548;
   }

   // $FF: renamed from: b (float) void
   public void method_7737(float var1) {
      this.field_7547.position(0);
      this.field_7547.put(0, var1);
      this.method_7733();
   }

   // $FF: renamed from: b (float, float) void
   public void method_7738(float var1, float var2) {
      this.field_7547.position(0);
      this.field_7547.put(0, var1);
      this.field_7547.put(1, var2);
      this.method_7733();
   }

   // $FF: renamed from: b (float, float, float) void
   public void method_7739(float var1, float var2, float var3) {
      this.field_7547.position(0);
      this.field_7547.put(0, var1);
      this.field_7547.put(1, var2);
      this.field_7547.put(2, var3);
      this.method_7733();
   }

   // $FF: renamed from: b (float, float, float, float) void
   public void method_7740(float var1, float var2, float var3, float var4) {
      this.field_7547.position(0);
      this.field_7547.put(var1);
      this.field_7547.put(var2);
      this.field_7547.put(var3);
      this.field_7547.put(var4);
      this.field_7547.flip();
      this.method_7733();
   }

   // $FF: renamed from: c (float, float, float, float) void
   public void method_7741(float var1, float var2, float var3, float var4) {
      String[] var10000 = class_752.method_4253();
      this.field_7547.position(0);
      String[] var5 = var10000;
      int var6 = this.field_7545;
      byte var10001 = 4;
      if(var5 != null) {
         if(this.field_7545 >= 4) {
            this.field_7547.put(0, var1);
         }

         var6 = this.field_7545;
         var10001 = 5;
      }

      if(var5 != null) {
         if(var6 >= var10001) {
            this.field_7547.put(1, var2);
         }

         var6 = this.field_7545;
         var10001 = 6;
      }

      class_1417 var7;
      label40: {
         if(var5 != null) {
            if(var6 >= var10001) {
               this.field_7547.put(2, var3);
            }

            var7 = this;
            if(var5 == null) {
               break label40;
            }

            var6 = this.field_7545;
            var10001 = 7;
         }

         if(var6 >= var10001) {
            this.field_7547.put(3, var4);
         }

         var7 = this;
      }

      var7.method_7733();
   }

   // $FF: renamed from: b (int, int, int, int) void
   public void method_7742(int var1, int var2, int var3, int var4) {
      String[] var10000 = class_752.method_4253();
      this.field_7546.position(0);
      String[] var5 = var10000;
      int var6 = this.field_7545;
      if(var5 != null) {
         if(this.field_7545 >= 0) {
            this.field_7546.put(0, var1);
         }

         var6 = this.field_7545;
      }

      byte var10001 = 1;
      if(var5 != null) {
         if(var6 >= 1) {
            this.field_7546.put(1, var2);
         }

         var6 = this.field_7545;
         var10001 = 2;
      }

      class_1417 var7;
      label40: {
         if(var5 != null) {
            if(var6 >= var10001) {
               this.field_7546.put(2, var3);
            }

            var7 = this;
            if(var5 == null) {
               break label40;
            }

            var6 = this.field_7545;
            var10001 = 3;
         }

         if(var6 >= var10001) {
            this.field_7546.put(3, var4);
         }

         var7 = this;
      }

      var7.method_7733();
   }

   // $FF: renamed from: b (float[]) void
   public void method_7743(float[] var1) {
      if(var1.length < this.field_7544) {
         Logger var10000 = field_7542;
         StringBuilder var10001 = new StringBuilder();
         String[] var2 = field_7551;
         var10000.warn(var10001.append("Uniform.set called with a too-small value array (expected ").append(this.field_7544).append(", got ").append(var1.length).append("). Ignoring.").toString());
      } else {
         this.field_7547.position(0);
         this.field_7547.put(var1);
         this.field_7547.position(0);
         this.method_7733();
      }
   }

   // $FF: renamed from: b (float, float, float, float, float, float, float, float, float, float, float, float, float, float, float, float) void
   public void method_7744(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, float var11, float var12, float var13, float var14, float var15, float var16) {
      this.field_7547.position(0);
      this.field_7547.put(0, var1);
      this.field_7547.put(1, var2);
      this.field_7547.put(2, var3);
      this.field_7547.put(3, var4);
      this.field_7547.put(4, var5);
      this.field_7547.put(5, var6);
      this.field_7547.put(6, var7);
      this.field_7547.put(7, var8);
      this.field_7547.put(8, var9);
      this.field_7547.put(9, var10);
      this.field_7547.put(10, var11);
      this.field_7547.put(11, var12);
      this.field_7547.put(12, var13);
      this.field_7547.put(13, var14);
      this.field_7547.put(14, var15);
      this.field_7547.put(15, var16);
      this.method_7733();
   }

   // $FF: renamed from: b (javax.vecmath.Matrix4f) void
   public void method_7745(Matrix4f var1) {
      this.method_7744(var1.m00, var1.m01, var1.m02, var1.m03, var1.m10, var1.m11, var1.m12, var1.m13, var1.m20, var1.m21, var1.m22, var1.m23, var1.m30, var1.m31, var1.m32, var1.m33);
   }

   // $FF: renamed from: c () void
   public void method_7746() {
      String[] var1 = class_752.method_4253();
      if(!this.field_7549) {
         ;
      }

      this.field_7549 = false;
      int var10000 = this.field_7545;
      byte var10001 = 3;
      if(var1 != null) {
         if(this.field_7545 <= 3) {
            this.method_7747();
            if(var1 != null) {
               return;
            }
         }

         var10000 = this.field_7545;
         var10001 = 7;
      }

      label34: {
         class_1417 var3;
         label46: {
            if(var1 != null) {
               if(var10000 <= var10001) {
                  this.method_7748();
                  if(var1 != null) {
                     return;
                  }
               }

               var3 = this;
               if(var1 == null) {
                  break label46;
               }

               var10000 = this.field_7545;
               var10001 = 10;
            }

            if(var10000 > var10001) {
               break label34;
            }

            var3 = this;
         }

         var3.method_7749();
         if(var1 != null) {
            return;
         }
      }

      Logger var4 = field_7542;
      StringBuilder var5 = new StringBuilder();
      String[] var2 = field_7551;
      var4.warn(var5.append("Uniform.upload called, but type value (").append(this.field_7545).append(") is not ").append("a valid type. Ignoring.").toString());
   }

   // $FF: renamed from: d () void
   private void method_7747() {
      label35: {
         String[] var1;
         label34: {
            label33: {
               label32: {
                  var1 = class_752.method_4253();
                  int var10000 = this.field_7545;
                  if(var1 != null) {
                     switch(this.field_7545) {
                     case 0:
                        var10000 = this.field_7543;
                        break;
                     case 1:
                        break label32;
                     case 2:
                        break label33;
                     case 3:
                        break label34;
                     default:
                        break label35;
                     }
                  }

                  buu.method_9055(var10000, this.field_7546);
                  if(var1 != null) {
                     return;
                  }
               }

               buu.method_9058(this.field_7543, this.field_7546);
               if(var1 != null) {
                  return;
               }
            }

            buu.method_9060(this.field_7543, this.field_7546);
            if(var1 != null) {
               return;
            }
         }

         buu.method_9062(this.field_7543, this.field_7546);
         if(var1 != null) {
            return;
         }
      }

      Logger var3 = field_7542;
      StringBuilder var10001 = new StringBuilder();
      String[] var2 = field_7551;
      var3.warn(var10001.append("Uniform.upload called, but count value (").append(this.field_7544).append(") is ").append(" not in the range of 1 to 4. Ignoring.").toString());
   }

   // $FF: renamed from: e () void
   private void method_7748() {
      label35: {
         String[] var1;
         label34: {
            label33: {
               label32: {
                  var1 = class_752.method_4253();
                  int var10000 = this.field_7545;
                  if(var1 != null) {
                     switch(this.field_7545) {
                     case 4:
                        var10000 = this.field_7543;
                        break;
                     case 5:
                        break label32;
                     case 6:
                        break label33;
                     case 7:
                        break label34;
                     default:
                        break label35;
                     }
                  }

                  buu.method_9057(var10000, this.field_7547);
                  if(var1 != null) {
                     return;
                  }
               }

               buu.method_9059(this.field_7543, this.field_7547);
               if(var1 != null) {
                  return;
               }
            }

            buu.method_9061(this.field_7543, this.field_7547);
            if(var1 != null) {
               return;
            }
         }

         buu.method_9063(this.field_7543, this.field_7547);
         if(var1 != null) {
            return;
         }
      }

      Logger var3 = field_7542;
      StringBuilder var10001 = new StringBuilder();
      String[] var2 = field_7551;
      var3.warn(var10001.append("Uniform.upload called, but count value (").append(this.field_7544).append(") is ").append("not in the range of 1 to 4. Ignoring.").toString());
   }

   // $FF: renamed from: f () void
   private void method_7749() {
      label25: {
         String[] var1;
         label24: {
            var1 = class_752.method_4253();
            int var10000 = this.field_7545;
            if(var1 != null) {
               switch(this.field_7545) {
               case 8:
                  var10000 = this.field_7543;
                  break;
               case 9:
                  break label24;
               case 10:
                  break label25;
               default:
                  return;
               }
            }

            buu.method_9064(var10000, true, this.field_7547);
            if(var1 != null) {
               return;
            }
         }

         buu.method_9065(this.field_7543, true, this.field_7547);
         if(var1 != null) {
            return;
         }
      }

      buu.method_9066(this.field_7543, true, this.field_7547);
   }

   // $FF: renamed from: <clinit> () void
   static void method_7750() {
      // $FF: Couldn't be decompiled
   }
}
