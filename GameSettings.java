import ca.diiza.utils.MP3Player;
import com.google.common.collect.Maps;
import com.google.gson.Gson;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.logging.log4j.Logger;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;

public class GameSettings {

   // $FF: renamed from: aM org.apache.logging.log4j.Logger
   private static final Logger field_4475;
   // $FF: renamed from: aN com.google.gson.Gson
   private static final Gson field_4476;
   // $FF: renamed from: aO java.lang.reflect.ParameterizedType
   private static final ParameterizedType field_4477;
   // $FF: renamed from: aP java.lang.String[]
   private static final String[] field_4478;
   // $FF: renamed from: aQ java.lang.String[]
   private static final String[] field_4479;
   // $FF: renamed from: aR java.lang.String[]
   private static final String[] field_4480;
   // $FF: renamed from: aS java.lang.String[]
   private static final String[] field_4481;
   // $FF: renamed from: aT java.lang.String[]
   private static final String[] field_4482;
   // $FF: renamed from: aU java.lang.String[]
   private static final String[] field_4483;
   // $FF: renamed from: aV java.lang.String[]
   private static final String[] field_4484;
   // $FF: renamed from: a float
   public float field_4485;
   // $FF: renamed from: b boolean
   public boolean field_4486;
   // $FF: renamed from: c int
   public int field_4487;
   // $FF: renamed from: d boolean
   public boolean field_4488;
   // $FF: renamed from: e boolean
   public boolean field_4489;
   // $FF: renamed from: f boolean
   public boolean field_4490;
   // $FF: renamed from: g boolean
   public boolean field_4491;
   // $FF: renamed from: h int
   public int field_4492;
   // $FF: renamed from: i boolean
   public boolean field_4493;
   // $FF: renamed from: j int
   public int field_4494;
   public int ofFogType;
   public float ofFogStart;
   public int ofMipmapType;
   public boolean ofLoadFar;
   public int ofPreloadedChunks;
   public boolean ofOcclusionFancy;
   public boolean ofSmoothFps;
   public boolean ofSmoothWorld;
   public boolean ofLazyChunkLoading;
   public float ofAoLevel;
   public int ofAaLevel;
   public int ofClouds;
   public float ofCloudsHeight;
   public int ofTrees;
   public int ofGrass;
   public int ofRain;
   public int ofWater;
   public int ofDroppedItems;
   public int ofBetterGrass;
   public int ofAutoSaveTicks;
   public boolean ofLagometer;
   public boolean ofProfiler;
   public boolean ofWeather;
   public boolean ofSky;
   public boolean ofStars;
   public boolean ofSunMoon;
   public int ofChunkUpdates;
   public int ofChunkLoading;
   public boolean ofChunkUpdatesDynamic;
   public int ofTime;
   public boolean ofClearWater;
   public boolean ofDepthFog;
   public boolean ofBetterSnow;
   public String ofFullscreenMode;
   public boolean ofSwampColors;
   public boolean ofRandomMobs;
   public boolean ofSmoothBiomes;
   public boolean ofCustomFonts;
   public boolean ofCustomColors;
   public boolean ofCustomSky;
   public boolean ofShowCapes;
   public int ofConnectedTextures;
   public boolean ofNaturalTextures;
   public boolean ofFastMath;
   public boolean ofFastRender;
   public int ofTranslucentBlocks;
   public int ofAnimatedWater;
   public int ofAnimatedLava;
   public boolean ofAnimatedFire;
   public boolean ofAnimatedPortal;
   public boolean ofAnimatedRedstone;
   public boolean ofAnimatedExplosion;
   public boolean ofAnimatedFlame;
   public boolean ofAnimatedSmoke;
   public boolean ofVoidParticles;
   public boolean ofWaterParticles;
   public boolean ofRainSplash;
   public boolean ofPortalParticles;
   public boolean ofPotionParticles;
   public boolean ofDrippingWaterLava;
   public boolean ofAnimatedTerrain;
   public boolean ofAnimatedItems;
   public boolean ofAnimatedTextures;
   public static final int DEFAULT = 0;
   public static final int FAST = 1;
   public static final int FANCY = 2;
   public static final int OFF = 3;
   public static final int ANIM_ON = 0;
   public static final int ANIM_GENERATED = 1;
   public static final int ANIM_OFF = 2;
   public static final int CL_DEFAULT = 0;
   public static final int CL_SMOOTH = 1;
   public static final int CL_THREADED = 2;
   public static final String DEFAULT_STR;
   public class_1357 ofKeyBindZoom;
   private File optionsFileOF;
   // $FF: renamed from: k boolean
   public boolean field_4495;
   // $FF: renamed from: l java.util.List
   public List field_4496;
   // $FF: renamed from: m ay
   public class_932 field_4497;
   // $FF: renamed from: n boolean
   public boolean field_4498;
   // $FF: renamed from: o boolean
   public boolean field_4499;
   // $FF: renamed from: p boolean
   public boolean field_4500;
   // $FF: renamed from: q float
   public float field_4501;
   // $FF: renamed from: r boolean
   public boolean field_4502;
   // $FF: renamed from: s boolean
   public boolean field_4503;
   // $FF: renamed from: t boolean
   public boolean field_4504;
   // $FF: renamed from: u boolean
   public boolean field_4505;
   public float musicSound;
   public class_1357 tpYes;
   public class_1357 bottleXp;
   public class_1357 fHome;
   public class_1357 spawn;
   public class_1357 feed;
   // $FF: renamed from: v boolean
   public boolean field_4506;
   // $FF: renamed from: w boolean
   public boolean field_4507;
   // $FF: renamed from: x boolean
   public boolean field_4508;
   // $FF: renamed from: y boolean
   public boolean field_4509;
   // $FF: renamed from: z int
   public int field_4510;
   // $FF: renamed from: A int
   public int field_4511;
   // $FF: renamed from: B boolean
   public boolean field_4512;
   // $FF: renamed from: C float
   public float field_4513;
   // $FF: renamed from: D float
   public float field_4514;
   // $FF: renamed from: E float
   public float field_4515;
   // $FF: renamed from: F float
   public float field_4516;
   // $FF: renamed from: G boolean
   public boolean field_4517;
   // $FF: renamed from: H int
   public int field_4518;
   // $FF: renamed from: I int
   public int field_4519;
   // $FF: renamed from: aW java.util.Map
   private Map field_4520;
   // $FF: renamed from: J float
   public float field_4521;
   // $FF: renamed from: K float
   public float field_4522;
   // $FF: renamed from: L float
   public float field_4523;
   // $FF: renamed from: M float
   public float field_4524;
   // $FF: renamed from: N float
   public float field_4525;
   // $FF: renamed from: O int
   public int field_4526;
   // $FF: renamed from: P boolean
   public boolean field_4527;
   // $FF: renamed from: Q java.lang.String
   public String field_4528;
   // $FF: renamed from: R int
   public int field_4529;
   // $FF: renamed from: S int
   public int field_4530;
   // $FF: renamed from: T int
   public int field_4531;
   // $FF: renamed from: U kv
   public class_1357 field_4532;
   // $FF: renamed from: V kv
   public class_1357 field_4533;
   // $FF: renamed from: W kv
   public class_1357 field_4534;
   // $FF: renamed from: X kv
   public class_1357 field_4535;
   // $FF: renamed from: Y kv
   public class_1357 field_4536;
   // $FF: renamed from: Z kv
   public class_1357 field_4537;
   // $FF: renamed from: aa kv
   public class_1357 field_4538;
   // $FF: renamed from: ab kv
   public class_1357 field_4539;
   // $FF: renamed from: ac kv
   public class_1357 field_4540;
   // $FF: renamed from: ad kv
   public class_1357 field_4541;
   // $FF: renamed from: ae kv
   public class_1357 field_4542;
   // $FF: renamed from: af kv
   public class_1357 field_4543;
   // $FF: renamed from: ag kv
   public class_1357 field_4544;
   // $FF: renamed from: ah kv
   public class_1357 field_4545;
   // $FF: renamed from: ai kv
   public class_1357 field_4546;
   // $FF: renamed from: aj kv
   public class_1357 field_4547;
   // $FF: renamed from: ak kv
   public class_1357 field_4548;
   // $FF: renamed from: al kv
   public class_1357 field_4549;
   // $FF: renamed from: am kv
   public class_1357 field_4550;
   // $FF: renamed from: an kv
   public class_1357 field_4551;
   // $FF: renamed from: ao kv
   public class_1357 field_4552;
   // $FF: renamed from: ap kv
   public class_1357 field_4553;
   // $FF: renamed from: aq kv
   public class_1357 field_4554;
   // $FF: renamed from: ar kv[]
   public class_1357[] field_4555;
   // $FF: renamed from: as kv[]
   public class_1357[] field_4556;
   // $FF: renamed from: at bao
   protected bao field_4557;
   // $FF: renamed from: aX java.io.File
   private File field_4558;
   // $FF: renamed from: au aq
   public class_918 field_4559;
   // $FF: renamed from: av boolean
   public boolean field_4560;
   // $FF: renamed from: aw int
   public int field_4561;
   // $FF: renamed from: ax boolean
   public boolean field_4562;
   // $FF: renamed from: ay boolean
   public boolean field_4563;
   // $FF: renamed from: az java.lang.String
   public String field_4564;
   // $FF: renamed from: aA boolean
   public boolean field_4565;
   // $FF: renamed from: aB boolean
   public boolean field_4566;
   // $FF: renamed from: aC boolean
   public boolean field_4567;
   // $FF: renamed from: aD float
   public float field_4568;
   // $FF: renamed from: aE float
   public float field_4569;
   // $FF: renamed from: aF float
   public float field_4570;
   // $FF: renamed from: aG float
   public float field_4571;
   // $FF: renamed from: aH float
   public float field_4572;
   // $FF: renamed from: aI int
   public int field_4573;
   // $FF: renamed from: aJ int
   public int field_4574;
   // $FF: renamed from: aK java.lang.String
   public String field_4575;
   // $FF: renamed from: aL boolean
   public boolean field_4576;
   private static final String __OBFID;
   // $FF: renamed from: bb java.lang.String[]
   private static final String[] field_4577;


