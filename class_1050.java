
// $FF: renamed from: dy
public class class_1050 implements Comparable {

   // $FF: renamed from: a long
   private static long field_5554;
   // $FF: renamed from: b aji
   private final aji field_5555;
   // $FF: renamed from: c int
   public int field_5556;
   // $FF: renamed from: d int
   public int field_5557;
   // $FF: renamed from: e int
   public int field_5558;
   // $FF: renamed from: f long
   public long field_5559;
   // $FF: renamed from: g int
   public int field_5560;
   // $FF: renamed from: i long
   private long field_5561;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_5562;


   // $FF: renamed from: <init> (int, int, int, aji) void
   public void method_5952(int var1, int var2, int var3, aji var4) {
      super();
      this.field_5561 = (long)(field_5554++);
      this.field_5556 = var1;
      this.field_5557 = var2;
      this.field_5558 = var3;
      this.field_5555 = var4;
   }

   public boolean equals(Object var1) {
      String[] var2 = class_752.method_4253();
      boolean var10000 = var1 instanceof class_1050;
      if(var2 != null) {
         if(var10000) {
            int var4;
            label49: {
               class_1050 var3 = (class_1050)var1;
               var4 = this.field_5556;
               int var10001 = var3.field_5556;
               if(var2 != null) {
                  if(this.field_5556 != var3.field_5556) {
                     break label49;
                  }

                  var4 = this.field_5557;
                  var10001 = var3.field_5557;
               }

               label50: {
                  if(var2 != null) {
                     if(var4 != var10001) {
                        break label49;
                     }

                     var4 = this.field_5558;
                     if(var2 == null) {
                        break label50;
                     }

                     var10001 = var3.field_5558;
                  }

                  if(var4 != var10001) {
                     break label49;
                  }

                  var4 = aji.method_2529(this.field_5555, var3.field_5555);
               }

               if(var2 == null) {
                  return (boolean)var4;
               }

               if(var4 != 0) {
                  var4 = 1;
                  return (boolean)var4;
               }
            }

            var4 = 0;
            return (boolean)var4;
         }

         var10000 = false;
      }

      return var10000;
   }

   public int hashCode() {
      return (this.field_5556 * 1024 * 1024 + this.field_5558 * 1024 + this.field_5557) * 256;
   }

   // $FF: renamed from: b (long) dy
   public class_1050 method_5953(long var1) {
      this.field_5559 = var1;
      return this;
   }

   // $FF: renamed from: b (int) void
   public void method_5954(int var1) {
      this.field_5560 = var1;
   }

   // $FF: renamed from: b (dy) int
   public int method_5955(class_1050 var1) {
      String[] var2 = class_752.method_4253();
      long var3;
      int var10000 = (var3 = this.field_5559 - var1.field_5559) == 0L?0:(var3 < 0L?-1:1);
      if(var2 != null) {
         if(var10000 < 0) {
            return -1;
         }

         long var4;
         var10000 = (var4 = this.field_5559 - var1.field_5559) == 0L?0:(var4 < 0L?-1:1);
      }

      if(var2 != null) {
         if(var10000 > 0) {
            return 1;
         }

         var10000 = this.field_5560;
      }

      if(var2 != null) {
         if(var10000 != var1.field_5560) {
            return this.field_5560 - var1.field_5560;
         }

         long var5;
         var10000 = (var5 = this.field_5561 - var1.field_5561) == 0L?0:(var5 < 0L?-1:1);
      }

      if(var2 != null) {
         if(var10000 < 0) {
            return -1;
         }

         long var6;
         var10000 = (var6 = this.field_5561 - var1.field_5561) == 0L?0:(var6 < 0L?-1:1);
      }

      if(var2 != null) {
         if(var10000 > 0) {
            return 1;
         }

         var10000 = 0;
      }

      return var10000;
   }

   public String toString() {
      StringBuilder var10000 = (new StringBuilder()).append(aji.method_2415(this.field_5555));
      String[] var1 = field_5562;
      return var10000.append(": (").append(this.field_5556).append(", ").append(this.field_5557).append(", ").append(this.field_5558).append("), ").append(this.field_5559).append(", ").append(this.field_5560).append(", ").append(this.field_5561).toString();
   }

   // $FF: renamed from: b () aji
   public aji method_5956() {
      return this.field_5555;
   }

   // $FF: synthetic method
   public int compareTo(Object var1) {
      return this.method_5955((class_1050)var1);
   }

   // $FF: renamed from: <clinit> () void
   static void method_5957() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "]\t\tU";
      int var4 = "]\t\tU".length();
      char var1 = 3;
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
                  field_5562 = var5;
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 39;
               break;
            case 1:
               var10009 = 58;
               break;
            case 2:
               var10009 = 110;
               break;
            case 3:
               var10009 = 169;
               break;
            case 4:
               var10009 = 245;
               break;
            case 5:
               var10009 = 91;
               break;
            default:
               var10009 = 114;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var10 ^ var10009);
            ++var6;
         }
      }
   }
}
