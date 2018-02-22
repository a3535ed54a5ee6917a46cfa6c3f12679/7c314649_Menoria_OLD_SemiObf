import io.netty.buffer.ByteBuf;
import java.text.SimpleDateFormat;
import java.util.Date;
import net.minecraft.server.MinecraftServer;

// $FF: renamed from: c7
public abstract class class_926 implements class_20 {

   // $FF: renamed from: b java.text.SimpleDateFormat
   private static final SimpleDateFormat field_4709;
   // $FF: renamed from: c int
   private int field_4710;
   // $FF: renamed from: d boolean
   private boolean field_4711;
   // $FF: renamed from: e rV
   private class_66 field_4712;
   // $FF: renamed from: f java.lang.String
   private String field_4713;
   // $FF: renamed from: g java.lang.String
   private String field_4714;
   // $FF: renamed from: h java.lang.String
   private static final String field_4715;
   // $FF: renamed from: i java.lang.String[]
   private static final String[] field_4716;


   // $FF: renamed from: <init> () void
   public void method_5433() {
      super();
      this.field_4711 = true;
      this.field_4712 = null;
      this.field_4713 = "";
      this.field_4714 = "@";
   }

   // $FF: renamed from: a () int
   public int method_5434() {
      return this.field_4710;
   }

   // $FF: renamed from: b () rV
   public class_66 method_5435() {
      return this.field_4712;
   }

   // $FF: renamed from: b (ro) void
   public void method_5436(class_1583 var1) {
      String[] var10000 = class_752.method_4253();
      String[] var3 = field_4716;
      var1.initGui1("Command", this.field_4713);
      String[] var2 = var10000;
      var1.method_8667("SuccessCount", this.field_4710);
      var1.initGui1("CustomName", this.field_4714);
      if(var2 != null) {
         if(this.field_4712 != null) {
            var1.initGui1("LastOutput", class_1556.method_8482(this.field_4712));
         }

         String[] var10001 = field_4716;
         var1.initGui4("TrackOutput", this.field_4711);
      }

   }

   // $FF: renamed from: c (ro) void
   public void method_5437(class_1583 var1) {
      String[] var3 = field_4716;
      this.field_4713 = var1.method_8685("Command");
      String[] var10000 = class_752.method_4253();
      this.field_4710 = var1.method_8681("SuccessCount");
      String[] var2 = var10000;
      boolean var4 = var1.initGui8("CustomName", 8);
      if(var2 != null) {
         if(var4) {
            this.field_4714 = var1.method_8685("CustomName");
         }

         var3 = field_4716;
         var4 = var1.initGui8("LastOutput", 8);
      }

      if(var2 != null) {
         if(var4) {
            var3 = field_4716;
            this.field_4712 = class_1556.method_8483(var1.method_8685("LastOutput"));
         }

         var3 = field_4716;
         var4 = var1.initGui8("TrackOutput", 1);
      }

      if(var4) {
         String[] var10002 = field_4716;
         this.field_4711 = var1.method_8690("TrackOutput");
      }

   }

   // $FF: renamed from: a (int, java.lang.String) boolean
   public boolean method_67(int var1, String var2) {
      String[] var3 = class_752.method_4253();
      int var10000 = var1;
      if(var3 != null) {
         var10000 = var1 <= 2?1:0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: b (java.lang.String) void
   public void method_5438(String var1) {
      this.field_4713 = var1;
   }

   // $FF: renamed from: c () java.lang.String
   public String method_5439() {
      return this.field_4713;
   }

   // $FF: renamed from: b (ahb) void
   public void method_5440(ahb var1) {
      String[] var2 = class_752.method_4253();
      if(var1.field_1832) {
         this.field_4710 = 0;
      }

      label32: {
         MinecraftServer var3 = MinecraftServer.method_2348();
         MinecraftServer var10000 = var3;
         if(var2 != null) {
            if(var3 == null) {
               break label32;
            }

            var10000 = var3;
         }

         if(var2 != null) {
            if(!var10000.method_2378()) {
               break label32;
            }

            var10000 = var3;
         }

         class_14 var4 = var10000.method_2349();
         this.field_4710 = var4.method_39(this, this.field_4713);
         if(var2 != null) {
            return;
         }
      }

      this.field_4710 = 0;
   }

   // $FF: renamed from: b_ () java.lang.String
   public String method_64() {
      return this.field_4714;
   }

   // $FF: renamed from: c_ () rV
   public class_66 method_65() {
      class_1082 var10000 = new class_1082;
      var10000.method_6134(this.method_64());
      return var10000;
   }

   // $FF: renamed from: c (java.lang.String) void
   public void method_5441(String var1) {
      this.field_4714 = var1;
   }

   // $FF: renamed from: a (rV) void
   public void method_66(class_66 var1) {
      String[] var2 = class_752.method_4253();
      class_926 var10000 = this;
      if(var2 != null) {
         if(!this.field_4711) {
            return;
         }

         var10000 = this;
      }

      label33: {
         ahb var3 = var10000.method_69();
         if(var2 != null) {
            if(var3 == null) {
               return;
            }

            var10000 = this;
            if(var2 == null) {
               break label33;
            }

            var3 = this.method_69();
         }

         if(var3.field_1832) {
            return;
         }

         class_1082 var10001 = new class_1082;
         StringBuilder var10003 = (new StringBuilder()).append("[").append(field_4709.format(new Date()));
         String[] var10004 = field_4716;
         var10001.method_6134(var10003.append("] ").toString());
         this.field_4712 = var10001.method_340(var1);
         var10000 = this;
      }

      var10000.method_5442();
   }

   // $FF: renamed from: f () void
   public abstract void method_5442();

   // $FF: renamed from: g () int
   public abstract int method_5443();

   // $FF: renamed from: b (io.netty.buffer.ByteBuf) void
   public abstract void method_5444(ByteBuf var1);

   // $FF: renamed from: c (rV) void
   public void method_5445(class_66 var1) {
      this.field_4712 = var1;
   }

   // $FF: renamed from: <clinit> () void
   static void method_5446() {
      // $FF: Couldn't be decompiled
   }
}
