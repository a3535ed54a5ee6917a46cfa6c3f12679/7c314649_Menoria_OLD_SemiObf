import com.google.gson.JsonObject;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL14;

// $FF: renamed from: o3
public class class_1402 {

   // $FF: renamed from: b o3
   private static class_1402 field_7444;
   // $FF: renamed from: c int
   private final int field_7445;
   // $FF: renamed from: d int
   private final int field_7446;
   // $FF: renamed from: e int
   private final int field_7447;
   // $FF: renamed from: f int
   private final int field_7448;
   // $FF: renamed from: g int
   private final int field_7449;
   // $FF: renamed from: h boolean
   private final boolean field_7450;
   // $FF: renamed from: i boolean
   private final boolean field_7451;
   // $FF: renamed from: j java.lang.String
   private static final String field_7452;
   // $FF: renamed from: k java.lang.String[]
   private static final String[] field_7453;


   // $FF: renamed from: <init> (boolean, boolean, int, int, int, int, int) void
   private void method_7637(boolean var1, boolean var2, int var3, int var4, int var5, int var6, int var7) {
      super();
      this.field_7450 = var1;
      this.field_7445 = var3;
      this.field_7447 = var4;
      this.field_7446 = var5;
      this.field_7448 = var6;
      this.field_7451 = var2;
      this.field_7449 = var7;
   }

   // $FF: renamed from: <init> () void
   public void method_7638() {
      this.method_7637(false, true, 1, 0, 1, 0, '\u8006');
   }

   // $FF: renamed from: <init> (int, int, int) void
   public void method_7639(int var1, int var2, int var3) {
      this.method_7637(false, false, var1, var2, var1, var2, var3);
   }

   // $FF: renamed from: <init> (int, int, int, int, int) void
   public void method_7640(int var1, int var2, int var3, int var4, int var5) {
      this.method_7637(true, false, var1, var2, var3, var4, var5);
   }

   // $FF: renamed from: b () void
   public void method_7641() {
      String[] var1 = class_752.method_4253();
      class_1402 var10000 = this;
      if(var1 != null) {
         if(this.equals(field_7444)) {
            return;
         }

         var10000 = field_7444;
      }

      int var2;
      label43: {
         label52: {
            if(var1 != null) {
               if(var10000 != null) {
                  var2 = this.field_7451;
                  if(var1 == null) {
                     break label43;
                  }

                  if(this.field_7451 == field_7444.method_7642()) {
                     break label52;
                  }
               }

               field_7444 = this;
               var10000 = this;
            }

            short var3 = var10000.field_7451;
            if(var1 != null) {
               if(var3 != 0) {
                  GL11.glDisable(3042);
                  return;
               }

               var3 = 3042;
            }

            GL11.glEnable(var3);
         }

         GL14.glBlendEquation(this.field_7449);
         var2 = this.field_7450;
      }

      if(var1 != null) {
         if(var2 != 0) {
            GL14.glBlendFuncSeparate(this.field_7445, this.field_7447, this.field_7446, this.field_7448);
            if(var1 != null) {
               return;
            }
         }

         var2 = this.field_7445;
      }

      GL11.glBlendFunc(var2, this.field_7447);
   }

   public boolean equals(Object var1) {
      String[] var2 = class_752.method_4253();
      Object var10000 = this;
      if(var2 != null) {
         if(this == var1) {
            return true;
         }

         var10000 = var1;
      }

      if(var2 != null) {
         if(!(var10000 instanceof class_1402)) {
            return false;
         }

         var10000 = var1;
      }

      class_1402 var3 = (class_1402)var10000;
      int var4 = this.field_7449;
      int var10001 = var3.field_7449;
      if(var2 != null) {
         if(this.field_7449 != var3.field_7449) {
            var4 = 0;
            return (boolean)var4;
         }

         var4 = this.field_7448;
         var10001 = var3.field_7448;
      }

      if(var2 != null) {
         if(var4 != var10001) {
            var4 = 0;
            return (boolean)var4;
         }

         var4 = this.field_7447;
         var10001 = var3.field_7447;
      }

      if(var2 != null) {
         if(var4 != var10001) {
            var4 = 0;
            return (boolean)var4;
         }

         var4 = this.field_7451;
         var10001 = var3.field_7451;
      }

      if(var2 != null) {
         if(var4 != var10001) {
            var4 = 0;
            return (boolean)var4;
         }

         var4 = this.field_7450;
         var10001 = var3.field_7450;
      }

      if(var2 != null) {
         if(var4 != var10001) {
            var4 = 0;
            return (boolean)var4;
         }

         var4 = this.field_7446;
         var10001 = var3.field_7446;
      }

      if(var2 != null) {
         if(var4 != var10001) {
            var4 = 0;
            return (boolean)var4;
         }

         var4 = this.field_7445;
         if(var2 == null) {
            return (boolean)var4;
         }

         var10001 = var3.field_7445;
      }

      var4 = var4 == var10001?1:0;
      return (boolean)var4;
   }

