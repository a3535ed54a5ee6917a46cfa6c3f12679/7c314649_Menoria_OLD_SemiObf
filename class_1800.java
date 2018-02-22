import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import net.minecraft.server.MinecraftServer;
import org.apache.logging.log4j.Logger;

// $FF: renamed from: zq
public class class_1800 extends class_1790 {

   // $FF: renamed from: d org.apache.logging.log4j.Logger
   private static final Logger field_9341;
   // $FF: renamed from: e long
   private long field_9342;
   // $FF: renamed from: f int
   private int field_9343;
   // $FF: renamed from: i java.lang.String[]
   private static final String[] field_9344;


   // $FF: renamed from: <init> () void
   public void method_9832() {
      super.method_9832();
   }

   // $FF: renamed from: a () java.lang.String
   public String method_43() {
      String[] var10000 = field_9344;
      return "debug";
   }

   // $FF: renamed from: b () int
   public int method_9833() {
      return 3;
   }

   // $FF: renamed from: a (bh) java.lang.String
   public String method_44(class_20 var1) {
      String[] var10000 = field_9344;
      return "commands.debug.usage";
   }

   // $FF: renamed from: a (bh, java.lang.String[]) void
   public void method_46(class_20 param1, String[] param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (long, int) void
   private void method_9880(long var1, int var3) {
      File var10000 = new File;
      MinecraftServer var10002 = MinecraftServer.method_2348();
      String[] var6 = field_9344;
      var10000.<init>(var10002.method_2338("debug"), "profile-results-" + (new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss")).format(new Date()) + ".txt");
      File var4 = var10000;
      var4.getParentFile().mkdirs();

      try {
         FileWriter var5 = new FileWriter(var4);
         var5.write(this.method_9881(var1, var3));
         var5.close();
      } catch (Throwable var7) {
         Logger var8 = field_9341;
         StringBuilder var10001 = new StringBuilder();
         String[] var9 = field_9344;
         var8.error(var10001.append("Could not save profiler results to ").append(var4).toString(), var7);
      }

   }

   // $FF: renamed from: c (long, int) java.lang.String
   private String method_9881(long var1, int var3) {
      StringBuilder var4 = new StringBuilder();
      String[] var5 = field_9344;
      var4.append("---- Minecraft Profiler Results ----\n");
      var4.append("// ");
      var4.append(method_9883());
      var4.append("\n\n");
      var4.append("Time span: ").append(var1).append(" ms\n");
      var4.append("Tick span: ").append(var3).append(" ticks\n");
      var4.append("// This is approximately ").append(String.format("%.2f", new Object[]{Float.valueOf((float)var3 / ((float)var1 / 1000.0F))})).append(" ticks per second. It should be ").append(20).append(" ticks per second\n\n");
      var4.append("--- BEGIN PROFILE DUMP ---\n\n");
      this.method_9882(0, "root", var4);
      var4.append("--- END PROFILE DUMP ---\n\n");
      return var4.toString();
   }

   // $FF: renamed from: b (int, java.lang.String, java.lang.StringBuilder) void
   private void method_9882(int param1, String param2, StringBuilder param3) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: e () java.lang.String
   private static String method_9883() {
      String[] var10000 = new String[14];
      String[] var2 = field_9344;
      var10000[0] = "Shiny numbers!";
      var10000[1] = "Am I not running fast enough? :(";
      var10000[2] = "I\'m working as hard as I can!";
      var10000[3] = "Will I ever be good enough for you? :(";
      var10000[4] = "Speedy. Zoooooom!";
      var10000[5] = "Hello world";
      var10000[6] = "40% better than a crash report.";
      var10000[7] = "Now with extra numbers";
      var10000[8] = "Now with less numbers";
      var10000[9] = "Now with the same numbers";
      var10000[10] = "You should add flames to things, it makes them go faster!";
      var10000[11] = "Do you feel the need for... optimization?";
      var10000[12] = "*cracks redstone whip*";
      var10000[13] = "Maybe if you treated it better then it\'ll have more motivation to work faster! Poor server.";
      String[] var0 = var10000;

      try {
         return var0[(int)(System.nanoTime() % (long)var0.length)];
      } catch (Throwable var3) {
         var10000 = field_9344;
         return "Witty comment unavailable :(";
      }
   }

   // $FF: renamed from: b (bh, java.lang.String[]) java.util.List
   public List method_48(class_20 param1, String[] param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: <clinit> () void
   static void method_9862() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.Exception) java.lang.Exception
   private static Exception method_9884(Exception var0) {
      return var0;
   }
}
