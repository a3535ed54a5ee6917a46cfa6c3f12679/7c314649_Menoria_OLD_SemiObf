import java.util.Iterator;
import java.util.List;

// $FF: renamed from: ci
public class class_512 extends adb {

   // $FF: renamed from: n vL
   private class_73 field_2349;
   // $FF: renamed from: o java.lang.String[]
   private static final String[] field_2350;


   // $FF: renamed from: <init> () void
   public void method_2917() {
      super.method_2917();
      this.method_2933(true);
      this.method_2974(class_872.field_4248);
   }

   // $FF: renamed from: n (add) java.lang.String
   public String method_2964(add var1) {
      String[] var10000 = class_752.method_4253();
      StringBuilder var10001 = (new StringBuilder()).append("");
      StringBuilder var10002 = (new StringBuilder()).append(this.getUnlocalizedName());
      String[] var5 = field_2350;
      String var3 = var10001.append(class_1563.method_8581(var10002.append(".name").toString())).toString().trim();
      String[] var2 = var10000;
      String var4 = class_1775.method_9760(var1.method_3745());
      String var6 = var4;
      if(var2 != null) {
         if(var4 != null) {
            var3 = var3 + " " + class_1563.method_8581("entity." + var4 + ".name");
         }

         var6 = var3;
      }

      return var6;
   }

   // $FF: renamed from: a (add, int) int
   public int method_2953(add var1, int var2) {
      String[] var10000 = class_752.method_4253();
      class_1777 var4 = (class_1777)class_1775.field_9269.get(Integer.valueOf(var1.method_3745()));
      String[] var3 = var10000;
      if(var4 != null) {
         int var5 = var2;
         if(var3 != null) {
            if(var2 == 0) {
               return var4.field_9281;
            }

            var5 = var4.field_9282;
         }

         return var5;
      } else {
         return 16777215;
      }
   }

   // $FF: renamed from: b () boolean
   public boolean method_2970() {
      return true;
   }

   // $FF: renamed from: a (int, int) vL
   public class_73 method_2971(int var1, int var2) {
      return var2 > 0?this.field_2349:super.method_2971(var1, var2);
   }

   // $FF: renamed from: a (add, yz, ahb, int, int, int, int, float, float, float) boolean
   public boolean method_2926(add var1, class_792 var2, ahb var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
      String[] var11 = class_752.method_4253();
      ahb var10000 = var3;
      if(var11 != null) {
         if(var3.field_1832) {
            return true;
         }

         var10000 = var3;
      }

      double var13;
      label54: {
         aji var12 = var10000.getBlock(var4, var5, var6);
         var4 += class_1707.field_8947[var7];
         var5 += class_1707.field_8948[var7];
         var6 += class_1707.field_8949[var7];
         var13 = 0.0D;
         int var16 = var7;
         byte var10001 = 1;
         if(var11 != null) {
            if(var7 != 1) {
               break label54;
            }

            var16 = var12.method_2436();
            var10001 = 11;
         }

         if(var16 == var10001) {
            var13 = 0.5D;
         }
      }

      boolean var18;
      label58: {
         class_689 var15 = method_2987(var3, var1.method_3745(), (double)var4 + 0.5D, (double)var5 + var13, (double)var6 + 0.5D);
         class_689 var17 = var15;
         if(var11 != null) {
            if(var15 == null) {
               break label58;
            }

            var17 = var15;
         }

         var18 = var17 instanceof class_752;
         if(var11 != null) {
            label37: {
               if(var18) {
                  var18 = var1.method_3773();
                  if(var11 == null) {
                     break label37;
                  }

                  if(var18) {
                     ((class_753)var15).method_4286(var1.method_3770());
                  }
               }

               var18 = var2.field_3640.field_2839;
            }
         }

         if(var11 == null) {
            return var18;
         }

         if(!var18) {
            --var1.field_2958;
         }
      }

      var18 = true;
      return var18;
   }

