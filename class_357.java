import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import net.minecraft.server.MinecraftServer;
import org.apache.logging.log4j.Logger;

// $FF: renamed from: up
public class class_357 extends MinecraftServer {

   // $FF: renamed from: s org.apache.logging.log4j.Logger
   private static final Logger field_1965;
   // $FF: renamed from: Z bao
   private final bao field_1966;
   // $FF: renamed from: aa dt
   private final class_1045 field_1967;
   // $FF: renamed from: ab boolean
   private boolean field_1968;
   // $FF: renamed from: ac boolean
   private boolean field_1969;
   // $FF: renamed from: ad AM
   private class_649 field_1970;
   // $FF: renamed from: ae java.lang.String
   private static final String field_1971;
   // $FF: renamed from: bb java.lang.String[]
   private static final String[] field_1972;


   // $FF: renamed from: <init> (bao, java.lang.String, java.lang.String, dt) void
   public void method_2412(bao var1, String var2, String var3, class_1045 var4) {
      File var10001 = new File(var1.canLoseFocus9, "saves");
      String[] var10004 = field_1972;
      super.method_2311(var10001, var1.method_5287());
      this.method_2352(var1.method_5285().method_6995());
      this.method_2355(var2);
      this.method_2356(var3);
      this.method_2362(var1.method_5266());
      this.method_2363(var4.method_5910());
      this.method_2382(256);
      class_1628 var5 = new class_1628;
      var5.method_8932(this);
      this.method_2384(var5);
      this.field_1966 = var1;
      this.field_1967 = var4;
      Reflector.callVoid(Reflector.ModLoader_registerServer, new Object[]{this});
   }

   // $FF: renamed from: a (java.lang.String, java.lang.String, long, du, java.lang.String) void
   protected void method_2316(String var1, String var2, long var3, class_1046 var5, String var6) {
      label116: {
         String[] var10000 = class_752.method_4253();
         this.method_2313(var1);
         String[] var7 = var10000;
         class_29 var8 = this.method_2364().method_136(var1, true);
         byte var18 = Reflector.DimensionManager.exists();
         class_1659 var10001;
         class_354 var22;
         if(var7 != null) {
            if(var18 != 0) {
               Object var19;
               if(this.method_2361()) {
                  var19 = new class_356;
                  ((class_356)var19).method_2262(this, var8, var2, 0, this.field_1922);
               } else {
                  var19 = new WorldServerOF;
                  ((WorldServerOF)var19).method_2239(this, var8, var2, 0, this.field_1967, this.field_1922);
               }

               Object var9 = var19;
               Integer[] var10 = (Integer[])((Integer[])((Integer[])Reflector.call(Reflector.DimensionManager_getStaticDimensionIDs, new Object[0])));
               Integer[] var11 = var10;
               int var12 = var10.length;
               int var13 = 0;

               while(true) {
                  if(var13 < var12) {
                     int var14 = var11[var13].intValue();
                     if(var7 == null) {
                        break;
                     }

                     if(var14 == 0) {
                        var19 = var9;
                     } else {
                        var19 = new WorldServerMultiOF;
                        ((WorldServerMultiOF)var19).method_2264(this, var8, var2, var14, this.field_1967, (class_354)var9, this.field_1922);
                     }

                     Object var15 = var19;
                     var22 = (class_354)var15;
                     var10001 = new class_1659;
                     var10001.method_9128(this, (class_354)var15);
                     var22.method_2094(var10001);
                     boolean var24 = this.method_2353();
                     if(var7 != null) {
                        if(!var24) {
                           ((class_354)var15).method_2195().method_6866(this.method_2319());
                        }

                        var24 = Reflector.EventBus.exists();
                     }

                     if(var7 != null && var24) {
                        Reflector.postForgeBusEvent(Reflector.WorldEvent_Load_Constructor, new Object[]{var15});
                     }

                     ++var13;
                     if(var7 != null) {
                        continue;
                     }
                  }

                  this.method_2383().method_8875(new class_354[]{(class_354)var9});
                  break;
               }

               if(var7 != null) {
                  break label116;
               }
            }

            this.field_1927 = new class_354[3];
            this.field_1944 = new long[this.field_1927.length][100];
            var18 = 0;
         }

         int var16 = var18;

         while(var16 < this.field_1927.length) {
            byte var17 = 0;
            if(var7 == null) {
               return;
            }

            int var25;
            label120: {
               var25 = var16;
               byte var20 = 1;
               if(var7 != null) {
                  if(var16 == 1) {
                     var17 = -1;
                  }

                  var25 = var16;
                  if(var7 == null) {
                     break label120;
                  }

                  var20 = 2;
               }

               if(var25 == var20) {
                  var17 = 1;
               }

               var25 = var16;
            }

            label74: {
               class_354[] var27;
               label73: {
                  class_357 var26;
                  label122: {
                     if(var7 != null) {
                        if(var25 != 0) {
                           break label73;
                        }

                        var26 = this;
                        if(var7 == null) {
                           break label122;
                        }

                        var25 = this.method_2361();
                     }

                     if(var25 != 0) {
                        var27 = this.field_1927;
                        class_356 var10002 = new class_356;
                        var10002.method_2262(this, var8, var2, var17, this.field_1922);
                        var27[var16] = var10002;
                        if(var7 != null) {
                           break label74;
                        }
                     }

                     var26 = this;
                  }

                  var27 = var26.field_1927;
                  WorldServerOF var21 = new WorldServerOF;
                  var21.method_2239(this, var8, var2, var17, this.field_1967, this.field_1922);
                  var27[var16] = var21;
                  if(var7 != null) {
                     break label74;
                  }
               }

               var27 = this.field_1927;
               WorldServerMultiOF var23 = new WorldServerMultiOF;
               var23.method_2264(this, var8, var2, var17, this.field_1967, this.field_1927[0], this.field_1922);
               var27[var16] = var23;
            }

            var22 = this.field_1927[var16];
            var10001 = new class_1659;
            var10001.method_9128(this, this.field_1927[var16]);
            var22.method_2094(var10001);
            this.method_2383().method_8875(this.field_1927);
            ++var16;
            if(var7 == null) {
               break;
            }
         }
      }

      this.method_2359(this.method_2320());
      this.method_2317();
   }

