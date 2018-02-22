import org.lwjgl.opengl.GL11;

public class bcb extends Gui {

   // $FF: renamed from: a bqx
   protected static final bqx field_444;
   // $FF: renamed from: f int
   protected int field_445;
   // $FF: renamed from: g int
   protected int field_446;
   // $FF: renamed from: h int
   public int field_447;
   // $FF: renamed from: i int
   public int field_448;
   // $FF: renamed from: j java.lang.String
   public String field_449;
   // $FF: renamed from: k int
   public int field_450;
   // $FF: renamed from: l boolean
   public boolean field_451;
   // $FF: renamed from: m boolean
   public boolean field_452;
   // $FF: renamed from: n boolean
   protected boolean field_453;
   private static final String __OBFID;
   // $FF: renamed from: o java.lang.String[]
   private static final String[] field_454;


   // $FF: renamed from: <init> (int, int, int, java.lang.String) void
   public void method_747(int var1, int var2, int var3, String var4) {
      this.method_748(var1, var2, var3, 200, 20, var4);
   }

   // $FF: renamed from: <init> (int, int, int, int, int, java.lang.String) void
   public void method_748(int var1, int var2, int var3, int var4, int var5, String var6) {
      super.method_651();
      this.field_445 = 200;
      this.field_446 = 20;
      this.field_451 = true;
      this.field_452 = true;
      this.field_450 = var1;
      this.field_447 = var2;
      this.field_448 = var3;
      this.field_445 = var4;
      this.field_446 = var5;
      this.field_449 = var6;
   }

   // $FF: renamed from: a (boolean) int
   public int method_749(boolean var1) {
      byte var3;
      byte var4;
      label25: {
         String[] var10000 = class_752.method_4253();
         var3 = 1;
         String[] var2 = var10000;
         var4 = this.field_451;
         if(var2 != null) {
            if(!this.field_451) {
               var3 = 0;
               if(var2 != null) {
                  break label25;
               }
            }

            var4 = var1;
         }

         if(var2 == null) {
            return var4;
         }

         if(var4 != 0) {
            var3 = 2;
         }
      }

      var4 = var3;
      return var4;
   }

   // $FF: renamed from: a (bao, int, int) void
   public void method_750(bao var1, int var2, int var3) {
      String[] var4 = class_752.method_4253();
      if(this.field_452) {
         int var10001;
         FontRenderer var5;
         label60: {
            label65: {
               var5 = var1.enableBackgroundDrawing4;
               var1.method_5288().bindTexture(field_444);
               GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
               var10001 = var2;
               int var10002 = this.field_447;
               if(var4 != null) {
                  if(var2 < this.field_447) {
                     break label65;
                  }

                  var10001 = var3;
                  var10002 = this.field_448;
               }

               if(var4 != null) {
                  if(var10001 < var10002) {
                     break label65;
                  }

                  var10001 = var2;
                  var10002 = this.field_447 + this.field_445;
               }

               if(var4 != null) {
                  if(var10001 >= var10002) {
                     break label65;
                  }

                  var10001 = var3;
                  if(var4 == null) {
                     break label60;
                  }

                  var10002 = this.field_448 + this.field_446;
               }

               if(var10001 < var10002) {
                  var10001 = 1;
                  break label60;
               }
            }

            var10001 = 0;
         }

         int var7;
         bcb var8;
         label39: {
            label38: {
               this.field_453 = (boolean)var10001;
               int var6 = this.method_749(this.field_453);
               GL11.glEnable(3042);
               buu.method_9081(770, 771, 1, 0);
               GL11.glBlendFunc(770, 771);
               this.method_658(this.field_447, this.field_448, 0, 46 + var6 * 20, this.field_445 / 2, this.field_446);
               this.method_658(this.field_447 + this.field_445 / 2, this.field_448, 200 - this.field_445 / 2, 46 + var6 * 20, this.field_445 / 2, this.field_446);
               this.method_751(var1, var2, var3);
               var7 = 14737632;
               boolean var10000 = this.field_451;
               if(var4 != null) {
                  if(!this.field_451) {
                     var7 = 10526880;
                     if(var4 != null) {
                        break label38;
                     }
                  }

                  var8 = this;
                  if(var4 == null) {
                     break label39;
                  }

                  var10000 = this.field_453;
               }

               if(var10000) {
                  var7 = 16777120;
               }
            }

            var8 = this;
         }

         var8.drawCenteredString(var5, this.field_449, this.field_447 + this.field_445 / 2, this.field_448 + (this.field_446 - 8) / 2, var7);
      }

   }

