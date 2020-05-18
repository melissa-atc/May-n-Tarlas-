package mayinoyunu;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;
import java.awt.Image;
import java.util.Timer;
import java.awt.event.ActionListener;
import java.util.TimerTask;

public class mayinoyunu extends mayinTarlasiOyunu {
 static int sayac=0;
    protected int kareSayisi = 30;
protected int mayin = 0;
JFrame frame = new JFrame("Mayın Tarlası");
    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
  public static void main(String[] args) {
mayinoyunu al = new mayinoyunu();
al.GUI_Hazırla();
}
    
public class mayinYerlestirme extends mayinTarlasiOyunu implements ActionListener{

    private int gecen_sure = 0;
    protected int boyut;
protected int mayinSayisi; 
JButton [][] tik;
int[][] mayin;
int hak;
 JButton reset;
public void actionPerformed(ActionEvent e) {
    
        if (e.getSource().equals(reset)) {
            for (int i = 0; i < tik.length; i++) {
                for (int j = 0; j < tik[0].length; j++) {
                    tik[i][j].setEnabled(true);
                    tik[i][j].setText("");
                }
            }

            oyunBitti();
        }
JButton btn=(JButton)e.getSource();
Point point=getArrayLocation(btn);
if(mayin[point.x][point.y]<0){
tik[point.x][point.y].setText(" "); 


       
       
       
oyunBitti();
}
else if(mayin[point.x][point.y]>0){
if(tik[point.x][point.y].getActionCommand()=="doldur"){ 
if(mayin[point.x][point.y]==1)
   


{

tik[point.x][point.y].setText(""+mayin[point.x][point.y]);
tik[point.x][point.y].setOpaque(true);
tik[point.x][point.y].setBackground(Color.WHITE);
}
if(mayin[point.x][point.y]==2){
tik[point.x][point.y].setText(""+mayin[point.x][point.y]);;
tik[point.x][point.y].setOpaque(true);
tik[point.x][point.y].setBackground(Color.WHITE);
}
if(mayin[point.x][point.y]==3){
tik[point.x][point.y].setText(""+mayin[point.x][point.y]);
tik[point.x][point.y].setOpaque(true);
tik[point.x][point.y].setBackground(Color.WHITE);
}
if(mayin[point.x][point.y]>3) {
tik
        [point.x][point.y].setText(""+mayin[point.x][point.y]);
tik[point.x][point.y].setOpaque(true);
tik[point.x][point.y].setBackground(Color.WHITE);
}
hak--;
} }
else if(mayin[point.x][point.y]==0){
kareAcma(point.x,point.y); 
} }

