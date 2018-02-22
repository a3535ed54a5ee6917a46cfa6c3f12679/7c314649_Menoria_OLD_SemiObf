
// $FF: renamed from: cC
public class class_935 extends class_934 {

   // $FF: renamed from: h java.lang.String
   private static final String field_4769 = "map_is_scaling";


   // $FF: renamed from: <init> () void
   public void method_5467() {
      add[] var10003 = new add[9];
      add var10006 = new add;
      var10006.method_3724(class_1010.field_5197);
      var10003[0] = var10006;
      var10006 = new add;
      var10006.method_3724(class_1010.field_5197);
      var10003[1] = var10006;
      var10006 = new add;
      var10006.method_3724(class_1010.field_5197);
      var10003[2] = var10006;
      var10006 = new add;
      var10006.method_3724(class_1010.field_5197);
      var10003[3] = var10006;
      var10006 = new add;
      var10006.method_3726(class_1010.field_5215, 0, 32767);
      var10003[4] = var10006;
      var10006 = new add;
      var10006.method_3724(class_1010.field_5197);
      var10003[5] = var10006;
      var10006 = new add;
      var10006.method_3724(class_1010.field_5197);
      var10003[6] = var10006;
      var10006 = new add;
      var10006.method_3724(class_1010.field_5197);
      var10003[7] = var10006;
      var10006 = new add;
      var10006.method_3724(class_1010.field_5197);
      var10003[8] = var10006;
      add var10004 = new add;
      var10004.method_3726(class_1010.field_5251, 0, 0);
      super.method_5464(3, 3, var10003, var10004);
   }

   // $FF: renamed from: b (aO, ahb) boolean
   public boolean method_60(class_897 var1, ahb var2) {
      String[] var3 = class_752.method_4253();
      boolean var10000 = super.method_60(var1, var2);
      if(var3 != null) {
         if(var10000) {
            add var4 = null;
            int var5 = 0;

            add var8;
            while(true) {
               if(var5 < var1.method_83()) {
                  var8 = var4;
                  if(var3 == null || var3 == null) {
                     break;
                  }

                  if(var4 == null) {
                     add var6 = var1.method_84(var5);
                     if(var3 != null) {
                        if(var6 != null) {
                           label52: {
                              var8 = var6;
                              if(var3 != null) {
                                 if(var6.method_3730() != class_1010.field_5215) {
                                    break label52;
                                 }

                                 var8 = var6;
                              }

                              var4 = var8;
                           }
                        }

                        ++var5;
                     }

                     if(var3 != null) {
                        continue;
                     }
                  }
               }

               var8 = var4;
               break;
            }

            if(var8 == null) {
               return false;
            }

            class_1296 var7 = class_1010.field_5215.getBlock20(var4, var2);
            class_1296 var9 = var7;
            if(var3 != null) {
               if(var7 == null) {
                  return false;
               }

               var9 = var7;
            }

            int var10 = var9.field_6654;
            if(var3 != null) {
               var10 = var9.field_6654 < 4?1:0;
            }

            return (boolean)var10;
         }

         var10000 = false;
      }

      return var10000;
   }

   // $FF: renamed from: b (aO) add
   public add method_61(class_897 var1) {
      String[] var10000 = class_752.method_4253();
      add var3 = null;
      String[] var2 = var10000;
      int var4 = 0;

      add var6;
      while(true) {
         if(var4 < var1.method_83()) {
            var6 = var3;
            if(var2 == null || var2 == null) {
               break;
            }

            if(var3 == null) {
               add var5 = var1.method_84(var4);
               if(var2 != null) {
                  if(var5 != null) {
                     label36: {
                        var6 = var5;
                        if(var2 != null) {
                           if(var5.method_3730() != class_1010.field_5215) {
                              break label36;
                           }

                           var6 = var5;
                        }

                        var3 = var6;
                     }
                  }

                  ++var4;
               }

               if(var2 != null) {
                  continue;
               }
            }
         }

         var3 = var3.method_3754();
         var3.field_2958 = 1;
         var6 = var3;
         break;
      }

      class_1583 var7 = var6.method_3767();
      if(var2 != null) {
         if(var7 == null) {
            class_1583 var10001 = new class_1583;
            var10001.method_8628();
            var3.method_3769(var10001);
         }

         var7 = var3.method_3767();
      }

      var7.initGui4("map_is_scaling", true);
      return var3;
   }

   // $FF: renamed from: <clinit> () void
   static void method_5468() {
      boolean var10000 = true;
      char[] var10003 = "ÝÒóªNKßÃÀªSs".toCharArray();
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
            field_4769 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 217;
            break;
         case 1:
            var10009 = 157;
            break;
         case 2:
            var10009 = 131;
            break;
         case 3:
            var10009 = 141;
            break;
         case 4:
            var10009 = 226;
            break;
         case 5:
            var10009 = 28;
            break;
         default:
            var10009 = 53;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}
