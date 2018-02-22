import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.lwjgl.input.Mouse;

// $FF: renamed from: mp
abstract class class_961 extends bcm {

   // $FF: renamed from: w int
   protected int field_4878;
   // $FF: renamed from: x java.util.List
   protected List field_4879;
   // $FF: renamed from: y java.util.Comparator
   protected Comparator field_4880;
   // $FF: renamed from: z int
   protected int field_4881;
   // $FF: renamed from: A int
   protected int field_4882;
   // $FF: renamed from: B java.lang.String
   private static final String field_4883;
   // $FF: renamed from: C lF
   final class_195 field_4884;
   // $FF: renamed from: D java.lang.String[]
   private static final String[] field_4885;


   // $FF: renamed from: <init> (lF) void
   protected void method_5581(class_195 var1) {
      this.field_4884 = var1;
      super.method_5549(var1.field_557, var1.width, var1.height, 32, var1.height - 64, 20);
      this.field_4878 = -1;
      this.field_4881 = -1;
      this.method_5551(false);
      this.method_5552(true, 20);
   }

   // $FF: renamed from: a (int, boolean, int, int) void
   protected void method_5554(int var1, boolean var2, int var3, int var4) {}

   // $FF: renamed from: a (int) boolean
   protected boolean method_5555(int var1) {
      return false;
   }

   // $FF: renamed from: a () void
   protected void method_5557() {
      this.field_4884.method_873();
   }

   // $FF: renamed from: a (int, int, bmh) void
   protected void method_5559(int var1, int var2, bmh var3) {
      int var10000;
      String[] var4;
      class_961 var7;
      label89: {
         label92: {
            var4 = class_752.method_4253();
            var10000 = Mouse.isButtonDown(0);
            if(var4 != null) {
               if(var10000 == 0) {
                  this.field_4878 = -1;
               }

               var7 = this;
               if(var4 == null) {
                  break label92;
               }

               var10000 = this.field_4878;
            }

            if(var10000 == 0) {
               class_195.method_1043(this.field_4884, var1 + 115 - 18, var2 + 1, 0, 0);
               if(var4 != null) {
                  break label89;
               }
            }

            var7 = this;
         }

         class_195.method_1043(var7.field_4884, var1 + 115 - 18, var2 + 1, 0, 18);
      }

      label77: {
         var7 = this;
         if(var4 != null) {
            if(this.field_4878 == 1) {
               class_195.method_1043(this.field_4884, var1 + 165 - 18, var2 + 1, 0, 0);
               if(var4 != null) {
                  break label77;
               }
            }

            var7 = this;
         }

         class_195.method_1043(var7.field_4884, var1 + 165 - 18, var2 + 1, 0, 18);
      }

      label70: {
         var7 = this;
         if(var4 != null) {
            if(this.field_4878 == 2) {
               class_195.method_1043(this.field_4884, var1 + 215 - 18, var2 + 1, 0, 0);
               if(var4 != null) {
                  break label70;
               }
            }

            var7 = this;
         }

         class_195.method_1043(var7.field_4884, var1 + 215 - 18, var2 + 1, 0, 18);
      }

      var10000 = this.field_4881;
      if(var4 != null) {
         if(this.field_4881 == -1) {
            return;
         }

         var10000 = 79;
      }

      int var5;
      byte var6;
      label95: {
         byte var10001;
         label96: {
            label97: {
               var5 = var10000;
               var6 = 18;
               var10000 = this.field_4881;
               var10001 = 1;
               if(var4 != null) {
                  if(this.field_4881 == 1) {
                     var5 = 129;
                     if(var4 != null) {
                        break label97;
                     }
                  }

                  var10000 = this.field_4881;
                  var10001 = 2;
               }

               if(var4 == null) {
                  break label96;
               }

               if(var10000 == var10001) {
                  var5 = 179;
               }
            }

            var7 = this;
            if(var4 == null) {
               break label95;
            }

            var10000 = this.field_4882;
            var10001 = 1;
         }

         if(var10000 == var10001) {
            var6 = 36;
         }

         var7 = this;
      }

      class_195.method_1043(var7.field_4884, var1 + var5, var2 + 1, var6, 0);
   }

