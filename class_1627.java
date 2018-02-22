import com.google.common.base.Charsets;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.authlib.GameProfile;
import java.io.File;
import java.net.SocketAddress;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.Map.Entry;
import net.minecraft.server.MinecraftServer;
import org.apache.logging.log4j.Logger;

// $FF: renamed from: uJ
public abstract class class_1627 {

   // $FF: renamed from: b java.io.File
   public static final File field_8449;
   // $FF: renamed from: c java.io.File
   public static final File field_8450;
   // $FF: renamed from: d java.io.File
   public static final File field_8451;
   // $FF: renamed from: e java.io.File
   public static final File field_8452;
   // $FF: renamed from: f org.apache.logging.log4j.Logger
   private static final Logger field_8453;
   // $FF: renamed from: g java.text.SimpleDateFormat
   private static final SimpleDateFormat field_8454;
   // $FF: renamed from: h net.minecraft.server.MinecraftServer
   private final MinecraftServer field_8455;
   // $FF: renamed from: i java.util.List
   public final List field_8456;
   // $FF: renamed from: k uU
   private final class_1642 field_8457;
   // $FF: renamed from: l uS
   private final class_1644 field_8458;
   // $FF: renamed from: m uT
   private final class_1643 field_8459;
   // $FF: renamed from: n uV
   private final class_1641 field_8460;
   // $FF: renamed from: o java.util.Map
   private final Map field_8461;
   // $FF: renamed from: p kc
   private class_32 field_8462;
   // $FF: renamed from: q boolean
   private boolean field_8463;
   // $FF: renamed from: r int
   protected int field_8464;
   // $FF: renamed from: s int
   private int field_8465;
   // $FF: renamed from: t G
   private class_94 field_8466;
   // $FF: renamed from: u boolean
   private boolean field_8467;
   // $FF: renamed from: v int
   private int field_8468;
   // $FF: renamed from: w java.lang.String
   private static final String field_8469;
   // $FF: renamed from: j java.lang.String[]
   private static final String[] field_8470;


   // $FF: renamed from: <init> (net.minecraft.server.MinecraftServer) void
   public void method_8872(MinecraftServer var1) {
      super();
      this.field_8456 = new ArrayList();
      class_1642 var10001 = new class_1642;
      var10001.method_8987(field_8449);
      this.field_8457 = var10001;
      class_1644 var2 = new class_1644;
      var2.method_8987(field_8450);
      this.field_8458 = var2;
      class_1643 var3 = new class_1643;
      var3.method_8987(field_8451);
      this.field_8459 = var3;
      class_1641 var4 = new class_1641;
      var4.method_8987(field_8452);
      this.field_8460 = var4;
      this.field_8461 = Maps.newHashMap();
      this.field_8455 = var1;
      this.field_8457.method_8989(false);
      this.field_8458.method_8989(false);
      this.field_8464 = 8;
   }

   // $FF: renamed from: b (l, xi) void
   public void method_8873(class_120 var1, class_793 var2) {
      String[] var3;
      GameProfile var4;
      class_1618 var5;
      String var20;
      label74: {
         var4 = var2.method_4599();
         var5 = this.field_8455.method_2403();
         String[] var10000 = class_752.method_4253();
         GameProfile var6 = var5.method_8839(var4.getId());
         var3 = var10000;
         GameProfile var19 = var6;
         if(var3 != null) {
            if(var6 == null) {
               var20 = var4.getName();
               break label74;
            }

            var19 = var6;
         }

         var20 = var19.getName();
      }

      String var7 = var20;
      var5.method_8835(var4);
      class_1583 var8 = this.method_8878(var2);
      var2.method_3885(this.field_8455.method_2340(var2.field_3051));
      var2.field_3656.method_9211((class_354)var2.field_2990);
      String[] var16 = field_8470;
      String var9 = "local";
      if(var3 != null) {
         if(var1.method_557() != null) {
            var9 = var1.method_557().toString();
         }

         Logger var25 = field_8453;
         StringBuilder var10001 = (new StringBuilder()).append(var2.method_64()).append("[").append(var9);
         var16 = field_8470;
         var25.info(var10001.append("] logged in with entity id ").append(var2.method_3845()).append(" at (").append(var2.field_2994).append(", ").append(var2.field_2995).append(", ").append(var2.field_2996).append(")").toString());
      }

      class_354 var10;
      class_1684 var12;
      class_1081 var13;
      label67: {
         var10 = this.field_8455.method_2340(var2.field_3051);
         class_1661 var11 = var10.method_2187();
         this.method_8924(var2, (class_793)null, var10);
         class_1684 var26 = new class_1684;
         var26.method_9287(this.field_8455, var1, var2);
         var12 = var26;
         class_328 var21 = new class_328;
         var21.method_1854(var2.method_3845(), var2.field_3656.method_9200(), var10.method_2195().method_6867(), var10.field_1820.field_5738, var10.field_1818, this.method_8916(), var10.method_2195().method_6868());
         var12.method_9291(var21);
         class_285 var22 = new class_285;
         var16 = field_8470;
         var22.method_1643("MC|Brand", this.method_8921().getServerModName().getBytes(Charsets.UTF_8));
         var12.method_9291(var22);
         class_340 var23 = new class_340;
         var23.method_1925(var11.field_8646, var11.field_8647, var11.field_8648);
         var12.method_9291(var23);
         class_321 var24 = new class_321;
         var24.method_1819(var2.field_3640);
         var12.method_9291(var24);
         class_314 var27 = new class_314;
         var27.method_1788(var2.field_3616.field_2846);
         var12.method_9291(var27);
         var2.method_4656().method_9411();
         var2.method_4656().method_9413(var2);
         this.method_8874((class_1349)var10.method_2220(), var2);
         this.field_8455.method_2405();
         class_1081 var28;
         if(!var2.method_64().equalsIgnoreCase(var7)) {
            var28 = new class_1081;
            var28.method_6126("multiplayer.player.joined.renamed", new Object[]{var2.method_65(), var7});
            var13 = var28;
            if(var3 != null) {
               break label67;
            }
         }

         var28 = new class_1081;
         var16 = field_8470;
         var28.method_6126("multiplayer.player.joined", new Object[]{var2.method_65()});
         var13 = var28;
      }

      var13.method_338().method_8524(class_130.field_290);
      this.method_8928(var13);
      this.method_8880(var2);
      var12.method_9290(var2.field_2994, var2.field_2995, var2.field_2996, var2.field_3000, var2.field_3001);
      this.method_8913(var2, var10);
      if(this.field_8455.method_2366().length() > 0) {
         var2.method_4654(this.field_8455.method_2366());
      }

      Iterator var14 = var2.method_4175().iterator();

      while(true) {
         if(var14.hasNext()) {
            class_1645 var15 = (class_1645)var14.next();
            class_334 var29 = new class_334;
            var29.method_1891(var2.method_3845(), var15);
            var12.method_9291(var29);
            if(var3 == null) {
               break;
            }

            if(var3 != null) {
               continue;
            }
         }

         var2.method_4638();
         break;
      }

      class_1583 var31 = var8;
      if(var3 != null) {
         if(var8 == null) {
            return;
         }

         var31 = var8;
      }

      var16 = field_8470;
      String var30 = "Riding";
      if(var3 != null) {
         if(!var31.initGui8("Riding", 10)) {
            return;
         }

         var31 = var8;
         var30 = "Riding";
      }

      class_689 var18 = class_1775.method_9755(var31.method_8688(var30), var10);
      class_689 var17 = var18;
      if(var3 != null) {
         if(var18 == null) {
            return;
         }

         var18.field_2989 = true;
         var10.method_2089(var18);
         var2.method_3925(var18);
         var17 = var18;
      }

      var17.field_2989 = false;
   }

