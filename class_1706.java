import java.util.HashSet;
import java.util.Set;

// $FF: renamed from: vl
public class class_1706 {

   // $FF: renamed from: b vn[]
   private transient class_1708[] field_8939;
   // $FF: renamed from: c int
   private transient int field_8940;
   // $FF: renamed from: d int
   private int field_8941;
   // $FF: renamed from: e float
   private final float field_8942;
   // $FF: renamed from: f int
   private transient volatile int field_8943;
   // $FF: renamed from: g java.util.Set
   private Set field_8944;
   // $FF: renamed from: h java.lang.String
   private static final String field_8945 = "CL_00001490";


   // $FF: renamed from: <init> () void
   public void method_9472() {
      super();
      this.field_8939 = new class_1708[16];
      this.field_8941 = 12;
      this.field_8942 = 0.75F;
      this.field_8944 = new HashSet();
   }

   // $FF: renamed from: a (int) int
   private static int method_9473(int var0) {
      var0 ^= var0 >>> 20 ^ var0 >>> 12;
      return var0 ^ var0 >>> 7 ^ var0 >>> 4;
   }

   // $FF: renamed from: b (int, int) int
   private static int method_9474(int var0, int var1) {
      return var0 & var1 - 1;
   }

   // $FF: renamed from: b (int) java.lang.Object
   public Object method_9475(int var1) {
      String[] var10000 = class_752.method_4253();
      int var3 = method_9473(var1);
      String[] var2 = var10000;
      class_1708 var4 = this.field_8939[method_9474(var3, this.field_8939.length)];

      while(var4 != null) {
         class_1708 var5 = var4;
         if(var2 != null) {
            if(var4.field_8951 == var1) {
               return var4.field_8952;
            }

            var5 = var4.field_8953;
         }

         var4 = var5;
         if(var2 == null) {
            break;
         }
      }

      return null;
   }

   // $FF: renamed from: c (int) boolean
   public boolean method_9476(int var1) {
      return this.method_9477(var1) != null;
   }

   // $FF: renamed from: d (int) vn
   final class_1708 method_9477(int var1) {
      String[] var10000 = class_752.method_4253();
      int var3 = method_9473(var1);
      String[] var2 = var10000;
      class_1708 var4 = this.field_8939[method_9474(var3, this.field_8939.length)];

      while(var4 != null) {
         class_1708 var5 = var4;
         if(var2 != null) {
            if(var4.field_8951 == var1) {
               return var4;
            }

            var5 = var4.field_8953;
         }

         var4 = var5;
         if(var2 == null) {
            break;
         }
      }

      return null;
   }

   // $FF: renamed from: b (int, java.lang.Object) void
   public void method_9478(int var1, Object var2) {
      this.field_8944.add(Integer.valueOf(var1));
      int var4 = method_9473(var1);
      String[] var10000 = class_752.method_4253();
      int var5 = method_9474(var4, this.field_8939.length);
      class_1708 var6 = this.field_8939[var5];
      String[] var3 = var10000;

      while(true) {
         if(var6 != null) {
            if(var3 == null) {
               break;
            }

            class_1708 var7 = var6;
            if(var3 != null) {
               if(var6.field_8951 == var1) {
                  var6.field_8952 = var2;
                  return;
               }

               var7 = var6.field_8953;
            }

            var6 = var7;
            if(var3 != null) {
               continue;
            }
         }

         ++this.field_8943;
         this.method_9484(var4, var1, var2, var5);
         break;
      }

   }

   // $FF: renamed from: e (int) void
   private void method_9479(int var1) {
      String[] var10000 = class_752.method_4253();
      class_1708[] var3 = this.field_8939;
      String[] var2 = var10000;
      int var4 = var3.length;
      int var6 = var4;
      if(var2 != null) {
         if(var4 == 1073741824) {
            this.field_8941 = Integer.MAX_VALUE;
            if(var2 != null) {
               return;
            }
         }

         var6 = var1;
      }

      class_1708[] var5 = new class_1708[var6];
      this.method_9480(var5);
      this.field_8939 = var5;
      float var10001 = (float)var1;
      this.getClass();
      this.field_8941 = (int)(var10001 * 0.75F);
   }

