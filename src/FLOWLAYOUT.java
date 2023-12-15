import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.FlowLayout;

public class FLOWLAYOUT {


        public static void main(String[] args) {

            JFrame frame = new JFrame("FlowLayout demo");           // أي قمنا بإنشاء نافذة مع وضع عنوان لها JFrame هنا أنشأنا كائن من الكلاس
            frame.setSize(800, 800);                                // هنا قمنا بتحديد حجم النافذة. عرضها 350 و طولها 200
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // هنا جعلنا زر الخروج من النافذة يغلق البرنامج
            frame.setLayout(new FlowLayout(FlowLayout.LEFT));                      // لترتيب الأشياء التي نضيفها بداخلها FlowLayout هنا جعلنا النافذة تستخدم الـ

            // هنا قمنا بتعريف 5 أزرار
            JButton b1 = new JButton("Button 1");
            JButton b2 = new JButton("Button 2");
            JButton b3 = new JButton("Button 3");
            JButton b4 = new JButton("Button 4");
            JButton b5 = new JButton("Button 5");

            // هنا قمنا بإضافة الأزرار في النافذة
            frame.add(b1);
            frame.add(b2);
            frame.add(b3);
            frame.add(b4);
            frame.add(b5);

            // هنا جعلنا النافذة مرئية
            frame.setVisible(true);

        }
}
