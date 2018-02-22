import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// $FF: renamed from: nx
public class class_1439 implements class_25 {

   // $FF: renamed from: b org.apache.logging.log4j.Logger
   private static final Logger field_7638;
   // $FF: renamed from: c gI
   private class_1069 field_7639;
   // $FF: renamed from: d vp
   private class_1711 field_7640;
   // $FF: renamed from: e java.util.List
   private List field_7641;
   // $FF: renamed from: f ahb
   private ahb field_7642;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_7643;


   // $FF: renamed from: <init> (ahb) void
   public void method_7832(ahb var1) {
      super();
      class_1711 var10001 = new class_1711;
      var10001.method_9520();
      this.field_7640 = var10001;
      this.field_7641 = new ArrayList();
      class_1070 var2 = new class_1070;
      var2.method_6013(var1, 0, 0);
      this.field_7639 = var2;
      this.field_7642 = var1;
   }

   // $FF: renamed from: b (int, int) boolean
   public boolean method_103(int var1, int var2) {
      return true;
   }

   // $FF: renamed from: a (int, int) void
   public void method_7833(int var1, int var2) {
      String[] var10000 = class_752.method_4253();
      class_1069 var4 = this.method_104(var1, var2);
      String[] var3 = var10000;
      boolean var5 = var4.method_6050();
      if(var3 != null) {
         if(!var5) {
            var4.method_6044();
         }

         this.field_7640.method_9531(class_1035.method_5857(var1, var2));
         this.field_7641.remove(var4);
      }

   }

   // $FF: renamed from: d (int, int) gI
   public class_1069 method_105(int var1, int var2) {
      class_1069 var10000 = new class_1069;
      var10000.method_6013(this.field_7642, var1, var2);
      class_1069 var3 = var10000;
      this.field_7640.method_9528(class_1035.method_5857(var1, var2), var3);
      this.field_7641.add(var3);
      var3.field_5628 = true;
      return var3;
   }

   // $FF: renamed from: c (int, int) gI
   public class_1069 method_104(int var1, int var2) {
      class_1069 var4 = (class_1069)this.field_7640.method_9525(class_1035.method_5857(var1, var2));
      String[] var3 = class_752.method_4253();
      class_1069 var10000 = var4;
      if(var3 != null) {
         if(var4 == null) {
            return this.field_7639;
         }

         var10000 = var4;
      }

      return var10000;
   }

   // $FF: renamed from: b (boolean, vu) boolean
   public boolean method_107(boolean var1, class_81 var2) {
      return true;
   }

   // $FF: renamed from: e () void
   public void method_115() {}

   // $FF: renamed from: a () boolean
   public boolean method_108() {
      long var2 = System.currentTimeMillis();
      String[] var10000 = class_752.method_4253();
      Iterator var4 = this.field_7641.iterator();
      String[] var1 = var10000;

      int var6;
      while(true) {
         if(var4.hasNext()) {
            class_1069 var5 = (class_1069)var4.next();
            if(var1 == null) {
               break;
            }

            long var8;
            int var10001 = (var8 = System.currentTimeMillis() - var2 - 5L) == 0L?0:(var8 < 0L?-1:1);
            if(var1 != null) {
               var10001 = var10001 > 0?1:0;
            }

            var5.method_6053((boolean)var10001);
            if(var1 != null) {
               continue;
            }
         }

         long var9;
         var6 = (var9 = System.currentTimeMillis() - var2 - 100L) == 0L?0:(var9 < 0L?-1:1);
         if(var1 == null) {
            return (boolean)var6;
         }

         if(var6 > 0) {
            String[] var7 = field_7643;
            field_7638.info("Warning: Clientside chunk ticking took {} ms", new Object[]{Long.valueOf(System.currentTimeMillis() - var2)});
         }
         break;
      }

      var6 = 0;
      return (boolean)var6;
   }

   // $FF: renamed from: b () boolean
   public boolean method_109() {
      return false;
   }

   // $FF: renamed from: b (gG, int, int) void
   public void method_106(class_25 var1, int var2, int var3) {}

   // $FF: renamed from: c () java.lang.String
   public String method_110() {
      StringBuilder var10000 = new StringBuilder();
      String[] var1 = field_7643;
      return var10000.append("MultiplayerChunkCache: ").append(this.field_7640.method_9524()).append(", ").append(this.field_7641.size()).toString();
   }

   // $FF: renamed from: b (as, int, int, int) java.util.List
   public List method_111(class_922 var1, int var2, int var3, int var4) {
      return null;
   }

   // $FF: renamed from: b (ahb, java.lang.String, int, int, int) dd
   public class_1034 method_112(ahb var1, String var2, int var3, int var4, int var5) {
      return null;
   }

   // $FF: renamed from: d () int
   public int method_113() {
      return this.field_7641.size();
   }

   // $FF: renamed from: f (int, int) void
   public void method_114(int var1, int var2) {}

   // $FF: renamed from: <clinit> () void
   static void method_7834() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "ê(}âÃÕ¢§qëÅÿ»¨cÍÖß«ü(,iüÙÕ©ü(ÍÛÕ ²{çÓÙV­®}àÜ§¥cçÙÛVº©gåÇî«{";
      int var4 = "ê(}âÃÕ¢§qëÅÿ»¨cÍÖß«ü(,iüÙÕ©ü(ÍÛÕ ²{çÓÙV­®}àÜ§¥cçÙÛVº©gåÇî«{".length();
      char var1 = 2;
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
            char[] var10 = var8;
            var8 = var10003;
            if(var10003 <= var6) {
               var5[var3++] = (new String((char[])var9)).intern();
               if((var0 += var1) >= var4) {
                  field_7643 = var5;
                  field_7638 = LogManager.getLogger();
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 166;
               break;
            case 1:
               var10009 = 104;
               break;
            case 2:
               var10009 = 238;
               break;
            case 3:
               var10009 = 215;
               break;
            case 4:
               var10009 = 220;
               break;
            case 5:
               var10009 = 22;
               break;
            default:
               var10009 = 174;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var10 ^ var10009);
            ++var6;
         }
      }
   }
}
