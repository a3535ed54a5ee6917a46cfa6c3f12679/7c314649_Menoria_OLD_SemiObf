import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// $FF: renamed from: ke
public class class_1342 implements Runnable {

   // $FF: renamed from: b ke
   public static final class_1342 field_6903;
   // $FF: renamed from: c java.util.List
   private List field_6904;
   // $FF: renamed from: d long
   private volatile long field_6905;
   // $FF: renamed from: e long
   private volatile long field_6906;
   // $FF: renamed from: f boolean
   private volatile boolean field_6907;
   // $FF: renamed from: h java.lang.String
   private static final String field_6908 = "File IO Thread";


   // $FF: renamed from: <init> () void
   private void method_7087() {
      super();
      this.field_6904 = Collections.synchronizedList(new ArrayList());
      Thread var1 = new Thread(this, "File IO Thread");
      var1.setPriority(1);
      var1.start();
   }

   public void run() {
      this.method_7088();
   }

   // $FF: renamed from: a () void
   private void method_7088() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (kf) void
   public void method_7089(class_33 var1) {
      String[] var2 = class_752.method_4253();
      boolean var10000 = this.field_6904.contains(var1);
      if(var2 != null) {
         if(var10000) {
            return;
         }

         ++this.field_6905;
         this.field_6904.add(var1);
      }

   }

   // $FF: renamed from: b () void
   public void method_7090() {
      String[] var10000 = class_752.method_4253();
      this.field_6907 = true;
      String[] var1 = var10000;

      while(true) {
         if(this.field_6905 != this.field_6906) {
            Thread.sleep(10L);
            if(var1 == null) {
               break;
            }

            if(var1 != null) {
               continue;
            }
         }

         this.field_6907 = false;
         break;
      }

   }

   // $FF: renamed from: <clinit> () void
   static void method_7091() {
      boolean var10000 = true;
      char[] var10003 = "¾y´-àØDñË".toCharArray();
      Object var10004 = var10003.length;
      Object var4 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var0 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var5 = var10002;
         var10002 = var10003;
         if(var10003 <= var0) {
            field_6908 = (new String((char[])var4)).intern();
            class_1342 var2 = new class_1342;
            var2.method_7087();
            field_6903 = var2;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 145;
            break;
         case 1:
            var10009 = 121;
            break;
         case 2:
            var10009 = 129;
            break;
         case 3:
            var10009 = 7;
            break;
         case 4:
            var10009 = 253;
            break;
         case 5:
            var10009 = 13;
            break;
         default:
            var10009 = 198;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }

   // $FF: renamed from: b (java.lang.InterruptedException) java.lang.InterruptedException
   private static InterruptedException method_7092(InterruptedException var0) {
      return var0;
   }
}