   public int hashCode() {
      String[] var10000 = class_752.method_4253();
      int var2 = this.field_7445;
      String[] var1 = var10000;
      var2 = 31 * var2 + this.field_7446;
      var2 = 31 * var2 + this.field_7447;
      var2 = 31 * var2 + this.field_7448;
      var2 = 31 * var2 + this.field_7449;
      int var3 = 31 * var2;
      int var10001 = this.field_7450;
      if(var1 != null) {
         var10001 = this.field_7450?1:0;
      }

      var2 = var3 + var10001;
      var3 = 31 * var2;
      var10001 = this.field_7451;
      if(var1 != null) {
         var10001 = this.field_7451?1:0;
      }

      var2 = var3 + var10001;
      return var2;
   }

   // $FF: renamed from: c () boolean
   public boolean method_7642() {
      return this.field_7451;
   }

   // $FF: renamed from: b (com.google.gson.JsonObject) o3
   public static class_1402 method_7643(JsonObject var0) {
      String[] var1 = class_752.method_4253();
      class_1402 var10;
      if(var0 == null) {
         var10 = new class_1402;
         var10.method_7638();
         return var10;
      } else {
         int var2 = '\u8006';
         int var3 = 1;
         int var4 = 0;
         int var5 = 1;
         int var6 = 0;
         byte var7 = 1;
         int var8 = 0;
         String[] var9 = field_7453;
         int var10000 = class_1702.method_9431(var0, "func");
         if(var1 != null) {
            label93: {
               if(var10000 != 0) {
                  var2 = method_7644(var0.get("func").getAsString());
                  var10000 = var2;
                  if(var1 == null) {
                     break label93;
                  }

                  if(var2 != '\u8006') {
                     var7 = 0;
                  }
               }

               var9 = field_7453;
               var10000 = class_1702.method_9431(var0, "srcrgb");
            }
         }

         if(var1 != null) {
            label86: {
               if(var10000 != 0) {
                  var9 = field_7453;
                  var3 = method_7645(var0.get("srcrgb").getAsString());
                  var10000 = var3;
                  if(var1 == null) {
                     break label86;
                  }

                  if(var3 != 1) {
                     var7 = 0;
                  }
               }

               var9 = field_7453;
               var10000 = class_1702.method_9431(var0, "dstrgb");
            }
         }

         if(var1 != null) {
            label79: {
               if(var10000 != 0) {
                  var9 = field_7453;
                  var4 = method_7645(var0.get("dstrgb").getAsString());
                  var10000 = var4;
                  if(var1 == null) {
                     break label79;
                  }

                  if(var4 != 0) {
                     var7 = 0;
                  }
               }

               var9 = field_7453;
               var10000 = class_1702.method_9431(var0, "srcalpha");
            }
         }

         if(var1 != null) {
            if(var10000 != 0) {
               var9 = field_7453;
               var5 = method_7645(var0.get("srcalpha").getAsString());
               var10000 = var5;
               if(var1 != null) {
                  if(var5 != 1) {
                     var7 = 0;
                  }

                  var10000 = 1;
               }

               var8 = var10000;
            }

            var9 = field_7453;
            var10000 = class_1702.method_9431(var0, "dstalpha");
         }

         if(var1 != null) {
            if(var10000 != 0) {
               String[] var10001 = field_7453;
               var6 = method_7645(var0.get("dstalpha").getAsString());
               var10000 = var6;
               if(var1 != null) {
                  if(var6 != 0) {
                     var7 = 0;
                  }

                  var10000 = 1;
               }

               var8 = var10000;
            }

            var10000 = var7;
         }

         if(var1 != null) {
            if(var10000 != 0) {
               var10 = new class_1402;
               var10.method_7638();
               return var10;
            }

            var10000 = var8;
         }

         if(var10000 != 0) {
            var10 = new class_1402;
            var10.method_7640(var3, var4, var5, var6, var2);
         } else {
            var10 = new class_1402;
            var10.method_7639(var3, var4, var2);
         }

         return var10;
      }
   }

