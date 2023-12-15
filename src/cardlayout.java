import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class cardlayout {


        public static void main(String[] args) {

            JFrame frame = new JFrame("CardLayout demo");           // أي قمنا بإنشاء نافذة مع وضع عنوان لها JFrame هنا أنشأنا كائن من الكلاس
            frame.setSize(400, 200);                                // هنا قمنا بتحديد حجم النافذة. عرضها 400 و طولها 200
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // هنا جعلنا زر الخروج من النافذة يغلق البرنامج
            frame.setLayout(new GridBagLayout());                   // لترتيب الأشياء التي نضيفها بداخلها GridBagLayout هنا جعلنا النافذة تستخدم الـ

            // اليمنى Panel اليسرى و الـ Panel هنا قمنا بتعريف الـ
            JPanel panel_L = new JPanel();
            JPanel panel_R = new JPanel();

            // في النافذة panel_R و الـ panel_L لتحديد مكان و حجم الـ GridBagConstraints هنا قمنا بتعريف كائن من الكلاس
            GridBagConstraints gbc = new GridBagConstraints();

            // يتأثر بكامل المساحة المتوفرة من النافذة بالإتجاهين الأفقي و العامودي gbc هنا جعلنا الـ
            gbc.fill = GridBagConstraints.BOTH;

            // هنا جعلنا نسبة الجذب الأفقية و العامودية متساوي حتى يكون المحتوى دائماً مطابق لحجم الشاشة
            gbc.weightx = 1;
            gbc.weighty = 1;

            // في يسار النافذة panel_L هنا أضفنا الـ
            frame.add(panel_L, gbc);

            // في يمين النافذة مع إعطائها حجم جذب أكبر بعشر مرات panel_R هنا أضفنا الـ
            gbc.weightx = 10;
            frame.add(panel_R, gbc);

            // إلى 4 أقسام بالطول panel_L هنا قمنا بتقسيم الـ
            panel_L.setLayout(new GridLayout(4, 1));

            // هنا قمنا بتعريف 4 أزرار
            JButton next = new JButton("Next");
            JButton previous = new JButton("Previous");
            JButton first = new JButton("First");
            JButton last = new JButton("Last");

            // panel_L هنا قمنا بإضافة الأزرار في الـ
            panel_L.add(next);
            panel_L.add(previous);
            panel_L.add(first);
            panel_L.add(last);

            // // لترتيب الأشياء التي نضيفها بداخلها فوق بعضها البعض CardLayout تستخدم الـ panel_R هنا جعلنا الـ
            CardLayout card = new CardLayout();
            Container container = panel_R;
            container.setLayout(card);

            // Panels هنا قمنا بتعريف 4
            JPanel p1 = new JPanel();
            JPanel p2 = new JPanel();
            JPanel p3 = new JPanel();
            JPanel p4 = new JPanel();

            // منهم Panel هنا قمنا بإعطاء لون خلفية مختلف لكل
            p1.setBackground(Color.white);
            p2.setBackground(Color.yellow);
            p3.setBackground(Color.cyan);
            p4.setBackground(Color.green);

            // منهم Panel هنا قمنا بإضافة عنوان في كل
            p1.add(new JLabel("Panel 1"));
            p2.add(new JLabel("Panel 2"));
            p3.add(new JLabel("Panel 3"));
            p4.add(new JLabel("Panel 4"));

            // panel_R الأربعة في الـ Panels هنا قمنا بإضافة الـ
            panel_R.add(p1);
            panel_R.add(p2);
            panel_R.add(p3);
            panel_R.add(p4);

            // التالية Panel سيتم عرض الـ next هنا قلنا أنه عند النقر على الزر
            next.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    card.next(container);
                }
            });

            // السابقة Panel سيتم عرض الـ previous هنا قلنا أنه عند النقر على الزر
            previous.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    card.previous(container);
                }
            });

            // panel_R قمنا بإضافتها في الـ Panel سيتم عرض أول first هنا قلنا أنه عند النقر على الزر
            first.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    card.first(container);
                }
            });

            // panel_R قمنا بإضافتها في الـ Panel سيتم عرض آخر last هنا قلنا أنه عند النقر على الزر
            last.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    card.last(container);
                }
            });

            // هنا جعلنا النافذة مرئية
            frame.setVisible(true);

        }
}
