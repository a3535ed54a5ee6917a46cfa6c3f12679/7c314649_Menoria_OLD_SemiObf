import java.util.List;
import java.util.Random;

// $FF: renamed from: h9
public class class_1146 extends class_1094 {

   // $FF: renamed from: d int
   private int field_5896;
   // $FF: renamed from: e boolean
   private boolean field_5897;
   // $FF: renamed from: f java.lang.String
   private static final String field_5898;
   // $FF: renamed from: i java.lang.String[]
   private static final String[] field_5899;


   // $FF: renamed from: <init> () void
   public void method_6191() {
      super.method_6191();
   }

   // $FF: renamed from: b (ro) void
   protected void method_6194(class_1583 var1) {
      String[] var10001 = field_5899;
      var1.initGui4("tf", this.field_5897);
      var1.method_8667("D", this.field_5896);
   }

   // $FF: renamed from: c (ro) void
   protected void method_6196(class_1583 var1) {
      String[] var10002 = field_5899;
      this.field_5897 = var1.method_8690("tf");
      this.field_5896 = var1.method_8681("D");
   }

   // $FF: renamed from: <init> (int, java.util.Random, hS, int) void
   public void method_6332(int var1, Random var2, class_1206 var3, int var4) {
      super.method_6192(var1);
      this.field_5896 = var4;
      String[] var10000 = class_752.method_4253();
      this.field_5752 = var3;
      String[] var5 = var10000;
      int var10001 = var3.method_6489();
      if(var5 != null) {
         var10001 = var10001 > 3?1:0;
      }

      this.field_5897 = (boolean)var10001;
   }

   // $FF: renamed from: b (java.util.List, java.util.Random, int, int, int, int) hS
   public static class_1206 method_6333(List var0, Random var1, int var2, int var3, int var4, int var5) {
      String[] var10000 = class_752.method_4253();
      class_1206 var10001 = new class_1206;
      var10001.method_6481(var2, var3, var4, var2, var3 + 2, var4);
      class_1206 var7 = var10001;
      String[] var6 = var10000;
      int var8 = var1.nextInt(4);
      if(var6 != null) {
         if(var8 == 0) {
            var7.field_6248 += 4;
         }

         var8 = var5;
      }

      switch(var8) {
      case 0:
         var7.field_6244 = var2 - 1;
         var7.field_6247 = var2 + 3;
         var7.field_6249 = var4 + 4;
         if(var6 != null) {
            break;
         }
      case 1:
         var7.field_6244 = var2 - 4;
         var7.field_6246 = var4 - 1;
         var7.field_6249 = var4 + 3;
         if(var6 != null) {
            break;
         }
      case 2:
         var7.field_6244 = var2 - 1;
         var7.field_6247 = var2 + 3;
         var7.field_6246 = var4 - 4;
         if(var6 != null) {
            break;
         }
      case 3:
         var7.field_6247 = var2 + 4;
         var7.field_6246 = var4 - 1;
         var7.field_6249 = var4 + 3;
      }

      return class_1094.method_6201(var0, var7) != null?null:var7;
   }

