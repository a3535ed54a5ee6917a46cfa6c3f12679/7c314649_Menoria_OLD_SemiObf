package ca.diiza.j;

import ca.diiza.j.class_242;
import ca.diiza.j.class_244;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

// $FF: renamed from: ca.diiza.j.j
class class_241 {

   // $FF: renamed from: a int
   public static final int field_1294 = -1;
   // $FF: renamed from: b int
   private static final int field_1295 = 16384;
   // $FF: renamed from: c int
   public static final int field_1296 = 0;
   // $FF: renamed from: d int
   public static final int field_1297 = 2;
   // $FF: renamed from: e int[]
   private static final int[] field_1298;
   // $FF: renamed from: f java.lang.String
   private static final String field_1299;
   // $FF: renamed from: g char[]
   private static final char[] field_1300;
   // $FF: renamed from: h int[]
   private static final int[] field_1301;
   // $FF: renamed from: i java.lang.String
   private static final String field_1302;
   // $FF: renamed from: j int[]
   private static final int[] field_1303;
   // $FF: renamed from: k java.lang.String
   private static final String field_1304;
   // $FF: renamed from: l int[]
   private static final int[] field_1305;
   // $FF: renamed from: m int
   private static final int field_1306 = 0;
   // $FF: renamed from: n int
   private static final int field_1307 = 1;
   // $FF: renamed from: o int
   private static final int field_1308 = 2;
   // $FF: renamed from: p java.lang.String[]
   private static final String[] field_1309;
   // $FF: renamed from: q int[]
   private static final int[] field_1310;
   // $FF: renamed from: r java.lang.String
   private static final String field_1311;
   // $FF: renamed from: s java.io.Reader
   private Reader field_1312;
   // $FF: renamed from: t int
   private int field_1313;
   // $FF: renamed from: u int
   private int field_1314;
   // $FF: renamed from: v char[]
   private char[] field_1315;
   // $FF: renamed from: w int
   private int field_1316;
   // $FF: renamed from: x int
   private int field_1317;
   // $FF: renamed from: y int
   private int field_1318;
   // $FF: renamed from: z int
   private int field_1319;
   // $FF: renamed from: A int
   private int field_1320;
   // $FF: renamed from: B int
   private int field_1321;
   // $FF: renamed from: C int
   private int field_1322;
   // $FF: renamed from: D boolean
   private boolean field_1323;
   // $FF: renamed from: E boolean
   private boolean field_1324;
   // $FF: renamed from: F java.lang.StringBuffer
   private StringBuffer field_1325;
   // $FF: renamed from: G java.lang.String[]
   private static final String[] field_1326;


   // $FF: renamed from: a () int[]
   private static int[] method_1310() {
      int[] var0 = new int[45];
      byte var1 = 0;
      String[] var10000 = field_1326;
      method_1311(" \b\t\n\f\r \f    ", var1, var0);
      return var0;
   }

   // $FF: renamed from: a (java.lang.String, int, int[]) int
   private static int method_1311(String var0, int var1, int[] var2) {
      int var3 = 0;
      int var4 = var1;
      int var5 = var0.length();

      while(var3 < var5) {
         int var6 = var0.charAt(var3++);
         char var7 = var0.charAt(var3++);

         try {
            while(true) {
               var2[var4++] = var7;
               --var6;
               if(var6 <= 0) {
                  break;
               }
            }
         } catch (ArrayIndexOutOfBoundsException var8) {
            throw method_1332(var8);
         }
      }

      return var4;
   }

   // $FF: renamed from: b () int[]
   private static int[] method_1312() {
      int[] var0 = new int[45];
      byte var1 = 0;
      String[] var10000 = field_1326;
      method_1313("    6 Q l  6 ¢ ½ Ø 6 6 6 6 6 6 ó Ď 6 ĩ ń ş ź ƕ 6 6 6 6 6 6 6 6 ư ǋ Ǧ Ǧ ȁ Ȝ ȷ ɒ 6 6 ɭ ʈ 6", var1, var0);
      return var0;
   }

