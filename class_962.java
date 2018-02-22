import java.util.ArrayList;
import java.util.Iterator;

// $FF: renamed from: mr
class class_962 extends class_961 {

   // $FF: renamed from: D java.lang.String
   private static final String field_4886;
   // $FF: renamed from: E lF
   final class_195 field_4887;
   // $FF: renamed from: F java.lang.String[]
   private static final String[] field_4888;


   // $FF: renamed from: <init> (lF) void
   public void method_5581(class_195 var1) {
      this.field_4887 = var1;
      super.method_5581(var1);
      String[] var10000 = class_752.method_4253();
      this.field_4879 = new ArrayList();
      String[] var2 = var10000;
      Iterator var3 = class_1698.field_8883.iterator();

      while(true) {
         if(var3.hasNext()) {
            class_1602 var4 = (class_1602)var3.next();
            int var5 = 0;
            int var6 = adb.method_2918(var4.method_8763());
            if(var2 == null) {
               break;
            }

            int var7;
            label63: {
               label73: {
                  label61: {
                     var7 = class_195.method_1044(var1).method_9402(var4);
                     if(var2 != null) {
                        if(var7 <= 0) {
                           break label61;
                        }

                        var7 = 1;
                     }

                     var5 = var7;
                     if(var2 != null) {
                        break label73;
                     }
                  }

                  class_1601 var8 = class_1698.field_8911[var6];
                  if(var2 != null) {
                     if(var8 != null) {
                        label50: {
                           var7 = class_195.method_1044(var1).method_9402(class_1698.field_8911[var6]);
                           if(var2 != null) {
                              if(var7 <= 0) {
                                 break label50;
                              }

                              var7 = 1;
                           }

                           var5 = var7;
                           if(var2 != null) {
                              break label73;
                           }
                        }
                     }

                     var8 = class_1698.field_8909[var6];
                  }

                  if(var8 != null) {
                     var7 = class_195.method_1044(var1).method_9402(class_1698.field_8909[var6]);
                     if(var2 == null) {
                        break label63;
                     }

                     if(var7 > 0) {
                        var5 = 1;
                     }
                  }
               }

               var7 = var5;
            }

            if(var2 != null && var7 != 0) {
               this.field_4879.add(var4);
            }

            if(var2 != null) {
               continue;
            }
         }

         class_1419 var10001 = new class_1419;
         var10001.method_7752(this, var1);
         this.field_4880 = var10001;
         break;
      }

   }

   // $FF: renamed from: a (int, int, bmh) void
   protected void method_5559(int var1, int var2, bmh var3) {
      class_962 var10000;
      String[] var4;
      label39: {
         super.method_5559(var1, var2, var3);
         var4 = class_752.method_4253();
         var10000 = this;
         if(var4 != null) {
            if(this.field_4878 == 0) {
               class_195.method_1043(this.field_4887, var1 + 115 - 18 + 1, var2 + 1 + 1, 72, 18);
               if(var4 != null) {
                  break label39;
               }
            }

            var10000 = this;
         }

         class_195.method_1043(var10000.field_4887, var1 + 115 - 18, var2 + 1, 72, 18);
      }

      label32: {
         var10000 = this;
         if(var4 != null) {
            if(this.field_4878 == 1) {
               class_195.method_1043(this.field_4887, var1 + 165 - 18 + 1, var2 + 1 + 1, 18, 18);
               if(var4 != null) {
                  break label32;
               }
            }

            var10000 = this;
         }

         class_195.method_1043(var10000.field_4887, var1 + 165 - 18, var2 + 1, 18, 18);
      }

      var10000 = this;
      if(var4 != null) {
         if(this.field_4878 == 2) {
            class_195.method_1043(this.field_4887, var1 + 215 - 18 + 1, var2 + 1 + 1, 36, 18);
            if(var4 != null) {
               return;
            }
         }

         var10000 = this;
      }

      class_195.method_1043(var10000.field_4887, var1 + 215 - 18, var2 + 1, 36, 18);
   }

   // $FF: renamed from: a (int, int, int, int, bmh, int, int) void
   protected void method_5558(int var1, int var2, int var3, int var4, bmh var5, int var6, int var7) {
      class_1602 var9 = this.method_5582(var1);
      String[] var10000 = class_752.method_4253();
      adb var10 = var9.method_8763();
      String[] var8 = var10000;
      class_195.method_1055(this.field_4887, var2 + 40, var3, var10);
      int var11 = adb.method_2918(var10);
      class_1601 var10001 = class_1698.field_8911[var11];
      int var10002 = var2 + 115;
      int var10004 = var1 % 2;
      if(var8 != null) {
         var10004 = var10004 == 0?1:0;
      }

      this.method_5584(var10001, var10002, var3, (boolean)var10004);
      var10001 = class_1698.field_8909[var11];
      var10002 = var2 + 165;
      var10004 = var1 % 2;
      if(var8 != null) {
         var10004 = var10004 == 0?1:0;
      }

      this.method_5584(var10001, var10002, var3, (boolean)var10004);
      var10002 = var2 + 215;
      var10004 = var1 % 2;
      if(var8 != null) {
         var10004 = var10004 == 0?1:0;
      }

      this.method_5584(var9, var10002, var3, (boolean)var10004);
   }

   // $FF: renamed from: c (int) java.lang.String
   protected String method_5583(int var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = var1;
      byte var10001 = 1;
      String[] var3;
      String var4;
      if(var2 != null) {
         if(var1 == 1) {
            var3 = field_4888;
            var4 = "stat.crafted";
            return var4;
         }

         var10000 = var1;
         var10001 = 2;
      }

      if(var10000 == var10001) {
         var3 = field_4888;
         var4 = "stat.used";
      } else {
         String[] var5 = field_4888;
         var4 = "stat.depleted";
      }

      return var4;
   }

   // $FF: renamed from: <clinit> () void
   static void method_5579() {
      // $FF: Couldn't be decompiled
   }
}
