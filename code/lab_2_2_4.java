import javax.swing.JOptionPane;

public class lab_2_2_4 {
    public static void main(String[] args){
        String strNum1, strNum2;
        String strNotification = "You have just entered : ";
        strNum1 = JOptionPane.showInputDialog(null,
                    "Please input the first number : ", 
                    "Input the first numer: ",
                    JOptionPane.INFORMATION_MESSAGE);
        strNotification += strNum1 + " and ";

        strNum2 = JOptionPane.showInputDialog(null,
                    "Please input the second number : ", 
                    "Input the second numer: ",
                    JOptionPane.INFORMATION_MESSAGE);
        strNotification += strNum2;

        JOptionPane.showMessageDialog(null,strNotification,
                    "Show two numbers", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
