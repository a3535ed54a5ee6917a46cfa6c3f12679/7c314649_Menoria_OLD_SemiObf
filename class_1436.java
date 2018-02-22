import ca.diiza.c.class_579;
import ca.diiza.n.class_352;
import ca.diiza.n.class_353;
import com.google.common.base.Charsets;
import io.netty.util.concurrent.GenericFutureListener;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import net.minecraft.client.ClientBrandRetriever;
import org.apache.logging.log4j.Logger;

// $FF: renamed from: nv
public class class_1436 implements class_64 {

   // $FF: renamed from: a org.apache.logging.log4j.Logger
   private static final Logger field_7618;
   // $FF: renamed from: b java.lang.String
   private String field_7619;
   // $FF: renamed from: c l
   private final class_120 field_7620;
   // $FF: renamed from: d bao
   private bao field_7621;
   // $FF: renamed from: e bjf
   private bjf field_7622;
   // $FF: renamed from: f boolean
   private boolean field_7623;
   // $FF: renamed from: g kd
   public class_1341 field_7624;
   // $FF: renamed from: h java.util.Map
   private Map field_7625;
   // $FF: renamed from: i java.util.List
   public List field_7626;
   // $FF: renamed from: j int
   public int field_7627;
   // $FF: renamed from: k bdw
   private bdw field_7628;
   // $FF: renamed from: l boolean
   private boolean field_7629;
   // $FF: renamed from: m java.util.Random
   private Random field_7630;
   // $FF: renamed from: n java.lang.String
   private static final String field_7631;
   // $FF: renamed from: o java.lang.String[]
   private static final String[] field_7632;


   // $FF: renamed from: <init> (bao, bdw, l) void
   public void method_7819(bao var1, bdw var2, class_120 var3) {
      super();
      String[] var10001 = field_7632;
      this.field_7619 = "-1";
      class_1341 var4 = new class_1341;
      var4.method_7078((class_29)null);
      this.field_7624 = var4;
      this.field_7625 = new HashMap();
      this.field_7626 = new ArrayList();
      this.field_7627 = 20;
      this.field_7629 = false;
      this.field_7630 = new Random();
      this.field_7621 = var1;
      this.field_7628 = var2;
      this.field_7620 = var3;
   }

   // $FF: renamed from: a () void
   public void method_7820() {
      this.field_7622 = null;
   }

   // $FF: renamed from: b () void
   public void method_239() {}

   // $FF: renamed from: b (sC) void
   public void getBlock6(class_328 var1) {
      bao var10000 = this.field_7621;
      class_1440 var10001 = new class_1440;
      var10001.method_7835(this.field_7621, this);
      var10000.maxStringLength8 = var10001;
      bjf var3 = new bjf;
      class_1045 var10004 = new class_1045;
      var10004.method_5905(0L, var1.method_1858(), false, var1.method_1857(), var1.method_1862());
      var3.method_2227(this, var10004, var1.method_1859(), var1.method_1860(), this.field_7621.isEnabled6);
      this.field_7622 = var3;
      this.field_7622.field_1832 = true;
      this.field_7621.method_5259(this.field_7622);
      this.field_7621.cursorCounter8.field_3051 = var1.method_1859();
      var10000 = this.field_7621;
      class_168 var4 = new class_168;
      var4.method_909(this);
      var10000.method_5236(var4);
      this.field_7621.cursorCounter8.method_3846(var1.method_1856());
      this.field_7627 = var1.method_1861();
      this.field_7621.maxStringLength8.method_7839(var1.method_1858());
      this.field_7621.canLoseFocus7.method_5361();
      class_120 var2 = this.field_7620;
      class_270 var5 = new class_270;
      String[] var10003 = field_7632;
      var5.method_1555("MC|Brand", ClientBrandRetriever.getClientModName().getBytes(Charsets.UTF_8));
      var2.method_553(var5, new GenericFutureListener[0]);
   }

