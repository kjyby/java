import view.CGangjwaView;
import view.CGwamokView;
import view.CLoginView;
import DAO.ObjectDAO;
import DAO.iDAO;
import control.CGangjwaControl;
import control.CGwamokControl;
import control.CLoginControl;
import entity.CGangjwa;
import entity.CGwamok;
import entity.CMember;



public class CMain {

	public static void main(String[] args) {
		//로그인
		CLoginView loginView = new CLoginView(); 
		CMember member = loginView.login();	
		CLoginControl loginControl = new CLoginControl();
		member = loginControl.login(member);
		iDAO memberDAO = new ObjectDAO(); 
		memberDAO.write(member, "member");
		member = (CMember) (memberDAO).read("gwamok");
		
		//과목개설
		CGwamokView gwamokView = new CGwamokView();
		CGwamok gwamok = gwamokView.getGwamok();
		CGwamokControl gwamokControl = new CGwamokControl();
		gwamok = gwamokControl.processGwamok(gwamok);
		iDAO gwamokDAO = new ObjectDAO();
		gwamokDAO.write(gwamok,"gwamok");
		gwamok = (CGwamok) (gwamokDAO).read("gwamok");
		
		//강좌개설
		CGangjwaView gangjwaView = new CGangjwaView();
		CGangjwa gangjwa = gangjwaView.getGangjwa();
		CGangjwaControl gangjwaControl = new CGangjwaControl();
		gangjwa = gangjwaControl.processGwamok(gangjwa);
		iDAO gangjwaDAO = new ObjectDAO();
		gangjwaDAO.write(gangjwa,"gangjwa");
		gangjwa = (CGangjwa) (gangjwaDAO).read("gangjwa");
		
	}

}
