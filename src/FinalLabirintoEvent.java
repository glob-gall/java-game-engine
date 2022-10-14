import gameEngine.Constants;
import gameEngine.Event;

 public class FinalLabirintoEvent extends Event {
    public void exec(){
        if(this.gm == null)
            return;

        if (gm.rects[0].x == 122 && gm.rects[0].y == 37){
            System.out.println("VOCE GANHOU");
        }else{
            System.out.println("x:"+gm.rects[0].x+"y:"+gm.rects[0].y);
        }
    }
}