   // $FF: renamed from: b (bao, int, int) void
   protected void method_751(bao var1, int var2, int var3) {}

   // $FF: renamed from: a (int, int) void
   public void method_752(int var1, int var2) {}

   // $FF: renamed from: c (bao, int, int) boolean
   public boolean method_753(bao var1, int var2, int var3) {
      int var10000;
      label56: {
         String[] var4 = class_752.method_4253();
         var10000 = this.field_451;
         if(var4 != null) {
            if(!this.field_451) {
               break label56;
            }

            var10000 = this.field_452;
         }

         if(var4 != null) {
            if(var10000 == 0) {
               break label56;
            }

            var10000 = var2;
         }

         int var10001 = this.field_447;
         if(var4 != null) {
            if(var10000 < this.field_447) {
               break label56;
            }

            var10000 = var3;
            var10001 = this.field_448;
         }

         if(var4 != null) {
            if(var10000 < var10001) {
               break label56;
            }

            var10000 = var2;
            var10001 = this.field_447 + this.field_445;
         }

         if(var4 != null) {
            if(var10000 >= var10001) {
               break label56;
            }

            var10000 = var3;
            if(var4 == null) {
               return (boolean)var10000;
            }

            var10001 = this.field_448 + this.field_446;
         }

         if(var10000 < var10001) {
            var10000 = 1;
            return (boolean)var10000;
         }
      }

      var10000 = 0;
      return (boolean)var10000;
   }

   // $FF: renamed from: a () boolean
   public boolean method_754() {
      return this.field_453;
   }

   // $FF: renamed from: b (int, int) void
   public void method_755(int var1, int var2) {}

   // $FF: renamed from: a (ql) void
   public void method_756(class_1541 var1) {
      bqx var10001 = new bqx;
      String[] var10003 = field_454;
      var10001.method_8227("gui.button.press");
      var1.method_8366(class_1424.method_7768(var10001, 1.0F));
   }

   // $FF: renamed from: b () int
   public int method_757() {
      return this.field_445;
   }

   // $FF: renamed from: c () int
   public int method_758() {
      return this.field_446;
   }

   // $FF: renamed from: <clinit> () void
   static void method_759() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = " wd¬ÍY¢3mc¬ß^³4qNR²æw4;º3guöÚ^³4-j÷Æ¡.fjçÛ_ø7lj";
      int var4 = " wd¬ÍY¢3mc¬ß^³4qNR²æw4;º3guöÚ^³4-j÷Æ¡.fjçÛ_ø7lj".length();
      char var1 = 16;
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
            char[] var12 = var9;
            var9 = var10003;
            if(var10003 <= var6) {
               var5[var3++] = (new String((char[])var10)).intern();
               if((var0 += var1) >= var4) {
                  field_454 = var5;
                  String[] var11 = field_454;
                  __OBFID = "CL_00000668";
                  bqx var8 = new bqx;
                  var10 = field_454;
                  var8.method_8227("textures/gui/widgets.png");
                  field_444 = var8;
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)var10[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 101;
               break;
            case 1:
               var10009 = 32;
               break;
            case 2:
               var10009 = 47;
               break;
            case 3:
               var10009 = 160;
               break;
            case 4:
               var10009 = 141;
               break;
            case 5:
               var10009 = 14;
               break;
            default:
               var10009 = 244;
            }

            var10[var6] = (char)(var10007 ^ var12 ^ var10009);
            ++var6;
         }
      }
   }
}
