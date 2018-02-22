import java.util.Random;

// $FF: renamed from: gs
public class class_588 extends class_580 {

   // $FF: renamed from: m int
   public int field_2502;
   // $FF: renamed from: n float
   public float field_2503;
   // $FF: renamed from: o float
   public float field_2504;
   // $FF: renamed from: p float
   public float field_2505;
   // $FF: renamed from: q float
   public float field_2506;
   // $FF: renamed from: r float
   public float field_2507;
   // $FF: renamed from: s float
   public float field_2508;
   // $FF: renamed from: t float
   public float field_2509;
   // $FF: renamed from: u float
   public float field_2510;
   // $FF: renamed from: v float
   public float field_2511;
   // $FF: renamed from: w java.util.Random
   private static Random field_2512;
   // $FF: renamed from: x java.lang.String
   private String field_2513;
   // $FF: renamed from: y java.lang.String
   private static final String field_2514;
   // $FF: renamed from: z java.lang.String[]
   private static final String[] field_2515;


   // $FF: renamed from: <init> () void
   public void getBlock88() {
      super.getBlock88();
   }

   // $FF: renamed from: c (ro) void
   public void getBlock93(class_1583 var1) {
      super.getBlock93(var1);
      if(this.method_3153()) {
         String[] var10001 = field_2515;
         var1.initGui1("CustomName", this.field_2513);
      }

   }

   // $FF: renamed from: b (ro) void
   public void getBlock92(class_1583 var1) {
      String[] var2 = class_752.method_4253();
      class_588 var10000 = this;
      class_1583 var10001 = var1;
      if(var2 != null) {
         super.getBlock92(var1);
         String[] var3 = field_2515;
         if(!var1.initGui8("CustomName", 8)) {
            return;
         }

         var10000 = this;
         var10001 = var1;
      }

      String[] var10002 = field_2515;
      var10000.field_2513 = var10001.method_8685("CustomName");
   }

