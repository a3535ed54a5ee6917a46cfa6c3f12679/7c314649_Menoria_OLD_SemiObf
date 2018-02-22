
// $FF: renamed from: yH
public class class_1758 extends class_1727 {

   // $FF: renamed from: c wM
   private final class_778 field_9183;
   // $FF: renamed from: d double
   private final double field_9184;
   // $FF: renamed from: e int
   private int field_9185;
   // $FF: renamed from: f int
   private int field_9186;
   // $FF: renamed from: g int
   private int field_9187;
   // $FF: renamed from: h int
   private int field_9188;
   // $FF: renamed from: i int
   private int field_9189;
   // $FF: renamed from: j int
   private int field_9190;
   // $FF: renamed from: k java.lang.String
   private static final String field_9191 = "CL_00001601";


   // $FF: renamed from: <init> (wM, double) void
   public void method_9713(class_778 var1, double var2) {
      super.method_9648();
      this.field_9183 = var1;
      this.field_9184 = var2;
      this.method_9655(5);
   }

   // $FF: renamed from: b () boolean
   public boolean method_9649() {
      int var10000;
      label40: {
         String[] var1 = class_752.method_4253();
         var10000 = this.field_9183.method_4476();
         if(var1 != null) {
            if(var10000 == 0) {
               break label40;
            }

            var10000 = this.field_9183.method_4478();
         }

         if(var1 != null) {
            if(var10000 != 0) {
               break label40;
            }

            double var2;
            var10000 = (var2 = this.field_9183.method_4165().nextDouble() - 0.006500000134110451D) == 0.0D?0:(var2 < 0.0D?-1:1);
         }

         if(var1 != null) {
            if(var10000 > 0) {
               break label40;
            }

            var10000 = this.method_9714();
         }

         if(var1 == null) {
            return (boolean)var10000;
         }

         if(var10000 != 0) {
            var10000 = 1;
            return (boolean)var10000;
         }
      }

      var10000 = 0;
      return (boolean)var10000;
   }

   // $FF: renamed from: c () boolean
   public boolean method_9650() {
      int var10000;
      label33: {
         String[] var1;
         label34: {
            var1 = class_752.method_4253();
            var10000 = this.field_9185;
            int var10001 = this.field_9187;
            if(var1 != null) {
               if(this.field_9185 > this.field_9187) {
                  break label33;
               }

               var10000 = this.field_9186;
               if(var1 == null) {
                  break label34;
               }

               var10001 = 60;
            }

            if(var10000 > var10001) {
               break label33;
            }

            var10000 = this.method_9715(this.field_9183.field_2990, this.field_9188, this.field_9189, this.field_9190);
         }

         if(var1 == null) {
            return (boolean)var10000;
         }

         if(var10000 != 0) {
            var10000 = 1;
            return (boolean)var10000;
         }
      }

      var10000 = 0;
      return (boolean)var10000;
   }

   // $FF: renamed from: e () void
   public void method_9652() {
      this.field_9183.method_4257().method_9794((double)((float)this.field_9188) + 0.5D, (double)(this.field_9189 + 1), (double)((float)this.field_9190) + 0.5D, this.field_9184);
      this.field_9185 = 0;
      this.field_9186 = 0;
      this.field_9187 = this.field_9183.method_4165().nextInt(this.field_9183.method_4165().nextInt(1200) + 1200) + 1200;
      this.field_9183.method_4483().method_9697(false);
   }

   // $FF: renamed from: f () void
   public void method_9653() {
      this.field_9183.method_4479(false);
   }

   // $FF: renamed from: g () void
   public void method_9654() {
      class_1758 var3;
      label28: {
         String[] var10000 = class_752.method_4253();
         ++this.field_9185;
         String[] var1 = var10000;
         this.field_9183.method_4483().method_9697(false);
         double var4;
         int var2 = (var4 = this.field_9183.method_3889((double)this.field_9188, (double)(this.field_9189 + 1), (double)this.field_9190) - 1.0D) == 0.0D?0:(var4 < 0.0D?-1:1);
         if(var1 != null) {
            if(var2 > 0) {
               this.field_9183.method_4479(false);
               this.field_9183.method_4257().method_9794((double)((float)this.field_9188) + 0.5D, (double)(this.field_9189 + 1), (double)((float)this.field_9190) + 0.5D, this.field_9184);
               ++this.field_9186;
               if(var1 != null) {
                  return;
               }
            }

            var3 = this;
            if(var1 == null) {
               break label28;
            }

            var2 = this.field_9183.method_4478();
         }

         if(var2 == 0) {
            this.field_9183.method_4479(true);
            if(var1 != null) {
               return;
            }
         }

         var3 = this;
      }

      --var3.field_9186;
   }

