import utils.KeyboardUtil;
import view.StartView;

public class App {
    public static void main(String[] args) throws Exception {
        if (users != null) {
            // 登录成功调用主界面
            StartView.mainView();
            // 接收选择的数值
            int a = KeyboardUtil.readInt();
            switch (a) {
                case 1:
                    System.out.println("查询");
                    this.queryAllNews();
                    break;
                case 2:
                    System.out.println("新增");
                    this.addNews();
                    break;
                case 3:
                    System.out.println("修改");
                    this.queryAllNews();

                    break;
                case 4:
                    System.out.println("删除");
                    this.queryAllNews();

                    break;
                case 0:
                    System.out.println("退出......");
                    // 系统正常退出
                    System.exit(0);
                    break;

                default:
                    System.out.println("没有此选项，请重新输入：");
                    break;
            }

        } else {
            System.out.println("登录失败");
        }
    }
}
