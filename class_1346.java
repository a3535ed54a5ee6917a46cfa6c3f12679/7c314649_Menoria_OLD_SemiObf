import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.apache.logging.log4j.Logger;

// $FF: renamed from: kj
public class class_1346 {

   // $FF: renamed from: b org.apache.logging.log4j.Logger
   private static final Logger field_6931;
   // $FF: renamed from: c java.lang.String
   private final String field_6932;
   // $FF: renamed from: d java.lang.Throwable
   private final Throwable field_6933;
   // $FF: renamed from: e tR
   private final class_1605 field_6934;
   // $FF: renamed from: f java.util.List
   private final List field_6935;
   // $FF: renamed from: g java.io.File
   private File field_6936;
   // $FF: renamed from: h boolean
   private boolean field_6937;
   // $FF: renamed from: i java.lang.StackTraceElement[]
   private StackTraceElement[] field_6938;
   // $FF: renamed from: j java.lang.String
   private static final String field_6939;
   // $FF: renamed from: k java.lang.String[]
   private static final String[] field_6940;


   // $FF: renamed from: <init> (java.lang.String, java.lang.Throwable) void
   public void method_7140(String var1, Throwable var2) {
      super();
      class_1605 var10001 = new class_1605;
      String[] var10004 = field_6940;
      var10001.method_8774(this, "System Details");
      this.field_6934 = var10001;
      this.field_6935 = new ArrayList();
      this.field_6937 = true;
      this.field_6938 = new StackTraceElement[0];
      this.field_6932 = var1;
      this.field_6933 = var2;
      this.method_7141();
   }

   // $FF: renamed from: a () void
   private void method_7141() {
      class_1605 var10000 = this.field_6934;
      String[] var1 = field_6940;
      class_1499 var10002 = new class_1499;
      var10002.method_8112(this);
      var10000.method_8777("Minecraft Version", var10002);
      var10000 = this.field_6934;
      class_1517 var2 = new class_1517;
      var2.method_8239(this);
      var10000.method_8777("Operating System", var2);
      var10000 = this.field_6934;
      class_1518 var3 = new class_1518;
      var3.method_8242(this);
      var10000.method_8777("Java Version", var3);
      var10000 = this.field_6934;
      class_1546 var4 = new class_1546;
      var4.method_8402(this);
      var10000.method_8777("Java VM Version", var4);
      var10000 = this.field_6934;
      class_1594 var5 = new class_1594;
      var5.method_8726(this);
      var10000.method_8777("Memory", var5);
      var10000 = this.field_6934;
      class_1596 var6 = new class_1596;
      var6.method_8730(this);
      var10000.method_8777("JVM Flags", var6);
      var10000 = this.field_6934;
      class_1597 var7 = new class_1597;
      var7.method_8733(this);
      var10000.method_8777("AABB Pool Size", var7);
      var10000 = this.field_6934;
      class_1599 var8 = new class_1599;
      var8.method_8741(this);
      var10000.method_8777("IntCache", var8);
   }

   // $FF: renamed from: b () java.lang.String
   public String method_7142() {
      return this.field_6932;
   }

   // $FF: renamed from: c () java.lang.Throwable
   public Throwable method_7143() {
      return this.field_6933;
   }

