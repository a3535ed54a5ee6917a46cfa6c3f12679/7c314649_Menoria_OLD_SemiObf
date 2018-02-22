
// $FF: renamed from: aK
class class_895 implements IWrUpdateControl {

   // $FF: renamed from: a IWrUpdateControl
   private IWrUpdateControl width6;
   // $FF: renamed from: b boolean
   private boolean width7;
   // $FF: renamed from: c WrUpdateThread
   final WrUpdateThread width8;


   // $FF: renamed from: <init> (WrUpdateThread) void
   private void method_5190(WrUpdateThread var1) {
      this.width8 = var1;
      super();
      this.width6 = null;
      this.width7 = false;
   }

   public void pause() {
      String[] var1 = class_752.method_4253();
      class_895 var10000 = this;
      if(var1 != null) {
         if(this.width7) {
            return;
         }

         this.width7 = true;
         this.width6.pause();
         var10000 = this;
      }

      bmh.instance = WrUpdateThread.access$000(var10000.width8);
   }

   public void resume() {
      String[] var1 = class_752.method_4253();
      Object var10000 = this;
      if(var1 != null) {
         if(!this.width7) {
            return;
         }

         this.width7 = false;
         bmh.instance = WrUpdateThread.access$100(this.width8);
         var10000 = this.width6;
      }

      ((IWrUpdateControl)var10000).resume();
   }

   // $FF: renamed from: a (IWrUpdateControl) void
   public void method_5191(IWrUpdateControl var1) {
      this.width6 = var1;
   }

   // $FF: renamed from: <init> (WrUpdateThread, aJ) void
   void method_5192(WrUpdateThread var1, class_894 var2) {
      this.method_5190(var1);
   }
}
