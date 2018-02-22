
// $FF: renamed from: vp
public class class_1711 {

   // $FF: renamed from: b vq[]
   private transient class_1713[] field_8969;
   // $FF: renamed from: c int
   private transient int field_8970;
   // $FF: renamed from: d int
   private int field_8971;
   // $FF: renamed from: e float
   private final float field_8972;
   // $FF: renamed from: f int
   private transient volatile int field_8973;
   // $FF: renamed from: g java.lang.String
   private static final String field_8974 = "CL_00001492";


   // $FF: renamed from: <init> () void
   public void method_9520() {
      super();
      this.field_8969 = new class_1713[1024];
      this.field_8971 = (int)(0.75F * (float)this.field_8969.length);
      this.field_8972 = 0.75F;
   }

   // $FF: renamed from: a (long) int
   private static int method_9521(long var0) {
      return (int)(var0 ^ var0 >>> 27);
   }

   // $FF: renamed from: b (int) int
   private static int method_9522(int var0) {
      var0 ^= var0 >>> 20 ^ var0 >>> 12;
      return var0 ^ var0 >>> 7 ^ var0 >>> 4;
   }

   // $FF: renamed from: b (int, int) int
   private static int method_9523(int var0, int var1) {
      return var0 & var1 - 1;
   }

   // $FF: renamed from: b () int
   public int method_9524() {
      return this.field_8970;
   }

   // $FF: renamed from: b (long) java.lang.Object
   public Object method_9525(long var1) {
      String[] var10000 = class_752.method_4253();
      int var4 = method_9521(var1);
      class_1713 var5 = this.field_8969[method_9523(var4, this.field_8969.length)];
      String[] var3 = var10000;

      while(var5 != null) {
         class_1713 var6 = var5;
         if(var3 != null) {
            if(var5.field_8980 == var1) {
               return var5.field_8981;
            }

            var6 = var5.field_8982;
         }

         var5 = var6;
         if(var3 == null) {
            break;
         }
      }

      return null;
   }

   // $FF: renamed from: c (long) boolean
   public boolean method_9526(long var1) {
      return this.method_9527(var1) != null;
   }

   // $FF: renamed from: d (long) vq
   final class_1713 method_9527(long var1) {
      String[] var10000 = class_752.method_4253();
      int var4 = method_9521(var1);
      String[] var3 = var10000;
      class_1713 var5 = this.field_8969[method_9523(var4, this.field_8969.length)];

      while(var5 != null) {
         class_1713 var6 = var5;
         if(var3 != null) {
            if(var5.field_8980 == var1) {
               return var5;
            }

            var6 = var5.field_8982;
         }

         var5 = var6;
         if(var3 == null) {
            break;
         }
      }

      return null;
   }

   // $FF: renamed from: b (long, java.lang.Object) void
   public void method_9528(long var1, Object var3) {
      String[] var10000 = class_752.method_4253();
      int var5 = method_9521(var1);
      int var6 = method_9523(var5, this.field_8969.length);
      String[] var4 = var10000;
      class_1713 var7 = this.field_8969[var6];

      while(true) {
         if(var7 != null) {
            if(var4 == null) {
               break;
            }

            class_1713 var8 = var7;
            if(var4 != null) {
               if(var7.field_8980 == var1) {
                  var7.field_8981 = var3;
                  return;
               }

               var8 = var7.field_8982;
            }

            var7 = var8;
            if(var4 != null) {
               continue;
            }
         }

         ++this.field_8973;
         this.method_9533(var5, var1, var3, var6);
         break;
      }

   }

   // $FF: renamed from: c (int) void
   private void method_9529(int var1) {
      class_1713[] var3 = this.field_8969;
      String[] var10000 = class_752.method_4253();
      int var4 = var3.length;
      String[] var2 = var10000;
      int var7 = var4;
      if(var2 != null) {
         if(var4 == 1073741824) {
            this.field_8971 = Integer.MAX_VALUE;
            if(var2 != null) {
               return;
            }
         }

         var7 = var1;
      }

      class_1713[] var5 = new class_1713[var7];
      this.method_9530(var5);
      this.field_8969 = var5;
      float var6 = (float)var1;
      this.getClass();
      this.field_8971 = (int)(var6 * 0.75F);
   }

