import java.util.List;
import java.util.Random;

// $FF: renamed from: iw
abstract class class_1131 extends class_1094 {

   // $FF: renamed from: e M
   protected class_98 field_5851;
   // $FF: renamed from: f java.lang.String
   private static final String field_5852;
   // $FF: renamed from: i java.lang.String[]
   private static final String[] field_5853;


   // $FF: renamed from: <init> () void
   public void method_6191() {
      super.method_6191();
      this.field_5851 = class_98.field_71;
   }

   // $FF: renamed from: <init> (int) void
   protected void method_6192(int var1) {
      super.method_6192(var1);
      this.field_5851 = class_98.field_71;
   }

   // $FF: renamed from: b (ro) void
   protected void method_6194(class_1583 var1) {
      String[] var10001 = field_5853;
      var1.initGui1("EntryDoor", this.field_5851.name());
   }

   // $FF: renamed from: c (ro) void
   protected void method_6196(class_1583 var1) {
      String[] var10002 = field_5853;
      this.field_5851 = class_98.valueOf(var1.method_8685("EntryDoor"));
   }

   // $FF: renamed from: b (ahb, java.util.Random, hS, M, int, int, int) void
   protected void method_6302(ahb var1, Random var2, class_1206 var3, class_98 var4, int var5, int var6, int var7) {
      String[] var8 = class_752.method_4253();
      if(var8 != null) {
         switch(class_1253.field_6500[var4.ordinal()]) {
         case 1:
         default:
            this.method_6211(var1, var3, var5, var6, var7, var5 + 3 - 1, var6 + 3 - 1, var7, class_1192.field_6025, class_1192.field_6025, false);
            if(var8 != null) {
               return;
            }
         case 2:
            this.method_6208(var1, class_1192.field_6123, 0, var5, var6, var7, var3);
            this.method_6208(var1, class_1192.field_6123, 0, var5, var6 + 1, var7, var3);
            this.method_6208(var1, class_1192.field_6123, 0, var5, var6 + 2, var7, var3);
            this.method_6208(var1, class_1192.field_6123, 0, var5 + 1, var6 + 2, var7, var3);
            this.method_6208(var1, class_1192.field_6123, 0, var5 + 2, var6 + 2, var7, var3);
            this.method_6208(var1, class_1192.field_6123, 0, var5 + 2, var6 + 1, var7, var3);
            this.method_6208(var1, class_1192.field_6123, 0, var5 + 2, var6, var7, var3);
            this.method_6208(var1, class_1192.field_6090, 0, var5 + 1, var6, var7, var3);
            this.method_6208(var1, class_1192.field_6090, 8, var5 + 1, var6 + 1, var7, var3);
            if(var8 != null) {
               return;
            }
         case 3:
            this.method_6208(var1, class_1192.field_6025, 0, var5 + 1, var6, var7, var3);
            this.method_6208(var1, class_1192.field_6025, 0, var5 + 1, var6 + 1, var7, var3);
            this.method_6208(var1, class_1192.field_6126, 0, var5, var6, var7, var3);
            this.method_6208(var1, class_1192.field_6126, 0, var5, var6 + 1, var7, var3);
            this.method_6208(var1, class_1192.field_6126, 0, var5, var6 + 2, var7, var3);
            this.method_6208(var1, class_1192.field_6126, 0, var5 + 1, var6 + 2, var7, var3);
            this.method_6208(var1, class_1192.field_6126, 0, var5 + 2, var6 + 2, var7, var3);
            this.method_6208(var1, class_1192.field_6126, 0, var5 + 2, var6 + 1, var7, var3);
            this.method_6208(var1, class_1192.field_6126, 0, var5 + 2, var6, var7, var3);
            if(var8 != null) {
               return;
            }
         case 4:
            this.method_6208(var1, class_1192.field_6123, 0, var5, var6, var7, var3);
            this.method_6208(var1, class_1192.field_6123, 0, var5, var6 + 1, var7, var3);
            this.method_6208(var1, class_1192.field_6123, 0, var5, var6 + 2, var7, var3);
            this.method_6208(var1, class_1192.field_6123, 0, var5 + 1, var6 + 2, var7, var3);
            this.method_6208(var1, class_1192.field_6123, 0, var5 + 2, var6 + 2, var7, var3);
            this.method_6208(var1, class_1192.field_6123, 0, var5 + 2, var6 + 1, var7, var3);
            this.method_6208(var1, class_1192.field_6123, 0, var5 + 2, var6, var7, var3);
            this.method_6208(var1, class_1192.field_6097, 0, var5 + 1, var6, var7, var3);
            this.method_6208(var1, class_1192.field_6097, 8, var5 + 1, var6 + 1, var7, var3);
            this.method_6208(var1, class_1192.field_6103, this.method_6207(class_1192.field_6103, 4), var5 + 2, var6 + 1, var7 + 1, var3);
         }
      }

      this.method_6208(var1, class_1192.field_6103, this.method_6207(class_1192.field_6103, 3), var5 + 2, var6 + 1, var7 - 1, var3);
   }

   // $FF: renamed from: b (java.util.Random) M
   protected class_98 method_6303(Random var1) {
      int var2 = var1.nextInt(5);
      switch(var2) {
      case 0:
      case 1:
      default:
         return class_98.field_71;
      case 2:
         return class_98.field_72;
      case 3:
         return class_98.field_73;
      case 4:
         return class_98.field_74;
      }
   }