   // $FF: renamed from: b (java.lang.String) int
   private static int method_7644(String var0) {
      String[] var10000 = class_752.method_4253();
      String var2 = var0.trim().toLowerCase();
      String[] var1 = var10000;
      String[] var3 = field_7453;
      int var4 = var2.equals("add");
      if(var1 != null) {
         if(var4 != 0) {
            var4 = '\u8006';
            return var4;
         }

         var3 = field_7453;
         var4 = var2.equals("subtract");
      }

      if(var1 != null) {
         if(var4 != 0) {
            var4 = '\u800a';
            return var4;
         }

         var3 = field_7453;
         var4 = var2.equals("reversesubtract");
      }

      if(var1 != null) {
         if(var4 != 0) {
            var4 = '\u800b';
            return var4;
         }

         var3 = field_7453;
         var4 = var2.equals("reverse_subtract");
      }

      if(var1 != null) {
         if(var4 != 0) {
            var4 = '\u800b';
            return var4;
         }

         var3 = field_7453;
         var4 = var2.equals("min");
      }

      if(var1 != null) {
         if(var4 != 0) {
            var4 = '\u8007';
            return var4;
         }

         String[] var10001 = field_7453;
         var4 = var2.equals("max");
      }

      if(var1 != null) {
         var4 = var4 != 0?'\u8008':'\u8006';
      }

      return var4;
   }

   // $FF: renamed from: c (java.lang.String) int
   private static int method_7645(String var0) {
      String var2 = var0.trim().toLowerCase();
      var2 = var2.replaceAll("_", "");
      String[] var1 = class_752.method_4253();
      String[] var3 = field_7453;
      var2 = var2.replaceAll("one", "1");
      var2 = var2.replaceAll("zero", "0");
      var2 = var2.replaceAll("minus", "-");
      int var10000 = var2.equals("0");
      if(var1 != null) {
         if(var10000 != 0) {
            var10000 = 0;
            return var10000;
         }

         var10000 = var2.equals("1");
      }

      if(var1 != null) {
         if(var10000 != 0) {
            var10000 = 1;
            return var10000;
         }

         var3 = field_7453;
         var10000 = var2.equals("srccolor");
      }

      if(var1 != null) {
         if(var10000 != 0) {
            var10000 = 768;
            return var10000;
         }

         var3 = field_7453;
         var10000 = var2.equals("1-srccolor");
      }

      if(var1 != null) {
         if(var10000 != 0) {
            var10000 = 769;
            return var10000;
         }

         var3 = field_7453;
         var10000 = var2.equals("dstcolor");
      }

      if(var1 != null) {
         if(var10000 != 0) {
            var10000 = 774;
            return var10000;
         }

         var3 = field_7453;
         var10000 = var2.equals("1-dstcolor");
      }

      if(var1 != null) {
         if(var10000 != 0) {
            var10000 = 775;
            return var10000;
         }

         var3 = field_7453;
         var10000 = var2.equals("srcalpha");
      }

      if(var1 != null) {
         if(var10000 != 0) {
            var10000 = 770;
            return var10000;
         }

         var3 = field_7453;
         var10000 = var2.equals("1-srcalpha");
      }

      if(var1 != null) {
         if(var10000 != 0) {
            var10000 = 771;
            return var10000;
         }

         var3 = field_7453;
         var10000 = var2.equals("dstalpha");
      }

      if(var1 != null) {
         if(var10000 != 0) {
            var10000 = 772;
            return var10000;
         }

         String[] var10001 = field_7453;
         var10000 = var2.equals("1-dstalpha");
      }

      if(var1 != null) {
         var10000 = var10000 != 0?773:-1;
      }

      return var10000;
   }

   // $FF: renamed from: <clinit> () void
   static void method_7646() {
      // $FF: Couldn't be decompiled
   }
}
