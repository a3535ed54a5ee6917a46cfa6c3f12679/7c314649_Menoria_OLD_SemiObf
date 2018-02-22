import ca.diiza.d.class_672;
import ca.diiza.e.class_804;
import ca.diiza.e.class_805;
import ca.diiza.e.class_806;
import com.google.common.base.Charsets;
import com.mojang.authlib.GameProfile;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import net.minecraft.item.ItemSuperBow;

// $FF: renamed from: yz
public abstract class class_792 extends class_752 implements class_20 {

   // $FF: renamed from: bm Af
   public class_666 field_3616;
   // $FF: renamed from: a vP
   private class_1677 field_3617;
   // $FF: renamed from: bn Al
   public class_671 field_3618;
   // $FF: renamed from: bo Al
   public class_671 field_3619;
   // $FF: renamed from: bp Ak
   protected class_670 field_3620;
   // $FF: renamed from: bq int
   protected int field_3621;
   // $FF: renamed from: br float
   public float field_3622;
   // $FF: renamed from: bs float
   public float field_3623;
   // $FF: renamed from: bt int
   public int field_3624;
   // $FF: renamed from: bu double
   public double field_3625;
   // $FF: renamed from: bv double
   public double field_3626;
   // $FF: renamed from: bw double
   public double field_3627;
   // $FF: renamed from: bx double
   public double field_3628;
   // $FF: renamed from: by double
   public double field_3629;
   // $FF: renamed from: bz double
   public double field_3630;
   // $FF: renamed from: bA boolean
   protected boolean field_3631;
   // $FF: renamed from: bB vF
   public class_1661 field_3632;
   // $FF: renamed from: b int
   private int field_3633;
   // $FF: renamed from: bC float
   public float field_3634;
   // $FF: renamed from: cc float
   public float field_3635;
   // $FF: renamed from: bD float
   public float field_3636;
   // $FF: renamed from: c vF
   private class_1661 field_3637;
   // $FF: renamed from: d boolean
   private boolean field_3638;
   // $FF: renamed from: e vF
   private class_1661 field_3639;
   // $FF: renamed from: bE Ae
   public class_665 field_3640;
   // $FF: renamed from: bF int
   public int field_3641;
   // $FF: renamed from: bG int
   public int field_3642;
   // $FF: renamed from: bH float
   public float field_3643;
   // $FF: renamed from: f add
   private add field_3644;
   // $FF: renamed from: g int
   private int field_3645;
   // $FF: renamed from: bI float
   protected float field_3646;
   // $FF: renamed from: bJ float
   protected float field_3647;
   // $FF: renamed from: h int
   private int field_3648;
   // $FF: renamed from: i com.mojang.authlib.GameProfile
   private final GameProfile field_3649;
   // $FF: renamed from: bK xl
   public class_704 field_3650;
   public class_672 contCrafts;
   private static final String __OBFID;
   // $FF: renamed from: db java.lang.String[]
   private static final String[] field_3651;


   // $FF: renamed from: <init> (ahb, com.mojang.authlib.GameProfile) void
   public void method_4554(ahb var1, GameProfile var2) {
      super.method_3847(var1);
      class_666 var10001 = new class_666;
      var10001.method_3592(this);
      this.field_3616 = var10001;
      class_1677 var4 = new class_1677;
      var4.method_9242();
      this.field_3617 = var4;
      class_670 var5 = new class_670;
      var5.method_3631();
      this.field_3620 = var5;
      class_665 var6 = new class_665;
      var6.method_3584();
      this.field_3640 = var6;
      this.field_3646 = 0.1F;
      this.field_3647 = 0.02F;
      this.contCrafts = null;
      this.field_3054 = method_4635(var2);
      this.field_3649 = var2;
      class_680 var7 = new class_680;
      var7.method_3700(this.field_3616, !var1.field_1832, this);
      this.field_3618 = var7;
      this.field_3619 = this.field_3618;
      this.field_3013 = 1.62F;
      class_1661 var3 = var1.method_2187();
      this.method_3887((double)var3.field_8646 + 0.5D, (double)(var3.field_8647 + 1), (double)var3.field_8648 + 0.5D, 0.0F, 0.0F);
      this.field_3343 = 180.0F;
      this.field_3030 = 20;
   }

   // $FF: renamed from: aD () void
   protected void method_4157() {
      super.method_4157();
      this.method_4212().method_9617(class_1840.field_9394).method_390(1.0D);
   }

   // $FF: renamed from: c () void
   protected void method_3848() {
      super.method_3848();
      this.field_3036.method_9497(16, Byte.valueOf((byte)0));
      this.field_3036.method_9497(17, Float.valueOf(0.0F));
      this.field_3036.method_9497(18, Integer.valueOf(0));
   }

   // $FF: renamed from: bw () add
   public add method_4555() {
      return this.field_3644;
   }

   // $FF: renamed from: bx () int
   public int method_4556() {
      return this.field_3645;
   }

   // $FF: renamed from: by () boolean
   public boolean method_4557() {
      return this.field_3644 != null;
   }

   // $FF: renamed from: bz () int
   public int method_4558() {
      String[] var1 = class_752.method_4253();
      int var10000 = this.method_4557();
      if(var1 != null) {
         var10000 = var10000 != 0?this.field_3644.method_3763() - this.field_3645:0;
      }

      return var10000;
   }

   // $FF: renamed from: bA () void
   public void method_4559() {
      String[] var1 = class_752.method_4253();
      class_792 var10000 = this;
      if(var1 != null) {
         if(this.field_3644 != null) {
            this.field_3644.method_3765(this.field_2990, this, this.field_3645);
         }

         var10000 = this;
      }

      var10000.method_4560();
   }

   // $FF: renamed from: bB () void
   public void method_4560() {
      String[] var10000 = class_752.method_4253();
      this.field_3644 = null;
      String[] var1 = var10000;
      this.field_3645 = 0;
      class_792 var2 = this;
      if(var1 != null) {
         if(this.field_2990.field_1832) {
            return;
         }

         var2 = this;
      }

      var2.method_3946(false);
   }

   // $FF: renamed from: bC () boolean
   public boolean method_4561() {
      boolean var2;
      label17: {
         String[] var1 = class_752.method_4253();
         class_792 var10000 = this;
         if(var1 != null) {
            if(!this.method_4557()) {
               break label17;
            }

            var10000 = this;
         }

         if(var10000.field_3644.method_3730().method_2957(this.field_3644) == class_92.field_26) {
            var2 = true;
            return var2;
         }
      }

      var2 = false;
      return var2;
   }

   // $FF: renamed from: h () void
   public void method_3856() {
      String[] var1;
      int var11;
      class_792 var10000;
      label208: {
         var1 = class_752.method_4253();
         var10000 = this;
         if(var1 != null) {
            if(this.field_3644 != null) {
               label204: {
                  add var2 = this.field_3616.method_3593();
                  if(var2 == this.field_3644) {
                     var11 = this.field_3645;
                     if(var1 != null) {
                        label189: {
                           if(this.field_3645 <= 25) {
                              var11 = this.field_3645 % 4;
                              if(var1 == null) {
                                 break label189;
                              }

                              if(var11 == 0) {
                                 this.method_4562(var2, 5);
                              }
                           }

                           var11 = --this.field_3645;
                        }
                     }

                     if(var1 == null) {
                        break label208;
                     }

                     if(var11 != 0) {
                        break label204;
                     }

                     var11 = this.field_2990.field_1832;
                     if(var1 == null) {
                        break label208;
                     }

                     if(this.field_2990.field_1832) {
                        break label204;
                     }

                     this.method_4563();
                     if(var1 != null) {
                        break label204;
                     }
                  }

                  this.method_4560();
               }
            }

            var10000 = this;
         }

         var11 = var10000.field_3624;
      }

      if(var1 != null) {
         if(var11 > 0) {
            --this.field_3624;
         }

         var11 = this.method_4229();
      }

      label182: {
         label212: {
            if(var1 != null) {
               if(var11 != 0) {
                  ++this.field_3633;
                  var11 = this.field_3633;
                  if(var1 != null) {
                     if(this.field_3633 > 100) {
                        this.field_3633 = 100;
                     }

                     var11 = this.field_2990.field_1832;
                  }

                  if(var1 == null) {
                     break label182;
                  }

                  if(var11 != 0) {
                     break label212;
                  }

                  var11 = this.method_4603();
                  if(var1 != null) {
                     if(var11 == 0) {
                        this.method_4602(true, true, false);
                        if(var1 != null) {
                           break label212;
                        }
                     }

                     var11 = this.field_2990.method_2078();
                  }

                  if(var1 == null) {
                     break label182;
                  }

                  if(var11 == 0) {
                     break label212;
                  }

                  this.method_4602(false, true, true);
                  if(var1 != null) {
                     break label212;
                  }
               }

               var11 = this.field_3633;
            }

            if(var1 == null) {
               break label182;
            }

            if(var11 > 0) {
               ++this.field_3633;
               var11 = this.field_3633;
               if(var1 == null) {
                  break label182;
               }

               if(this.field_3633 >= 110) {
                  this.field_3633 = 0;
               }
            }
         }

         super.method_3856();
         var11 = this.field_2990.field_1832;
      }

      label214: {
         if(var1 != null) {
            label215: {
               label151: {
                  if(var11 == 0) {
                     var10000 = this;
                     if(var1 == null) {
                        break label151;
                     }

                     if(this.field_3619 != null) {
                        var11 = this.field_3619.method_3666(this);
                        if(var1 == null) {
                           break label215;
                        }

                        if(var11 == 0) {
                           this.method_4564();
                           this.field_3619 = this.field_3618;
                        }
                     }
                  }

                  var10000 = this;
               }

               if(var1 == null) {
                  break label214;
               }

               var11 = var10000.method_3936();
            }
         }

         if(var11 != 0) {
            var10000 = this;
            if(var1 == null) {
               break label214;
            }

            if(this.field_3640.field_2836) {
               this.method_3861();
            }
         }

         this.field_3625 = this.field_3628;
         this.field_3626 = this.field_3629;
         this.field_3627 = this.field_3630;
         var10000 = this;
      }

      double var10 = var10000.field_2994 - this.field_3628;
      double var4 = this.field_2995 - this.field_3629;
      double var6 = this.field_2996 - this.field_3630;
      double var8 = 10.0D;
      double var12;
      var11 = (var12 = var10 - var8) == 0.0D?0:(var12 < 0.0D?-1:1);
      if(var1 != null) {
         if(var11 > 0) {
            this.field_3625 = this.field_3628 = this.field_2994;
         }

         double var13;
         var11 = (var13 = var6 - var8) == 0.0D?0:(var13 < 0.0D?-1:1);
      }

      if(var1 != null) {
         if(var11 > 0) {
            this.field_3627 = this.field_3630 = this.field_2996;
         }

         double var14;
         var11 = (var14 = var4 - var8) == 0.0D?0:(var14 < 0.0D?-1:1);
      }

      if(var1 != null) {
         if(var11 > 0) {
            this.field_3626 = this.field_3629 = this.field_2995;
         }

         double var15;
         var11 = (var15 = var10 - -var8) == 0.0D?0:(var15 < 0.0D?-1:1);
      }

      if(var1 != null) {
         if(var11 < 0) {
            this.field_3625 = this.field_3628 = this.field_2994;
         }

         double var16;
         var11 = (var16 = var6 - -var8) == 0.0D?0:(var16 < 0.0D?-1:1);
      }

      if(var1 != null) {
         if(var11 < 0) {
            this.field_3627 = this.field_3630 = this.field_2996;
         }

         double var17;
         var11 = (var17 = var4 - -var8) == 0.0D?0:(var17 < 0.0D?-1:1);
      }

      if(var11 < 0) {
         this.field_3626 = this.field_3629 = this.field_2995;
      }

      this.field_3628 += var10 * 0.25D;
      this.field_3630 += var6 * 0.25D;
      this.field_3629 += var4 * 0.25D;
      var10000 = this;
      if(var1 != null) {
         if(this.field_2988 == null) {
            this.field_3639 = null;
         }

         var10000 = this;
      }

      if(var1 != null) {
         if(var10000.field_2990.field_1832) {
            return;
         }

         this.field_3620.method_3634(this);
         var10000 = this;
      }

      var10000.method_4615(class_1698.field_8886, 1);
   }