   // $FF: renamed from: a (add, ahb, yz) add
   public add method_2928(add var1, ahb var2, class_792 var3) {
      String[] var4 = class_752.method_4253();
      if(var2.field_1832) {
         return var1;
      } else {
         azu var5 = this.method_2968(var2, var3, true);
         azu var10000 = var5;
         if(var4 != null) {
            if(var5 == null) {
               return var1;
            }

            var10000 = var5;
         }

         if(var4 != null) {
            if(var10000.field_4212 != class_100.field_85) {
               return var1;
            }

            var10000 = var5;
         }

         int var6 = var10000.field_4213;
         int var7 = var5.field_4214;
         int var8 = var5.field_4215;
         boolean var10 = var2.method_2190(var3, var6, var7, var8);
         if(var4 != null) {
            if(!var10) {
               return var1;
            }

            var10 = var3.method_4628(var6, var7, var8, var5.field_4216, var1);
         }

         ahb var11;
         int var10001;
         int var10002;
         label79: {
            if(var4 != null) {
               if(!var10) {
                  return var1;
               }

               var11 = var2;
               var10001 = var6;
               var10002 = var7;
               if(var4 == null) {
                  break label79;
               }

               var10 = var2.getBlock(var6, var7, var8) instanceof class_366;
            }

            if(!var10) {
               return var1;
            }

            var11 = var2;
            var10001 = var1.method_3745();
            var10002 = var6;
         }

         class_689 var9 = method_2987(var11, var10001, (double)var10002, (double)var7, (double)var8);
         class_689 var12 = var9;
         if(var4 != null) {
            if(var9 == null) {
               return var1;
            }

            var12 = var9;
         }

         var10 = var12 instanceof class_752;
         if(var4 != null) {
            label49: {
               if(var10) {
                  var10 = var1.method_3773();
                  if(var4 == null) {
                     break label49;
                  }

                  if(var10) {
                     ((class_753)var9).method_4286(var1.method_3770());
                  }
               }

               var10 = var3.field_3640.field_2839;
            }
         }

         if(!var10) {
            --var1.field_2958;
         }

         return var1;
      }
   }

   // $FF: renamed from: b (ahb, int, double, double, double) sa
   public static class_689 method_2987(ahb var0, int var1, double var2, double var4, double var6) {
      String[] var8 = class_752.method_4253();
      if(!class_1775.field_9269.containsKey(Integer.valueOf(var1))) {
         return null;
      } else {
         class_689 var9 = null;
         int var10 = 0;

         class_689 var10000;
         while(true) {
            if(var10 < 1) {
               var9 = class_1775.method_9756(var1, var0);
               if(var8 != null) {
                  var10000 = var9;
                  if(var8 == null) {
                     break;
                  }

                  if(var9 != null) {
                     label28: {
                        var10000 = var9;
                        if(var8 != null) {
                           if(!(var9 instanceof class_752)) {
                              break label28;
                           }

                           var10000 = var9;
                        }

                        class_753 var11 = (class_753)var10000;
                        var9.method_3887(var2, var4, var6, class_1715.method_9579(var0.field_1819.nextFloat() * 360.0F), 0.0F);
                        var11.field_3332 = var11.field_3000;
                        var11.field_3330 = var11.field_3000;
                        var11.method_4282((class_83)null);
                        var0.method_2089(var9);
                        var11.method_4264();
                     }
                  }

                  ++var10;
               }

               if(var8 != null) {
                  continue;
               }
            }

            var10000 = var9;
            break;
         }

         return var10000;
      }
   }

   // $FF: renamed from: a (adb, a5, java.util.List) void
   public void getSubItems(adb var1, class_872 var2, List var3) {
      String[] var10000 = class_752.method_4253();
      Iterator var5 = class_1775.field_9269.values().iterator();
      String[] var4 = var10000;

      while(var5.hasNext()) {
         class_1777 var6 = (class_1777)var5.next();
         add var10001 = new add;
         var10001.method_3726(var1, 1, var6.field_9280);
         var3.add(var10001);
         if(var4 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: a (vM) void
   public void registerIcons(class_74 var1) {
      super.registerIcons(var1);
      StringBuilder var10002 = (new StringBuilder()).append(this.method_2980());
      String[] var10003 = field_2350;
      this.field_2349 = var1.method_375(var10002.append("_overlay").toString());
   }

   // $FF: renamed from: <clinit> () void
   static void method_2981() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "Ä`_\býÅwHNÛÇÄuN";
      int var4 = "Ä`_\býÅwHNÛÇÄuN".length();
      char var1 = 5;
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
            char[] var10 = var8;
            var8 = var10003;
            if(var10003 <= var6) {
               var5[var3++] = (new String((char[])var9)).intern();
               if((var0 += var1) >= var4) {
                  field_2350 = var5;
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 36;
               break;
            case 1:
               var10009 = 44;
               break;
            case 2:
               var10009 = 135;
               break;
            case 3:
               var10009 = 103;
               break;
            case 4:
               var10009 = 188;
               break;
            case 5:
               var10009 = 122;
               break;
            default:
               var10009 = 169;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var10 ^ var10009);
            ++var6;
         }
      }
   }
}
