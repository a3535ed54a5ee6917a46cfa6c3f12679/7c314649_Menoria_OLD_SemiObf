import java.util.List;

// $FF: renamed from: xn
public class class_703 extends class_702 {

   // $FF: renamed from: at int
   private int field_3123;
   // $FF: renamed from: au long
   public long field_3124;
   // $FF: renamed from: av int
   private int field_3125;
   // $FF: renamed from: db java.lang.String[]
   private static final String[] field_3126;


   // $FF: renamed from: <init> (ahb, double, double, double) void
   public void method_4052(ahb var1, double var2, double var4, double var6) {
      String[] var8;
      ahb var14;
      label83: {
         String[] var10000 = class_752.method_4253();
         super.method_3847(var1);
         this.method_3887(var2, var4, var6, 0.0F, 0.0F);
         this.field_3123 = 2;
         this.field_3124 = this.field_3028.nextLong();
         var8 = var10000;
         this.field_3125 = this.field_3028.nextInt(3) + 1;
         boolean var13 = var1.field_1832;
         if(var8 != null) {
            if(var1.field_1832) {
               return;
            }

            var14 = var1;
            if(var8 == null) {
               break label83;
            }

            class_1038 var15 = var1.method_2196();
            String[] var10001 = field_3126;
            var13 = var15.method_5878("doFireTick");
         }

         if(!var13) {
            return;
         }

         var14 = var1;
      }

      if(var8 != null) {
         label67: {
            if(var14.field_1818 != class_918.field_4629) {
               var14 = var1;
               if(var8 == null) {
                  break label67;
               }

               if(var1.field_1818 != class_918.field_4630) {
                  return;
               }
            }

            var14 = var1;
         }
      }

      int var16 = var14.method_2049(class_1715.method_9561(var2), class_1715.method_9561(var4), class_1715.method_9561(var6), 10);
      if(var8 != null) {
         if(var16 == 0) {
            return;
         }

         var16 = class_1715.method_9561(var2);
      }

      int var9;
      int var10;
      int var11;
      byte var17;
      label54: {
         var9 = var16;
         var10 = class_1715.method_9561(var4);
         var11 = class_1715.method_9561(var6);
         if(var1.getBlock(var9, var10, var11).method_2424() == awt.field_4170) {
            var17 = class_1192.field_6078.method_2480(var1, var9, var10, var11);
            if(var8 == null) {
               break label54;
            }

            if(var17 != 0) {
               var1.method_2058(var9, var10, var11, class_1192.field_6078);
            }
         }

         var17 = 0;
      }

      var9 = var17;

      while(var9 < 4) {
         var10 = class_1715.method_9561(var2) + this.field_3028.nextInt(3) - 1;
         var11 = class_1715.method_9561(var4) + this.field_3028.nextInt(3) - 1;
         int var12 = class_1715.method_9561(var6) + this.field_3028.nextInt(3) - 1;
         if(var8 != null) {
            if(var1.getBlock(var10, var11, var12).method_2424() == awt.field_4170 && var8 != null && class_1192.field_6078.method_2480(var1, var10, var11, var12)) {
               var1.method_2058(var10, var11, var12, class_1192.field_6078);
            }

            ++var9;
         }

         if(var8 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: h () void
   public void method_3856() {
      String[] var10000 = class_752.method_4253();
      super.method_3856();
      String[] var1 = var10000;
      int var11 = this.field_3123;
      if(var1 != null) {
         if(this.field_3123 == 2) {
            String[] var7 = field_3126;
            this.field_2990.method_2084(this.field_2994, this.field_2995, this.field_2996, "ambient.weather.thunder", 10000.0F, 0.8F + this.field_3028.nextFloat() * 0.2F);
            this.field_2990.method_2084(this.field_2994, this.field_2995, this.field_2996, "random.explode", 2.0F, 0.5F + this.field_3028.nextFloat() * 0.2F);
         }

         --this.field_3123;
         var11 = this.field_3123;
      }

      if(var1 != null) {
         label92: {
            class_703 var13;
            label91: {
               if(var11 < 0) {
                  label97: {
                     var11 = this.field_3125;
                     if(var1 != null) {
                        if(this.field_3125 == 0) {
                           this.method_3851();
                           if(var1 != null) {
                              break label97;
                           }
                        }

                        var11 = this.field_3123;
                     }

                     if(var1 == null) {
                        break label92;
                     }

                     if(var11 < -this.field_3028.nextInt(10)) {
                        --this.field_3125;
                        this.field_3123 = 1;
                        this.field_3124 = this.field_3028.nextLong();
                        var11 = this.field_2990.field_1832;
                        if(var1 == null) {
                           break label92;
                        }

                        if(!this.field_2990.field_1832) {
                           class_1038 var12 = this.field_2990.method_2196();
                           String[] var10001 = field_3126;
                           var11 = var12.method_5878("doFireTick");
                           if(var1 == null) {
                              break label92;
                           }

                           if(var11 != 0) {
                              var11 = this.field_2990.method_2049(class_1715.method_9561(this.field_2994), class_1715.method_9561(this.field_2995), class_1715.method_9561(this.field_2996), 10);
                              if(var1 == null) {
                                 break label92;
                              }

                              if(var11 != 0) {
                                 int var2 = class_1715.method_9561(this.field_2994);
                                 int var3 = class_1715.method_9561(this.field_2995);
                                 int var4 = class_1715.method_9561(this.field_2996);
                                 var13 = this;
                                 if(var1 == null) {
                                    break label91;
                                 }

                                 if(this.field_2990.getBlock(var2, var3, var4).method_2424() == awt.field_4170) {
                                    var11 = class_1192.field_6078.method_2480(this.field_2990, var2, var3, var4);
                                    if(var1 == null) {
                                       break label92;
                                    }

                                    if(var11 != 0) {
                                       this.field_2990.method_2058(var2, var3, var4, class_1192.field_6078);
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }

               var13 = this;
            }

            var11 = var13.field_3123;
         }
      }

      label62: {
         ahb var8;
         label99: {
            if(var1 != null) {
               if(var11 < 0) {
                  return;
               }

               var8 = this.field_2990;
               if(var1 == null) {
                  break label99;
               }

               var11 = this.field_2990.field_1832;
            }

            if(var11 == 0) {
               break label62;
            }

            var8 = this.field_2990;
         }

         var8.field_1817 = 2;
         if(var1 != null) {
            return;
         }
      }

      double var9 = 3.0D;
      List var10 = this.field_2990.method_2155(this, class_1343.method_7093(this.field_2994 - var9, this.field_2995 - var9, this.field_2996 - var9, this.field_2994 + var9, this.field_2995 + 6.0D + var9, this.field_2996 + var9));
      int var5 = 0;

      while(var5 < var10.size()) {
         class_689 var6 = (class_689)var10.get(var5);
         var6.method_3951(this);
         ++var5;
         if(var1 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: c () void
   protected void method_3848() {}

   // $FF: renamed from: a (ro) void
   protected void method_3908(class_1583 var1) {}

   // $FF: renamed from: b (ro) void
   protected void method_3909(class_1583 var1) {}

   // $FF: renamed from: <clinit> () void
   static void method_4053() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "PÃwJ,]Ï­UÁ¤`A\fÛ£qGF²pAQÞFÍ¨jBVQÔ¶jK";
      int var4 = "PÃwJ,]Ï­UÁ¤`A\fÛ£qGF²pAQÞFÍ¨jBVQÔ¶jK".length();
      char var1 = 10;
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
                  field_3126 = var5;
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 100;
               break;
            case 1:
               var10009 = 252;
               break;
            case 2:
               var10009 = 150;
               break;
            case 3:
               var10009 = 33;
               break;
            case 4:
               var10009 = 85;
               break;
            case 5:
               var10009 = 127;
               break;
            default:
               var10009 = 40;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var10 ^ var10009);
            ++var6;
         }
      }
   }
}