   // $FF: renamed from: b (vq[]) void
   private void method_9530(class_1713[] var1) {
      class_1713[] var3 = this.field_8969;
      int var4 = var1.length;
      String[] var10000 = class_752.method_4253();
      int var5 = 0;
      String[] var2 = var10000;

      while(var5 < var3.length) {
         class_1713 var6 = var3[var5];
         if(var2 != null) {
            if(var6 != null) {
               var3[var5] = null;

               class_1713 var7;
               do {
                  var7 = var6.field_8982;
                  int var8 = method_9523(var6.field_8983, var4);
                  var6.field_8982 = var1[var8];
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

   // $FF: renamed from: e (long) java.lang.Object
   public Object method_9531(long var1) {
      String[] var10000 = class_752.method_4253();
      class_1713 var4 = this.method_9532(var1);
      String[] var3 = var10000;
      class_1713 var5 = var4;
      Object var6;
      if(var3 != null) {
         if(var4 == null) {
            var6 = null;
            return var6;
         }

         var5 = var4;
      }

      var6 = var5.field_8981;
      return var6;
   }

   // $FF: renamed from: f (long) vq
   final class_1713 method_9532(long var1) {
      String[] var10000 = class_752.method_4253();
      int var4 = method_9521(var1);
      int var5 = method_9523(var4, this.field_8969.length);
      String[] var3 = var10000;
      class_1713 var6 = this.field_8969[var5];
      class_1713 var7 = var6;

      class_1713 var9;
      while(true) {
         if(var7 != null) {
            class_1713 var8 = var7.field_8982;
            var9 = var7;
            if(var3 == null) {
               break;
            }

            if(var3 != null) {
               if(var7.field_8980 == var1) {
                  ++this.field_8973;
                  --this.field_8970;
                  var9 = var6;
                  class_1713 var10001 = var7;
                  if(var3 != null) {
                     if(var6 == var7) {
                        this.field_8969[var5] = var8;
                        if(var3 != null) {
                           return var7;
                        }
                     }

                     var9 = var6;
                     var10001 = var8;
                  }

                  var9.field_8982 = var10001;
                  return var7;
               }

               var6 = var7;
               var9 = var8;
            }

            var7 = var9;
            if(var3 != null) {
               continue;
            }
         }

         var9 = var7;
         break;
      }

      return var9;
   }

   // $FF: renamed from: b (int, long, java.lang.Object, int) void
   private void method_9533(int var1, long var2, Object var4, int var5) {
      String[] var10000 = class_752.method_4253();
      class_1713 var7 = this.field_8969[var5];
      String[] var6 = var10000;
      class_1713[] var8 = this.field_8969;
      class_1713 var10002 = new class_1713;
      var10002.method_9546(var1, var2, var4, var7);
      var8[var5] = var10002;
      class_1711 var9 = this;
      int var10001 = this.field_8970;
      if(var6 != null) {
         if(this.field_8970++ < this.field_8971) {
            return;
         }

         var9 = this;
         var10001 = 2 * this.field_8969.length;
      }

      var9.method_9529(var10001);
   }

   // $FF: renamed from: c () double
   public double method_9534() {
      String[] var10000 = class_752.method_4253();
      int var2 = 0;
      String[] var1 = var10000;
      int var3 = 0;

      while(var3 < this.field_8969.length) {
         if(this.field_8969[var3] != null) {
            ++var2;
         }

         ++var3;
         if(var1 == null) {
            break;
         }
      }

      return 1.0D * (double)var2 / (double)this.field_8970;
   }

   // $FF: renamed from: g (long) int
   static int method_9535(long var0) {
      return method_9521(var0);
   }

   // $FF: renamed from: <clinit> () void
   static void method_9536() {
      boolean var10000 = true;
      char[] var10003 = "°!¨³{ÇCÂYÎ±".toCharArray();
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
            field_8974 = (new String((char[])var4)).intern();
            String var2 = field_8974;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 15;
            break;
         case 1:
            var10009 = 145;
            break;
         case 2:
            var10009 = 11;
            break;
         case 3:
            var10009 = 127;
            break;
         case 4:
            var10009 = 183;
            break;
         case 5:
            var10009 = 11;
            break;
         default:
            var10009 = 143;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
