import java.util.List;

// $FF: renamed from: f4
public class class_424 extends aji {

   // $FF: renamed from: M java.lang.String[]
   public static final String[] field_2151;


   // $FF: renamed from: <init> (aji) void
   public void method_2697(aji var1) {
      super.method_2427(var1.field_2007);
      this.method_2437(var1.field_1993);
      this.method_2431(var1.field_1994 / 3.0F);
      this.method_2428(var1.field_2005);
      this.method_2521(class_872.field_4244);
   }

   // $FF: renamed from: a (int, int) vL
   public class_73 method_2448(int var1, int var2) {
      return var2 == 1?class_1192.field_6075.getBlockTextureFromSide(var1):class_1192.field_6029.getBlockTextureFromSide(var1);
   }

   // $FF: renamed from: b () int
   public int method_2436() {
      return 32;
   }

   // $FF: renamed from: d () boolean
   public boolean method_2434() {
      return false;
   }

   // $FF: renamed from: b (ahl, int, int, int) boolean
   public boolean method_2435(ahl var1, int var2, int var3, int var4) {
      return false;
   }

   // $FF: renamed from: c () boolean
   public boolean method_2453() {
      return false;
   }

   // $FF: renamed from: a (ahl, int, int, int) void
   public void method_2486(ahl var1, int var2, int var3, int var4) {
      boolean var6 = this.method_2698(var1, var2, var3, var4 - 1);
      boolean var7 = this.method_2698(var1, var2, var3, var4 + 1);
      String[] var10000 = class_752.method_4253();
      boolean var8 = this.method_2698(var1, var2 - 1, var3, var4);
      boolean var9 = this.method_2698(var1, var2 + 1, var3, var4);
      String[] var5 = var10000;
      float var10 = 0.25F;
      float var11 = 0.75F;
      float var12 = 0.25F;
      float var13 = 0.75F;
      float var14 = 1.0F;
      boolean var15 = var6;
      if(var5 != null) {
         if(var6) {
            var12 = 0.0F;
         }

         var15 = var7;
      }

      if(var5 != null) {
         if(var15) {
            var13 = 1.0F;
         }

         var15 = var8;
      }

      if(var5 != null) {
         if(var15) {
            var10 = 0.0F;
         }

         var15 = var9;
      }

      if(var5 != null) {
         if(var15) {
            var11 = 1.0F;
         }

         var15 = var6;
      }

      label92: {
         if(var5 != null) {
            label81: {
               if(var15) {
                  var15 = var7;
                  if(var5 == null) {
                     break label81;
                  }

                  if(var7) {
                     var15 = var8;
                     if(var5 == null) {
                        break label81;
                     }

                     if(!var8) {
                        var15 = var9;
                        if(var5 == null) {
                           break label81;
                        }

                        if(!var9) {
                           var14 = 0.8125F;
                           var10 = 0.3125F;
                           var11 = 0.6875F;
                           if(var5 != null) {
                              break label92;
                           }
                        }
                     }
                  }
               }

               var15 = var6;
            }
         }

         if(var5 != null) {
            if(var15) {
               break label92;
            }

            var15 = var7;
         }

         if(var5 != null) {
            if(var15) {
               break label92;
            }

            var15 = var8;
         }

         if(var5 != null) {
            if(!var15) {
               break label92;
            }

            var15 = var9;
         }

         if(var15) {
            var14 = 0.8125F;
            var12 = 0.3125F;
            var13 = 0.6875F;
         }
      }

      this.method_2443(var10, 0.0F, var12, var11, var14, var13);
   }

   // $FF: renamed from: a (ahb, int, int, int) kg
   public class_1343 method_2452(ahb var1, int var2, int var3, int var4) {
      this.method_2486(var1, var2, var3, var4);
      this.field_2003 = 1.5D;
      return super.method_2452(var1, var2, var3, var4);
   }

   // $FF: renamed from: f (ahl, int, int, int) boolean
   public boolean method_2698(ahl var1, int var2, int var3, int var4) {
      aji var10000;
      String[] var5;
      aji var6;
      label44: {
         var6 = var1.getBlock(var2, var3, var4);
         var5 = class_752.method_4253();
         var10000 = var6;
         Object var10001 = this;
         if(var5 != null) {
            if(var6 == this) {
               return true;
            }

            var10000 = var6;
            if(var5 == null) {
               break label44;
            }

            var10001 = class_1192.field_6132;
         }

         if(var10000 == var10001) {
            return true;
         }

         var10000 = var6;
      }

      boolean var7 = var10000.field_2007.method_5072();
      if(var5 != null) {
         if(var7) {
            var7 = var6.method_2434();
            if(var5 == null) {
               return var7;
            }

            if(var7) {
               return var6.field_2007 != awt.field_4198;
            }
         }

         var7 = false;
      }

      return var7;
   }

   // $FF: renamed from: a (adb, a5, java.util.List) void
   public void method_2519(adb var1, class_872 var2, List var3) {
      add var10001 = new add;
      var10001.method_3726(var1, 1, 0);
      var3.add(var10001);
      var10001 = new add;
      var10001.method_3726(var1, 1, 1);
      var3.add(var10001);
   }

   // $FF: renamed from: a (int) int
   public int method_2470(int var1) {
      return var1;
   }

   // $FF: renamed from: a (ahl, int, int, int, int) boolean
   public boolean method_2445(ahl var1, int var2, int var3, int var4, int var5) {
      String[] var6 = class_752.method_4253();
      int var10000 = var5;
      if(var6 != null) {
         if(var5 == 0) {
            return super.method_2445(var1, var2, var3, var4, var5);
         }

         var10000 = 1;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: a (vM) void
   public void method_2535(class_74 var1) {}

   // $FF: renamed from: <clinit> () void
   static void method_2537() {
      String[] var6 = new String[2];
      int var4 = 0;
      String var3 = "»R\"õT¸S<í";
      int var5 = "»R\"õT¸S<í".length();
      char var2 = 6;
      int var1 = -1;

      while(true) {
         ++var1;
         String var10002 = var3.substring(var1, var1 + var2);
         boolean var10000 = true;
         char[] var10003 = var10002.toCharArray();
         Object var10004 = var10003.length;
         Object var10 = true;
         char[] var9 = var10003;
         char[] var10001 = (char[])var10004;
         int var7 = 0;

         while(true) {
            var10003 = var9;
            var9 = var10001;
            var10001 = var10003;
            char[] var11 = var9;
            var9 = var10003;
            if(var10003 <= var7) {
               var6[var4++] = (new String((char[])var10)).intern();
               if((var1 += var2) >= var5) {
                  field_2151 = new String[]{"normal", "mossy"};
                  return;
               }

               var2 = var3.charAt(var1);
               break;
            }

            char var10007 = (char)((Object[])var10)[var7];
            short var10009;
            switch(var7 % 7) {
            case 0:
               var10009 = 116;
               break;
            case 1:
               var10009 = 221;
               break;
            case 2:
               var10009 = 129;
               break;
            case 3:
               var10009 = 238;
               break;
            case 4:
               var10009 = 53;
               break;
            case 5:
               var10009 = 153;
               break;
            default:
               var10009 = 248;
            }

            ((Object[])var10)[var7] = (char)(var10007 ^ var11 ^ var10009);
            ++var7;
         }
      }
   }
}
