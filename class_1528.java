import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// $FF: renamed from: qe
public class class_1528 {

   // $FF: renamed from: a java.util.ArrayList
   private ArrayList field_8019;
   // $FF: renamed from: b boolean
   boolean field_8020;
   // $FF: renamed from: c java.lang.String
   private static final String field_8021 = "CL_00001136";


   // $FF: renamed from: <init> () void
   public void method_8278() {
      super();
      this.field_8019 = new ArrayList();
   }

   // $FF: renamed from: b () boolean
   public synchronized boolean method_8279() {
      return this.field_8020;
   }

   // $FF: renamed from: c () void
   public synchronized void method_8280() {
      this.field_8020 = false;
   }

   // $FF: renamed from: d () java.util.List
   public synchronized List method_8281() {
      return Collections.unmodifiableList(this.field_8019);
   }

   // $FF: renamed from: b (java.lang.String, java.net.InetAddress) void
   public synchronized void method_8282(String var1, InetAddress var2) {
      String[] var10000 = class_752.method_4253();
      String var4 = class_649.method_3540(var1);
      String[] var3 = var10000;
      String var5 = class_649.method_3541(var1);
      String var9 = var5;
      if(var3 != null) {
         if(var5 == null) {
            return;
         }

         var9 = var2.getHostAddress() + ":" + var5;
      }

      var5 = var9;
      boolean var6 = false;
      Iterator var7 = this.field_8019.iterator();

      boolean var10;
      while(true) {
         if(var7.hasNext()) {
            label50: {
               class_1527 var8 = (class_1527)var7.next();
               var10 = var8.method_8275().equals(var5);
               if(var3 == null) {
                  break;
               }

               label35: {
                  if(var3 != null) {
                     if(!var10) {
                        break label35;
                     }

                     var8.method_8276();
                     var10 = true;
                  }

                  var6 = var10;
                  if(var3 != null) {
                     break label50;
                  }
               }

               if(var3 != null) {
                  continue;
               }
            }
         }

         var10 = var6;
         break;
      }

      if(var3 != null) {
         if(var10) {
            return;
         }

         ArrayList var11 = this.field_8019;
         class_1527 var10001 = new class_1527;
         var10001.method_8273(var4, var5);
         var11.add(var10001);
      }

      this.field_8020 = true;
   }

   // $FF: renamed from: <clinit> () void
   static void method_8283() {
      boolean var10000 = true;
      char[] var10003 = " ÷;Þþsýlñ".toCharArray();
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
            field_8021 = (new String((char[])var4)).intern();
            String var2 = field_8021;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 55;
            break;
         case 1:
            var10009 = 185;
            break;
         case 2:
            var10009 = 42;
            break;
         case 3:
            var10009 = 178;
            break;
         case 4:
            var10009 = 126;
            break;
         case 5:
            var10009 = 155;
            break;
         default:
            var10009 = 187;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