   // $FF: renamed from: a () boolean
   private boolean method_9714() {
      String[] var10000 = class_752.method_4253();
      int var2 = (int)this.field_9183.field_2995;
      String[] var1 = var10000;
      double var3 = 2.147483647E9D;
      int var5 = (int)this.field_9183.field_2994 - 8;

      int var9;
      label69:
      while(true) {
         double var11;
         var9 = (var11 = (double)var5 - (this.field_9183.field_2994 + 8.0D)) == 0.0D?0:(var11 < 0.0D?-1:1);

         label66:
         while(var9 < 0) {
            var9 = (int)this.field_9183.field_2996 - 8;
            if(var1 == null) {
               break label69;
            }

            int var6 = var9;

            while((double)var6 < this.field_9183.field_2996 + 8.0D) {
               var9 = this.method_9715(this.field_9183.field_2990, var5, var2, var6);
               if(var1 == null) {
                  continue label66;
               }

               label60: {
                  label76: {
                     class_778 var10;
                     label77: {
                        if(var1 != null) {
                           if(var9 == 0) {
                              break label76;
                           }

                           var10 = this.field_9183;
                           if(var1 == null) {
                              break label77;
                           }

                           var9 = this.field_9183.field_2990.method_34(var5, var2 + 1, var6);
                        }

                        if(var9 == 0) {
                           break label76;
                        }

                        var10 = this.field_9183;
                     }

                     double var7 = var10.method_3889((double)var5, (double)var2, (double)var6);
                     if(var1 == null) {
                        break label60;
                     }

                     if(var7 < var3) {
                        this.field_9188 = var5;
                        this.field_9189 = var2;
                        this.field_9190 = var6;
                        var3 = var7;
                     }
                  }

                  ++var6;
               }

               if(var1 == null) {
                  break;
               }
            }

            ++var5;
            if(var1 != null) {
               continue label69;
            }
            break;
         }

         double var12;
         var9 = (var12 = var3 - 2.147483647E9D) == 0.0D?0:(var12 < 0.0D?-1:1);
         break;
      }

      if(var1 != null) {
         var9 = var9 < 0?1:0;
      }

      return (boolean)var9;
   }

   // $FF: renamed from: b (ahb, int, int, int) boolean
   private boolean method_9715(ahb var1, int var2, int var3, int var4) {
      boolean var11;
      label34: {
         String[] var10000 = class_752.method_4253();
         aji var6 = var1.getBlock(var2, var3, var4);
         int var7 = var1.method_33(var2, var3, var4);
         String[] var5 = var10000;
         aji var9 = var6;
         Object var10001 = class_1192.field_6081;
         if(var5 != null) {
            if(var6 == class_1192.field_6081) {
               label38: {
                  class_594 var8 = (class_594)var1.method_31(var2, var3, var4);
                  int var10 = var8.field_2533;
                  if(var5 != null) {
                     if(var8.field_2533 >= 1) {
                        if(var5 != null) {
                           break label34;
                        }
                        break label38;
                     }

                     var10 = 1;
                  }

                  return (boolean)var10;
               }
            }

            var9 = var6;
            var10001 = class_1192.field_6053;
         }

         if(var9 == var10001) {
            var11 = class_435.method_2742(var7);
            if(var5 == null) {
               return var11;
            }

            if(!var11) {
               return true;
            }
         }
      }

      var11 = false;
      return var11;
   }

   // $FF: renamed from: <clinit> () void
   static void method_9716() {
      boolean var10000 = true;
      char[] var10003 = "oÍïëYe¢î".toCharArray();
      Object var10004 = var10003.length;
      Object var4 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var0 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var5 = var10002;
         var10002 = var10003;
         if(var10003 <= var0) {
            field_9191 = (new String((char[])var4)).intern();
            String var2 = field_9191;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 11;
            break;
         case 1:
            var10009 = 116;
            break;
         case 2:
            var10009 = 181;
            break;
         case 3:
            var10009 = 248;
            break;
         case 4:
            var10009 = 252;
            break;
         case 5:
            var10009 = 150;
            break;
         default:
            var10009 = 78;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