   // $FF: renamed from: e () boolean
   protected boolean method_2312() {
      String[] var3 = field_1972;
      field_1965.info("Starting integrated minecraft server version 1.7.10");
      this.method_2369(true);
      this.method_2371(true);
      this.method_2373(true);
      String[] var10000 = class_752.method_4253();
      this.method_2375(true);
      String[] var1 = var10000;
      this.method_2377(true);
      field_1965.info("Generating keypair");
      this.method_2358(class_1701.method_9419());
      boolean var4 = Reflector.FMLCommonHandler_handleServerAboutToStart.exists();
      Object var2;
      if(var1 != null) {
         label32: {
            if(var4) {
               var2 = Reflector.call(Reflector.FMLCommonHandler_instance, new Object[0]);
               var4 = Reflector.callBoolean(var2, Reflector.FMLCommonHandler_handleServerAboutToStart, new Object[]{this});
               if(var1 == null) {
                  break label32;
               }

               if(!var4) {
                  return false;
               }
            }

            this.method_2316(this.method_2354(), this.method_2357(), this.field_1967.method_5911(), this.field_1967.method_5915(), this.field_1967.method_5918());
            StringBuilder var10001 = (new StringBuilder()).append(this.method_2351());
            String[] var10002 = field_1972;
            this.method_2380(var10001.append(" - ").append(this.field_1927[0].method_2195().method_6851()).toString());
            var4 = Reflector.FMLCommonHandler_handleServerStarting.exists();
         }
      }

      if(var1 != null) {
         if(var4) {
            var2 = Reflector.call(Reflector.FMLCommonHandler_instance, new Object[0]);
            Object var5 = Reflector.FMLCommonHandler_handleServerStarting.getReturnType();
            if(var1 != null) {
               if(var5 == Boolean.TYPE) {
                  return Reflector.callBoolean(var2, Reflector.FMLCommonHandler_handleServerStarting, new Object[]{this});
               }

               var5 = var2;
            }

            Reflector.callVoid(var5, Reflector.FMLCommonHandler_handleServerStarting, new Object[]{this});
         }

         var4 = true;
      }

      return var4;
   }

   // $FF: renamed from: u () void
   public void method_2334() {
      String[] var1;
      byte var2;
      boolean var6;
      label55: {
         label58: {
            String[] var10000 = class_752.method_4253();
            var2 = this.field_1968;
            var1 = var10000;
            bao var10001 = bao.method_5273();
            if(var1 != null) {
               if(var10001.method_5267() == null) {
                  break label58;
               }

               var10001 = bao.method_5273();
            }

            var6 = var10001.method_5294();
            if(var1 == null) {
               break label55;
            }

            if(var6) {
               var6 = true;
               break label55;
            }
         }

         var6 = false;
      }

      this.field_1968 = var6;
      int var4 = var2;
      if(var1 != null) {
         label43: {
            if(var2 == 0) {
               var4 = this.field_1968;
               if(var1 == null) {
                  break label43;
               }

               if(this.field_1968) {
                  String[] var3 = field_1972;
                  field_1965.info("Saving and pausing game...");
                  this.method_2383().method_8905();
                  this.method_2326(false);
               }
            }

            var4 = this.field_1968;
         }
      }

      class_357 var5;
      label59: {
         if(var1 != null) {
            if(var4 != 0) {
               return;
            }

            super.method_2334();
            var5 = this;
            if(var1 == null) {
               break label59;
            }

            var4 = this.field_1966.canLoseFocus7.field_4487;
         }

         if(var4 == this.method_2383().method_8920()) {
            return;
         }

         String[] var7 = field_1972;
         field_1965.info("Changing view distance to {}, from {}", new Object[]{Integer.valueOf(this.field_1966.canLoseFocus7.field_4487), Integer.valueOf(this.method_2383().method_8920())});
         var5 = this;
      }

      var5.method_2383().method_8930(this.field_1966.canLoseFocus7.field_4487);
   }

