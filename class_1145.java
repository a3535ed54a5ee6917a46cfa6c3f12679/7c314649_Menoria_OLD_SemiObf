import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

// $FF: renamed from: h_
public class class_1145 extends class_1094 {

   // $FF: renamed from: d java.util.List
   private List field_5893;
   // $FF: renamed from: e java.lang.String
   private static final String field_5894;
   // $FF: renamed from: i java.lang.String[]
   private static final String[] field_5895;


   // $FF: renamed from: <init> () void
   public void method_6191() {
      super.method_6191();
      this.field_5893 = new LinkedList();
   }

   // $FF: renamed from: <init> (int, java.util.Random, int, int) void
   public void method_6331(int var1, Random var2, int var3, int var4) {
      super.method_6192(var1);
      this.field_5893 = new LinkedList();
      class_1206 var10001 = new class_1206;
      var10001.method_6481(var3, 50, var4, var3 + 7 + var2.nextInt(6), 54 + var2.nextInt(6), var4 + 7 + var2.nextInt(6));
      this.field_5752 = var10001;
   }

   // $FF: renamed from: b (h7, java.util.List, java.util.Random) void
   public void method_6197(class_1094 var1, List var2, Random var3) {
      String[] var10000 = class_752.method_4253();
      int var5 = this.method_6200();
      String[] var4 = var10000;
      int var6 = this.field_5752.method_6489() - 3 - 1;
      int var10 = var6;
      if(var4 != null) {
         if(var6 <= 0) {
            var6 = 1;
         }

         var10 = 0;
      }

      int var7 = var10;

      class_1094 var8;
      class_1206 var9;
      class_1206 var11;
      List var12;
      int var10001;
      while(true) {
         if(var7 < this.field_5752.method_6488()) {
            var7 += var3.nextInt(this.field_5752.method_6488());
            var10 = var7 + 3;
            var10001 = this.field_5752.method_6488();
            if(var4 == null) {
               break;
            }

            if(var10 <= var10001 || var4 == null) {
               var8 = class_1207.method_6500(var1, var2, var3, this.field_5752.field_6244 + var7, this.field_5752.field_6245 + var3.nextInt(var6) + 1, this.field_5752.field_6246 - 1, 2, var5);
               if(var4 != null) {
                  if(var8 != null) {
                     var9 = var8.method_6199();
                     var12 = this.field_5893;
                     var11 = new class_1206;
                     var11.method_6481(var9.field_6244, var9.field_6245, this.field_5752.field_6246, var9.field_6247, var9.field_6248, this.field_5752.field_6246 + 1);
                     var12.add(var11);
                  }

                  var7 += 4;
               }

               if(var4 != null) {
                  continue;
               }
            }

            var7 = 0;
         } else {
            var7 = 0;
         }

         var10 = var7;
         var10001 = this.field_5752.method_6488();
         break;
      }

      while(true) {
         label119: {
            if(var10 < var10001) {
               var7 += var3.nextInt(this.field_5752.method_6488());
               var10 = var7 + 3;
               var10001 = this.field_5752.method_6488();
               if(var4 == null) {
                  break label119;
               }

               if(var10 <= var10001 || var4 == null) {
                  var8 = class_1207.method_6500(var1, var2, var3, this.field_5752.field_6244 + var7, this.field_5752.field_6245 + var3.nextInt(var6) + 1, this.field_5752.field_6249 + 1, 0, var5);
                  if(var4 != null) {
                     if(var8 != null) {
                        var9 = var8.method_6199();
                        var12 = this.field_5893;
                        var11 = new class_1206;
                        var11.method_6481(var9.field_6244, var9.field_6245, this.field_5752.field_6249 - 1, var9.field_6247, var9.field_6248, this.field_5752.field_6249);
                        var12.add(var11);
                     }

                     var7 += 4;
                  }

                  if(var4 != null) {
                     var10 = var7;
                     var10001 = this.field_5752.method_6488();
                     continue;
                  }
               }

               var7 = 0;
            } else {
               var7 = 0;
            }

            var10 = var7;
            var10001 = this.field_5752.method_6490();
         }

         while(true) {
            label99: {
               if(var10 < var10001) {
                  var7 += var3.nextInt(this.field_5752.method_6490());
                  var10 = var7 + 3;
                  var10001 = this.field_5752.method_6490();
                  if(var4 == null) {
                     break label99;
                  }

                  if(var10 <= var10001 || var4 == null) {
                     var8 = class_1207.method_6500(var1, var2, var3, this.field_5752.field_6244 - 1, this.field_5752.field_6245 + var3.nextInt(var6) + 1, this.field_5752.field_6246 + var7, 1, var5);
                     if(var4 != null) {
                        if(var8 != null) {
                           var9 = var8.method_6199();
                           var12 = this.field_5893;
                           var11 = new class_1206;
                           var11.method_6481(this.field_5752.field_6244, var9.field_6245, var9.field_6246, this.field_5752.field_6244 + 1, var9.field_6248, var9.field_6249);
                           var12.add(var11);
                        }

                        var7 += 4;
                     }

                     if(var4 != null) {
                        var10 = var7;
                        var10001 = this.field_5752.method_6490();
                        continue;
                     }
                  }

                  var7 = 0;
               } else {
                  var7 = 0;
               }

               var10 = var7;
            }

            for(var10001 = this.field_5752.method_6490(); var10 < var10001; var10001 = this.field_5752.method_6490()) {
               var7 += var3.nextInt(this.field_5752.method_6490());
               if(var7 + 3 > this.field_5752.method_6490() && var4 != null) {
                  return;
               }

               var8 = class_1207.method_6500(var1, var2, var3, this.field_5752.field_6247 + 1, this.field_5752.field_6245 + var3.nextInt(var6) + 1, this.field_5752.field_6246 + var7, 3, var5);
               if(var4 != null) {
                  if(var8 != null) {
                     var9 = var8.method_6199();
                     var12 = this.field_5893;
                     var11 = new class_1206;
                     var11.method_6481(this.field_5752.field_6247 - 1, var9.field_6245, var9.field_6246, this.field_5752.field_6247, var9.field_6248, var9.field_6249);
                     var12.add(var11);
                  }

                  var7 += 4;
               }

               if(var4 == null) {
                  return;
               }

               var10 = var7;
            }

            return;
         }
      }
   }

