
// $FF: renamed from: xK
public class class_801 extends class_797 {

   // $FF: renamed from: eb java.lang.String
   private static final String field_3737 = "snowballpoof";


   // $FF: renamed from: <init> (ahb) void
   public void method_3847(ahb var1) {
      super.method_3847(var1);
   }

   // $FF: renamed from: <init> (ahb, sv) void
   public void method_4682(ahb var1, class_752 var2) {
      super.method_4682(var1, var2);
   }

   // $FF: renamed from: <init> (ahb, double, double, double) void
   public void method_4683(ahb var1, double var2, double var4, double var6) {
      super.method_4683(var1, var2, var4, var6);
   }

   // $FF: renamed from: b (azu) void
   protected void method_4687(azu var1) {
      String[] var2;
      label69: {
         var2 = class_752.method_4253();
         class_689 var10000 = var1.field_4218;
         if(var2 != null) {
            if(var1.field_4218 == null) {
               break label69;
            }

            var10000 = var1.field_4218;
         }

         var10000.method_3896(class_1691.method_9331(this, this.method_4688()), 0.0F);
      }

      int var3;
      label63: {
         int var6 = this.field_2990.field_1832;
         if(var2 != null) {
            label61: {
               if(!this.field_2990.field_1832) {
                  var6 = this.field_3028.nextInt(8);
                  if(var2 == null) {
                     break label61;
                  }

                  if(var6 == 0) {
                     var3 = 1;
                     var6 = this.field_3028.nextInt(32);
                     if(var2 != null) {
                        if(var6 == 0) {
                           var3 = 4;
                        }

                        var6 = 0;
                     }

                     int var4 = var6;

                     while(var4 < var3) {
                        class_775 var7 = new class_775;
                        var7.method_3847(this.field_2990);
                        class_775 var5 = var7;
                        var5.method_4356(-24000);
                        var5.method_3887(this.field_2994, this.field_2995, this.field_2996, this.field_3000, 0.0F);
                        this.field_2990.method_2089(var5);
                        ++var4;
                        if(var2 == null) {
                           break label63;
                        }

                        if(var2 == null) {
                           break;
                        }
                     }
                  }
               }

               var6 = 0;
            }
         }

         var3 = var6;
      }

      while(true) {
         if(var3 < 8) {
            this.field_2990.method_2087("snowballpoof", this.field_2994, this.field_2995, this.field_2996, 0.0D, 0.0D, 0.0D);
            ++var3;
            if(var2 == null) {
               break;
            }

            if(var2 != null) {
               continue;
            }
         }

         class_801 var8 = this;
         if(var2 != null) {
            if(this.field_2990.field_1832) {
               break;
            }

            var8 = this;
         }

         var8.method_3851();
         break;
      }

   }

   // $FF: renamed from: <clinit> () void
   static void method_4689() {
      boolean var10000 = true;
      char[] var10003 = "´½óóOC6«£óëK".toCharArray();
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
            field_3737 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 36;
            break;
         case 1:
            var10009 = 48;
            break;
         case 2:
            var10009 = 127;
            break;
         case 3:
            var10009 = 103;
            break;
         case 4:
            var10009 = 206;
            break;
         case 5:
            var10009 = 193;
            break;
         default:
            var10009 = 185;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}
