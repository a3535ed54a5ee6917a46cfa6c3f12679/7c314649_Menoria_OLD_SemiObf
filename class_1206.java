
// $FF: renamed from: hS
public class class_1206 {

   // $FF: renamed from: b int
   public int field_6244;
   // $FF: renamed from: c int
   public int field_6245;
   // $FF: renamed from: d int
   public int field_6246;
   // $FF: renamed from: e int
   public int field_6247;
   // $FF: renamed from: f int
   public int field_6248;
   // $FF: renamed from: g int
   public int field_6249;
   // $FF: renamed from: h java.lang.String
   private static final String field_6250;
   // $FF: renamed from: i java.lang.String[]
   private static final String[] field_6251;


   // $FF: renamed from: <init> () void
   public void method_6476() {
      super();
   }

   // $FF: renamed from: <init> (int[]) void
   public void method_6477(int[] var1) {
      String[] var10000 = class_752.method_4253();
      super();
      String[] var2 = var10000;
      if(var2 != null) {
         if(var1.length != 6) {
            return;
         }

         this.field_6244 = var1[0];
         this.field_6245 = var1[1];
         this.field_6246 = var1[2];
         this.field_6247 = var1[3];
         this.field_6248 = var1[4];
      }

      this.field_6249 = var1[5];
   }

