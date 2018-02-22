package ca.diiza.b;

import ca.diiza.b.class_633;
import java.util.HashSet;
import java.util.regex.Pattern;

// $FF: renamed from: ca.diiza.b.f
public class class_635 extends Thread {

   // $FF: renamed from: a bao
   public bao field_2765;
   // $FF: renamed from: b java.util.HashSet
   public HashSet field_2766;
   // $FF: renamed from: c java.util.regex.Pattern
   private static final Pattern field_2767;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_2768;


   // $FF: renamed from: <init> (bao, java.lang.String) void
   public void method_3505(bao var1, String var2) {
      super(var2);
      boolean var10000 = class_633.method_3503();
      this.field_2766 = new HashSet(32);
      this.field_2765 = var1;
      String[] var5 = field_2768;
      this.field_2766.add("\"cheatengine-i386.exe\"");
      boolean var3 = var10000;
      this.field_2766.add("\"cheatengine-x86_64.exe\"");
      this.field_2766.add("\"Cheat Engine.exe\"");
      this.field_2766.add("\"AutoClick.exe\"");
      this.field_2766.add("\"starblast.exe\"");
      this.field_2766.add("\"StarBlast.exe\"");
      this.field_2766.add("\"SuperRapidFire.exe\"");
      this.field_2766.add("\"SuperRapidFire.exe\"");
      this.field_2766.add("\"RAMCheat.exe\"");
      this.field_2766.add("\"HunterFight.exe\"");
      this.field_2766.add("\"hunterfight.exe\"");
      this.field_2766.add("\"kfaction.exe\"");
      this.field_2766.add("\"fight.exe\"");
      this.field_2766.add("\"cheat.exe\"");
      this.field_2766.add("\"Cheat.exe\"");
      this.field_2766.add("\"cheat engine.exe\"");
      this.field_2766.add("\"speed.exe\"");
      this.field_2766.add("\"a.exe\"");
      this.field_2766.add("\"azerty.exe\"");
      this.field_2766.add("\"z.exe\"");
      if(var3) {
         int var4 = class_689.method_3977();
         ++var4;
         class_689.method_3975(var4);
      }

   }

   public void run() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a () boolean
   private boolean method_3506() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: <clinit> () void
   static void method_3507() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.Exception) java.lang.Exception
   private static Exception method_3508(Exception var0) {
      return var0;
   }
}