   // $FF: renamed from: b (vn[]) void
   private void method_9480(class_1708[] var1) {
      String[] var10000 = class_752.method_4253();
      class_1708[] var3 = this.field_8939;
      int var4 = var1.length;
      String[] var2 = var10000;
      int var5 = 0;

      while(var5 < var3.length) {
         class_1708 var6 = var3[var5];
         if(var2 != null) {
            if(var6 != null) {
               var3[var5] = null;

               class_1708 var7;
               do {
                  var7 = var6.field_8953;
                  int var8 = method_9474(var6.field_8954, var4);
                  var6.field_8953 = var1[var8];
                  var1[var8] = var6;
                  var6 = var7;
               } while(var7 != null);
            }

            ++var5;
         }

         if(var2 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: f (int) java.lang.Object
   public Object method_9481(int var1) {
      String[] var10000 = class_752.method_4253();
      this.field_8944.remove(Integer.valueOf(var1));
      class_1708 var3 = this.method_9482(var1);
      String[] var2 = var10000;
      class_1708 var4 = var3;
      Object var5;
      if(var2 != null) {
         if(var3 == null) {
            var5 = null;
            return var5;
         }

         var4 = var3;
      }

      var5 = var4.field_8952;
      return var5;
   }

   // $FF: renamed from: g (int) vn
   final class_1708 method_9482(int var1) {
      int var3 = method_9473(var1);
      String[] var10000 = class_752.method_4253();
      int var4 = method_9474(var3, this.field_8939.length);
      String[] var2 = var10000;
      class_1708 var5 = this.field_8939[var4];
      class_1708 var6 = var5;

      class_1708 var8;
      while(true) {
         if(var6 != null) {
            class_1708 var7 = var6.field_8953;
            var8 = var6;
            if(var2 == null) {
               break;
            }

            if(var2 != null) {
               if(var6.field_8951 == var1) {
                  ++this.field_8943;
                  --this.field_8940;
                  var8 = var5;
                  class_1708 var10001 = var6;
                  if(var2 != null) {
                     if(var5 == var6) {
                        this.field_8939[var4] = var7;
                        if(var2 != null) {
                           return var6;
                        }
                     }

                     var8 = var5;
                     var10001 = var7;
                  }

                  var8.field_8953 = var10001;
                  return var6;
               }

               var5 = var6;
               var8 = var7;
            }

            var6 = var8;
            if(var2 != null) {
               continue;
            }
         }

         var8 = var6;
         break;
      }

      return var8;
   }

   // $FF: renamed from: a () void
   public void method_9483() {
      String[] var10000 = class_752.method_4253();
      ++this.field_8943;
      String[] var1 = var10000;
      class_1708[] var2 = this.field_8939;
      int var3 = 0;

      while(true) {
         if(var3 < var2.length) {
            var2[var3] = null;
            ++var3;
            if(var1 == null) {
               break;
            }

            if(var1 != null) {
               continue;
            }
         }

         this.field_8940 = 0;
         break;
      }

   }

   // $FF: renamed from: b (int, int, java.lang.Object, int) void
   private void method_9484(int var1, int var2, Object var3, int var4) {
      String[] var10000 = class_752.method_4253();
      class_1708 var6 = this.field_8939[var4];
      String[] var5 = var10000;
      class_1708[] var7 = this.field_8939;
      class_1708 var10002 = new class_1708;
      var10002.method_9488(var1, var2, var3, var6);
      var7[var4] = var10002;
      class_1706 var8 = this;
      int var10001 = this.field_8940;
      if(var5 != null) {
         if(this.field_8940++ < this.field_8941) {
            return;
         }

         var8 = this;
         var10001 = 2 * this.field_8939.length;
      }

      var8.method_9479(var10001);
   }

   // $FF: renamed from: h (int) int
   static int method_9485(int var0) {
      return method_9473(var0);
   }

   // $FF: renamed from: <clinit> () void
   static void method_9486() {
      boolean var10000 = true;
      char[] var10003 = "Ô¦6YC¦äÀ6".toCharArray();
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
            field_8945 = (new String((char[])var4)).intern();
            String var2 = field_8945;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 52;
            break;
         case 1:
            var10009 = 115;
            break;
         case 2:
            var10009 = 90;
            break;
         case 3:
            var10009 = 165;
            break;
         case 4:
            var10009 = 202;
            break;
         case 5:
            var10009 = 139;
            break;
         default:
            var10009 = 208;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
