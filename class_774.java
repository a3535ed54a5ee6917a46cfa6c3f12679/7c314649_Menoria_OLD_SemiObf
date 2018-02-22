
// $FF: renamed from: wQ
public class class_774 extends class_773 {

   // $FF: renamed from: bH java.lang.String
   private static final String field_3532;
   // $FF: renamed from: jb java.lang.String[]
   private static final String[] field_3533;


   // $FF: renamed from: <init> (ahb) void
   public void method_3847(ahb var1) {
      super.method_3847(var1);
      this.method_3852(0.9F, 1.3F);
   }

   // $FF: renamed from: a (yz) boolean
   public boolean method_4295(class_792 var1) {
      add var3 = var1.field_3616.method_3593();
      String[] var2 = class_752.method_4253();
      add var10000 = var3;
      int var10;
      if(var2 != null) {
         label90: {
            if(var3 != null) {
               var10000 = var3;
               if(var2 == null) {
                  break label90;
               }

               if(var3.method_3730() == class_1010.field_5139) {
                  label94: {
                     var10 = this.method_4354();
                     if(var2 != null) {
                        if(var10 < 0) {
                           break label94;
                        }

                        var10 = var3.field_2958;
                     }

                     if(var2 != null) {
                        class_666 var12;
                        if(var10 == 1) {
                           var12 = var1.field_3616;
                           int var11 = var1.field_3616.field_2846;
                           add var10002 = new add;
                           var10002.method_3724(class_1010.field_5140);
                           var12.method_87(var11, var10002);
                           return true;
                        }

                        var12 = var1.field_3616;
                        add var10001 = new add;
                        var10001.method_3724(class_1010.field_5140);
                        var10 = var12.method_3607(var10001);
                     }

                     if(var2 != null) {
                        if(var10 == 0) {
                           break label94;
                        }

                        var10 = var1.field_3640.field_2839;
                     }

                     if(var2 != null) {
                        if(var10 != 0) {
                           break label94;
                        }

                        var1.field_3616.method_85(var1.field_3616.field_2846, 1);
                        var10 = 1;
                     }

                     return (boolean)var10;
                  }
               }
            }

            var10000 = var3;
         }
      }

      label66: {
         if(var2 != null) {
            if(var10000 == null) {
               break label66;
            }

            var10000 = var3;
         }

         if(var10000.method_3730() == class_1010.field_5216) {
            var10 = this.method_4354();
            if(var2 == null) {
               return (boolean)var10;
            }

            if(var10 >= 0) {
               this.method_3851();
               String[] var6 = field_3533;
               this.field_2990.method_2087("largeexplode", this.field_2994, this.field_2995 + (double)(this.field_3015 / 2.0F), this.field_2996, 0.0D, 0.0D, 0.0D);
               boolean var7 = this.field_2990.field_1832;
               if(var2 != null) {
                  if(!this.field_2990.field_1832) {
                     class_773 var8 = new class_773;
                     var8.method_3847(this.field_2990);
                     class_773 var4 = var8;
                     var4.method_3887(this.field_2994, this.field_2995, this.field_2996, this.field_3000, this.field_3001);
                     var4.method_4188(this.method_406());
                     var4.field_3330 = this.field_3330;
                     this.field_2990.method_2089(var4);
                     int var5 = 0;

                     while(true) {
                        if(var5 < 5) {
                           ahb var9 = this.field_2990;
                           class_699 var13 = new class_699;
                           ahb var10003 = this.field_2990;
                           double var10004 = this.field_2994;
                           double var10005 = this.field_2995 + (double)this.field_3015;
                           double var10006 = this.field_2996;
                           add var10007 = new add;
                           var10007.method_3721(class_1192.field_6067);
                           var13.method_4025(var10003, var10004, var10005, var10006, var10007);
                           var9.method_2089(var13);
                           ++var5;
                           if(var2 == null) {
                              break;
                           }

                           if(var2 != null) {
                              continue;
                           }
                        }

                        var3.method_3749(1, var1);
                        break;
                     }

                     String[] var14 = field_3533;
                     this.method_3868("mob.sheep.shear", 1.0F, 1.0F);
                  }

                  var7 = true;
               }

               return var7;
            }
         }
      }

      var10 = super.method_4295(var1);
      return (boolean)var10;
   }

   // $FF: renamed from: d (wJ) wQ
   public class_774 method_4471(class_767 var1) {
      class_774 var10000 = new class_774;
      var10000.method_3847(this.field_2990);
      return var10000;
   }

   // $FF: renamed from: <clinit> () void
   static void method_4384() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "b¯\n¹ »¤~¢º M\'îõîì?øLëc¡ð¶¶¹k¾V­­»½|";
      int var4 = "b¯\n¹ »¤~¢º M\'îõîì?øLëc¡ð¶¶¹k¾V­­»½|".length();
      char var1 = 12;
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
                  field_3533 = var5;
                  String[] var10 = field_3533;
                  field_3532 = "CL_00001645";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 201;
               break;
            case 1:
               var10009 = 9;
               break;
            case 2:
               var10009 = 191;
               break;
            case 3:
               var10009 = 25;
               break;
            case 4:
               var10009 = 2;
               break;
            case 5:
               var10009 = 25;
               break;
            default:
               var10009 = 27;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}
