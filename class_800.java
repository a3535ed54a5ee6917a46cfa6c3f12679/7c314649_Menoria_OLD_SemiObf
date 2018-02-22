
// $FF: renamed from: xL
public class class_800 extends class_797 {

   // $FF: renamed from: eb java.lang.String
   private static final String field_3736 = "portal";


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
      label70: {
         var2 = class_752.method_4253();
         class_689 var10000 = var1.field_4218;
         if(var2 != null) {
            if(var1.field_4218 == null) {
               break label70;
            }

            var10000 = var1.field_4218;
         }

         var10000.method_3896(class_1691.method_9331(this, this.method_4688()), 0.0F);
      }

      int var3 = 0;

      while(true) {
         if(var3 < 32) {
            this.field_2990.method_2087("portal", this.field_2994, this.field_2995 + this.field_3028.nextDouble() * 2.0D, this.field_2996, this.field_3028.nextGaussian(), 0.0D, this.field_3028.nextGaussian());
            ++var3;
            if(var2 == null) {
               break;
            }

            if(var2 != null) {
               continue;
            }
         }

         class_800 var5 = this;
         if(var2 != null) {
            if(this.field_2990.field_1832) {
               break;
            }

            var5 = this;
         }

         if(var2 != null) {
            label49: {
               if(var5.method_4688() != null) {
                  var5 = this;
                  if(var2 == null) {
                     break label49;
                  }

                  if(this.method_4688() instanceof class_793) {
                     var5 = this;
                     if(var2 == null) {
                        break label49;
                     }

                     class_793 var4 = (class_793)this.method_4688();
                     if(var4.field_3654.method_9288().method_563()) {
                        label74: {
                           Object var6 = var4;
                           if(var2 != null) {
                              if(var4.field_2990 != this.field_2990) {
                                 break label74;
                              }

                              var6 = this.method_4688();
                           }

                           boolean var7 = ((class_752)var6).method_3937();
                           if(var2 != null) {
                              if(var7) {
                                 this.method_4688().method_3925((class_689)null);
                              }

                              this.method_4688().method_4219(this.field_2994, this.field_2995, this.field_2996);
                              this.method_4688().field_3019 = 0.0F;
                              this.method_4688().method_3896(class_1691.field_8837, 5.0F);
                           }
                        }
                     }
                  }
               }

               var5 = this;
            }
         }

         var5.method_3851();
         break;
      }

   }

   // $FF: renamed from: <clinit> () void
   static void method_4689() {
      boolean var10000 = true;
      char[] var10003 = "<ÔælÅ".toCharArray();
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
            field_3736 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 62;
            break;
         case 1:
            var10009 = 201;
            break;
         case 2:
            var10009 = 230;
            break;
         case 3:
            var10009 = 106;
            break;
         case 4:
            var10009 = 214;
            break;
         case 5:
            var10009 = 147;
            break;
         default:
            var10009 = 118;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}
