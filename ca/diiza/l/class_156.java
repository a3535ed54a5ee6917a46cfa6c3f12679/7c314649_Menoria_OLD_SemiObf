package ca.diiza.l;

import ca.diiza.l.class_862;

// $FF: renamed from: ca.diiza.l.b
public class class_156 extends bcb {

   // $FF: renamed from: b int
   public static final int field_521 = 0;
   // $FF: renamed from: o int
   public static final int field_522 = 1;
   // $FF: renamed from: p long
   private long field_523;
   // $FF: renamed from: q long
   private long field_524;
   // $FF: renamed from: r int
   protected int field_525;
   // $FF: renamed from: s float
   private float field_526;
   // $FF: renamed from: t float
   private float field_527;
   // $FF: renamed from: u float
   private float field_528;
   // $FF: renamed from: v float
   private float field_529;
   // $FF: renamed from: w float
   private float field_530;
   // $FF: renamed from: x float
   private float field_531;
   // $FF: renamed from: y int
   private int field_532;
   // $FF: renamed from: z float
   private float field_533;
   // $FF: renamed from: A int
   private int field_534;
   // $FF: renamed from: B long
   private long field_535;
   // $FF: renamed from: C int
   private int field_536;
   // $FF: renamed from: D java.lang.String[]
   private static final String[] field_537;


   // $FF: renamed from: <init> (int, int, int, int, int) void
   public void method_809(int var1, int var2, int var3, int var4, int var5) {
      super.method_748(var1, var2, var3, var4, var5, "");
      this.field_523 = 500000000L;
      this.field_524 = 40000000L;
      this.field_526 = 0.0F;
      this.field_527 = 0.0F;
      this.field_528 = 0.0F;
      this.field_529 = 0.0F;
      this.field_530 = 1.0F;
      this.field_531 = 9.0F;
      this.field_536 = 6;
   }

   // $FF: renamed from: a (bao, int, int) void
   public void method_750(bao param1, int param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: d (bao, int, int) void
   private void method_810(bao param1, int param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: e (bao, int, int) void
   private void method_811(bao param1, int param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: c (bao, int, int) boolean
   public boolean method_753(bao param1, int param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: f (bao, int, int) boolean
   private boolean method_812(bao param1, int param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: g (bao, int, int) boolean
   private boolean method_813(bao param1, int param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (bao, int, int) void
   protected void method_751(bao param1, int param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (int, int) void
   public void method_752(int var1, int var2) {
      this.field_534 = 0;
   }

   // $FF: renamed from: a (float) void
   public void method_814(float var1) {
      int var2 = class_862.method_5030();

      label41: {
         float var10001;
         float var6;
         label40: {
            int var10000;
            label39: {
               label38: {
                  try {
                     float var7;
                     var10000 = (var7 = var1 - this.field_528) == 0.0F?0:(var7 < 0.0F?-1:1);
                     if(var2 == 0) {
                        break label39;
                     }

                     if(var10000 >= 0) {
                        break label38;
                     }
                  } catch (IllegalArgumentException var5) {
                     throw method_832(var5);
                  }

                  var1 = this.field_528;
               }

               try {
                  var6 = var1;
                  var10001 = this.field_529 - this.field_527;
                  if(var2 == 0) {
                     break label40;
                  }

                  float var8;
                  var10000 = (var8 = var1 - var10001) == 0.0F?0:(var8 < 0.0F?-1:1);
               } catch (IllegalArgumentException var4) {
                  throw method_832(var4);
               }
            }

            try {
               if(var10000 <= 0) {
                  break label41;
               }

               var6 = this.field_529;
               var10001 = this.field_527;
            } catch (IllegalArgumentException var3) {
               throw method_832(var3);
            }
         }

         var1 = var6 - var10001;
      }

      this.field_526 = var1;
   }

   // $FF: renamed from: d () float
   public float method_815() {
      return this.field_526;
   }

   // $FF: renamed from: b (float) void
   public void method_816(float param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: e () float
   public float method_817() {
      return this.field_529;
   }

   // $FF: renamed from: c (float) void
   public void method_818(float param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: f () float
   public float method_819() {
      return this.field_528;
   }

   // $FF: renamed from: d (float) void
   public void method_820(float param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: g () float
   public float method_821() {
      return this.field_527;
   }

   // $FF: renamed from: h () void
   public void method_822() {
      this.field_526 = Math.min(this.field_529 - this.field_527, this.field_526 + this.field_530);
   }

   // $FF: renamed from: i () void
   public void method_823() {
      this.field_526 = Math.max(this.field_528, this.field_526 - this.field_530);
   }

   // $FF: renamed from: j () void
   public void method_824() {
      this.field_526 = Math.min(this.field_529 - this.field_527, this.field_526 + this.field_531);
   }

   // $FF: renamed from: k () void
   public void method_825() {
      this.field_526 = Math.max(this.field_528, this.field_526 - this.field_531);
   }

   // $FF: renamed from: a (int) void
   public void method_826(int var1) {
      this.field_536 = var1;
   }

   // $FF: renamed from: l () int
   public int method_827() {
      return this.field_536;
   }

   // $FF: renamed from: e (float) void
   public void method_828(float var1) {
      this.field_530 = var1;
   }

   // $FF: renamed from: f (float) void
   public void method_829(float var1) {
      this.field_531 = var1;
   }

   // $FF: renamed from: m () float
   public float method_830() {
      return this.field_530;
   }

   // $FF: renamed from: n () float
   public float method_831() {
      return this.field_531;
   }

   // $FF: renamed from: b (java.lang.IllegalArgumentException) java.lang.IllegalArgumentException
   private static IllegalArgumentException method_832(IllegalArgumentException var0) {
      return var0;
   }

   // $FF: renamed from: <clinit> () void
   static void method_759() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "Öðv\n Àãvî3ÖÜ";
      int var4 = "Öðv\n Àãvî3ÖÜ".length();
      char var1 = 9;
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
                  field_537 = var5;
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 232;
               break;
            case 1:
               var10009 = 251;
               break;
            case 2:
               var10009 = 59;
               break;
            case 3:
               var10009 = 43;
               break;
            case 4:
               var10009 = 77;
               break;
            case 5:
               var10009 = 213;
               break;
            default:
               var10009 = 101;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var10 ^ var10009);
            ++var6;
         }
      }
   }
}
