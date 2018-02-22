import java.util.ArrayList;
import java.util.List;

// $FF: renamed from: Au
class class_677 extends class_671 {

   // $FF: renamed from: i java.util.List
   public List field_2909;
   // $FF: renamed from: l java.lang.String
   private static final String field_2910 = "CL_00000753";


   // $FF: renamed from: <init> (yz) void
   public void method_3693(class_792 var1) {
      super.method_3645();
      String[] var10000 = class_752.method_4253();
      this.field_2909 = new ArrayList();
      String[] var2 = var10000;
      class_666 var3 = var1.field_3616;
      int var4 = 0;

      class_492 var10001;
      byte var6;
      while(true) {
         if(var4 < 5) {
            var6 = 0;
            if(var2 == null) {
               break;
            }

            int var5 = 0;

            while(true) {
               if(var5 < 9) {
                  var10001 = new class_492;
                  var10001.method_2869(class_228.method_1236(), var4 * 9 + var5, 9 + var5 * 18, 18 + var4 * 18);
                  this.method_3646(var10001);
                  ++var5;
                  if(var2 == null) {
                     break;
                  }

                  if(var2 != null) {
                     continue;
                  }
               }

               ++var4;
               break;
            }

            if(var2 != null) {
               continue;
            }
         }

         var6 = 0;
         break;
      }

      var4 = var6;

      while(true) {
         if(var4 < 9) {
            var10001 = new class_492;
            var10001.method_2869(var3, var4, 9 + var4 * 18, 112);
            this.method_3646(var10001);
            ++var4;
            if(var2 == null) {
               break;
            }

            if(var2 != null) {
               continue;
            }
         }

         this.method_3694(0.0F);
         break;
      }

   }

   // $FF: renamed from: c (yz) boolean
   public boolean method_3666(class_792 var1) {
      return true;
   }

   // $FF: renamed from: b (float) void
   public void method_3694(float var1) {
      int var3 = this.field_2909.size() / 9 - 5 + 1;
      String[] var10000 = class_752.method_4253();
      int var4 = (int)((double)(var1 * (float)var3) + 0.5D);
      String[] var2 = var10000;
      int var8 = var4;
      if(var2 != null) {
         if(var4 < 0) {
            var4 = 0;
         }

         var8 = 0;
      }

      int var5 = var8;

      do {
         var8 = var5;

         label50:
         while(true) {
            if(var8 >= 5) {
               return;
            }

            int var6 = 0;

            while(true) {
               if(var6 >= 9) {
                  break label50;
               }

               int var7 = var6 + (var5 + var4) * 9;
               var8 = var7;
               if(var2 == null) {
                  break;
               }

               label45: {
                  label44: {
                     if(var2 != null) {
                        if(var7 < 0) {
                           break label44;
                        }

                        var8 = var7;
                     }

                     if(var8 < this.field_2909.size()) {
                        class_228.method_1236().method_87(var6 + var5 * 9, (add)this.field_2909.get(var7));
                        if(var2 != null) {
                           break label45;
                        }
                     }
                  }

                  class_228.method_1236().method_87(var6 + var5 * 9, (add)null);
               }

               ++var6;
               if(var2 == null) {
                  break label50;
               }
            }
         }

         ++var5;
      } while(var2 != null);

   }

   // $FF: renamed from: a () boolean
   public boolean method_3695() {
      String[] var1 = class_752.method_4253();
      int var10000 = this.field_2909.size();
      if(var1 != null) {
         var10000 = var10000 > 45?1:0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: b (int, int, boolean, yz) void
   protected void method_3657(int var1, int var2, boolean var3, class_792 var4) {}

   // $FF: renamed from: c (yz, int) add
   public add method_3654(class_792 var1, int var2) {
      String[] var3 = class_752.method_4253();
      int var10000 = var2;
      int var10001 = this.field_2869.size() - 9;
      if(var3 != null) {
         if(var2 < var10001) {
            return null;
         }

         var10000 = var2;
         var10001 = this.field_2869.size();
      }

      if(var10000 < var10001) {
         class_492 var4 = (class_492)this.field_2869.get(var2);
         class_492 var5 = var4;
         if(var3 != null) {
            if(var4 == null) {
               return null;
            }

            var5 = var4;
         }

         if(var3 != null) {
            if(!var5.method_2876()) {
               return null;
            }

            var5 = var4;
         }

         var5.method_2877((add)null);
      }

      return null;
   }

   // $FF: renamed from: b (add, aR) boolean
   public boolean method_3656(add var1, class_492 var2) {
      String[] var3 = class_752.method_4253();
      int var10000 = var2.field_2289;
      if(var3 != null) {
         var10000 = var2.field_2289 > 90?1:0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: c (aR) boolean
   public boolean method_3675(class_492 var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = var1.field_2286 instanceof class_666;
      if(var2 != null) {
         if(var10000 == 0) {
            label36: {
               label24: {
                  var10000 = var1.field_2289;
                  short var10001 = 90;
                  if(var2 != null) {
                     if(var1.field_2289 <= 90) {
                        break label24;
                     }

                     var10000 = var1.field_2288;
                     if(var2 == null) {
                        return (boolean)var10000;
                     }

                     var10001 = 162;
                  }

                  if(var10000 <= var10001) {
                     break label36;
                  }
               }

               var10000 = 0;
               return (boolean)var10000;
            }
         }

         var10000 = 1;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: <clinit> () void
   static void method_3678() {
      boolean var10000 = true;
      char[] var10003 = "ÉöA(7Æº+".toCharArray();
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
            field_2910 = (new String((char[])var4)).intern();
            String var2 = field_2910;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 100;
            break;
         case 1:
            var10009 = 84;
            break;
         case 2:
            var10009 = 240;
            break;
         case 3:
            var10009 = 67;
            break;
         case 4:
            var10009 = 246;
            break;
         case 5:
            var10009 = 233;
            break;
         default:
            var10009 = 24;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
