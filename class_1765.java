
// $FF: renamed from: yA
public class class_1765 extends class_1727 {

   // $FF: renamed from: a wU
   private class_768 field_9230;
   // $FF: renamed from: d wU
   private class_768 field_9231;
   // $FF: renamed from: e ahb
   private ahb field_9232;
   // $FF: renamed from: f int
   private int field_9233;
   // $FF: renamed from: g za
   class_1849 field_9234;
   // $FF: renamed from: h java.lang.String
   private static final String field_9235 = "CL_00001594";


   // $FF: renamed from: <init> (wU) void
   public void method_9728(class_768 var1) {
      super.method_9648();
      this.field_9230 = var1;
      this.field_9232 = var1.field_2990;
      this.method_9655(3);
   }

   // $FF: renamed from: b () boolean
   public boolean method_9649() {
      int var10000;
      String[] var1;
      class_1765 var3;
      label56: {
         var1 = class_752.method_4253();
         var10000 = this.field_9230.method_4354();
         if(var1 != null) {
            if(var10000 != 0) {
               return false;
            }

            var3 = this;
            if(var1 == null) {
               break label56;
            }

            var10000 = this.field_9230.method_4165().nextInt(500);
         }

         if(var10000 != 0) {
            return false;
         }

         this.field_9234 = this.field_9232.field_1827.method_6780(class_1715.method_9561(this.field_9230.field_2994), class_1715.method_9561(this.field_9230.field_2995), class_1715.method_9561(this.field_9230.field_2996), 0);
         var3 = this;
      }

      if(var1 != null) {
         if(var3.field_9234 == null) {
            return false;
         }

         var3 = this;
      }

      if(var1 != null) {
         if(!var3.method_9729()) {
            return false;
         }

         var3 = this;
      }

      class_689 var2 = var3.field_9232.method_2159(class_768.class, this.field_9230.field_3004.method_7097(8.0D, 3.0D, 8.0D), this.field_9230);
      if(var1 != null) {
         if(var2 == null) {
            return false;
         }

         this.field_9231 = (class_768)var2;
      }

      var10000 = this.field_9231.method_4354();
      if(var1 != null) {
         var10000 = var10000 == 0?1:0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: e () void
   public void method_9652() {
      this.field_9233 = 300;
      this.field_9230.method_4363(true);
   }

   // $FF: renamed from: f () void
   public void method_9653() {
      this.field_9234 = null;
      this.field_9231 = null;
      this.field_9230.method_4363(false);
   }

   // $FF: renamed from: c () boolean
   public boolean method_9650() {
      int var10000;
      label32: {
         String[] var1 = class_752.method_4253();
         var10000 = this.field_9233;
         if(var1 != null) {
            if(this.field_9233 < 0) {
               break label32;
            }

            var10000 = this.method_9729();
         }

         if(var1 != null) {
            if(var10000 == 0) {
               break label32;
            }

            var10000 = this.field_9230.method_4354();
         }

         if(var1 == null) {
            return (boolean)var10000;
         }

         if(var10000 == 0) {
            var10000 = 1;
            return (boolean)var10000;
         }
      }

      var10000 = 0;
      return (boolean)var10000;
   }

   // $FF: renamed from: g () void
   public void method_9654() {
      class_1765 var3;
      label42: {
         int var2;
         label43: {
            String[] var1;
            label44: {
               --this.field_9233;
               String[] var10000 = class_752.method_4253();
               this.field_9230.method_4254().method_9975(this.field_9231, 10.0F, 30.0F);
               var1 = var10000;
               double var4;
               var2 = (var4 = this.field_9230.method_3891(this.field_9231) - 2.25D) == 0.0D?0:(var4 < 0.0D?-1:1);
               if(var1 != null) {
                  if(var2 > 0) {
                     this.field_9230.method_4257().method_9796(this.field_9231, 0.25D);
                     if(var1 != null) {
                        break label44;
                     }
                  }

                  var2 = this.field_9233;
               }

               if(var1 == null) {
                  break label43;
               }

               if(var2 == 0) {
                  var2 = this.field_9231.method_4362();
                  if(var1 == null) {
                     break label43;
                  }

                  if(var2 != 0) {
                     this.method_9730();
                  }
               }
            }

            var3 = this;
            if(var1 == null) {
               break label42;
            }

            var2 = this.field_9230.method_4165().nextInt(35);
         }

         if(var2 != 0) {
            return;
         }

         var3 = this;
      }

      var3.field_9232.method_2191(this.field_9230, (byte)12);
   }

   // $FF: renamed from: a () boolean
   private boolean method_9729() {
      String[] var1 = class_752.method_4253();
      int var10000 = this.field_9234.method_10028();
      if(var1 != null) {
         if(var10000 == 0) {
            return false;
         }

         var10000 = (int)((double)((float)this.field_9234.method_10005()) * 0.35D);
      }

      int var2 = var10000;
      var10000 = this.field_9234.method_10007();
      if(var1 != null) {
         var10000 = var10000 < var2?1:0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: i () void
   private void method_9730() {
      class_768 var1 = this.field_9230.method_4376(this.field_9231);
      this.field_9231.method_4356(6000);
      this.field_9230.method_4356(6000);
      var1.method_4356(-24000);
      var1.method_3887(this.field_9230.field_2994, this.field_9230.field_2995, this.field_9230.field_2996, 0.0F, 0.0F);
      this.field_9232.method_2089(var1);
      this.field_9232.method_2191(var1, (byte)12);
   }

   // $FF: renamed from: <clinit> () void
   static void method_9731() {
      boolean var10000 = true;
      char[] var10003 = ":ÈaçH±".toCharArray();
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
            field_9235 = (new String((char[])var4)).intern();
            String var2 = field_9235;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 110;
            break;
         case 1:
            var10009 = 147;
            break;
         case 2:
            var10009 = 41;
            break;
         case 3:
            var10009 = 62;
            break;
         case 4:
            var10009 = 192;
            break;
         case 5:
            var10009 = 58;
            break;
         default:
            var10009 = 162;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