        public mayinYerlestirme(int boyut, int mayinSayisi, JButton[][] button, int[][] mayin, int hak) {
            this.boyut = boyut;
            this.mayinSayisi = mayinSayisi;
            this.tik = button;
            this.mayin = mayin;
            this.hak = hak;
        }
        

        
public void oyunBitti(){
for(int i=0;i<mayin.length;i++){
for(int j=0;j<mayin.length;j++){
if(mayin[i][j]<0){
tik[i][j].setText(" ");

tik[i][j].setOpaque(true);
tik[i][j].setBackground(Color.RED);


}
else if(mayin[i][j]==0){
tik[i][j].setText(" ");
tik[i][j].setOpaque(true);
tik[i][j].setBackground(Color.WHITE);
}
else{
tik[i][j].setText(""+mayin[i][j]);
if(mayin[i][j]==1){
tik[i][j].setText(""+mayin[i][j]);
tik[i][j].setOpaque(true);
tik[i][j].setBackground(Color.WHITE);
} 
if(mayin[i][j]==2){
tik[i][j].setText(""+mayin[i][j]);
tik[i][j].setOpaque(true);
tik[i][j].setBackground(Color.WHITE);
} 
if(mayin[i][j]==3){
tik[i][j].setText(""+mayin[i][j]);
tik[i][j].setOpaque(true);
tik[i][j].setBackground(Color.WHITE);
}
if(mayin[i][j]>3){
tik[i][j].setText(""+mayin[i][j]);
tik[i][j].setOpaque(true);
tik[i][j].setBackground(Color.WHITE);
} } } }
JOptionPane.showMessageDialog(null,"Kaybettiniz","Mayin",JOptionPane.INFORMATION_MESSAGE);
}
public void kareAcma(int x,int y){
if(x<0 || y<0 || x>tik.length-1 ||y>tik.length-1)
return;
if(tik[x][y].getText()==" "){
if(mayin[x][y]>0){
if(mayin[x][y]==1)
{
tik[x][y].setText(""+mayin[x][y]);
tik[x][y].setOpaque(true);
tik[x][y].setBackground(Color.WHITE);


}
if(mayin[x][y]==2){
tik[x][y].setText(""+mayin[x][y]);
tik[x][y].setOpaque(true);
tik[x][y].setBackground(Color.WHITE);
}
if(mayin[x][y]==3){
tik[x][y].setText(""+mayin[x][y]);
tik[x][y].setOpaque(true);
tik[x][y].setBackground(Color.WHITE);
}
if(mayin[x][y]>3){
tik[x][y].setText(""+mayin[x][y]);
tik[x][y].setOpaque(true);
tik[x][y].setBackground(Color.WHITE);
}
hak--;
}
if(mayin[x][y]==0){
tik[x][y].setText(" ");
tik[x][y].setOpaque(true);
tik[x][y].setBackground(Color.WHITE);
hak--;
kareAcma(x-1, y-1); kareAcma(x-1, y+1); kareAcma(x+1, y); kareAcma(x+1, y-1);
kareAcma(x-1, y); kareAcma(x, y+1); kareAcma(x, y-1); kareAcma(x+1, y+1);
} } }
public Point getArrayLocation(JButton btn){
Point pt=new Point(-1, -1);
for(int j=0;j<tik.length;j++){
for(int k=0;k<tik[j].length;k++){
if(tik[j][k]==btn){
pt.setLocation(j, k);
return pt;
} } }
return pt; 
}
public JPanel getContent(){
    JPanel panel = new JPanel(new GridBagLayout());
frame.getContentPane().setLayout(new FlowLayout());


JButton button3=new JButton("ORTA");
frame.getContentPane().add(button3);



JButton resetJButton=new JButton();
frame.getContentPane().add(resetJButton);
Image img =new ImageIcon(this.getClass().getResource("/unnnn.png")).getImage();



resetJButton.setIcon(new ImageIcon(img));
resetJButton.setBounds(10,53,156,100);
frame.getContentPane().add(resetJButton);

JButton button4=new JButton("ZOR ");
frame.getContentPane().add(button4);



GridBagConstraints gbc = new GridBagConstraints();
gbc.weighty = 1.0;
gbc.weightx = 1.0;
for(int j = 0; j < tik.length; j++) {
for(int k = 0; k < tik[j].length; k++) {
int n = j*tik[j].length + k + 1;
tik[j][k] = new JButton(" ");
tik[j][k].addActionListener(this);
tik[j][k].setActionCommand("doldur");
gbc.gridwidth = (k < tik[j].length-1) ? 1 :GridBagConstraints.REMAINDER;
panel.add(tik[j][k], gbc);
} }
return panel;
}
public mayinYerlestirme(int boyut, int mayinSayisi){
this.boyut=boyut;
this.mayinSayisi=mayinSayisi;
tik=new JButton[boyut][boyut]; 
mayin=new int[boyut][boyut]; 
hak=this.boyut*this.boyut-this.mayinSayisi;
Random rnd=new Random();
int x,y;
for(int i=0;i<mayin.length;i++){
for(int j=0;j<mayin.length;j++){
mayin[i][j]=0;
JButton mayin=new JButton();




} }
for(int j=0;j<mayinSayisi;j++){
x=rnd.nextInt(boyut);
y=rnd.nextInt(boyut);
if(mayin[x][y]<0){
j--;
continue;
}
mayin[x][y]=-100;
try{mayin[x-1][y]++;}catch(Exception e){}
try{mayin[x+1][y]++;}catch(Exception e){}
try{mayin[x][y-1]++;}catch(Exception e){}
try{mayin[x][y+1]++;}catch(Exception e){}
try{mayin[x-1][y-1]++;}catch(Exception e){}
try{mayin[x-1][y+1]++;}catch(Exception e){}
try{mayin[x+1][y-1]++;}catch(Exception e){}
try{mayin[x+1][y+1]++;}catch(Exception e){}
} }

        private mayinYerlestirme() {
            throw new UnsupportedOperationException("Not supported yet."); 
        }
}

public void JPanel (){
JPanel Panel = new JPanel();
Panel.setVisible(true);
    
}

public void GUI_Hazırla() {
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.getContentPane().add(new mayinYerlestirme(9, 10).getContent());
frame.setSize(400, 410);
frame.setLocation(300, 100);
frame.setResizable(false);
frame.setVisible(true);
frame.repaint();
frame.revalidate();


}} 
         