   // $FF: renamed from: b (iH, java.util.List, java.util.Random, int, int) h7
   protected class_1094 method_6304(class_1138 var1, List var2, Random var3, int var4, int var5) {
      String[] var6 = class_752.method_4253();
      Object var10000 = this;
      if(var6 != null) {
         switch(this.field_5753) {
         case 0:
            var10000 = class_1252.method_6600(var1, var2, var3, this.field_5752.field_6244 + var4, this.field_5752.field_6245 + var5, this.field_5752.field_6249 + 1, this.field_5753, this.method_6200());
            break;
         case 1:
            return class_1252.method_6600(var1, var2, var3, this.field_5752.field_6244 - 1, this.field_5752.field_6245 + var5, this.field_5752.field_6246 + var4, this.field_5753, this.method_6200());
         case 2:
            return class_1252.method_6600(var1, var2, var3, this.field_5752.field_6244 + var4, this.field_5752.field_6245 + var5, this.field_5752.field_6246 - 1, this.field_5753, this.method_6200());
         case 3:
            return class_1252.method_6600(var1, var2, var3, this.field_5752.field_6247 + 1, this.field_5752.field_6245 + var5, this.field_5752.field_6246 + var4, this.field_5753, this.method_6200());
         default:
            return null;
         }
      }

      return (class_1094)var10000;
   }

   // $FF: renamed from: c (iH, java.util.List, java.util.Random, int, int) h7
   protected class_1094 method_6305(class_1138 var1, List var2, Random var3, int var4, int var5) {
      String[] var6 = class_752.method_4253();
      Object var10000 = this;
      if(var6 != null) {
         switch(this.field_5753) {
         case 0:
            var10000 = class_1252.method_6600(var1, var2, var3, this.field_5752.field_6244 - 1, this.field_5752.field_6245 + var4, this.field_5752.field_6246 + var5, 1, this.method_6200());
            break;
         case 1:
            return class_1252.method_6600(var1, var2, var3, this.field_5752.field_6244 + var5, this.field_5752.field_6245 + var4, this.field_5752.field_6246 - 1, 2, this.method_6200());
         case 2:
            return class_1252.method_6600(var1, var2, var3, this.field_5752.field_6244 - 1, this.field_5752.field_6245 + var4, this.field_5752.field_6246 + var5, 1, this.method_6200());
         case 3:
            return class_1252.method_6600(var1, var2, var3, this.field_5752.field_6244 + var5, this.field_5752.field_6245 + var4, this.field_5752.field_6246 - 1, 2, this.method_6200());
         default:
            return null;
         }
      }

      return (class_1094)var10000;
   }

   // $FF: renamed from: d (iH, java.util.List, java.util.Random, int, int) h7
   protected class_1094 method_6306(class_1138 var1, List var2, Random var3, int var4, int var5) {
      String[] var6 = class_752.method_4253();
      Object var10000 = this;
      if(var6 != null) {
         switch(this.field_5753) {
         case 0:
            var10000 = class_1252.method_6600(var1, var2, var3, this.field_5752.field_6247 + 1, this.field_5752.field_6245 + var4, this.field_5752.field_6246 + var5, 3, this.method_6200());
            break;
         case 1:
            return class_1252.method_6600(var1, var2, var3, this.field_5752.field_6244 + var5, this.field_5752.field_6245 + var4, this.field_5752.field_6249 + 1, 0, this.method_6200());
         case 2:
            return class_1252.method_6600(var1, var2, var3, this.field_5752.field_6247 + 1, this.field_5752.field_6245 + var4, this.field_5752.field_6246 + var5, 3, this.method_6200());
         case 3:
            return class_1252.method_6600(var1, var2, var3, this.field_5752.field_6244 + var5, this.field_5752.field_6245 + var4, this.field_5752.field_6249 + 1, 0, this.method_6200());
         default:
            return null;
         }
      }

      return (class_1094)var10000;
   }

   // $FF: renamed from: b (hS) boolean
   protected static boolean method_6307(class_1206 var0) {
      int var2;
      label24: {
         String[] var1 = class_752.method_4253();
         class_1206 var10000 = var0;
         if(var1 != null) {
            if(var0 == null) {
               break label24;
            }

            var10000 = var0;
         }

         var2 = var10000.field_6245;
         if(var1 == null) {
            return (boolean)var2;
         }

         if(var2 > 10) {
            var2 = 1;
            return (boolean)var2;
         }
      }

      var2 = 0;
      return (boolean)var2;
   }

   // $FF: renamed from: <clinit> () void
   static void method_6222() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "Ô¥Ëh75¹Èö!Cjæá";
      int var4 = "Ô¥Ëh75¹Èö!Cjæá".length();
      char var1 = 9;
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
                  field_5853 = var5;
                  String[] var10 = field_5853;
                  field_5852 = "CL_00000503";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 188;
               break;
            case 1:
               var10009 = 208;
               break;
            case 2:
               var10009 = 187;
               break;
            case 3:
               var10009 = 211;
               break;
            case 4:
               var10009 = 123;
               break;
            case 5:
               var10009 = 25;
               break;
            default:
               var10009 = 48;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}