   // $FF: renamed from: b (r3) void
   public void method_271(class_348 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (r4) void
   public void method_272(class_347 var1) {
      class_715 var10000 = new class_715;
      var10000.method_4087(this.field_7622, (double)var1.method_1984(), (double)var1.method_1985(), (double)var1.method_1986(), var1.method_1987());
      class_715 var2 = var10000;
      var2.field_3043 = var1.method_1984();
      var2.field_3044 = var1.method_1985();
      var2.field_3045 = var1.method_1986();
      var2.field_3000 = 0.0F;
      var2.field_3001 = 0.0F;
      var2.method_3846(var1.method_1983());
      this.field_7622.method_2230(var1.method_1983(), var2);
   }

   // $FF: renamed from: b (r5) void
   public void method_273(class_346 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (r7) void
   public void method_276(class_344 var1) {
      class_749 var10000 = new class_749;
      var10000.method_4147(this.field_7622, var1.method_1955(), var1.method_1956(), var1.method_1957(), var1.method_1958(), var1.method_1959());
      class_749 var2 = var10000;
      this.field_7622.method_2230(var1.method_1954(), var2);
   }

   // $FF: renamed from: b (sU) void
   public void method_319(class_310 var1) {
      String[] var10000 = class_752.method_4253();
      class_689 var3 = this.field_7622.method_2160(var1.method_1771());
      String[] var2 = var10000;

      class_689 var5;
      label20: {
         try {
            var5 = var3;
            if(var2 == null) {
               break label20;
            }

            if(var3 == null) {
               return;
            }
         } catch (IllegalStateException var4) {
            throw method_7826(var4);
         }

         var5 = var3;
      }

      var5.method_3931((double)var1.method_1772() / 8000.0D, (double)var1.method_1773() / 8000.0D, (double)var1.method_1774() / 8000.0D);
   }

   // $FF: renamed from: b (sS) void
   public void method_318(class_312 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (r8) void
   public void method_277(class_343 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (s5) void
   public void method_330(class_336 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (sQ) void
   public void method_316(class_314 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (sE) void
   public void getBlock7(class_323 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (sP) void
   public void method_315(class_315 var1) {
      class_689 var2 = var1.method_1793(this.field_7622);
      if(var2 != null) {
         float var3 = (float)(var1.method_1794() * 360) / 256.0F;
         var2.method_3958(var3);
      }

   }

   // $FF: renamed from: b (sM) void
   public void method_312(class_318 var1) {
      String[] var10000 = class_752.method_4253();
      int var3 = 0;
      String[] var2 = var10000;

      while(var3 < var1.method_1807().length) {
         this.field_7622.method_2231(var1.method_1807()[var3]);
         ++var3;
         if(var2 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: b (r2) void
   public void getBlock8(class_349 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (sh) void
   public void method_287(class_292 var1) {
      int var3 = var1.method_1679().field_5475 * 16;
      String[] var10000 = class_752.method_4253();
      int var4 = var1.method_1679().field_5476 * 16;
      String[] var2 = var10000;
      if(var1.method_1680() != null) {
         DataInputStream var5 = new DataInputStream(new ByteArrayInputStream(var1.method_1680()));

         try {
            int var6 = 0;

            while(var6 < var1.method_1681()) {
               short var7 = var5.readShort();
               short var8 = var5.readShort();
               int var9 = var8 >> 4 & 4095;
               int var10 = var8 & 15;
               int var11 = var7 >> 12 & 15;
               int var12 = var7 >> 8 & 15;
               int var13 = var7 & 255;

               try {
                  this.field_7622.method_2232(var11 + var3, var13, var12 + var4, aji.method_2416(var9), var10);
                  ++var6;
                  if(var2 == null || var2 == null) {
                     break;
                  }
               } catch (IOException var14) {
                  throw method_7826(var14);
               }
            }
         } catch (IOException var15) {
            ;
         }
      }

   }

   // $FF: renamed from: b (sx) void
   public void getBlock3(class_279 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (se) void
   public void method_284(class_295 var1) {
      this.field_7622.method_2232(var1.method_1694(), var1.method_1695(), var1.method_1696(), var1.method_1693(), var1.method_1697());
   }

   // $FF: renamed from: b (sp) void
   public void method_296(class_284 var1) {
      this.field_7620.method_558(var1.method_1641());
   }

   // $FF: renamed from: b (rV) void
   public void method_237(class_66 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (r1) void
   public void method_7821(class_250 var1) {
      this.field_7620.method_553(var1, new GenericFutureListener[0]);
   }

   // $FF: renamed from: b (s4) void
   public void method_329(class_337 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (sg) void
   public void method_285(class_293 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (r9) void
   public void method_278(class_342 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (sL) void
   public void method_297(class_319 var1) {
      var1.method_1810(this.field_7622).method_4600(var1.method_1811(), var1.method_1812(), var1.method_1813());
   }

   // $FF: renamed from: b (r6) void
   public void method_274(class_345 var1) {
      double var3 = (double)var1.method_1965() / 32.0D;
      String[] var10000 = class_752.method_4253();
      double var5 = (double)var1.method_1966() / 32.0D;
      double var7 = (double)var1.method_1967() / 32.0D;
      float var9 = (float)(var1.method_1971() * 360) / 256.0F;
      float var10 = (float)(var1.method_1972() * 360) / 256.0F;
      class_752 var11 = (class_752)class_1775.method_9756(var1.method_1964(), this.field_7621.cursorCounter6);
      var11.field_3043 = var1.method_1965();
      var11.field_3044 = var1.method_1966();
      String[] var2 = var10000;
      var11.field_3045 = var1.method_1967();
      var11.field_3332 = (float)(var1.method_1973() * 360) / 256.0F;
      class_689[] var12 = var11.method_3955();

      label46: {
         label50: {
            try {
               if(var2 == null) {
                  break label46;
               }

               if(var12 == null) {
                  break label50;
               }
            } catch (IllegalStateException var17) {
               throw method_7826(var17);
            }

            int var13 = var1.method_1963() - var11.method_3845();
            int var14 = 0;

            while(var14 < var12.length) {
               try {
                  var12[var14].method_3846(var12[var14].method_3845() + var13);
                  ++var14;
                  if(var2 == null) {
                     break label46;
                  }

                  if(var2 == null) {
                     break;
                  }
               } catch (IllegalStateException var16) {
                  throw method_7826(var16);
               }
            }
         }

         var11.method_3846(var1.method_1963());
         var11.method_3886(var3, var5, var7, var9, var10);
         var11.field_2997 = (double)((float)var1.method_1968() / 8000.0F);
         var11.field_2998 = (double)((float)var1.method_1969() / 8000.0F);
         var11.field_2999 = (double)((float)var1.method_1970() / 8000.0F);
         this.field_7622.method_2230(var1.method_1963(), var11);
      }

      List var18 = var1.method_1962();

      try {
         if(var18 != null) {
            var11.method_3849().method_9515(var18);
         }

      } catch (IllegalStateException var15) {
         throw method_7826(var15);
      }
   }

   // $FF: renamed from: b (s2) void
   public void method_326(class_339 var1) {
      this.field_7621.cursorCounter6.method_2182(var1.method_1923());
      this.field_7621.cursorCounter6.method_2186(var1.method_1924());
   }

   // $FF: renamed from: b (s1) void
   public void method_325(class_340 var1) {
      bjk var10000 = this.field_7621.cursorCounter8;
      class_1661 var10001 = new class_1661;
      var10001.method_9151(var1.method_1927(), var1.method_1928(), var1.method_1929());
      var10000.method_4613(var10001, true);
      this.field_7621.cursorCounter6.method_2195().method_6850(var1.method_1927(), var1.method_1928(), var1.method_1929());
   }

   // $FF: renamed from: b (sT) void
   public void method_299(class_311 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (sq) void
   public void method_298(class_283 var1) {
      String[] var10000 = class_752.method_4253();
      class_689 var3 = var1.method_1637(this.field_7622);
      String[] var2 = var10000;

      class_689 var5;
      label20: {
         try {
            var5 = var3;
            if(var2 == null) {
               break label20;
            }

            if(var3 == null) {
               return;
            }
         } catch (IllegalStateException var4) {
            throw method_7826(var4);
         }

         var5 = var3;
      }

      var5.method_3932(var1.method_1638());
   }

   // $FF: renamed from: b (sX) void
   public void method_322(class_307 var1) {
      this.field_7621.cursorCounter8.method_4668(var1.method_1755());
      this.field_7621.cursorCounter8.method_4623().method_3642(var1.method_1756());
      this.field_7621.cursorCounter8.method_4623().method_3643(var1.method_1757());
   }

   // $FF: renamed from: b (sW) void
   public void method_321(class_308 var1) {
      this.field_7621.cursorCounter8.method_4670(var1.method_1760(), var1.method_1761(), var1.method_1762());
   }

   // $FF: renamed from: b (sO) void
   public void method_314(class_316 var1) {
      String[] var2 = class_752.method_4253();

      label20: {
         try {
            if(var2 == null) {
               return;
            }

            if(var1.method_1797() == this.field_7621.cursorCounter8.field_3051) {
               break label20;
            }
         } catch (IllegalStateException var4) {
            throw method_7826(var4);
         }

         this.field_7623 = false;
         class_1348 var3 = this.field_7622.method_2220();
         bjf var10001 = new bjf;
         class_1045 var10004 = new class_1045;
         var10004.method_5905(0L, var1.method_1799(), false, this.field_7621.cursorCounter6.method_2195().method_6867(), var1.method_1800());
         var10001.method_2227(this, var10004, var1.method_1797(), var1.method_1798(), this.field_7621.isEnabled6);
         this.field_7622 = var10001;
         this.field_7622.method_2235(var3);
         this.field_7622.field_1832 = true;
         this.field_7621.method_5259(this.field_7622);
         this.field_7621.cursorCounter8.field_3051 = var1.method_1797();
         bao var10000 = this.field_7621;
         class_168 var5 = new class_168;
         var5.method_909(this);
         var10000.method_5236(var5);
      }

      this.field_7621.method_5265(var1.method_1797());
      this.field_7621.maxStringLength8.method_7839(var1.method_1799());
   }

   // $FF: renamed from: b (sr) void
   public void getBlock0(class_282 var1) {
      class_1036 var10000 = new class_1036;
      var10000.method_5862(this.field_7621.cursorCounter6, (class_689)null, var1.method_1630(), var1.method_1631(), var1.method_1632(), var1.method_1633());
      class_1036 var2 = var10000;
      var2.field_5490 = var1.method_1634();
      var2.method_5864(true);
      this.field_7621.cursorCounter8.field_2997 += (double)var1.method_1627();
      this.field_7621.cursorCounter8.field_2998 += (double)var1.method_1628();
      this.field_7621.cursorCounter8.field_2999 += (double)var1.method_1629();
   }

   // $FF: renamed from: b (sk) void
   public void method_292(class_289 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (sn) void
   public void method_294(class_286 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (si) void
   public void method_289(class_291 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (sl) void
   public void method_291(class_288 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (sI) void
   public void method_281(class_322 var1) {
      String[] var10000 = class_752.method_4253();
      Object var3 = this.field_7622.method_31(var1.method_1835(), var1.method_1836(), var1.method_1837());
      String[] var2 = var10000;

      label20: {
         try {
            if(var2 == null) {
               return;
            }

            if(var3 != null) {
               break label20;
            }
         } catch (IllegalStateException var4) {
            throw method_7826(var4);
         }

         class_582 var5 = new class_582;
         var5.getBlock88();
         var3 = var5;
         ((class_580)var3).getBlock90(this.field_7622);
         ((class_580)var3).field_2465 = var1.method_1835();
         ((class_580)var3).field_2466 = var1.method_1836();
         ((class_580)var3).field_2467 = var1.method_1837();
      }

      this.field_7621.cursorCounter8.method_4586((class_580)var3);
   }

   // $FF: renamed from: b (s3) void
   public void method_327(class_338 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (sc) void
   public void method_282(class_299 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (sm) void
   public void method_293(class_287 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (sV) void
   public void method_320(class_309 var1) {
      String[] var10000 = class_752.method_4253();
      class_689 var3 = this.field_7622.method_2160(var1.method_1766());
      String[] var2 = var10000;

      class_689 var5;
      label20: {
         try {
            var5 = var3;
            if(var2 == null) {
               break label20;
            }

            if(var3 == null) {
               return;
            }
         } catch (IllegalStateException var4) {
            throw method_7826(var4);
         }

         var5 = var3;
      }

      var5.method_3935(var1.method_1767(), var1.method_1765());
   }

   // $FF: renamed from: b (sj) void
   public void method_290(class_290 var1) {
      this.field_7621.cursorCounter8.method_4677();
   }

   // $FF: renamed from: b (sd) void
   public void method_283(class_297 var1) {
      this.field_7621.cursorCounter6.method_2193(var1.method_1702(), var1.method_1703(), var1.method_1704(), var1.method_1701(), var1.method_1705(), var1.method_1706());
   }

   // $FF: renamed from: b (sb) void
   public void method_280(class_301 var1) {
      this.field_7621.cursorCounter6.method_2217(var1.method_1722(), var1.method_1723(), var1.method_1724(), var1.method_1725(), var1.method_1726());
   }

   // $FF: renamed from: b (sy) void
   public void getBlock4(class_278 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (ss) void
   public void getBlock1(class_281 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (sD) void
   public void method_288(class_327 var1) {
      class_1296 var2 = class_544.getBlock19(var1.method_1852(), this.field_7621.cursorCounter6);
      var2.method_6805(var1.method_1853());
      this.field_7621.enableBackgroundDrawing8.setFocused2().method_7001(var2);
   }

   // $FF: renamed from: b (sz) void
   public void getBlock5(class_277 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (r_) void
   public void method_279(class_331 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (s7) void
   public void method_332(class_334 var1) {
      class_689 var2 = this.field_7622.method_2160(var1.method_1894());
      if(var2 instanceof class_752) {
         class_1645 var10000 = new class_1645;
         var10000.method_9012(var1.method_1895(), var1.method_1897(), var1.method_1896());
         class_1645 var3 = var10000;
         var3.method_9027(var1.method_1892());
         ((class_752)var2).method_4179(var3);
      }

   }

   // $FF: renamed from: b (sN) void
   public void method_313(class_317 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (sK) void
   public void method_311(class_320 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (su) void
   public void getBlock2(class_280 var1) {
      class_268 var10001 = new class_268;
      var10001.method_1547(var1.method_1620(), class_579.field_2458);
      this.method_7821(var10001);
   }

   // $FF: renamed from: b (ag, ag) void
   public void method_238(class_906 var1, class_906 var2) {
      IllegalStateException var10000 = new IllegalStateException("Unexpected protocol change!");
      String[] var10002 = field_7632;
      throw var10000;
   }

   // $FF: renamed from: b (sJ) void
   public void method_310(class_321 var1) {
      bjk var2 = this.field_7621.cursorCounter8;
      var2.field_3640.field_2837 = var1.method_1823();
      var2.field_3640.field_2839 = var1.method_1827();
      var2.field_3640.field_2836 = var1.method_1821();
      var2.field_3640.field_2838 = var1.method_1825();
      var2.field_3640.method_3588(var1.method_1829());
      var2.field_3640.method_3590(var1.method_1831());
   }

   // $FF: renamed from: b (sf) void
   public void method_286(class_294 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (sB) void
   public void method_328(class_329 var1) {
      this.field_7621.cursorCounter6.method_2085(var1.method_1865(), var1.method_1866(), var1.method_1867(), var1.method_1864(), var1.method_1868(), var1.method_1869(), false);
   }

   // $FF: renamed from: b (so) void
   public void method_295(class_285 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (sY) void
   public void method_275(class_306 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (s0) void
   public void method_324(class_341 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (sR) void
   public void method_317(class_313 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (sZ) void
   public void method_323(class_305 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (sA) void
   public void getBlock9(class_330 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (s6) void
   public void method_331(class_335 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: c () l
   public class_120 method_7822() {
      return this.field_7620;
   }

   // $FF: renamed from: a (ca.diiza.n.a) void
   public void method_333(class_353 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (ca.diiza.n.b) void
   public void method_334(class_352 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (nv, bao) bao
   static bao method_7823(class_1436 var0, bao var1) {
      return var0.field_7621 = var1;
   }

   // $FF: renamed from: b (nv) bao
   static bao method_7824(class_1436 var0) {
      return var0.field_7621;
   }

   // $FF: renamed from: <clinit> () void
   static void method_7825() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.Exception) java.lang.Exception
   private static Exception method_7826(Exception var0) {
      return var0;
   }
}
