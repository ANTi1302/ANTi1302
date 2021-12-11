package facade;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import model.Comment;

public interface CommentFacade extends Remote{

	public List<Comment> layDSCMTheoTen(String tenNBL) throws RemoteException;
}
