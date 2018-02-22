import java.util.List;
import java.util.Random;

// $FF: renamed from: iW
public class class_1120 extends class_1119 {

   // $FF: renamed from: i int
   private int field_5823;
   // $FF: renamed from: j java.lang.String
   private static final String field_5824;
   // $FF: renamed from: k java.lang.String[]
   private static final String[] field_5825;


   // $FF: renamed from: <init> () void
   public void method_6191() {
      super.method_6191();
   }

   // $FF: renamed from: <init> (iY, int, java.util.Random, hS, int) void
   public void method_6278(class_1118 var1, int var2, Random var3, class_1206 var4, int var5) {
      super.method_6266(var1, var2);
      this.field_5753 = var5;
      this.field_5752 = var4;
      this.field_5823 = Math.max(var4.method_6488(), var4.method_6490());
   }

   // $FF: renamed from: b (ro) void
   protected void method_6194(class_1583 var1) {
      super.method_6194(var1);
      String[] var10001 = field_5825;
      var1.method_8667("Length", this.field_5823);
   }

   // $FF: renamed from: c (ro) void
   protected void method_6196(class_1583 var1) {
      super.method_6196(var1);
      String[] var10002 = field_5825;
      this.field_5823 = var1.method_8681("Length");
   }

   // $FF: renamed from: b (h7, java.util.List, java.util.Random) void
   public void method_6197(class_1094 var1, List var2, Random var3) {
      String[] var10000 = class_752.method_4253();
      byte var5 = 0;
      String[] var4 = var10000;
      int var6 = var3.nextInt(5);

      label116: {
         label115: {
            label114:
            while(true) {
               class_1094 var7;
               if(var6 < this.field_5823 - 8) {
                  var7 = this.method_6267((class_1118)var1, var2, var3, 0, var6);
                  if(var4 != null) {
                     if(var4 == null) {
                        break;
                     }

                     if(var7 != null) {
                        var6 += Math.max(var7.field_5752.method_6488(), var7.field_5752.method_6490());
                        var5 = 1;
                     }

                     var6 += 2 + var3.nextInt(5);
                  }

                  if(var4 != null) {
                     continue;
                  }
               }

               var6 = var3.nextInt(5);

               while(true) {
                  if(var6 < this.field_5823 - 8) {
                     var7 = this.method_6268((class_1118)var1, var2, var3, 0, var6);
                     if(var4 != null) {
                        if(var4 == null) {
                           break label114;
                        }

                        if(var7 != null) {
                           var6 += Math.max(var7.field_5752.method_6488(), var7.field_5752.method_6490());
                           var5 = 1;
                        }

                        var6 += 2 + var3.nextInt(5);
                     }

                     if(var4 != null) {
                        continue;
                     }
                  }

                  int var8 = var5;
                  if(var4 != null) {
                     label64: {
                        if(var5 != 0) {
                           var8 = var3.nextInt(3);
                           if(var4 == null) {
                              break label64;
                           }

                           if(var8 > 0) {
                              var8 = this.field_5753;
                              if(var4 == null) {
                                 break label64;
                              }

                              switch(this.field_5753) {
                              case 0:
                                 class_1249.method_6584((class_1118)var1, var2, var3, this.field_5752.field_6244 - 1, this.field_5752.field_6245, this.field_5752.field_6249 - 2, 1, this.method_6200());
                                 if(var4 != null) {
                                    break;
                                 }
                              case 1:
                                 class_1249.method_6584((class_1118)var1, var2, var3, this.field_5752.field_6244, this.field_5752.field_6245, this.field_5752.field_6246 - 1, 2, this.method_6200());
                                 if(var4 != null) {
                                    break;
                                 }
                              case 2:
                                 class_1249.method_6584((class_1118)var1, var2, var3, this.field_5752.field_6244 - 1, this.field_5752.field_6245, this.field_5752.field_6246, 1, this.method_6200());
                                 if(var4 != null) {
                                    break;
                                 }
                              case 3:
                                 class_1249.method_6584((class_1118)var1, var2, var3, this.field_5752.field_6247 - 2, this.field_5752.field_6245, this.field_5752.field_6246 - 1, 2, this.method_6200());
                              }
                           }
                        }

                        var8 = var5;
                     }
                  }

                  if(var4 != null) {
                     if(var8 == 0) {
                        return;
                     }

                     var8 = var3.nextInt(3);
                  }

                  label94: {
                     label93: {
                        if(var4 != null) {
                           if(var8 <= 0) {
                              return;
                           }

                           if(var4 == null) {
                              break label93;
                           }

                           var8 = this.field_5753;
                        }

                        switch(var8) {
                        case 0:
                           class_1249.method_6584((class_1118)var1, var2, var3, this.field_5752.field_6247 + 1, this.field_5752.field_6245, this.field_5752.field_6249 - 2, 3, this.method_6200());
                           break;
                        case 1:
                           break label94;
                        case 2:
                           break label115;
                        case 3:
                           break label116;
                        default:
                           return;
                        }
                     }

                     if(var4 != null) {
                        return;
                     }
                  }

                  class_1249.method_6584((class_1118)var1, var2, var3, this.field_5752.field_6244, this.field_5752.field_6245, this.field_5752.field_6249 + 1, 0, this.method_6200());
                  break label114;
               }
            }

            if(var4 != null) {
               return;
            }
         }

         class_1249.method_6584((class_1118)var1, var2, var3, this.field_5752.field_6247 + 1, this.field_5752.field_6245, this.field_5752.field_6246, 3, this.method_6200());
         if(var4 != null) {
            return;
         }
      }

      class_1249.method_6584((class_1118)var1, var2, var3, this.field_5752.field_6247 - 2, this.field_5752.field_6245, this.field_5752.field_6249 + 1, 0, this.method_6200());
   }

