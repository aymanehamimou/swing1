import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.Font;
public class Main4 {
        public static void main(String[] args) {

            JFrame frame = new JFrame("JLabel demo");               // أي قمنا بإنشاء نافذة مع وضع عنوان لها JFrame هنا أنشأنا كائن من الكلاس
            frame.setSize(300, 250);                                // هنا قمنا بتحديد حجم النافذة. عرضها 300 و طولها 250
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // هنا جعلنا زر الخروج من النافذة يغلق البرنامج
            frame.setLayout(new FlowLayout());                      // حتى نجعل الأشياء التي نضيفها في النافذة تترب وراء بعضها و في وسط النافذة FlowLayout إستخدمنا الـ

            Font newFont = new Font("Serif", Font.BOLD, 25);        // حجمه 25 serif يمثل نوع خط عريض إسمه Font هنا أنشأنا كائن من الكلاس

            JLabel label = new JLabel("Welcome to Swing");          // Label أي قمنا بإنشاء JLabel هنا أنشأنا كائن من الكلاس
            label.setFont(newFont);                                 // newFont يستخدم الـ label هنا جعلنا الـ

            frame.add(label);                                       // frame في الـ label هنا أضفنا الـ
            frame.setVisible(true);                                 // هنا جعلنا النافذة مرئية

        }

    }

