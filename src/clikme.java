import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class clikme {

        public static void main(String[] args) {

            JFrame frame = new JFrame("ActionListener Demo");       // أي قمنا بإنشاء نافذة مع وضع عنوان لها JFrame هنا أنشأنا كائن من الكلاس
            JButton button = new JButton("Click Me");               // أي قمنا بتعريف زر .JButton هنا أنشأنا كائن من الكلاس

            button.addActionListener(new ActionListener() {         // كلما قام المستخدم بالنقر على الزر سيتم تنفيذ الأمر الموضوع من جديد
                @Override
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(frame, "The button is clicked");
                }
            });

            button.setBounds(90, 40, 100, 30);                      // هنا قمنا بتحديد حجم و مكان الزر في النافذة

            frame.add(button);                                      // frame في الـ button هنا أضفنا الـ
            frame.setSize(300, 300);                                // هنا قمنا بتحديد حجم النافذة. عرضها 300 و طولها 300
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // هنا جعلنا زر الخروج من النافذة يغلق البرنامج
            frame.setLayout(null);                                  // لأننا رتبنا محتواها يدوياً Layout Manager هنا قمنا بجعل النافذة لا تستخدم أي
            frame.setVisible(true);                                 // هنا جعلنا النافذة مرئية

        }
}
