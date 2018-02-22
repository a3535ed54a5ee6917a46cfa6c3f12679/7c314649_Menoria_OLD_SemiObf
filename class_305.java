import java.util.ArrayList;
import java.util.Collection;

// $FF: renamed from: sZ
public class class_305 extends class_250 {

   // $FF: renamed from: c java.lang.String
   private String field_1572;
   // $FF: renamed from: d java.lang.String
   private String field_1573;
   // $FF: renamed from: e java.lang.String
   private String field_1574;
   // $FF: renamed from: f java.lang.String
   private String field_1575;
   // $FF: renamed from: g java.util.Collection
   private Collection field_1576;
   // $FF: renamed from: h int
   private int field_1577;
   // $FF: renamed from: i int
   private int field_1578;
   // $FF: renamed from: j java.lang.String[]
   private static final String[] field_1579;


   // $FF: renamed from: <init> () void
   public void method_1449() {
      super.method_1449();
      this.field_1572 = "";
      this.field_1573 = "";
      this.field_1574 = "";
      this.field_1575 = "";
      this.field_1576 = new ArrayList();
   }

   // $FF: renamed from: <init> (ko, int) void
   public void method_1737(class_1351 param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: <init> (ko, java.util.Collection, int) void
   public void method_1738(class_1351 param1, Collection param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (d) void
   public void method_1453(class_112 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: c (d) void
   public void method_1454(class_112 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (tF) void
   public void method_1739(class_64 var1) {
      var1.method_323(this);
   }

   // $FF: renamed from: a () java.lang.String
   public String method_1740() {
      return this.field_1572;
   }

   // $FF: renamed from: e () java.lang.String
   public String method_1741() {
      return this.field_1573;
   }

   // $FF: renamed from: f () java.lang.String
   public String method_1742() {
      return this.field_1574;
   }

   // $FF: renamed from: g () java.lang.String
   public String method_1743() {
      return this.field_1575;
   }

   // $FF: renamed from: h () java.util.Collection
   public Collection method_1744() {
      return this.field_1576;
   }

   // $FF: renamed from: i () int
   public int method_1745() {
      return this.field_1577;
   }

   // $FF: renamed from: j () int
   public int method_1746() {
      return this.field_1578;
   }

   // $FF: renamed from: b (java.lang.IllegalArgumentException) java.lang.IllegalArgumentException
   private static IllegalArgumentException method_1747(IllegalArgumentException var0) {
      return var0;
   }

   // $FF: renamed from: <clinit> () void
   static void method_1458() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "+¿&m1¯!qÈtF°=lZ~ú>`\ftF¼=wÈ\n}£7wÈ~\b©&we\t¨6¶3|\bbF¹3keF¸7%}\nõ7hh";
      int var4 = "+¿&m1¯!qÈtF°=lZ~ú>`\ftF¼=wÈ\n}£7wÈ~\b©&we\t¨6¶3|\bbF¹3keF¸7%}\nõ7hh".length();
      char var1 = 51;
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
                  field_1579 = var5;
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 108;
               break;
            case 1:
               var10009 = 208;
               break;
            case 2:
               var10009 = 88;
               break;
            case 3:
               var10009 = 15;
               break;
            case 4:
               var10009 = 226;
               break;
            case 5:
               var10009 = 112;
               break;
            default:
               var10009 = 27;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var10 ^ var10009);
            ++var6;
         }
      }
   }
}
