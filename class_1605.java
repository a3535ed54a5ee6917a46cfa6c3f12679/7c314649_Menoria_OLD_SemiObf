import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

// $FF: renamed from: tR
public class class_1605 {

   // $FF: renamed from: b kj
   private final class_1346 field_8388;
   // $FF: renamed from: c java.lang.String
   private final String field_8389;
   // $FF: renamed from: d java.util.List
   private final List field_8390;
   // $FF: renamed from: e java.lang.StackTraceElement[]
   private StackTraceElement[] field_8391;
   // $FF: renamed from: f java.lang.String
   private static final String field_8392;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_8393;


   // $FF: renamed from: <init> (kj, java.lang.String) void
   public void method_8774(class_1346 var1, String var2) {
      super();
      this.field_8390 = new ArrayList();
      this.field_8391 = new StackTraceElement[0];
      this.field_8388 = var1;
      this.field_8389 = var2;
   }

   // $FF: renamed from: b (double, double, double) java.lang.String
   public static String method_8775(double var0, double var2, double var4) {
      String[] var10000 = field_8393;
      return String.format("%.2f,%.2f,%.2f - %s", new Object[]{Double.valueOf(var0), Double.valueOf(var2), Double.valueOf(var4), method_8776(class_1715.method_9561(var0), class_1715.method_9561(var2), class_1715.method_9561(var4))});
   }

   // $FF: renamed from: b (int, int, int) java.lang.String
   public static String method_8776(int var0, int var1, int var2) {
      StringBuilder var3 = new StringBuilder();

      String[] var14;
      try {
         var14 = field_8393;
         var3.append(String.format("World: (%d,%d,%d)", new Object[]{Integer.valueOf(var0), Integer.valueOf(var1), Integer.valueOf(var2)}));
      } catch (Throwable var17) {
         var14 = field_8393;
         var3.append("(Error finding world loc)");
      }

      var14 = field_8393;
      var3.append(", ");

      int var4;
      int var5;
      int var6;
      int var7;
      int var8;
      int var9;
      int var10;
      int var11;
      int var12;
      try {
         var4 = var0 >> 4;
         var5 = var2 >> 4;
         var6 = var0 & 15;
         var7 = var1 >> 4;
         var8 = var2 & 15;
         var9 = var4 << 4;
         var10 = var5 << 4;
         var11 = (var4 + 1 << 4) - 1;
         var12 = (var5 + 1 << 4) - 1;
         var3.append(String.format("Chunk: (at %d,%d,%d in %d,%d; contains blocks %d,0,%d to %d,255,%d)", new Object[]{Integer.valueOf(var6), Integer.valueOf(var7), Integer.valueOf(var8), Integer.valueOf(var4), Integer.valueOf(var5), Integer.valueOf(var9), Integer.valueOf(var10), Integer.valueOf(var11), Integer.valueOf(var12)}));
      } catch (Throwable var16) {
         var14 = field_8393;
         var3.append("(Error finding chunk loc)");
      }

      var14 = field_8393;
      var3.append(", ");

      try {
         var4 = var0 >> 9;
         var5 = var2 >> 9;
         var6 = var4 << 5;
         var7 = var5 << 5;
         var8 = (var4 + 1 << 5) - 1;
         var9 = (var5 + 1 << 5) - 1;
         var10 = var4 << 9;
         var11 = var5 << 9;
         var12 = (var4 + 1 << 9) - 1;
         int var13 = (var5 + 1 << 9) - 1;
         var3.append(String.format("Region: (%d,%d; contains chunks %d,%d to %d,%d, blocks %d,0,%d to %d,255,%d)", new Object[]{Integer.valueOf(var4), Integer.valueOf(var5), Integer.valueOf(var6), Integer.valueOf(var7), Integer.valueOf(var8), Integer.valueOf(var9), Integer.valueOf(var10), Integer.valueOf(var11), Integer.valueOf(var12), Integer.valueOf(var13)}));
      } catch (Throwable var15) {
         String[] var10001 = field_8393;
         var3.append("(Error finding world loc)");
      }

      return var3.toString();
   }

   // $FF: renamed from: b (java.lang.String, java.util.concurrent.Callable) void
   public void method_8777(String var1, Callable var2) {
      try {
         this.method_8778(var1, var2.call());
      } catch (Throwable var4) {
         this.method_8779(var1, var4);
      }

   }

   // $FF: renamed from: b (java.lang.String, java.lang.Object) void
   public void method_8778(String var1, Object var2) {
      List var10000 = this.field_8390;
      class_1624 var10001 = new class_1624;
      var10001.method_8863(var1, var2);
      var10000.add(var10001);
   }

   // $FF: renamed from: b (java.lang.String, java.lang.Throwable) void
   public void method_8779(String var1, Throwable var2) {
      this.method_8778(var1, var2);
   }

