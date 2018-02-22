
// $FF: renamed from: aP
public class class_898 implements class_22 {

   // $FF: renamed from: b c5
   private final class_18 height7;
   // $FF: renamed from: c add[]
   private add[] height8;
   // $FF: renamed from: d yz
   private final class_792 height9;
   // $FF: renamed from: e c6
   private class_924 text0;
   // $FF: renamed from: f int
   private int text1;
   // $FF: renamed from: h java.lang.String
   private static final String text2 = "mob.villager";


   // $FF: renamed from: <init> (yz, c5) void
   public void method_5205(class_792 var1, class_18 var2) {
      super();
      this.height8 = new add[3];
      this.height9 = var1;
      this.height7 = var2;
   }

   // $FF: renamed from: f () int
   public int method_83() {
      return this.height8.length;
   }

   // $FF: renamed from: c (int) add
   public add method_84(int var1) {
      return this.height8[var1];
   }

   // $FF: renamed from: b (int, int) add
   public add method_85(int var1, int var2) {
      String[] var3 = class_752.method_4253();
      if(this.height8[var1] == null) {
         return null;
      } else {
         int var10000;
         add var4;
         add var5;
         class_898 var6;
         label58: {
            var10000 = var1;
            int var10001 = 2;
            if(var3 != null) {
               if(var1 == 2) {
                  var4 = this.height8[var1];
                  this.height8[var1] = null;
                  return var4;
               }

               var5 = this.height8[var1];
               if(var3 == null) {
                  break label58;
               }

               var10000 = var5.field_2958;
               var10001 = var2;
            }

            if(var10000 <= var10001) {
               var4 = this.height8[var1];
               this.height8[var1] = null;
               var6 = this;
               if(var3 != null) {
                  if(!this.method_5206(var1)) {
                     return var4;
                  }

                  var6 = this;
               }

               var6.method_5207();
               return var4;
            }

            var5 = this.height8[var1].method_3729(var2);
         }

         label60: {
            var4 = var5;
            var10000 = this.height8[var1].field_2958;
            if(var3 != null) {
               if(this.height8[var1].field_2958 == 0) {
                  this.height8[var1] = null;
               }

               var6 = this;
               if(var3 == null) {
                  break label60;
               }

               var10000 = this.method_5206(var1);
            }

            if(var10000 == 0) {
               return var4;
            }

            var6 = this;
         }

         var6.method_5207();
         return var4;
      }
   }

   // $FF: renamed from: a (int) boolean
   private boolean method_5206(int var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = var1;
      if(var2 != null) {
         if(var1 != 0) {
            var10000 = var1;
            if(var2 == null) {
               return (boolean)var10000;
            }

            if(var1 != 1) {
               var10000 = 0;
               return (boolean)var10000;
            }
         }

         var10000 = 1;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: j (int) add
   public add method_86(int var1) {
      String[] var2 = class_752.method_4253();
      add var10000 = this.height8[var1];
      if(var2 != null) {
         if(var10000 == null) {
            return null;
         }

         var10000 = this.height8[var1];
      }

      add var3 = var10000;
      this.height8[var1] = null;
      return var3;
   }

   // $FF: renamed from: b (int, add) void
   public void method_87(int var1, add var2) {
      class_898 var10000;
      label33: {
         int var4;
         label34: {
            String[] var3 = class_752.method_4253();
            var10000 = this;
            if(var3 != null) {
               this.height8[var1] = var2;
               if(var2 != null) {
                  var4 = var2.field_2958;
                  if(var3 == null) {
                     break label34;
                  }

                  if(var2.field_2958 > this.method_90()) {
                     var2.field_2958 = this.method_90();
                  }
               }

               var10000 = this;
            }

            if(var3 == null) {
               break label33;
            }

            var4 = var10000.method_5206(var1);
         }

         if(var4 == 0) {
            return;
         }

         var10000 = this;
      }

      var10000.method_5207();
   }

   // $FF: renamed from: i () java.lang.String
   public String method_88() {
      return "mob.villager";
   }

   // $FF: renamed from: j () boolean
   public boolean method_89() {
      return false;
   }

   // $FF: renamed from: k () int
   public int method_90() {
      return 64;
   }

   // $FF: renamed from: b (yz) boolean
   public boolean method_92(class_792 var1) {
      return this.height7.method_55() == var1;
   }

   // $FF: renamed from: m () void
   public void method_93() {}

   // $FF: renamed from: n () void
   public void method_94() {}

   // $FF: renamed from: d (int, add) boolean
   public boolean method_95(int var1, add var2) {
      return true;
   }

   // $FF: renamed from: l () void
   public void method_91() {
      this.method_5207();
   }

   // $FF: renamed from: a () void
   public void method_5207() {
      String[] var10000 = class_752.method_4253();
      this.text0 = null;
      String[] var1 = var10000;
      add var2 = this.height8[0];
      add var3 = this.height8[1];
      add var6 = var2;
      if(var1 != null) {
         if(var2 == null) {
            var2 = var3;
            var3 = null;
         }

         var6 = var2;
      }

      label61: {
         if(var6 == null) {
            this.method_87(2, (add)null);
            if(var1 != null) {
               break label61;
            }
         }

         class_658 var4 = this.height7.method_56(this.height9);
         if(var1 == null) {
            return;
         }

         if(var4 != null) {
            label62: {
               class_924 var5;
               label47: {
                  var5 = var4.method_3565(var2, var3, this.text1);
                  class_924 var7 = var5;
                  if(var1 != null) {
                     if(var5 == null) {
                        break label47;
                     }

                     var7 = var5;
                  }

                  if(!var7.method_5426()) {
                     this.text0 = var5;
                     this.method_87(2, var5.method_5421().method_3754());
                     if(var1 != null) {
                        break label62;
                     }
                  }
               }

               if(var3 != null) {
                  var5 = var4.method_3565(var3, var2, this.text1);
                  if(var1 != null) {
                     if(var5 != null && !var5.method_5426()) {
                        this.text0 = var5;
                        this.method_87(2, var5.method_5421().method_3754());
                        if(var1 != null) {
                           break label62;
                        }
                     }

                     this.method_87(2, (add)null);
                  }

                  if(var1 != null) {
                     break label62;
                  }
               }

               this.method_87(2, (add)null);
            }
         }
      }

      this.height7.method_59(this.method_84(2));
   }

   // $FF: renamed from: b () c6
   public class_924 method_5208() {
      return this.text0;
   }

   // $FF: renamed from: b (int) void
   public void method_5209(int var1) {
      this.text1 = var1;
      this.method_5207();
   }

   // $FF: renamed from: <clinit> () void
   static void method_5210() {
      boolean var10000 = true;
      char[] var10003 = "©`²ÅwK¨n·s".toCharArray();
      Object var10004 = var10003.length;
      Object var3 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var0 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var4 = var10002;
         var10002 = var10003;
         if(var10003 <= var0) {
            text2 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 204;
            break;
         case 1:
            var10009 = 7;
            break;
         case 2:
            var10009 = 216;
            break;
         case 3:
            var10009 = 227;
            break;
         case 4:
            var10009 = 9;
            break;
         case 5:
            var10009 = 227;
            break;
         default:
            var10009 = 47;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}
