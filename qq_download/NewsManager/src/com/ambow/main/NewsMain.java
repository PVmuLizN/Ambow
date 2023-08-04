package com.ambow.main;

import java.util.List;

import com.ambow.po.News;
import com.ambow.po.User;
import com.ambow.service.NewsService;
import com.ambow.util.InPutUtil;
import com.ambow.view.NewsView;

/** ����ϵͳ���ࣨ��ڣ� */
public class NewsMain {
	// ����service���󣬵��õ�¼����
	NewsService ns = new NewsService();

	// ��ʼ����
	public void start() {
		System.out.println("��������������Ϣ����ϵͳ");
		System.out.println("�����������û�����");
		String loginname = InPutUtil.getString();
		System.out.println("�������������룺");
		String password = InPutUtil.getString();
		// ����user�����Ҹ�ֵ
		User user = new User();
		user.setLoginname(loginname);
		user.setPassword(password);
		User users = ns.login(user);
		if (users != null) {
			// ��¼�ɹ�����������
			NewsView.mainView();
			// ����ѡ�����ֵ
			int a = InPutUtil.getInt();
			switch (a) {
				case 1:
					System.out.println("��ѯ");
					this.queryAllNews();
					break;
				case 2:
					System.out.println("����");
					addNews();
					break;
				case 3:
					System.out.println("�޸�");
					this.queryAllNews();

					break;
				case 4:
					System.out.println("ɾ��");
					this.queryAllNews();

					break;
				case 0:
					System.out.println("�˳�......");
					// ϵͳ�����˳�
					System.exit(0);
					break;

				default:
					System.out.println("û�д�ѡ����������룺");
					break;
			}

		} else {
			System.out.println("��¼ʧ��");
		}
	}

	// ��ѯ�������ŵķ���
	public void queryAllNews() {
		// ����service��Ĳ�ѯ���еķ���
		List<News> news = ns.queryAllNews();
		System.out
				.println("���" + "\t" + "����" + "\t" + "����" + "\t" + "����" + "\t" + "����ʱ��" + "\t" + "�޸�ʱ��" + "\t" + "����");
		// ��������
		for (News n : news) {
			System.out.println(n.getId() + "\t" + n.getType() + "\t" + n.getTitle() + "\t" + n.getAuthor() + "\t"
					+ n.getCreatedate() + "\t" + n.getMogifydate() + "\t" + n.getContent());
		}
	}

	// ����������Ϣ����
	public void addNews() {
		System.out.println("����ҵ��");
		System.out.println("����������������ͣ�");
		String type = InPutUtil.getString();
		System.out.println("������������ı��⣺");
		String title = InPutUtil.getString();
		System.out.println("����������������ߣ�");
		String author = InPutUtil.getString();
		System.out.println("������������Ĵ���ʱ�䣺");
		String createdate = InPutUtil.getString();
		System.out.println("��������������޸�ʱ�䣺");
		String mogifydate = InPutUtil.getString();
		System.out.println("����������������ݣ�");
		String content = InPutUtil.getString();
		// ����service��������ķ���
		News n = new News();
		n.setType(type);
		n.setTitle(title);
		n.setAuthor(author);
		n.setCreatedate(createdate);
		n.setMogifydate(mogifydate);
		n.setContent(content);
		int a = ns.addNews(n);
		if (a > 0) {
			System.out.println("�����ɹ���");
		}
	}

	public static void main(String[] args) {
		NewsMain nm = new NewsMain();
		nm.start();
	}
}