   // $FF: renamed from: b () hS
   public static class_1206 method_6478() {
      class_1206 var10000 = new class_1206;
      var10000.method_6481(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
      return var10000;
   }

   // $FF: renamed from: b (int, int, int, int, int, int, int, int, int, int) hS
   public static class_1206 method_6479(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      class_1206 var10000;
      switch(var9) {
      case 0:
         var10000 = new class_1206;
         var10000.method_6481(var0 + var3, var1 + var4, var2 + var5, var0 + var6 - 1 + var3, var1 + var7 - 1 + var4, var2 + var8 - 1 + var5);
         return var10000;
      case 1:
         var10000 = new class_1206;
         var10000.method_6481(var0 - var8 + 1 + var5, var1 + var4, var2 + var3, var0 + var5, var1 + var7 - 1 + var4, var2 + var6 - 1 + var3);
         return var10000;
      case 2:
         var10000 = new class_1206;
         var10000.method_6481(var0 + var3, var1 + var4, var2 - var8 + 1 + var5, var0 + var6 - 1 + var3, var1 + var7 - 1 + var4, var2 + var5);
         return var10000;
      case 3:
         var10000 = new class_1206;
         var10000.method_6481(var0 + var5, var1 + var4, var2 + var3, var0 + var8 - 1 + var5, var1 + var7 - 1 + var4, var2 + var6 - 1 + var3);
         return var10000;
      default:
         var10000 = new class_1206;
         var10000.method_6481(var0 + var3, var1 + var4, var2 + var5, var0 + var6 - 1 + var3, var1 + var7 - 1 + var4, var2 + var8 - 1 + var5);
         return var10000;
      }
   }

   // $FF: renamed from: <init> (hS) void
   public void method_6480(class_1206 var1) {
      super();
      this.field_6244 = var1.field_6244;
      this.field_6245 = var1.field_6245;
      this.field_6246 = var1.field_6246;
      this.field_6247 = var1.field_6247;
      this.field_6248 = var1.field_6248;
      this.field_6249 = var1.field_6249;
   }

   // $FF: renamed from: <init> (int, int, int, int, int, int) void
   public void method_6481(int var1, int var2, int var3, int var4, int var5, int var6) {
      super();
      this.field_6244 = var1;
      this.field_6245 = var2;
      this.field_6246 = var3;
      this.field_6247 = var4;
      this.field_6248 = var5;
      this.field_6249 = var6;
   }

   // $FF: renamed from: <init> (int, int, int, int) void
   public void method_6482(int var1, int var2, int var3, int var4) {
      super();
      this.field_6244 = var1;
      this.field_6246 = var2;
      this.field_6247 = var3;
      this.field_6249 = var4;
      this.field_6245 = 1;
      this.field_6248 = 512;
   }

   // $FF: renamed from: b (hS) boolean
   public boolean method_6483(class_1206 var1) {
      int var10000;
      label56: {
         String[] var2 = class_752.method_4253();
         var10000 = this.field_6247;
         int var10001 = var1.field_6244;
         if(var2 != null) {
            if(this.field_6247 < var1.field_6244) {
               break label56;
            }

            var10000 = this.field_6244;
            var10001 = var1.field_6247;
         }

         if(var2 != null) {
            if(var10000 > var10001) {
               break label56;
            }

            var10000 = this.field_6249;
            var10001 = var1.field_6246;
         }

         if(var2 != null) {
            if(var10000 < var10001) {
               break label56;
            }

            var10000 = this.field_6246;
            var10001 = var1.field_6249;
         }

         if(var2 != null) {
            if(var10000 > var10001) {
               break label56;
            }

            var10000 = this.field_6248;
            var10001 = var1.field_6245;
         }

         if(var2 != null) {
            if(var10000 < var10001) {
               break label56;
            }

            var10000 = this.field_6245;
            if(var2 == null) {
               return (boolean)var10000;
            }

            var10001 = var1.field_6248;
         }

         if(var10000 <= var10001) {
            var10000 = 1;
            return (boolean)var10000;
         }
      }

      var10000 = 0;
      return (boolean)var10000;
   }

   // $FF: renamed from: b (int, int, int, int) boolean
   public boolean method_6484(int var1, int var2, int var3, int var4) {
      int var10000;
      label40: {
         String[] var5 = class_752.method_4253();
         var10000 = this.field_6247;
         int var10001 = var1;
         if(var5 != null) {
            if(this.field_6247 < var1) {
               break label40;
            }

            var10000 = this.field_6244;
            var10001 = var3;
         }

         if(var5 != null) {
            if(var10000 > var10001) {
               break label40;
            }

            var10000 = this.field_6249;
            var10001 = var2;
         }

         if(var5 != null) {
            if(var10000 < var10001) {
               break label40;
            }

            var10000 = this.field_6246;
            if(var5 == null) {
               return (boolean)var10000;
            }

            var10001 = var4;
         }

         if(var10000 <= var10001) {
            var10000 = 1;
            return (boolean)var10000;
         }
      }

      var10000 = 0;
      return (boolean)var10000;
   }

   // $FF: renamed from: c (hS) void
   public void method_6485(class_1206 var1) {
      this.field_6244 = Math.min(this.field_6244, var1.field_6244);
      this.field_6245 = Math.min(this.field_6245, var1.field_6245);
      this.field_6246 = Math.min(this.field_6246, var1.field_6246);
      this.field_6247 = Math.max(this.field_6247, var1.field_6247);
      this.field_6248 = Math.max(this.field_6248, var1.field_6248);
      this.field_6249 = Math.max(this.field_6249, var1.field_6249);
   }

   // $FF: renamed from: b (int, int, int) void
   public void method_6486(int var1, int var2, int var3) {
      this.field_6244 += var1;
      this.field_6245 += var2;
      this.field_6246 += var3;
      this.field_6247 += var1;
      this.field_6248 += var2;
      this.field_6249 += var3;
   }

   // $FF: renamed from: c (int, int, int) boolean
   public boolean method_6487(int var1, int var2, int var3) {
      int var10000;
      label56: {
         String[] var4 = class_752.method_4253();
         var10000 = var1;
         int var10001 = this.field_6244;
         if(var4 != null) {
            if(var1 < this.field_6244) {
               break label56;
            }

            var10000 = var1;
            var10001 = this.field_6247;
         }

         if(var4 != null) {
            if(var10000 > var10001) {
               break label56;
            }

            var10000 = var3;
            var10001 = this.field_6246;
         }

         if(var4 != null) {
            if(var10000 < var10001) {
               break label56;
            }

            var10000 = var3;
            var10001 = this.field_6249;
         }

         if(var4 != null) {
            if(var10000 > var10001) {
               break label56;
            }

            var10000 = var2;
            var10001 = this.field_6245;
         }

         if(var4 != null) {
            if(var10000 < var10001) {
               break label56;
            }

            var10000 = var2;
            if(var4 == null) {
               return (boolean)var10000;
            }

            var10001 = this.field_6248;
         }

         if(var10000 <= var10001) {
            var10000 = 1;
            return (boolean)var10000;
         }
      }

      var10000 = 0;
      return (boolean)var10000;
   }

   // $FF: renamed from: c () int
   public int method_6488() {
      return this.field_6247 - this.field_6244 + 1;
   }

   // $FF: renamed from: d () int
   public int method_6489() {
      return this.field_6248 - this.field_6245 + 1;
   }

   // $FF: renamed from: e () int
   public int method_6490() {
      return this.field_6249 - this.field_6246 + 1;
   }

   // $FF: renamed from: f () int
   public int method_6491() {
      return this.field_6244 + (this.field_6247 - this.field_6244 + 1) / 2;
   }

   // $FF: renamed from: g () int
   public int method_6492() {
      return this.field_6245 + (this.field_6248 - this.field_6245 + 1) / 2;
   }

   // $FF: renamed from: h () int
   public int method_6493() {
      return this.field_6246 + (this.field_6249 - this.field_6246 + 1) / 2;
   }

   public String toString() {
      StringBuilder var10000 = (new StringBuilder()).append("(").append(this.field_6244);
      String[] var1 = field_6251;
      return var10000.append(", ").append(this.field_6245).append(", ").append(this.field_6246).append("; ").append(this.field_6247).append(", ").append(this.field_6248).append(", ").append(this.field_6249).append(")").toString();
   }

   // $FF: renamed from: i () rq
   public class_1581 method_6494() {
      class_1581 var10000 = new class_1581;
      var10000.method_8661(new int[]{this.field_6244, this.field_6245, this.field_6246, this.field_6247, this.field_6248, this.field_6249});
      return var10000;
   }

   // $FF: renamed from: <clinit> () void
   static void method_6495() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "Ãz#À¼¿°HÂ»¬";
      int var4 = "Ãz#À¼¿°HÂ»¬".length();
      char var1 = 11;
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
            char[] var11 = var8;
            var8 = var10003;
            if(var10003 <= var6) {
               var5[var3++] = (new String((char[])var9)).intern();
               if((var0 += var1) >= var4) {
                  field_6251 = var5;
                  String[] var10 = field_6251;
                  field_6250 = "CL_00000442";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 194;
               break;
            case 1:
               var10009 = 116;
               break;
            case 2:
               var10009 = 62;
               break;
            case 3:
               var10009 = 178;
               break;
            case 4:
               var10009 = 206;
               break;
            case 5:
               var10009 = 205;
               break;
            default:
               var10009 = 108;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}