   // $FF: renamed from: <init> (bao, java.io.File) void
   public void method_5345(bao var1, File var2) {
      super();
      this.field_4485 = 0.5F;
      this.field_4487 = -1;
      this.field_4488 = true;
      this.field_4491 = true;
      this.field_4492 = 120;
      this.field_4493 = true;
      this.field_4494 = 2;
      this.ofFogType = 1;
      this.ofFogStart = 0.8F;
      this.ofMipmapType = 0;
      this.ofLoadFar = false;
      this.ofPreloadedChunks = 0;
      this.ofOcclusionFancy = false;
      this.ofSmoothFps = false;
      this.ofSmoothWorld = Config.isSingleProcessor();
      this.ofLazyChunkLoading = Config.isSingleProcessor();
      this.ofAoLevel = 1.0F;
      this.ofAaLevel = 0;
      this.ofClouds = 0;
      this.ofCloudsHeight = 0.0F;
      this.ofTrees = 0;
      this.ofGrass = 0;
      this.ofRain = 0;
      this.ofWater = 0;
      this.ofDroppedItems = 0;
      this.ofBetterGrass = 3;
      this.ofAutoSaveTicks = 4000;
      this.ofLagometer = false;
      this.ofProfiler = false;
      this.ofWeather = true;
      this.ofSky = true;
      this.ofStars = true;
      this.ofSunMoon = true;
      this.ofChunkUpdates = 1;
      this.ofChunkLoading = 0;
      this.ofChunkUpdatesDynamic = false;
      this.ofTime = 0;
      this.ofClearWater = false;
      this.ofDepthFog = true;
      this.ofBetterSnow = false;
      String[] var4 = field_4577;
      this.ofFullscreenMode = "Default";
      this.ofSwampColors = true;
      this.ofRandomMobs = true;
      this.ofSmoothBiomes = true;
      this.ofCustomFonts = true;
      this.ofCustomColors = true;
      this.ofCustomSky = true;
      this.ofShowCapes = true;
      this.ofConnectedTextures = 2;
      this.ofNaturalTextures = false;
      this.ofFastMath = false;
      this.ofFastRender = true;
      this.ofTranslucentBlocks = 2;
      this.ofAnimatedWater = 0;
      this.ofAnimatedLava = 0;
      this.ofAnimatedFire = true;
      this.ofAnimatedPortal = true;
      this.ofAnimatedRedstone = true;
      this.ofAnimatedExplosion = true;
      this.ofAnimatedFlame = true;
      this.ofAnimatedSmoke = true;
      this.ofVoidParticles = true;
      this.ofWaterParticles = true;
      this.ofRainSplash = true;
      this.ofPortalParticles = true;
      this.ofPotionParticles = true;
      this.ofDrippingWaterLava = true;
      this.ofAnimatedTerrain = true;
      this.ofAnimatedItems = true;
      this.ofAnimatedTextures = true;
      this.field_4495 = true;
      this.field_4496 = new ArrayList();
      this.musicSound = 0.8F;
      this.field_4497 = class_932.field_4754;
      this.field_4498 = true;
      this.field_4499 = true;
      this.field_4500 = true;
      this.field_4501 = 1.0F;
      this.field_4502 = true;
      this.field_4504 = true;
      this.field_4507 = true;
      String[] var10000 = class_752.method_4253();
      this.field_4508 = true;
      this.field_4512 = true;
      this.field_4513 = 1.0F;
      this.field_4514 = 1.0F;
      this.field_4515 = 0.44366196F;
      this.field_4516 = 1.0F;
      this.field_4517 = true;
      this.field_4518 = 4;
      this.field_4519 = 1;
      this.field_4520 = Maps.newEnumMap(class_930.class);
      this.field_4521 = 0.5F;
      this.field_4522 = 1.0F;
      this.field_4523 = 1.0F;
      this.field_4524 = 0.5412844F;
      this.field_4525 = 0.31690142F;
      this.field_4526 = 1;
      this.field_4527 = true;
      this.field_4528 = "";
      this.field_4529 = 0;
      this.field_4530 = 0;
      this.field_4531 = 0;
      class_1357 var10002 = new class_1357;
      var10002.getEnableBackgroundDrawing1("key.forward", 17, "key.categories.movement");
      this.field_4532 = var10002;
      var10002 = new class_1357;
      var10002.getEnableBackgroundDrawing1("key.left", 30, "key.categories.movement");
      this.field_4533 = var10002;
      var10002 = new class_1357;
      var10002.getEnableBackgroundDrawing1("key.back", 31, "key.categories.movement");
      this.field_4534 = var10002;
      var10002 = new class_1357;
      var10002.getEnableBackgroundDrawing1("key.right", 32, "key.categories.movement");
      this.field_4535 = var10002;
      var10002 = new class_1357;
      var10002.getEnableBackgroundDrawing1("key.jump", 57, "key.categories.movement");
      this.field_4536 = var10002;
      var10002 = new class_1357;
      var10002.getEnableBackgroundDrawing1("key.sneak", 42, "key.categories.movement");
      this.field_4537 = var10002;
      var10002 = new class_1357;
      var10002.getEnableBackgroundDrawing1("key.inventory", 18, "key.categories.inventory");
      this.field_4538 = var10002;
      var10002 = new class_1357;
      var10002.getEnableBackgroundDrawing1("key.use", -99, "key.categories.gameplay");
      this.field_4539 = var10002;
      var10002 = new class_1357;
      var10002.getEnableBackgroundDrawing1("key.drop", 16, "key.categories.gameplay");
      this.field_4540 = var10002;
      var10002 = new class_1357;
      var10002.getEnableBackgroundDrawing1("key.attack", -100, "key.categories.gameplay");
      this.field_4541 = var10002;
      var10002 = new class_1357;
      var10002.getEnableBackgroundDrawing1("key.pickItem", -98, "key.categories.gameplay");
      this.field_4542 = var10002;
      var10002 = new class_1357;
      var10002.getEnableBackgroundDrawing1("key.sprint", 29, "key.categories.gameplay");
      this.field_4543 = var10002;
      var10002 = new class_1357;
      var10002.getEnableBackgroundDrawing1("key.chat", 20, "key.categories.multiplayer");
      this.field_4544 = var10002;
      var10002 = new class_1357;
      var10002.getEnableBackgroundDrawing1("key.playerlist", 15, "key.categories.multiplayer");
      this.field_4545 = var10002;
      var10002 = new class_1357;
      var10002.getEnableBackgroundDrawing1("key.command", 53, "key.categories.multiplayer");
      this.field_4546 = var10002;
      var10002 = new class_1357;
      var10002.getEnableBackgroundDrawing1("key.screenshot", 60, "key.categories.misc");
      this.field_4547 = var10002;
      var10002 = new class_1357;
      var10002.getEnableBackgroundDrawing1("key.togglePerspective", 63, "key.categories.misc");
      this.field_4548 = var10002;
      var10002 = new class_1357;
      var10002.getEnableBackgroundDrawing1("key.smoothCamera", 0, "key.categories.misc");
      this.field_4549 = var10002;
      var10002 = new class_1357;
      var10002.getEnableBackgroundDrawing1("key.fullscreen", 87, "key.categories.misc");
      this.field_4550 = var10002;
      var10002 = new class_1357;
      var10002.getEnableBackgroundDrawing1("key.streamStartStop", 64, "key.categories.stream");
      this.field_4551 = var10002;
      var10002 = new class_1357;
      var10002.getEnableBackgroundDrawing1("key.streamPauseUnpause", 65, "key.categories.stream");
      this.field_4552 = var10002;
      var10002 = new class_1357;
      var10002.getEnableBackgroundDrawing1("key.streamCommercial", 0, "key.categories.stream");
      this.field_4553 = var10002;
      var10002 = new class_1357;
      var10002.getEnableBackgroundDrawing1("key.streamToggleMic", 0, "key.categories.stream");
      this.field_4554 = var10002;
      var10002 = new class_1357;
      var10002.getEnableBackgroundDrawing1(class_130.field_282 + "/tpyes", 0, class_130.field_287 + "Macros");
      this.tpYes = var10002;
      var10002 = new class_1357;
      var10002.getEnableBackgroundDrawing1(class_130.field_282 + "/f home", 0, class_130.field_287 + "Macros");
      this.fHome = var10002;
      var10002 = new class_1357;
      var10002.getEnableBackgroundDrawing1(class_130.field_282 + "/feed", 0, class_130.field_287 + "Macros");
      this.feed = var10002;
      var10002 = new class_1357;
      var10002.getEnableBackgroundDrawing1(class_130.field_282 + "/spawn", 0, class_130.field_287 + "Macros");
      this.spawn = var10002;
      var10002 = new class_1357;
      var10002.getEnableBackgroundDrawing1(class_130.field_282 + "/bottlexp 10", 0, class_130.field_287 + "Macros");
      this.bottleXp = var10002;
      class_1357[] var6 = new class_1357[9];
      class_1357 var10005 = new class_1357;
      var10005.getEnableBackgroundDrawing1("key.hotbar.1", 2, "key.categories.inventory");
      var6[0] = var10005;
      var10005 = new class_1357;
      var10005.getEnableBackgroundDrawing1("key.hotbar.2", 3, "key.categories.inventory");
      var6[1] = var10005;
      var10005 = new class_1357;
      var10005.getEnableBackgroundDrawing1("key.hotbar.3", 4, "key.categories.inventory");
      var6[2] = var10005;
      var10005 = new class_1357;
      var10005.getEnableBackgroundDrawing1("key.hotbar.4", 5, "key.categories.inventory");
      var6[3] = var10005;
      var10005 = new class_1357;
      var10005.getEnableBackgroundDrawing1("key.hotbar.5", 6, "key.categories.inventory");
      var6[4] = var10005;
      var10005 = new class_1357;
      var10005.getEnableBackgroundDrawing1("key.hotbar.6", 7, "key.categories.inventory");
      var6[5] = var10005;
      var10005 = new class_1357;
      var10005.getEnableBackgroundDrawing1("key.hotbar.7", 8, "key.categories.inventory");
      var6[6] = var10005;
      var10005 = new class_1357;
      var10005.getEnableBackgroundDrawing1("key.hotbar.8", 9, "key.categories.inventory");
      var6[7] = var10005;
      var10005 = new class_1357;
      var10005.getEnableBackgroundDrawing1("key.hotbar.9", 10, "key.categories.inventory");
      var6[8] = var10005;
      this.field_4555 = var6;
      this.field_4556 = (class_1357[])((class_1357[])((class_1357[])((class_1357[])ArrayUtils.addAll(new class_1357[]{this.field_4541, this.field_4539, this.field_4532, this.field_4533, this.field_4534, this.field_4535, this.field_4536, this.field_4537, this.field_4540, this.field_4538, this.field_4544, this.field_4545, this.field_4542, this.field_4546, this.field_4547, this.field_4548, this.field_4549, this.field_4543, this.field_4551, this.field_4552, this.field_4553, this.field_4554, this.field_4550, this.tpYes, this.bottleXp, this.fHome, this.feed, this.spawn}, this.field_4555))));
      this.field_4559 = class_918.field_4629;
      this.field_4564 = "";
      this.field_4568 = 1.0F;
      this.field_4569 = 1.0F;
      this.field_4570 = 70.0F;
      this.field_4575 = "en_US";
      String[] var3 = var10000;
      this.field_4576 = false;
      this.field_4557 = var1;
      this.field_4558 = new File(var2, "options.txt");
      this.optionsFileOF = new File(var2, "optionsof.txt");
      this.field_4492 = (int)class_101.field_99.method_471();
      class_1357 var10001 = new class_1357;
      var10001.getEnableBackgroundDrawing1("Zoom", 29, "key.categories.misc");
      this.ofKeyBindZoom = var10001;
      this.field_4556 = (class_1357[])((class_1357[])((class_1357[])((class_1357[])ArrayUtils.add(this.field_4556, this.ofKeyBindZoom))));
      class_101.field_95.method_472(32.0F);
      int var5 = var1.method_5293();
      if(var3 != null) {
         var5 = var5 != 0?12:8;
      }

      this.field_4487 = var5;
      this.method_5356();
      Config.initGameSettings(this);
   }

   // $FF: renamed from: <init> () void
   public void method_5346() {
      super();
      this.field_4485 = 0.5F;
      this.field_4487 = -1;
      this.field_4488 = true;
      this.field_4491 = true;
      this.field_4492 = 120;
      this.field_4493 = true;
      this.field_4494 = 2;
      this.ofFogType = 1;
      this.ofFogStart = 0.8F;
      this.ofMipmapType = 0;
      this.ofLoadFar = false;
      this.ofPreloadedChunks = 0;
      this.ofOcclusionFancy = false;
      this.ofSmoothFps = false;
      this.ofSmoothWorld = Config.isSingleProcessor();
      this.ofLazyChunkLoading = Config.isSingleProcessor();
      this.ofAoLevel = 1.0F;
      this.ofAaLevel = 0;
      this.ofClouds = 0;
      this.ofCloudsHeight = 0.0F;
      this.ofTrees = 0;
      this.ofGrass = 0;
      this.ofRain = 0;
      this.ofWater = 0;
      this.ofDroppedItems = 0;
      this.ofBetterGrass = 3;
      this.ofAutoSaveTicks = 4000;
      this.ofLagometer = false;
      this.ofProfiler = false;
      this.ofWeather = true;
      this.ofSky = true;
      this.ofStars = true;
      this.ofSunMoon = true;
      this.ofChunkUpdates = 1;
      this.ofChunkLoading = 0;
      this.ofChunkUpdatesDynamic = false;
      this.ofTime = 0;
      this.ofClearWater = false;
      this.ofDepthFog = true;
      this.ofBetterSnow = false;
      String[] var1 = field_4577;
      this.ofFullscreenMode = "Default";
      this.ofSwampColors = true;
      this.ofRandomMobs = true;
      this.ofSmoothBiomes = true;
      this.ofCustomFonts = true;
      this.ofCustomColors = true;
      this.ofCustomSky = true;
      this.ofShowCapes = true;
      this.ofConnectedTextures = 2;
      this.ofNaturalTextures = false;
      this.ofFastMath = false;
      this.ofFastRender = true;
      this.ofTranslucentBlocks = 2;
      this.ofAnimatedWater = 0;
      this.ofAnimatedLava = 0;
      this.ofAnimatedFire = true;
      this.ofAnimatedPortal = true;
      this.ofAnimatedRedstone = true;
      this.ofAnimatedExplosion = true;
      this.ofAnimatedFlame = true;
      this.ofAnimatedSmoke = true;
      this.ofVoidParticles = true;
      this.ofWaterParticles = true;
      this.ofRainSplash = true;
      this.ofPortalParticles = true;
      this.ofPotionParticles = true;
      this.ofDrippingWaterLava = true;
      this.ofAnimatedTerrain = true;
      this.ofAnimatedItems = true;
      this.ofAnimatedTextures = true;
      this.field_4495 = true;
      this.field_4496 = new ArrayList();
      this.musicSound = 0.8F;
      this.field_4497 = class_932.field_4754;
      this.field_4498 = true;
      this.field_4499 = true;
      this.field_4500 = true;
      this.field_4501 = 1.0F;
      this.field_4502 = true;
      this.field_4504 = true;
      this.field_4507 = true;
      this.field_4508 = true;
      this.field_4512 = true;
      this.field_4513 = 1.0F;
      this.field_4514 = 1.0F;
      this.field_4515 = 0.44366196F;
      this.field_4516 = 1.0F;
      this.field_4517 = true;
      this.field_4518 = 4;
      this.field_4519 = 1;
      this.field_4520 = Maps.newEnumMap(class_930.class);
      this.field_4521 = 0.5F;
      this.field_4522 = 1.0F;
      this.field_4523 = 1.0F;
      this.field_4524 = 0.5412844F;
      this.field_4525 = 0.31690142F;
      this.field_4526 = 1;
      this.field_4527 = true;
      this.field_4528 = "";
      this.field_4529 = 0;
      this.field_4530 = 0;
      this.field_4531 = 0;
      class_1357 var10001 = new class_1357;
      var10001.getEnableBackgroundDrawing1("key.forward", 17, "key.categories.movement");
      this.field_4532 = var10001;
      var10001 = new class_1357;
      var10001.getEnableBackgroundDrawing1("key.left", 30, "key.categories.movement");
      this.field_4533 = var10001;
      var10001 = new class_1357;
      var10001.getEnableBackgroundDrawing1("key.back", 31, "key.categories.movement");
      this.field_4534 = var10001;
      var10001 = new class_1357;
      var10001.getEnableBackgroundDrawing1("key.right", 32, "key.categories.movement");
      this.field_4535 = var10001;
      var10001 = new class_1357;
      var10001.getEnableBackgroundDrawing1("key.jump", 57, "key.categories.movement");
      this.field_4536 = var10001;
      var10001 = new class_1357;
      var10001.getEnableBackgroundDrawing1("key.sneak", 42, "key.categories.movement");
      this.field_4537 = var10001;
      var10001 = new class_1357;
      var10001.getEnableBackgroundDrawing1("key.inventory", 18, "key.categories.inventory");
      this.field_4538 = var10001;
      var10001 = new class_1357;
      var10001.getEnableBackgroundDrawing1("key.use", -99, "key.categories.gameplay");
      this.field_4539 = var10001;
      var10001 = new class_1357;
      var10001.getEnableBackgroundDrawing1("key.drop", 16, "key.categories.gameplay");
      this.field_4540 = var10001;
      var10001 = new class_1357;
      var10001.getEnableBackgroundDrawing1("key.attack", -100, "key.categories.gameplay");
      this.field_4541 = var10001;
      var10001 = new class_1357;
      var10001.getEnableBackgroundDrawing1("key.pickItem", -98, "key.categories.gameplay");
      this.field_4542 = var10001;
      var10001 = new class_1357;
      var10001.getEnableBackgroundDrawing1("key.sprint", 29, "key.categories.gameplay");
      this.field_4543 = var10001;
      var10001 = new class_1357;
      var10001.getEnableBackgroundDrawing1("key.chat", 20, "key.categories.multiplayer");
      this.field_4544 = var10001;
      var10001 = new class_1357;
      var10001.getEnableBackgroundDrawing1("key.playerlist", 15, "key.categories.multiplayer");
      this.field_4545 = var10001;
      var10001 = new class_1357;
      var10001.getEnableBackgroundDrawing1("key.command", 53, "key.categories.multiplayer");
      this.field_4546 = var10001;
      var10001 = new class_1357;
      var10001.getEnableBackgroundDrawing1("key.screenshot", 60, "key.categories.misc");
      this.field_4547 = var10001;
      var10001 = new class_1357;
      var10001.getEnableBackgroundDrawing1("key.togglePerspective", 63, "key.categories.misc");
      this.field_4548 = var10001;
      var10001 = new class_1357;
      var10001.getEnableBackgroundDrawing1("key.smoothCamera", 0, "key.categories.misc");
      this.field_4549 = var10001;
      var10001 = new class_1357;
      var10001.getEnableBackgroundDrawing1("key.fullscreen", 87, "key.categories.misc");
      this.field_4550 = var10001;
      var10001 = new class_1357;
      var10001.getEnableBackgroundDrawing1("key.streamStartStop", 64, "key.categories.stream");
      this.field_4551 = var10001;
      var10001 = new class_1357;
      var10001.getEnableBackgroundDrawing1("key.streamPauseUnpause", 65, "key.categories.stream");
      this.field_4552 = var10001;
      var10001 = new class_1357;
      var10001.getEnableBackgroundDrawing1("key.streamCommercial", 0, "key.categories.stream");
      this.field_4553 = var10001;
      var10001 = new class_1357;
      var10001.getEnableBackgroundDrawing1("key.streamToggleMic", 0, "key.categories.stream");
      this.field_4554 = var10001;
      var10001 = new class_1357;
      var10001.getEnableBackgroundDrawing1(class_130.field_282 + "/tpyes", 0, class_130.field_287 + "Macros");
      this.tpYes = var10001;
      var10001 = new class_1357;
      var10001.getEnableBackgroundDrawing1(class_130.field_282 + "/f home", 0, class_130.field_287 + "Macros");
      this.fHome = var10001;
      var10001 = new class_1357;
      var10001.getEnableBackgroundDrawing1(class_130.field_282 + "/feed", 0, class_130.field_287 + "Macros");
      this.feed = var10001;
      var10001 = new class_1357;
      var10001.getEnableBackgroundDrawing1(class_130.field_282 + "/spawn", 0, class_130.field_287 + "Macros");
      this.spawn = var10001;
      var10001 = new class_1357;
      var10001.getEnableBackgroundDrawing1(class_130.field_282 + "/bottlexp 10", 0, class_130.field_287 + "Macros");
      this.bottleXp = var10001;
      class_1357[] var2 = new class_1357[9];
      class_1357 var10004 = new class_1357;
      var10004.getEnableBackgroundDrawing1("key.hotbar.1", 2, "key.categories.inventory");
      var2[0] = var10004;
      var10004 = new class_1357;
      var10004.getEnableBackgroundDrawing1("key.hotbar.2", 3, "key.categories.inventory");
      var2[1] = var10004;
      var10004 = new class_1357;
      var10004.getEnableBackgroundDrawing1("key.hotbar.3", 4, "key.categories.inventory");
      var2[2] = var10004;
      var10004 = new class_1357;
      var10004.getEnableBackgroundDrawing1("key.hotbar.4", 5, "key.categories.inventory");
      var2[3] = var10004;
      var10004 = new class_1357;
      var10004.getEnableBackgroundDrawing1("key.hotbar.5", 6, "key.categories.inventory");
      var2[4] = var10004;
      var10004 = new class_1357;
      var10004.getEnableBackgroundDrawing1("key.hotbar.6", 7, "key.categories.inventory");
      var2[5] = var10004;
      var10004 = new class_1357;
      var10004.getEnableBackgroundDrawing1("key.hotbar.7", 8, "key.categories.inventory");
      var2[6] = var10004;
      var10004 = new class_1357;
      var10004.getEnableBackgroundDrawing1("key.hotbar.8", 9, "key.categories.inventory");
      var2[7] = var10004;
      var10004 = new class_1357;
      var10004.getEnableBackgroundDrawing1("key.hotbar.9", 10, "key.categories.inventory");
      var2[8] = var10004;
      this.field_4555 = var2;
      this.field_4556 = (class_1357[])((class_1357[])((class_1357[])((class_1357[])ArrayUtils.addAll(new class_1357[]{this.field_4541, this.field_4539, this.field_4532, this.field_4533, this.field_4534, this.field_4535, this.field_4536, this.field_4537, this.field_4540, this.field_4538, this.field_4544, this.field_4545, this.field_4542, this.field_4546, this.field_4547, this.field_4548, this.field_4549, this.field_4543, this.field_4551, this.field_4552, this.field_4553, this.field_4554, this.field_4550, this.tpYes, this.bottleXp, this.fHome, this.feed, this.spawn}, this.field_4555))));
      this.field_4559 = class_918.field_4629;
      this.field_4564 = "";
      this.field_4568 = 1.0F;
      this.field_4569 = 1.0F;
      this.field_4570 = 70.0F;
      this.field_4575 = "fr_FR";
      this.field_4576 = false;
      this.field_4492 = (int)class_101.field_99.method_471();
      var10001 = new class_1357;
      var10001.getEnableBackgroundDrawing1("Zoom", 29, "key.categories.misc");
      this.ofKeyBindZoom = var10001;
      this.field_4556 = (class_1357[])((class_1357[])((class_1357[])((class_1357[])ArrayUtils.add(this.field_4556, this.ofKeyBindZoom))));
   }

