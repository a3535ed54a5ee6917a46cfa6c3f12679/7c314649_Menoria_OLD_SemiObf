
// $FF: renamed from: yN
public class class_1752 extends class_1727 {

   // $FF: renamed from: c sw
   private final class_753 field_9148;
   // $FF: renamed from: d z8
   private final class_84 field_9149;
   // $FF: renamed from: e sv
   private class_752 field_9150;
   // $FF: renamed from: f int
   private int field_9151;
   // $FF: renamed from: g double
   private double field_9152;
   // $FF: renamed from: h int
   private int field_9153;
   // $FF: renamed from: i int
   private int field_9154;
   // $FF: renamed from: j int
   private int field_9155;
   // $FF: renamed from: k float
   private float field_9156;
   // $FF: renamed from: l float
   private float field_9157;
   // $FF: renamed from: m java.lang.String
   private static final String field_9158 = "ArrowAttackGoal requires Mob implements RangedAttackMob";


   // $FF: renamed from: <init> (z8, double, int, float) void
   public void method_9701(class_84 var1, double var2, int var4, float var5) {
      this.method_9702(var1, var2, var4, var4, var5);
   }

   // $FF: renamed from: <init> (z8, double, int, int, float) void
   public void method_9702(class_84 param1, double param2, int param4, int param5, float param6) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b () boolean
   public boolean method_9649() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: c () boolean
   public boolean method_9650() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: f () void
   public void method_9653() {
      this.field_9150 = null;
      this.field_9153 = 0;
      this.field_9151 = -1;
   }

   // $FF: renamed from: g () void
   public void method_9654() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.IllegalArgumentException) java.lang.IllegalArgumentException
   private static IllegalArgumentException method_9703(IllegalArgumentException var0) {
      return var0;
   }

   // $FF: renamed from: <clinit> () void
   static void method_9704() {
      boolean var10000 = true;
      char[] var10003 = "<mé31X\t~ø M?é5EzèK\tN]vö(Aqïd\"MxþX|ð&+".toCharArray();
      Object var10004 = var10003.length;
      Object var3 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var0 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var4 = var10002;
         var10002 = var10003;
         if(var10003 <= var0) {
            field_9158 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 253;
            break;
         case 1:
            var10009 = 159;
            break;
         case 2:
            var10009 = 27;
            break;
         case 3:
            var10009 = 235;
            break;
         case 4:
            var10009 = 196;
            break;
         case 5:
            var10009 = 240;
            break;
         default:
            var10009 = 172;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}
