import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import java.awt.Container;
public class login {

        public static void main(String[] args) {

            // أي قمنا بإنشاء نافذة مع وضع عنوان لها JFrame هنا أنشأنا كائن من الكلاس
            JFrame frame = new JFrame("Login");

            // لترتيب الأشياء التي نضيفها بداخلها GroupLayout هنا جعلنا النافذة تستخدم الـ
            Container container = frame.getContentPane();
            GroupLayout groupLayout = new GroupLayout(container);
            container.setLayout(groupLayout);

            // هنا قمنا بإضافة هوامش بين النافذة و المجموعات و بين جميع الأشياء التي سنضيفها في المجموعات
            groupLayout.setAutoCreateGaps(true);
            groupLayout.setAutoCreateContainerGaps(true);
            groupLayout.preferredLayoutSize(container);

            // هنا قمنا بتعريف جميع الأشياء التي سنضيفها في النافذة
            JLabel label_1 = new JLabel("User");
            JLabel label_2 = new JLabel("Password");
            JTextField textField_1 = new JTextField();
            JTextField textField_2 = new JTextField();
            JButton button_1 = new JButton("Register");
            JButton button_2 = new JButton("Login");

            // هنا قمنا بتعريف مجموعتين أساسيتين لوضع المحتوى على عامودين و مجموعة ثالثة داخل المجموعة الثانية
            groupLayout.setHorizontalGroup(
                    groupLayout.createSequentialGroup()
                            // في مجموعة متوازية أفقياً label_2 و الـ label_1 هنا وضعنا الـ
                            .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(label_1)
                                    .addComponent(label_2)
                            )
                            // في مجموعة متوازية أفقياً textField_2 و الـ textField_1 هنا وضعنا الـ
                            .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(textField_1)
                                    .addComponent(textField_2)

                                    // في مجموعة متتالية و وضعناها مع المجموعة الثانية button_2 و الـ button_1 هنا وضعنا الـ
                                    .addGroup(groupLayout.createSequentialGroup()
                                            .addComponent(button_1)
                                            .addComponent(button_2)
                                    )
                            )
            );

            // هنا قمنا بتعريف ثلاث مجموعات عامودية, لوضع المحتوى على ثلاث أسطر
            groupLayout.setVerticalGroup(
                    groupLayout.createSequentialGroup()
                            // في مجموعة متوازية عامودياً و بالتالي سيظهروا في السطر الأول textField_1 و الـ label_1 هنا وضعنا الـ
                            .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(label_1)
                                    .addComponent(textField_1)
                            )
                            // في مجموعة متوازية عامودياً و بالتالي سيظهروا في السطر الثاني textField_2 و الـ label_2 هنا وضعنا الـ
                            .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(label_2)
                                    .addComponent(textField_2)
                            )
                            // في مجموعة متوازية عامودياً و بالتالي سيظهروا في السطر الثالث button_2 و الـ button_1 هنا وضعنا الـ
                            .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(button_1)
                                    .addComponent(button_2)
                            )
            );

            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // هنا جعلنا زر الخروج من النافذة يغلق البرنامج
            frame.pack();                                           // هنا جعلنا حجم النافذة يناسب حجم المحتوى
            frame.setVisible(true);                                 // هنا جعلنا النافذة مرئية

        }
}