   // $FF: renamed from: a (int, int) void
   protected void method_5560(int var1, int var2) {
      class_961 var4;
      label64: {
         int var10000;
         label65: {
            String[] var3;
            label66: {
               this.field_4878 = -1;
               var3 = class_752.method_4253();
               var10000 = var1;
               short var10001 = 79;
               if(var3 != null) {
                  label57: {
                     if(var1 >= 79) {
                        var10000 = var1;
                        var10001 = 115;
                        if(var3 == null) {
                           break label57;
                        }

                        if(var1 < 115) {
                           this.field_4878 = 0;
                           if(var3 != null) {
                              break label66;
                           }
                        }
                     }

                     var10000 = var1;
                     var10001 = 129;
                  }
               }

               if(var3 != null) {
                  label67: {
                     if(var10000 >= var10001) {
                        var10000 = var1;
                        var10001 = 165;
                        if(var3 == null) {
                           break label67;
                        }

                        if(var1 < 165) {
                           this.field_4878 = 1;
                           if(var3 != null) {
                              break label66;
                           }
                        }
                     }

                     var10000 = var1;
                     if(var3 == null) {
                        break label65;
                     }

                     var10001 = 179;
                  }
               }

               if(var10000 >= var10001) {
                  var10000 = var1;
                  if(var3 == null) {
                     break label65;
                  }

                  if(var1 < 215) {
                     this.field_4878 = 2;
                  }
               }
            }

            var4 = this;
            if(var3 == null) {
               break label64;
            }

            var10000 = this.field_4878;
         }

         if(var10000 < 0) {
            return;
         }

         this.method_5586(this.field_4878);
         var4 = this;
      }

      class_1541 var6 = var4.field_4884.field_557.method_5295();
      bqx var5 = new bqx;
      String[] var10003 = field_4885;
      var5.method_8227("gui.button.press");
      var6.method_8366(class_1424.method_7768(var5, 1.0F));
   }

   // $FF: renamed from: b () int
   protected final int method_5553() {
      return this.field_4879.size();
   }

   // $FF: renamed from: b (int) u5
   protected final class_1602 method_5582(int var1) {
      return (class_1602)this.field_4879.get(var1);
   }

   // $FF: renamed from: c (int) java.lang.String
   protected abstract String method_5583(int var1);

   // $FF: renamed from: b (u2, int, int, boolean) void
   protected void method_5584(class_1601 var1, int var2, int var3, boolean var4) {
      String[] var5;
      String var6;
      class_195 var7;
      FontRenderer var10001;
      int var10003;
      int var10004;
      int var10005;
      label36: {
         var5 = class_752.method_4253();
         class_1601 var10000 = var1;
         if(var5 != null) {
            if(var1 == null) {
               break label36;
            }

            var10000 = var1;
         }

         var6 = var10000.method_8752(class_195.method_1044(this.field_4884).method_9402(var1));
         var7 = this.field_4884;
         var10001 = class_195.method_1045(this.field_4884);
         var10003 = var2 - class_195.method_1046(this.field_4884).getCharWidth(var6);
         var10004 = var3 + 5;
         var10005 = var4;
         if(var5 != null) {
            var10005 = var4 != 0?16777215:9474192;
         }

         var7.method_657(var10001, var6, var10003, var10004, var10005);
         if(var5 != null) {
            return;
         }
      }

      var6 = "-";
      var7 = this.field_4884;
      var10001 = class_195.method_1047(this.field_4884);
      var10003 = var2 - class_195.method_1048(this.field_4884).getCharWidth(var6);
      var10004 = var3 + 5;
      var10005 = var4;
      if(var5 != null) {
         var10005 = var4 != 0?16777215:9474192;
      }

      var7.method_657(var10001, var6, var10003, var10004, var10005);
   }

   // $FF: renamed from: b (int, int) void
   protected void method_5561(int var1, int var2) {
      String[] var3;
      int var10000;
      int var10001;
      label108: {
         var3 = class_752.method_4253();
         var10000 = var2;
         var10001 = this.field_4856;
         if(var3 != null) {
            if(var2 < this.field_4856) {
               return;
            }

            var10000 = var2;
            if(var3 == null) {
               break label108;
            }

            var10001 = this.field_4857;
         }

         if(var10000 > var10001) {
            return;
         }

         var10000 = this.method_5562(var1, var2);
      }

      int var5;
      label129: {
         int var4 = var10000;
         var5 = this.field_4854 / 2 - 92 - 16;
         var10000 = var4;
         if(var3 != null) {
            if(var4 < 0) {
               break label129;
            }

            var10000 = var1;
         }

         var10001 = var5 + 40;
         if(var3 != null) {
            if(var10000 < var10001) {
               return;
            }

            var10000 = var1;
            var10001 = var5 + 40 + 20;
         }

         if(var10000 > var10001) {
            return;
         }

         class_1602 var6 = this.method_5582(var4);
         this.method_5585(var6, var1, var2);
         if(var3 != null) {
            return;
         }
      }

      String var10;
      label130: {
         var10 = "";
         var10000 = var1;
         var10001 = var5 + 115 - 18;
         if(var3 != null) {
            label74: {
               if(var1 >= var10001) {
                  var10000 = var1;
                  var10001 = var5 + 115;
                  if(var3 == null) {
                     break label74;
                  }

                  if(var1 <= var10001) {
                     var10 = this.method_5583(0);
                     if(var3 != null) {
                        break label130;
                     }
                  }
               }

               var10000 = var1;
               var10001 = var5 + 165 - 18;
            }
         }

         if(var3 != null) {
            label63: {
               if(var10000 >= var10001) {
                  var10000 = var1;
                  var10001 = var5 + 165;
                  if(var3 == null) {
                     break label63;
                  }

                  if(var1 <= var10001) {
                     var10 = this.method_5583(1);
                     if(var3 != null) {
                        break label130;
                     }
                  }
               }

               var10000 = var1;
               var10001 = var5 + 215 - 18;
            }
         }

         if(var3 != null) {
            if(var10000 < var10001) {
               return;
            }

            var10000 = var1;
            var10001 = var5 + 215;
         }

         if(var10000 > var10001) {
            return;
         }

         var10 = this.method_5583(2);
      }

      var10 = ("" + class_1450.method_7896(var10, new Object[0])).trim();
      var10000 = var10.length();
      if(var3 != null) {
         if(var10000 <= 0) {
            return;
         }

         var10000 = var1 + 12;
      }

      int var7 = var10000;
      int var8 = var2 - 12;
      int var9 = class_195.method_1049(this.field_4884).getCharWidth(var10);
      class_195.method_1050(this.field_4884, var7 - 3, var8 - 3, var7 + var9 + 3, var8 + 8 + 3, -1073741824, -1073741824);
      class_195.method_1051(this.field_4884).drawStringWithShadow(var10, var7, var8, -1);
   }

