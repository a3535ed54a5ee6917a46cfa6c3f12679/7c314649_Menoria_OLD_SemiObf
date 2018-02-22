import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// $FF: renamed from: mj
class class_969 extends bcm {

   // $FF: renamed from: w java.util.List
   private final List field_4906;
   // $FF: renamed from: x java.util.Map
   private final Map field_4907;
   // $FF: renamed from: y java.lang.String
   private static final String field_4908;
   // $FF: renamed from: z lq
   final class_173 field_4909;
   // $FF: renamed from: A java.lang.String[]
   private static final String[] field_4910;


   // $FF: renamed from: <init> (lq) void
   public void method_5595(class_173 var1) {
      String[] var10000 = class_752.method_4253();
      this.field_4909 = var1;
      super.method_5549(var1.field_557, var1.width, var1.height, 32, var1.height - 65 + 4, 18);
      this.field_4906 = Lists.newArrayList();
      this.field_4907 = Maps.newHashMap();
      String[] var2 = var10000;
      Iterator var3 = class_173.method_927(var1).method_7908().iterator();

      while(var3.hasNext()) {
         class_1451 var4 = (class_1451)var3.next();
         this.field_4907.put(var4.method_7898(), var4);
         this.field_4906.add(var4.method_7898());
         if(var2 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: b () int
   protected int method_5553() {
      return this.field_4906.size();
   }

   // $FF: renamed from: a (int, boolean, int, int) void
   protected void method_5554(int var1, boolean var2, int var3, int var4) {
      class_1451 var6 = (class_1451)this.field_4907.get(this.field_4906.get(var1));
      String[] var10000 = class_752.method_4253();
      class_173.method_927(this.field_4909).method_7906(var6);
      class_173.method_928(this.field_4909).field_4575 = var6.method_7898();
      String[] var5 = var10000;
      this.field_4909.field_557.method_5229();
      FontRenderer var7 = this.field_4909.fontRendererObj;
      boolean var10001 = class_173.method_927(this.field_4909).method_7904();
      if(var5 != null) {
         label17: {
            if(!var10001) {
               var10001 = class_173.method_928(this.field_4909).field_4576;
               if(var5 == null) {
                  break label17;
               }

               if(!var10001) {
                  var10001 = false;
                  break label17;
               }
            }

            var10001 = true;
         }
      }

      var7.setUnicodeFlag(var10001);
      this.field_4909.fontRendererObj.setBidiFlag(class_173.method_927(this.field_4909).method_7905());
      class_141 var8 = class_173.method_929(this.field_4909);
      String[] var9 = field_4910;
      var8.field_449 = class_1450.method_7896("gui.done", new Object[0]);
      class_173.method_930(this.field_4909).field_449 = class_173.method_928(this.field_4909).method_5355(class_101.field_123);
      class_173.method_928(this.field_4909).method_5358();
   }

   // $FF: renamed from: a (int) boolean
   protected boolean method_5555(int var1) {
      return ((String)this.field_4906.get(var1)).equals(class_173.method_927(this.field_4909).method_7907().method_7898());
   }

   // $FF: renamed from: e () int
   protected int method_5556() {
      return this.method_5553() * 18;
   }

   // $FF: renamed from: a () void
   protected void method_5557() {
      this.field_4909.method_873();
   }

   // $FF: renamed from: a (int, int, int, int, bmh, int, int) void
   protected void method_5558(int var1, int var2, int var3, int var4, bmh var5, int var6, int var7) {
      this.field_4909.fontRendererObj.setBidiFlag(true);
      this.field_4909.drawCenteredString(this.field_4909.fontRendererObj, ((class_1451)this.field_4907.get(this.field_4906.get(var1))).toString(), this.field_4854 / 2, var3 + 1, 16777215);
      this.field_4909.fontRendererObj.setBidiFlag(class_173.method_927(this.field_4909).method_7907().method_7899());
   }

   // $FF: renamed from: <clinit> () void
   static void method_5579() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "ºÐ¥Ep>æñ.Mù";
      int var4 = "ºÐ¥Ep>æñ.Mù".length();
      char var1 = 8;
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
                  field_4910 = var5;
                  String[] var10 = field_4910;
                  field_4908 = "CL_00000699";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 90;
               break;
            case 1:
               var10009 = 232;
               break;
            case 2:
               var10009 = 158;
               break;
            case 3:
               var10009 = 146;
               break;
            case 4:
               var10009 = 230;
               break;
            case 5:
               var10009 = 13;
               break;
            default:
               var10009 = 57;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}
