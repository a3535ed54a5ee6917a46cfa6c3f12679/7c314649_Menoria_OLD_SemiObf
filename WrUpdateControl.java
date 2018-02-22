
public class WrUpdateControl implements IWrUpdateControl {

   private boolean hasForge;
   private int renderPass;


   // $FF: renamed from: <init> () void
   public void method_3720() {
      super();
      this.hasForge = Reflector.ForgeHooksClient.exists();
      this.renderPass = 0;
   }

   public void resume() {}

   public void pause() {}

   public void setRenderPass(int var1) {
      this.renderPass = var1;
   }
}