   // $FF: renamed from: b (java.lang.StringBuilder) void
   public void method_7144(StringBuilder param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: e () java.lang.String
   public String method_7145() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: f () java.lang.String
   public String method_7146() {
      StringBuilder var2 = new StringBuilder();
      String[] var4 = field_6940;
      var2.append("---- Minecraft Crash Report ----\n");
      String[] var10000 = class_752.method_4253();
      var2.append("// ");
      var2.append(method_7152());
      var2.append("\n\n");
      var2.append("Time: ");
      var2.append((new SimpleDateFormat()).format(new Date()));
      var2.append("\n");
      var2.append("Description: ");
      var2.append(this.field_6932);
      var2.append("\n\n");
      var2.append(this.method_7145());
      var2.append("\n\nA detailed walkthrough of the error, its code path and all known details is as follows:\n");
      int var3 = 0;
      String[] var1 = var10000;

      while(true) {
         if(var3 < 87) {
            try {
               var2.append("-");
               ++var3;
               if(var1 == null) {
                  break;
               }

               if(var1 != null) {
                  continue;
               }
            } catch (NullPointerException var5) {
               throw method_7155(var5);
            }
         }

         String[] var10001 = field_6940;
         var2.append("\n\n");
         this.method_7144(var2);
         break;
      }

      return var2.toString();
   }

   // $FF: renamed from: g () java.io.File
   public File method_7147() {
      return this.field_6936;
   }

   // $FF: renamed from: b (java.io.File) boolean
   public boolean method_7148(File param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: h () tR
   public class_1605 method_7149() {
      return this.field_6934;
   }

   // $FF: renamed from: b (java.lang.String) tR
   public class_1605 method_7150(String var1) {
      return this.method_7151(var1, 1);
   }

   // $FF: renamed from: b (java.lang.String, int) tR
   public class_1605 method_7151(String param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: j () java.lang.String
   private static String method_7152() {
      String[] var10000 = new String[34];
      String[] var2 = field_6940;
      var10000[0] = "Who set us up the TNT?";
      var10000[1] = "Everything\'s going to plan. No, really, that was supposed to happen.";
      var10000[2] = "Uh... Did I do that?";
      var10000[3] = "Oops.";
      var10000[4] = "Why did you do that?";
      var10000[5] = "I feel sad now :(";
      var10000[6] = "My bad.";
      var10000[7] = "I\'m sorry, Dave.";
      var10000[8] = "I let you down. Sorry :(";
      var10000[9] = "On the bright side, I bought you a teddy bear!";
      var10000[10] = "Daisy, daisy...";
      var10000[11] = "Oh - I know what I did wrong!";
      var10000[12] = "Hey, that tickles! Hehehe!";
      var10000[13] = "I blame Dinnerbone.";
      var10000[14] = "You should try our sister game, Minceraft!";
      var10000[15] = "Don\'t be sad. I\'ll do better next time, I promise!";
      var10000[16] = "Don\'t be sad, have a hug! <3";
      var10000[17] = "I just don\'t know what went wrong :(";
      var10000[18] = "Shall we play a game?";
      var10000[19] = "Quite honestly, I wouldn\'t worry myself about that.";
      var10000[20] = "I bet Cylons wouldn\'t have this problem.";
      var10000[21] = "Sorry :(";
      var10000[22] = "Surprise! Haha. Well, this is awkward.";
      var10000[23] = "Would you like a cupcake?";
      var10000[24] = "Hi. I\'m Minecraft, and I\'m a crashaholic.";
      var10000[25] = "Ooh. Shiny.";
      var10000[26] = "This doesn\'t make any sense!";
      var10000[27] = "Why is it breaking :(";
      var10000[28] = "Don\'t do that.";
      var10000[29] = "Ouch. That hurt :(";
      var10000[30] = "You\'re mean.";
      var10000[31] = "This is a token for 1 free hug. Redeem at your nearest Mojangsta: [~~HUG~~]";
      var10000[32] = "There are four lights!";
      var10000[33] = "But it works on my machine.";
      String[] var0 = var10000;

      try {
         return var0[(int)(System.nanoTime() % (long)var0.length)];
      } catch (Throwable var3) {
         var10000 = field_6940;
         return "Witty comment unavailable :(";
      }
   }

   // $FF: renamed from: b (java.lang.Throwable, java.lang.String) kj
   public static class_1346 method_7153(Throwable param0, String param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: <clinit> () void
   static void method_7154() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.Throwable) java.lang.Throwable
   private static Throwable method_7155(Throwable var0) {
      return var0;
   }
}