   // $FF: renamed from: b (h7, java.util.List, java.util.Random) void
   public void method_6197(class_1094 var1, List var2, Random var3) {
      String[] var10000 = class_752.method_4253();
      int var5 = this.method_6200();
      String[] var4 = var10000;
      int var6 = this.field_5896;
      if(var4 != null) {
         switch(this.field_5896) {
         case 0:
            class_1207.method_6500(var1, var2, var3, this.field_5752.field_6244 + 1, this.field_5752.field_6245, this.field_5752.field_6249 + 1, 0, var5);
            class_1207.method_6500(var1, var2, var3, this.field_5752.field_6244 - 1, this.field_5752.field_6245, this.field_5752.field_6246 + 1, 1, var5);
            class_1207.method_6500(var1, var2, var3, this.field_5752.field_6247 + 1, this.field_5752.field_6245, this.field_5752.field_6246 + 1, 3, var5);
            if(var4 != null) {
               break;
            }
         case 1:
            class_1207.method_6500(var1, var2, var3, this.field_5752.field_6244 + 1, this.field_5752.field_6245, this.field_5752.field_6246 - 1, 2, var5);
            class_1207.method_6500(var1, var2, var3, this.field_5752.field_6244 + 1, this.field_5752.field_6245, this.field_5752.field_6249 + 1, 0, var5);
            class_1207.method_6500(var1, var2, var3, this.field_5752.field_6244 - 1, this.field_5752.field_6245, this.field_5752.field_6246 + 1, 1, var5);
            if(var4 != null) {
               break;
            }
         case 2:
            class_1207.method_6500(var1, var2, var3, this.field_5752.field_6244 + 1, this.field_5752.field_6245, this.field_5752.field_6246 - 1, 2, var5);
            class_1207.method_6500(var1, var2, var3, this.field_5752.field_6244 - 1, this.field_5752.field_6245, this.field_5752.field_6246 + 1, 1, var5);
            class_1207.method_6500(var1, var2, var3, this.field_5752.field_6247 + 1, this.field_5752.field_6245, this.field_5752.field_6246 + 1, 3, var5);
            if(var4 != null) {
               break;
            }
         case 3:
            class_1207.method_6500(var1, var2, var3, this.field_5752.field_6244 + 1, this.field_5752.field_6245, this.field_5752.field_6246 - 1, 2, var5);
            class_1207.method_6500(var1, var2, var3, this.field_5752.field_6244 + 1, this.field_5752.field_6245, this.field_5752.field_6249 + 1, 0, var5);
            class_1207.method_6500(var1, var2, var3, this.field_5752.field_6247 + 1, this.field_5752.field_6245, this.field_5752.field_6246 + 1, 3, var5);
         }

         var6 = this.field_5897;
      }

      if(var4 != null) {
         if(var6 == 0) {
            return;
         }

         var6 = var3.nextBoolean();
      }

      if(var4 != null) {
         if(var6 != 0) {
            class_1207.method_6500(var1, var2, var3, this.field_5752.field_6244 + 1, this.field_5752.field_6245 + 3 + 1, this.field_5752.field_6246 - 1, 2, var5);
         }

         var6 = var3.nextBoolean();
      }

      if(var4 != null) {
         if(var6 != 0) {
            class_1207.method_6500(var1, var2, var3, this.field_5752.field_6244 - 1, this.field_5752.field_6245 + 3 + 1, this.field_5752.field_6246 + 1, 1, var5);
         }

         var6 = var3.nextBoolean();
      }

      if(var4 != null) {
         if(var6 != 0) {
            class_1207.method_6500(var1, var2, var3, this.field_5752.field_6247 + 1, this.field_5752.field_6245 + 3 + 1, this.field_5752.field_6246 + 1, 3, var5);
         }

         var6 = var3.nextBoolean();
      }

      if(var6 != 0) {
         class_1207.method_6500(var1, var2, var3, this.field_5752.field_6244 + 1, this.field_5752.field_6245 + 3 + 1, this.field_5752.field_6249 + 1, 0, var5);
      }

   }

