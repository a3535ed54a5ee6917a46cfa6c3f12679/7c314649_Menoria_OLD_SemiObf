package ca.diiza.f;

import ca.diiza.f.class_140;
import ca.diiza.f.class_209;
import java.util.List;

// $FF: renamed from: ca.diiza.f.v
public class class_230 extends bdw {

   // $FF: renamed from: b java.lang.String
   String field_1235;
   // $FF: renamed from: i ca.diiza.f.m
   class_140 field_1236;
   // $FF: renamed from: r ca.diiza.f.m
   class_140 field_1237;
   // $FF: renamed from: s java.lang.String
   private String field_1238;
   // $FF: renamed from: t bcb
   private bcb field_1239;
   // $FF: renamed from: u java.lang.String[]
   private static final String[] field_1240;


   // $FF: renamed from: <init> (bao, java.lang.String) void
   public void method_1250(bao var1, String var2) {
      super.method_651();
      String[] var10001 = field_1240;
      this.field_1235 = "S\'inscrire";
      this.field_557 = var1;
      this.field_1238 = var2;
   }

   // $FF: renamed from: b () void
   public void initGui() {
      class_1564 var1 = class_1564.method_8588();
      String[] var2 = field_1240;
      this.field_1235 = var1.method_8590("S\'inscrire");
      class_140 var10001 = new class_140;
      var10001.GuiTextField(this.fontRendererObj, this.width / 2 - 100, this.height / 2 - 25, 200, 18);
      this.field_1236 = var10001;
      var10001 = new class_140;
      var10001.GuiTextField(this.fontRendererObj, this.width / 2 - 100, this.height / 2 + 10, 200, 18);
      this.field_1237 = var10001;
      bcb var3 = new bcb;
      var3.method_748(16, this.width / 2 - 100, this.height / 2 + 40, 95, 20, var1.method_8590("S\'inscrire"));
      this.field_1239 = var3;
      this.field_1239.field_451 = false;
      this.buttonList.add(this.field_1239);
      List var10000 = this.buttonList;
      var3 = new bcb;
      var3.method_748(15, this.width / 2 + 5, this.height / 2 + 40, 95, 20, var1.method_8590("Se deconnecter"));
      var10000.add(var3);
      this.field_1236.setFocused(true);
   }

   // $FF: renamed from: a (int, int, float) void
   public void drawScreen(int var1, int var2, float var3) {
      this.method_873();
      this.field_1236.drawTextBox();
      this.field_1237.drawTextBox();
      this.fontRendererObj.method_7020(this.field_1238, this.width / 2 - 100, this.height / 2 - 55, 0);
      String[] var4 = field_1240;
      this.fontRendererObj.method_7020("§fMot de passe:", this.width / 2 - 100, this.height / 2 - 35, 0);
      this.fontRendererObj.method_7020("§fConfirmer:", this.width / 2 - 100, this.height / 2, 0);
      super.drawScreen(var1, var2, var3);
   }

   // $FF: renamed from: a (char, int) void
   public void method_856(char var1, int var2) {
      int var3;
      class_230 var6;
      int var8;
      label94: {
         label93: {
            label97: {
               boolean var10000;
               label98: {
                  label99: {
                     super.method_856(var1, var2);
                     var3 = class_209.method_1159();
                     var10000 = this.field_1236.isFocused();
                     if(var3 != 0) {
                        if(var10000) {
                           this.field_1236.method_726(var1, var2);
                           if(var3 != 0) {
                              break label99;
                           }
                        }

                        var10000 = this.field_1237.isFocused();
                     }

                     if(var3 == 0) {
                        break label98;
                     }

                     if(var10000) {
                        this.field_1237.method_726(var1, var2);
                     }
                  }

                  var6 = this;
                  if(var3 == 0) {
                     break label97;
                  }

                  var10000 = this.field_1236.method_714().isEmpty();
               }

               if(!var10000) {
                  var8 = this.field_1237.method_714().isEmpty();
                  if(var3 == 0) {
                     break label94;
                  }

                  if(var8 == 0) {
                     break label93;
                  }
               }

               var6 = this;
            }

            var6.field_1239.field_451 = false;
         }

         var8 = this.field_1236.method_714().isEmpty();
      }

      if(var3 != 0) {
         label69: {
            if(var8 == 0) {
               var8 = this.field_1237.method_714().isEmpty();
               if(var3 == 0) {
                  break label69;
               }

               if(var8 == 0) {
                  this.field_1239.field_451 = true;
               }
            }

            var8 = var2;
         }
      }

      if(var3 != 0) {
         if(var8 != 28) {
            return;
         }

         var8 = this.field_1236.method_714().isEmpty();
      }

      if(var3 != 0) {
         if(var8 != 0) {
            return;
         }

         var8 = this.field_1237.method_714().isEmpty();
      }

      label101: {
         if(var3 != 0) {
            if(var8 != 0) {
               return;
            }

            var6 = this;
            if(var3 == 0) {
               break label101;
            }

            var8 = this.field_1236.method_714().equals(this.field_1237.method_714());
         }

         if(var8 != 0) {
            bjk var5 = this.field_557.cursorCounter8;
            StringBuilder var10001 = new StringBuilder();
            String[] var4 = field_1240;
            var5.method_4676(var10001.append("/register ").append(this.field_1236.method_714()).append(" ").append(this.field_1236.method_714()).toString());
            this.field_557.method_5248();
            if(var3 != 0) {
               return;
            }
         }

         var6 = this;
      }

      String[] var7 = field_1240;
      var6.field_1238 = "§cMots de passes différents !";
   }

   // $FF: renamed from: a (int, int, int) void
   public void method_862(int var1, int var2, int var3) {
      super.method_862(var1, var2, var3);
      this.field_1236.method_727(var1, var2, var3);
      this.field_1237.method_727(var1, var2, var3);
   }

   // $FF: renamed from: a (bcb) void
   protected void method_865(bcb var1) {
      int var2 = class_209.method_1159();
      int var10000 = var1.field_451;
      if(var2 != 0) {
         if(!var1.field_451) {
            return;
         }

         var10000 = var1.field_450;
      }

      switch(var10000) {
      case 15:
         this.field_557.cursorCounter6.method_2180();
         this.field_557.method_5259((bjf)null);
         bao var4 = this.field_557;
         class_209 var10001 = new class_209;
         var10001.method_651();
         var4.method_5236(var10001);
         if(var2 != 0) {
            break;
         }
      case 16:
         boolean var5 = this.field_1236.method_714().isEmpty();
         if(var2 != 0) {
            if(var5) {
               return;
            }

            var5 = this.field_1237.method_714().isEmpty();
         }

         class_230 var8;
         label50: {
            if(var2 != 0) {
               if(var5) {
                  return;
               }

               var8 = this;
               if(var2 == 0) {
                  break label50;
               }

               var5 = this.field_1236.method_714().equals(this.field_1237.method_714());
            }

            if(var5) {
               bjk var9 = this.field_557.cursorCounter8;
               StringBuilder var6 = new StringBuilder();
               String[] var3 = field_1240;
               var9.method_4676(var6.append("/register ").append(this.field_1236.method_714()).append(" ").append(this.field_1236.method_714()).toString());
               this.field_557.method_5248();
               if(var2 != 0) {
                  return;
               }
            }

            var8 = this;
         }

         String[] var7 = field_1240;
         var8.field_1238 = "§cMots de passes différents !";
      }

   }

   // $FF: renamed from: <clinit> () void
   static void method_1251() {
      // $FF: Couldn't be decompiled
   }
}