   // $FF: renamed from: h () boolean
   public boolean method_2318() {
      return false;
   }

   // $FF: renamed from: i () G
   public class_94 method_2319() {
      return this.field_1967.method_5912();
   }

   // $FF: renamed from: j () aq
   public class_918 method_2320() {
      return this.field_1966.canLoseFocus7.field_4559;
   }

   // $FF: renamed from: k () boolean
   public boolean method_2321() {
      return this.field_1967.method_5913();
   }

   // $FF: renamed from: m () boolean
   public boolean method_2323() {
      return false;
   }

   // $FF: renamed from: s () java.io.File
   protected File method_2331() {
      return this.field_1966.canLoseFocus9;
   }

   // $FF: renamed from: X () boolean
   public boolean method_2367() {
      return false;
   }

   // $FF: renamed from: a (kj) void
   protected void method_2332(class_1346 var1) {
      this.field_1966.method_5224(var1);
   }

   // $FF: renamed from: b (kj) kj
   public class_1346 method_2346(class_1346 var1) {
      var1 = super.method_2346(var1);
      class_1605 var10000 = var1.method_7149();
      String[] var2 = field_1972;
      class_1519 var10002 = new class_1519;
      var10002.method_8245(this);
      var10000.method_8777("Type", var10002);
      var10000 = var1.method_7149();
      class_1521 var3 = new class_1521;
      var3.method_8258(this);
      var10000.method_8777("Is Modded", var3);
      return var1;
   }

   // $FF: renamed from: a (vS) void
   public void method_376(class_1683 var1) {
      super.method_376(var1);
      String[] var10001 = field_1972;
      var1.method_9270("snooper_partner", this.field_1966.method_5282().method_9275());
   }

   // $FF: renamed from: W () boolean
   public boolean method_378() {
      return bao.method_5273().method_378();
   }

   // $FF: renamed from: a (G, boolean) java.lang.String
   public String method_2389(class_94 var1, boolean var2) {
      String[] var3 = class_752.method_4253();

      try {
         int var4 = -1;

         try {
            var4 = class_1703.method_9462();
         } catch (IOException var6) {
            ;
         }

         label31: {
            int var10000;
            label30: {
               try {
                  var10000 = var4;
                  if(var3 == null) {
                     break label30;
                  }

                  if(var4 > 0) {
                     break label31;
                  }
               } catch (IOException var7) {
                  throw method_2414(var7);
               }

               var10000 = 25564;
            }

            var4 = var10000;
         }

         this.method_2386().method_9252((InetAddress)null, var4);
         Logger var9 = field_1965;
         StringBuilder var10001 = new StringBuilder();
         String[] var10002 = field_1972;
         var9.info(var10001.append("Started on ").append(var4).toString());
         this.field_1969 = true;
         class_649 var10 = new class_649;
         var10.method_3538(this.method_2379(), var4 + "");
         this.field_1970 = var10;
         this.field_1970.start();
         this.method_2383().method_8923(var1);
         this.method_2383().method_8925(var2);
         return var4 + "";
      } catch (IOException var8) {
         return null;
      }
   }

   // $FF: renamed from: o () void
   public void method_2327() {
      super.method_2327();
      String[] var1 = class_752.method_4253();
      class_649 var10000 = this.field_1970;
      if(var1 != null) {
         if(this.field_1970 == null) {
            return;
         }

         var10000 = this.field_1970;
      }

      var10000.interrupt();
      this.field_1970 = null;
   }

   // $FF: renamed from: r () void
   public void method_2329() {
      String[] var10000 = class_752.method_4253();
      super.method_2329();
      String[] var1 = var10000;
      class_649 var2 = this.field_1970;
      if(var1 != null) {
         if(this.field_1970 == null) {
            return;
         }

         var2 = this.field_1970;
      }

      var2.interrupt();
      this.field_1970 = null;
   }

   // $FF: renamed from: b () boolean
   public boolean method_2413() {
      return this.field_1969;
   }

   // $FF: renamed from: a (G) void
   public void method_2385(class_94 var1) {
      this.method_2383().method_8923(var1);
   }

   // $FF: renamed from: ad () boolean
   public boolean method_2378() {
      return true;
   }

   // $FF: renamed from: l () int
   public int method_2322() {
      return 4;
   }

   // $FF: renamed from: <clinit> () void
   static void method_2408() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.io.IOException) java.io.IOException
   private static IOException method_2414(IOException var0) {
      return var0;
   }
}