   // $FF: renamed from: b (km, xi) void
   protected void method_8874(class_1349 var1, class_793 var2) {
      String[] var10000 = class_752.method_4253();
      HashSet var4 = new HashSet();
      String[] var3 = var10000;
      Iterator var5 = var1.method_7180().iterator();

      while(var5.hasNext()) {
         class_1351 var6 = (class_1351)var5.next();
         class_1684 var11 = var2.field_3654;
         class_305 var10001 = new class_305;
         var10001.method_1737(var6, 0);
         var11.method_9291(var10001);
         if(var3 == null) {
            break;
         }
      }

      int var12 = 0;

      while(var12 < 3) {
         class_1344 var7 = var1.method_7172(var12);
         if(var3 != null) {
            label35: {
               if(var7 != null && !var4.contains(var7)) {
                  List var8 = var1.method_7197(var7);
                  Iterator var9 = var8.iterator();

                  while(var9.hasNext()) {
                     class_250 var10 = (class_250)var9.next();
                     var2.field_3654.method_9291(var10);
                     if(var3 == null) {
                        break label35;
                     }

                     if(var3 == null) {
                        break;
                     }
                  }

                  var4.add(var7);
               }

               ++var12;
            }
         }

         if(var3 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: b (dk[]) void
   public void method_8875(class_354[] var1) {
      this.field_8462 = var1[0].method_2194().method_130();
   }

   // $FF: renamed from: b (xi, dk) void
   public void method_8876(class_793 var1, class_354 var2) {
      String[] var10000 = class_752.method_4253();
      class_354 var4 = var1.method_4650();
      String[] var3 = var10000;
      class_354 var5 = var2;
      if(var3 != null) {
         if(var2 != null) {
            var2.method_2257().method_9138(var1);
         }

         var4.method_2257().method_9136(var1);
         var5 = var4;
      }

      var5.field_1855.method_105((int)var1.field_2994 >> 4, (int)var1.field_2996 >> 4);
   }

   // $FF: renamed from: a () int
   public int method_8877() {
      return class_1660.method_9143(this.method_8920());
   }

   // $FF: renamed from: b (xi) ro
   public class_1583 method_8878(class_793 var1) {
      class_1583 var4;
      class_1583 var5;
      label18: {
         String[] var10000 = class_752.method_4253();
         class_1583 var3 = this.field_8455.field_1927[0].method_2195().method_6843();
         String[] var2 = var10000;
         if(var1.method_64().equals(this.field_8455.method_2351())) {
            var5 = var3;
            if(var2 == null) {
               break label18;
            }

            if(var3 != null) {
               var1.method_3905(var3);
               var4 = var3;
               String[] var10001 = field_8470;
               field_8453.debug("loading single player");
               if(var2 != null) {
                  return var4;
               }
            }
         }

         var5 = this.field_8462.method_151(var1);
      }

      var4 = var5;
      return var4;
   }

   // $FF: renamed from: c (xi) void
   protected void method_8879(class_793 var1) {
      this.field_8462.method_150(var1);
      String[] var10000 = class_752.method_4253();
      class_1700 var3 = (class_1700)this.field_8461.get(var1.method_3972());
      String[] var2 = var10000;
      class_1700 var4 = var3;
      if(var2 != null) {
         if(var3 == null) {
            return;
         }

         var4 = var3;
      }

      var4.method_9407();
   }

   // $FF: renamed from: d (xi) void
   public void method_8880(class_793 var1) {
      String[] var10000 = class_752.method_4253();
      class_320 var10002 = new class_320;
      var10002.method_1814(var1.method_64(), true, 1000);
      this.method_8889(var10002);
      String[] var2 = var10000;
      this.field_8456.add(var1);
      class_354 var3 = this.field_8455.method_2340(var1.field_3051);
      var3.method_2089(var1);
      this.method_8876(var1, (class_354)null);
      int var4 = 0;

      while(var4 < this.field_8456.size()) {
         class_793 var5 = (class_793)this.field_8456.get(var4);
         class_1684 var6 = var1.field_3654;
         class_320 var10001 = new class_320;
         var10001.method_1814(var5.method_64(), true, var5.field_3673);
         var6.method_9291(var10001);
         ++var4;
         if(var2 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: e (xi) void
   public void method_8881(class_793 var1) {
      var1.method_4650().method_2257().method_9140(var1);
   }

   // $FF: renamed from: f (xi) void
   public void method_8882(class_793 var1) {
      String[] var10000 = class_752.method_4253();
      var1.method_4614(class_1698.field_8885);
      this.method_8879(var1);
      class_354 var3 = var1.method_4650();
      String[] var2 = var10000;
      if(var2 != null) {
         if(var1.field_2988 != null) {
            var3.method_2093(var1.field_2988);
            String[] var10001 = field_8470;
            field_8453.debug("removing player mount");
         }

         var3.method_2092(var1);
         var3.method_2257().method_9138(var1);
         this.field_8456.remove(var1);
         this.field_8461.remove(var1.method_3972());
      }

      class_320 var4 = new class_320;
      var4.method_1814(var1.method_64(), false, 9999);
      this.method_8889(var4);
   }

   // $FF: renamed from: b (java.net.SocketAddress, com.mojang.authlib.GameProfile) java.lang.String
   public String method_8883(SocketAddress var1, GameProfile var2) {
      String[] var3 = class_752.method_4253();
      int var10000 = this.field_8457.method_9003(var2);
      String var4;
      String[] var6;
      StringBuilder var10;
      if(var3 != null) {
         if(var10000 != 0) {
            class_1633 var7 = (class_1633)this.field_8457.method_8991(var2);
            var10 = new StringBuilder();
            var6 = field_8470;
            var4 = var10.append("You are banned from this server!\nReason: ").append(var7.method_8952()).toString();
            if(var7.method_8951() != null) {
               var4 = var4 + "\nYour ban will be removed on " + field_8454.format(var7.method_8951());
            }

            return var4;
         }

         var10000 = this.method_8898(var2);
      }

      if(var3 != null) {
         if(var10000 == 0) {
            var6 = field_8470;
            return "You are not white-listed on this server!";
         }

         var10000 = this.field_8458.method_9008(var1);
      }

      if(var3 != null) {
         if(var10000 != 0) {
            class_1634 var5 = this.field_8458.method_9009(var1);
            var10 = new StringBuilder();
            var6 = field_8470;
            var4 = var10.append("Your IP address is banned from this server!\nReason: ").append(var5.method_8952()).toString();
            if(var5.method_8951() != null) {
               var4 = var4 + "\nYour ban will be removed on " + field_8454.format(var5.method_8951());
            }

            return var4;
         }

         var10000 = this.field_8456.size();
      }

      String var9;
      if(var10000 >= this.field_8464) {
         String[] var8 = field_8470;
         var9 = "The server is full!";
      } else {
         var9 = null;
      }

      return var9;
   }

   // $FF: renamed from: a (com.mojang.authlib.GameProfile) xi
   public class_793 method_8884(GameProfile var1) {
      String[] var10000 = class_752.method_4253();
      UUID var3 = class_792.method_4635(var1);
      ArrayList var4 = Lists.newArrayList();
      int var6 = 0;
      String[] var2 = var10000;

      class_793 var5;
      while(var6 < this.field_8456.size()) {
         var5 = (class_793)this.field_8456.get(var6);
         if(var2 != null) {
            if(var5.method_3972().equals(var3)) {
               var4.add(var5);
            }

            ++var6;
         }

         if(var2 == null) {
            break;
         }
      }

      Iterator var11 = var4.iterator();

      Object var7;
      label32: {
         while(true) {
            if(var11.hasNext()) {
               var5 = (class_793)var11.next();
               String[] var10001 = field_8470;
               var5.field_3654.method_9289("You logged in from another location");
               if(var2 == null) {
                  break;
               }

               if(var2 != null) {
                  continue;
               }
            }

            if(this.field_8455.method_2361()) {
               class_1669 var8 = new class_1669;
               var8.method_9198(this.field_8455.method_2340(0));
               var7 = var8;
               if(var2 != null) {
                  break label32;
               }
            }
            break;
         }

         class_1668 var9 = new class_1668;
         var9.method_9198(this.field_8455.method_2340(0));
         var7 = var9;
      }

      class_793 var10 = new class_793;
      var10.method_4637(this.field_8455, this.field_8455.method_2340(0), var1, (class_1668)var7);
      return var10;
   }

   // $FF: renamed from: b (xi, int, boolean) xi
   public class_793 method_8885(class_793 var1, int var2, boolean var3) {
      String[] var4;
      class_1661 var5;
      boolean var6;
      Object var7;
      label47: {
         var1.method_4650().method_2256().method_9121(var1);
         var1.method_4650().method_2256().method_9117(var1);
         var1.method_4650().method_2257().method_9138(var1);
         this.field_8456.remove(var1);
         this.field_8455.method_2340(var1.field_3051).method_2093(var1);
         var5 = var1.method_4611();
         String[] var10000 = class_752.method_4253();
         var6 = var1.method_4612();
         var4 = var10000;
         var1.field_3051 = var2;
         if(this.field_8455.method_2361()) {
            class_1669 var11 = new class_1669;
            var11.method_9198(this.field_8455.method_2340(var1.field_3051));
            var7 = var11;
            if(var4 != null) {
               break label47;
            }
         }

         class_1668 var12 = new class_1668;
         var12.method_9198(this.field_8455.method_2340(var1.field_3051));
         var7 = var12;
      }

      class_793 var8;
      class_354 var9;
      class_1661 var10;
      class_1684 var18;
      label50: {
         class_793 var13 = new class_793;
         var13.method_4637(this.field_8455, this.field_8455.method_2340(var1.field_3051), var1.method_4599(), (class_1668)var7);
         var8 = var13;
         var8.field_3654 = var1.field_3654;
         var8.method_4629(var1, var3);
         var8.method_3846(var1.method_3845());
         var9 = this.field_8455.method_2340(var1.field_3051);
         this.method_8924(var8, var1, var9);
         class_1661 var14 = var5;
         if(var4 != null) {
            if(var5 == null) {
               break label50;
            }

            var14 = class_792.method_4604(this.field_8455.method_2340(var1.field_3051), var5, var6);
         }

         label36: {
            var10 = var14;
            if(var4 != null) {
               if(var10 == null) {
                  break label36;
               }

               var8.method_3887((double)((float)var10.field_8646 + 0.5F), (double)((float)var10.field_8647 + 0.1F), (double)((float)var10.field_8648 + 0.5F), 0.0F, 0.0F);
               var8.method_4613(var5, var6);
            }

            if(var4 != null) {
               break label50;
            }
         }

         var18 = var8.field_3654;
         class_281 var10001 = new class_281;
         var10001.method_1621(0, 0.0F);
         var18.method_9291(var10001);
      }

      var9.field_1855.method_105((int)var8.field_2994 >> 4, (int)var8.field_2996 >> 4);

      while(true) {
         if(!var9.method_2096(var8, var8.field_3004).isEmpty()) {
            var8.method_3854(var8.field_2994, var8.field_2995 + 1.0D, var8.field_2996);
            if(var4 == null) {
               break;
            }

            if(var4 != null) {
               continue;
            }
         }

         var18 = var8.field_3654;
         class_316 var15 = new class_316;
         var15.method_1795(var8.field_3051, var8.field_2990.field_1818, var8.field_2990.method_2195().method_6868(), var8.field_3656.method_9200());
         var18.method_9291(var15);
         break;
      }

      var10 = var9.method_2187();
      var8.field_3654.method_9290(var8.field_2994, var8.field_2995, var8.field_2996, var8.field_3000, var8.field_3001);
      var18 = var8.field_3654;
      class_340 var16 = new class_340;
      var16.method_1925(var10.field_8646, var10.field_8647, var10.field_8648);
      var18.method_9291(var16);
      var18 = var8.field_3654;
      class_308 var17 = new class_308;
      var17.method_1758(var8.field_3643, var8.field_3642, var8.field_3641);
      var18.method_9291(var17);
      this.method_8913(var8, var9);
      var9.method_2257().method_9136(var8);
      var9.method_2089(var8);
      this.field_8456.add(var8);
      var8.method_4638();
      var8.method_4188(var8.method_406());
      return var8;
   }

   // $FF: renamed from: b (xi, int) void
   public void method_8886(class_793 var1, int var2) {
      int var4 = var1.field_3051;
      class_354 var5 = this.field_8455.method_2340(var1.field_3051);
      var1.field_3051 = var2;
      class_354 var6 = this.field_8455.method_2340(var1.field_3051);
      class_1684 var10000 = var1.field_3654;
      class_316 var10001 = new class_316;
      var10001.method_1795(var1.field_3051, var1.field_2990.field_1818, var1.field_2990.method_2195().method_6868(), var1.field_3656.method_9200());
      var10000.method_9291(var10001);
      var5.method_2093(var1);
      var1.field_3012 = false;
      this.method_8887(var1, var4, var5, var6);
      this.method_8876(var1, var5);
      var1.field_3654.method_9290(var1.field_2994, var1.field_2995, var1.field_2996, var1.field_3000, var1.field_3001);
      String[] var9 = class_752.method_4253();
      var1.field_3656.method_9211(var6);
      String[] var3 = var9;
      this.method_8913(var1, var6);
      this.method_8914(var1);
      Iterator var7 = var1.method_4175().iterator();

      while(var7.hasNext()) {
         class_1645 var8 = (class_1645)var7.next();
         var10000 = var1.field_3654;
         class_334 var10 = new class_334;
         var10.method_1891(var1.method_3845(), var8);
         var10000.method_9291(var10);
         if(var3 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: b (sa, int, dk, dk) void
   public void method_8887(class_689 var1, int var2, class_354 var3, class_354 var4) {
      String[] var5;
      double var6;
      double var8;
      double var12;
      double var14;
      double var16;
      float var18;
      int var21;
      label74: {
         label75: {
            String[] var10000 = class_752.method_4253();
            var6 = var1.field_2994;
            var8 = var1.field_2996;
            double var10 = 8.0D;
            var5 = var10000;
            var12 = var1.field_2994;
            var14 = var1.field_2995;
            var16 = var1.field_2996;
            var18 = var1.field_3000;
            String[] var20 = field_8470;
            var3.field_1829.method_8332("moving");
            var21 = var1.field_3051;
            if(var5 != null) {
               if(var1.field_3051 == -1) {
                  var6 /= var10;
                  var8 /= var10;
                  var1.method_3887(var6, var1.field_2995, var8, var1.field_3000, var1.field_3001);
                  var21 = var1.method_3917();
                  if(var5 == null) {
                     break label74;
                  }

                  if(var21 == 0) {
                     break label75;
                  }

                  var3.method_2116(var1, false);
                  if(var5 != null) {
                     break label75;
                  }
               }

               var21 = var1.field_3051;
            }

            if(var5 != null) {
               if(var21 == 0) {
                  var6 *= var10;
                  var8 *= var10;
                  var1.method_3887(var6, var1.field_2995, var8, var1.field_3000, var1.field_3001);
                  var21 = var1.method_3917();
                  if(var5 == null) {
                     break label74;
                  }

                  if(var21 == 0) {
                     break label75;
                  }

                  var3.method_2116(var1, false);
                  if(var5 != null) {
                     break label75;
                  }
               }

               var21 = var2;
            }

            class_1661 var19;
            label42: {
               if(var21 == 1) {
                  var19 = var4.method_2187();
                  if(var5 != null) {
                     break label42;
                  }
               }

               var19 = var4.method_2248();
            }

            var6 = (double)var19.field_8646;
            var1.field_2995 = (double)var19.field_8647;
            var8 = (double)var19.field_8648;
            var1.method_3887(var6, var1.field_2995, var8, 90.0F, 0.0F);
            var21 = var1.method_3917();
            if(var5 == null) {
               break label74;
            }

            if(var21 != 0) {
               var3.method_2116(var1, false);
            }
         }

         var3.field_1829.method_8333();
         if(var5 == null) {
            return;
         }

         var21 = var2;
      }

      if(var21 != 1) {
         class_1535 var22 = var3.field_1829;
         if(var5 != null) {
            String[] var10001 = field_8470;
            var3.field_1829.method_8332("placing");
            var6 = (double)class_1715.method_9568((int)var6, -29999872, 29999872);
            var8 = (double)class_1715.method_9568((int)var8, -29999872, 29999872);
            if(var1.method_3917()) {
               var1.method_3887(var6, var1.field_2995, var8, var1.field_3000, var1.field_3001);
               var4.method_2258().method_5944(var1, var12, var14, var16, var18);
               var4.method_2089(var1);
               var4.method_2116(var1, false);
            }

            var22 = var3.field_1829;
         }

         var22.method_8333();
      }

      var1.method_3885(var4);
   }

   // $FF: renamed from: b () void
   public void method_8888() {
      Object var3;
      label25: {
         String[] var1 = class_752.method_4253();
         int var10000 = ++this.field_8468;
         int var10001 = 600;
         if(var1 != null) {
            if(var10000 > 600) {
               this.field_8468 = 0;
            }

            var3 = this;
            if(var1 == null) {
               break label25;
            }

            var10000 = this.field_8468;
            var10001 = this.field_8456.size();
         }

         if(var10000 >= var10001) {
            return;
         }

         var3 = this.field_8456.get(this.field_8468);
      }

      class_793 var2 = (class_793)var3;
      class_320 var4 = new class_320;
      var4.method_1814(var2.method_64(), true, var2.field_3673);
      this.method_8889(var4);
   }

   // $FF: renamed from: b (r1) void
   public void method_8889(class_250 var1) {
      String[] var10000 = class_752.method_4253();
      int var3 = 0;
      String[] var2 = var10000;

      while(var3 < this.field_8456.size()) {
         ((class_793)this.field_8456.get(var3)).field_3654.method_9291(var1);
         ++var3;
         if(var2 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: b (r1, int) void
   public void method_8890(class_250 var1, int var2) {
      String[] var10000 = class_752.method_4253();
      int var4 = 0;
      String[] var3 = var10000;

      while(var4 < this.field_8456.size()) {
         class_793 var5 = (class_793)this.field_8456.get(var4);
         if(var3 != null) {
            if(var5.field_3051 == var2) {
               var5.field_3654.method_9291(var1);
            }

            ++var4;
         }

         if(var3 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: a (boolean) java.lang.String
   public String method_8891(boolean var1) {
      String var3 = "";
      ArrayList var4 = Lists.newArrayList(this.field_8456);
      String[] var10000 = class_752.method_4253();
      int var5 = 0;
      String[] var2 = var10000;

      while(var5 < var4.size()) {
         label35: {
            int var7 = var5;
            StringBuilder var8;
            if(var2 != null) {
               if(var5 > 0) {
                  var8 = (new StringBuilder()).append(var3);
                  String[] var6 = field_8470;
                  var3 = var8.append(", ").toString();
               }

               var3 = var3 + ((class_793)var4.get(var5)).method_64();
               if(var2 == null) {
                  break label35;
               }

               var7 = var1;
            }

            if(var7 != 0) {
               var8 = (new StringBuilder()).append(var3);
               String[] var10001 = field_8470;
               var3 = var8.append(" (").append(((class_793)var4.get(var5)).method_3972().toString()).append(")").toString();
            }

            ++var5;
         }

         if(var2 == null) {
            break;
         }
      }

      return var3;
   }

   // $FF: renamed from: c () java.lang.String[]
   public String[] method_8892() {
      String[] var10000 = class_752.method_4253();
      String[] var2 = new String[this.field_8456.size()];
      String[] var1 = var10000;
      int var3 = 0;

      while(true) {
         if(var3 < this.field_8456.size()) {
            var10000 = var2;
            if(var1 == null) {
               break;
            }

            var2[var3] = ((class_793)this.field_8456.get(var3)).method_64();
            ++var3;
            if(var1 != null) {
               continue;
            }
         }

         var10000 = var2;
         break;
      }

      return var10000;
   }

   // $FF: renamed from: d () com.mojang.authlib.GameProfile[]
   public GameProfile[] method_8893() {
      String[] var10000 = class_752.method_4253();
      GameProfile[] var2 = new GameProfile[this.field_8456.size()];
      String[] var1 = var10000;
      int var3 = 0;

      GameProfile[] var4;
      while(true) {
         if(var3 < this.field_8456.size()) {
            var4 = var2;
            if(var1 == null) {
               break;
            }

            var2[var3] = ((class_793)this.field_8456.get(var3)).method_4599();
            ++var3;
            if(var1 != null) {
               continue;
            }
         }

         var4 = var2;
         break;
      }

      return var4;
   }

   // $FF: renamed from: e () uU
   public class_1642 method_8894() {
      return this.field_8457;
   }

   // $FF: renamed from: f () uS
   public class_1644 method_8895() {
      return this.field_8458;
   }

   // $FF: renamed from: b (com.mojang.authlib.GameProfile) void
   public void method_8896(GameProfile var1) {
      class_1643 var10000 = this.field_8459;
      class_1631 var10001 = new class_1631;
      var10001.method_8944(var1, this.field_8455.method_2322());
      var10000.method_8990(var10001);
   }

   // $FF: renamed from: c (com.mojang.authlib.GameProfile) void
   public void method_8897(GameProfile var1) {
      this.field_8459.method_8992(var1);
   }

   // $FF: renamed from: d (com.mojang.authlib.GameProfile) boolean
   public boolean method_8898(GameProfile var1) {
      String[] var2 = class_752.method_4253();
      boolean var10000 = this.field_8463;
      if(var2 != null) {
         if(this.field_8463) {
            var10000 = this.field_8459.method_8995(var1);
            if(var2 == null) {
               return var10000;
            }

            if(!var10000) {
               var10000 = this.field_8460.method_8995(var1);
               if(var2 == null) {
                  return var10000;
               }

               if(!var10000) {
                  var10000 = false;
                  return var10000;
               }
            }
         }

         var10000 = true;
      }

      return var10000;
   }

   // $FF: renamed from: e (com.mojang.authlib.GameProfile) boolean
   public boolean method_8899(GameProfile var1) {
      String[] var2 = class_752.method_4253();
      boolean var10000 = this.field_8459.method_8995(var1);
      if(var2 != null) {
         if(!var10000) {
            label39: {
               var10000 = this.field_8455.method_2353();
               if(var2 != null) {
                  label32: {
                     if(var10000) {
                        var10000 = this.field_8455.field_1927[0].method_2195().method_6871();
                        if(var2 == null) {
                           break label32;
                        }

                        if(var10000) {
                           var10000 = this.field_8455.method_2351().equalsIgnoreCase(var1.getName());
                           if(var2 == null) {
                              return var10000;
                           }

                           if(var10000) {
                              break label39;
                           }
                        }
                     }

                     var10000 = this.field_8467;
                  }
               }

               if(var2 == null) {
                  return var10000;
               }

               if(!var10000) {
                  var10000 = false;
                  return var10000;
               }
            }
         }

         var10000 = true;
      }

      return var10000;
   }

   // $FF: renamed from: b (java.lang.String) xi
   public class_793 method_8900(String var1) {
      Iterator var2 = this.field_8456.iterator();

      while(var2.hasNext()) {
         class_793 var3 = (class_793)var2.next();
         if(var3.method_64().equalsIgnoreCase(var1)) {
            return var3;
         }
      }

      return null;
   }

   // $FF: renamed from: b (vF, int, int, int, int, int, int, java.util.Map, java.lang.String, java.lang.String, ahb) java.util.List
   public List method_8901(class_1661 var1, int var2, int var3, int var4, int var5, int var6, int var7, Map var8, String var9, String var10, ahb var11) {
      String[] var12 = class_752.method_4253();
      List var10000 = this.field_8456;
      if(var12 != null) {
         if(!this.field_8456.isEmpty()) {
            Object var13 = new ArrayList();
            int var23 = var4;
            if(var12 != null) {
               var23 = var4 < 0?1:0;
            }

            int var14;
            String var24;
            byte var26;
            label233: {
               label241: {
                  var14 = var23;
                  var24 = var9;
                  if(var12 != null) {
                     if(var9 == null) {
                        break label241;
                     }

                     var24 = var9;
                  }

                  var26 = var24.startsWith("!");
                  if(var12 == null) {
                     break label233;
                  }

                  if(var26 != 0) {
                     var26 = 1;
                     break label233;
                  }
               }

               var26 = 0;
            }

            byte var15;
            label222: {
               label242: {
                  var15 = var26;
                  var24 = var10;
                  if(var12 != null) {
                     if(var10 == null) {
                        break label242;
                     }

                     var24 = var10;
                  }

                  var26 = var24.startsWith("!");
                  if(var12 == null) {
                     break label222;
                  }

                  if(var26 != 0) {
                     var26 = 1;
                     break label222;
                  }
               }

               var26 = 0;
            }

            byte var16 = var26;
            int var17 = var2 * var2;
            int var18 = var3 * var3;
            var4 = class_1715.method_9565(var4);
            var26 = var15;
            if(var12 != null) {
               if(var15 != 0) {
                  var9 = var9.substring(1);
               }

               var26 = var16;
            }

            if(var12 != null) {
               if(var26 != 0) {
                  var10 = var10.substring(1);
               }

               var26 = 0;
            }

            int var19 = var26;

            while(true) {
               if(var19 < this.field_8456.size()) {
                  class_793 var20 = (class_793)this.field_8456.get(var19);
                  if(var12 == null) {
                     break;
                  }

                  label251: {
                     label204: {
                        ahb var28 = var11;
                        if(var12 != null) {
                           if(var11 == null) {
                              break label204;
                           }

                           var28 = var20.field_2990;
                        }

                        if(var28 != var11) {
                           break label251;
                        }
                     }

                     var24 = var9;
                     if(var12 != null) {
                        if(var9 != null && var15 == var9.equalsIgnoreCase(var20.method_64())) {
                           break label251;
                        }

                        var24 = var10;
                     }

                     if(var24 != null) {
                        label185: {
                           class_1350 var21 = var20.method_4247();
                           class_1350 var29 = var21;
                           if(var12 != null) {
                              if(var21 == null) {
                                 var24 = "";
                                 break label185;
                              }

                              var29 = var21;
                           }

                           var24 = var29.method_7296();
                        }

                        String var22 = var24;
                        if(var16 == var10.equalsIgnoreCase(var22) && var12 != null) {
                           break label251;
                        }
                     }

                     label179: {
                        if(var1 != null) {
                           label245: {
                              label246: {
                                 var23 = var2;
                                 if(var12 != null) {
                                    if(var2 > 0) {
                                       break label246;
                                    }

                                    var23 = var3;
                                 }

                                 if(var12 == null) {
                                    break label179;
                                 }

                                 if(var23 <= 0) {
                                    break label245;
                                 }
                              }

                              float var27 = var1.method_9156(var20.method_68());
                              var23 = var2;
                              if(var12 != null) {
                                 label159: {
                                    if(var2 > 0) {
                                       float var30;
                                       var23 = (var30 = var27 - (float)var17) == 0.0F?0:(var30 < 0.0F?-1:1);
                                       if(var12 == null) {
                                          break label159;
                                       }

                                       if(var23 < 0) {
                                          break label251;
                                       }
                                    }

                                    var23 = var3;
                                 }
                              }

                              if(var12 == null) {
                                 break label179;
                              }

                              if(var23 > 0) {
                                 float var31;
                                 var23 = (var31 = var27 - (float)var18) == 0.0F?0:(var31 < 0.0F?-1:1);
                                 if(var12 == null) {
                                    break label179;
                                 }

                                 if(var23 > 0 && var12 != null) {
                                    break label251;
                                 }
                              }
                           }
                        }

                        var23 = this.method_8902(var20, var8);
                     }

                     if(var12 != null) {
                        if(var23 == 0) {
                           break label251;
                        }

                        var23 = var5;
                     }

                     if(var12 != null) {
                        label143: {
                           if(var23 != class_94.field_44.method_443()) {
                              var23 = var5;
                              if(var12 == null) {
                                 break label143;
                              }

                              if(var5 != var20.field_3656.method_9200().method_443()) {
                                 break label251;
                              }
                           }

                           var23 = var6;
                        }
                     }

                     int var10001;
                     label248: {
                        if(var12 != null) {
                           if(var23 > 0) {
                              var23 = var20.field_3641;
                              var10001 = var6;
                              if(var12 == null) {
                                 break label248;
                              }

                              if(var20.field_3641 < var6) {
                                 break label251;
                              }
                           }

                           var23 = var20.field_3641;
                        }

                        if(var12 == null) {
                           break label251;
                        }

                        var10001 = var7;
                     }

                     if(var23 <= var10001) {
                        ((List)var13).add(var20);
                     }
                  }

                  ++var19;
                  if(var12 != null) {
                     continue;
                  }
               }

               if(var1 != null) {
                  var10000 = (List)var13;
                  class_1593 var25 = new class_1593;
                  var25.method_8724(var1);
                  Collections.sort(var10000, var25);
               }
               break;
            }

            var23 = var14;
            if(var12 != null) {
               if(var14 != 0) {
                  Collections.reverse((List)var13);
               }

               var23 = var4;
            }

            if(var23 > 0) {
               var13 = ((List)var13).subList(0, Math.min(var4, ((List)var13).size()));
            }

            return (List)var13;
         }

         var10000 = Collections.emptyList();
      }

      return var10000;
   }

   // $FF: renamed from: b (yz, java.util.Map) boolean
   private boolean method_8902(class_792 var1, Map var2) {
      int var13;
      label85: {
         String[] var3 = class_752.method_4253();
         Map var10000 = var2;
         if(var3 != null) {
            if(var2 == null) {
               break label85;
            }

            var10000 = var2;
         }

         var13 = var10000.size();
         if(var3 == null) {
            return (boolean)var13;
         }

         if(var13 != 0) {
            Iterator var4 = var2.entrySet().iterator();

            boolean var12;
            while(true) {
               if(!var4.hasNext()) {
                  var12 = true;
                  break;
               }

               Entry var5;
               int var6;
               String var8;
               label88: {
                  var5 = (Entry)var4.next();
                  var8 = (String)var5.getKey();
                  var6 = 0;
                  String[] var10001 = field_8470;
                  var13 = var8.endsWith("_min");
                  if(var3 != null) {
                     if(var13 == 0) {
                        break label88;
                     }

                     var13 = var8.length();
                  }

                  if(var3 != null) {
                     if(var13 <= 4) {
                        break label88;
                     }

                     var13 = 1;
                  }

                  var6 = var13;
                  var8 = var8.substring(0, var8.length() - 4);
               }

               class_1348 var9 = var1.method_4634();
               class_1344 var10 = var9.method_7160(var8);
               if(var10 == null) {
                  return false;
               }

               label89: {
                  class_1345 var11 = var1.method_4634().method_7163(var1.method_64(), var10);
                  int var7 = var11.writeText2();
                  var13 = var7;
                  int var14 = ((Integer)var5.getValue()).intValue();
                  if(var3 != null) {
                     label50: {
                        if(var7 < var14) {
                           var13 = var6;
                           if(var3 == null) {
                              break label50;
                           }

                           if(var6 != 0) {
                              return false;
                           }
                        }

                        var13 = var7;
                     }

                     if(var3 == null) {
                        break label89;
                     }

                     var14 = ((Integer)var5.getValue()).intValue();
                  }

                  if(var13 <= var14) {
                     continue;
                  }

                  var13 = var6;
               }

               if(var13 == 0) {
                  var12 = false;
                  if(var3 != null) {
                     return false;
                  }
                  break;
               }
            }

            return var12;
         }
      }

      var13 = 1;
      return (boolean)var13;
   }

   // $FF: renamed from: b (double, double, double, double, int, r1) void
   public void method_8903(double var1, double var3, double var5, double var7, int var9, class_250 var10) {
      this.method_8904((class_792)null, var1, var3, var5, var7, var9, var10);
   }

   // $FF: renamed from: b (yz, double, double, double, double, int, r1) void
   public void method_8904(class_792 var1, double var2, double var4, double var6, double var8, int var10, class_250 var11) {
      String[] var10000 = class_752.method_4253();
      int var13 = 0;
      String[] var12 = var10000;

      while(var13 < this.field_8456.size()) {
         class_793 var14 = (class_793)this.field_8456.get(var13);
         if(var12 != null) {
            label24: {
               if(var14 != var1 && var14.field_3051 == var10) {
                  double var15 = var2 - var14.field_2994;
                  double var17 = var4 - var14.field_2995;
                  double var19 = var6 - var14.field_2996;
                  if(var12 == null) {
                     break label24;
                  }

                  if(var15 * var15 + var17 * var17 + var19 * var19 < var8 * var8) {
                     var14.field_3654.method_9291(var11);
                  }
               }

               ++var13;
            }
         }

         if(var12 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: g () void
   public void method_8905() {
      String[] var10000 = class_752.method_4253();
      int var2 = 0;
      String[] var1 = var10000;

      while(var2 < this.field_8456.size()) {
         this.method_8879((class_793)this.field_8456.get(var2));
         ++var2;
         if(var1 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: f (com.mojang.authlib.GameProfile) void
   public void method_8906(GameProfile var1) {
      class_1641 var10000 = this.field_8460;
      class_1630 var10001 = new class_1630;
      var10001.method_8939(var1);
      var10000.method_8990(var10001);
   }

   // $FF: renamed from: g (com.mojang.authlib.GameProfile) void
   public void method_8907(GameProfile var1) {
      this.field_8460.method_8992(var1);
   }

   // $FF: renamed from: h () uV
   public class_1641 method_8908() {
      return this.field_8460;
   }

   // $FF: renamed from: i () java.lang.String[]
   public String[] method_8909() {
      return this.field_8460.method_8993();
   }

   // $FF: renamed from: j () uT
   public class_1643 method_8910() {
      return this.field_8459;
   }

   // $FF: renamed from: k () java.lang.String[]
   public String[] method_8911() {
      return this.field_8459.method_8993();
   }

   // $FF: renamed from: l () void
   public void method_8912() {}

   // $FF: renamed from: c (xi, dk) void
   public void method_8913(class_793 var1, class_354 var2) {
      String[] var10000 = class_752.method_4253();
      class_1684 var10001 = var1.field_3654;
      class_339 var10002 = new class_339;
      long var10004 = var2.method_2184();
      long var10005 = var2.method_2185();
      class_1038 var10006 = var2.method_2196();
      String[] var10007 = field_8470;
      var10002.method_1921(var10004, var10005, var10006.method_5878("doDaylightCycle"));
      var10001.method_9291(var10002);
      String[] var3 = var10000;
      class_1684 var4;
      class_281 var5;
      if(var3 != null) {
         if(!var2.method_2203()) {
            return;
         }

         var4 = var1.field_3654;
         var5 = new class_281;
         var5.method_1621(1, 0.0F);
         var4.method_9291(var5);
         var4 = var1.field_3654;
         var5 = new class_281;
         var5.method_1621(7, var2.method_2200(1.0F));
         var4.method_9291(var5);
      }

      var4 = var1.field_3654;
      var5 = new class_281;
      var5.method_1621(8, var2.method_2198(1.0F));
      var4.method_9291(var5);
   }

   // $FF: renamed from: g (xi) void
   public void method_8914(class_793 var1) {
      var1.method_4644(var1.field_3618);
      var1.method_4649();
      class_1684 var10000 = var1.field_3654;
      class_314 var10001 = new class_314;
      var10001.method_1788(var1.field_3616.field_2846);
      var10000.method_9291(var10001);
   }

   // $FF: renamed from: m () int
   public int method_8915() {
      return this.field_8456.size();
   }

   // $FF: renamed from: n () int
   public int method_8916() {
      return this.field_8464;
   }

   // $FF: renamed from: o () java.lang.String[]
   public String[] method_8917() {
      return this.field_8455.field_1927[0].method_2194().method_130().method_152();
   }

   // $FF: renamed from: b (boolean) void
   public void method_8918(boolean var1) {
      this.field_8463 = var1;
   }

   // $FF: renamed from: c (java.lang.String) java.util.List
   public List method_8919(String var1) {
      String[] var10000 = class_752.method_4253();
      ArrayList var3 = new ArrayList();
      String[] var2 = var10000;
      Iterator var4 = this.field_8456.iterator();

      while(var4.hasNext()) {
         class_793 var5 = (class_793)var4.next();
         if(var2 != null && var5.method_4651().equals(var1)) {
            var3.add(var5);
         }

         if(var2 == null) {
            break;
         }
      }

      return var3;
   }

   // $FF: renamed from: p () int
   public int method_8920() {
      return this.field_8465;
   }

   // $FF: renamed from: q () net.minecraft.server.MinecraftServer
   public MinecraftServer method_8921() {
      return this.field_8455;
   }

   // $FF: renamed from: r () ro
   public class_1583 method_8922() {
      return null;
   }

   // $FF: renamed from: b (G) void
   public void method_8923(class_94 var1) {
      this.field_8466 = var1;
   }

   // $FF: renamed from: b (xi, xi, ahb) void
   private void method_8924(class_793 var1, class_793 var2, ahb var3) {
      label19: {
         label18: {
            String[] var4 = class_752.method_4253();
            class_793 var10000 = var2;
            if(var4 != null) {
               if(var2 == null) {
                  break label18;
               }

               var10000 = var1;
            }

            var10000.field_3656.method_9199(var2.field_3656.method_9200());
            if(var4 != null) {
               break label19;
            }
         }

         if(this.field_8466 != null) {
            var1.field_3656.method_9199(this.field_8466);
         }
      }

      var1.field_3656.method_9202(var3.method_2195().method_6864());
   }

   // $FF: renamed from: d (boolean) void
   public void method_8925(boolean var1) {
      this.field_8467 = var1;
   }

   // $FF: renamed from: s () void
   public void method_8926() {
      String[] var10000 = class_752.method_4253();
      int var2 = 0;
      String[] var1 = var10000;

      while(var2 < this.field_8456.size()) {
         String[] var10001 = field_8470;
         ((class_793)this.field_8456.get(var2)).field_3654.method_9289("Server closed");
         ++var2;
         if(var1 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: b (rV, boolean) void
   public void method_8927(class_66 var1, boolean var2) {
      this.field_8455.method_66(var1);
      class_293 var10001 = new class_293;
      var10001.method_1684(var1, var2);
      this.method_8889(var10001);
   }

   // $FF: renamed from: b (rV) void
   public void method_8928(class_66 var1) {
      this.method_8927(var1, true);
   }

   // $FF: renamed from: b (yz) ve
   public class_1700 method_8929(class_792 var1) {
      String[] var2;
      UUID var3;
      class_1700 var10;
      label41: {
         String[] var10000 = class_752.method_4253();
         var3 = var1.method_3972();
         var2 = var10000;
         Object var9 = var3;
         if(var2 != null) {
            if(var3 == null) {
               var10 = null;
               break label41;
            }

            var9 = this.field_8461.get(var3);
         }

         var10 = (class_1700)var9;
      }

      class_1700 var4 = var10;
      var10 = var4;
      if(var2 != null) {
         if(var4 == null) {
            File var11 = new File;
            File var10002 = this.field_8455.method_2340(0).method_2194().method_132();
            String[] var8 = field_8470;
            var11.<init>(var10002, "stats");
            File var5 = var11;
            File var6 = new File(var5, var3.toString() + ".json");
            if(var2 != null) {
               label30: {
                  if(!var6.exists()) {
                     File var7 = new File(var5, var1.method_64() + ".json");
                     if(var2 == null) {
                        break label30;
                     }

                     if(var7.exists()) {
                        if(var2 == null) {
                           break label30;
                        }

                        if(var7.isFile()) {
                           var7.renameTo(var6);
                        }
                     }
                  }

                  var10 = new class_1700;
                  var10.method_9405(this.field_8455, var6);
                  var4 = var10;
                  var4.method_9406();
                  this.field_8461.put(var3, var4);
               }
            }
         }

         var10 = var4;
      }

      return var10;
   }

   // $FF: renamed from: b (int) void
   public void method_8930(int var1) {
      String[] var10000 = class_752.method_4253();
      this.field_8465 = var1;
      String[] var2 = var10000;
      class_354[] var7 = this.field_8455.field_1927;
      if(var2 != null) {
         if(this.field_8455.field_1927 == null) {
            return;
         }

         var7 = this.field_8455.field_1927;
      }

      class_354[] var3 = var7;
      int var4 = var3.length;
      int var5 = 0;

      while(var5 < var4) {
         class_354 var6 = var3[var5];
         if(var2 != null) {
            if(var6 != null) {
               var6.method_2257().method_9142(var1);
            }

            ++var5;
         }

         if(var2 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: <clinit> () void
   static void method_8931() {
      // $FF: Couldn't be decompiled
   }
}