   // $FF: renamed from: D () int
   public int method_3858() {
      String[] var1 = class_752.method_4253();
      int var10000 = this.field_3640.field_2836;
      if(var1 != null) {
         var10000 = this.field_3640.field_2836?0:80;
      }

      return var10000;
   }

   // $FF: renamed from: H () java.lang.String
   protected String method_3865() {
      String[] var10000 = field_3651;
      return "game.player.swim";
   }

   // $FF: renamed from: O () java.lang.String
   protected String method_3878() {
      String[] var10000 = field_3651;
      return "game.player.swim.splash";
   }

   // $FF: renamed from: ai () int
   public int method_3930() {
      return 10;
   }

   // $FF: renamed from: a (java.lang.String, float, float) void
   public void method_3868(String var1, float var2, float var3) {
      this.field_2990.method_2083(this, var1, var2, var3);
   }

   // $FF: renamed from: c (add, int) void
   protected void method_4562(add var1, int var2) {
      String[] var3 = class_752.method_4253();
      class_92 var10000 = var1.method_3764();
      class_92 var10001 = class_92.field_25;
      String[] var8;
      if(var3 != null) {
         if(var10000 == class_92.field_25) {
            var8 = field_3651;
            this.method_3868("random.drink", 0.5F, this.field_2990.field_1819.nextFloat() * 0.1F + 0.9F);
         }

         var10000 = var1.method_3764();
         var10001 = class_92.field_24;
      }

      if(var10000 == var10001) {
         int var4 = 0;

         while(true) {
            if(var4 < var2) {
               azw var5 = azw.method_5086(((double)this.field_3028.nextFloat() - 0.5D) * 0.1D, Math.random() * 0.1D + 0.1D, 0.0D);
               var5.method_5101(-this.field_3001 * 3.1415927F / 180.0F);
               var5.method_5102(-this.field_3000 * 3.1415927F / 180.0F);
               azw var6 = azw.method_5086(((double)this.field_3028.nextFloat() - 0.5D) * 0.3D, (double)(-this.field_3028.nextFloat()) * 0.6D - 0.3D, 0.6D);
               var6.method_5101(-this.field_3001 * 3.1415927F / 180.0F);
               var6.method_5102(-this.field_3000 * 3.1415927F / 180.0F);
               var6 = var6.method_5093(this.field_2994, this.field_2995 + (double)this.method_3880(), this.field_2996);
               StringBuilder var9 = new StringBuilder();
               var8 = field_3651;
               String var7 = var9.append("iconcrack_").append(adb.method_2918(var1.method_3730())).toString();
               if(var3 == null) {
                  break;
               }

               if(var3 != null) {
                  if(var1.method_3742()) {
                     var7 = var7 + "_" + var1.method_3745();
                  }

                  this.field_2990.method_2087(var7, var6.field_4220, var6.field_4221, var6.field_4222, var5.field_4220, var5.field_4221 + 0.05D, var5.field_4222);
                  ++var4;
               }

               if(var3 != null) {
                  continue;
               }
            }

            String[] var10 = field_3651;
            this.method_3868("random.eat", 0.5F + 0.5F * (float)this.field_3028.nextInt(2), (this.field_3028.nextFloat() - this.field_3028.nextFloat()) * 0.2F + 1.0F);
            break;
         }
      }

   }

   // $FF: renamed from: p () void
   protected void method_4563() {
      String[] var1 = class_752.method_4253();
      add var10000 = this.field_3644;
      if(var1 != null) {
         if(this.field_3644 == null) {
            return;
         }

         this.method_4562(this.field_3644, 16);
         var10000 = this.field_3644;
      }

      class_792 var5;
      label40: {
         label39: {
            int var4;
            label38: {
               int var2 = var10000.field_2958;
               add var3 = this.field_3644.method_3736(this.field_2990, this);
               var10000 = var3;
               if(var1 != null) {
                  if(var3 == this.field_3644) {
                     var10000 = var3;
                     if(var1 != null) {
                        if(var3 == null) {
                           break label39;
                        }

                        var10000 = var3;
                     }

                     var4 = var10000.field_2958;
                     if(var1 == null) {
                        break label38;
                     }

                     if(var4 == var2) {
                        break label39;
                     }
                  }

                  var5 = this;
                  if(var1 == null) {
                     break label40;
                  }

                  this.field_3616.field_2844[this.field_3616.field_2846] = var3;
                  var10000 = var3;
               }

               var4 = var10000.field_2958;
            }

            if(var4 == 0) {
               this.field_3616.field_2844[this.field_3616.field_2846] = null;
            }
         }

         var5 = this;
      }

      var5.method_4560();
   }

   // $FF: renamed from: a (byte) void
   public void method_3932(byte var1) {
      label16: {
         String[] var2 = class_752.method_4253();
         if(var2 != null) {
            if(var1 != 9) {
               break label16;
            }

            this.method_4563();
         }

         if(var2 != null) {
            return;
         }
      }

      super.method_3932(var1);
   }