   // $FF: renamed from: c (int) java.lang.String
   public static String method_5347(int var0) {
      String[] var1 = class_752.method_4253();
      int var10000 = var0;
      String var2;
      if(var1 != null) {
         if(var0 < 0) {
            String[] var3 = field_4577;
            var2 = class_1450.method_7896("key.mouseButton", new Object[]{Integer.valueOf(var0 + 101)});
            return var2;
         }

         var10000 = var0;
      }

      var2 = Keyboard.getKeyName(var10000);
      return var2;
   }

   // $FF: renamed from: a (kv) boolean
   public static boolean method_5348(class_1357 var0) {
      String[] var1 = class_752.method_4253();
      int var10000 = var0.getEnableBackgroundDrawing8();
      boolean var2;
      if(var1 != null) {
         if(var10000 == 0) {
            var2 = false;
            return var2;
         }

         var10000 = var0.getEnableBackgroundDrawing8();
      }

      if(var1 != null) {
         if(var10000 < 0) {
            var2 = Mouse.isButtonDown(var0.getEnableBackgroundDrawing8() + 100);
            return var2;
         }

         var10000 = var0.getEnableBackgroundDrawing8();
      }

      var2 = Keyboard.isKeyDown(var10000);
      return var2;
   }

   // $FF: renamed from: a (kv, int) void
   public void method_5349(class_1357 var1, int var2) {
      var1.getEnableBackgroundDrawing9(var2);
      this.method_5358();
   }

   // $FF: renamed from: a (P, float) void
   public void method_5350(class_101 var1, float var2) {
      String[] var3 = class_752.method_4253();
      class_101 var10000 = var1;
      class_101 var10001 = class_101.CLOUD_HEIGHT;
      if(var3 != null) {
         if(var1 == class_101.CLOUD_HEIGHT) {
            this.ofCloudsHeight = var2;
         }

         var10000 = var1;
         var10001 = class_101.AO_LEVEL;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            this.ofAoLevel = var2;
            this.field_4557.cursorCounter7.getSelectionEnd7();
         }

         var10000 = var1;
         var10001 = class_101.field_91;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            this.field_4485 = var2;
         }

