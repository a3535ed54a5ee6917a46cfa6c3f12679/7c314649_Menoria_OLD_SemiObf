package ca.diiza.l;

import ca.diiza.l.class_861;
import ca.diiza.l.class_862;
import ca.diiza.l.class_864;
import ca.diiza.l.n;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.concurrent.locks.Condition;
import net.minecraft.server.MinecraftServer;
import org.lwjgl.Sys;
import org.lwjgl.opengl.GL11;

// $FF: renamed from: ca.diiza.l.l
public class class_860 {

   // $FF: renamed from: a java.lang.String
   public static final String field_3988;
   // $FF: renamed from: b boolean
   public static final boolean field_3989 = true;
   // $FF: renamed from: c boolean
   public static final boolean field_3990 = true;
   // $FF: renamed from: d double
   private static final double field_3991 = 1.0D;
   // $FF: renamed from: e boolean
   private static final boolean field_3992 = false;
   // $FF: renamed from: f float
   private static final float field_3993 = 0.1F;
   // $FF: renamed from: g java.io.File
   protected static final File field_3994;
   // $FF: renamed from: h java.io.File
   protected static final File field_3995;
   // $FF: renamed from: i float[]
   private float[] field_3996;
   // $FF: renamed from: j int[]
   private static final int[] field_3997;
   // $FF: renamed from: k ca.diiza.l.l
   public static final class_860 field_3998;
   // $FF: renamed from: l int
   private static final int field_3999 = 256;
   // $FF: renamed from: m int
   private int field_4000;
   // $FF: renamed from: n bao
   protected bao field_4001;
   // $FF: renamed from: o net.minecraft.server.MinecraftServer
   protected MinecraftServer field_4002;
   // $FF: renamed from: p bmh
   private bmh field_4003;
   // $FF: renamed from: q ahb
   private ahb field_4004;
   // $FF: renamed from: r yz
   private class_792 field_4005;
   // $FF: renamed from: s double
   private double field_4006;
   // $FF: renamed from: t double
   private double field_4007;
   // $FF: renamed from: u double
   private double field_4008;
   // $FF: renamed from: v float
   private float field_4009;
   // $FF: renamed from: w float
   private float field_4010;
   // $FF: renamed from: x bbv
   private bbv field_4011;
   // $FF: renamed from: y l8
   private class_1338 field_4012;
   // $FF: renamed from: z java.lang.String
   private String field_4013;
   // $FF: renamed from: A boolean
   private boolean field_4014;
   // $FF: renamed from: B java.net.SocketAddress
   private SocketAddress field_4015;
   // $FF: renamed from: C java.lang.String
   private String field_4016;
   // $FF: renamed from: D int
   private int field_4017;
   // $FF: renamed from: E int
   private int field_4018;
   // $FF: renamed from: F int
   private int field_4019;
   // $FF: renamed from: G ca.diiza.l.a
   private class_864 field_4020;
   // $FF: renamed from: H java.util.concurrent.locks.Condition
   private Condition field_4021;
   // $FF: renamed from: I ca.diiza.l.m
   private class_861 field_4022;
   // $FF: renamed from: J int
   private int field_4023;
   // $FF: renamed from: K int
   private int field_4024;
   // $FF: renamed from: L bdw
   private bdw field_4025;
   // $FF: renamed from: M int
   private int field_4026;
   // $FF: renamed from: N int
   private int field_4027;
   // $FF: renamed from: O double
   private double field_4028;
   // $FF: renamed from: P int
   private int field_4029;
   // $FF: renamed from: Q int
   private int field_4030;
   // $FF: renamed from: R int
   private int field_4031;
   // $FF: renamed from: S float
   private float field_4032;
   // $FF: renamed from: T float
   private float field_4033;
   // $FF: renamed from: U int
   private int field_4034;
   // $FF: renamed from: V int
   private int field_4035;
   // $FF: renamed from: W int
   private int field_4036;
   // $FF: renamed from: X int
   private int field_4037;
   // $FF: renamed from: Y float
   private float field_4038;
   // $FF: renamed from: Z boolean
   private boolean field_4039;
   // $FF: renamed from: aa boolean
   private boolean field_4040;
   // $FF: renamed from: ab boolean
   private boolean field_4041;
   // $FF: renamed from: ac boolean
   private boolean field_4042;
   // $FF: renamed from: ad boolean
   private boolean field_4043;
   // $FF: renamed from: ae int
   private int field_4044;
   // $FF: renamed from: af int
   private int field_4045;
   // $FF: renamed from: ag float
   private float field_4046;
   // $FF: renamed from: ah float
   private float field_4047;
   // $FF: renamed from: ai boolean
   private boolean field_4048;
   // $FF: renamed from: aj boolean
   private boolean field_4049;
   // $FF: renamed from: ak int
   private int field_4050;
   // $FF: renamed from: al int
   private int field_4051;
   // $FF: renamed from: am int
   private int field_4052;
   // $FF: renamed from: an float
   private float field_4053;
   // $FF: renamed from: ao int
   private int field_4054;
   // $FF: renamed from: ap boolean
   private boolean field_4055;
   // $FF: renamed from: aq boolean
   private boolean field_4056;
   // $FF: renamed from: ar boolean
   private boolean field_4057;
   // $FF: renamed from: as boolean
   private boolean field_4058;
   // $FF: renamed from: at int
   private int field_4059;
   // $FF: renamed from: au boolean
   private boolean field_4060;
   // $FF: renamed from: av int
   private int field_4061;
   // $FF: renamed from: aw boolean
   private boolean field_4062;
   // $FF: renamed from: ax boolean
   private boolean field_4063;
   // $FF: renamed from: ay boolean
   private boolean field_4064;
   // $FF: renamed from: az boolean
   private boolean field_4065;
   // $FF: renamed from: aA boolean
   private boolean field_4066;
   // $FF: renamed from: aB boolean
   private boolean field_4067;
   // $FF: renamed from: aC int
   private int field_4068;
   // $FF: renamed from: aD int
   private int field_4069;
   // $FF: renamed from: aE int
   private int field_4070;
   // $FF: renamed from: aF int
   private int field_4071;
   // $FF: renamed from: aG int
   private int field_4072;
   // $FF: renamed from: aH boolean
   private boolean field_4073;
   // $FF: renamed from: aI boolean
   private boolean field_4074;
   // $FF: renamed from: aJ boolean
   private boolean field_4075;
   // $FF: renamed from: aK boolean
   private boolean field_4076;
   // $FF: renamed from: aL boolean
   private boolean field_4077;
   // $FF: renamed from: aM boolean
   private boolean field_4078;
   // $FF: renamed from: aN boolean
   private boolean field_4079;
   // $FF: renamed from: aO boolean
   private boolean field_4080;
   // $FF: renamed from: aP boolean
   private boolean field_4081;
   // $FF: renamed from: aQ int
   private int field_4082;
   // $FF: renamed from: aR boolean
   private boolean field_4083;
   // $FF: renamed from: aS boolean
   private boolean field_4084;
   // $FF: renamed from: aT boolean
   private boolean field_4085;
   // $FF: renamed from: aU float
   private float field_4086;
   // $FF: renamed from: aV double
   private double field_4087;
   // $FF: renamed from: aW double
   private double field_4088;
   // $FF: renamed from: aX float
   private float field_4089;
   // $FF: renamed from: aY long
   private long field_4090;
   // $FF: renamed from: aZ long
   private long field_4091;
   // $FF: renamed from: a0 long
   private long field_4092;
   // $FF: renamed from: a1 int
   private int field_4093;
   // $FF: renamed from: a2 java.util.TreeMap
   private TreeMap<Integer, List<n>> field_4094;
   // $FF: renamed from: a3 java.util.List
   private List<n> field_4095;
   // $FF: renamed from: a4 int
   private int field_4096;
   // $FF: renamed from: a5 int
   private int field_4097;
   // $FF: renamed from: a6 int
   private int field_4098;
   // $FF: renamed from: a7 int
   private int field_4099;
   // $FF: renamed from: a8 double
   private double field_4100;
   // $FF: renamed from: a9 double
   private double field_4101;
   // $FF: renamed from: a_ float
   private float field_4102;
   // $FF: renamed from: ba int
   private int field_4103;
   // $FF: renamed from: bb int
   private int field_4104;
   // $FF: renamed from: bc int
   private int field_4105;
   // $FF: renamed from: bd int
   private int field_4106;
   // $FF: renamed from: be int
   private int field_4107;
   // $FF: renamed from: bf int
   private int field_4108;
   // $FF: renamed from: bg int
   private int field_4109;
   // $FF: renamed from: bh int
   private int field_4110;
   // $FF: renamed from: bi int[]
   private int[] field_4111;
   // $FF: renamed from: bj int[]
   private int[] field_4112;
   // $FF: renamed from: bk java.util.HashMap
   private HashMap<Integer, String> field_4113;
   // $FF: renamed from: bl java.util.HashMap
   private HashMap<Integer, Double> field_4114;
   // $FF: renamed from: bm long
   private long field_4115;
   // $FF: renamed from: bn long
   private long field_4116;
   // $FF: renamed from: bo int
   private static final int field_4117 = 0;
   // $FF: renamed from: bp int
   private static final int field_4118 = 1;
   // $FF: renamed from: bq int
   private static final int field_4119 = 2;
   // $FF: renamed from: br int
   private static final int field_4120 = 3;
   // $FF: renamed from: bs int
   private static final int field_4121 = 4;
   // $FF: renamed from: bt int
   private static final int field_4122 = 5;
   // $FF: renamed from: bu int
   private static final int field_4123 = 6;
   // $FF: renamed from: bv java.util.List[]
   private List<sv>[] field_4124;
   // $FF: renamed from: bw int[]
   private int[] field_4125;
   // $FF: renamed from: bx java.util.List
   private List<sa> field_4126;
   // $FF: renamed from: by float
   private float field_4127;
   // $FF: renamed from: bz boolean
   protected boolean field_4128;
   // $FF: renamed from: bA long
   protected long field_4129;
   // $FF: renamed from: bB long
   private long field_4130;
   // $FF: renamed from: bC int
   private int field_4131;
   // $FF: renamed from: bD float[]
   private static float[] field_4132;
   // $FF: renamed from: bE float[]
   private float[] field_4133;
   // $FF: renamed from: bF float[]
   private float[] field_4134;
   // $FF: renamed from: bG float[]
   private float[] field_4135;
   // $FF: renamed from: cb java.lang.String[]
   private static final String[] field_4136;


