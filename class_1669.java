
// $FF: renamed from: uj
public class class_1669 extends class_1668 {

   // $FF: renamed from: a boolean
   private boolean field_8700;
   // $FF: renamed from: q boolean
   private boolean field_8701;
   // $FF: renamed from: r int
   private int field_8702;
   // $FF: renamed from: s int
   private int field_8703;
   // $FF: renamed from: t java.lang.String[]
   private static final String[] field_8704;


   // $FF: renamed from: <init> (ahb) void
   public void method_9198(ahb var1) {
      super.method_9198(var1);
   }

   // $FF: renamed from: c () void
   public void method_9203() {
      super.method_9203();
      String[] var10000 = class_752.method_4253();
      ++this.field_8703;
      String[] var1 = var10000;
      long var2 = this.field_8685.method_2184();
      long var4 = var2 / 24000L + 1L;
      class_1669 var7 = this;
      class_1684 var8;
      class_281 var10001;
      if(var1 != null) {
         label88: {
            if(!this.field_8700) {
               var7 = this;
               if(var1 == null) {
                  break label88;
               }

               if(this.field_8703 > 20) {
                  this.field_8700 = true;
                  var8 = this.field_8686.field_3654;
                  var10001 = new class_281;
                  var10001.method_1621(5, 0.0F);
                  var8.method_9291(var10001);
               }
            }

            var7 = this;
         }
      }

      long var14;
      int var9 = (var14 = var2 - 120500L) == 0L?0:(var14 < 0L?-1:1);
      if(var1 != null) {
         var9 = var9 > 0?1:0;
      }

      var7.field_8701 = (boolean)var9;
      int var10 = this.field_8701;
      if(var1 != null) {
         if(this.field_8701) {
            ++this.field_8702;
         }

         long var15;
         var10 = (var15 = var2 % 24000L - 500L) == 0L?0:(var15 < 0L?-1:1);
      }

      class_1081 var11;
      class_793 var12;
      if(var1 != null) {
         if(var10 == 0) {
            if(var4 > 6L) {
               return;
            }

            var12 = this.field_8686;
            var11 = new class_1081;
            StringBuilder var10003 = new StringBuilder();
            String[] var6 = field_8704;
            var11.method_6126(var10003.append("demo.day.").append(var4).toString(), new Object[0]);
            var12.method_66(var11);
            if(var1 != null) {
               return;
            }
         }

         long var16;
         var10 = (var16 = var4 - 1L) == 0L?0:(var16 < 0L?-1:1);
      }

      if(var1 != null) {
         if(var10 == 0) {
            long var17;
            var10 = (var17 = var2 - 100L) == 0L?0:(var17 < 0L?-1:1);
            if(var1 != null) {
               if(var10 == 0) {
                  var8 = this.field_8686.field_3654;
                  var10001 = new class_281;
                  var10001.method_1621(5, 101.0F);
                  var8.method_9291(var10001);
                  if(var1 != null) {
                     return;
                  }
               }

               long var18;
               var10 = (var18 = var2 - 175L) == 0L?0:(var18 < 0L?-1:1);
            }

            if(var1 != null) {
               if(var10 == 0) {
                  var8 = this.field_8686.field_3654;
                  var10001 = new class_281;
                  var10001.method_1621(5, 102.0F);
                  var8.method_9291(var10001);
                  if(var1 != null) {
                     return;
                  }
               }

               long var19;
               var10 = (var19 = var2 - 250L) == 0L?0:(var19 < 0L?-1:1);
            }

            if(var10 != 0) {
               return;
            }

            var8 = this.field_8686.field_3654;
            var10001 = new class_281;
            var10001.method_1621(5, 103.0F);
            var8.method_9291(var10001);
            if(var1 != null) {
               return;
            }
         }

         long var20;
         var10 = (var20 = var4 - 5L) == 0L?0:(var20 < 0L?-1:1);
      }

      if(var1 != null) {
         if(var10 != 0) {
            return;
         }

         long var21;
         var10 = (var21 = var2 % 24000L - 22000L) == 0L?0:(var21 < 0L?-1:1);
      }

      if(var10 == 0) {
         var12 = this.field_8686;
         var11 = new class_1081;
         String[] var13 = field_8704;
         var11.method_6126("demo.day.warning", new Object[0]);
         var12.method_66(var11);
      }

   }

   // $FF: renamed from: d () void
   private void method_9212() {
      String[] var1 = class_752.method_4253();
      class_1669 var10000 = this;
      if(var1 != null) {
         if(this.field_8702 <= 100) {
            return;
         }

         class_793 var2 = this.field_8686;
         class_1081 var10001 = new class_1081;
         String[] var10003 = field_8704;
         var10001.method_6126("demo.reminder", new Object[0]);
         var2.method_66(var10001);
         var10000 = this;
      }

      var10000.field_8702 = 0;
   }

   // $FF: renamed from: b (int, int, int, int) void
   public void method_9204(int var1, int var2, int var3, int var4) {
      String[] var5 = class_752.method_4253();
      class_1669 var10000 = this;
      if(var5 != null) {
         if(this.field_8701) {
            this.method_9212();
            return;
         }

         var10000 = this;
      }

      var10000.method_9204(var1, var2, var3, var4);
   }

   // $FF: renamed from: b (int, int, int) void
   public void method_9205(int var1, int var2, int var3) {
      String[] var4 = class_752.method_4253();
      class_1669 var10000 = this;
      if(var4 != null) {
         if(this.field_8701) {
            return;
         }

         var10000 = this;
      }

      var10000.method_9205(var1, var2, var3);
   }

   // $FF: renamed from: f (int, int, int) boolean
   public boolean method_9208(int var1, int var2, int var3) {
      String[] var4 = class_752.method_4253();
      boolean var10000 = this.field_8701;
      if(var4 != null) {
         if(this.field_8701) {
            return false;
         }

         var10000 = super.method_9208(var1, var2, var3);
      }

      return var10000;
   }

   // $FF: renamed from: b (yz, ahb, add) boolean
   public boolean method_9209(class_792 var1, ahb var2, add var3) {
      String[] var4 = class_752.method_4253();
      boolean var10000 = this.field_8701;
      if(var4 != null) {
         if(this.field_8701) {
            this.method_9212();
            return false;
         }

         var10000 = super.method_9209(var1, var2, var3);
      }

      return var10000;
   }

   // $FF: renamed from: b (yz, ahb, add, int, int, int, int, float, float, float) boolean
   public boolean method_9210(class_792 var1, ahb var2, add var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
      String[] var11 = class_752.method_4253();
      boolean var10000 = this.field_8701;
      if(var11 != null) {
         if(this.field_8701) {
            this.method_9212();
            return false;
         }

         var10000 = super.method_9210(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
      }

      return var10000;
   }

   // $FF: renamed from: <clinit> () void
   static void method_9213() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "èÔYñá×RÆñ\tèÔYçõDèÔYçõDÎWÑíâ\r";
      int var4 = "èÔYñá×RÆñ\tèÔYçõDèÔYçõDÎWÑíâ\r".length();
      char var1 = 13;
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
                  field_8704 = var5;
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 253;
               break;
            case 1:
               var10009 = 27;
               break;
            case 2:
               var10009 = 200;
               break;
            case 3:
               var10009 = 71;
               break;
            case 4:
               var10009 = 210;
               break;
            case 5:
               var10009 = 242;
               break;
            default:
               var10009 = 9;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var10 ^ var10009);
            ++var6;
         }
      }
   }
}
