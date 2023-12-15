import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class optionpanel {


        public static void main(String[] args) {

            JFrame frame = new JFrame("JOptionPane demo");            // أي قمنا بإنشاء نافذة مع وضع عنوان لها JFrame هنا أنشأنا كائن من الكلاس
            frame.setSize(400, 200);                                  // هنا قمنا بتحديد حجم النافذة. عرضها 400 و طولها 200
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     // هنا جعلنا زر الخروج من النافذة يغلق البرنامج
            frame.setLayout(null);                                    // في النافذة بنفسنا Buttons لذلك سنقوم بتحديد مكان الـ Layout Manager أي لم نستخدم أي null هنا وضعنا

            // واحد Label و Buttons هنا قمنا بتعريف خمسة إثنين
            JButton btn1 = new JButton("Enter Value");
            JButton btn2 = new JButton("Select Value");
            JLabel label = new JLabel("Returned Value:");

            // Frame هنا قمنا بتحديد موقع و حجم جميع الأشياء التي سنضيفها في الـ
            // منهم Button هنا قمنا بتحديد موقع و حجم كل
            btn1.setBounds(95, 30, 200, 30);
            btn2.setBounds(95, 70, 200, 30);
            label.setBounds(95, 110, 200, 30);

            // Frame هنا قمنا بإضافة جميع الأشياء التي قمنا بتعريفها في الـ
            frame.add(btn1);
            frame.add(btn2);
            frame.add(label);

            // مرئية Frame هنا جعلنا الـ
            frame.setVisible(true);

            // btn1 عند النقر على الـ Input Dialog هنا قلنا أنه سيتم إظهار
            btn1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    // result ثم تخزين القيمة التي قام المستخدم بإدخالها في المتغير Input Dialog سيتم إظهار
                    String result = JOptionPane.showInputDialog(frame, "Enter value:", "", JOptionPane.PLAIN_MESSAGE);

                    // Label في حال قام المستخدم بإدخال قيمة في مربع النص فإنه سيتم عرضها في الـ
                    if(result != null)
                        label.setText("Returned Value: " + result);

                }
            });

            // btn2 عند النقر على الـ Input Dialog هنا قلنا أنه سيتم إظهار
            btn2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    // Input Dialog في الـ Combo Box هنا قمنا بتعريف مصفوفة من الخيارات التي نريد عرضها كـ
                    Object[] values = {"java", "css", "c++", "android"};

                    // result ثم تخزين القيمة التي قام المستخدم بإدخالها في المتغير Input Dialog سيتم إظهار
                    String result = (String) JOptionPane.showInputDialog(frame, "Select value", "", JOptionPane.PLAIN_MESSAGE, null, values, values[0]);

                    // Label سيتم عرض القيمة التي قام المستخدم بإختيارها في الـ
                    label.setText("Returned Value: " + result);

                }
            });
        }
}
