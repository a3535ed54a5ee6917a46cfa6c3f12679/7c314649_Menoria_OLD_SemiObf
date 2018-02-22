import java.util.Random;

// $FF: renamed from: eJ
public class class_442 extends aji {

   // $FF: renamed from: M vL
   private IIcon field_2182;
   // $FF: renamed from: N vL
   private IIcon field_2183;
   // $FF: renamed from: O java.lang.String[]
   private static final String[] field_2184;


   // $FF: renamed from: <init> () void
   protected void method_2761() {
      super.method_2427(awt.field_4196);
      this.method_2440(true);
      this.method_2521(class_872.field_4245);
   }

   // $FF: renamed from: a (ahb, int, int, int, java.util.Random) void
   public void method_2456(ahb var1, int var2, int var3, int var4, Random var5) {
      String[] var6 = class_752.method_4253();
      byte var10000 = var1.method_34(var2, var3 + 1, var4);
      if(var6 != null) {
         if(var10000 == 0) {
            return;
         }

         var10000 = 1;
      }

      int var7 = var10000;

      while(true) {
         if(var1.getBlock(var2, var3 - var7, var4) == this) {
            ++var7;
            if(var6 == null) {
               break;
            }

            if(var6 != null) {
               continue;
            }
         }

         int var9 = var7;
         if(var6 != null) {
            if(var7 >= 3) {
               break;
            }

            var9 = var1.method_33(var2, var3, var4);
         }

         int var8 = var9;
         if(var6 != null) {
            if(var8 == 15) {
               var1.method_2058(var2, var3 + 1, var4, this);
               var1.method_2055(var2, var3, var4, 0, 4);
               this.method_2459(var1, var2, var3 + 1, var4, this);
               if(var6 != null) {
                  break;
               }
            }

            var1.method_2055(var2, var3, var4, var8 + 1, 4);
         }
         break;
      }

   }

   // $FF: renamed from: a (ahb, int, int, int) kg
   public class_1343 method_2452(ahb var1, int var2, int var3, int var4) {
      float var5 = 0.0625F;
      return class_1343.method_7093((double)((float)var2 + var5), (double)var3, (double)((float)var4 + var5), (double)((float)(var2 + 1) - var5), (double)((float)(var3 + 1) - var5), (double)((float)(var4 + 1) - var5));
   }

   // $FF: renamed from: g (ahb, int, int, int) kg
   public class_1343 method_2450(ahb var1, int var2, int var3, int var4) {
      float var5 = 0.0625F;
      return class_1343.method_7093((double)((float)var2 + var5), (double)var3, (double)((float)var4 + var5), (double)((float)(var2 + 1) - var5), (double)(var3 + 1), (double)((float)(var4 + 1) - var5));
   }

   // $FF: renamed from: a (int, int) vL
   public IIcon method_2448(int var1, int var2) {
      String[] var3 = class_752.method_4253();
      int var10000 = var1;
      if(var3 != null) {
         if(var1 == 1) {
            return this.field_2182;
         }

         var10000 = var1;
      }

      return var10000 == 0?this.field_2183:this.field_2010;
   }

   // $FF: renamed from: d () boolean
   public boolean method_2434() {
      return false;
   }

   // $FF: renamed from: c () boolean
   public boolean method_2453() {
      return false;
   }

   // $FF: renamed from: b () int
   public int method_2436() {
      return 13;
   }

   // $FF: renamed from: c (ahb, int, int, int) boolean
   public boolean method_2480(ahb var1, int var2, int var3, int var4) {
      String[] var5 = class_752.method_4253();
      boolean var10000 = super.method_2480(var1, var2, var3, var4);
      if(var5 != null) {
         if(!var10000) {
            return false;
         }

         var10000 = this.method_2505(var1, var2, var3, var4);
      }

      return var10000;
   }

   // $FF: renamed from: a (ahb, int, int, int, aji) void
   public void method_2459(ahb var1, int var2, int var3, int var4, aji var5) {
      String[] var6 = class_752.method_4253();
      if(var6 != null && !this.method_2505(var1, var2, var3, var4)) {
         var1.method_2057(var2, var3, var4, true);
      }

   }

   // $FF: renamed from: j (ahb, int, int, int) boolean
   public boolean method_2505(ahb var1, int var2, int var3, int var4) {
      String[] var5 = class_752.method_4253();
      boolean var10000 = var1.getBlock(var2 - 1, var3, var4).method_2424().method_5063();
      if(var5 != null) {
         if(var10000) {
            return false;
         }

         var10000 = var1.getBlock(var2 + 1, var3, var4).method_2424().method_5063();
      }

      if(var5 != null) {
         if(var10000) {
            return false;
         }

         var10000 = var1.getBlock(var2, var3, var4 - 1).method_2424().method_5063();
      }

      aji var7;
      label55: {
         if(var5 != null) {
            if(var10000) {
               return false;
            }

            var7 = var1.getBlock(var2, var3, var4 + 1);
            if(var5 == null) {
               break label55;
            }

            var10000 = var7.method_2424().method_5063();
         }

         if(var10000) {
            return false;
         }

         var7 = var1.getBlock(var2, var3 - 1, var4);
      }

      label41: {
         aji var6 = var7;
         var7 = var6;
         if(var5 != null) {
            if(var6 == class_1192.field_6107) {
               break label41;
            }

            var7 = var6;
         }

         if(var7 != class_1192.field_6037) {
            var10000 = false;
            return var10000;
         }
      }

      var10000 = true;
      return var10000;
   }

   // $FF: renamed from: a (ahb, int, int, int, sa) void
   public void method_2498(ahb var1, int var2, int var3, int var4, class_689 var5) {
      var5.method_3896(class_1691.field_8836, 1.0F);
   }

   // $FF: renamed from: a (vM) void
   public void method_2535(class_74 var1) {
      StringBuilder var10002 = (new StringBuilder()).append(this.method_2533());
      String[] var2 = field_2184;
      this.field_2010 = var1.method_375(var10002.append("_side").toString());
      this.field_2182 = var1.method_375(this.method_2533() + "_top");
      this.field_2183 = var1.method_375(this.method_2533() + "_bottom");
   }

   // $FF: renamed from: <clinit> () void
   static void method_2537() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "\\½cpy\\¬e`h\rï\\ºed";
      int var4 = "\\½cpy\\¬e`h\rï\\ºed".length();
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
                  field_2184 = var5;
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 208;
               break;
            case 1:
               var10009 = 29;
               break;
            case 2:
               var10009 = 217;
               break;
            case 3:
               var10009 = 199;
               break;
            case 4:
               var10009 = 207;
               break;
            case 5:
               var10009 = 177;
               break;
            default:
               var10009 = 81;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var10 ^ var10009);
            ++var6;
         }
      }
   }
}