   // $FF: renamed from: b (u5, int, int) void
   protected void method_5585(class_1602 var1, int var2, int var3) {
      String[] var4 = class_752.method_4253();
      class_1602 var10000 = var1;
      if(var4 != null) {
         if(var1 == null) {
            return;
         }

         var10000 = var1;
      }

      adb var5 = var10000.method_8763();
      StringBuilder var10 = (new StringBuilder()).append("");
      StringBuilder var10001 = (new StringBuilder()).append(var5.getUnlocalizedName());
      String[] var10002 = field_4885;
      String var6 = var10.append(class_1450.method_7896(var10001.append(".name").toString(), new Object[0])).toString().trim();
      int var11 = var6.length();
      if(var4 != null) {
         if(var11 <= 0) {
            return;
         }

         var11 = var2 + 12;
      }

      int var7 = var11;
      int var8 = var3 - 12;
      int var9 = class_195.method_1052(this.field_4884).getCharWidth(var6);
      class_195.method_1053(this.field_4884, var7 - 3, var8 - 3, var7 + var9 + 3, var8 + 8 + 3, -1073741824, -1073741824);
      class_195.method_1054(this.field_4884).drawStringWithShadow(var6, var7, var8, -1);
   }

   // $FF: renamed from: d (int) void
   protected void method_5586(int var1) {
      label26: {
         class_961 var3;
         label28: {
            String[] var2 = class_752.method_4253();
            int var10000 = var1;
            int var10001 = this.field_4881;
            if(var2 != null) {
               if(var1 != this.field_4881) {
                  this.field_4881 = var1;
                  this.field_4882 = -1;
                  if(var2 != null) {
                     break label26;
                  }
               }

               var3 = this;
               if(var2 == null) {
                  break label28;
               }

               var10000 = this.field_4882;
               var10001 = -1;
            }

            if(var10000 == var10001) {
               this.field_4882 = 1;
               if(var2 != null) {
                  break label26;
               }
            }

            this.field_4881 = -1;
            var3 = this;
         }

         var3.field_4882 = 0;
      }

      Collections.sort(this.field_4879, this.field_4880);
   }

   // $FF: renamed from: <clinit> () void
   static void method_5579() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "Ji¾B»ÐPn¾P¼ÁLYQaýE4s_ þG\b3 ";
      int var4 = "Ji¾B»ÐPn¾P¼ÁLYQaýE4s_ þG\b3 ".length();
      char var1 = 16;
      int var0 = -1;

      while(true) {
         ++var0;
         String var10002 = var2.substring(var0, var0 + var1);
         boolean var10000 = true;
         char[] var10003 = var10002.toCharArray();
         Object var10004 = var10003.length;
         Object var9 = true;
         char[] var8 = var10003;
         char[] var10001 = (char[])var10004;
         int var6 = 0;

         while(true) {
            var10003 = var8;
            var8 = var10001;
            var10001 = var10003;
            char[] var11 = var8;
            var8 = var10003;
            if(var10003 <= var6) {
               var5[var3++] = (new String((char[])var9)).intern();
               if((var0 += var1) >= var4) {
                  field_4885 = var5;
                  String[] var10 = field_4885;
                  field_4883 = "CL_00000730";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 102;
               break;
            case 1:
               var10009 = 46;
               break;
            case 2:
               var10009 = 17;
               break;
            case 3:
               var10009 = 129;
               break;
            case 4:
               var10009 = 49;
               break;
            case 5:
               var10009 = 223;
               break;
            default:
               var10009 = 181;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}
