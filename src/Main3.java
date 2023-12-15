import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;
public class Main3 {


        public static void main(String[] args) {

            JFrame frame = new JFrame("dentist");               // أي قمنا بإنشاء نافذة مع وضع عنوان لها JFrame هنا أنشأنا كائن من الكلاس
            frame.setSize(300, 250);                                // هنا قمنا بتحديد حجم النافذة. عرضها 300 و طولها 250
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // هنا جعلنا زر الخروج من النافذة يغلق البرنامج
            frame.setLayout(new FlowLayout());                      // حتى نجعل الأشياء التي نضيفها في النافذة تترب وراء بعضها و في وسط النافذة FlowLayout إستخدمنا الـ

            JLabel label = new JLabel("consultation de dossier ");          // Label أي قمنا بإنشاء JLabel هنا أنشأنا كائن من الكلاس

            frame.add(label);                                       // frame في الـ label هنا أضفنا الـ

            frame.setVisible(true);                                 // هنا جعلنا النافذة مرئية

        }

    }