   // $FF: renamed from: b (int) int
   public int method_8780(int var1) {
      String[] var10000 = class_752.method_4253();
      StackTraceElement[] var3 = Thread.currentThread().getStackTrace();
      String[] var2 = var10000;
      int var4 = var3.length;
      if(var2 != null) {
         if(var4 <= 0) {
            return 0;
         }

         this.field_8391 = new StackTraceElement[var3.length - 3 - var1];
         System.arraycopy(var3, 3 + var1, this.field_8391, 0, this.field_8391.length);
         var4 = this.field_8391.length;
      }

      return var4;
   }

   // $FF: renamed from: b (java.lang.StackTraceElement, java.lang.StackTraceElement) boolean
   public boolean method_8781(StackTraceElement var1, StackTraceElement var2) {
      String[] var3 = class_752.method_4253();
      int var10000 = this.field_8391.length;
      if(var3 != null) {
         if(var10000 != 0) {
            label80: {
               StackTraceElement var5 = var1;
               if(var3 != null) {
                  if(var1 == null) {
                     break label80;
                  }

                  var5 = this.field_8391[0];
               }

               StackTraceElement var4 = var5;
               boolean var6 = var4.isNativeMethod();
               if(var3 != null) {
                  if(var6 == var1.isNativeMethod()) {
                     var6 = var4.getClassName().equals(var1.getClassName());
                     if(var3 == null) {
                        return var6;
                     }

                     if(var6) {
                        var6 = var4.getFileName().equals(var1.getFileName());
                        if(var3 == null) {
                           return var6;
                        }

                        if(var6) {
                           var6 = var4.getMethodName().equals(var1.getMethodName());
                           if(var3 == null) {
                              return var6;
                           }

                           if(var6) {
                              var10000 = var2 != null?1:0;
                              int var10001 = this.field_8391.length;
                              if(var3 != null) {
                                 var10001 = var10001 > 1?1:0;
                              }

                              if(var10000 != var10001) {
                                 return false;
                              }

                              label82: {
                                 var5 = var2;
                                 if(var3 != null) {
                                    if(var2 == null) {
                                       break label82;
                                    }

                                    var5 = this.field_8391[1];
                                 }

                                 var6 = var5.equals(var2);
                                 if(var3 == null) {
                                    return var6;
                                 }

                                 if(!var6) {
                                    return false;
                                 }
                              }

                              this.field_8391[0] = var1;
                              var6 = true;
                              return var6;
                           }
                        }
                     }
                  }

                  var6 = false;
               }

               return var6;
            }
         }

         var10000 = 0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: c (int) void
   public void method_8782(int var1) {
      StackTraceElement[] var2 = new StackTraceElement[this.field_8391.length - var1];
      System.arraycopy(this.field_8391, 0, var2, 0, var2.length);
      this.field_8391 = var2;
   }

   // $FF: renamed from: b (java.lang.StringBuilder) void
   public void method_8783(StringBuilder var1) {
      String[] var10000 = class_752.method_4253();
      String[] var8 = field_8393;
      var1.append("-- ").append(this.field_8389).append(" --\n");
      String[] var2 = var10000;
      var1.append("Details:");
      Iterator var3 = this.field_8390.iterator();

      while(true) {
         if(var3.hasNext()) {
            class_1624 var4 = (class_1624)var3.next();
            var8 = field_8393;
            var1.append("\n\t");
            var1.append(var4.method_8864());
            var1.append(": ");
            var1.append(var4.method_8865());
            if(var2 == null) {
               break;
            }

            if(var2 != null) {
               continue;
            }
         }

         StackTraceElement[] var10 = this.field_8391;
         if(var2 != null) {
            if(this.field_8391 == null) {
               break;
            }

            var10 = this.field_8391;
         }

         if(var2 != null) {
            if(var10.length <= 0) {
               break;
            }

            var8 = field_8393;
            var1.append("\nStacktrace:");
            var10 = this.field_8391;
         }

         StackTraceElement[] var9 = var10;
         int var5 = var9.length;
         int var6 = 0;

         do {
            if(var6 >= var5) {
               return;
            }

            StackTraceElement var7 = var9[var6];
            String[] var10001 = field_8393;
            var1.append("\n\tat ");
            var1.append(var7.toString());
            ++var6;
         } while(var2 != null);

         return;
      }

   }

   // $FF: renamed from: b () java.lang.StackTraceElement[]
   public StackTraceElement[] method_8784() {
      return this.field_8391;
   }

   // $FF: renamed from: b (tR, int, int, int, aji, int) void
   public static void method_8785(class_1605 var0, int var1, int var2, int var3, aji var4, int var5) {
      int var6 = aji.method_2415(var4);
      String[] var7 = field_8393;
      class_1586 var10002 = new class_1586;
      var10002.method_8703(var6, var4);
      var0.method_8777("Block type", var10002);
      class_1617 var8 = new class_1617;
      var8.method_8830(var5);
      var0.method_8777("Block data value", var8);
      class_1672 var9 = new class_1672;
      var9.method_9229(var1, var2, var3);
      var0.method_8777("Block location", var9);
   }

   // $FF: renamed from: <clinit> () void
   static void method_8786() {
      // $FF: Couldn't be decompiled
   }
}
