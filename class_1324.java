import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;

// $FF: renamed from: kM
public class class_1324 {

   // $FF: renamed from: b int
   public int field_6800;
   // $FF: renamed from: c int
   public int field_6801;


   // $FF: renamed from: <init> () void
   public void method_6960() {
      super();
   }

   // $FF: renamed from: b () void
   public void method_6961() {
      Mouse.setGrabbed(true);
      this.field_6800 = 0;
      this.field_6801 = 0;
   }

   // $FF: renamed from: c () void
   public void method_6962() {
      Mouse.setCursorPosition(Display.getWidth() / 2, Display.getHeight() / 2);
      Mouse.setGrabbed(false);
   }

   // $FF: renamed from: d () void
   public void method_6963() {
      this.field_6800 = Mouse.getDX();
      this.field_6801 = Mouse.getDY();
   }
}