   // $FF: renamed from: b (ahb, java.util.Random, hS) boolean
   public boolean method_6198(ahb var1, Random var2, class_1206 var3) {
      String[] var4;
      class_1146 var7;
      label66: {
         label69: {
            var4 = class_752.method_4253();
            boolean var10000 = this.method_6203(var1, var3);
            if(var4 != null) {
               if(var10000) {
                  return false;
               }

               var7 = this;
               if(var4 == null) {
                  break label69;
               }

               var10000 = this.field_5897;
            }

            if(var10000) {
               this.method_6211(var1, var3, this.field_5752.field_6244 + 1, this.field_5752.field_6245, this.field_5752.field_6246, this.field_5752.field_6247 - 1, this.field_5752.field_6245 + 3 - 1, this.field_5752.field_6249, class_1192.field_6025, class_1192.field_6025, false);
               this.method_6211(var1, var3, this.field_5752.field_6244, this.field_5752.field_6245, this.field_5752.field_6246 + 1, this.field_5752.field_6247, this.field_5752.field_6245 + 3 - 1, this.field_5752.field_6249 - 1, class_1192.field_6025, class_1192.field_6025, false);
               this.method_6211(var1, var3, this.field_5752.field_6244 + 1, this.field_5752.field_6248 - 2, this.field_5752.field_6246, this.field_5752.field_6247 - 1, this.field_5752.field_6248, this.field_5752.field_6249, class_1192.field_6025, class_1192.field_6025, false);
               this.method_6211(var1, var3, this.field_5752.field_6244, this.field_5752.field_6248 - 2, this.field_5752.field_6246 + 1, this.field_5752.field_6247, this.field_5752.field_6248, this.field_5752.field_6249 - 1, class_1192.field_6025, class_1192.field_6025, false);
               this.method_6211(var1, var3, this.field_5752.field_6244 + 1, this.field_5752.field_6245 + 3, this.field_5752.field_6246 + 1, this.field_5752.field_6247 - 1, this.field_5752.field_6245 + 3, this.field_5752.field_6249 - 1, class_1192.field_6025, class_1192.field_6025, false);
               if(var4 != null) {
                  break label66;
               }
            }

            this.method_6211(var1, var3, this.field_5752.field_6244 + 1, this.field_5752.field_6245, this.field_5752.field_6246, this.field_5752.field_6247 - 1, this.field_5752.field_6248, this.field_5752.field_6249, class_1192.field_6025, class_1192.field_6025, false);
            var7 = this;
         }

         var7.method_6211(var1, var3, this.field_5752.field_6244, this.field_5752.field_6245, this.field_5752.field_6246 + 1, this.field_5752.field_6247, this.field_5752.field_6248, this.field_5752.field_6249 - 1, class_1192.field_6025, class_1192.field_6025, false);
      }

      this.method_6211(var1, var3, this.field_5752.field_6244 + 1, this.field_5752.field_6245, this.field_5752.field_6246 + 1, this.field_5752.field_6244 + 1, this.field_5752.field_6248, this.field_5752.field_6246 + 1, class_1192.field_6030, class_1192.field_6025, false);
      this.method_6211(var1, var3, this.field_5752.field_6244 + 1, this.field_5752.field_6245, this.field_5752.field_6249 - 1, this.field_5752.field_6244 + 1, this.field_5752.field_6248, this.field_5752.field_6249 - 1, class_1192.field_6030, class_1192.field_6025, false);
      this.method_6211(var1, var3, this.field_5752.field_6247 - 1, this.field_5752.field_6245, this.field_5752.field_6246 + 1, this.field_5752.field_6247 - 1, this.field_5752.field_6248, this.field_5752.field_6246 + 1, class_1192.field_6030, class_1192.field_6025, false);
      this.method_6211(var1, var3, this.field_5752.field_6247 - 1, this.field_5752.field_6245, this.field_5752.field_6249 - 1, this.field_5752.field_6247 - 1, this.field_5752.field_6248, this.field_5752.field_6249 - 1, class_1192.field_6030, class_1192.field_6025, false);
      int var5 = this.field_5752.field_6244;

      while(true) {
         int var8;
         if(var5 <= this.field_5752.field_6247) {
            var7 = this;

            label48:
            while(true) {
               var8 = var7.field_5752.field_6246;
               if(var4 == null) {
                  return (boolean)var8;
               }

               int var6 = var7.field_5752.field_6246;

               while(true) {
                  if(var6 > this.field_5752.field_6249) {
                     break label48;
                  }

                  var7 = this;
                  if(var4 == null) {
                     break;
                  }

                  label43: {
                     ahb var10001 = var1;
                     if(var4 != null) {
                        if(this.method_6209(var1, var5, this.field_5752.field_6245 - 1, var6, var3).method_2424() != awt.field_4170) {
                           break label43;
                        }

                        var7 = this;
                        var10001 = var1;
                     }

                     var7.method_6208(var10001, class_1192.field_6030, 0, var5, this.field_5752.field_6245 - 1, var6, var3);
                  }

                  ++var6;
                  if(var4 == null) {
                     break label48;
                  }
               }
            }

            ++var5;
            if(var4 != null) {
               continue;
            }
         }

         var8 = 1;
         return (boolean)var8;
      }
   }

   // $FF: renamed from: <clinit> () void
   static void method_6222() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "|ÐKú6ÚÊ÷è8]Ü";
      int var4 = "|ÐKú6ÚÊ÷è8]Ü".length();
      char var1 = 2;
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
                  field_5899 = var5;
                  String[] var10 = field_5899;
                  field_5898 = "CL_00000446";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 53;
               break;
            case 1:
               var10009 = 139;
               break;
            case 2:
               var10009 = 84;
               break;
            case 3:
               var10009 = 215;
               break;
            case 4:
               var10009 = 199;
               break;
            case 5:
               var10009 = 250;
               break;
            default:
               var10009 = 229;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}
