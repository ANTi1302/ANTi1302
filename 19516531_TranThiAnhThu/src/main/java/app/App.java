package app;

import java.net.MalformedURLException;
import java.nio.channels.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.bson.types.ObjectId;

import facade.CommentFacade;
import facade.MoviesFacade;
import facade.impl.CommentImpl;
import facade.impl.MoviesImpl;
import model.IMD;
import model.Movies;
/*
 * Viết trên client
 */
public class App {
	public static void main(String[] args) throws RemoteException, MalformedURLException, AlreadyBoundException {
		SecurityManager securityManager = System.getSecurityManager();
		if(securityManager == null) {
			System.setProperty("java.security.policy", "rmi/policy.policy");
			System.setSecurityManager(new SecurityManager());
		}
		
//		CourseDao courseDao = new CourseImpl();
//		StudentDao studentDao = new StudentImpl();	
//		LocateRegistry.createRegistry(9999);
//		
//		Naming.bind("rmi://DESKTOP-M5CGSJI:9999/courseDao", courseDao);
//		Naming.bind("rmi://DESKTOP-M5CGSJI:9999/studentDao", studentDao);
		
		System.out.println("Ready...");
		MoviesFacade moviesImpl= new MoviesImpl();
		CommentFacade commentFacade= new CommentImpl();
		
		
		Set<String> dsIdMV = new HashSet<String>();
		dsIdMV.add("abcdkfjsls");
		dsIdMV.add("gfkdgkdflkls");
		IMD imdb= new IMD(5, 2.3, 5);
		Movies movies= new Movies(ObjectId.get(), dsIdMV, dsIdMV, dsIdMV, dsIdMV, 5, "Lại là Thư nèeee", dsIdMV, 2, imdb);
		//Thêm 1	
//		movies.setId("ad");
//		moviesImpl.themMV(movies);
//		if (moviesImpl.themMV(movies)) {
//			System.out.println("okkk");
//		} else {
//			System.out.println("noooooo");
//		}
		
//		//Thêm List<>MV
//		List<Movies> listmovies= new ArrayList<Movies>();
//		listmovies.add(movies);
//		 for (Movies s : listmovies) {
//	            System.out.println("In sệt roy nè: " + s);
//	        }
		
		//Trả list<>Movies
//		moviesImpl.layDSMovies()
//		.forEach(lh -> System.out.println(lh));
		
		//Trả 1 MV khi biết id
//	System.out.println(moviesImpl.layMVTheoMa("573a1390f29313caabcd4803"));	
	
		//Tìm kiếm theo tên
//	moviesImpl.layDSMVTheoTen("Winsor")
//	.forEach(lh -> System.out.println(lh));
		
		//Cập nhật movies khi biết mã
		
//		if (moviesImpl.capNhatMV(movies)) {
//			System.out.println("okkk");
//		} else {
//			System.out.println("noooooo");
//		}
		
		//Tìm kiếm theo tên người bình luận
//		commentFacade.layDSCMTheoTen("Mercedes Tyler")
//		.forEach(lh -> System.out.println(lh));
		
		
//		Câu hỏi / Thống kê số bộ phim đã phát hành theo từng năm.
//		moviesImpl
//		.demMVTheoNam()
//		.entrySet()
//		.iterator()
//		.forEachRemaining(entry -> {
//			System.out.println("Year: " + entry.getKey()) ;
//			System.out.println("Number of movies: " + entry.getValue()) ;
//		});	
		
		
//		Tìm kiếm danh sách các bộ phim dựa trên votes của imdb, tìm theo khoảng (từ .. đến ...)
//		moviesImpl
//		.timTheoKhoangVotes(5,10)
//		.iterator()
//		.forEachRemaining(entry -> {
//			System.out.println(entry) ;
//		});	
		
		
//		Liệt kê n email của người dùng, có bình luận trên các bộ phim. Yêu cầu phải tạo index và trùng thì chỉ in 1 lần 
//		Trường hợp Select thì bạn mới dùng excuteQuery() nhá
//          Trường hợp Update,delete,insert thì bạn dùng excuteUpdate(),hàm này return kiểu int nhé.
		
	}
}