         var10000 = var1;
         var10001 = class_101.MUSIC_SOUND;
      }

      bbj var5;
      if(var3 != null) {
         if(var10000 == var10001) {
            var5 = this;
            if(var3 != null) {
               this.musicSound = var2;
               if(MP3Player.getPlayer() == null) {
                  (new MP3Player).method_3209("");
               }

               var5 = this;
            }

            if(var5.musicSound == 0.0F) {
               MP3Player.getPlayer().pThread.stop();
            }

            MP3Player.getPlayer().setVolume(this.musicSound);
         }

         var10000 = var1;
         var10001 = class_101.field_92;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            this.field_4570 = var2;
         }

         var10000 = var1;
         var10001 = class_101.field_93;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            this.field_4571 = var2;
         }

         var10000 = var1;
         var10001 = class_101.field_99;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            this.field_4492 = (int)var2;
            this.field_4504 = false;
            var5 = this;
            if(var3 != null) {
               if(this.field_4492 <= 0) {
                  this.field_4492 = (int)class_101.field_99.method_471();
                  this.field_4504 = true;
               }

               var5 = this;
            }

            var5.updateVSync();
         }

         var10000 = var1;
         var10001 = class_101.field_110;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            this.field_4501 = var2;
            this.field_4557.canLoseFocus4.method_707().method_679();
         }

         var10000 = var1;
         var10001 = class_101.field_119;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            this.field_4516 = var2;
            this.field_4557.canLoseFocus4.method_707().method_679();
         }

         var10000 = var1;
         var10001 = class_101.field_120;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            this.field_4515 = var2;
            this.field_4557.canLoseFocus4.method_707().method_679();
         }

         var10000 = var1;
         var10001 = class_101.field_118;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            this.field_4514 = var2;
            this.field_4557.canLoseFocus4.method_707().method_679();
         }

         var10000 = var1;
         var10001 = class_101.field_117;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            this.field_4513 = var2;
            this.field_4557.canLoseFocus4.method_707().method_679();
         }

         var10000 = var1;
         var10001 = class_101.field_122;
      }

      int var4;
      if(var3 != null) {
         if(var10000 == var10001) {
            label174: {
               var4 = this.field_4519;
               this.field_4519 = (int)var2;
               if(var3 != null) {
                  if((float)var4 == var2) {
                     break label174;
                  }

                  this.field_4557.method_5292().method_7961(this.field_4519);
               }

               this.field_4557.method_5274();
            }
         }

         var10000 = var1;
         var10001 = class_101.field_121;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            label165: {
               var4 = this.field_4518;
               this.field_4518 = (int)var2;
               if(var3 != null) {
                  if((float)var4 == var2) {
                     break label165;
                  }

                  this.field_4557.method_5292().method_7960(this.field_4518);
               }

               this.field_4557.method_5274();
            }
         }

         var10000 = var1;
         var10001 = class_101.field_95;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            this.field_4487 = (int)var2;
         }

         var10000 = var1;
         var10001 = class_101.field_124;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            this.field_4521 = var2;
         }

         var10000 = var1;
         var10001 = class_101.field_125;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            this.field_4522 = var2;
            this.field_4557.method_5297().method_202();
         }

         var10000 = var1;
         var10001 = class_101.field_126;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            this.field_4523 = var2;
            this.field_4557.method_5297().method_202();
         }

         var10000 = var1;
         var10001 = class_101.field_127;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            this.field_4524 = var2;
         }

         var10000 = var1;
         var10001 = class_101.field_128;
      }

      if(var10000 == var10001) {
         this.field_4525 = var2;
      }

   }

   // $FF: renamed from: a (P, int) void
   public void method_5351(class_101 var1, int var2) {
      String[] var3 = class_752.method_4253();
      class_101 var10000 = var1;
      class_101 var10001 = class_101.FOG_FANCY;
      bbj var9;
      if(var3 != null) {
         if(var1 == class_101.FOG_FANCY) {
            label1407: {
               var9 = this;
               if(var3 != null) {
                  switch(this.ofFogType) {
                  case 1:
                     this.ofFogType = 2;
                     if(var3 != null) {
                        if(Config.isFancyFogAvailable()) {
                           break label1407;
                        }

                        this.ofFogType = 3;
                     }

                     if(var3 != null) {
                        break label1407;
                     }
                  case 2:
                     this.ofFogType = 3;
                     if(var3 != null) {
                        break label1407;
                     }
                  case 3:
                     this.ofFogType = 1;
                     if(var3 != null) {
                        break label1407;
                     }
                  default:
                     var9 = this;
                  }
               }

               var9.ofFogType = 1;
            }
         }

         var10000 = var1;
         var10001 = class_101.FOG_START;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            label1392: {
               this.ofFogStart += 0.2F;
               var9 = this;
               if(var3 != null) {
                  if(this.ofFogStart <= 0.81F) {
                     break label1392;
                  }

                  var9 = this;
               }

               var9.ofFogStart = 0.2F;
            }
         }

         var10000 = var1;
         var10001 = class_101.MIPMAP_TYPE;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            label1382: {
               ++this.ofMipmapType;
               var9 = this;
               if(var3 != null) {
                  if(this.ofMipmapType <= 3) {
                     break label1382;
                  }

                  var9 = this;
               }

               var9.ofMipmapType = 0;
            }

            TextureUtils.refreshBlockTextures();
         }

         var10000 = var1;
         var10001 = class_101.LOAD_FAR;
      }

      boolean var10;
      if(var3 != null) {
         if(var10000 == var10001) {
            var10 = this.ofLoadFar;
            if(var3 != null) {
               var10 = !this.ofLoadFar;
            }

            this.ofLoadFar = var10;
            this.field_4557.cursorCounter7.getSelectionEnd7();
         }

         var10000 = var1;
         var10001 = class_101.PRELOADED_CHUNKS;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            this.ofPreloadedChunks += 2;
            var9 = this;
            if(var3 != null) {
               if(this.ofPreloadedChunks > 8) {
                  this.ofPreloadedChunks = 0;
               }

               var9 = this;
            }

            var9.field_4557.cursorCounter7.getSelectionEnd7();
         }

         var10000 = var1;
         var10001 = class_101.SMOOTH_FPS;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            var10 = this.ofSmoothFps;
            if(var3 != null) {
               var10 = !this.ofSmoothFps;
            }

            this.ofSmoothFps = var10;
         }

         var10000 = var1;
         var10001 = class_101.SMOOTH_WORLD;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            var10 = this.ofSmoothWorld;
            if(var3 != null) {
               var10 = !this.ofSmoothWorld;
            }

            this.ofSmoothWorld = var10;
            Config.updateAvailableProcessors();
            if(!Config.isSingleProcessor()) {
               this.ofSmoothWorld = false;
            }

            Config.updateThreadPriorities();
         }

         var10000 = var1;
         var10001 = class_101.CLOUDS;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            label1367: {
               ++this.ofClouds;
               var9 = this;
               if(var3 != null) {
                  if(this.ofClouds <= 3) {
                     break label1367;
                  }

                  var9 = this;
               }

               var9.ofClouds = 0;
            }
         }

         var10000 = var1;
         var10001 = class_101.TREES;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            ++this.ofTrees;
            var9 = this;
            if(var3 != null) {
               if(this.ofTrees > 2) {
                  this.ofTrees = 0;
               }

               var9 = this;
            }

            var9.field_4557.cursorCounter7.getSelectionEnd7();
         }

         var10000 = var1;
         var10001 = class_101.GRASS;
      }

      int var11;
      if(var3 != null) {
         if(var10000 == var10001) {
            ++this.ofGrass;
            var11 = this.ofGrass;
            if(var3 != null) {
               if(this.ofGrass > 2) {
                  this.ofGrass = 0;
               }

               var11 = Config.isGrassFancy();
            }

            blm.field_6957 = (boolean)var11;
            this.field_4557.cursorCounter7.getSelectionEnd7();
         }

         var10000 = var1;
         var10001 = class_101.DROPPED_ITEMS;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            label1355: {
               ++this.ofDroppedItems;
               var9 = this;
               if(var3 != null) {
                  if(this.ofDroppedItems <= 2) {
                     break label1355;
                  }

                  var9 = this;
               }

               var9.ofDroppedItems = 0;
            }
         }

         var10000 = var1;
         var10001 = class_101.RAIN;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            label1346: {
               ++this.ofRain;
               var9 = this;
               if(var3 != null) {
                  if(this.ofRain <= 3) {
                     break label1346;
                  }

                  var9 = this;
               }

               var9.ofRain = 0;
            }
         }

         var10000 = var1;
         var10001 = class_101.WATER;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            label1337: {
               ++this.ofWater;
               var9 = this;
               if(var3 != null) {
                  if(this.ofWater <= 2) {
                     break label1337;
                  }

                  var9 = this;
               }

               var9.ofWater = 0;
            }
         }

         var10000 = var1;
         var10001 = class_101.ANIMATED_WATER;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            label1328: {
               ++this.ofAnimatedWater;
               var9 = this;
               if(var3 != null) {
                  if(this.ofAnimatedWater <= 2) {
                     break label1328;
                  }

                  var9 = this;
               }

               var9.ofAnimatedWater = 0;
            }
         }

         var10000 = var1;
         var10001 = class_101.ANIMATED_LAVA;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            label1319: {
               ++this.ofAnimatedLava;
               var9 = this;
               if(var3 != null) {
                  if(this.ofAnimatedLava <= 2) {
                     break label1319;
                  }

                  var9 = this;
               }

               var9.ofAnimatedLava = 0;
            }
         }

         var10000 = var1;
         var10001 = class_101.ANIMATED_FIRE;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            var10 = this.ofAnimatedFire;
            if(var3 != null) {
               var10 = !this.ofAnimatedFire;
            }

            this.ofAnimatedFire = var10;
         }

         var10000 = var1;
         var10001 = class_101.ANIMATED_PORTAL;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            var10 = this.ofAnimatedPortal;
            if(var3 != null) {
               var10 = !this.ofAnimatedPortal;
            }

            this.ofAnimatedPortal = var10;
         }

         var10000 = var1;
         var10001 = class_101.ANIMATED_REDSTONE;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            var10 = this.ofAnimatedRedstone;
            if(var3 != null) {
               var10 = !this.ofAnimatedRedstone;
            }

            this.ofAnimatedRedstone = var10;
         }

         var10000 = var1;
         var10001 = class_101.ANIMATED_EXPLOSION;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            var10 = this.ofAnimatedExplosion;
            if(var3 != null) {
               var10 = !this.ofAnimatedExplosion;
            }

            this.ofAnimatedExplosion = var10;
         }

         var10000 = var1;
         var10001 = class_101.ANIMATED_FLAME;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            var10 = this.ofAnimatedFlame;
            if(var3 != null) {
               var10 = !this.ofAnimatedFlame;
            }

            this.ofAnimatedFlame = var10;
         }

         var10000 = var1;
         var10001 = class_101.ANIMATED_SMOKE;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            var10 = this.ofAnimatedSmoke;
            if(var3 != null) {
               var10 = !this.ofAnimatedSmoke;
            }

            this.ofAnimatedSmoke = var10;
         }

         var10000 = var1;
         var10001 = class_101.VOID_PARTICLES;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            var10 = this.ofVoidParticles;
            if(var3 != null) {
               var10 = !this.ofVoidParticles;
            }

            this.ofVoidParticles = var10;
         }

         var10000 = var1;
         var10001 = class_101.WATER_PARTICLES;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            var10 = this.ofWaterParticles;
            if(var3 != null) {
               var10 = !this.ofWaterParticles;
            }

            this.ofWaterParticles = var10;
         }

         var10000 = var1;
         var10001 = class_101.PORTAL_PARTICLES;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            var10 = this.ofPortalParticles;
            if(var3 != null) {
               var10 = !this.ofPortalParticles;
            }

            this.ofPortalParticles = var10;
         }

         var10000 = var1;
         var10001 = class_101.POTION_PARTICLES;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            var10 = this.ofPotionParticles;
            if(var3 != null) {
               var10 = !this.ofPotionParticles;
            }

            this.ofPotionParticles = var10;
         }

         var10000 = var1;
         var10001 = class_101.DRIPPING_WATER_LAVA;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            var10 = this.ofDrippingWaterLava;
            if(var3 != null) {
               var10 = !this.ofDrippingWaterLava;
            }

            this.ofDrippingWaterLava = var10;
         }

         var10000 = var1;
         var10001 = class_101.ANIMATED_TERRAIN;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            var10 = this.ofAnimatedTerrain;
            if(var3 != null) {
               var10 = !this.ofAnimatedTerrain;
            }

            this.ofAnimatedTerrain = var10;
         }

         var10000 = var1;
         var10001 = class_101.ANIMATED_TEXTURES;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            var10 = this.ofAnimatedTextures;
            if(var3 != null) {
               var10 = !this.ofAnimatedTextures;
            }

            this.ofAnimatedTextures = var10;
         }

         var10000 = var1;
         var10001 = class_101.ANIMATED_ITEMS;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            var10 = this.ofAnimatedItems;
            if(var3 != null) {
               var10 = !this.ofAnimatedItems;
            }

            this.ofAnimatedItems = var10;
         }

         var10000 = var1;
         var10001 = class_101.RAIN_SPLASH;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            var10 = this.ofRainSplash;
            if(var3 != null) {
               var10 = !this.ofRainSplash;
            }

            this.ofRainSplash = var10;
         }

         var10000 = var1;
         var10001 = class_101.LAGOMETER;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            var10 = this.ofLagometer;
            if(var3 != null) {
               var10 = !this.ofLagometer;
            }

            this.ofLagometer = var10;
         }

         var10000 = var1;
         var10001 = class_101.AUTOSAVE_TICKS;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            label1286: {
               this.ofAutoSaveTicks *= 10;
               var9 = this;
               if(var3 != null) {
                  if(this.ofAutoSaveTicks <= '\u9c40') {
                     break label1286;
                  }

                  var9 = this;
               }

               var9.ofAutoSaveTicks = 40;
            }
         }

         var10000 = var1;
         var10001 = class_101.BETTER_GRASS;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            ++this.ofBetterGrass;
            var9 = this;
            if(var3 != null) {
               if(this.ofBetterGrass > 3) {
                  this.ofBetterGrass = 1;
               }

               var9 = this;
            }

            var9.field_4557.cursorCounter7.getSelectionEnd7();
         }

         var10000 = var1;
         var10001 = class_101.CONNECTED_TEXTURES;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            ++this.ofConnectedTextures;
            var9 = this;
            if(var3 != null) {
               if(this.ofConnectedTextures > 3) {
                  this.ofConnectedTextures = 1;
               }

               var9 = this;
            }

            var9.field_4557.cursorCounter7.getSelectionEnd7();
         }

         var10000 = var1;
         var10001 = class_101.WEATHER;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            var10 = this.ofWeather;
            if(var3 != null) {
               var10 = !this.ofWeather;
            }

            this.ofWeather = var10;
         }

         var10000 = var1;
         var10001 = class_101.SKY;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            var10 = this.ofSky;
            if(var3 != null) {
               var10 = !this.ofSky;
            }

            this.ofSky = var10;
         }

         var10000 = var1;
         var10001 = class_101.STARS;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            var10 = this.ofStars;
            if(var3 != null) {
               var10 = !this.ofStars;
            }

            this.ofStars = var10;
         }

         var10000 = var1;
         var10001 = class_101.SUN_MOON;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            var10 = this.ofSunMoon;
            if(var3 != null) {
               var10 = !this.ofSunMoon;
            }

            this.ofSunMoon = var10;
         }

         var10000 = var1;
         var10001 = class_101.CHUNK_UPDATES;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            label1268: {
               ++this.ofChunkUpdates;
               var9 = this;
               if(var3 != null) {
                  if(this.ofChunkUpdates <= 5) {
                     break label1268;
                  }

                  var9 = this;
               }

               var9.ofChunkUpdates = 1;
            }
         }

         var10000 = var1;
         var10001 = class_101.CHUNK_LOADING;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            ++this.ofChunkLoading;
            var9 = this;
            if(var3 != null) {
               if(this.ofChunkLoading > 2) {
                  this.ofChunkLoading = 0;
               }

               var9 = this;
            }

            var9.updateChunkLoading();
         }

         var10000 = var1;
         var10001 = class_101.CHUNK_UPDATES_DYNAMIC;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            var10 = this.ofChunkUpdatesDynamic;
            if(var3 != null) {
               var10 = !this.ofChunkUpdatesDynamic;
            }

            this.ofChunkUpdatesDynamic = var10;
         }

         var10000 = var1;
         var10001 = class_101.TIME;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            label1256: {
               ++this.ofTime;
               var9 = this;
               if(var3 != null) {
                  if(this.ofTime <= 3) {
                     break label1256;
                  }

                  var9 = this;
               }

               var9.ofTime = 0;
            }
         }

         var10000 = var1;
         var10001 = class_101.CLEAR_WATER;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            var10 = this.ofClearWater;
            if(var3 != null) {
               var10 = !this.ofClearWater;
            }

            this.ofClearWater = var10;
            this.updateWaterOpacity();
         }

         var10000 = var1;
         var10001 = class_101.DEPTH_FOG;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            var10 = this.ofDepthFog;
            if(var3 != null) {
               var10 = !this.ofDepthFog;
            }

            this.ofDepthFog = var10;
         }

         var10000 = var1;
         var10001 = class_101.AA_LEVEL;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            this.ofAaLevel = 0;
         }

         var10000 = var1;
         var10001 = class_101.PROFILER;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            var10 = this.ofProfiler;
            if(var3 != null) {
               var10 = !this.ofProfiler;
            }

            this.ofProfiler = var10;
         }

         var10000 = var1;
         var10001 = class_101.BETTER_SNOW;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            var10 = this.ofBetterSnow;
            if(var3 != null) {
               var10 = !this.ofBetterSnow;
            }

            this.ofBetterSnow = var10;
            this.field_4557.cursorCounter7.getSelectionEnd7();
         }

         var10000 = var1;
         var10001 = class_101.SWAMP_COLORS;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            var10 = this.ofSwampColors;
            if(var3 != null) {
               var10 = !this.ofSwampColors;
            }

            this.ofSwampColors = var10;
            CustomColorizer.updateUseDefaultColorMultiplier();
            this.field_4557.cursorCounter7.getSelectionEnd7();
         }

         var10000 = var1;
         var10001 = class_101.RANDOM_MOBS;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            var10 = this.ofRandomMobs;
            if(var3 != null) {
               var10 = !this.ofRandomMobs;
            }

            this.ofRandomMobs = var10;
            RandomMobs.resetTextures();
         }

         var10000 = var1;
         var10001 = class_101.SMOOTH_BIOMES;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            var10 = this.ofSmoothBiomes;
            if(var3 != null) {
               var10 = !this.ofSmoothBiomes;
            }

            this.ofSmoothBiomes = var10;
            CustomColorizer.updateUseDefaultColorMultiplier();
            this.field_4557.cursorCounter7.getSelectionEnd7();
         }

         var10000 = var1;
         var10001 = class_101.CUSTOM_FONTS;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            var10 = this.ofCustomFonts;
            if(var3 != null) {
               var10 = !this.ofCustomFonts;
            }

            this.ofCustomFonts = var10;
            this.field_4557.enableBackgroundDrawing4.method_221(Config.getResourceManager());
            this.field_4557.enableBackgroundDrawing5.method_221(Config.getResourceManager());
         }

         var10000 = var1;
         var10001 = class_101.CUSTOM_COLORS;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            var10 = this.ofCustomColors;
            if(var3 != null) {
               var10 = !this.ofCustomColors;
            }

            this.ofCustomColors = var10;
            CustomColorizer.update();
            this.field_4557.cursorCounter7.getSelectionEnd7();
         }

         var10000 = var1;
         var10001 = class_101.CUSTOM_SKY;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            var10 = this.ofCustomSky;
            if(var3 != null) {
               var10 = !this.ofCustomSky;
            }

            this.ofCustomSky = var10;
            CustomSky.update();
         }

         var10000 = var1;
         var10001 = class_101.SHOW_CAPES;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            var10 = this.ofShowCapes;
            if(var3 != null) {
               var10 = !this.ofShowCapes;
            }

            this.ofShowCapes = var10;
            this.field_4557.cursorCounter7.updateCapes();
         }

         var10000 = var1;
         var10001 = class_101.NATURAL_TEXTURES;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            var10 = this.ofNaturalTextures;
            if(var3 != null) {
               var10 = !this.ofNaturalTextures;
            }

            this.ofNaturalTextures = var10;
            NaturalTextures.update();
            this.field_4557.cursorCounter7.getSelectionEnd7();
         }

         var10000 = var1;
         var10001 = class_101.FAST_MATH;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            var10 = this.ofFastMath;
            if(var3 != null) {
               var10 = !this.ofFastMath;
            }

            this.ofFastMath = var10;
            class_1715.field_8998 = this.ofFastMath;
         }

         var10000 = var1;
         var10001 = class_101.FAST_RENDER;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            var10 = this.ofFastRender;
            if(var3 != null) {
               var10 = !this.ofFastRender;
            }

            this.ofFastRender = var10;
            this.field_4557.cursorCounter7.getSelectionEnd7();
         }

         var10000 = var1;
         var10001 = class_101.TRANSLUCENT_BLOCKS;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            label1224: {
               var9 = this;
               if(var3 != null) {
                  if(this.ofTranslucentBlocks == 1) {
                     this.ofTranslucentBlocks = 2;
                     if(var3 != null) {
                        break label1224;
                     }
                  }

                  var9 = this;
               }

               var9.ofTranslucentBlocks = 1;
            }

            this.field_4557.cursorCounter7.getSelectionEnd7();
         }

         var10000 = var1;
         var10001 = class_101.LAZY_CHUNK_LOADING;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            var10 = this.ofLazyChunkLoading;
            if(var3 != null) {
               var10 = !this.ofLazyChunkLoading;
            }

            this.ofLazyChunkLoading = var10;
            Config.updateAvailableProcessors();
            if(!Config.isSingleProcessor()) {
               this.ofLazyChunkLoading = false;
            }

            this.field_4557.cursorCounter7.getSelectionEnd7();
         }

         var10000 = var1;
         var10001 = class_101.FULLSCREEN_MODE;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            label1415: {
               List var4 = Arrays.asList(Config.getFullscreenModes());
               String[] var6 = field_4577;
               var11 = this.ofFullscreenMode.equals("Default");
               if(var3 != null) {
                  if(var11 != 0) {
                     this.ofFullscreenMode = (String)var4.get(0);
                     if(var3 != null) {
                        break label1415;
                     }
                  }

                  var11 = var4.indexOf(this.ofFullscreenMode);
               }

               int var5;
               label1206: {
                  label1416: {
                     var5 = var11;
                     var11 = var5;
                     if(var3 != null) {
                        if(var5 < 0) {
                           var6 = field_4577;
                           this.ofFullscreenMode = "Default";
                           if(var3 != null) {
                              break label1415;
                           }
                        }

                        ++var5;
                        if(var3 == null) {
                           break label1416;
                        }

                        var11 = var5;
                     }

                     if(var11 < var4.size()) {
                        break label1206;
                     }

                     String[] var7 = field_4577;
                     this.ofFullscreenMode = "Default";
                  }

                  if(var3 != null) {
                     break label1415;
                  }
               }

               this.ofFullscreenMode = (String)var4.get(var5);
            }
         }

         var10000 = var1;
         var10001 = class_101.HELD_ITEM_TOOLTIPS;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            var10 = this.field_4512;
            if(var3 != null) {
               var10 = !this.field_4512;
            }

            this.field_4512 = var10;
         }

         var10000 = var1;
         var10001 = class_101.field_90;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            var10 = this.field_4486;
            if(var3 != null) {
               var10 = !this.field_4486;
            }

            this.field_4486 = var10;
         }

         var10000 = var1;
         var10001 = class_101.field_104;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            this.field_4573 = this.field_4573 + var2 & 3;
         }

         var10000 = var1;
         var10001 = class_101.field_106;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            this.field_4574 = (this.field_4574 + var2) % 3;
         }

         var10000 = var1;
         var10001 = class_101.field_96;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            var10 = this.field_4488;
            if(var3 != null) {
               var10 = !this.field_4488;
            }

            this.field_4488 = var10;
         }

         var10000 = var1;
         var10001 = class_101.field_105;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            var10 = this.field_4495;
            if(var3 != null) {
               var10 = !this.field_4495;
            }

            this.field_4495 = var10;
         }

         var10000 = var1;
         var10001 = class_101.field_123;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            var10 = this.field_4576;
            if(var3 != null) {
               var10 = !this.field_4576;
            }

            this.field_4576 = var10;
            FontRenderer var12 = this.field_4557.enableBackgroundDrawing4;
            var10 = this.field_4557.method_5291().method_7904();
            if(var3 != null) {
               label1176: {
                  if(!var10) {
                     var10 = this.field_4576;
                     if(var3 == null) {
                        break label1176;
                     }

                     if(!this.field_4576) {
                        var10 = false;
                        break label1176;
                     }
                  }

                  var10 = true;
               }
            }

            var12.setUnicodeFlag(var10);
         }

         var10000 = var1;
         var10001 = class_101.field_98;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            label1419: {
               boolean var13 = Config.isOcclusionAvailable();
               if(var3 != null) {
                  if(!var13) {
                     this.ofOcclusionFancy = false;
                     this.field_4490 = false;
                     if(var3 != null) {
                        break label1419;
                     }
                  }

                  var13 = this.field_4490;
               }

               label1420: {
                  if(var3 != null) {
                     if(!var13) {
                        this.field_4490 = true;
                        this.ofOcclusionFancy = false;
                        if(var3 != null) {
                           break label1419;
                        }
                     }

                     var9 = this;
                     if(var3 == null) {
                        break label1420;
                     }

                     var13 = this.ofOcclusionFancy;
                  }

                  if(!var13) {
                     this.ofOcclusionFancy = true;
                     if(var3 != null) {
                        break label1419;
                     }
                  }

                  this.ofOcclusionFancy = false;
                  var9 = this;
               }

               var9.field_4490 = false;
            }

            this.field_4557.cursorCounter7.setAllRenderersVisible();
         }

         var10000 = var1;
         var10001 = class_101.field_100;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            var10 = this.field_4491;
            if(var3 != null) {
               var10 = !this.field_4491;
            }

            this.field_4491 = var10;
         }

         var10000 = var1;
         var10001 = class_101.field_97;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            var10 = this.field_4489;
            if(var3 != null) {
               var10 = !this.field_4489;
            }

            this.field_4489 = var10;
            this.field_4557.method_5229();
         }

         var10000 = var1;
         var10001 = class_101.field_101;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            this.field_4559 = class_918.method_5393(this.field_4559.method_5392() + var2 & 3);
         }

         var10000 = var1;
         var10001 = class_101.field_102;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            var10 = this.field_4493;
            if(var3 != null) {
               var10 = !this.field_4493;
            }

            this.field_4493 = var10;
            this.field_4557.cursorCounter7.getSelectionEnd7();
         }

         var10000 = var1;
         var10001 = class_101.field_103;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            this.field_4494 = (this.field_4494 + var2) % 3;
            this.field_4557.cursorCounter7.getSelectionEnd7();
         }

         var10000 = var1;
         var10001 = class_101.field_107;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            this.field_4497 = class_932.method_5460((this.field_4497.method_5459() + var2) % 3);
         }

         var10000 = var1;
         var10001 = class_101.field_129;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            this.field_4526 = (this.field_4526 + var2) % 3;
         }

         var10000 = var1;
         var10001 = class_101.field_130;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            var10 = this.field_4527;
            if(var3 != null) {
               var10 = !this.field_4527;
            }

            this.field_4527 = var10;
         }

         var10000 = var1;
         var10001 = class_101.field_131;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            this.field_4529 = (this.field_4529 + var2) % 3;
         }

         var10000 = var1;
         var10001 = class_101.field_132;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            this.field_4530 = (this.field_4530 + var2) % 3;
         }

         var10000 = var1;
         var10001 = class_101.field_133;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            this.field_4531 = (this.field_4531 + var2) % 2;
         }

         var10000 = var1;
         var10001 = class_101.field_108;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            var10 = this.field_4498;
            if(var3 != null) {
               var10 = !this.field_4498;
            }

            this.field_4498 = var10;
         }

         var10000 = var1;
         var10001 = class_101.field_109;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            var10 = this.field_4499;
            if(var3 != null) {
               var10 = !this.field_4499;
            }

            this.field_4499 = var10;
         }

         var10000 = var1;
         var10001 = class_101.field_111;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            var10 = this.field_4500;
            if(var3 != null) {
               var10 = !this.field_4500;
            }

            this.field_4500 = var10;
         }

         var10000 = var1;
         var10001 = class_101.field_112;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            var10 = this.field_4502;
            if(var3 != null) {
               var10 = !this.field_4502;
            }

            this.field_4502 = var10;
         }

         var10000 = var1;
         var10001 = class_101.field_115;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            var10 = this.field_4508;
            if(var3 != null) {
               var10 = !this.field_4508;
            }

            this.field_4508 = var10;
         }

         var10000 = var1;
         var10001 = class_101.field_116;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            var10 = this.field_4509;
            if(var3 != null) {
               var10 = !this.field_4509;
            }

            this.field_4509 = var10;
         }

         var10000 = var1;
         var10001 = class_101.field_113;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            label1422: {
               var10 = this.field_4503;
               if(var3 != null) {
                  var10 = !this.field_4503;
               }

               this.field_4503 = var10;
               bao var8 = this.field_4557;
               if(var3 != null) {
                  if(this.field_4557.method_5284() == this.field_4503) {
                     break label1422;
                  }

                  var8 = this.field_4557;
               }

               var8.method_5254();
            }
         }

         var10000 = var1;
         var10001 = class_101.field_114;
      }

      if(var10000 == var10001) {
         var10 = this.field_4504;
         if(var3 != null) {
            var10 = !this.field_4504;
         }

         this.field_4504 = var10;
         Display.setVSyncEnabled(this.field_4504);
      }

      this.method_5358();
   }

   // $FF: renamed from: a (P) float
   public float method_5352(class_101 var1) {
      String[] var2 = class_752.method_4253();
      class_101 var10000 = var1;
      class_101 var10001 = class_101.CLOUD_HEIGHT;
      float var3;
      if(var2 != null) {
         if(var1 == class_101.CLOUD_HEIGHT) {
            var3 = this.ofCloudsHeight;
            return var3;
         }

         var10000 = var1;
         var10001 = class_101.AO_LEVEL;
      }

      if(var2 != null) {
         if(var10000 == var10001) {
            var3 = this.ofAoLevel;
            return var3;
         }

         var10000 = var1;
         var10001 = class_101.field_99;
      }

      if(var2 != null) {
         if(var10000 == var10001) {
            float var5;
            int var4 = (var5 = (float)this.field_4492 - class_101.field_99.method_471()) == 0.0F?0:(var5 < 0.0F?-1:1);
            if(var2 != null) {
               label195: {
                  if(var4 == 0) {
                     var4 = this.field_4504;
                     if(var2 == null) {
                        break label195;
                     }

                     if(this.field_4504) {
                        var3 = 0.0F;
                        return var3;
                     }
                  }

                  var4 = this.field_4492;
               }
            }

            var3 = (float)var4;
            return var3;
         }

         var10000 = var1;
         var10001 = class_101.field_92;
      }

      if(var2 != null) {
         if(var10000 == var10001) {
            var3 = this.field_4570;
            return var3;
         }

         var10000 = var1;
         var10001 = class_101.field_93;
      }

      if(var2 != null) {
         if(var10000 == var10001) {
            var3 = this.field_4571;
            return var3;
         }

         var10000 = var1;
         var10001 = class_101.field_94;
      }

      if(var2 != null) {
         if(var10000 == var10001) {
            var3 = this.field_4572;
            return var3;
         }

         var10000 = var1;
         var10001 = class_101.field_91;
      }

      if(var2 != null) {
         if(var10000 == var10001) {
            var3 = this.field_4485;
            return var3;
         }

         var10000 = var1;
         var10001 = class_101.MUSIC_SOUND;
      }

      if(var2 != null) {
         if(var10000 == var10001) {
            var3 = this.musicSound;
            return var3;
         }

         var10000 = var1;
         var10001 = class_101.field_110;
      }

      if(var2 != null) {
         if(var10000 == var10001) {
            var3 = this.field_4501;
            return var3;
         }

         var10000 = var1;
         var10001 = class_101.field_119;
      }

      if(var2 != null) {
         if(var10000 == var10001) {
            var3 = this.field_4516;
            return var3;
         }

         var10000 = var1;
         var10001 = class_101.field_120;
      }

      if(var2 != null) {
         if(var10000 == var10001) {
            var3 = this.field_4515;
            return var3;
         }

         var10000 = var1;
         var10001 = class_101.field_117;
      }

      if(var2 != null) {
         if(var10000 == var10001) {
            var3 = this.field_4513;
            return var3;
         }

         var10000 = var1;
         var10001 = class_101.field_118;
      }

      if(var2 != null) {
         if(var10000 == var10001) {
            var3 = this.field_4514;
            return var3;
         }

         var10000 = var1;
         var10001 = class_101.field_99;
      }

      if(var2 != null) {
         if(var10000 == var10001) {
            var3 = (float)this.field_4492;
            return var3;
         }

         var10000 = var1;
         var10001 = class_101.field_122;
      }

      if(var2 != null) {
         if(var10000 == var10001) {
            var3 = (float)this.field_4519;
            return var3;
         }

         var10000 = var1;
         var10001 = class_101.field_121;
      }

      if(var2 != null) {
         if(var10000 == var10001) {
            var3 = (float)this.field_4518;
            return var3;
         }

         var10000 = var1;
         var10001 = class_101.field_95;
      }

      if(var2 != null) {
         if(var10000 == var10001) {
            var3 = (float)this.field_4487;
            return var3;
         }

         var10000 = var1;
         var10001 = class_101.field_124;
      }

      if(var2 != null) {
         if(var10000 == var10001) {
            var3 = this.field_4521;
            return var3;
         }

         var10000 = var1;
         var10001 = class_101.field_125;
      }

      if(var2 != null) {
         if(var10000 == var10001) {
            var3 = this.field_4522;
            return var3;
         }

         var10000 = var1;
         var10001 = class_101.field_126;
      }

      if(var2 != null) {
         if(var10000 == var10001) {
            var3 = this.field_4523;
            return var3;
         }

         var10000 = var1;
         var10001 = class_101.field_127;
      }

      if(var2 != null) {
         if(var10000 == var10001) {
            var3 = this.field_4524;
            return var3;
         }

         var10000 = var1;
         var10001 = class_101.field_128;
      }

      var3 = var10000 == var10001?this.field_4525:0.0F;
      return var3;
   }

   // $FF: renamed from: b (P) boolean
   public boolean method_5353(class_101 var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = class_1327.field_6809[var1.ordinal()];
      if(var2 != null) {
         switch(var10000) {
         case 1:
            return this.field_4486;
         case 2:
            return this.field_4488;
         case 3:
            return this.field_4489;
         case 4:
            return this.field_4490;
         case 5:
            return this.field_4491;
         case 6:
            return this.field_4495;
         case 7:
            return this.field_4498;
         case 8:
            return this.field_4499;
         case 9:
            return this.field_4500;
         case 10:
            return this.field_4502;
         case 11:
            return this.field_4503;
         case 12:
            return this.field_4504;
         case 13:
            return this.field_4508;
         case 14:
            return this.field_4509;
         case 15:
            return this.field_4527;
         case 16:
            return this.field_4576;
         default:
            var10000 = 0;
         }
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: a (java.lang.String[], int) java.lang.String
   private static String method_5354(String[] var0, int var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = var1;
      if(var2 != null) {
         label17: {
            if(var1 >= 0) {
               var10000 = var1;
               if(var2 == null) {
                  break label17;
               }

               if(var1 < var0.length) {
                  return class_1450.method_7896(var0[var1], new Object[0]);
               }
            }

            var10000 = 0;
         }
      }

      var1 = var10000;
      return class_1450.method_7896(var0[var1], new Object[0]);
   }

   // $FF: renamed from: c (P) java.lang.String
   public String method_5355(class_101 var1) {
      String[] var2;
      String var3;
      String[] var9;
      String var13;
      label1214: {
         String[] var10000 = class_752.method_4253();
         StringBuilder var10001 = (new StringBuilder()).append(class_1450.method_7896(var1.method_470(), new Object[0]));
         var9 = field_4577;
         var3 = var10001.append(": ").toString();
         var2 = var10000;
         var13 = var3;
         if(var2 != null) {
            if(var3 != null) {
               break label1214;
            }

            var13 = var1.method_470();
         }

         var3 = var13;
      }

      class_101 var14 = var1;
      class_101 var15 = class_101.field_95;
      String var11;
      int var16;
      byte var19;
      if(var2 != null) {
         if(var1 == class_101.field_95) {
            int var10 = (int)this.method_5352(var1);
            var9 = field_4577;
            var11 = "Tiny";
            byte var6 = 2;
            var16 = var10;
            var19 = 4;
            if(var2 != null) {
               if(var10 >= 4) {
                  var11 = "Short";
                  var6 = 4;
               }

               var16 = var10;
               var19 = 8;
            }

            if(var2 != null) {
               if(var16 >= var19) {
                  var9 = field_4577;
                  var11 = "Normal";
                  var6 = 8;
               }

               var16 = var10;
               var19 = 16;
            }

            if(var2 != null) {
               if(var16 >= var19) {
                  var9 = field_4577;
                  var11 = "Far";
                  var6 = 16;
               }

               var16 = var10;
               var19 = 32;
            }

            if(var2 != null) {
               if(var16 >= var19) {
                  var9 = field_4577;
                  var11 = "Extreme";
                  var6 = 32;
               }

               var16 = this.field_4487;
               var19 = var6;
            }

            int var7 = var16 - var19;
            String var8 = var11;
            if(var7 > 0) {
               var8 = var11 + "+";
            }

            return var3 + var10 + " " + var8 + "";
         }

         var14 = var1;
         var15 = class_101.field_98;
      }

      StringBuilder var17;
      boolean var18;
      if(var2 != null) {
         if(var14 == var15) {
            var18 = this.field_4490;
            if(var2 != null) {
               if(!this.field_4490) {
                  var17 = (new StringBuilder()).append(var3);
                  var9 = field_4577;
                  var13 = var17.append("OFF").toString();
                  return var13;
               }

               var18 = this.ofOcclusionFancy;
            }

            if(var18) {
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               var13 = var17.append("Fancy").toString();
            } else {
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               var13 = var17.append("Fast").toString();
            }

            return var13;
         }

         var14 = var1;
         var15 = class_101.FOG_FANCY;
      }

      if(var2 != null) {
         if(var14 == var15) {
            switch(this.ofFogType) {
            case 1:
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               return var17.append("Fast").toString();
            case 2:
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               return var17.append("Fancy").toString();
            case 3:
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               return var17.append("OFF").toString();
            default:
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               return var17.append("OFF").toString();
            }
         }

         var14 = var1;
         var15 = class_101.FOG_START;
      }

      if(var2 != null) {
         if(var14 == var15) {
            return var3 + this.ofFogStart;
         }

         var14 = var1;
         var15 = class_101.MIPMAP_TYPE;
      }

      if(var2 != null) {
         if(var14 == var15) {
            switch(this.ofMipmapType) {
            case 0:
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               return var17.append("Nearest").toString();
            case 1:
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               return var17.append("Linear").toString();
            case 2:
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               return var17.append("Bilinear").toString();
            case 3:
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               return var17.append("Trilinear").toString();
            default:
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               return var17.append("Nearest").toString();
            }
         }

         var14 = var1;
         var15 = class_101.LOAD_FAR;
      }

      if(var2 != null) {
         if(var14 == var15) {
            if(this.ofLoadFar) {
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               var13 = var17.append("ON").toString();
            } else {
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               var13 = var17.append("OFF").toString();
            }

            return var13;
         }

         var14 = var1;
         var15 = class_101.PRELOADED_CHUNKS;
      }

      if(var2 != null) {
         if(var14 == var15) {
            if(this.ofPreloadedChunks == 0) {
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               var13 = var17.append("OFF").toString();
            } else {
               var13 = var3 + this.ofPreloadedChunks;
            }

            return var13;
         }

         var14 = var1;
         var15 = class_101.SMOOTH_FPS;
      }

      if(var2 != null) {
         if(var14 == var15) {
            if(this.ofSmoothFps) {
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               var13 = var17.append("ON").toString();
            } else {
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               var13 = var17.append("OFF").toString();
            }

            return var13;
         }

         var14 = var1;
         var15 = class_101.SMOOTH_WORLD;
      }

      if(var2 != null) {
         if(var14 == var15) {
            if(this.ofSmoothWorld) {
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               var13 = var17.append("ON").toString();
            } else {
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               var13 = var17.append("OFF").toString();
            }

            return var13;
         }

         var14 = var1;
         var15 = class_101.CLOUDS;
      }

      if(var2 != null) {
         if(var14 == var15) {
            switch(this.ofClouds) {
            case 1:
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               return var17.append("Fast").toString();
            case 2:
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               return var17.append("Fancy").toString();
            case 3:
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               return var17.append("OFF").toString();
            default:
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               return var17.append("Default").toString();
            }
         }

         var14 = var1;
         var15 = class_101.TREES;
      }

      if(var2 != null) {
         if(var14 == var15) {
            switch(this.ofTrees) {
            case 1:
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               return var17.append("Fast").toString();
            case 2:
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               return var17.append("Fancy").toString();
            default:
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               return var17.append("Default").toString();
            }
         }

         var14 = var1;
         var15 = class_101.GRASS;
      }

      if(var2 != null) {
         if(var14 == var15) {
            switch(this.ofGrass) {
            case 1:
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               return var17.append("Fast").toString();
            case 2:
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               return var17.append("Fancy").toString();
            default:
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               return var17.append("Default").toString();
            }
         }

         var14 = var1;
         var15 = class_101.DROPPED_ITEMS;
      }

      if(var2 != null) {
         if(var14 == var15) {
            switch(this.ofDroppedItems) {
            case 1:
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               return var17.append("Fast").toString();
            case 2:
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               return var17.append("Fancy").toString();
            default:
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               return var17.append("Default").toString();
            }
         }

         var14 = var1;
         var15 = class_101.RAIN;
      }

      if(var2 != null) {
         if(var14 == var15) {
            switch(this.ofRain) {
            case 1:
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               return var17.append("Fast").toString();
            case 2:
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               return var17.append("Fancy").toString();
            case 3:
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               return var17.append("OFF").toString();
            default:
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               return var17.append("Default").toString();
            }
         }

         var14 = var1;
         var15 = class_101.WATER;
      }

      if(var2 != null) {
         if(var14 == var15) {
            switch(this.ofWater) {
            case 1:
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               return var17.append("Fast").toString();
            case 2:
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               return var17.append("Fancy").toString();
            case 3:
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               return var17.append("OFF").toString();
            default:
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               return var17.append("Default").toString();
            }
         }

         var14 = var1;
         var15 = class_101.ANIMATED_WATER;
      }

      if(var2 != null) {
         if(var14 == var15) {
            switch(this.ofAnimatedWater) {
            case 1:
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               return var17.append("Dynamic").toString();
            case 2:
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               return var17.append("OFF").toString();
            default:
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               return var17.append("ON").toString();
            }
         }

         var14 = var1;
         var15 = class_101.ANIMATED_LAVA;
      }

      if(var2 != null) {
         if(var14 == var15) {
            switch(this.ofAnimatedLava) {
            case 1:
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               return var17.append("Dynamic").toString();
            case 2:
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               return var17.append("OFF").toString();
            default:
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               return var17.append("ON").toString();
            }
         }

         var14 = var1;
         var15 = class_101.ANIMATED_FIRE;
      }

      if(var2 != null) {
         if(var14 == var15) {
            if(this.ofAnimatedFire) {
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               var13 = var17.append("ON").toString();
            } else {
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               var13 = var17.append("OFF").toString();
            }

            return var13;
         }

         var14 = var1;
         var15 = class_101.ANIMATED_PORTAL;
      }

      if(var2 != null) {
         if(var14 == var15) {
            if(this.ofAnimatedPortal) {
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               var13 = var17.append("ON").toString();
            } else {
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               var13 = var17.append("OFF").toString();
            }

            return var13;
         }

         var14 = var1;
         var15 = class_101.ANIMATED_REDSTONE;
      }

      if(var2 != null) {
         if(var14 == var15) {
            if(this.ofAnimatedRedstone) {
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               var13 = var17.append("ON").toString();
            } else {
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               var13 = var17.append("OFF").toString();
            }

            return var13;
         }

         var14 = var1;
         var15 = class_101.ANIMATED_EXPLOSION;
      }

      if(var2 != null) {
         if(var14 == var15) {
            if(this.ofAnimatedExplosion) {
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               var13 = var17.append("ON").toString();
            } else {
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               var13 = var17.append("OFF").toString();
            }

            return var13;
         }

         var14 = var1;
         var15 = class_101.ANIMATED_FLAME;
      }

      if(var2 != null) {
         if(var14 == var15) {
            if(this.ofAnimatedFlame) {
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               var13 = var17.append("ON").toString();
            } else {
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               var13 = var17.append("OFF").toString();
            }

            return var13;
         }

         var14 = var1;
         var15 = class_101.ANIMATED_SMOKE;
      }

      if(var2 != null) {
         if(var14 == var15) {
            if(this.ofAnimatedSmoke) {
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               var13 = var17.append("ON").toString();
            } else {
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               var13 = var17.append("OFF").toString();
            }

            return var13;
         }

         var14 = var1;
         var15 = class_101.VOID_PARTICLES;
      }

      if(var2 != null) {
         if(var14 == var15) {
            if(this.ofVoidParticles) {
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               var13 = var17.append("ON").toString();
            } else {
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               var13 = var17.append("OFF").toString();
            }

            return var13;
         }

         var14 = var1;
         var15 = class_101.WATER_PARTICLES;
      }

      if(var2 != null) {
         if(var14 == var15) {
            if(this.ofWaterParticles) {
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               var13 = var17.append("ON").toString();
            } else {
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               var13 = var17.append("OFF").toString();
            }

            return var13;
         }

         var14 = var1;
         var15 = class_101.PORTAL_PARTICLES;
      }

      if(var2 != null) {
         if(var14 == var15) {
            if(this.ofPortalParticles) {
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               var13 = var17.append("ON").toString();
            } else {
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               var13 = var17.append("OFF").toString();
            }

            return var13;
         }

         var14 = var1;
         var15 = class_101.POTION_PARTICLES;
      }

      if(var2 != null) {
         if(var14 == var15) {
            if(this.ofPotionParticles) {
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               var13 = var17.append("ON").toString();
            } else {
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               var13 = var17.append("OFF").toString();
            }

            return var13;
         }

         var14 = var1;
         var15 = class_101.DRIPPING_WATER_LAVA;
      }

      if(var2 != null) {
         if(var14 == var15) {
            if(this.ofDrippingWaterLava) {
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               var13 = var17.append("ON").toString();
            } else {
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               var13 = var17.append("OFF").toString();
            }

            return var13;
         }

         var14 = var1;
         var15 = class_101.ANIMATED_TERRAIN;
      }

      if(var2 != null) {
         if(var14 == var15) {
            if(this.ofAnimatedTerrain) {
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               var13 = var17.append("ON").toString();
            } else {
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               var13 = var17.append("OFF").toString();
            }

            return var13;
         }

         var14 = var1;
         var15 = class_101.ANIMATED_TEXTURES;
      }

      if(var2 != null) {
         if(var14 == var15) {
            if(this.ofAnimatedTextures) {
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               var13 = var17.append("ON").toString();
            } else {
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               var13 = var17.append("OFF").toString();
            }

            return var13;
         }

         var14 = var1;
         var15 = class_101.ANIMATED_ITEMS;
      }

      if(var2 != null) {
         if(var14 == var15) {
            if(this.ofAnimatedItems) {
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               var13 = var17.append("ON").toString();
            } else {
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               var13 = var17.append("OFF").toString();
            }

            return var13;
         }

         var14 = var1;
         var15 = class_101.RAIN_SPLASH;
      }

      if(var2 != null) {
         if(var14 == var15) {
            if(this.ofRainSplash) {
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               var13 = var17.append("ON").toString();
            } else {
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               var13 = var17.append("OFF").toString();
            }

            return var13;
         }

         var14 = var1;
         var15 = class_101.LAGOMETER;
      }

      if(var2 != null) {
         if(var14 == var15) {
            if(this.ofLagometer) {
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               var13 = var17.append("ON").toString();
            } else {
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               var13 = var17.append("OFF").toString();
            }

            return var13;
         }

         var14 = var1;
         var15 = class_101.AUTOSAVE_TICKS;
      }

      if(var2 != null) {
         if(var14 == var15) {
            var16 = this.ofAutoSaveTicks;
            short var20 = 40;
            if(var2 != null) {
               if(this.ofAutoSaveTicks <= 40) {
                  var17 = (new StringBuilder()).append(var3);
                  var9 = field_4577;
                  var13 = var17.append("Default (2s)").toString();
                  return var13;
               }

               var16 = this.ofAutoSaveTicks;
               var20 = 400;
            }

            if(var2 != null) {
               if(var16 <= var20) {
                  var17 = (new StringBuilder()).append(var3);
                  var9 = field_4577;
                  var13 = var17.append("20s").toString();
                  return var13;
               }

               var16 = this.ofAutoSaveTicks;
               var20 = 4000;
            }

            if(var16 <= var20) {
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               var13 = var17.append("3min").toString();
            } else {
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               var13 = var17.append("30min").toString();
            }

            return var13;
         }

         var14 = var1;
         var15 = class_101.BETTER_GRASS;
      }

      if(var2 != null) {
         if(var14 == var15) {
            switch(this.ofBetterGrass) {
            case 1:
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               return var17.append("Fast").toString();
            case 2:
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               return var17.append("Fancy").toString();
            default:
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               return var17.append("OFF").toString();
            }
         }

         var14 = var1;
         var15 = class_101.CONNECTED_TEXTURES;
      }

      if(var2 != null) {
         if(var14 == var15) {
            switch(this.ofConnectedTextures) {
            case 1:
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               return var17.append("Fast").toString();
            case 2:
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               return var17.append("Fancy").toString();
            default:
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               return var17.append("OFF").toString();
            }
         }

         var14 = var1;
         var15 = class_101.WEATHER;
      }

      if(var2 != null) {
         if(var14 == var15) {
            if(this.ofWeather) {
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               var13 = var17.append("ON").toString();
            } else {
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               var13 = var17.append("OFF").toString();
            }

            return var13;
         }

         var14 = var1;
         var15 = class_101.SKY;
      }

      if(var2 != null) {
         if(var14 == var15) {
            if(this.ofSky) {
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               var13 = var17.append("ON").toString();
            } else {
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               var13 = var17.append("OFF").toString();
            }

            return var13;
         }

         var14 = var1;
         var15 = class_101.STARS;
      }

      if(var2 != null) {
         if(var14 == var15) {
            if(this.ofStars) {
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               var13 = var17.append("ON").toString();
            } else {
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               var13 = var17.append("OFF").toString();
            }

            return var13;
         }

         var14 = var1;
         var15 = class_101.SUN_MOON;
      }

      if(var2 != null) {
         if(var14 == var15) {
            if(this.ofSunMoon) {
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               var13 = var17.append("ON").toString();
            } else {
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               var13 = var17.append("OFF").toString();
            }

            return var13;
         }

         var14 = var1;
         var15 = class_101.CHUNK_UPDATES;
      }

      if(var2 != null) {
         if(var14 == var15) {
            return var3 + this.ofChunkUpdates;
         }

         var14 = var1;
         var15 = class_101.CHUNK_LOADING;
      }

      if(var2 != null) {
         if(var14 == var15) {
            var16 = this.ofChunkLoading;
            var19 = 1;
            if(var2 != null) {
               if(this.ofChunkLoading == 1) {
                  var17 = (new StringBuilder()).append(var3);
                  var9 = field_4577;
                  var13 = var17.append("Smooth").toString();
                  return var13;
               }

               var16 = this.ofChunkLoading;
               var19 = 2;
            }

            if(var16 == var19) {
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               var13 = var17.append("Multi-Core").toString();
            } else {
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               var13 = var17.append("Default").toString();
            }

            return var13;
         }

         var14 = var1;
         var15 = class_101.CHUNK_UPDATES_DYNAMIC;
      }

      if(var2 != null) {
         if(var14 == var15) {
            if(this.ofChunkUpdatesDynamic) {
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               var13 = var17.append("ON").toString();
            } else {
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               var13 = var17.append("OFF").toString();
            }

            return var13;
         }

         var14 = var1;
         var15 = class_101.TIME;
      }

      if(var2 != null) {
         if(var14 == var15) {
            var16 = this.ofTime;
            var19 = 1;
            if(var2 != null) {
               if(this.ofTime == 1) {
                  var17 = (new StringBuilder()).append(var3);
                  var9 = field_4577;
                  var13 = var17.append("Day Only").toString();
                  return var13;
               }

               var16 = this.ofTime;
               var19 = 3;
            }

            if(var16 == var19) {
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               var13 = var17.append("Night Only").toString();
            } else {
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               var13 = var17.append("Default").toString();
            }

            return var13;
         }

         var14 = var1;
         var15 = class_101.CLEAR_WATER;
      }

      if(var2 != null) {
         if(var14 == var15) {
            if(this.ofClearWater) {
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               var13 = var17.append("ON").toString();
            } else {
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               var13 = var17.append("OFF").toString();
            }

            return var13;
         }

         var14 = var1;
         var15 = class_101.DEPTH_FOG;
      }

      if(var2 != null) {
         if(var14 == var15) {
            if(this.ofDepthFog) {
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               var13 = var17.append("ON").toString();
            } else {
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               var13 = var17.append("OFF").toString();
            }

            return var13;
         }

         var14 = var1;
         var15 = class_101.AA_LEVEL;
      }

      if(var2 != null) {
         if(var14 == var15) {
            if(this.ofAaLevel == 0) {
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               var13 = var17.append("OFF").toString();
            } else {
               var13 = var3 + this.ofAaLevel;
            }

            return var13;
         }

         var14 = var1;
         var15 = class_101.PROFILER;
      }

      if(var2 != null) {
         if(var14 == var15) {
            if(this.ofProfiler) {
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               var13 = var17.append("ON").toString();
            } else {
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               var13 = var17.append("OFF").toString();
            }

            return var13;
         }

         var14 = var1;
         var15 = class_101.BETTER_SNOW;
      }

      if(var2 != null) {
         if(var14 == var15) {
            if(this.ofBetterSnow) {
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               var13 = var17.append("ON").toString();
            } else {
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               var13 = var17.append("OFF").toString();
            }

            return var13;
         }

         var14 = var1;
         var15 = class_101.SWAMP_COLORS;
      }

      if(var2 != null) {
         if(var14 == var15) {
            if(this.ofSwampColors) {
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               var13 = var17.append("ON").toString();
            } else {
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               var13 = var17.append("OFF").toString();
            }

            return var13;
         }

         var14 = var1;
         var15 = class_101.RANDOM_MOBS;
      }

      if(var2 != null) {
         if(var14 == var15) {
            if(this.ofRandomMobs) {
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               var13 = var17.append("ON").toString();
            } else {
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               var13 = var17.append("OFF").toString();
            }

            return var13;
         }

         var14 = var1;
         var15 = class_101.SMOOTH_BIOMES;
      }

      if(var2 != null) {
         if(var14 == var15) {
            if(this.ofSmoothBiomes) {
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               var13 = var17.append("ON").toString();
            } else {
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               var13 = var17.append("OFF").toString();
            }

            return var13;
         }

         var14 = var1;
         var15 = class_101.CUSTOM_FONTS;
      }

      if(var2 != null) {
         if(var14 == var15) {
            if(this.ofCustomFonts) {
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               var13 = var17.append("ON").toString();
            } else {
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               var13 = var17.append("OFF").toString();
            }

            return var13;
         }

         var14 = var1;
         var15 = class_101.CUSTOM_COLORS;
      }

      if(var2 != null) {
         if(var14 == var15) {
            if(this.ofCustomColors) {
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               var13 = var17.append("ON").toString();
            } else {
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               var13 = var17.append("OFF").toString();
            }

            return var13;
         }

         var14 = var1;
         var15 = class_101.CUSTOM_SKY;
      }

      if(var2 != null) {
         if(var14 == var15) {
            if(this.ofCustomSky) {
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               var13 = var17.append("ON").toString();
            } else {
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               var13 = var17.append("OFF").toString();
            }

            return var13;
         }

         var14 = var1;
         var15 = class_101.SHOW_CAPES;
      }

      if(var2 != null) {
         if(var14 == var15) {
            if(this.ofShowCapes) {
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               var13 = var17.append("ON").toString();
            } else {
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               var13 = var17.append("OFF").toString();
            }

            return var13;
         }

         var14 = var1;
         var15 = class_101.NATURAL_TEXTURES;
      }

      if(var2 != null) {
         if(var14 == var15) {
            if(this.ofNaturalTextures) {
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               var13 = var17.append("ON").toString();
            } else {
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               var13 = var17.append("OFF").toString();
            }

            return var13;
         }

         var14 = var1;
         var15 = class_101.FAST_MATH;
      }

      if(var2 != null) {
         if(var14 == var15) {
            if(this.ofFastMath) {
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               var13 = var17.append("ON").toString();
            } else {
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               var13 = var17.append("OFF").toString();
            }

            return var13;
         }

         var14 = var1;
         var15 = class_101.FAST_RENDER;
      }

      if(var2 != null) {
         if(var14 == var15) {
            if(this.ofFastRender) {
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               var13 = var17.append("ON").toString();
            } else {
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               var13 = var17.append("OFF").toString();
            }

            return var13;
         }

         var14 = var1;
         var15 = class_101.TRANSLUCENT_BLOCKS;
      }

      if(var2 != null) {
         if(var14 == var15) {
            if(this.ofTranslucentBlocks == 1) {
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               var13 = var17.append("Fast").toString();
            } else {
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               var13 = var17.append("Fancy").toString();
            }

            return var13;
         }

         var14 = var1;
         var15 = class_101.LAZY_CHUNK_LOADING;
      }

      if(var2 != null) {
         if(var14 == var15) {
            if(this.ofLazyChunkLoading) {
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               var13 = var17.append("ON").toString();
            } else {
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               var13 = var17.append("OFF").toString();
            }

            return var13;
         }

         var14 = var1;
         var15 = class_101.FULLSCREEN_MODE;
      }

      if(var2 != null) {
         if(var14 == var15) {
            return var3 + this.ofFullscreenMode;
         }

         var14 = var1;
         var15 = class_101.HELD_ITEM_TOOLTIPS;
      }

      float var4;
      label1219: {
         if(var2 != null) {
            if(var14 == var15) {
               if(this.field_4512) {
                  var17 = (new StringBuilder()).append(var3);
                  var9 = field_4577;
                  var13 = var17.append("ON").toString();
               } else {
                  var17 = (new StringBuilder()).append(var3);
                  var9 = field_4577;
                  var13 = var17.append("OFF").toString();
               }

               return var13;
            }

            var14 = var1;
            if(var2 == null) {
               break label1219;
            }

            var15 = class_101.field_99;
         }

         if(var14 == var15) {
            var4 = this.method_5352(var1);
            float var21;
            var16 = (var21 = var4 - 0.0F) == 0.0F?0:(var21 < 0.0F?-1:1);
            if(var2 != null) {
               if(var16 == 0) {
                  var17 = (new StringBuilder()).append(var3);
                  var9 = field_4577;
                  var13 = var17.append("VSync").toString();
                  return var13;
               }

               float var22;
               var16 = (var22 = var4 - class_101.method_480(var1)) == 0.0F?0:(var22 < 0.0F?-1:1);
            }

            if(var16 == 0) {
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               var13 = var17.append(class_1450.method_7896("options.framerateLimit.max", new Object[0])).toString();
            } else {
               var17 = (new StringBuilder()).append(var3).append((int)var4);
               var9 = field_4577;
               var13 = var17.append(" fps").toString();
            }

            return var13;
         }

         var14 = var1;
      }

      label1221: {
         var18 = var14.method_467();
         if(var2 != null) {
            if(var18) {
               var4 = this.method_5352(var1);
               float var12 = var1.method_473(var4);
               var14 = var1;
               var15 = class_101.field_91;
               if(var2 != null) {
                  if(var1 == class_101.field_91) {
                     float var23;
                     var16 = (var23 = var12 - 0.0F) == 0.0F?0:(var23 < 0.0F?-1:1);
                     if(var2 != null) {
                        if(var16 == 0) {
                           var17 = (new StringBuilder()).append(var3);
                           var9 = field_4577;
                           var13 = var17.append(class_1450.method_7896("options.sensitivity.min", new Object[0])).toString();
                           return var13;
                        }

                        float var24;
                        var16 = (var24 = var12 - 1.0F) == 0.0F?0:(var24 < 0.0F?-1:1);
                     }

                     if(var16 == 0) {
                        var17 = (new StringBuilder()).append(var3);
                        var9 = field_4577;
                        var13 = var17.append(class_1450.method_7896("options.sensitivity.max", new Object[0])).toString();
                     } else {
                        var13 = var3 + (int)(var12 * 200.0F) + "%";
                     }

                     return var13;
                  }

                  var14 = var1;
                  var15 = class_101.field_92;
               }

               if(var2 != null) {
                  if(var14 == var15) {
                     float var25;
                     var16 = (var25 = var4 - 70.0F) == 0.0F?0:(var25 < 0.0F?-1:1);
                     if(var2 != null) {
                        if(var16 == 0) {
                           var17 = (new StringBuilder()).append(var3);
                           var9 = field_4577;
                           var13 = var17.append(class_1450.method_7896("options.fov.min", new Object[0])).toString();
                           return var13;
                        }

                        float var26;
                        var16 = (var26 = var4 - 110.0F) == 0.0F?0:(var26 < 0.0F?-1:1);
                     }

                     if(var16 == 0) {
                        var17 = (new StringBuilder()).append(var3);
                        var9 = field_4577;
                        var13 = var17.append(class_1450.method_7896("options.fov.max", new Object[0])).toString();
                     } else {
                        var13 = var3 + (int)var4;
                     }

                     return var13;
                  }

                  var14 = var1;
                  var15 = class_101.MUSIC_SOUND;
               }

               if(var2 != null) {
                  if(var14 == var15) {
                     float var27;
                     var16 = (var27 = var4 - 0.0F) == 0.0F?0:(var27 < 0.0F?-1:1);
                     if(var2 != null) {
                        if(var16 == 0) {
                           var17 = (new StringBuilder()).append(class_130.field_288);
                           var9 = field_4577;
                           var13 = var17.append("Aucune musique").toString();
                           return var13;
                        }

                        float var28;
                        var16 = (var28 = var4 - 1.0F) == 0.0F?0:(var28 < 0.0F?-1:1);
                     }

                     if(var16 == 0) {
                        var9 = field_4577;
                        var13 = "Volume: 100%";
                     } else {
                        var17 = new StringBuilder();
                        var9 = field_4577;
                        var13 = var17.append("Volume: ").append((int)(var4 * 100.0F)).append("%").toString();
                     }

                     return var13;
                  }

                  var14 = var1;
                  var15 = class_101.field_99;
               }

               if(var2 != null) {
                  if(var14 == var15) {
                     if(var4 == class_101.method_480(var1)) {
                        var17 = (new StringBuilder()).append(var3);
                        var9 = field_4577;
                        var13 = var17.append(class_1450.method_7896("options.framerateLimit.max", new Object[0])).toString();
                     } else {
                        var17 = (new StringBuilder()).append(var3).append((int)var4);
                        var9 = field_4577;
                        var13 = var17.append(" fps").toString();
                     }

                     return var13;
                  }

                  var14 = var1;
                  var15 = class_101.field_93;
               }

               if(var2 != null) {
                  if(var14 == var15) {
                     float var29;
                     var16 = (var29 = var12 - 0.0F) == 0.0F?0:(var29 < 0.0F?-1:1);
                     if(var2 != null) {
                        if(var16 == 0) {
                           var17 = (new StringBuilder()).append(var3);
                           var9 = field_4577;
                           var13 = var17.append(class_1450.method_7896("options.gamma.min", new Object[0])).toString();
                           return var13;
                        }

                        float var30;
                        var16 = (var30 = var12 - 1.0F) == 0.0F?0:(var30 < 0.0F?-1:1);
                     }

                     if(var16 == 0) {
                        var17 = (new StringBuilder()).append(var3);
                        var9 = field_4577;
                        var13 = var17.append(class_1450.method_7896("options.gamma.max", new Object[0])).toString();
                     } else {
                        var13 = var3 + "+" + (int)(var12 * 100.0F) + "%";
                     }

                     return var13;
                  }

                  var14 = var1;
                  var15 = class_101.field_94;
               }

               if(var2 != null) {
                  if(var14 == var15) {
                     var13 = var3 + (int)(var12 * 400.0F) + "%";
                     return var13;
                  }

                  var14 = var1;
                  var15 = class_101.field_110;
               }

               if(var2 != null) {
                  if(var14 == var15) {
                     var13 = var3 + (int)(var12 * 90.0F + 10.0F) + "%";
                     return var13;
                  }

                  var14 = var1;
                  var15 = class_101.field_120;
               }

               if(var2 != null) {
                  if(var14 == var15) {
                     var17 = (new StringBuilder()).append(var3).append(bcc.method_691(var12));
                     var9 = field_4577;
                     var13 = var17.append("px").toString();
                     return var13;
                  }

                  var14 = var1;
                  var15 = class_101.field_119;
               }

               if(var2 != null) {
                  if(var14 == var15) {
                     var17 = (new StringBuilder()).append(var3).append(bcc.method_691(var12));
                     var9 = field_4577;
                     var13 = var17.append("px").toString();
                     return var13;
                  }

                  var14 = var1;
                  var15 = class_101.field_118;
               }

               if(var2 != null) {
                  if(var14 == var15) {
                     var17 = (new StringBuilder()).append(var3).append(bcc.method_690(var12));
                     var9 = field_4577;
                     var13 = var17.append("px").toString();
                     return var13;
                  }

                  var14 = var1;
                  var15 = class_101.field_95;
               }

               if(var2 != null) {
                  if(var14 == var15) {
                     var17 = (new StringBuilder()).append(var3).append((int)var4);
                     var9 = field_4577;
                     var13 = var17.append(" chunks").toString();
                     return var13;
                  }

                  var14 = var1;
                  var15 = class_101.field_122;
               }

               if(var2 != null) {
                  if(var14 == var15) {
                     if(var4 == 1.0F) {
                        var17 = (new StringBuilder()).append(var3);
                        var9 = field_4577;
                        var13 = var17.append(class_1450.method_7896("options.off", new Object[0])).toString();
                     } else {
                        var13 = var3 + (int)var4;
                     }

                     return var13;
                  }

                  var14 = var1;
                  var15 = class_101.field_121;
               }

               if(var2 != null) {
                  if(var14 == var15) {
                     if(var4 == 0.0F) {
                        var17 = (new StringBuilder()).append(var3);
                        var9 = field_4577;
                        var13 = var17.append(class_1450.method_7896("options.off", new Object[0])).toString();
                     } else {
                        var13 = var3 + (int)var4;
                     }

                     return var13;
                  }

                  var14 = var1;
                  var15 = class_101.field_128;
               }

               if(var2 != null) {
                  if(var14 == var15) {
                     var17 = (new StringBuilder()).append(var3).append(class_1493.method_8058(var12));
                     var9 = field_4577;
                     var13 = var17.append(" fps").toString();
                     return var13;
                  }

                  var14 = var1;
                  var15 = class_101.field_127;
               }

               if(var2 != null) {
                  if(var14 == var15) {
                     var17 = (new StringBuilder()).append(var3).append(class_1493.method_8059(var12));
                     var9 = field_4577;
                     var13 = var17.append(" Kbps").toString();
                     return var13;
                  }

                  var14 = var1;
                  var15 = class_101.field_124;
               }

               if(var14 == var15) {
                  var17 = (new StringBuilder()).append(var3);
                  var9 = field_4577;
                  var13 = var17.append(String.format("%.3f bpp", new Object[]{Float.valueOf(class_1493.method_8060(var12))})).toString();
               } else if(var12 == 0.0F) {
                  var17 = (new StringBuilder()).append(var3);
                  var9 = field_4577;
                  var13 = var17.append(class_1450.method_7896("options.off", new Object[0])).toString();
               } else {
                  var13 = var3 + (int)(var12 * 100.0F) + "%";
               }

               return var13;
            }

            var14 = var1;
            if(var2 == null) {
               break label1221;
            }

            var18 = var1.method_468();
         }

         if(var18) {
            boolean var5 = this.method_5353(var1);
            if(var5) {
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               var13 = var17.append(class_1450.method_7896("options.on", new Object[0])).toString();
            } else {
               var17 = (new StringBuilder()).append(var3);
               var9 = field_4577;
               var13 = var17.append(class_1450.method_7896("options.off", new Object[0])).toString();
            }

            return var13;
         }

         var14 = var1;
      }

      var15 = class_101.field_101;
      if(var2 != null) {
         if(var14 == class_101.field_101) {
            return var3 + class_1450.method_7896(this.field_4559.method_5394(), new Object[0]);
         }

         var14 = var1;
         var15 = class_101.field_104;
      }

      if(var2 != null) {
         if(var14 == var15) {
            return var3 + method_5354(field_4478, this.field_4573);
         }

         var14 = var1;
         var15 = class_101.field_107;
      }

      if(var2 != null) {
         if(var14 == var15) {
            return var3 + class_1450.method_7896(this.field_4497.method_5461(), new Object[0]);
         }

         var14 = var1;
         var15 = class_101.field_106;
      }

      if(var2 != null) {
         if(var14 == var15) {
            return var3 + method_5354(field_4479, this.field_4574);
         }

         var14 = var1;
         var15 = class_101.field_103;
      }

      if(var2 != null) {
         if(var14 == var15) {
            return var3 + method_5354(field_4480, this.field_4494);
         }

         var14 = var1;
         var15 = class_101.field_129;
      }

      if(var2 != null) {
         if(var14 == var15) {
            return var3 + method_5354(field_4481, this.field_4526);
         }

         var14 = var1;
         var15 = class_101.field_131;
      }

      if(var2 != null) {
         if(var14 == var15) {
            return var3 + method_5354(field_4482, this.field_4529);
         }

         var14 = var1;
         var15 = class_101.field_132;
      }

      if(var2 != null) {
         if(var14 == var15) {
            return var3 + method_5354(field_4483, this.field_4530);
         }

         var14 = var1;
         var15 = class_101.field_133;
      }

      if(var2 != null) {
         if(var14 == var15) {
            return var3 + method_5354(field_4484, this.field_4531);
         }

         var14 = var1;
         var15 = class_101.field_102;
      }

      if(var14 == var15) {
         if(this.field_4493) {
            var17 = (new StringBuilder()).append(var3);
            var9 = field_4577;
            return var17.append(class_1450.method_7896("options.graphics.fancy", new Object[0])).toString();
         } else {
            var9 = field_4577;
            var11 = "options.graphics.fast";
            return var3 + class_1450.method_7896("options.graphics.fast", new Object[0]);
         }
      } else {
         return var3;
      }
   }

   // $FF: renamed from: a () void
   public void method_5356() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (java.lang.String) float
   private float method_5357(String var1) {
      String var4;
      float var5;
      label26: {
         String[] var2 = class_752.method_4253();
         String[] var3 = field_4577;
         boolean var10000 = var1.equals("true");
         if(var2 != null) {
            if(var10000) {
               var5 = 1.0F;
               return var5;
            }

            var4 = var1;
            if(var2 == null) {
               break label26;
            }

            String[] var10001 = field_4577;
            var10000 = var1.equals("false");
         }

         if(var10000) {
            var5 = 0.0F;
            return var5;
         }

         var4 = var1;
      }

      var5 = Float.parseFloat(var4);
      return var5;
   }

   // $FF: renamed from: b () void
   public void method_5358() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (aw) float
   public float method_5359(class_930 var1) {
      String[] var2 = class_752.method_4253();
      Map var10000 = this.field_4520;
      class_930 var10001 = var1;
      float var3;
      if(var2 != null) {
         if(!this.field_4520.containsKey(var1)) {
            var3 = 1.0F;
            return var3;
         }

         var10000 = this.field_4520;
         var10001 = var1;
      }

      var3 = ((Float)var10000.get(var10001)).floatValue();
      return var3;
   }

   // $FF: renamed from: a (aw, float) void
   public void method_5360(class_930 var1, float var2) {
      this.field_4557.method_5295().method_8373(var1, var2);
      this.field_4520.put(var1, Float.valueOf(var2));
   }

   // $FF: renamed from: c () void
   public void method_5361() {
      String[] var1 = class_752.method_4253();
      bjk var10000 = this.field_4557.cursorCounter8;
      if(var1 != null) {
         if(this.field_4557.cursorCounter8 == null) {
            return;
         }

         var10000 = this.field_4557.cursorCounter8;
      }

      class_1436 var2 = var10000.field_3707;
      class_275 var10001 = new class_275;
      var10001.method_1578(this.field_4575, this.field_4487, this.field_4497, this.field_4498, this.field_4559, this.field_4508);
      var2.method_7821(var10001);
   }

   // $FF: renamed from: d () boolean
   public boolean method_5362() {
      int var10000;
      label24: {
         String[] var1 = class_752.method_4253();
         var10000 = this.field_4487;
         if(var1 != null) {
            if(this.field_4487 < 4) {
               break label24;
            }

            var10000 = this.field_4495;
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

   public void loadOfOptions() {
      // $FF: Couldn't be decompiled
   }

   public void saveOfOptions() {
      try {
         PrintWriter var1 = new PrintWriter(new FileWriter(this.optionsFileOF));
         StringBuilder var10001 = new StringBuilder();
         String[] var2 = field_4577;
         var1.println(var10001.append("ofRenderDistanceChunks:").append(this.field_4487).toString());
         var1.println("ofFogType:" + this.ofFogType);
         var1.println("ofFogStart:" + this.ofFogStart);
         var1.println("ofMipmapType:" + this.ofMipmapType);
         var1.println("ofLoadFar:" + this.ofLoadFar);
         var1.println("ofPreloadedChunks:" + this.ofPreloadedChunks);
         var1.println("ofOcclusionFancy:" + this.ofOcclusionFancy);
         var1.println("ofSmoothFps:" + this.ofSmoothFps);
         var1.println("ofSmoothWorld:" + this.ofSmoothWorld);
         var1.println("ofAoLevel:" + this.ofAoLevel);
         var1.println("ofClouds:" + this.ofClouds);
         var1.println("ofCloudsHeight:" + this.ofCloudsHeight);
         var1.println("ofTrees:" + this.ofTrees);
         var1.println("ofGrass:" + this.ofGrass);
         var1.println("ofDroppedItems:" + this.ofDroppedItems);
         var1.println("ofRain:" + this.ofRain);
         var1.println("ofWater:" + this.ofWater);
         var1.println("ofAnimatedWater:" + this.ofAnimatedWater);
         var1.println("ofAnimatedLava:" + this.ofAnimatedLava);
         var1.println("ofAnimatedFire:" + this.ofAnimatedFire);
         var1.println("ofAnimatedPortal:" + this.ofAnimatedPortal);
         var1.println("ofAnimatedRedstone:" + this.ofAnimatedRedstone);
         var1.println("ofAnimatedExplosion:" + this.ofAnimatedExplosion);
         var1.println("ofAnimatedFlame:" + this.ofAnimatedFlame);
         var1.println("ofAnimatedSmoke:" + this.ofAnimatedSmoke);
         var1.println("ofVoidParticles:" + this.ofVoidParticles);
         var1.println("ofWaterParticles:" + this.ofWaterParticles);
         var1.println("ofPortalParticles:" + this.ofPortalParticles);
         var1.println("ofPotionParticles:" + this.ofPotionParticles);
         var1.println("ofDrippingWaterLava:" + this.ofDrippingWaterLava);
         var1.println("ofAnimatedTerrain:" + this.ofAnimatedTerrain);
         var1.println("ofAnimatedTextures:" + this.ofAnimatedTextures);
         var1.println("ofAnimatedItems:" + this.ofAnimatedItems);
         var1.println("ofRainSplash:" + this.ofRainSplash);
         var1.println("ofLagometer:" + this.ofLagometer);
         var1.println("ofAutoSaveTicks:" + this.ofAutoSaveTicks);
         var1.println("ofBetterGrass:" + this.ofBetterGrass);
         var1.println("ofConnectedTextures:" + this.ofConnectedTextures);
         var1.println("ofWeather:" + this.ofWeather);
         var1.println("ofSky:" + this.ofSky);
         var1.println("ofStars:" + this.ofStars);
         var1.println("ofSunMoon:" + this.ofSunMoon);
         var1.println("ofChunkUpdates:" + this.ofChunkUpdates);
         var1.println("ofChunkLoading:" + this.ofChunkLoading);
         var1.println("ofChunkUpdatesDynamic:" + this.ofChunkUpdatesDynamic);
         var1.println("ofTime:" + this.ofTime);
         var1.println("ofClearWater:" + this.ofClearWater);
         var1.println("ofDepthFog:" + this.ofDepthFog);
         var1.println("ofAaLevel:" + this.ofAaLevel);
         var1.println("ofProfiler:" + this.ofProfiler);
         var1.println("ofBetterSnow:" + this.ofBetterSnow);
         var1.println("ofSwampColors:" + this.ofSwampColors);
         var1.println("ofRandomMobs:" + this.ofRandomMobs);
         var1.println("ofSmoothBiomes:" + this.ofSmoothBiomes);
         var1.println("ofCustomFonts:" + this.ofCustomFonts);
         var1.println("ofCustomColors:" + this.ofCustomColors);
         var1.println("ofCustomSky:" + this.ofCustomSky);
         var1.println("ofShowCapes:" + this.ofShowCapes);
         var1.println("ofNaturalTextures:" + this.ofNaturalTextures);
         var1.println("ofLazyChunkLoading:" + this.ofLazyChunkLoading);
         var1.println("ofFullscreenMode:" + this.ofFullscreenMode);
         var1.println("ofFastMath:" + this.ofFastMath);
         var1.println("ofFastRender:" + this.ofFastRender);
         var1.println("ofTranslucentBlocks:" + this.ofTranslucentBlocks);
         var1.close();
      } catch (Exception var3) {
         String[] var10000 = field_4577;
         Config.warn("Failed to save options");
         var3.printStackTrace();
      }

   }

   public void resetSettings() {
      this.field_4487 = 8;
      this.field_4488 = true;
      this.field_4489 = false;
      this.field_4490 = false;
      this.field_4492 = (int)class_101.field_99.method_471();
      this.field_4504 = false;
      this.updateVSync();
      this.field_4518 = 4;
      this.field_4519 = 1;
      this.field_4493 = true;
      this.field_4494 = 2;
      this.field_4495 = true;
      this.field_4570 = 0.0F;
      this.field_4571 = 0.0F;
      this.field_4573 = 0;
      this.field_4574 = 0;
      this.field_4512 = true;
      this.ofFogType = 1;
      this.ofFogStart = 0.8F;
      this.ofMipmapType = 0;
      this.ofLoadFar = false;
      this.ofPreloadedChunks = 0;
      this.ofOcclusionFancy = false;
      this.ofSmoothFps = false;
      Config.updateAvailableProcessors();
      this.ofSmoothWorld = Config.isSingleProcessor();
      this.ofLazyChunkLoading = Config.isSingleProcessor();
      this.ofFastMath = false;
      this.ofFastRender = true;
      this.ofTranslucentBlocks = 2;
      this.ofAoLevel = 1.0F;
      this.ofAaLevel = 0;
      this.ofClouds = 0;
      this.ofCloudsHeight = 0.0F;
      this.ofTrees = 0;
      this.ofGrass = 0;
      this.ofRain = 0;
      this.ofWater = 0;
      this.ofBetterGrass = 3;
      this.ofAutoSaveTicks = 4000;
      this.ofLagometer = false;
      this.ofProfiler = false;
      this.ofWeather = true;
      this.ofSky = true;
      this.ofStars = true;
      this.ofSunMoon = true;
      this.ofChunkUpdates = 1;
      this.ofChunkLoading = 0;
      this.ofChunkUpdatesDynamic = false;
      this.ofTime = 0;
      this.ofClearWater = false;
      this.ofDepthFog = true;
      this.ofBetterSnow = false;
      String[] var10001 = field_4577;
      this.ofFullscreenMode = "Default";
      this.ofSwampColors = true;
      this.ofRandomMobs = true;
      this.ofSmoothBiomes = true;
      this.ofCustomFonts = true;
      this.ofCustomColors = true;
      this.ofCustomSky = true;
      this.ofShowCapes = true;
      this.ofConnectedTextures = 2;
      this.ofNaturalTextures = false;
      this.ofAnimatedWater = 0;
      this.ofAnimatedLava = 0;
      this.ofAnimatedFire = true;
      this.ofAnimatedPortal = true;
      this.ofAnimatedRedstone = true;
      this.ofAnimatedExplosion = true;
      this.ofAnimatedFlame = true;
      this.ofAnimatedSmoke = true;
      this.ofVoidParticles = true;
      this.ofWaterParticles = true;
      this.ofRainSplash = true;
      this.ofPortalParticles = true;
      this.ofPotionParticles = true;
      this.ofDrippingWaterLava = true;
      this.ofAnimatedTerrain = true;
      this.ofAnimatedItems = true;
      this.ofAnimatedTextures = true;
      this.field_4557.cursorCounter7.updateCapes();
      this.updateWaterOpacity();
      this.field_4557.cursorCounter7.setAllRenderersVisible();
      this.field_4557.method_5229();
      this.method_5358();
   }

   public void updateVSync() {
      Display.setVSyncEnabled(this.field_4504);
   }

   private void updateWaterOpacity() {
      String[] var1 = class_752.method_4253();
      if(this.field_4557.method_5280() != null) {
         Config.waterOpacityChanged = true;
      }

      byte var2 = 3;
      bbj var10000 = this;
      if(var1 != null) {
         if(this.ofClearWater) {
            var2 = 1;
         }

         BlockUtils.setLightOpacity(class_1192.field_6034, var2);
         BlockUtils.setLightOpacity(class_1192.field_6033, var2);
         var10000 = this;
      }

      bjf var13 = var10000.field_4557.cursorCounter6;
      if(var1 != null) {
         if(var10000.field_4557.cursorCounter6 == null) {
            return;
         }

         var13 = this.field_4557.cursorCounter6;
      }

      class_25 var3 = var13.method_2192();
      if(var3 != null) {
         int var4 = -512;

         label111:
         while(true) {
            int var14 = var4;

            label108:
            while(var14 < 512) {
               if(var1 == null) {
                  return;
               }

               int var5 = -512;

               while(var5 < 512) {
                  label102: {
                     label127: {
                        class_25 var15 = var3;
                        int var10001 = var4;
                        int var10002 = var5;
                        if(var1 != null) {
                           var14 = var3.method_103(var4, var5);
                           if(var1 == null) {
                              continue label108;
                           }

                           if(var14 == 0) {
                              break label127;
                           }

                           var15 = var3;
                           var10001 = var4;
                           var10002 = var5;
                        }

                        class_1069 var6 = var15.method_104(var10001, var10002);
                        if(var1 == null) {
                           break label102;
                        }

                        if(var6 != null) {
                           label129: {
                              class_1069 var16 = var6;
                              if(var1 != null) {
                                 if(var6 instanceof class_1070) {
                                    break label129;
                                 }

                                 var16 = var6;
                              }

                              class_1072[] var7 = var16.method_6019();
                              int var8 = 0;

                              while(var8 < var7.length) {
                                 class_1072 var9 = var7[var8];
                                 if(var1 == null) {
                                    break label102;
                                 }

                                 if(var1 != null) {
                                    label75: {
                                       if(var9 != null) {
                                          class_1068 var10 = var9.method_6090();
                                          if(var1 == null) {
                                             break label75;
                                          }

                                          if(var10 != null) {
                                             byte[] var11 = var10.field_5619;
                                             int var12 = 0;

                                             while(var12 < var11.length) {
                                                var11[var12] = 0;
                                                ++var12;
                                                if(var1 == null) {
                                                   break label75;
                                                }

                                                if(var1 == null) {
                                                   break;
                                                }
                                             }
                                          }
                                       }

                                       ++var8;
                                    }
                                 }

                                 if(var1 == null) {
                                    break;
                                 }
                              }

                              var6.method_6021();
                           }
                        }
                     }

                     ++var5;
                  }

                  if(var1 == null) {
                     break;
                  }
               }

               ++var4;
               if(var1 != null) {
                  continue label111;
               }
               break;
            }

            this.field_4557.cursorCounter7.getSelectionEnd7();
            break;
         }
      }

   }

   public void updateChunkLoading() {
      String[] var1;
      label34: {
         label33: {
            label32: {
               var1 = class_752.method_4253();
               if(var1 != null) {
                  switch(this.ofChunkLoading) {
                  case 1:
                     WrUpdaterSmooth var10000 = new WrUpdaterSmooth;
                     var10000.method_10046();
                     WrUpdates.setWrUpdater(var10000);
                     break;
                  case 2:
                     break label32;
                  default:
                     break label33;
                  }
               }

               if(var1 != null) {
                  break label34;
               }
            }

            WrUpdaterThreaded var2 = new WrUpdaterThreaded;
            var2.method_436();
            WrUpdates.setWrUpdater(var2);
            if(var1 != null) {
               break label34;
            }
         }

         WrUpdates.setWrUpdater((IWrUpdater)null);
      }

      bma var3 = this.field_4557.cursorCounter7;
      if(var1 != null) {
         if(this.field_4557.cursorCounter7 == null) {
            return;
         }

         var3 = this.field_4557.cursorCounter7;
      }

      var3.getSelectionEnd7();
   }

   public void setAllAnimations(boolean var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = var1;
      if(var2 != null) {
         var10000 = var1 != 0?0:2;
      }

      int var3 = var10000;
      this.ofAnimatedWater = var3;
      this.ofAnimatedLava = var3;
      this.ofAnimatedFire = (boolean)var1;
      this.ofAnimatedPortal = (boolean)var1;
      this.ofAnimatedRedstone = (boolean)var1;
      this.ofAnimatedExplosion = (boolean)var1;
      this.ofAnimatedFlame = (boolean)var1;
      this.ofAnimatedSmoke = (boolean)var1;
      this.ofVoidParticles = (boolean)var1;
      this.ofWaterParticles = (boolean)var1;
      this.ofRainSplash = (boolean)var1;
      this.ofPortalParticles = (boolean)var1;
      this.ofPotionParticles = (boolean)var1;
      int var10001 = var1;
      if(var2 != null) {
         var10001 = var1 != 0?0:2;
      }

      this.field_4574 = var10001;
      this.ofDrippingWaterLava = (boolean)var1;
      this.ofAnimatedTerrain = (boolean)var1;
      this.ofAnimatedItems = (boolean)var1;
      this.ofAnimatedTextures = (boolean)var1;
   }

   // $FF: renamed from: <clinit> () void
   static void method_5363() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.Exception) java.lang.Exception
   private static Exception method_5364(Exception var0) {
      return var0;
   }
}
