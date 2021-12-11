package facade.impl;

import java.rmi.RemoteException;
import java.util.List;

import facade.CommentFacade;
import model.Comment;
import model.Movies;

public class CommentImpl extends AbstractImpl implements CommentFacade{
	public CommentImpl() throws RemoteException {
		super();
	}
//	Thu19516531> db.comments.createIndex({name:'text'})
//	name_text
//	Thu19516531> db.comments.find({$text:{$search:'Mercedes Tyler'}})
	@Override
	public List<Comment> layDSCMTheoTen(String tenNBL) throws RemoteException {
		List<?> ds = getList("{$text:{$search:'"+tenNBL+"'}}", Comment.class);
//		for(Object o : ds)
//			System.out.println(o);
		return (List<Comment>) ds;
	}

}
