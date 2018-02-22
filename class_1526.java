import java.util.concurrent.atomic.AtomicInteger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// $FF: renamed from: qc
public class class_1526 {

   // $FF: renamed from: b java.util.concurrent.atomic.AtomicInteger
   private static final AtomicInteger field_8012;
   // $FF: renamed from: c org.apache.logging.log4j.Logger
   private static final Logger field_8013;
   // $FF: renamed from: d java.lang.String
   private static final String field_8014 = "CL_00001133";


   // $FF: renamed from: <init> () void
   public void method_8269() {
      super();
   }

   // $FF: renamed from: b () java.util.concurrent.atomic.AtomicInteger
   static AtomicInteger method_8270() {
      return field_8012;
   }

   // $FF: renamed from: c () org.apache.logging.log4j.Logger
   static Logger method_8271() {
      return field_8013;
   }

   // $FF: renamed from: <clinit> () void
   static void method_8272() {
      boolean var10000 = true;
      char[] var10003 = "xgX!¦Eæ\n4\"".toCharArray();
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
            field_8014 = (new String((char[])var4)).intern();
            String var2 = field_8014;
            field_8012 = new AtomicInteger(0);
            field_8013 = LogManager.getLogger();
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 136;
            break;
         case 1:
            var10009 = 152;
            break;
         case 2:
            var10009 = 180;
            break;
         case 3:
            var10009 = 162;
            break;
         case 4:
            var10009 = 37;
            break;
         case 5:
            var10009 = 198;
            break;
         default:
            var10009 = 101;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