   // $FF: renamed from: b (ahb, java.util.Random, hS) boolean
   public boolean method_6198(ahb var1, Random var2, class_1206 var3) {
      String[] var4 = class_752.method_4253();
      class_1145 var10000 = this;
      ahb var10001 = var1;
      class_1206 var10002 = var3;
      if(var4 != null) {
         if(this.method_6203(var1, var3)) {
            return false;
         }

         this.method_6211(var1, var3, this.field_5752.field_6244, this.field_5752.field_6245, this.field_5752.field_6246, this.field_5752.field_6247, this.field_5752.field_6245, this.field_5752.field_6249, class_1192.field_6028, class_1192.field_6025, true);
         var10000 = this;
         var10001 = var1;
         var10002 = var3;
      }

      var10000.method_6211(var10001, var10002, this.field_5752.field_6244, this.field_5752.field_6245 + 1, this.field_5752.field_6246, this.field_5752.field_6247, Math.min(this.field_5752.field_6245 + 3, this.field_5752.field_6248), this.field_5752.field_6249, class_1192.field_6025, class_1192.field_6025, false);
      Iterator var5 = this.field_5893.iterator();

      while(true) {
         if(var5.hasNext()) {
            class_1206 var6 = (class_1206)var5.next();
            this.method_6211(var1, var3, var6.field_6244, var6.field_6248 - 2, var6.field_6246, var6.field_6247, var6.field_6248, var6.field_6249, class_1192.field_6025, class_1192.field_6025, false);
            if(var4 == null) {
               break;
            }

            if(var4 != null) {
               continue;
            }
         }

         this.method_6216(var1, var3, this.field_5752.field_6244, this.field_5752.field_6245 + 4, this.field_5752.field_6246, this.field_5752.field_6247, this.field_5752.field_6248, this.field_5752.field_6249, class_1192.field_6025, false);
         break;
      }

      return true;
   }

   // $FF: renamed from: b (ro) void
   protected void method_6194(class_1583 var1) {
      String[] var10000 = class_752.method_4253();
      class_1580 var10001 = new class_1580;
      var10001.method_8628();
      class_1580 var3 = var10001;
      Iterator var4 = this.field_5893.iterator();
      String[] var2 = var10000;

      while(true) {
         if(var4.hasNext()) {
            class_1206 var5 = (class_1206)var4.next();
            var3.method_8650(var5.method_6494());
            if(var2 == null) {
               break;
            }

            if(var2 != null) {
               continue;
            }
         }

         String[] var6 = field_5895;
         var1.method_8664("Entrances", var3);
         break;
      }

   }

   // $FF: renamed from: c (ro) void
   protected void method_6196(class_1583 var1) {
      String[] var10001 = field_5895;
      class_1580 var3 = var1.method_8689("Entrances", 11);
      String[] var2 = class_752.method_4253();
      int var4 = 0;

      while(var4 < var3.method_8658()) {
         List var10000 = this.field_5893;
         class_1206 var5 = new class_1206;
         var5.method_6477(var3.method_8654(var4));
         var10000.add(var5);
         ++var4;
         if(var2 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: <clinit> () void
   static void method_6222() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "Î¶¼çÚ½Î×\tÈCA¹è";
      int var4 = "Î¶¼çÚ½Î×\tÈCA¹è".length();
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
                  field_5895 = var5;
                  String[] var10 = field_5895;
                  field_5894 = "CL_00000447";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 51;
               break;
            case 1:
               var10009 = 68;
               break;
            case 2:
               var10009 = 93;
               break;
            case 3:
               var10009 = 143;
               break;
            case 4:
               var10009 = 158;
               break;
            case 5:
               var10009 = 105;
               break;
            default:
               var10009 = 84;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}
