import java.util.Random;

// $FF: renamed from: eo
public abstract class class_392 extends aji {

   // $FF: renamed from: M boolean
   protected final boolean field_2085;
   // $FF: renamed from: N java.lang.String
   private static final String field_2086 = "CL_00000195";


   // $FF: renamed from: e (ahb, int, int, int) boolean
   public static final boolean method_2612(ahb var0, int var1, int var2, int var3) {
      return method_2613(var0.getBlock(var1, var2, var3));
   }

   // $FF: renamed from: d (aji) boolean
   public static final boolean method_2613(aji var0) {
      boolean var2;
      label36: {
         String[] var1 = class_752.method_4253();
         aji var10000 = var0;
         aji var10001 = class_1192.field_6092;
         if(var1 != null) {
            if(var0 == class_1192.field_6092) {
               break label36;
            }

            var10000 = var0;
            var10001 = class_1192.field_6054;
         }

         if(var1 != null) {
            if(var10000 == var10001) {
               break label36;
            }

            var10000 = var0;
            var10001 = class_1192.field_6055;
         }

         if(var1 != null) {
            if(var10000 == var10001) {
               break label36;
            }

            var10000 = var0;
            var10001 = class_1192.field_6181;
         }

         if(var10000 != var10001) {
            var2 = false;
            return var2;
         }
      }

      var2 = true;
      return var2;
   }