   // $FF: renamed from: b (java.lang.String, int, int[]) int
   private static int method_1313(String var0, int var1, int[] var2) {
      int var3 = 0;
      int var4 = var1;

      int var5;
      for(int var6 = var0.length(); var3 < var6; var2[var4++] = var5 | var0.charAt(var3++)) {
         var5 = var0.charAt(var3++) << 16;
      }

      return var4;
   }

   // $FF: renamed from: c () int[]
   private static int[] method_1314() {
      int[] var0 = new int[45];
      byte var1 = 0;
      String[] var10000 = field_1326;
      method_1315(" \t\t\t\t \b\t   \t \t", var1, var0);
      return var0;
   }

   // $FF: renamed from: c (java.lang.String, int, int[]) int
   private static int method_1315(String var0, int var1, int[] var2) {
      int var3 = 0;
      int var4 = var1;
      int var5 = var0.length();

      while(var3 < var5) {
         int var6 = var0.charAt(var3++);
         char var7 = var0.charAt(var3++);

         try {
            while(true) {
               var2[var4++] = var7;
               --var6;
               if(var6 <= 0) {
                  break;
               }
            }
         } catch (ArrayIndexOutOfBoundsException var8) {
            throw method_1332(var8);
         }
      }

      return var4;
   }

   // $FF: renamed from: d () int
   int method_1316() {
      return this.field_1321;
   }

   // $FF: renamed from: <init> (java.io.Reader) void
   void method_1317(Reader var1) {
      super();
      this.field_1314 = 0;
      this.field_1315 = new char[16384];
      this.field_1323 = true;
      this.field_1325 = new StringBuffer();
      this.field_1312 = var1;
   }

   // $FF: renamed from: <init> (java.io.InputStream) void
   void method_1318(InputStream var1) {
      this.method_1317(new InputStreamReader(var1));
   }

   // $FF: renamed from: a (java.lang.String) char[]
   private static char[] method_1319(String var0) {
      char[] var1 = new char[65536];
      int var2 = 0;
      int var3 = 0;

      while(var2 < 90) {
         int var4 = var0.charAt(var2++);
         char var5 = var0.charAt(var2++);

         try {
            while(true) {
               var1[var3++] = var5;
               --var4;
               if(var4 <= 0) {
                  break;
               }
            }
         } catch (ArrayIndexOutOfBoundsException var6) {
            throw method_1332(var6);
         }
      }

      return var1;
   }

   // $FF: renamed from: e () boolean
   private boolean method_1320() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: f () void
   public final void method_1321() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (java.io.Reader) void
   public final void method_1322(Reader var1) {
      this.field_1312 = var1;
      this.field_1323 = true;
      class_244.method_1346();
      this.field_1324 = false;
      this.field_1319 = this.field_1318 = 0;
      this.field_1317 = this.field_1316 = 0;
      this.field_1320 = this.field_1321 = this.field_1322 = 0;
      this.field_1314 = 0;

      try {
         if(class_689.method_3977() == 0) {
            String[] var10000 = field_1326;
            class_244.method_1345("yRn3b");
         }

      } catch (ArrayIndexOutOfBoundsException var3) {
         throw method_1332(var3);
      }
   }

   // $FF: renamed from: g () int
   public final int method_1323() {
      return this.field_1314;
   }

   // $FF: renamed from: a (int) void
   public final void method_1324(int var1) {
      this.field_1314 = var1;
   }

   // $FF: renamed from: h () java.lang.String
   public final String method_1325() {
      return new String(this.field_1315, this.field_1318, this.field_1316 - this.field_1318);
   }

   // $FF: renamed from: b (int) char
   public final char method_1326(int var1) {
      return this.field_1315[this.field_1318 + var1];
   }

   // $FF: renamed from: i () int
   public final int method_1327() {
      return this.field_1316 - this.field_1318;
   }

   // $FF: renamed from: c (int) void
   private void method_1328(int var1) {
      String var2;
      try {
         var2 = field_1309[var1];
      } catch (ArrayIndexOutOfBoundsException var4) {
         var2 = field_1309[0];
      }

      throw new Error(var2);
   }

   // $FF: renamed from: d (int) void
   public void method_1329(int param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: j () ca.diiza.j.k
   public class_242 method_1330() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: <clinit> () void
   static void method_1331() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.Exception) java.lang.Exception
   private static Exception method_1332(Exception var0) {
      return var0;
   }
}
