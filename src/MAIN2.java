import javax.swing.*;

public class MAIN2 {
    //ila kano bzaf diyal les fenaitre mn l2ahsan ,khdm bhad la method p kola fenaitre ndir liha classe
    public static class Main extends JFrame{
        public Main(){
            this.setSize(800,900);
            this.setVisible(true);
            /*إفتراضياً, زر الخروج الذي تجده في أعلى النافذة لا يقوم بإغلاق البرنامج عند النقر عليه, بل يقوم فقط بإخفاء النافذة المفتوحة.
في حال أردت أن يتم إغلاق البرنامج كلياً عند النقر على زر الخروج, عليك إستدعاء الدالة setDefaultCloseOperation() كما فعلنا في الأمثلة السابقة.

سبب جعل البرنامج لا يغلق بشكل تلقائي عند النقر على زر الخروج هو أنك في البرنامج الواحد أحياناً قد تقوم
 بإظهار أكثر من نافذة في نفس الوقت و لكنك لا تريد عند النقر على زر الخروج الموجود في أي نافذة أن يغلق جميع النوافذ المفتوحة.

*/
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        }
    }
    public static void main(String[] args) {
    new Main();

    }
}