   // $FF: renamed from: bh () boolean
   protected boolean method_4218() {
      String[] var1 = class_752.method_4253();
      float var2;
      int var10000 = (var2 = this.method_406() - 0.0F) == 0.0F?0:(var2 < 0.0F?-1:1);
      if(var1 != null) {
         if(var10000 > 0) {
            var10000 = this.method_4229();
            if(var1 == null) {
               return (boolean)var10000;
            }

            if(var10000 == 0) {
               var10000 = 0;
               return (boolean)var10000;
            }
         }

         var10000 = 1;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: k () void
   public void method_4564() {
      this.field_3619 = this.field_3618;
   }

   // $FF: renamed from: a (sa) void
   public void method_3925(class_689 var1) {
      String[] var2 = class_752.method_4253();
      class_792 var10000 = this;
      if(var2 != null) {
         if(this.field_2988 != null && var1 == null) {
            label37: {
               Object var3 = this;
               if(var2 != null) {
                  if(!this.field_2990.field_1832) {
                     this.method_4220(this.field_2988);
                  }

                  var10000 = this;
                  if(var2 == null) {
                     break label37;
                  }

                  var3 = this.field_2988;
               }

               if(var3 != null) {
                  this.field_2988.field_2987 = null;
               }

               var10000 = this;
            }

            var10000.field_2988 = null;
            if(var2 != null) {
               return;
            }
         }

         var10000 = this;
      }

      var10000.method_3925(var1);
   }

   // $FF: renamed from: ab () void
   public void method_3921() {
      String[] var1 = class_752.method_4253();
      class_792 var10000 = this;
      if(var1 != null) {
         label27: {
            if(!this.field_2990.field_1832) {
               var10000 = this;
               if(var1 == null) {
                  break label27;
               }

               if(this.method_3938()) {
                  this.method_3925((class_689)null);
                  this.method_3939(false);
                  if(var1 != null) {
                     return;
                  }
               }
            }

            var10000 = this;
         }
      }

      double var2 = var10000.field_2994;
      double var4 = this.field_2995;
      double var6 = this.field_2996;
      float var8 = this.field_3000;
      float var9 = this.field_3001;
      super.method_3921();
      this.field_3622 = this.field_3623;
      this.field_3623 = 0.0F;
      this.method_4617(this.field_2994 - var2, this.field_2995 - var4, this.field_2996 - var6);
      var10000 = this;
      if(var1 != null) {
         if(!(this.field_2988 instanceof class_771)) {
            return;
         }

         this.field_3001 = var9;
         this.field_3000 = var8;
         var10000 = this;
      }

      var10000.field_3330 = ((class_771)this.field_2988).field_3330;
   }

   // $FF: renamed from: A () void
   public void method_3850() {
      this.field_3013 = 1.62F;
      this.method_3852(0.6F, 1.8F);
      super.method_3850();
      this.method_4188(this.method_405());
      this.field_3318 = 0;
   }

   // $FF: renamed from: bq () void
   protected void method_4236() {
      super.method_4236();
      this.method_4210();
   }

   // $FF: renamed from: e () void
   public void method_4231() {
      String[] var1 = class_752.method_4253();
      class_792 var10000 = this;
      if(var1 != null) {
         if(this.field_3621 > 0) {
            --this.field_3621;
         }

         var10000 = this;
      }

      if(var1 != null) {
         label138: {
            if(var10000.field_2990.field_1818 == class_918.field_4627) {
               var10000 = this;
               if(var1 == null) {
                  break label138;
               }

               if(this.method_406() < this.method_405()) {
                  var10000 = this;
                  if(var1 == null) {
                     break label138;
                  }

                  class_1038 var10 = this.field_2990.method_2196();
                  String[] var10001 = field_3651;
                  if(var10.method_5878("naturalRegeneration")) {
                     var10000 = this;
                     if(var1 == null) {
                        break label138;
                     }

                     if(this.field_3029 % 20 * 12 == 0) {
                        this.method_4187(1.0F);
                     }
                  }
               }
            }

            this.field_3616.method_3604();
            this.field_3622 = this.field_3623;
            super.method_4231();
            var10000 = this;
         }
      }

      label143: {
         class_80 var2 = var10000.method_4211(class_1840.field_9393);
         boolean var11 = this.field_2990.field_1832;
         if(var1 != null) {
            if(!this.field_2990.field_1832) {
               var2.method_390((double)this.field_3640.method_3589());
            }

            this.field_3334 = this.field_3647;
            var10000 = this;
            if(var1 == null) {
               break label143;
            }

            var11 = this.method_3940();
         }

         if(var11) {
            this.field_3334 = (float)((double)this.field_3334 + (double)this.field_3647 * 0.3D);
         }

         this.method_4227((float)var2.method_396());
         var10000 = this;
      }

      float var3 = class_1715.method_9558(var10000.field_2997 * this.field_2997 + this.field_2999 * this.field_2999);
      float var4 = (float)Math.atan(-this.field_2998 * 0.20000000298023224D) * 15.0F;
      float var12;
      int var9 = (var12 = var3 - 0.1F) == 0.0F?0:(var12 < 0.0F?-1:1);
      if(var1 != null) {
         if(var9 > 0) {
            var3 = 0.1F;
         }

         var9 = this.field_3005;
      }

      label118: {
         label117: {
            label145: {
               if(var1 != null) {
                  if(var9 == 0) {
                     break label145;
                  }

                  float var13;
                  var9 = (var13 = this.method_406() - 0.0F) == 0.0F?0:(var13 < 0.0F?-1:1);
               }

               if(var1 == null) {
                  break label118;
               }

               if(var9 > 0) {
                  break label117;
               }
            }

            var3 = 0.0F;
         }

         var9 = this.field_3005;
      }

      label105: {
         label104: {
            label146: {
               if(var1 != null) {
                  if(var9 != 0) {
                     break label146;
                  }

                  float var14;
                  var9 = (var14 = this.method_406() - 0.0F) == 0.0F?0:(var14 < 0.0F?-1:1);
               }

               if(var1 == null) {
                  break label105;
               }

               if(var9 > 0) {
                  break label104;
               }
            }

            var4 = 0.0F;
         }

         this.field_3623 += (var3 - this.field_3623) * 0.4F;
         this.field_3327 += (var4 - this.field_3327) * 0.8F;
         float var15;
         var9 = (var15 = this.method_406() - 0.0F) == 0.0F?0:(var15 < 0.0F?-1:1);
      }

      if(var9 > 0) {
         class_1343 var5;
         label90: {
            var5 = null;
            var10000 = this;
            if(var1 != null) {
               label88: {
                  if(this.field_2988 != null) {
                     var10000 = this;
                     if(var1 == null) {
                        break label88;
                     }

                     if(!this.field_2988.field_3012) {
                        var5 = this.field_3004.method_7098(this.field_2988.field_3004).method_7097(1.0D, 0.0D, 1.0D);
                        break label90;
                     }
                  }

                  var10000 = this;
               }
            }

            var5 = var10000.field_3004.method_7097(1.0D, 0.5D, 1.0D);
         }

         List var6 = this.field_2990.method_2155(this, var5);
         if(var6 != null) {
            int var7 = 0;

            while(var7 < var6.size()) {
               class_689 var8 = (class_689)var6.get(var7);
               if(var1 != null) {
                  if(!var8.field_3012) {
                     this.method_4565(var8);
                  }

                  ++var7;
               }

               if(var1 == null) {
                  break;
               }
            }
         }
      }

   }

   // $FF: renamed from: d (sa) void
   private void method_4565(class_689 var1) {
      var1.method_3892(this);
   }

   // $FF: renamed from: bD () int
   public int method_4566() {
      return this.field_3036.method_9501(18);
   }

   // $FF: renamed from: c (int) void
   public void method_4567(int var1) {
      this.field_3036.method_9506(18, Integer.valueOf(var1));
   }

   // $FF: renamed from: s (int) void
   public void method_4568(int var1) {
      int var2 = this.method_4566();
      this.field_3036.method_9506(18, Integer.valueOf(var2 + var1));
   }

   // $FF: renamed from: a (vX) void
   public void method_4190(class_1691 var1) {
      String[] var2;
      label31: {
         class_792 var6;
         label34: {
            String[] var10000 = class_752.method_4253();
            super.method_4190(var1);
            var2 = var10000;
            this.method_3852(0.2F, 0.2F);
            this.method_3854(this.field_2994, this.field_2995, this.field_2996);
            this.field_2998 = 0.10000000149011612D;
            String var4 = this.method_64();
            String[] var3 = field_3651;
            boolean var5 = var4.equals("Notch");
            if(var2 != null) {
               if(var5) {
                  add var10001 = new add;
                  var10001.method_3725(class_1010.field_5118, 1);
                  this.method_4571(var10001, true, false);
               }

               var6 = this;
               if(var2 == null) {
                  break label34;
               }

               class_1038 var7 = this.field_2990.method_2196();
               String[] var8 = field_3651;
               var5 = var7.method_5878("keepInventory");
            }

            if(var5) {
               break label31;
            }

            var6 = this;
         }

         var6.field_3616.method_3615();
      }

      label20: {
         if(var1 != null) {
            this.field_2997 = (double)(-class_1715.method_9556((this.field_3317 + this.field_3000) * 3.1415927F / 180.0F) * 0.1F);
            this.field_2999 = (double)(-class_1715.method_9555((this.field_3317 + this.field_3000) * 3.1415927F / 180.0F) * 0.1F);
            if(var2 != null) {
               break label20;
            }
         }

         this.field_2997 = this.field_2999 = 0.0D;
      }

      this.field_3013 = 0.1F;
      this.method_4615(class_1698.field_8901, 1);
   }

   // $FF: renamed from: aT () java.lang.String
   protected String method_4193() {
      String[] var10000 = field_3651;
      return "game.player.hurt";
   }

   // $FF: renamed from: aU () java.lang.String
   protected String method_4194() {
      String[] var10000 = field_3651;
      return "game.player.die";
   }

   // $FF: renamed from: b (sa, int) void
   public void method_3899(class_689 var1, int var2) {
      String[] var3;
      Collection var4;
      label27: {
         label26: {
            this.method_4568(var2);
            String[] var10000 = class_752.method_4253();
            var4 = this.method_4634().method_7162(class_34.field_5);
            var3 = var10000;
            boolean var8 = var1 instanceof class_792;
            if(var3 != null) {
               if(!var8) {
                  break label26;
               }

               this.method_4615(class_1698.field_8904, 1);
               var4.addAll(this.method_4634().method_7162(class_34.field_4));
            }

            if(var3 != null) {
               break label27;
            }
         }

         this.method_4615(class_1698.field_8902, 1);
      }

      Iterator var5 = var4.iterator();

      while(var5.hasNext()) {
         class_1344 var6 = (class_1344)var5.next();
         class_1345 var7 = this.method_4634().method_7163(this.method_64(), var6);
         var7.writeText1();
         if(var3 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: a (boolean) xq
   public class_699 method_4569(boolean var1) {
      String[] var2 = class_752.method_4253();
      int var3;
      if(var1) {
         label24: {
            add var10003 = this.field_3616.method_3593();
            if(var2 != null) {
               if(var10003 == null) {
                  break label24;
               }

               var10003 = this.field_3616.method_3593();
            }

            var3 = var10003.field_2958;
            return this.method_4571(this.field_3616.method_85(this.field_3616.field_2846, var3), false, true);
         }
      }

      var3 = 1;
      return this.method_4571(this.field_3616.method_85(this.field_3616.field_2846, var3), false, true);
   }

   // $FF: renamed from: a (add, boolean) xq
   public class_699 method_4570(add var1, boolean var2) {
      return this.method_4571(var1, false, false);
   }

   // $FF: renamed from: a (add, boolean, boolean) xq
   public class_699 method_4571(add var1, boolean var2, boolean var3) {
      String[] var4 = class_752.method_4253();
      add var10000 = var1;
      if(var4 != null) {
         if(var1 == null) {
            return null;
         }

         var10000 = var1;
      }

      if(var10000.field_2958 == 0) {
         return null;
      } else {
         class_699 var5;
         label34: {
            class_699 var9 = new class_699;
            var9.method_4025(this.field_2990, this.field_2994, this.field_2995 - 0.30000001192092896D + (double)this.method_3880(), this.field_2996, var1);
            var5 = var9;
            var9 = var5;
            if(var4 != null) {
               var5.field_3093 = 40;
               if(!var3) {
                  break label34;
               }

               var9 = var5;
            }

            var9.method_4035(this.method_64());
         }

         label28: {
            float var6 = 0.1F;
            float var7;
            if(var4 != null) {
               if(var2) {
                  var7 = this.field_3028.nextFloat() * 0.5F;
                  float var8 = this.field_3028.nextFloat() * 3.1415927F * 2.0F;
                  var5.field_2997 = (double)(-class_1715.method_9555(var8) * var7);
                  var5.field_2999 = (double)(class_1715.method_9556(var8) * var7);
                  var5.field_2998 = 0.20000000298023224D;
                  if(var4 != null) {
                     break label28;
                  }
               }

               var6 = 0.3F;
               var5.field_2997 = (double)(-class_1715.method_9555(this.field_3000 / 180.0F * 3.1415927F) * class_1715.method_9556(this.field_3001 / 180.0F * 3.1415927F) * var6);
               var5.field_2999 = (double)(class_1715.method_9556(this.field_3000 / 180.0F * 3.1415927F) * class_1715.method_9556(this.field_3001 / 180.0F * 3.1415927F) * var6);
               var5.field_2998 = (double)(-class_1715.method_9555(this.field_3001 / 180.0F * 3.1415927F) * var6 + 0.1F);
               var6 = 0.02F;
            }

            var7 = this.field_3028.nextFloat() * 3.1415927F * 2.0F;
            var6 *= this.field_3028.nextFloat();
            var5.field_2997 += Math.cos((double)var7) * (double)var6;
            var5.field_2998 += (double)((this.field_3028.nextFloat() - this.field_3028.nextFloat()) * 0.1F);
            var5.field_2999 += Math.sin((double)var7) * (double)var6;
         }

         this.method_4572(var5);
         this.method_4615(class_1698.field_8898, 1);
         return var5;
      }
   }

   // $FF: renamed from: a (xq) void
   protected void method_4572(class_699 var1) {
      this.field_2990.method_2089(var1);
   }

   // $FF: renamed from: a (aji, boolean) float
   public float method_4573(aji var1, boolean var2) {
      String[] var10000 = class_752.method_4253();
      float var4 = this.field_3616.method_3608(var1);
      String[] var3 = var10000;
      float var10;
      int var8 = (var10 = var4 - 1.0F) == 0.0F?0:(var10 < 0.0F?-1:1);
      if(var3 != null) {
         label72: {
            if(var8 > 0) {
               int var5 = class_980.method_5654(this);
               add var6 = this.field_3616.method_3593();
               var8 = var5;
               if(var3 == null) {
                  break label72;
               }

               if(var5 > 0 && var6 != null) {
                  label65: {
                     float var9;
                     float var10001;
                     label64: {
                        float var7;
                        label63: {
                           var7 = (float)(var5 * var5 + 1);
                           var8 = var6.method_3752(var1);
                           if(var3 != null) {
                              if(var8 != 0) {
                                 break label63;
                              }

                              var9 = var4;
                              var10001 = 1.0F;
                              if(var3 == null) {
                                 break label64;
                              }

                              float var11;
                              var8 = (var11 = var4 - 1.0F) == 0.0F?0:(var11 < 0.0F?-1:1);
                           }

                           if(var8 <= 0) {
                              var4 += var7 * 0.08F;
                              if(var3 != null) {
                                 break label65;
                              }
                           }
                        }

                        var9 = var4;
                        var10001 = var7;
                     }

                     var4 = var9 + var10001;
                  }
               }
            }

            var8 = this.method_4177(class_1635.field_8493);
         }
      }

      if(var3 != null) {
         if(var8 != 0) {
            var4 *= 1.0F + (float)(this.method_4178(class_1635.field_8493).method_9018() + 1) * 0.2F;
         }

         var8 = this.method_4177(class_1635.field_8494);
      }

      if(var3 != null) {
         if(var8 != 0) {
            var4 *= 1.0F - (float)(this.method_4178(class_1635.field_8494).method_9018() + 1) * 0.2F;
         }

         var8 = this.method_3879(awt.field_4177);
      }

      if(var3 != null) {
         label47: {
            if(var8 != 0) {
               var8 = class_980.method_5660(this);
               if(var3 == null) {
                  break label47;
               }

               if(var8 == 0) {
                  var4 /= 5.0F;
               }
            }

            var8 = this.field_3005;
         }
      }

      if(var8 == 0) {
         var4 /= 5.0F;
      }

      return var4;
   }

   // $FF: renamed from: a (aji) boolean
   public boolean method_4574(aji var1) {
      return this.field_3616.method_3611(var1);
   }

   // $FF: renamed from: a (ro) void
   public void method_3908(class_1583 var1) {
      super.method_3908(var1);
      this.field_3054 = method_4635(this.field_3649);
      String[] var5 = field_3651;
      class_1580 var3 = var1.method_8689("Inventory", 10);
      this.field_3616.method_3610(var3);
      this.field_3616.field_2846 = var1.method_8681("SelectedItemSlot");
      String[] var10000 = class_752.method_4253();
      this.field_3631 = var1.method_8690("Sleeping");
      this.field_3633 = var1.method_8680("SleepTimer");
      this.field_3643 = var1.method_8683("XpP");
      this.field_3641 = var1.method_8681("XpLevel");
      String[] var2 = var10000;
      this.field_3642 = var1.method_8681("XpTotal");
      this.method_4567(var1.method_8681("Score"));
      boolean var6 = this.field_3631;
      class_1661 var10001;
      if(var2 != null) {
         if(this.field_3631) {
            var10001 = new class_1661;
            var10001.method_9151(class_1715.method_9561(this.field_2994), class_1715.method_9561(this.field_2995), class_1715.method_9561(this.field_2996));
            this.field_3632 = var10001;
            this.method_4602(true, true, false);
         }

         var5 = field_3651;
         var6 = var1.initGui8("SpawnX", 99);
      }

      String var7;
      class_1583 var8;
      byte var10002;
      label45: {
         if(var2 != null) {
            label46: {
               if(var6) {
                  var5 = field_3651;
                  var6 = var1.initGui8("SpawnY", 99);
                  if(var2 == null) {
                     break label46;
                  }

                  if(var6) {
                     var6 = var1.initGui8("SpawnZ", 99);
                     if(var2 == null) {
                        break label46;
                     }

                     if(var6) {
                        var10001 = new class_1661;
                        var10001.method_9151(var1.method_8681("SpawnX"), var1.method_8681("SpawnY"), var1.method_8681("SpawnZ"));
                        this.field_3637 = var10001;
                        this.field_3638 = var1.method_8690("SpawnForced");
                     }
                  }
               }

               this.field_3620.method_3635(var1);
               this.field_3640.method_3586(var1);
               var8 = var1;
               var5 = field_3651;
               var7 = "EnderItems";
               var10002 = 9;
               if(var2 == null) {
                  break label45;
               }

               var6 = var1.initGui8("EnderItems", 9);
            }
         }

         if(!var6) {
            return;
         }

         var8 = var1;
         String[] var9 = field_3651;
         var7 = "EnderItems";
         var10002 = 10;
      }

      class_1580 var4 = var8.method_8689(var7, var10002);
      this.field_3617.method_9244(var4);
   }

   // $FF: renamed from: b (ro) void
   public void method_3909(class_1583 var1) {
      String[] var10000 = class_752.method_4253();
      super.method_3909(var1);
      String[] var3 = field_3651;
      class_666 var10003 = this.field_3616;
      class_1580 var10004 = new class_1580;
      var10004.method_8628();
      var1.method_8664("Inventory", var10003.method_3609(var10004));
      var1.method_8667("SelectedItemSlot", this.field_3616.field_2846);
      var1.initGui4("Sleeping", this.field_3631);
      var1.method_8666("SleepTimer", (short)this.field_3633);
      var1.method_8669("XpP", this.field_3643);
      var1.method_8667("XpLevel", this.field_3641);
      String[] var2 = var10000;
      var1.method_8667("XpTotal", this.field_3642);
      var1.method_8667("Score", this.method_4566());
      class_792 var4 = this;
      if(var2 != null) {
         if(this.field_3637 != null) {
            var1.method_8667("SpawnX", this.field_3637.field_8646);
            var1.method_8667("SpawnY", this.field_3637.field_8647);
            var1.method_8667("SpawnZ", this.field_3637.field_8648);
            var1.initGui4("SpawnForced", this.field_3638);
         }

         this.field_3620.method_3636(var1);
         var4 = this;
      }

      var4.field_3640.method_3585(var1);
      String[] var10001 = field_3651;
      var1.method_8664("EnderItems", this.field_3617.method_9245());
   }

   // $FF: renamed from: a (vI) void
   public void method_4575(class_22 var1) {}

   // $FF: renamed from: a (gv) void
   public void method_4576(class_585 var1) {}

   // $FF: renamed from: a (xv) void
   public void method_4577(class_696 var1) {}

   // $FF: renamed from: a (wR, vI) void
   public void method_4578(class_772 var1, class_22 var2) {}

   // $FF: renamed from: a (int, int, int, java.lang.String) void
   public void method_4579(int var1, int var2, int var3, String var4) {}

   // $FF: renamed from: c (int, int, int) void
   public void method_4580(int var1, int var2, int var3) {}

   // $FF: renamed from: b (int, int, int) void
   public void method_4581(int var1, int var2, int var3) {}

   // $FF: renamed from: g () float
   public float method_3880() {
      return 0.12F;
   }

   // $FF: renamed from: e_ () void
   protected void method_4582() {
      this.field_3013 = 1.62F;
   }

   // $FF: renamed from: a (vX, float) boolean
   public boolean method_3896(class_1691 var1, float var2) {
      String[] var3 = class_752.method_4253();
      int var10000 = this.method_3961();
      if(var3 != null) {
         if(var10000 != 0) {
            return false;
         }

         var10000 = this.field_3640.field_2836;
      }

      if(var3 != null) {
         label151: {
            if(var10000 != 0) {
               var10000 = var1.method_9341();
               if(var3 == null) {
                  break label151;
               }

               if(var10000 == 0) {
                  return false;
               }
            }

            this.field_3338 = 0;
            float var8;
            var10000 = (var8 = this.method_406() - 0.0F) == 0.0F?0:(var8 < 0.0F?-1:1);
         }
      }

      if(var3 != null) {
         if(var10000 <= 0) {
            return false;
         }

         var10000 = this.method_4229();
      }

      if(var3 != null) {
         label143: {
            if(var10000 != 0) {
               var10000 = this.field_2990.field_1832;
               if(var3 == null) {
                  break label143;
               }

               if(!this.field_2990.field_1832) {
                  this.method_4602(true, true, false);
               }
            }

            var10000 = var1.method_9354();
         }
      }

      if(var3 != null) {
         if(var10000 != 0) {
            class_918 var7 = this.field_2990.field_1818;
            class_918 var10001 = class_918.field_4627;
            if(var3 != null) {
               if(this.field_2990.field_1818 == class_918.field_4627) {
                  var2 = 0.0F;
               }

               var7 = this.field_2990.field_1818;
               var10001 = class_918.field_4628;
            }

            if(var3 != null) {
               if(var7 == var10001) {
                  var2 = var2 / 2.0F + 1.0F;
               }

               var7 = this.field_2990.field_1818;
               var10001 = class_918.field_4630;
            }

            if(var7 == var10001) {
               var2 = var2 * 3.0F / 2.0F;
            }
         }

         float var9;
         var10000 = (var9 = var2 - 0.0F) == 0.0F?0:(var9 < 0.0F?-1:1);
      }

      if(var3 != null) {
         if(var10000 != 0) {
            boolean var5;
            label157: {
               class_689 var4 = var1.method_9345();
               var5 = var4 instanceof class_713;
               class_689 var6;
               if(var3 != null) {
                  label128: {
                     if(var5) {
                        var6 = ((class_713)var4).field_3194;
                        if(var3 == null) {
                           break label128;
                        }

                        if(((class_713)var4).field_3194 != null) {
                           var4 = ((class_713)var4).field_3194;
                           if(var3 != null) {
                              break label157;
                           }
                        }
                     }

                     var6 = var4;
                  }

                  var5 = var6 instanceof class_806;
               }

               if(var3 != null) {
                  label117: {
                     if(var5) {
                        var6 = ((class_806)var4).field_3779;
                        if(var3 == null) {
                           break label117;
                        }

                        if(((class_806)var4).field_3779 != null) {
                           var4 = ((class_806)var4).field_3779;
                           if(var3 != null) {
                              break label157;
                           }
                        }
                     }

                     var6 = var4;
                  }

                  var5 = var6 instanceof class_804;
               }

               if(var3 != null) {
                  label106: {
                     if(var5) {
                        var6 = ((class_804)var4).field_3748;
                        if(var3 == null) {
                           break label106;
                        }

                        if(((class_804)var4).field_3748 != null) {
                           var4 = ((class_804)var4).field_3748;
                           if(var3 != null) {
                              break label157;
                           }
                        }
                     }

                     var6 = var4;
                  }

                  var5 = var6 instanceof class_805;
               }

               if(var3 == null) {
                  return var5;
               }

               if(var5) {
                  var6 = ((class_805)var4).field_3763;
                  if(var3 != null && ((class_805)var4).field_3763 != null) {
                     var6 = ((class_805)var4).field_3763;
                  }
               }
            }

            this.method_4615(class_1698.field_8900, Math.round(var2 * 10.0F));
            var5 = super.method_3896(var1, var2);
            return var5;
         }

         var10000 = 0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: a (yz) boolean
   public boolean method_4583(class_792 var1) {
      String[] var10000 = class_752.method_4253();
      class_1350 var3 = this.method_4247();
      class_1350 var4 = var1.method_4247();
      String[] var2 = var10000;
      class_1350 var5 = var3;
      boolean var6;
      if(var2 != null) {
         if(var3 == null) {
            var6 = true;
            return var6;
         }

         var5 = var3;
      }

      if(var2 != null) {
         if(!var5.method_7295(var4)) {
            var6 = true;
            return var6;
         }

         var5 = var3;
      }

      var6 = var5.method_7299();
      return var6;
   }

   // $FF: renamed from: h (float) void
   protected void method_4200(float var1) {
      this.field_3616.method_3614(var1);
   }

   // $FF: renamed from: aV () int
   public int method_4199() {
      return this.field_3616.method_3613();
   }

   // $FF: renamed from: bE () float
   public float method_4584() {
      int var2 = 0;
      String[] var1 = class_752.method_4253();
      add[] var3 = this.field_3616.field_2845;
      int var4 = var3.length;
      int var5 = 0;

      while(var5 < var4) {
         add var6 = var3[var5];
         if(var1 != null) {
            if(var6 != null) {
               ++var2;
            }

            ++var5;
         }

         if(var1 == null) {
            break;
         }
      }

      return (float)var2 / (float)this.field_3616.field_2845.length;
   }

   // $FF: renamed from: d (vX, float) void
   protected void method_4203(class_1691 var1, float var2) {
      String[] var3 = class_752.method_4253();
      boolean var10000 = this.method_3961();
      if(var3 != null) {
         if(var10000) {
            return;
         }

         var10000 = var1.method_9339();
      }

      float var7;
      label41: {
         class_792 var6;
         label40: {
            label39: {
               if(var3 != null) {
                  if(var10000) {
                     break label39;
                  }

                  var6 = this;
                  if(var3 == null) {
                     break label40;
                  }

                  var10000 = this.method_4561();
               }

               if(var10000) {
                  var7 = var2;
                  if(var3 == null) {
                     break label41;
                  }

                  if(var2 > 0.0F) {
                     var2 = (1.0F + var2) * 0.5F;
                  }
               }
            }

            var2 = this.method_4201(var1, var2);
            var6 = this;
         }

         var2 = var6.method_4202(var1, var2);
         var7 = var2;
      }

      float var4 = var7;
      var2 = Math.max(var2 - this.method_4245(), 0.0F);
      this.method_4246(this.method_4245() - (var4 - var2));
      var7 = var2;
      if(var3 != null) {
         if(var2 == 0.0F) {
            return;
         }

         this.method_4622(var1.method_9340());
         var7 = this.method_406();
      }

      float var5 = var7;
      this.method_4188(this.method_406() - var2);
      this.method_4204().method_9313(var1, var5, var2);
   }

   // $FF: renamed from: a (gq) void
   public void method_4585(class_589 var1) {}

   // $FF: renamed from: a (gi) void
   public void method_4586(class_580 var1) {}

   // $FF: renamed from: a (c7) void
   public void method_4587(class_926 var1) {}

   // $FF: renamed from: a (gl) void
   public void method_4588(class_595 var1) {}

   // $FF: renamed from: a (gk) void
   public void method_4589(class_596 var1) {}

   // $FF: renamed from: a (c5, java.lang.String) void
   public void method_4590(class_18 var1, String var2) {}

   // $FF: renamed from: b (add) void
   public void method_4591(add var1) {}

   // $FF: renamed from: q (sa) boolean
   public boolean method_4592(class_689 var1) {
      add var3 = this.method_4593();
      String[] var2 = class_752.method_4253();
      add var10000 = var3;
      if(var2 != null) {
         var10000 = var3 != null?var3.method_3754():null;
      }

      add var4 = var10000;
      int var6;
      if(!var1.method_3919(this)) {
         boolean var5;
         if(var3 != null) {
            var5 = var1 instanceof class_752;
            if(var2 == null) {
               return var5;
            }

            if(var5) {
               var5 = this.field_3640.field_2839;
               if(var2 != null) {
                  if(this.field_3640.field_2839) {
                     var3 = var4;
                  }

                  var5 = var3.method_3753(this, (class_752)var1);
               }

               if(var2 == null) {
                  return var5;
               }

               if(var5) {
                  var6 = var3.field_2958;
                  if(var2 != null) {
                     if(var3.field_2958 <= 0) {
                        var6 = this.field_3640.field_2839;
                        if(var2 == null) {
                           return (boolean)var6;
                        }

                        if(!this.field_3640.field_2839) {
                           this.method_4594();
                        }
                     }

                     var6 = 1;
                  }

                  return (boolean)var6;
               }
            }
         }

         var5 = false;
         return var5;
      } else {
         label105: {
            var10000 = var3;
            if(var2 != null) {
               if(var3 == null) {
                  break label105;
               }

               var10000 = var3;
            }

            if(var2 != null) {
               if(var10000 != this.method_4593()) {
                  break label105;
               }

               var10000 = var3;
            }

            var6 = var10000.field_2958;
            if(var2 != null) {
               label87: {
                  if(var6 <= 0) {
                     var6 = this.field_3640.field_2839;
                     if(var2 == null) {
                        break label87;
                     }

                     if(!this.field_3640.field_2839) {
                        this.method_4594();
                        if(var2 != null) {
                           break label105;
                        }
                     }
                  }

                  var6 = var3.field_2958;
               }
            }

            if(var2 == null) {
               return (boolean)var6;
            }

            if(var6 < var4.field_2958) {
               var6 = this.field_3640.field_2839;
               if(var2 == null) {
                  return (boolean)var6;
               }

               if(this.field_3640.field_2839) {
                  var3.field_2958 = var4.field_2958;
               }
            }
         }

         var6 = 1;
         return (boolean)var6;
      }
   }

   // $FF: renamed from: bF () add
   public add method_4593() {
      return this.field_3616.method_3593();
   }

   // $FF: renamed from: bG () void
   public void method_4594() {
      this.field_3616.method_87(this.field_3616.field_2846, (add)null);
   }

   // $FF: renamed from: ad () double
   public double method_3923() {
      return (double)(this.field_3013 - 0.5F);
   }

   // $FF: renamed from: r (sa) void
   public void method_4595(class_689 var1) {
      String[] var2 = class_752.method_4253();
      boolean var10000 = var1.method_3959();
      if(var2 != null) {
         if(!var10000) {
            return;
         }

         var10000 = var1.method_3960(this);
      }

      if(!var10000) {
         float var3 = (float)this.method_4211(class_1840.field_9394).method_396();
         int var4 = 0;
         float var5 = 0.0F;
         int var13 = var1 instanceof class_752;
         if(var2 != null) {
            if(var13 != 0) {
               var5 = class_980.method_5647(this, (class_752)var1);
               var4 += class_980.method_5651(this, (class_752)var1);
            }

            var13 = this.method_3940();
         }

         if(var2 != null) {
            if(var13 != 0) {
               ++var4;
            }

            float var18;
            var13 = (var18 = var3 - 0.0F) == 0.0F?0:(var18 < 0.0F?-1:1);
         }

         if(var2 != null) {
            label244: {
               if(var13 <= 0) {
                  float var19;
                  var13 = (var19 = var5 - 0.0F) == 0.0F?0:(var19 < 0.0F?-1:1);
                  if(var2 == null) {
                     break label244;
                  }

                  if(var13 <= 0) {
                     return;
                  }
               }

               float var20;
               var13 = (var20 = this.field_3019 - 0.0F) == 0.0F?0:(var20 < 0.0F?-1:1);
            }
         }

         byte var15;
         label236: {
            label258: {
               if(var2 != null) {
                  if(var13 <= 0) {
                     break label258;
                  }

                  var13 = this.field_3005;
               }

               if(var2 != null) {
                  if(var13 != 0) {
                     break label258;
                  }

                  var13 = this.method_4197();
               }

               if(var2 != null) {
                  if(var13 != 0) {
                     break label258;
                  }

                  var13 = this.method_3876();
               }

               Object var14;
               label259: {
                  if(var2 != null) {
                     if(var13 != 0) {
                        break label258;
                     }

                     var14 = this;
                     if(var2 == null) {
                        break label259;
                     }

                     var13 = this.method_4177(class_1635.field_8505);
                  }

                  if(var13 != 0) {
                     break label258;
                  }

                  var14 = this.field_2988;
               }

               if(var2 != null) {
                  if(var14 != null) {
                     break label258;
                  }

                  var14 = var1;
               }

               var15 = var14 instanceof class_752;
               if(var2 == null) {
                  break label236;
               }

               if(var15 != 0) {
                  var15 = 1;
                  break label236;
               }
            }

            var15 = 0;
         }

         byte var6 = var15;
         var13 = var6;
         if(var2 != null) {
            label198: {
               if(var6 != 0) {
                  float var21;
                  var13 = (var21 = var3 - 0.0F) == 0.0F?0:(var21 < 0.0F?-1:1);
                  if(var2 == null) {
                     break label198;
                  }

                  if(var13 > 0) {
                     var3 *= 1.5F;
                  }
               }

               var3 += var5;
               var13 = 0;
            }
         }

         int var7 = var13;
         int var8 = class_980.method_5652(this);
         var13 = var1 instanceof class_752;
         if(var2 != null) {
            label191: {
               if(var13 != 0) {
                  var13 = var8;
                  if(var2 == null) {
                     break label191;
                  }

                  if(var8 > 0) {
                     var13 = var1.method_3936();
                     if(var2 == null) {
                        break label191;
                     }

                     if(var13 == 0) {
                        var7 = 1;
                        var1.method_3860(1);
                     }
                  }
               }

               var13 = var1.method_3896(class_1691.method_9325(this), var3);
            }
         }

         int var9 = var13;
         var13 = var9;
         if(var2 != null) {
            if(var9 != 0) {
               var13 = var4;
               if(var2 != null) {
                  if(var4 > 0) {
                     var1.method_3894((double)(-class_1715.method_9555(this.field_3000 * 3.1415927F / 180.0F) * (float)var4 * 0.5F), 0.1D, (double)(class_1715.method_9556(this.field_3000 * 3.1415927F / 180.0F) * (float)var4 * 0.5F));
                     this.field_2997 *= 0.6D;
                     this.field_2999 *= 0.6D;
                     this.method_3941(false);
                  }

                  var13 = var6;
               }

               if(var2 != null) {
                  if(var13 != 0) {
                     this.method_4596(var1);
                  }

                  float var22;
                  var13 = (var22 = var5 - 0.0F) == 0.0F?0:(var22 < 0.0F?-1:1);
               }

               if(var2 != null) {
                  if(var13 > 0) {
                     this.method_4597(var1);
                  }

                  float var23;
                  var13 = (var23 = var3 - 18.0F) == 0.0F?0:(var23 < 0.0F?-1:1);
               }

               label263: {
                  if(var2 != null) {
                     if(var13 >= 0) {
                        this.method_4614(class_1600.field_8356);
                     }

                     this.method_4171(var1);
                     if(var2 == null) {
                        break label263;
                     }

                     var13 = var1 instanceof class_752;
                  }

                  if(var13 != 0) {
                     class_980.method_5649((class_752)var1, this);
                  }

                  class_980.method_5650(this, var1);
               }

               add var10;
               Object var11;
               label265: {
                  var10 = this.method_4593();
                  var11 = var1;
                  class_689 var16 = var1;
                  if(var2 != null) {
                     if(!(var1 instanceof class_706)) {
                        break label265;
                     }

                     var16 = var1;
                  }

                  class_86 var12 = ((class_706)var16).field_3157;
                  class_86 var17 = var12;
                  if(var2 != null) {
                     if(var12 == null) {
                        break label265;
                     }

                     var17 = var12;
                  }

                  if(var2 != null) {
                     if(!(var17 instanceof class_752)) {
                        break label265;
                     }

                     var17 = var12;
                  }

                  var11 = (class_752)var17;
               }

               label146: {
                  if(var10 != null) {
                     var13 = var11 instanceof class_752;
                     if(var2 == null) {
                        break label146;
                     }

                     if(var13 != 0) {
                        var10.method_3750((class_752)var11, this);
                        var13 = var10.field_2958;
                        if(var2 == null) {
                           break label146;
                        }

                        if(var10.field_2958 <= 0) {
                           this.method_4594();
                        }
                     }
                  }

                  var13 = var1 instanceof class_752;
               }

               label138: {
                  label137: {
                     if(var2 != null) {
                        if(var13 == 0) {
                           break label137;
                        }

                        this.method_4615(class_1698.field_8899, Math.round(var3 * 10.0F));
                        if(var2 == null) {
                           break label138;
                        }

                        var13 = var8;
                     }

                     if(var13 > 0) {
                        var1.method_3860(var8 * 4);
                     }
                  }

                  this.method_4622(0.3F);
               }

               if(var2 != null) {
                  return;
               }
            }

            var13 = var7;
         }

         if(var13 != 0) {
            var1.method_3861();
         }
      }

   }

   // $FF: renamed from: b (sa) void
   public void method_4596(class_689 var1) {}

   // $FF: renamed from: c (sa) void
   public void method_4597(class_689 var1) {}

   // $FF: renamed from: bH () void
   public void method_4598() {}

   // $FF: renamed from: B () void
   public void method_3851() {
      String[] var10000 = class_752.method_4253();
      super.method_3851();
      this.field_3618.method_3658(this);
      String[] var1 = var10000;
      class_671 var2 = this.field_3619;
      if(var1 != null) {
         if(this.field_3619 == null) {
            return;
         }

         var2 = this.field_3619;
      }

      var2.method_3658(this);
   }

   // $FF: renamed from: aa () boolean
   public boolean method_3918() {
      boolean var10000;
      label24: {
         String[] var1 = class_752.method_4253();
         var10000 = this.field_3631;
         if(var1 != null) {
            if(this.field_3631) {
               break label24;
            }

            var10000 = super.method_3918();
         }

         if(var1 == null) {
            return var10000;
         }

         if(var10000) {
            var10000 = true;
            return var10000;
         }
      }

      var10000 = false;
      return var10000;
   }

   // $FF: renamed from: bJ () com.mojang.authlib.GameProfile
   public GameProfile method_4599() {
      return this.field_3649;
   }

   // $FF: renamed from: a (int, int, int) ax
   public class_931 method_4600(int var1, int var2, int var3) {
      String[] var4 = class_752.method_4253();
      boolean var10000 = this.field_2990.field_1832;
      if(var4 != null) {
         label128: {
            if(!this.field_2990.field_1832) {
               double var15;
               label152: {
                  int var14 = this.method_4229();
                  if(var4 != null) {
                     if(var14 != 0) {
                        return class_931.field_4748;
                     }

                     var14 = this.method_3917();
                  }

                  if(var4 != null) {
                     if(var14 == 0) {
                        return class_931.field_4748;
                     }

                     var14 = this.field_2990.field_1820.method_6168();
                  }

                  if(var4 != null) {
                     if(var14 == 0) {
                        return class_931.field_4745;
                     }

                     var14 = this.field_2990.method_2078();
                  }

                  if(var4 != null) {
                     if(var14 != 0) {
                        return class_931.field_4746;
                     }

                     double var16;
                     var14 = (var16 = Math.abs(this.field_2994 - (double)var1) - 3.0D) == 0.0D?0:(var16 < 0.0D?-1:1);
                  }

                  if(var4 != null) {
                     if(var14 > 0) {
                        return class_931.field_4747;
                     }

                     double var17;
                     var14 = (var17 = Math.abs(this.field_2995 - (double)var2) - 2.0D) == 0.0D?0:(var17 < 0.0D?-1:1);
                  }

                  if(var4 != null) {
                     if(var14 > 0) {
                        return class_931.field_4747;
                     }

                     var15 = Math.abs(this.field_2996 - (double)var3);
                     if(var4 == null) {
                        break label152;
                     }

                     double var18;
                     var14 = (var18 = var15 - 3.0D) == 0.0D?0:(var18 < 0.0D?-1:1);
                  }

                  if(var14 > 0) {
                     return class_931.field_4747;
                  }

                  var15 = 8.0D;
               }

               double var5 = var15;
               double var7 = 5.0D;
               List var9 = this.field_2990.method_2157(class_779.class, class_1343.method_7093((double)var1 - var5, (double)var2 - var7, (double)var3 - var5, (double)var1 + var5, (double)var2 + var7, (double)var3 + var5));
               var10000 = var9.isEmpty();
               if(var4 == null) {
                  break label128;
               }

               if(!var10000) {
                  return class_931.field_4749;
               }
            }

            var10000 = this.method_3937();
         }
      }

      label89: {
         class_792 var10;
         label137: {
            if(var4 != null) {
               if(var10000) {
                  this.method_3925((class_689)null);
               }

               this.method_3852(0.2F, 0.2F);
               this.field_3013 = 0.2F;
               var10 = this;
               if(var4 == null) {
                  break label137;
               }

               var10000 = this.field_2990.method_2048(var1, var2, var3);
            }

            if(var10000) {
               int var12 = this.field_2990.method_33(var1, var2, var3);
               int var6 = class_435.method_2711(var12);
               float var13 = 0.5F;
               float var8 = 0.5F;
               if(var4 != null) {
                  switch(var6) {
                  case 0:
                     var8 = 0.9F;
                     if(var4 != null) {
                        break;
                     }
                  case 1:
                     var13 = 0.1F;
                     if(var4 != null) {
                        break;
                     }
                  case 2:
                     var8 = 0.1F;
                     if(var4 != null) {
                        break;
                     }
                  case 3:
                     var13 = 0.9F;
                  }

                  this.method_4601(var6);
                  this.method_3854((double)((float)var1 + var13), (double)((float)var2 + 0.9375F), (double)((float)var3 + var8));
               }

               if(var4 != null) {
                  break label89;
               }
            }

            var10 = this;
         }

         var10.method_3854((double)((float)var1 + 0.5F), (double)((float)var2 + 0.9375F), (double)((float)var3 + 0.5F));
      }

      this.field_3631 = true;
      this.field_3633 = 0;
      class_1661 var10001 = new class_1661;
      var10001.method_9151(var1, var2, var3);
      this.field_3632 = var10001;
      this.field_2997 = this.field_2999 = this.field_2998 = 0.0D;
      ahb var11 = this.field_2990;
      if(var4 != null) {
         if(this.field_2990.field_1832) {
            return class_931.field_4744;
         }

         var11 = this.field_2990;
      }

      var11.method_2197();
      return class_931.field_4744;
   }

   // $FF: renamed from: w (int) void
   private void method_4601(int var1) {
      label31: {
         String[] var2;
         label30: {
            label29: {
               String[] var10000 = class_752.method_4253();
               this.field_3634 = 0.0F;
               var2 = var10000;
               this.field_3636 = 0.0F;
               if(var2 != null) {
                  switch(var1) {
                  case 0:
                     this.field_3636 = -1.8F;
                     break;
                  case 1:
                     break label29;
                  case 2:
                     break label30;
                  case 3:
                     break label31;
                  default:
                     return;
                  }
               }

               if(var2 != null) {
                  return;
               }
            }

            this.field_3634 = 1.8F;
            if(var2 != null) {
               return;
            }
         }

         this.field_3636 = 1.8F;
         if(var2 != null) {
            return;
         }
      }

      this.field_3634 = -1.8F;
   }

   // $FF: renamed from: a (boolean, boolean, boolean) void
   public void method_4602(boolean var1, boolean var2, boolean var3) {
      String[] var4;
      ahb var7;
      label53: {
         this.method_3852(0.6F, 1.8F);
         this.method_4582();
         String[] var10000 = class_752.method_4253();
         class_1661 var5 = this.field_3632;
         var4 = var10000;
         class_1661 var6 = this.field_3632;
         if(var4 != null) {
            if(var5 != null) {
               var7 = this.field_2990;
               if(var4 == null) {
                  break label53;
               }

               if(this.field_2990.getBlock(var5.field_8646, var5.field_8647, var5.field_8648) == class_1192.field_6053) {
                  class_435.method_2744(this.field_2990, var5.field_8646, var5.field_8647, var5.field_8648, false);
                  class_792 var8 = this;
                  if(var4 != null) {
                     var6 = class_435.method_2745(this.field_2990, var5.field_8646, var5.field_8647, var5.field_8648, 0);
                     if(var6 == null) {
                        class_1661 var9 = new class_1661;
                        var9.method_9151(var5.field_8646, var5.field_8647 + 1, var5.field_8648);
                        var6 = var9;
                     }

                     var8 = this;
                  }

                  var8.method_3854((double)((float)var6.field_8646 + 0.5F), (double)((float)var6.field_8647 + this.field_3013 + 0.1F), (double)((float)var6.field_8648 + 0.5F));
               }
            }

            this.field_3631 = false;
         }

         var7 = this.field_2990;
      }

      boolean var10 = var7.field_1832;
      if(var4 != null) {
         label44: {
            if(!var10) {
               var10 = var2;
               if(var4 == null) {
                  break label44;
               }

               if(var2) {
                  this.field_2990.method_2197();
               }
            }

            var10 = var1;
         }
      }

      label38: {
         if(var10) {
            this.field_3633 = 0;
            if(var4 != null) {
               break label38;
            }
         }

         this.field_3633 = 100;
      }

      if(var3) {
         this.method_4613(this.field_3632, false);
      }

   }

   // $FF: renamed from: j () boolean
   private boolean method_4603() {
      return this.field_2990.getBlock(this.field_3632.field_8646, this.field_3632.field_8647, this.field_3632.field_8648) == class_1192.field_6053;
   }

   // $FF: renamed from: a (ahb, vF, boolean) vF
   public static class_1661 method_4604(ahb var0, class_1661 var1, boolean var2) {
      class_25 var4 = var0.method_2192();
      var4.method_105(var1.field_8646 - 3 >> 4, var1.field_8648 - 3 >> 4);
      String[] var10000 = class_752.method_4253();
      var4.method_105(var1.field_8646 + 3 >> 4, var1.field_8648 - 3 >> 4);
      var4.method_105(var1.field_8646 - 3 >> 4, var1.field_8648 + 3 >> 4);
      var4.method_105(var1.field_8646 + 3 >> 4, var1.field_8648 + 3 >> 4);
      String[] var3 = var10000;
      aji var11 = var0.getBlock(var1.field_8646, var1.field_8647, var1.field_8648);
      if(var3 != null) {
         if(var11 == class_1192.field_6053) {
            class_1661 var10 = class_435.method_2745(var0, var1.field_8646, var1.field_8647, var1.field_8648, 0);
            return var10;
         }

         var11 = var0.getBlock(var1.field_8646, var1.field_8647, var1.field_8648);
      }

      awt var6;
      boolean var12;
      label71: {
         label75: {
            awt var5 = var11.method_2424();
            var6 = var0.getBlock(var1.field_8646, var1.field_8647 + 1, var1.field_8648).method_2424();
            var12 = var5.method_5063();
            if(var3 != null) {
               if(var12) {
                  break label75;
               }

               var12 = var5.method_5062();
            }

            if(var3 == null) {
               break label71;
            }

            if(!var12) {
               var12 = true;
               break label71;
            }
         }

         var12 = false;
      }

      boolean var7;
      label60: {
         label76: {
            var7 = var12;
            var12 = var6.method_5063();
            if(var3 != null) {
               if(var12) {
                  break label76;
               }

               var12 = var6.method_5062();
            }

            if(var3 == null) {
               break label60;
            }

            if(!var12) {
               var12 = true;
               break label60;
            }
         }

         var12 = false;
      }

      class_1661 var9;
      label77: {
         boolean var8 = var12;
         var12 = var2;
         if(var3 != null) {
            if(!var2) {
               break label77;
            }

            var12 = var7;
         }

         if(var3 != null) {
            if(!var12) {
               break label77;
            }

            var12 = var8;
         }

         if(var12) {
            var9 = var1;
            return var9;
         }
      }

      var9 = null;
      return var9;
   }

   // $FF: renamed from: bK () float
   public float method_4605() {
      String[] var1 = class_752.method_4253();
      class_792 var10000 = this;
      if(var1 != null) {
         if(this.field_3632 == null) {
            return 0.0F;
         }

         var10000 = this;
      }

      int var2 = var10000.field_2990.method_33(this.field_3632.field_8646, this.field_3632.field_8647, this.field_3632.field_8648);
      int var3 = class_435.method_2711(var2);
      switch(var3) {
      case 0:
         return 90.0F;
      case 1:
         return 0.0F;
      case 2:
         return 270.0F;
      case 3:
         return 180.0F;
      default:
         return 0.0F;
      }
   }

   // $FF: renamed from: bm () boolean
   public boolean method_4229() {
      return this.field_3631;
   }

   // $FF: renamed from: bL () boolean
   public boolean method_4606() {
      int var10000;
      label24: {
         String[] var1 = class_752.method_4253();
         var10000 = this.field_3631;
         if(var1 != null) {
            if(!this.field_3631) {
               break label24;
            }

            var10000 = this.field_3633;
         }

         if(var1 == null) {
            return (boolean)var10000;
         }

         if(var10000 >= 100) {
            var10000 = 1;
            return (boolean)var10000;
         }
      }

      var10000 = 0;
      return (boolean)var10000;
   }

   // $FF: renamed from: bM () int
   public int method_4607() {
      return this.field_3633;
   }

   // $FF: renamed from: u (int) boolean
   protected boolean method_4608(int var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = this.field_3036.method_9499(16) & 1 << var1;
      if(var2 != null) {
         var10000 = var10000 != 0?1:0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: b (int, boolean) void
   protected void method_4609(int var1, boolean var2) {
      byte var4;
      label16: {
         String[] var10000 = class_752.method_4253();
         var4 = this.field_3036.method_9499(16);
         String[] var3 = var10000;
         if(var3 != null) {
            if(!var2) {
               break label16;
            }

            this.field_3036.method_9506(16, Byte.valueOf((byte)(var4 | 1 << var1)));
         }

         if(var3 != null) {
            return;
         }
      }

      this.field_3036.method_9506(16, Byte.valueOf((byte)(var4 & ~(1 << var1))));
   }

   // $FF: renamed from: b (rV) void
   public void method_4610(class_66 var1) {}

   // $FF: renamed from: bN () vF
   public class_1661 method_4611() {
      return this.field_3637;
   }

   // $FF: renamed from: bO () boolean
   public boolean method_4612() {
      return this.field_3638;
   }

   // $FF: renamed from: a (vF, boolean) void
   public void method_4613(class_1661 var1, boolean var2) {
      String[] var3 = class_752.method_4253();
      if(var3 != null) {
         if(var1 != null) {
            class_1661 var10001 = new class_1661;
            var10001.method_9152(var1);
            this.field_3637 = var10001;
            this.field_3638 = var2;
            if(var3 != null) {
               return;
            }
         }

         this.field_3637 = null;
      }

      this.field_3638 = false;
   }

   // $FF: renamed from: a (u2) void
   public void method_4614(class_1601 var1) {
      this.method_4615(var1, 1);
   }

   // $FF: renamed from: a (u2, int) void
   public void method_4615(class_1601 var1, int var2) {}

   // $FF: renamed from: bj () void
   public void method_4223() {
      super.method_4223();
      String[] var10000 = class_752.method_4253();
      this.method_4615(class_1698.field_8897, 1);
      String[] var1 = var10000;
      class_792 var2 = this;
      if(var1 != null) {
         if(this.method_3940()) {
            this.method_4622(0.8F);
            if(var1 != null) {
               return;
            }
         }

         var2 = this;
      }

      var2.method_4622(0.2F);
   }

   // $FF: renamed from: e (float, float) void
   public void method_4224(float var1, float var2) {
      double var4;
      double var6;
      double var8;
      label21: {
         String[] var10000 = class_752.method_4253();
         var4 = this.field_2994;
         String[] var3 = var10000;
         var6 = this.field_2995;
         var8 = this.field_2996;
         class_792 var13 = this;
         if(var3 != null) {
            label19: {
               if(this.field_3640.field_2837) {
                  var13 = this;
                  if(var3 == null) {
                     break label19;
                  }

                  if(this.field_2988 == null) {
                     double var10 = this.field_2998;
                     float var12 = this.field_3334;
                     this.field_3334 = this.field_3640.method_3587();
                     super.method_4224(var1, var2);
                     this.field_2998 = var10 * 0.6D;
                     this.field_3334 = var12;
                     if(var3 != null) {
                        break label21;
                     }
                  }
               }

               var13 = this;
            }
         }

         var13.method_4224(var1, var2);
      }

      this.method_4616(this.field_2994 - var4, this.field_2995 - var6, this.field_2996 - var8);
   }

   // $FF: renamed from: bl () float
   public float method_4226() {
      return (float)this.method_4211(class_1840.field_9393).method_396();
   }

   // $FF: renamed from: k (double, double, double) void
   public void method_4616(double var1, double var3, double var5) {
      String[] var7 = class_752.method_4253();
      class_792 var10000 = this;
      if(var7 != null) {
         if(this.field_2988 != null) {
            return;
         }

         var10000 = this;
      }

      int var9 = var10000.method_3879(awt.field_4177);
      int var8;
      if(var7 != null) {
         if(var9 != 0) {
            var8 = Math.round(class_1715.method_9558(var1 * var1 + var3 * var3 + var5 * var5) * 100.0F);
            if(var7 != null) {
               if(var8 <= 0) {
                  return;
               }

               this.method_4615(class_1698.field_8892, var8);
               this.method_4622(0.015F * (float)var8 * 0.01F);
            }

            if(var7 != null) {
               return;
            }
         }

         var9 = this.method_3876();
      }

      if(var7 != null) {
         if(var9 != 0) {
            var8 = Math.round(class_1715.method_9558(var1 * var1 + var5 * var5) * 100.0F);
            if(var7 != null) {
               if(var8 <= 0) {
                  return;
               }

               this.method_4615(class_1698.field_8888, var8);
               this.method_4622(0.015F * (float)var8 * 0.01F);
            }

            if(var7 != null) {
               return;
            }
         }

         var9 = this.method_4197();
      }

      if(var7 != null) {
         if(var9 != 0) {
            if(var3 <= 0.0D) {
               return;
            }

            this.method_4615(class_1698.field_8890, (int)Math.round(var3 * 100.0D));
            if(var7 != null) {
               return;
            }
         }

         var9 = this.field_3005;
      }

      if(var7 != null) {
         if(var9 != 0) {
            label93: {
               var8 = Math.round(class_1715.method_9558(var1 * var1 + var5 * var5) * 100.0F);
               var9 = var8;
               if(var7 != null) {
                  if(var8 <= 0) {
                     return;
                  }

                  this.method_4615(class_1698.field_8887, var8);
                  var10000 = this;
                  if(var7 == null) {
                     break label93;
                  }

                  var9 = this.method_3940();
               }

               if(var9 != 0) {
                  this.method_4622(0.099999994F * (float)var8 * 0.01F);
                  if(var7 != null) {
                     return;
                  }
               }

               var10000 = this;
            }

            var10000.method_4622(0.01F * (float)var8 * 0.01F);
            if(var7 != null) {
               return;
            }
         }

         var9 = Math.round(class_1715.method_9558(var1 * var1 + var5 * var5) * 100.0F);
      }

      var8 = var9;
      if(var8 > 25) {
         this.method_4615(class_1698.field_8891, var8);
      }

   }

   // $FF: renamed from: l (double, double, double) void
   private void method_4617(double var1, double var3, double var5) {
      String[] var7 = class_752.method_4253();
      if(this.field_2988 != null) {
         int var8 = Math.round(class_1715.method_9558(var1 * var1 + var3 * var3 + var5 * var5) * 100.0F);
         int var10000 = var8;
         if(var7 != null) {
            if(var8 <= 0) {
               return;
            }

            var10000 = this.field_2988 instanceof class_690;
         }

         class_792 var10;
         if(var7 != null) {
            if(var10000 != 0) {
               label75: {
                  this.method_4615(class_1698.field_8893, var8);
                  class_1661 var9 = this.field_3639;
                  if(var7 != null) {
                     if(this.field_3639 == null) {
                        class_1661 var10001 = new class_1661;
                        var10001.method_9151(class_1715.method_9561(this.field_2994), class_1715.method_9561(this.field_2995), class_1715.method_9561(this.field_2996));
                        this.field_3639 = var10001;
                        if(var7 != null) {
                           return;
                        }
                     }

                     var10 = this;
                     if(var7 == null) {
                        break label75;
                     }

                     var9 = this.field_3639;
                  }

                  if((double)var9.method_9155(class_1715.method_9561(this.field_2994), class_1715.method_9561(this.field_2995), class_1715.method_9561(this.field_2996)) < 1000000.0D) {
                     return;
                  }

                  var10 = this;
               }

               var10.method_4615(class_1600.field_8341, 1);
               if(var7 != null) {
                  return;
               }
            }

            var10000 = this.field_2988 instanceof class_701;
         }

         if(var7 != null) {
            if(var10000 != 0) {
               this.method_4615(class_1698.field_8894, var8);
               if(var7 != null) {
                  return;
               }
            }

            var10000 = this.field_2988 instanceof class_771;
         }

         label77: {
            if(var7 != null) {
               if(var10000 != 0) {
                  this.method_4615(class_1698.field_8895, var8);
                  if(var7 != null) {
                     return;
                  }
               }

               var10 = this;
               if(var7 == null) {
                  break label77;
               }

               var10000 = this.field_2988 instanceof class_772;
            }

            if(var10000 == 0) {
               return;
            }

            var10 = this;
         }

         var10.method_4615(class_1698.field_8896, var8);
      }

   }

   // $FF: renamed from: b (float) void
   protected void method_3874(float var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = this.field_3640.field_2838;
      if(var2 != null) {
         if(this.field_3640.field_2838) {
            return;
         }

         float var3;
         var10000 = (var3 = var1 - 2.0F) == 0.0F?0:(var3 < 0.0F?-1:1);
      }

      if(var10000 >= 0) {
         this.method_4615(class_1698.field_8889, (int)Math.round((double)var1 * 100.0D));
      }

      super.method_3874(var1);
   }

   // $FF: renamed from: o (int) java.lang.String
   protected String method_4198(int var1) {
      String var10000;
      if(var1 > 4) {
         String[] var2 = field_3651;
         var10000 = "game.player.hurt.fall.big";
      } else {
         String[] var3 = field_3651;
         var10000 = "game.player.hurt.fall.small";
      }

      return var10000;
   }

   // $FF: renamed from: a (sv) void
   public void method_3952(class_752 var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = var1 instanceof class_10;
      if(var2 != null) {
         if(var10000 != 0) {
            this.method_4614(class_1600.field_8343);
         }

         var10000 = class_1775.method_9757(var1);
      }

      int var3 = var10000;
      class_1777 var4 = (class_1777)class_1775.field_9269.get(Integer.valueOf(var3));
      if(var4 != null) {
         this.method_4615(var4.field_9283, 1);
      }

   }

   // $FF: renamed from: as () void
   public void method_3954() {
      String[] var1 = class_752.method_4253();
      class_792 var10000 = this;
      if(var1 != null) {
         if(this.field_3640.field_2837) {
            return;
         }

         var10000 = this;
      }

      var10000.method_3954();
   }

   // $FF: renamed from: b (add, int) vL
   public class_73 method_4222(add var1, int var2) {
      String[] var3;
      class_73 var4;
      add var6;
      label104: {
         var4 = super.method_4222(var1, var2);
         var3 = class_752.method_4253();
         adb var10000 = var1.method_3730();
         if(var3 != null) {
            if(var10000 == class_1010.field_5203 && this.field_3650 != null) {
               var4 = class_1010.field_5203.method_2999();
               if(var3 != null) {
                  return var4;
               }
            }

            var6 = var1;
            if(var3 == null) {
               break label104;
            }

            var10000 = var1.method_3730();
         }

         if(var10000.method_2970()) {
            return var1.method_3730().method_2971(var1.method_3745(), var2);
         }

         var6 = this.field_3644;
      }

      byte var10001;
      int var5;
      int var7;
      if(var3 != null) {
         label88: {
            if(var6 != null) {
               var6 = var1;
               if(var3 == null) {
                  break label88;
               }

               if(var1.method_3730() instanceof class_573) {
                  label107: {
                     var5 = var1.method_3763() - this.field_3645;
                     var7 = var5;
                     var10001 = 18;
                     if(var3 != null) {
                        if(var5 >= 18) {
                           return ((class_573)var1.method_3730()).getBlock62(2);
                        }

                        var7 = var5;
                        if(var3 == null) {
                           break label107;
                        }

                        var10001 = 13;
                     }

                     if(var7 > var10001) {
                        return ((class_573)var1.method_3730()).getBlock62(1);
                     }

                     var7 = var5;
                  }

                  if(var7 > 0) {
                     return ((class_573)var1.method_3730()).getBlock62(0);
                  }

                  if(var3 != null) {
                     return var4;
                  }
               }
            }

            var6 = this.field_3644;
         }
      }

      if(var3 != null) {
         if(var6 == null) {
            return var4;
         }

         var6 = var1;
      }

      var7 = var6.method_3730() instanceof ItemSuperBow;
      if(var3 != null) {
         if(var7 == 0) {
            return var4;
         }

         var7 = var1.method_3763() - this.field_3645;
      }

      label109: {
         var5 = var7;
         var7 = var5;
         var10001 = 18;
         if(var3 != null) {
            if(var5 >= 18) {
               return ((ItemSuperBow)var1.method_3730()).getBlock62(2);
            }

            var7 = var5;
            if(var3 == null) {
               break label109;
            }

            var10001 = 13;
         }

         if(var7 > var10001) {
            return ((ItemSuperBow)var1.method_3730()).getBlock62(1);
         }

         var7 = var5;
      }

      if(var7 > 0) {
         return ((ItemSuperBow)var1.method_3730()).getBlock62(0);
      } else {
         return var4;
      }
   }

   // $FF: renamed from: r (int) add
   public add method_4618(int var1) {
      return this.field_3616.method_3612(var1);
   }

   // $FF: renamed from: v (int) void
   public void method_4619(int var1) {
      this.method_4568(var1);
      String[] var10000 = class_752.method_4253();
      int var3 = Integer.MAX_VALUE - this.field_3642;
      String[] var2 = var10000;
      if(var2 != null) {
         if(var1 > var3) {
            var1 = var3;
         }

         this.field_3643 += (float)var1 / (float)this.method_4621();
      }

      this.field_3642 += var1;

      while(this.field_3643 >= 1.0F) {
         this.field_3643 = (this.field_3643 - 1.0F) * (float)this.method_4621();
         this.method_4620(1);
         this.field_3643 /= (float)this.method_4621();
         if(var2 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: a (int) void
   public void method_4620(int var1) {
      String[] var10000 = class_752.method_4253();
      this.field_3641 += var1;
      String[] var2 = var10000;
      int var4 = this.field_3641;
      if(var2 != null) {
         if(this.field_3641 < 0) {
            this.field_3641 = 0;
            this.field_3643 = 0.0F;
            this.field_3642 = 0;
         }

         var4 = var1;
      }

      if(var2 != null) {
         if(var4 <= 0) {
            return;
         }

         var4 = this.field_3641 % 5;
      }

      if(var2 != null) {
         if(var4 != 0) {
            return;
         }

         float var6;
         var4 = (var6 = (float)this.field_3648 - ((float)this.field_3029 - 100.0F)) == 0.0F?0:(var6 < 0.0F?-1:1);
      }

      if(var2 != null) {
         if(var4 >= 0) {
            return;
         }

         var4 = this.field_3641;
      }

      float var5;
      label31: {
         if(var2 != null) {
            if(var4 > 30) {
               var5 = 1.0F;
               break label31;
            }

            var4 = this.field_3641;
         }

         var5 = (float)var4 / 30.0F;
      }

      float var3 = var5;
      String[] var10002 = field_3651;
      this.field_2990.method_2082(this, "random.levelup", var3 * 0.75F, 1.0F);
      this.field_3648 = this.field_3029;
   }

   // $FF: renamed from: bP () int
   public int method_4621() {
      String[] var1 = class_752.method_4253();
      int var10000 = this.field_3641;
      int var10001 = 30;
      if(var1 != null) {
         if(this.field_3641 >= 30) {
            var10000 = 62 + (this.field_3641 - 30) * 7;
            return var10000;
         }

         var10000 = this.field_3641;
         var10001 = 15;
      }

      if(var1 != null) {
         if(var10000 < var10001) {
            var10000 = 17;
            return var10000;
         }

         var10000 = 17;
         var10001 = (this.field_3641 - 15) * 3;
      }

      var10000 += var10001;
      return var10000;
   }

   // $FF: renamed from: a (float) void
   public void method_4622(float var1) {
      class_792 var3;
      label24: {
         String[] var2 = class_752.method_4253();
         boolean var10000 = this.field_3640.field_2836;
         if(var2 != null) {
            if(this.field_3640.field_2836) {
               return;
            }

            var3 = this;
            if(var2 == null) {
               break label24;
            }

            var10000 = this.field_2990.field_1832;
         }

         if(var10000) {
            return;
         }

         var3 = this;
      }

      var3.field_3620.method_3640(var1);
   }

   // $FF: renamed from: bQ () Ak
   public class_670 method_4623() {
      return this.field_3620;
   }

   // $FF: renamed from: g (boolean) boolean
   public boolean method_4624(boolean var1) {
      boolean var10000;
      label30: {
         String[] var2 = class_752.method_4253();
         var10000 = var1;
         if(var2 != null) {
            label25: {
               if(!var1) {
                  var10000 = this.field_3620.method_3639();
                  if(var2 == null) {
                     break label25;
                  }

                  if(!var10000) {
                     break label30;
                  }
               }

               var10000 = this.field_3640.field_2836;
            }
         }

         if(var2 == null) {
            return var10000;
         }

         if(!var10000) {
            var10000 = true;
            return var10000;
         }
      }

      var10000 = false;
      return var10000;
   }

   // $FF: renamed from: bR () boolean
   public boolean method_4625() {
      int var10000;
      label24: {
         String[] var1 = class_752.method_4253();
         float var2;
         var10000 = (var2 = this.method_406() - 0.0F) == 0.0F?0:(var2 < 0.0F?-1:1);
         if(var1 != null) {
            if(var10000 <= 0) {
               break label24;
            }

            float var3;
            var10000 = (var3 = this.method_406() - this.method_405()) == 0.0F?0:(var3 < 0.0F?-1:1);
         }

         if(var1 == null) {
            return (boolean)var10000;
         }

         if(var10000 < 0) {
            var10000 = 1;
            return (boolean)var10000;
         }
      }

      var10000 = 0;
      return (boolean)var10000;
   }

   // $FF: renamed from: a (add, int) void
   public void method_4626(add var1, int var2) {
      String[] var3 = class_752.method_4253();
      if(var3 != null) {
         if(var1 == this.field_3644) {
            return;
         }

         this.field_3644 = var1;
         this.field_3645 = var2;
      }

      class_792 var10000 = this;
      if(var3 != null) {
         if(this.field_2990.field_1832) {
            return;
         }

         var10000 = this;
      }

      var10000.method_3946(true);
   }

   // $FF: renamed from: d (int, int, int) boolean
   public boolean method_4627(int var1, int var2, int var3) {
      String[] var4 = class_752.method_4253();
      class_792 var10000 = this;
      if(var4 != null) {
         if(this.field_3640.field_2840) {
            return true;
         }

         var10000 = this;
      }

      int var10;
      label63: {
         aji var5 = var10000.field_2990.getBlock(var1, var2, var3);
         awt var7 = var5.method_2424();
         if(var4 != null) {
            if(var7 == awt.field_4170) {
               break label63;
            }

            var7 = var5.method_2424();
         }

         boolean var8 = var7.method_5078();
         if(var4 != null) {
            if(!var8) {
               add var9 = this.method_4593();
               if(var4 != null) {
                  if(var9 == null) {
                     break label63;
                  }

                  var9 = this.method_4593();
               }

               add var6 = var9;
               var8 = var6.method_3752(var5);
               if(var4 == null) {
                  return var8;
               }

               if(!var8) {
                  float var11;
                  var10 = (var11 = var6.method_3734(var5) - 1.0F) == 0.0F?0:(var11 < 0.0F?-1:1);
                  if(var4 == null) {
                     return (boolean)var10;
                  }

                  if(var10 <= 0) {
                     break label63;
                  }
               }

               var8 = true;
               return var8;
            }

            var8 = true;
         }

         return var8;
      }

      var10 = 0;
      return (boolean)var10;
   }

   // $FF: renamed from: a (int, int, int, int, add) boolean
   public boolean method_4628(int var1, int var2, int var3, int var4, add var5) {
      String[] var6 = class_752.method_4253();
      boolean var10000 = this.field_3640.field_2840;
      if(var6 != null) {
         if(this.field_3640.field_2840) {
            var10000 = true;
         } else {
            add var7 = var5;
            if(var6 != null) {
               if(var5 == null) {
                  var10000 = false;
                  return var10000;
               }

               var7 = var5;
            }

            var10000 = var7.method_3781();
         }
      }

      return var10000;
   }

   // $FF: renamed from: e (yz) int
   protected int method_4163(class_792 var1) {
      String[] var2 = class_752.method_4253();
      class_1038 var10000 = this.field_2990.method_2196();
      String[] var10001 = field_3651;
      int var4 = var10000.method_5878("keepInventory");
      if(var2 != null) {
         if(var4 != 0) {
            return 0;
         }

         var4 = this.field_3641 * 7;
      }

      int var3 = var4;
      var4 = var3;
      if(var2 != null) {
         var4 = var3 > 100?100:var3;
      }

      return var4;
   }

   // $FF: renamed from: aH () boolean
   protected boolean method_4164() {
      return true;
   }

   // $FF: renamed from: bi () boolean
   public boolean method_4221() {
      return true;
   }

   // $FF: renamed from: a (yz, boolean) void
   public void method_4629(class_792 var1, boolean var2) {
      class_792 var4;
      label23: {
         label22: {
            String[] var3 = class_752.method_4253();
            boolean var10000 = var2;
            if(var3 != null) {
               if(var2) {
                  this.field_3616.method_3619(var1.field_3616);
                  this.method_4188(var1.method_406());
                  this.field_3620 = var1.field_3620;
                  this.field_3641 = var1.field_3641;
                  this.field_3642 = var1.field_3642;
                  this.field_3643 = var1.field_3643;
                  this.method_4567(var1.method_4566());
                  this.field_3052 = var1.field_3052;
                  if(var3 != null) {
                     break label22;
                  }
               }

               var4 = this;
               if(var3 == null) {
                  break label23;
               }

               class_1038 var5 = this.field_2990.method_2196();
               String[] var10001 = field_3651;
               var10000 = var5.method_5878("keepInventory");
            }

            if(var10000) {
               this.field_3616.method_3619(var1.field_3616);
               this.field_3641 = var1.field_3641;
               this.field_3642 = var1.field_3642;
               this.field_3643 = var1.field_3643;
               this.method_4567(var1.method_4566());
            }
         }

         var4 = this;
      }

      var4.field_3617 = var1.field_3617;
   }

   // $FF: renamed from: g_ () boolean
   protected boolean method_3869() {
      String[] var1 = class_752.method_4253();
      boolean var10000 = this.field_3640.field_2837;
      if(var1 != null) {
         var10000 = !this.field_3640.field_2837;
      }

      return var10000;
   }

   // $FF: renamed from: q () void
   public void method_4630() {}

   // $FF: renamed from: a (G) void
   public void method_4631(class_94 var1) {}

   // $FF: renamed from: b_ () java.lang.String
   public String method_64() {
      return this.field_3649.getName();
   }

   // $FF: renamed from: d () ahb
   public ahb method_69() {
      return this.field_2990;
   }

   // $FF: renamed from: bS () vP
   public class_1677 method_4632() {
      return this.field_3617;
   }

   // $FF: renamed from: q (int) add
   public add method_4215(int var1) {
      return var1 == 0?this.field_3616.method_3593():this.field_3616.field_2845[var1 - 1];
   }

   // $FF: renamed from: be () add
   public add method_4214() {
      return this.field_3616.method_3593();
   }

   // $FF: renamed from: c (int, add) void
   public void method_3935(int var1, add var2) {
      this.field_3616.field_2845[var1] = var2;
   }

   // $FF: renamed from: d (yz) boolean
   public boolean method_3943(class_792 var1) {
      String[] var2 = class_752.method_4253();
      class_792 var10000 = this;
      if(var2 != null) {
         if(!this.method_3942()) {
            return false;
         }

         var10000 = this;
      }

      class_1350 var3 = var10000.method_4247();
      boolean var5;
      if(var3 != null) {
         label43: {
            var10000 = var1;
            if(var2 != null) {
               if(var1 == null) {
                  break label43;
               }

               var10000 = var1;
            }

            class_1350 var4 = var10000.method_4247();
            if(var2 != null) {
               if(var4 != var3) {
                  break label43;
               }

               var4 = var3;
            }

            var5 = var4.method_7298();
            if(var2 == null) {
               return var5;
            }

            if(var5) {
               var5 = false;
               return var5;
            }
         }
      }

      var5 = true;
      return var5;
   }

   // $FF: renamed from: ak () add[]
   public add[] method_3934() {
      return this.field_3616.field_2845;
   }

   // $FF: renamed from: bT () boolean
   public boolean method_4633() {
      return this.method_4608(1);
   }

   // $FF: renamed from: aC () boolean
   public boolean method_3973() {
      String[] var1 = class_752.method_4253();
      boolean var10000 = this.field_3640.field_2837;
      if(var1 != null) {
         var10000 = !this.field_3640.field_2837;
      }

      return var10000;
   }

   // $FF: renamed from: bU () kl
   public class_1348 method_4634() {
      return this.field_2990.method_2220();
   }

   // $FF: renamed from: bt () kn
   public class_1350 method_4247() {
      return this.method_4634().method_7181(this.method_64());
   }

   // $FF: renamed from: c_ () rV
   public class_66 method_65() {
      class_1082 var10000 = new class_1082;
      var10000.method_6134(class_1351.setMaxStringLength8(this.method_4247(), this.method_64()));
      class_1082 var1 = var10000;
      class_1560 var2 = var1.method_338();
      class_1554 var10001 = new class_1554;
      class_911 var10003 = class_911.field_4582;
      StringBuilder var10004 = new StringBuilder();
      String[] var10005 = field_3651;
      var10001.method_8472(var10003, var10004.append("/msg ").append(this.method_64()).append(" ").toString());
      var2.method_8530(var10001);
      return var1;
   }

   // $FF: renamed from: m (float) void
   public void method_4246(float var1) {
      String[] var2 = class_752.method_4253();
      if(var2 != null) {
         if(var1 < 0.0F) {
            var1 = 0.0F;
         }

         this.method_3849().method_9506(17, Float.valueOf(var1));
      }

   }

   // $FF: renamed from: bs () float
   public float method_4245() {
      return this.method_3849().method_9502(17);
   }

   // $FF: renamed from: a (com.mojang.authlib.GameProfile) java.util.UUID
   public static UUID method_4635(GameProfile var0) {
      String[] var10000 = class_752.method_4253();
      UUID var2 = var0.getId();
      String[] var1 = var10000;
      UUID var3 = var2;
      if(var1 != null) {
         if(var2 == null) {
            StringBuilder var4 = new StringBuilder();
            String[] var10001 = field_3651;
            var2 = UUID.nameUUIDFromBytes(var4.append("OfflinePlayer:").append(var0.getName()).toString().getBytes(Charsets.UTF_8));
         }

         var3 = var2;
      }

      return var3;
   }

   // $FF: renamed from: <clinit> () void
   static void method_4636() {
      // $FF: Couldn't be decompiled
   }
}