   // $FF: renamed from: g () void
   public void getBlock94() {
      String[] var1;
      float var10;
      label142: {
         super.getBlock94();
         this.field_2508 = this.field_2507;
         String[] var10000 = class_752.method_4253();
         this.field_2510 = this.field_2509;
         var1 = var10000;
         class_792 var2 = this.field_2464.method_2175((double)((float)this.field_2465 + 0.5F), (double)((float)this.field_2466 + 0.5F), (double)((float)this.field_2467 + 0.5F), 3.0D);
         if(var1 != null) {
            if(var2 != null) {
               label145: {
                  double var3 = var2.field_2994 - (double)((float)this.field_2465 + 0.5F);
                  double var5 = var2.field_2996 - (double)((float)this.field_2467 + 0.5F);
                  this.field_2511 = (float)Math.atan2(var5, var3);
                  this.field_2507 += 0.1F;
                  var10 = this.field_2507;
                  if(var1 != null) {
                     if(this.field_2507 >= 0.5F && field_2512.nextInt(40) != 0) {
                        break label145;
                     }

                     var10 = this.field_2505;
                  }

                  float var7 = var10;

                  do {
                     this.field_2505 += (float)(field_2512.nextInt(4) - field_2512.nextInt(4));
                  } while(var7 == this.field_2505);
               }

               if(var1 != null) {
                  break label142;
               }
            }

            this.field_2511 += 0.02F;
         }

         this.field_2507 -= 0.1F;
      }

      class_588 var11;
      label124: {
         label123: {
            label122: {
               label121:
               while(true) {
                  if(this.field_2509 >= 3.1415927F) {
                     this.field_2509 -= 6.2831855F;
                     if(var1 == null) {
                        break;
                     }

                     if(var1 != null) {
                        continue;
                     }
                  }

                  while(true) {
                     if(this.field_2509 >= -3.1415927F) {
                        break label121;
                     }

                     this.field_2509 += 6.2831855F;
                     if(var1 == null) {
                        break label122;
                     }

                     if(var1 == null) {
                        break label121;
                     }
                  }
               }

               while(this.field_2511 >= 3.1415927F) {
                  this.field_2511 -= 6.2831855F;
                  if(var1 == null) {
                     break label123;
                  }

                  if(var1 == null) {
                     break;
                  }
               }
            }

            while(this.field_2511 < -3.1415927F) {
               var11 = this;
               if(var1 == null) {
                  break label124;
               }

               this.field_2511 += 6.2831855F;
               if(var1 == null) {
                  break;
               }
            }
         }

         var11 = this;
      }

      float var8 = var11.field_2511 - this.field_2509;

      label88:
      while(true) {
         if(var8 >= 3.1415927F) {
            var8 -= 6.2831855F;
            if(var1 == null) {
               break;
            }

            if(var1 != null) {
               continue;
            }
         }

         while(true) {
            if(var8 < -3.1415927F) {
               var8 += 6.2831855F;
               if(var1 == null) {
                  break label88;
               }

               if(var1 != null) {
                  continue;
               }
            }

            this.field_2509 += var8 * 0.4F;
            break label88;
         }
      }

      int var12;
      float var10001;
      label149: {
         float var13;
         var12 = (var13 = this.field_2507 - 0.0F) == 0.0F?0:(var13 < 0.0F?-1:1);
         if(var1 != null) {
            if(var12 < 0) {
               this.field_2507 = 0.0F;
            }

            var10 = this.field_2507;
            var10001 = 1.0F;
            if(var1 == null) {
               break label149;
            }

            float var14;
            var12 = (var14 = this.field_2507 - 1.0F) == 0.0F?0:(var14 < 0.0F?-1:1);
         }

         if(var12 > 0) {
            this.field_2507 = 1.0F;
         }

         ++this.field_2502;
         this.field_2504 = this.field_2503;
         var10 = this.field_2505 - this.field_2503;
         var10001 = 0.4F;
      }

      float var4;
      label66: {
         label151: {
            var4 = var10 * var10001;
            float var9 = 0.2F;
            float var15;
            var12 = (var15 = var4 - -var9) == 0.0F?0:(var15 < 0.0F?-1:1);
            if(var1 != null) {
               if(var12 < 0) {
                  var4 = -var9;
               }

               var10 = var4;
               if(var1 == null) {
                  break label151;
               }

               float var16;
               var12 = (var16 = var4 - var9) == 0.0F?0:(var16 < 0.0F?-1:1);
            }

            if(var12 <= 0) {
               break label66;
            }

            var10 = var9;
         }

         var4 = var10;
      }

      this.field_2506 += (var4 - this.field_2506) * 0.9F;
      this.field_2503 += this.field_2506;
   }

   // $FF: renamed from: b () java.lang.String
   public String method_3152() {
      String[] var1 = class_752.method_4253();
      class_588 var10000 = this;
      String var2;
      if(var1 != null) {
         if(!this.method_3153()) {
            String[] var3 = field_2515;
            var2 = "container.enchant";
            return var2;
         }

         var10000 = this;
      }

      var2 = var10000.field_2513;
      return var2;
   }

   // $FF: renamed from: d () boolean
   public boolean method_3153() {
      int var2;
      label24: {
         String[] var1 = class_752.method_4253();
         String var10000 = this.field_2513;
         if(var1 != null) {
            if(this.field_2513 == null) {
               break label24;
            }

            var10000 = this.field_2513;
         }

         var2 = var10000.length();
         if(var1 == null) {
            return (boolean)var2;
         }

         if(var2 > 0) {
            var2 = 1;
            return (boolean)var2;
         }
      }

      var2 = 0;
      return (boolean)var2;
   }

   // $FF: renamed from: b (java.lang.String) void
   public void method_3154(String var1) {
      this.field_2513 = var1;
   }

   // $FF: renamed from: <clinit> () void
   static void method_3108() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "xX6ÀV\'s2\nxa5rúZy#X{(rÚ^fhcÜZz2";
      int var4 = "xX6ÀV\'s2\nxa5rúZy#X{(rÚ^fhcÜZz2".length();
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
                  field_2515 = var5;
                  String[] var10 = field_2515;
                  field_2514 = "CL_00000354";
                  field_2512 = new Random();
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 36;
               break;
            case 1:
               var10009 = 11;
               break;
            case 2:
               var10009 = 89;
               break;
            case 3:
               var10009 = 25;
               break;
            case 4:
               var10009 = 239;
               break;
            case 5:
               var10009 = 121;
               break;
            default:
               var10009 = 171;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}