   // $FF: renamed from: b (iY, java.util.List, java.util.Random, int, int, int, int) hS
   public static class_1206 method_6279(class_1118 var0, List var1, Random var2, int var3, int var4, int var5, int var6) {
      String[] var10000 = class_752.method_4253();
      int var8 = 7 * class_1715.method_9575(var2, 3, 5);
      String[] var7 = var10000;

      while(var8 >= 7) {
         class_1206 var9 = class_1206.method_6479(var3, var4, var5, 0, 0, 0, 3, 3, var8, var6);
         if(var7 != null) {
            if(class_1094.method_6201(var1, var9) == null) {
               return var9;
            }

            var8 -= 7;
         }

         if(var7 == null) {
            break;
         }
      }

      return null;
   }

   // $FF: renamed from: b (ahb, java.util.Random, hS) boolean
   public boolean method_6198(ahb var1, Random var2, class_1206 var3) {
      String[] var10000 = class_752.method_4253();
      aji var5 = this.method_6273(class_1192.field_6038, 0);
      String[] var4 = var10000;
      int var6 = this.field_5752.field_6244;

      label44:
      while(true) {
         int var9 = var6;

         label41:
         while(var9 <= this.field_5752.field_6247) {
            var9 = this.field_5752.field_6246;
            if(var4 == null) {
               return (boolean)var9;
            }

            int var7 = this.field_5752.field_6246;

            while(var7 <= this.field_5752.field_6249) {
               var9 = var3.method_6487(var6, 64, var7);
               if(var4 == null) {
                  continue label41;
               }

               label35: {
                  if(var4 != null) {
                     if(var9 == 0) {
                        break label35;
                     }

                     var9 = var1.method_2108(var6, var7) - 1;
                  }

                  int var8 = var9;
                  var1.method_2054(var6, var8, var7, var5, 0, 2);
               }

               ++var7;
               if(var4 == null) {
                  break;
               }
            }

            ++var6;
            if(var4 != null) {
               continue label44;
            }
            break;
         }

         var9 = 1;
         return (boolean)var9;
      }
   }

   // $FF: renamed from: <clinit> () void
   static void method_6222() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "\'\böÒ\bà(!ÇL¸[Xª";
      int var4 = "\'\böÒ\bà(!ÇL¸[Xª".length();
      char var1 = 6;
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
                  field_5825 = var5;
                  String[] var10 = field_5825;
                  field_5824 = "CL_00000528";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 220;
               break;
            case 1:
               var10009 = 218;
               break;
            case 2:
               var10009 = 47;
               break;
            case 3:
               var10009 = 2;
               break;
            case 4:
               var10009 = 203;
               break;
            case 5:
               var10009 = 63;
               break;
            default:
               var10009 = 131;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}
