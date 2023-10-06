import javax.swing.JFrame;
import javax.swing.JOptionPane;
 import javax.swing.*;

public class RunnerMain{
    public RunnerMain(){
        VirtualPet p = new VirtualPet();
        p.exercise();
        takeABeat(1000);
        p.feed();

    }
    public String getAnswer(String q){
        String s = (String)JOptionPane.showInputDialog(
                    new JFrame(),
                    "Your Message",
                    "Your Title",
                    JOptionPane.PLAIN_MESSAGE
);

    }
    public void takeABeat(int milliseconds){
        try {
                Thread.sleep(1000); //milliseconds
            } catch(Exception e){
        
            }
        }


 public static void main(String[] args) {
    RunnerMain r = new RunnerMain();

 }

}