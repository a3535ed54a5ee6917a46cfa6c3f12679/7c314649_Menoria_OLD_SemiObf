import com.google.common.base.Splitter;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.util.concurrent.GenericFutureListener;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// $FF: renamed from: nH
public class class_1388 {

   // $FF: renamed from: b com.google.common.base.Splitter
   private static final Splitter field_7379;
   // $FF: renamed from: c org.apache.logging.log4j.Logger
   private static final Logger field_7380;
   // $FF: renamed from: d java.util.List
   private final List field_7381;
   // $FF: renamed from: e java.lang.String
   private static final String field_7382;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_7383;


   // $FF: renamed from: <init> () void
   public void method_7581() {
      super();
      this.field_7381 = Collections.synchronizedList(new ArrayList());
   }

   // $FF: renamed from: b (nF) void
   public void method_7582(class_1386 var1) {
      class_1385 var2 = class_1385.method_7554(var1.field_7362);
      class_120 var3 = class_120.method_560(InetAddress.getByName(var2.method_7552()), var2.method_7553());
      this.field_7381.add(var3);
      String[] var10001 = field_7383;
      var1.field_7364 = "Pinging...";
      var1.field_7365 = -1L;
      var1.field_7369 = null;
      class_1389 var6 = new class_1389;
      var6.method_7590(this, var1, var3);
      var3.method_552(var6);

      try {
         class_255 var7 = new class_255;
         var7.method_1473(97, var2.method_7552(), var2.method_7553(), class_906.field_4461);
         var3.method_553(var7, new GenericFutureListener[0]);
         class_296 var8 = new class_296;
         var8.method_1449();
         var3.method_553(var8, new GenericFutureListener[0]);
      } catch (Throwable var5) {
         field_7380.error(var5);
      }

   }

   // $FF: renamed from: c (nF) void
   private void method_7583(class_1386 var1) {
      class_1385 var2 = class_1385.method_7554(var1.field_7362);
      Bootstrap var10000 = (Bootstrap)(new Bootstrap()).group(class_120.field_239);
      class_114 var10001 = new class_114;
      var10001.method_536(this, var2, var1);
      ((Bootstrap)((Bootstrap)var10000.handler(var10001)).channel(NioSocketChannel.class)).connect(var2.method_7552(), var2.method_7553());
   }

   // $FF: renamed from: b () void
   public void method_7584() {
      List var2 = this.field_7381;
      String[] var10000 = class_752.method_4253();
      List var3 = this.field_7381;
      String[] var1 = var10000;
      List var4 = this.field_7381;
      synchronized(this.field_7381) {
         Iterator var5 = this.field_7381.iterator();

         while(var5.hasNext()) {
            label46: {
               class_120 var6 = (class_120)var5.next();
               class_120 var9 = var6;
               if(var1 != null) {
                  if(var6.method_563()) {
                     var6.method_556();
                     if(var1 != null) {
                        break label46;
                     }
                  }

                  var5.remove();
                  var9 = var6;
               }

               if(var1 != null) {
                  if(var9.method_565() == null) {
                     break label46;
                  }

                  var9 = var6;
               }

               var9.method_564().method_237(var6.method_565());
            }

            if(var1 == null) {
               break;
            }
         }

      }
   }

   // $FF: renamed from: c () void
   public void method_7585() {
      String[] var10000 = class_752.method_4253();
      List var2 = this.field_7381;
      String[] var1 = var10000;
      List var3 = this.field_7381;
      List var4 = this.field_7381;
      synchronized(this.field_7381) {
         Iterator var5 = this.field_7381.iterator();

         while(var5.hasNext()) {
            label26: {
               class_120 var6 = (class_120)var5.next();
               class_120 var9 = var6;
               if(var1 != null) {
                  if(!var6.method_563()) {
                     break label26;
                  }

                  var5.remove();
                  var9 = var6;
               }

               class_1082 var10001 = new class_1082;
               String[] var10003 = field_7383;
               var10001.method_6134("Cancelled");
               var9.method_558(var10001);
            }

            if(var1 == null) {
               break;
            }
         }

      }
   }

   // $FF: renamed from: d () org.apache.logging.log4j.Logger
   static Logger method_7586() {
      return field_7380;
   }

   // $FF: renamed from: b (nH, nF) void
   static void method_7587(class_1388 var0, class_1386 var1) {
      var0.method_7583(var1);
   }

   // $FF: renamed from: e () com.google.common.base.Splitter
   static Splitter method_7588() {
      return field_7379;
   }

   // $FF: renamed from: <clinit> () void
   static void method_7589() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "\bÜÅ«¦vU7íÈõñhCÊ\tÜÉ©­=";
      int var4 = "\bÜÅ«¦vU7íÈõñhCÊ\tÜÉ©­=".length();
      char var1 = 10;
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
            char[] var11 = var8;
            var8 = var10003;
            if(var10003 <= var6) {
               var5[var3++] = (new String((char[])var9)).intern();
               if((var0 += var1) >= var4) {
                  field_7383 = var5;
                  String[] var10 = field_7383;
                  field_7382 = "CL_00000892";
                  field_7379 = Splitter.on('\u0000').limit(6);
                  field_7380 = LogManager.getLogger();
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 65;
               break;
            case 1:
               var10009 = 98;
               break;
            case 2:
               var10009 = 171;
               break;
            case 3:
               var10009 = 225;
               break;
            case 4:
               var10009 = 181;
               break;
            case 5:
               var10009 = 220;
               break;
            default:
               var10009 = 216;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}
