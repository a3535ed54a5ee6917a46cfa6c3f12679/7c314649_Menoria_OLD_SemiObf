package ca.diiza.b;

import ca.diiza.b.class_636;
import javax.swing.Timer;

// $FF: renamed from: ca.diiza.b.d
public class class_633 extends Thread {

   // $FF: renamed from: a bao
   protected bao field_2759;
   // $FF: renamed from: b int
   public static int field_2760;
   // $FF: renamed from: c int
   public static int field_2761;
   // $FF: renamed from: d int
   public static int field_2762;
   // $FF: renamed from: e boolean
   private static boolean field_2763;


   // $FF: renamed from: <init> () void
   public void method_3499() {
      super();
      boolean var1 = method_3502();
      Timer var10000 = new Timer;
      int var10002 = field_2761 * 1000;
      class_636 var10003 = new class_636;
      var10003.method_3509();
      var10000.<init>(var10002, var10003);
      var10000.start();
      if(class_689.method_3976() != 0) {
         method_3501(!var1);
      }

   }

   // $FF: renamed from: <clinit> () void
   static void method_3500() {
      field_2760 = 0;
      field_2761 = 5;
      method_3501(true);
      field_2762 = field_2761 * 12;
   }

   // $FF: renamed from: a (boolean) void
   public static void method_3501(boolean var0) {
      field_2763 = var0;
   }

   // $FF: renamed from: a () boolean
   public static boolean method_3502() {
      return field_2763;
   }

   // $FF: renamed from: b () boolean
   public static boolean method_3503() {
      boolean var0 = method_3502();
      return !var0;
   }
}