   // $FF: renamed from: <init> () void
   private void method_4971() {
      super();
      this.field_3996 = this.method_4984(0.125F);
      this.field_4003 = bmh.instance;
      this.field_4020 = class_864.method_5036(256, 256);
      class_861 var10001 = new class_861;
      var10001.method_5019(289);
      this.field_4022 = var10001;
      this.field_4023 = 0;
      this.field_4024 = 0;
      this.field_4041 = true;
      this.field_4042 = false;
      this.field_4043 = true;
      this.field_4044 = 2;
      this.field_4045 = 0;
      this.field_4046 = 1.0F;
      this.field_4047 = 1.0F;
      this.field_4048 = false;
      this.field_4049 = false;
      this.field_4050 = 0;
      this.field_4051 = 0;
      this.field_4052 = 0;
      this.field_4053 = 0.8F;
      this.field_4054 = 1;
      this.field_4055 = true;
      this.field_4056 = true;
      this.field_4057 = true;
      this.field_4058 = true;
      this.field_4059 = 2;
      this.field_4060 = false;
      this.field_4061 = 1;
      this.field_4062 = false;
      this.field_4063 = false;
      this.field_4064 = false;
      this.field_4065 = false;
      this.field_4066 = true;
      this.field_4067 = true;
      this.field_4068 = 1;
      this.field_4069 = 1;
      this.field_4070 = 1;
      this.field_4071 = 1;
      this.field_4072 = 0;
      this.field_4073 = true;
      this.field_4074 = true;
      this.field_4075 = true;
      this.field_4076 = false;
      this.field_4077 = false;
      this.field_4078 = false;
      this.field_4079 = false;
      this.field_4081 = true;
      this.field_4082 = 0;
      this.field_4083 = false;
      this.field_4084 = true;
      this.field_4085 = true;
      this.field_4086 = 0.5F;
      this.field_4087 = 1000000.0D;
      this.field_4088 = 10000.0D;
      this.field_4089 = 1.0F;
      this.field_4093 = 0;
      this.field_4094 = new TreeMap();
      this.field_4095 = new ArrayList();
      this.field_4097 = 1;
      this.field_4098 = 1;
      this.field_4099 = 0;
      this.field_4100 = 1.0D;
      this.field_4101 = 1.0D;
      this.field_4107 = 4764952;
      this.field_4108 = 6330464;
      this.field_4109 = 8431445;
      this.field_4110 = 255;
      this.field_4113 = new HashMap();
      this.field_4114 = new HashMap();
      HashMap var10000 = this.field_4113;
      Integer var5 = Integer.valueOf(0);
      String[] var2 = field_4136;
      var10000.put(var5, "Overworld");
      this.field_4114.put(Integer.valueOf(0), Double.valueOf(1.0D));
      this.field_4113.put(Integer.valueOf(-1), "Nether");
      this.field_4114.put(Integer.valueOf(-1), Double.valueOf(8.0D));
      this.field_4113.put(Integer.valueOf(1), "The Ender");
      this.field_4114.put(Integer.valueOf(1), Double.valueOf(1.0D));
      this.field_4124 = new ArrayList[7];
      this.field_4125 = new int[]{-16723457, -65536, -1, -16760704, -10444704, -12533632, -256};
      this.field_4126 = new ArrayList(256);
      this.field_4130 = 0L;
      this.field_4131 = 0;
      this.field_4133 = new float[256];
      this.field_4134 = new float[256];
      this.field_4135 = new float[256];
      if(!field_3995.exists()) {
         field_3995.mkdirs();
      }

      try {
         if(!field_3995.isDirectory()) {
            String[] var6 = field_4136;
            this.field_4013 = "[Rei\'s Minimap] ERROR: Failed to create the rei_minimap folder.";
            method_5000(this.field_4013);
         }
      } catch (RuntimeException var4) {
         throw method_5018(var4);
      }

      int var1 = 0;

      try {
         while(var1 < this.field_4124.length) {
            this.field_4124[var1] = new ArrayList();
            ++var1;
         }

      } catch (RuntimeException var3) {
         throw method_5018(var3);
      }
   }

