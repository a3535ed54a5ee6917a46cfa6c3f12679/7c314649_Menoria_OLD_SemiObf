import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;

// $FF: renamed from: rJ
public class class_1536 {

   // $FF: renamed from: b org.apache.logging.log4j.Logger
   private static final Logger field_8066;
   // $FF: renamed from: c org.apache.logging.log4j.Marker
   private static final Marker field_8067;
   // $FF: renamed from: d rM
   private class_1542 field_8068;
   // $FF: renamed from: e rM
   private class_1542 field_8069;
   // $FF: renamed from: f java.lang.String
   private static final String field_8070;


   // $FF: renamed from: <init> () void
   public void method_8338() {
      super();
      class_1542 var10001 = new class_1542;
      var10001.method_8380();
      this.field_8068 = var10001;
      var10001 = new class_1542;
      var10001.method_8380();
      this.field_8069 = var10001;
   }

   // $FF: renamed from: b (int, long) void
   public void method_8339(int var1, long var2) {
      this.field_8068.method_8381(var1, var2);
   }

   // $FF: renamed from: c (int, long) void
   public void method_8340(int var1, long var2) {
      this.field_8069.method_8381(var1, var2);
   }

   // $FF: renamed from: b () long
   public long method_8341() {
      return this.field_8068.method_8382();
   }

   // $FF: renamed from: c () long
   public long method_8342() {
      return this.field_8069.method_8382();
   }

   // $FF: renamed from: d () long
   public long method_8343() {
      return this.field_8068.method_8383();
   }

   // $FF: renamed from: e () long
   public long method_8344() {
      return this.field_8069.method_8383();
   }

   // $FF: renamed from: f () rL
   public class_1540 method_8345() {
      return this.field_8068.method_8384();
   }

   // $FF: renamed from: g () rL
   public class_1540 method_8346() {
      return this.field_8068.method_8385();
   }

   // $FF: renamed from: h () rL
   public class_1540 method_8347() {
      return this.field_8069.method_8384();
   }

   // $FF: renamed from: i () rL
   public class_1540 method_8348() {
      return this.field_8069.method_8385();
   }

   // $FF: renamed from: b (int) rL
   public class_1540 method_8349(int var1) {
      return this.field_8068.method_8386(var1);
   }

   // $FF: renamed from: c (int) rL
   public class_1540 method_8350(int var1) {
      return this.field_8069.method_8386(var1);
   }

   // $FF: renamed from: j () org.apache.logging.log4j.Logger
   static Logger method_8351() {
      return field_8066;
   }

   // $FF: renamed from: k () org.apache.logging.log4j.Marker
   static Marker method_8352() {
      return field_8067;
   }

   // $FF: renamed from: <clinit> () void
   static void method_8353() {
      String[] var6 = new String[2];
      int var4 = 0;
      String var3 = "[ã+K; Jö*T?¦VèH/JÄ$âO";
      int var5 = "[ã+K; Jö*T?¦VèH/JÄ$âO".length();
      char var2 = 14;
      int var1 = -1;

      while(true) {
         ++var1;
         String var10002 = var3.substring(var1, var1 + var2);
         boolean var10000 = true;
         char[] var10003 = var10002.toCharArray();
         Object var10004 = var10003.length;
         Object var10 = true;
         char[] var9 = var10003;
         char[] var10001 = (char[])var10004;
         int var7 = 0;

         while(true) {
            var10003 = var9;
            var9 = var10001;
            var10001 = var10003;
            char[] var11 = var9;
            var9 = var10003;
            if(var10003 <= var7) {
               var6[var4++] = (new String((char[])var10)).intern();
               if((var1 += var2) >= var5) {
                  field_8070 = "CL_00001897";
                  field_8066 = LogManager.getLogger();
                  field_8067 = MarkerManager.getMarker("NETSTAT_MARKER", class_120.field_235);
                  return;
               }

               var2 = var3.charAt(var1);
               break;
            }

            char var10007 = (char)((Object[])var10)[var7];
            short var10009;
            switch(var7 % 7) {
            case 0:
               var10009 = 67;
               break;
            case 1:
               var10009 = 140;
               break;
            case 2:
               var10009 = 225;
               break;
            case 3:
               var10009 = 46;
               break;
            case 4:
               var10009 = 73;
               break;
            case 5:
               var10009 = 44;
               break;
            default:
               var10009 = 162;
            }

            ((Object[])var10)[var7] = (char)(var10007 ^ var11 ^ var10009);
            ++var7;
         }
      }
   }
}
