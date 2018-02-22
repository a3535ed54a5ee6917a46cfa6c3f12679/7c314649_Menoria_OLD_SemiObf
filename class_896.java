
// $FF: renamed from: aL
class class_896 implements IWrUpdateListener {

   // $FF: renamed from: a aK
   private class_895 width9;
   // $FF: renamed from: b WrUpdateThread
   final WrUpdateThread height0;


   // $FF: renamed from: <init> (WrUpdateThread) void
   private void method_5193(WrUpdateThread var1) {
      this.height0 = var1;
      super();
      class_895 var10001 = new class_895;
      var1.getClass();
      var10001.method_5192(var1, (class_894)null);
      this.width9 = var10001;
   }

   public void updating(IWrUpdateControl var1) {
      this.width9.method_5191(var1);
      WrUpdateThread.access$200(this.height0, this.width9);
   }

   // $FF: renamed from: <init> (WrUpdateThread, aJ) void
   void method_5194(WrUpdateThread var1, class_894 var2) {
      this.method_5193(var1);
   }
}