   // $FF: renamed from: a (float, bao) void
   public void method_4972(float param1, bao param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a () void
   private void method_4973() {
      this.field_4003.setVisible2();
   }

   // $FF: renamed from: b () void
   private void method_4974() {
      this.field_4003.getVisible8();
   }

   // $FF: renamed from: a (double, double, double, double, double) void
   private void method_4975(double var1, double var3, double var5, double var7, double var9) {
      this.field_4003.addVertexWithUV(var1, var3, var5, var7, var9);
   }

   // $FF: renamed from: a (float) byte
   private static final byte method_4976(float var0) {
      return (byte)Math.max(0, Math.min(255, (int)(var0 * 255.0F)));
   }

   // $FF: renamed from: c () void
   private void method_4977() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: d () void
   private void method_4978() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: e () void
   private void method_4979() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: f () java.util.List
   public List<n> method_4980() {
      return this.field_4095;
   }

   // $FF: renamed from: g () void
   protected void method_4981() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: h () void
   protected void method_4982() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (java.lang.String) void
   protected void method_4983(String var1) {
      bcc var10000 = this.field_4011.method_707();
      class_1082 var10001 = new class_1082;
      var10001.method_6134(var1);
      var10000.method_675(var10001);
   }

   // $FF: renamed from: b (float) float[]
   private float[] method_4984(float var1) {
      float[] var2 = new float[16];

      for(int var3 = 0; var3 <= 15; ++var3) {
         float var4 = 1.0F - (float)var3 / 15.0F;
         var2[var3] = (1.0F - var4) / (var4 * 3.0F + 1.0F) * (1.0F - var1) + var1;
      }

      return var2;
   }

   // $FF: renamed from: b (double, double, double, double, double) void
   private void method_4985(double var1, double var3, double var5, double var7, double var9) {
      var7 *= 0.5D;
      var9 *= 0.5D;
      this.method_4973();
      this.method_4975(var1 - var7, var3 + var9, var5, 0.0D, 1.0D);
      this.method_4975(var1 + var7, var3 + var9, var5, 1.0D, 1.0D);
      this.method_4975(var1 + var7, var3 - var9, var5, 1.0D, 0.0D);
      this.method_4975(var1 - var7, var3 - var9, var5, 0.0D, 0.0D);
      this.method_4974();
   }

   // $FF: renamed from: b (java.lang.String) boolean
   private static boolean method_4986(String var0) {
      try {
         Class.forName(var0);
         return true;
      } catch (ClassNotFoundException var2) {
         return false;
      }
   }

   // $FF: renamed from: c (java.lang.String) java.lang.String
   public static String method_4987(String param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: d (java.lang.String) java.lang.String
   public static String method_4988(String param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (bdw) boolean
   private static boolean method_4989(bdw var0) {
      return true;
   }

   // $FF: renamed from: a (int) java.lang.String
   protected String method_4990(int param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: i () int
   protected int method_4991() {
      return this.field_4096;
   }

   // $FF: renamed from: j () int
   protected int method_4992() {
      return this.field_4017;
   }

   // $FF: renamed from: b (int) double
   private double method_4993(int param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: k () double
   protected double method_4994() {
      return this.method_4993(this.field_4096) / this.method_4993(this.field_4017);
   }

   // $FF: renamed from: l () void
   protected void method_4995() {
      int var10000 = class_862.method_5030();
      Entry var2 = this.field_4094.lowerEntry(Integer.valueOf(this.field_4096));
      int var1 = var10000;

      Entry var5;
      label29: {
         label28: {
            try {
               var5 = var2;
               if(var1 == 0) {
                  break label29;
               }

               if(var2 != null) {
                  break label28;
               }
            } catch (RuntimeException var4) {
               throw method_5018(var4);
            }

            var2 = this.field_4094.lowerEntry(Integer.valueOf(Integer.MAX_VALUE));
         }

         var5 = var2;
      }

      try {
         if(var5 != null) {
            this.field_4096 = ((Integer)var2.getKey()).intValue();
            this.field_4095 = (List)var2.getValue();
         }

      } catch (RuntimeException var3) {
         throw method_5018(var3);
      }
   }

   // $FF: renamed from: m () void
   protected void method_4996() {
      int var10000 = class_862.method_5031();
      Entry var2 = this.field_4094.higherEntry(Integer.valueOf(this.field_4096));
      int var1 = var10000;

      Entry var5;
      label29: {
         label28: {
            try {
               var5 = var2;
               if(var1 != 0) {
                  break label29;
               }

               if(var2 != null) {
                  break label28;
               }
            } catch (RuntimeException var4) {
               throw method_5018(var4);
            }

            var2 = this.field_4094.higherEntry(Integer.valueOf(Integer.MIN_VALUE));
         }

         var5 = var2;
      }

      try {
         if(var5 != null) {
            this.field_4096 = ((Integer)var2.getKey()).intValue();
            this.field_4095 = (List)var2.getValue();
         }

      } catch (RuntimeException var3) {
         throw method_5018(var3);
      }
   }

   // $FF: renamed from: a (gI, int, int) int
   private int method_4997(class_1069 param1, int param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (yz) java.net.SocketAddress
   private static SocketAddress method_4998(class_792 param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (java.lang.String, java.lang.Exception) void
   private static final void method_4999(String var0, Exception var1) {
      File var10000 = new File(field_3995, "error.txt");
      String[] var7 = field_4136;
      File var3 = var10000;
      int var17 = class_862.method_5030();
      PrintWriter var4 = null;
      int var2 = var17;
      boolean var12 = false;

      PrintWriter var18;
      label135: {
         try {
            var12 = true;
            FileOutputStream var5 = new FileOutputStream(var3, true);
            var4 = new PrintWriter(new OutputStreamWriter(var5, "UTF-8"));
            method_5001(var4);
            var4.println(var0);
            var1.printStackTrace(var4);
            var4.println();
            var4.flush();
            var12 = false;
            break label135;
         } catch (Exception var15) {
            var12 = false;
         } finally {
            if(var12) {
               label98: {
                  label97: {
                     try {
                        var18 = var4;
                        if(var2 == 0) {
                           break label97;
                        }

                        if(var4 == null) {
                           break label98;
                        }
                     } catch (Exception var13) {
                        throw method_5018(var13);
                     }

                     var18 = var4;
                  }

                  var18.close();
               }

            }
         }

         label107: {
            try {
               var18 = var4;
               if(var2 == 0) {
                  break label107;
               }

               if(var4 == null) {
                  return;
               }
            } catch (Exception var14) {
               throw method_5018(var14);
            }

            var18 = var4;
         }

         var18.close();
         return;
      }

      var18 = var4;
      if(var2 != 0) {
         if(var4 == null) {
            return;
         }

         var18 = var4;
      }

      var18.close();
   }

   // $FF: renamed from: e (java.lang.String) void
   private static final void method_5000(String var0) {
      File var10000 = new File(field_3995, "error.txt");
      String[] var5 = field_4136;
      File var1 = var10000;
      PrintWriter var2 = null;
      boolean var10 = false;

      label75: {
         try {
            var10 = true;
            FileOutputStream var3 = new FileOutputStream(var1, true);
            var2 = new PrintWriter(new OutputStreamWriter(var3, "UTF-8"));
            method_5001(var2);
            var2.println(var0);
            var2.println();
            var2.flush();
            var10 = false;
            break label75;
         } catch (Exception var13) {
            var10 = false;
         } finally {
            if(var10) {
               try {
                  if(var2 != null) {
                     var2.close();
                  }
               } catch (Exception var12) {
                  throw method_5018(var12);
               }

            }
         }

         try {
            if(var2 != null) {
               var2.close();
            }

            return;
         } catch (Exception var11) {
            throw method_5018(var11);
         }
      }

      if(var2 != null) {
         var2.close();
      }

   }

   // $FF: renamed from: a (java.io.PrintWriter) void
   private static final void method_5001(PrintWriter var0) {
      String[] var1 = field_4136;
      var0.printf("--- %1$tF %1$tT %1$tZ ---%n", new Object[]{Long.valueOf(System.currentTimeMillis())});
      var0.printf("Rei\'s Minimap %s [%s]%n", new Object[]{"v3.6", "1.7.10"});
      var0.printf("OS: %s (%s) version %s%n", new Object[]{System.getProperty("os.name"), System.getProperty("os.arch"), System.getProperty("os.version")});
      var0.printf("Java: %s, %s%n", new Object[]{System.getProperty("java.version"), System.getProperty("java.vendor")});
      var0.printf("VM: %s (%s), %s%n", new Object[]{System.getProperty("java.vm.name"), System.getProperty("java.vm.info"), System.getProperty("java.vm.vendor")});
      var0.printf("LWJGL: %s%n", new Object[]{Sys.getVersion()});
      var0.printf("OpenGL: %s version %s, %s%n", new Object[]{GL11.glGetString(7937), GL11.glGetString(7938), GL11.glGetString(7936)});
   }

   // $FF: renamed from: a (int, int, int, int) int
   protected static final int method_5002(int var0, int var1, int var2, int var3) {
      return (var0 & 255) << 24 | (var1 & 255) << 16 | (var2 & 255) << 8 | (var3 & 255) << 0;
   }

   // $FF: renamed from: n () int
   protected int method_5003() {
      return this.field_4110;
   }

   // $FF: renamed from: a (java.io.InputStream) void
   private static void method_5004(InputStream param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: o () boolean
   protected boolean method_5005() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: p () boolean
   protected boolean method_5006() {
      return this.field_4084;
   }

   // $FF: renamed from: q () int
   protected int method_5007() {
      return this.field_4082;
   }

   // $FF: renamed from: r () boolean
   protected boolean method_5008() {
      return this.field_4083;
   }

   // $FF: renamed from: s () boolean
   protected boolean method_5009() {
      return this.field_4085;
   }

   // $FF: renamed from: t () float
   protected float method_5010() {
      return this.field_4086;
   }

   // $FF: renamed from: u () double
   protected double method_5011() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: v () double
   protected double method_5012() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: w () int
   protected int method_5013() {
      return this.field_4000;
   }

   // $FF: renamed from: x () bao
   protected bao method_5014() {
      return this.field_4001;
   }

   // $FF: renamed from: y () ahb
   protected ahb method_5015() {
      return this.field_4004;
   }

   // $FF: renamed from: a (bqy) void
   public void method_5016(bqy var1) {}

   // $FF: renamed from: <clinit> () void
   static void method_5017() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.Exception) java.lang.Exception
   private static Exception method_5018(Exception var0) {
      return var0;
   }
}