   // $FF: renamed from: <init> (boolean) void
   protected void method_2614(boolean var1) {
      super.method_2427(awt.field_4186);
      this.field_2085 = var1;
      this.method_2443(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
      this.method_2521(class_872.field_4247);
   }

   // $FF: renamed from: i () boolean
   public boolean method_2615() {
      return this.field_2085;
   }

   // $FF: renamed from: a (ahb, int, int, int) kg
   public class_1343 method_2452(ahb var1, int var2, int var3, int var4) {
      return null;
   }

   // $FF: renamed from: c () boolean
   public boolean method_2453() {
      return false;
   }

   // $FF: renamed from: a (ahb, int, int, int, azw, azw) azu
   public azu method_2472(ahb var1, int var2, int var3, int var4, azw var5, azw var6) {
      this.method_2486(var1, var2, var3, var4);
      return super.method_2472(var1, var2, var3, var4, var5, var6);
   }

   // $FF: renamed from: a (ahl, int, int, int) void
   public void method_2486(ahl var1, int var2, int var3, int var4) {
      label18: {
         int var6 = var1.method_33(var2, var3, var4);
         String[] var5 = class_752.method_4253();
         int var10000 = var6;
         byte var10001 = 2;
         if(var5 != null) {
            if(var6 < 2) {
               break label18;
            }

            var10000 = var6;
            var10001 = 5;
         }

         if(var10000 <= var10001) {
            this.method_2443(0.0F, 0.0F, 0.0F, 1.0F, 0.625F, 1.0F);
            if(var5 != null) {
               return;
            }
         }
      }

      this.method_2443(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
   }

   // $FF: renamed from: d () boolean
   public boolean method_2434() {
      return false;
   }

   // $FF: renamed from: b () int
   public int method_2436() {
      return 9;
   }

   // $FF: renamed from: a (java.util.Random) int
   public int method_2463(Random var1) {
      return 1;
   }

   // $FF: renamed from: c (ahb, int, int, int) boolean
   public boolean method_2480(ahb var1, int var2, int var3, int var4) {
      return ahb.method_2135(var1, var2, var3 - 1, var4);
   }

   // $FF: renamed from: b (ahb, int, int, int) void
   public void method_2461(ahb var1, int var2, int var3, int var4) {
      class_392 var6;
      label24: {
         String[] var5 = class_752.method_4253();
         boolean var10000 = var1.field_1832;
         if(var5 != null) {
            if(var1.field_1832) {
               return;
            }

            this.method_2617(var1, var2, var3, var4, true);
            var6 = this;
            if(var5 == null) {
               break label24;
            }

            var10000 = this.field_2085;
         }

         if(!var10000) {
            return;
         }

         var6 = this;
      }

      var6.method_2459(var1, var2, var3, var4, this);
   }

   // $FF: renamed from: a (ahb, int, int, int, aji) void
   public void method_2459(ahb var1, int var2, int var3, int var4, aji var5) {
      String[] var6 = class_752.method_4253();
      int var10000 = var1.field_1832;
      if(var6 != null) {
         if(var1.field_1832) {
            return;
         }

         var10000 = var1.method_33(var2, var3, var4);
      }

      int var7 = var10000;
      int var8 = var7;
      byte var10 = this.field_2085;
      if(var6 != null) {
         if(this.field_2085) {
            var8 = var7 & 7;
         }

         var10 = 0;
      }

      byte var9 = var10;
      var10000 = ahb.method_2135(var1, var2, var3 - 1, var4);
      if(var6 != null) {
         if(var10000 == 0) {
            var9 = 1;
         }

         var10000 = var8;
      }

      byte var10001 = 2;
      if(var6 != null) {
         label94: {
            if(var10000 == 2) {
               var10000 = ahb.method_2135(var1, var2 + 1, var3, var4);
               if(var6 == null) {
                  break label94;
               }

               if(var10000 == 0) {
                  var9 = 1;
               }
            }

            var10000 = var8;
         }

         var10001 = 3;
      }

      if(var6 != null) {
         label86: {
            if(var10000 == var10001) {
               var10000 = ahb.method_2135(var1, var2 - 1, var3, var4);
               if(var6 == null) {
                  break label86;
               }

               if(var10000 == 0) {
                  var9 = 1;
               }
            }

            var10000 = var8;
         }

         var10001 = 4;
      }

      label108: {
         if(var6 != null) {
            label74: {
               if(var10000 == var10001) {
                  var10000 = ahb.method_2135(var1, var2, var3, var4 - 1);
                  if(var6 == null) {
                     break label74;
                  }

                  if(var10000 == 0) {
                     var9 = 1;
                  }
               }

               var10000 = var8;
            }

            if(var6 == null) {
               break label108;
            }

            var10001 = 5;
         }

         if(var10000 == var10001) {
            var10000 = ahb.method_2135(var1, var2, var3, var4 + 1);
            if(var6 == null) {
               break label108;
            }

            if(var10000 == 0) {
               var9 = 1;
            }
         }

         var10000 = var9;
      }

      label63: {
         if(var6 != null) {
            if(var10000 == 0) {
               break label63;
            }

            this.method_2466(var1, var2, var3, var4, var1.method_33(var2, var3, var4), 0);
            var1.method_2056(var2, var3, var4);
         }

         if(var6 != null) {
            return;
         }
      }

      this.method_2616(var1, var2, var3, var4, var7, var8, var5);
   }

   // $FF: renamed from: b (ahb, int, int, int, int, int, aji) void
   protected void method_2616(ahb var1, int var2, int var3, int var4, int var5, int var6, aji var7) {}

   // $FF: renamed from: b (ahb, int, int, int, boolean) void
   protected void method_2617(ahb var1, int var2, int var3, int var4, boolean var5) {
      if(!var1.field_1832) {
         class_979 var10000 = new class_979;
         var10000.method_5626(this, var1, var2, var3, var4);
         var10000.method_5637(var1.method_2172(var2, var3, var4), var5);
      }

   }

   // $FF: renamed from: h () int
   public int method_2514() {
      return 0;
   }

   // $FF: renamed from: a (ahb, int, int, int, aji, int) void
   public void method_2462(ahb var1, int var2, int var3, int var4, aji var5, int var6) {
      String[] var10000 = class_752.method_4253();
      int var8 = var6;
      String[] var7 = var10000;
      int var9 = this.field_2085;
      if(var7 != null) {
         if(this.field_2085) {
            var8 = var6 & 7;
         }

         super.method_2462(var1, var2, var3, var4, var5, var6);
         var9 = var8;
      }

      label50: {
         label49: {
            label54: {
               byte var10001 = 2;
               if(var7 != null) {
                  if(var9 == 2) {
                     break label54;
                  }

                  var9 = var8;
                  var10001 = 3;
               }

               if(var7 != null) {
                  if(var9 == var10001) {
                     break label54;
                  }

                  var9 = var8;
                  var10001 = 4;
               }

               if(var7 != null) {
                  if(var9 == var10001) {
                     break label54;
                  }

                  var9 = var8;
                  if(var7 == null) {
                     break label50;
                  }

                  var10001 = 5;
               }

               if(var9 != var10001) {
                  break label49;
               }
            }

            var1.method_2063(var2, var3 + 1, var4, var5);
         }

         var9 = this.field_2085;
      }

      if(var9 != 0) {
         var1.method_2063(var2, var3, var4, var5);
         var1.method_2063(var2, var3 - 1, var4, var5);
      }

   }

   // $FF: renamed from: <clinit> () void
   static void method_2537() {
      boolean var10000 = true;
      char[] var10003 = ",ë7¡Öv_Q¤".toCharArray();
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
            field_2086 = (new String((char[])var4)).intern();
            String var2 = field_2086;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 221;
            break;
         case 1:
            var10009 = 21;
            break;
         case 2:
            var10009 = 218;
            break;
         case 3:
            var10009 = 35;
            break;
         case 4:
            var10009 = 84;
            break;
         case 5:
            var10009 = 244;
            break;
         default:
            var10009 = 12;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
