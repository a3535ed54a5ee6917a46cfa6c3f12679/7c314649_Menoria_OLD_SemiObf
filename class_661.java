import paulscode.sound.Library;
import paulscode.sound.SoundSystem;
import paulscode.sound.SoundSystemConfig;
import paulscode.sound.Source;

// $FF: renamed from: AY
class class_661 extends SoundSystem {

   // $FF: renamed from: a java.lang.String
   private static final String field_2827 = "CL_00001145";
   // $FF: renamed from: b qh
   final class_1533 field_2828;


   // $FF: renamed from: <init> (qh) void
   private void method_3577(class_1533 var1) {
      this.field_2828 = var1;
      super();
   }

   public boolean playing(String var1) {
      String[] var10000 = class_752.method_4253();
      Object var3 = SoundSystemConfig.THREAD_SYNC;
      String[] var2 = var10000;
      Object var4 = SoundSystemConfig.THREAD_SYNC;
      synchronized(SoundSystemConfig.THREAD_SYNC) {
         Library var8 = this.soundLibrary;
         if(var2 != null) {
            if(this.soundLibrary == null) {
               return false;
            }

            var8 = this.soundLibrary;
         }

         Source var5 = (Source)var8.getSources().get(var1);
         Source var9 = var5;
         boolean var10;
         if(var2 != null) {
            if(var5 == null) {
               var10 = false;
               return var10;
            }

            var9 = var5;
         }

         var10 = var9.playing();
         if(var2 != null) {
            if(!var10) {
               var10 = var5.paused();
               if(var2 == null) {
                  return var10;
               }

               if(!var10) {
                  var10 = var5.preLoad;
                  if(var2 == null) {
                     return var10;
                  }

                  if(!var5.preLoad) {
                     var10 = false;
                     return var10;
                  }
               }
            }

            var10 = true;
         }

         return var10;
      }
   }

   // $FF: renamed from: <init> (qh, java.lang.Object) void
   void method_3578(class_1533 var1, Object var2) {
      this.method_3577(var1);
   }

   // $FF: renamed from: <clinit> () void
   static void method_3579() {
      boolean var10000 = true;
      char[] var10003 = "|zHFñÐ#C".toCharArray();
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
            field_2827 = (new String((char[])var4)).intern();
            String var2 = field_2827;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 33;
            break;
         case 1:
            var10009 = 40;
            break;
         case 2:
            var10009 = 9;
            break;
         case 3:
            var10009 = 104;
            break;
         case 4:
            var10009 = 223;
            break;
         case 5:
            var10009 = 254;
            break;
         default:
            var10009 = 43;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
